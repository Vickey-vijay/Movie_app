package com.yk.e.util;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yk.e.object.LifeListener;
import com.yk.e.pl.BaseAdPlayer;
import com.yk.e.pl.OktVideoView;
import com.yk.e.pl.PreloadManager;
import com.yk.e.pl.PreloadTask;
import xyz.doikki.videocontroller.StandardVideoController;
import xyz.doikki.videoplayer.player.BaseVideoView;

/* JADX INFO: loaded from: classes6.dex */
public class AdPlayer extends BaseAdPlayer {
    private AdVideoController controller;
    private OktVideoView videoView;
    private boolean isPlayingCallback = false;
    private boolean isPreLoadSuccess = false;
    private boolean isStatReadyCallback = false;
    private boolean isPlayFailedCallback = false;
    private boolean isPrepareCallback = false;
    private boolean isPause = false;
    private boolean isPlayed = false;
    public long MAX_PRELOAD_TIME = 15000;
    private boolean isVoice = true;

    public static class AdVideoController extends StandardVideoController {
        private View.OnClickListener clickListener;

        @Override // xyz.doikki.videoplayer.controller.GestureVideoController, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            View.OnClickListener onClickListener = this.clickListener;
            if (onClickListener == null) {
                return true;
            }
            onClickListener.onClick(null);
            return true;
        }

        public void setViewOnClickListener(View.OnClickListener onClickListener) {
            this.clickListener = onClickListener;
        }

