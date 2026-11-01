package y9;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.Map;
import k3.l0;
import k3.n0;
import k3.u0;
import k4.r;

/* JADX INFO: compiled from: ExoMediaPlayer.java */
/* JADX INFO: loaded from: classes8.dex */
public class a extends xyz.doikki.videoplayer.player.a implements n0.b, h5.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f75315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f75316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f75317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f75318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f75319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c5.d f75321h;

    @Override // xyz.doikki.videoplayer.player.a
    public long getTcpSpeed() {
        return 0L;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDataSource(String str, Map<String, String> map) {
        this.f75317d = this.f75318e.e(str, map);
    }

    @Override // k3.n0.b
    public void b(ExoPlaybackException exoPlaybackException) {
        xyz.doikki.videoplayer.player.a.InterfaceC0798a interfaceC0798a = this.mPlayerEventListener;
        if (interfaceC0798a != null) {
            interfaceC0798a.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public int getBufferedPercentage() {
        u0 u0Var = this.f75316c;
        if (u0Var == null) {
            return 0;
        }
        return u0Var.g();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getCurrentPosition() {
        u0 u0Var = this.f75316c;
        if (u0Var == null) {
            return 0L;
        }
        return u0Var.getCurrentPosition();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public long getDuration() {
        u0 u0Var = this.f75316c;
        if (u0Var == null) {
            return 0L;
        }
        return u0Var.getDuration();
    }

    @Override // xyz.doikki.videoplayer.player.a
    public float getSpeed() {
        l0 l0Var = this.f75319f;
        if (l0Var != null) {
            return l0Var.f62209a;
        }
        return 1.0f;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void initPlayer() {
        k3.j jVar = new k3.j(this.f75315b);
        jVar.j(0);
        jVar.i(0L);
        this.f75316c = new u0.b(this.f75315b, jVar).b(new DefaultTrackSelector(this.f75315b)).a();
        setOptions();
        if (zo.f.a().f86525d && (this.f75321h instanceof com.google.android.exoplayer2.trackselection.b)) {
            this.f75316c.J(new g5.i((com.google.android.exoplayer2.trackselection.b) this.f75321h, "ExoPlayer"));
        }
        this.f75316c.d(this);
        this.f75316c.b(this);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public boolean isPlaying() {
        u0 u0Var = this.f75316c;
        if (u0Var == null) {
            return false;
        }
        int playbackState = u0Var.getPlaybackState();
        if (playbackState == 2 || playbackState == 3) {
            return this.f75316c.getPlayWhenReady();
        }
        return false;
    }

    @Override // k3.n0.b
    public void onPlayerStateChanged(boolean z10, int i10) {
        xyz.doikki.videoplayer.player.a.InterfaceC0798a interfaceC0798a = this.mPlayerEventListener;
        if (interfaceC0798a == null) {
            return;
        }
        if (this.f75320g) {
            if (i10 == 3) {
                interfaceC0798a.onPrepared();
                this.mPlayerEventListener.onInfo(3, 0);
                this.f75320g = false;
                return;
            }
            return;
        }
        if (i10 == 2) {
            interfaceC0798a.onInfo(701, getBufferedPercentage());
        } else if (i10 == 3) {
            interfaceC0798a.onInfo(702, getBufferedPercentage());
        } else {
            if (i10 != 4) {
                return;
            }
            interfaceC0798a.onCompletion();
        }
    }

    @Override // h5.i
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        xyz.doikki.videoplayer.player.a.InterfaceC0798a interfaceC0798a = this.mPlayerEventListener;
        if (interfaceC0798a != null) {
            interfaceC0798a.onVideoSizeChanged(i10, i11);
            if (i12 > 0) {
                this.mPlayerEventListener.onInfo(10001, i12);
            }
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void pause() {
        u0 u0Var = this.f75316c;
        if (u0Var == null) {
            return;
        }
        u0Var.setPlayWhenReady(false);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void prepareAsync() {
        u0 u0Var = this.f75316c;
        if (u0Var == null || this.f75317d == null) {
            return;
        }
        l0 l0Var = this.f75319f;
        if (l0Var != null) {
            u0Var.X(l0Var);
        }
        this.f75320g = true;
        this.f75316c.S(this.f75317d);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void release() {
        u0 u0Var = this.f75316c;
        if (u0Var != null) {
            u0Var.f(this);
            this.f75316c.U();
            this.f75316c = null;
        }
        this.f75320g = false;
        this.f75319f = null;
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void reset() {
        u0 u0Var = this.f75316c;
        if (u0Var != null) {
            u0Var.m();
            this.f75316c.Z(null);
            this.f75320g = false;
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void seekTo(long j10) {
        u0 u0Var = this.f75316c;
        if (u0Var == null) {
            return;
        }
        u0Var.k(j10);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            setSurface(null);
        } else {
            setSurface(surfaceHolder.getSurface());
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setLooping(boolean z10) {
        u0 u0Var = this.f75316c;
        if (u0Var != null) {
            u0Var.setRepeatMode(z10 ? 2 : 0);
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setOptions() {
        this.f75316c.setPlayWhenReady(true);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setSpeed(float f10) {
        l0 l0Var = new l0(f10);
        this.f75319f = l0Var;
        u0 u0Var = this.f75316c;
        if (u0Var != null) {
            u0Var.X(l0Var);
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setSurface(Surface surface) {
        u0 u0Var = this.f75316c;
        if (u0Var != null) {
            u0Var.Z(surface);
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void setVolume(float f10, float f11) {
        u0 u0Var = this.f75316c;
        if (u0Var != null) {
            u0Var.c0((f10 + f11) / 2.0f);
        }
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void start() {
        u0 u0Var = this.f75316c;
        if (u0Var == null) {
            return;
        }
        u0Var.setPlayWhenReady(true);
    }

    @Override // xyz.doikki.videoplayer.player.a
    public void stop() {
        u0 u0Var = this.f75316c;
        if (u0Var == null) {
            return;
        }
        u0Var.m();
    }

    public a(Context context) {
        this.f75315b = context.getApplicationContext();
        this.f75318e = c.d(context);
    }
}
