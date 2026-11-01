package com.yk.e.pl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class OktAndroidMediaPlayer extends xyz.doikki.videoplayer.player.a implements MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public Context mAppContext;
    private int mBufferedPercent;
    private boolean mIsPreparing;
    public MediaPlayer mMediaPlayer;

    private boolean isVideo() {
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.mMediaPlayer.getTrackInfo()) {
                if (trackInfo.getTrackType() == 1) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getTcpSpeed() {
        return 0L;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        if (i10 != 3) {
            this.mPlayerEventListener.onInfo(i10, i11);
            return true;
        }
        if (!this.mIsPreparing) {
            return true;
        }
        this.mPlayerEventListener.onInfo(i10, i11);
        this.mIsPreparing = false;
        return true;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void prepareAsync() {
        try {
            this.mIsPreparing = true;
            this.mMediaPlayer.prepareAsync();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDataSource(String str, Map<String, String> map) {
        try {
            this.mMediaPlayer.setDataSource(this.mAppContext, Uri.parse(str), map);
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setOptions() {
    }

    @Override // xyz.doikki.videoplayer.player.a
    public int getBufferedPercentage() {
        return this.mBufferedPercent;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getCurrentPosition() {
        return this.mMediaPlayer.getCurrentPosition();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getDuration() {
        return this.mMediaPlayer.getDuration();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public float getSpeed() {
        try {
            float speed = this.mMediaPlayer.getPlaybackParams().getSpeed();
            if (speed == 0.0f) {
                return 1.0f;
            }
            return speed;
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void initPlayer() {
        this.mMediaPlayer = new MediaPlayer();
        setOptions();
        this.mMediaPlayer.setAudioStreamType(3);
        this.mMediaPlayer.setOnErrorListener(this);
        this.mMediaPlayer.setOnCompletionListener(this);
        this.mMediaPlayer.setOnInfoListener(this);
        this.mMediaPlayer.setOnBufferingUpdateListener(this);
        this.mMediaPlayer.setOnPreparedListener(this);
        this.mMediaPlayer.setOnVideoSizeChangedListener(this);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public boolean isPlaying() {
        return this.mMediaPlayer.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.mBufferedPercent = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.mPlayerEventListener.onCompletion();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        this.mPlayerEventListener.onError();
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mPlayerEventListener.onPrepared();
        if (isVideo()) {
            return;
        }
        this.mPlayerEventListener.onInfo(3, 0);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void pause() {
        try {
            this.mMediaPlayer.pause();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void release() {
        this.mMediaPlayer.setOnErrorListener(null);
        this.mMediaPlayer.setOnCompletionListener(null);
        this.mMediaPlayer.setOnInfoListener(null);
        this.mMediaPlayer.setOnBufferingUpdateListener(null);
        this.mMediaPlayer.setOnPreparedListener(null);
        this.mMediaPlayer.setOnVideoSizeChangedListener(null);
        stop();
        final MediaPlayer mediaPlayer = this.mMediaPlayer;
        this.mMediaPlayer = null;
        new Thread() { // from class: com.yk.e.pl.OktAndroidMediaPlayer.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    mediaPlayer.release();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }.start();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void seekTo(long j10) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mMediaPlayer.seekTo(j10, 3);
            } else {
                this.mMediaPlayer.seekTo((int) j10);
            }
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            this.mMediaPlayer.setDisplay(surfaceHolder);
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setLooping(boolean z10) {
        this.mMediaPlayer.setLooping(z10);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setSpeed(float f10) {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f10));
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setSurface(Surface surface) {
        try {
            this.mMediaPlayer.setSurface(surface);
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setVolume(float f10, float f11) {
        this.mMediaPlayer.setVolume(f10, f11);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void start() {
        try {
            this.mMediaPlayer.start();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void stop() {
        try {
            this.mMediaPlayer.stop();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    public OktAndroidMediaPlayer(Context context) {
        this.mAppContext = context.getApplicationContext();
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        int videoWidth = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        if (videoWidth != 0 && videoHeight != 0) {
            this.mPlayerEventListener.onVideoSizeChanged(videoWidth, videoHeight);
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void reset() {
        stop();
        this.mMediaPlayer.reset();
        this.mMediaPlayer.setSurface(null);
        this.mMediaPlayer.setDisplay(null);
        this.mMediaPlayer.setVolume(1.0f, 1.0f);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        try {
            this.mMediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }
}