        public AdVideoController(@NonNull Context context) {
            super(context);
        }
    }

    private void resetStat() {
        this.isPreLoadSuccess = false;
        this.isPlayingCallback = false;
        this.isStatReadyCallback = false;
        this.isPause = false;
        this.isPlayFailedCallback = false;
        this.isPrepareCallback = false;
        this.isPlayed = false;
    }

    @Override // com.yk.e.inf.IAdPlayer
    public void play(Context context, String str) {
        play(context, str, false);
    }

    public void resetIsPlayingCallback() {
        this.isPlayingCallback = false;
    }

    public void addFragmentLife(Activity activity) {
        Constant.addFragmentListener(activity, new LifeListener() { // from class: com.yk.e.util.AdPlayer.2
            @Override // com.yk.e.object.LifeListener
            public void onCreate(Bundle bundle) {
            }

            @Override // com.yk.e.object.LifeListener
            public void onStart() {
            }

            @Override // com.yk.e.object.LifeListener
            public void onDestroy() {
                AdPlayer.this.release();
            }

            @Override // com.yk.e.object.LifeListener
            public void onPause() {
                if (AdPlayer.this.isPlayed) {
                    AdPlayer.this.pause();
                    AdPlayer.this.isPause = true;
                }
            }

            @Override // com.yk.e.object.LifeListener
            public void onResume() {
                if (AdPlayer.this.isPlayed && AdPlayer.this.isPause) {
                    AdPlayer.this.isPause = false;
                    AdPlayer.this.isPlayFailedCallback = false;
                    AdPlayer.this.restore();
                }
            }

            @Override // com.yk.e.object.LifeListener
            public void onStop() {
                if (AdPlayer.this.isPlayed) {
                    AdPlayer.this.isPause = true;
                }
            }
        });
    }

    @Override // com.yk.e.inf.IAdPlayer
    public int getDuration() {
        OktVideoView oktVideoView = this.videoView;
        if (oktVideoView != null) {
            return (int) (oktVideoView.getDuration() / 1000);
        }
        return 0;
    }

    @Override // com.yk.e.inf.IAdPlayer
    public int getRestTime() {
        try {
            OktVideoView oktVideoView = this.videoView;
            if (oktVideoView == null) {
                return 0;
            }
            return ((int) (oktVideoView.getDuration() / 1000)) - ((int) (this.videoView.getCurrentPosition() / 1000));
        } catch (Exception e10) {
            printErrMsg("getRestTime", e10);
            return 0;
        }
    }

    @Override // com.yk.e.inf.IAdPlayer
    public void hasVoice() {
        printMsg("hasVoice");
        OktVideoView oktVideoView = this.videoView;
        if (oktVideoView != null) {
            this.isVoice = true;
            oktVideoView.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.yk.e.inf.IAdPlayer
    public void init(Context context, View view, String str) {
        printMsg(C3426d4.a.f28413f);
        AdVideoController adVideoController = new AdVideoController(context);
        this.controller = adVideoController;
        adVideoController.setDoubleTapTogglePlayEnabled(false);
        this.controller.setGestureEnabled(false);
        this.controller.setCanChangePosition(false);
        resetStat();
        OktVideoView oktVideoView = (OktVideoView) view;
        this.videoView = oktVideoView;
        oktVideoView.setVideoController(this.controller);
        this.videoView.addOnStateChangeListener(new BaseVideoView.a() { // from class: com.yk.e.util.AdPlayer.1
            @Override // xyz.doikki.videoplayer.player.BaseVideoView.a
            public void onPlayStateChanged(int i10) {
                if (i10 == -1) {
                    if (AdPlayer.this.isPlayFailedCallback) {
                        return;
                    }
                    AdPlayer.this.isPlayFailedCallback = true;
                    AdPlayer.this.onPlayFailed("视频播放出错");
                    return;
                }
                if (i10 == 5) {
                    AdPlayer.this.onPlayComplete();
                    return;
                }
                if (i10 == 2) {
                    if (AdPlayer.this.isPrepareCallback) {
                        return;
                    }
                    AdPlayer.this.isPrepareCallback = true;
                    AdPlayer.this.onPrepared();
                    return;
                }
                if (i10 == 3 && !AdPlayer.this.isPlayingCallback) {
                    AdPlayer.this.isPlayingCallback = true;
                    AdPlayer.this.isPlayed = true;
                    AdPlayer.this.onStartPlay();
                }
            }

            @Override // xyz.doikki.videoplayer.player.BaseVideoView.a
            public void onPlayerStateChanged(int i10) {
            }
        });
    }

    public boolean isVoice() {
        return this.isVoice;
    }

    @Override // com.yk.e.inf.IAdPlayer
    public void noVoice() {
        printMsg("noVoice");
        OktVideoView oktVideoView = this.videoView;
        if (oktVideoView != null) {
            this.isVoice = false;
            oktVideoView.setVolume(0.0f, 0.0f);
        }
    }

    @Override // com.yk.e.inf.IAdPlayer
    public void pause() {
        printMsg(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        OktVideoView oktVideoView = this.videoView;
        if (oktVideoView != null) {
            oktVideoView.pause();
        }
    }

    @Override // com.yk.e.inf.IAdPlayer
    public void play(Context context, String str, boolean z10) {
        try {
            printMsg("play url = " + CoreUtils.getFilenameFromURL(str) + ", isCycle = " + z10);
            OktVideoView oktVideoView = this.videoView;
            if (oktVideoView != null) {
                oktVideoView.setLooping(z10);
                String playUrl = PreloadManager.getInstance(context).getPlayUrl(str);
                printMsg("realUrl = " + playUrl);
                this.videoView.setUrl(playUrl);
                this.videoView.start();
            }
        } catch (Exception e10) {
            printErrMsg("play", e10);
            onPlayError(e10.getMessage());
        }
    }

    public void play4PreLoad() {
        printMsg("play4PreLoad");
        OktVideoView oktVideoView = this.videoView;
        if (oktVideoView != null) {
            oktVideoView.play4PreLoad();
        }
    }

    @Override // com.yk.e.inf.IAdPlayer
    public void preLoad(final Activity activity, String str) {
        printMsg("preload, url = " + CoreUtils.getFilenameFromURL(str));
        resetStat();
        try {
            PreloadManager.getInstance(activity.getApplicationContext()).addPreloadTask(str, (int) (System.currentTimeMillis() / 1000), new PreloadTask.IPreloadCallback() { // from class: com.yk.e.util.AdPlayer.3
                @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
                public void onCancel(int i10) {
                }

                @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
                public void onFailed(int i10, final String str2) {
                    activity.runOnUiThread(new Runnable() { // from class: com.yk.e.util.AdPlayer.3.2
                        @Override // java.lang.Runnable
                        public void run() {
                            AdPlayer.this.onPreLoadFailed(str2);
                        }
                    });
                }

                @Override // com.yk.e.pl.PreloadTask.IPreloadCallback
                public void onSuccess(int i10) {
                    AdPlayer.this.isPreLoadSuccess = true;
                    activity.runOnUiThread(new Runnable() { // from class: com.yk.e.util.AdPlayer.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (AdPlayer.this.isStatReadyCallback) {
                                return;
                            }
                            AdPlayer.this.isStatReadyCallback = true;
                            AdPlayer.this.isPreLoadSuccess = true;
                            AdPlayer.this.onReady();
                        }
                    });
                }
            });
            new Handler().postDelayed(new Runnable() { // from class: com.yk.e.util.AdPlayer.4
                @Override // java.lang.Runnable
                public void run() {
                    if (AdPlayer.this.isPreLoadSuccess) {
                        return;
                    }
                    AdPlayer.this.isStatReadyCallback = true;
                    AdPlayer.this.onPreLoadFailed("preLoad timeout");
                }
            }, this.MAX_PRELOAD_TIME);
        } catch (Exception e10) {
            printErrMsg("preLoad", e10);
            onPreLoadFailed("preLoad failed, " + e10.getMessage());
        }
    }

    @Override // com.yk.e.inf.IAdPlayer
    public void release() {
        printMsg("release");
        try {
            OktVideoView oktVideoView = this.videoView;
            if (oktVideoView != null) {
                oktVideoView.release();
                this.videoView = null;
            }
        } catch (Exception e10) {
            printErrMsg("release", e10);
        }
    }

    @Override // com.yk.e.inf.IAdPlayer
    public void restore() {
        printMsg("restore");
        OktVideoView oktVideoView = this.videoView;
        if (oktVideoView != null) {
            oktVideoView.resume();
        }
    }

    public void seekTo(long j10) {
        OktVideoView oktVideoView = this.videoView;
        if (oktVideoView != null) {
            oktVideoView.seekTo(j10);
        }
    }

    public void setViewOnClickListener(View.OnClickListener onClickListener) {
        AdVideoController adVideoController = this.controller;
        if (adVideoController != null) {
            adVideoController.setViewOnClickListener(onClickListener);
        }
    }

    @Override // com.yk.e.inf.IAdPlayer
    public void stop() {
        printMsg("stop");
        OktVideoView oktVideoView = this.videoView;
        if (oktVideoView != null) {
            oktVideoView.pause();
        }
    }
}
