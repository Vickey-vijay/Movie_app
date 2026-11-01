package k3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;

/* JADX INFO: compiled from: DefaultMediaClock.java */
/* JADX INFO: loaded from: classes8.dex */
public final class i implements g5.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5.c0 f62157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f62158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public p0 f62159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public g5.o f62160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f62161f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f62162g;

    /* JADX INFO: compiled from: DefaultMediaClock.java */
    public interface a {
        void a(l0 l0Var);
    }

    public void f() {
        this.f62162g = true;
        this.f62157b.c();
    }

    public void g() {
        this.f62162g = false;
        this.f62157b.d();
    }

    public void a(p0 p0Var) {
        if (p0Var == this.f62159d) {
            this.f62160e = null;
            this.f62159d = null;
            this.f62161f = true;
        }
    }

    @Override // g5.o
    public void b(l0 l0Var) {
        g5.o oVar = this.f62160e;
        if (oVar != null) {
            oVar.b(l0Var);
            l0Var = this.f62160e.getPlaybackParameters();
        }
        this.f62157b.b(l0Var);
    }

    public void d(long j10) {
        this.f62157b.a(j10);
    }

    public final boolean e(boolean z10) {
        p0 p0Var = this.f62159d;
        return p0Var == null || p0Var.isEnded() || (!this.f62159d.isReady() && (z10 || this.f62159d.hasReadStreamToEnd()));
    }

    @Override // g5.o
    public l0 getPlaybackParameters() {
        g5.o oVar = this.f62160e;
        return oVar != null ? oVar.getPlaybackParameters() : this.f62157b.getPlaybackParameters();
    }

    @Override // g5.o
    public long getPositionUs() {
        return this.f62161f ? this.f62157b.getPositionUs() : this.f62160e.getPositionUs();
    }

    public i(a aVar, g5.c cVar) {
        this.f62158c = aVar;
        this.f62157b = new g5.c0(cVar);
    }

    public void c(p0 p0Var) throws ExoPlaybackException {
        g5.o oVar;
        g5.o mediaClock = p0Var.getMediaClock();
        if (mediaClock != null && mediaClock != (oVar = this.f62160e)) {
            if (oVar == null) {
                this.f62160e = mediaClock;
                this.f62159d = p0Var;
                mediaClock.b(this.f62157b.getPlaybackParameters());
                return;
            }
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public long h(boolean z10) {
        i(z10);
        return getPositionUs();
    }

    public final void i(boolean z10) {
        if (e(z10)) {
            this.f62161f = true;
            if (this.f62162g) {
                this.f62157b.c();
                return;
            }
            return;
        }
        long positionUs = this.f62160e.getPositionUs();
        if (this.f62161f) {
            if (positionUs < this.f62157b.getPositionUs()) {
                this.f62157b.d();
                return;
            } else {
                this.f62161f = false;
                if (this.f62162g) {
                    this.f62157b.c();
                }
            }
        }
        this.f62157b.a(positionUs);
        l0 playbackParameters = this.f62160e.getPlaybackParameters();
        if (!playbackParameters.equals(this.f62157b.getPlaybackParameters())) {
            this.f62157b.b(playbackParameters);
            this.f62158c.a(playbackParameters);
        }
    }
}
