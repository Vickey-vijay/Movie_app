package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;

/* JADX INFO: compiled from: ComponentVideoPlayer.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Player.EventListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f33829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f33831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SimpleExoPlayer f33832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaSource f33833i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.dynamic.baseview.video.a f33835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SurfaceHolder f33836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f33837m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33825a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33826b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33827c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33828d = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f33834j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f33838n = new a();

    /* JADX INFO: compiled from: ComponentVideoPlayer.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long duration;
            try {
                if (b.this.f33832h == null || !b.this.b()) {
                    return;
                }
                b bVar = b.this;
                bVar.f33829e = bVar.f33832h.getCurrentPosition();
                float f10 = b.this.f33829e / 1000.0f;
                float f11 = b.this.f33829e % 1000;
                int iRound = Math.round(f10);
                q0.c("ComponentVideoPlayer", "currentPosition:" + iRound + " mCurrentPosition:" + b.this.f33829e);
                if (b.this.f33832h == null || b.this.f33832h.getDuration() <= 0) {
                    duration = 0;
                } else {
                    duration = b.this.f33832h.getDuration() / 1000;
                    if (f11 > 0.0f && f11 < 500.0f) {
                        iRound++;
                    }
                }
                if (iRound >= 0 && duration > 0) {
                    long j10 = iRound;
                    if (j10 < 1 + duration && b.this.f33835k != null) {
                        b.this.f33835k.a(j10, duration);
                    }
                }
                b.this.f33825a = false;
                b.this.f33834j.postDelayed(this, 1000L);
            } catch (Exception e10) {
                q0.b("ComponentVideoPlayer", e10.getMessage());
            }
        }
    }

    public void k() {
        try {
            this.f33825a = true;
            this.f33829e = 0L;
            if (this.f33835k != null) {
                this.f33835k.onPlayCompleted();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void l() {
        try {
            this.f33826b = true;
            if (this.f33832h != null && !this.f33827c) {
                this.f33827c = true;
                if (this.f33835k != null) {
                    this.f33835k.a(this.f33832h.getDuration() / 1000);
                }
            }
            r();
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, @Nullable Object obj, int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public void b(int i10) {
        this.f33828d = i10;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            b("play url is illegal");
            return;
        }
        try {
            this.f33832h = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(this.f33831g), new DefaultTrackSelector(), new DefaultLoadControl());
            this.f33833i = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f33831g, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str));
            this.f33832h.setRepeatMode(0);
            this.f33832h.prepare(this.f33833i);
            this.f33832h.addListener(this);
            SurfaceHolder surfaceHolder = this.f33836l;
            if (surfaceHolder != null) {
                a(surfaceHolder);
            }
            c cVar = new c(this.f33831g, this.f33832h);
            this.f33837m = cVar;
            cVar.a(str, this.f33835k, this.f33828d);
        } catch (Throwable unused) {
            b("Player init error");
        }
    }

    public int d() {
        SimpleExoPlayer simpleExoPlayer = this.f33832h;
        if (simpleExoPlayer != null) {
            return (int) (simpleExoPlayer.getDuration() / 1000);
        }
        return 0;
    }

    public float e() {
        SimpleExoPlayer simpleExoPlayer = this.f33832h;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getVolume();
        }
        return 0.0f;
    }

    public boolean f() {
        return this.f33826b;
    }

    public boolean g() {
        return this.f33825a;
    }

    public boolean h() {
        return this.f33832h != null && b();
    }

    public boolean i() {
        return this.f33830f;
    }

    public void j() {
        SimpleExoPlayer simpleExoPlayer = this.f33832h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(0.0f);
        this.f33830f = true;
    }

    public void m() {
        try {
            if (this.f33826b && this.f33832h != null && b()) {
                this.f33832h.setPlayWhenReady(false);
                a();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void n() {
        try {
            if (this.f33826b) {
                r();
            } else {
                this.f33832h.prepare(this.f33833i);
            }
            this.f33832h.setPlayWhenReady(true);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            p();
            b("play error");
        }
    }

    public void o() {
        SimpleExoPlayer simpleExoPlayer;
        try {
            if (this.f33826b || (simpleExoPlayer = this.f33832h) == null) {
                return;
            }
            simpleExoPlayer.prepare(this.f33833i);
            this.f33826b = true;
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        q0.b("ComponentVideoPlayer", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        String message;
        c cVar = this.f33837m;
        if ((cVar == null || !cVar.a(exoPlaybackException)) && exoPlaybackException != null) {
            int i10 = exoPlaybackException.type;
            if (i10 == 0) {
                message = "Play error, because have a SourceException.";
            } else if (i10 != 1) {
                message = i10 != 2 ? "Play error and ExoPlayer have not message." : "Play error, because have a UnexpectedException.";
            } else {
                message = "Play error, because have a RendererException.";
            }
            if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
                message = exoPlaybackException.getCause().getMessage();
            }
            q0.b("ComponentVideoPlayer", "onPlayerError : " + message);
            a(message);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z10, int i10) {
        q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : " + i10);
        if (i10 == 1) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i10 == 2) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Buffering");
            return;
        }
        if (i10 == 3) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : READY");
            l();
        } else {
            if (i10 != 4) {
                return;
            }
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Ended : PLAY ENDED");
            a();
            k();
        }
    }

    public void q() {
        SimpleExoPlayer simpleExoPlayer = this.f33832h;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.seekTo(simpleExoPlayer.getCurrentPosition() - 500);
        }
    }

    public void s() {
        try {
            if (this.f33826b && this.f33832h != null && b()) {
                this.f33832h.stop();
                a();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void t() {
        SimpleExoPlayer simpleExoPlayer = this.f33832h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(1.0f);
        this.f33830f = false;
    }

    private void b(String str) {
        if (this.f33835k != null) {
            this.f33835k.onPlayError(str);
        }
    }

    private void r() {
        try {
            a();
            this.f33834j.post(this.f33838n);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void p() {
        try {
            a();
            if (this.f33832h != null) {
                s();
                this.f33832h.removeListener(this);
                this.f33832h.release();
                this.f33835k = null;
            }
            c cVar = this.f33837m;
            if (cVar != null) {
                cVar.c();
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void a(Context context, SurfaceHolder surfaceHolder) {
        try {
            this.f33831g = context;
            this.f33836l = surfaceHolder;
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public boolean b() {
        return this.f33832h.getPlaybackState() == 3 && this.f33832h.getPlayWhenReady();
    }

    public void a(SurfaceHolder surfaceHolder) {
        Player.VideoComponent videoComponent;
        try {
            SimpleExoPlayer simpleExoPlayer = this.f33832h;
            if (simpleExoPlayer == null || (videoComponent = simpleExoPlayer.getVideoComponent()) == null) {
                return;
            }
            videoComponent.setVideoSurfaceHolder(surfaceHolder);
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
            b(th2.toString());
        }
    }

    public void a(long j10) {
        try {
            if (!this.f33826b) {
                this.f33832h.prepare(this.f33833i);
            } else {
                r();
            }
            this.f33832h.seekTo(j10);
            this.f33832h.setPlayWhenReady(true);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            p();
            b("play error");
        }
    }

    public long c() {
        return this.f33829e;
    }

    public void a(int i10) {
        long j10 = i10;
        try {
            this.f33829e = j10;
            if (!this.f33826b) {
                q0.a("ComponentVideoPlayer", "seekTo return mHasPrepare false");
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.f33832h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.seekTo(j10);
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    private void a() {
        try {
            this.f33834j.removeCallbacks(this.f33838n);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        this.f33835k = aVar;
    }

    public boolean a(String str) {
        try {
            this.f33826b = false;
            b(str);
            return true;
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            return true;
        }
    }

    public void a(float f10, float f11) {
        try {
            SimpleExoPlayer simpleExoPlayer = this.f33832h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setVolume(f11);
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void a(float f10) {
        try {
            if (b()) {
                this.f33832h.setPlaybackParameters(new PlaybackParameters(f10));
            } else {
                this.f33832h.setPlaybackParameters(new PlaybackParameters(f10));
                this.f33832h.stop();
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }
}
