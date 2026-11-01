package k3;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import java.io.IOException;

/* JADX INFO: compiled from: BaseRenderer.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e implements p0, q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62114b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f62116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k4.i0 f62119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Format[] f62120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f62121i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f62123k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f62124l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f62115c = new f0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f62122j = Long.MIN_VALUE;

    @Override // k3.p0
    public final q0 getCapabilities() {
        return this;
    }

    @Override // k3.p0
    @Nullable
    public g5.o getMediaClock() {
        return null;
    }

    @Override // k3.o0.b
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
    }

    public abstract void n();

    public void o(boolean z10) throws ExoPlaybackException {
    }

    public abstract void p(long j10, boolean z10) throws ExoPlaybackException;

    public void q() {
    }

    public void r() throws ExoPlaybackException {
    }

    @Override // k3.p0
    public final void resetPosition(long j10) throws ExoPlaybackException {
        this.f62123k = false;
        this.f62122j = j10;
        p(j10, false);
    }

    public void s() throws ExoPlaybackException {
    }

    @Override // k3.p0
    public final void setCurrentStreamFinal() {
        this.f62123k = true;
    }

    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }

    public void t(Format[] formatArr, long j10) throws ExoPlaybackException {
    }

    public static boolean w(@Nullable com.google.android.exoplayer2.drm.a<?> aVar, @Nullable DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (aVar == null) {
            return false;
        }
        return aVar.b(drmInitData);
    }

    @Override // k3.p0
    public final void d(r0 r0Var, Format[] formatArr, k4.i0 i0Var, long j10, boolean z10, long j11) throws ExoPlaybackException {
        g5.a.f(this.f62118f == 0);
        this.f62116d = r0Var;
        this.f62118f = 1;
        o(z10);
        e(formatArr, i0Var, j11);
        p(j10, z10);
    }

    @Override // k3.p0
    public final void disable() {
        g5.a.f(this.f62118f == 1);
        this.f62115c.a();
        this.f62118f = 0;
        this.f62119g = null;
        this.f62120h = null;
        this.f62123k = false;
        n();
    }

    @Override // k3.p0
    public final void e(Format[] formatArr, k4.i0 i0Var, long j10) throws ExoPlaybackException {
        g5.a.f(!this.f62123k);
        this.f62119g = i0Var;
        this.f62122j = j10;
        this.f62120h = formatArr;
        this.f62121i = j10;
        t(formatArr, j10);
    }

    public final ExoPlaybackException g(Exception exc, @Nullable Format format) {
        int formatSupport;
        if (format == null || this.f62124l) {
            formatSupport = 4;
        } else {
            this.f62124l = true;
            try {
                formatSupport = q0.getFormatSupport(a(format));
                this.f62124l = false;
            } catch (ExoPlaybackException unused) {
                this.f62124l = false;
                formatSupport = 4;
            } catch (Throwable th2) {
                this.f62124l = false;
                throw th2;
            }
        }
        return ExoPlaybackException.createForRenderer(exc, j(), format, formatSupport);
    }

    @Override // k3.p0
    public final long getReadingPositionUs() {
        return this.f62122j;
    }

    @Override // k3.p0
    public final int getState() {
        return this.f62118f;
    }

    @Override // k3.p0
    @Nullable
    public final k4.i0 getStream() {
        return this.f62119g;
    }

    @Override // k3.p0, k3.q0
    public final int getTrackType() {
        return this.f62114b;
    }

    public final r0 h() {
        return this.f62116d;
    }

    @Override // k3.p0
    public final boolean hasReadStreamToEnd() {
        return this.f62122j == Long.MIN_VALUE;
    }

    public final f0 i() {
        this.f62115c.a();
        return this.f62115c;
    }

    @Override // k3.p0
    public final boolean isCurrentStreamFinal() {
        return this.f62123k;
    }

    public final int j() {
        return this.f62117e;
    }

    public final Format[] k() {
        return this.f62120h;
    }

    @Nullable
    public final <T extends p3.i> DrmSession<T> l(@Nullable Format format, Format format2, @Nullable com.google.android.exoplayer2.drm.a<T> aVar, @Nullable DrmSession<T> drmSession) throws ExoPlaybackException {
        DrmSession<T> drmSessionE = null;
        if (!(!g5.k0.c(format2.f18973m, format == null ? null : format.f18973m))) {
            return drmSession;
        }
        if (format2.f18973m != null) {
            if (aVar == null) {
                throw g(new IllegalStateException("Media requires a DrmSessionManager"), format2);
            }
            drmSessionE = aVar.e((Looper) g5.a.e(Looper.myLooper()), format2.f18973m);
        }
        if (drmSession != null) {
            drmSession.release();
        }
        return drmSessionE;
    }

    @Override // k3.p0
    public final void maybeThrowStreamError() throws IOException {
        this.f62119g.maybeThrowError();
    }

    @Override // k3.p0
    public final void reset() {
        g5.a.f(this.f62118f == 0);
        this.f62115c.a();
        q();
    }

    @Override // k3.p0
    public final void setIndex(int i10) {
        this.f62117e = i10;
    }

    @Override // k3.p0
    public final void start() throws ExoPlaybackException {
        g5.a.f(this.f62118f == 1);
        this.f62118f = 2;
        r();
    }

    @Override // k3.p0
    public final void stop() throws ExoPlaybackException {
        g5.a.f(this.f62118f == 2);
        this.f62118f = 1;
        s();
    }

    public final int u(f0 f0Var, o3.e eVar, boolean z10) {
        int iB = this.f62119g.b(f0Var, eVar, z10);
        if (iB == -4) {
            if (eVar.isEndOfStream()) {
                this.f62122j = Long.MIN_VALUE;
                return this.f62123k ? -4 : -3;
            }
            long j10 = eVar.f64971e + this.f62121i;
            eVar.f64971e = j10;
            this.f62122j = Math.max(this.f62122j, j10);
        } else if (iB == -5) {
            Format format = f0Var.f62129c;
            long j11 = format.f18974n;
            if (j11 != Long.MAX_VALUE) {
                f0Var.f62129c = format.l(j11 + this.f62121i);
            }
        }
        return iB;
    }

    public int v(long j10) {
        return this.f62119g.skipData(j10 - this.f62121i);
    }

    public e(int i10) {
        this.f62114b = i10;
    }

    public final boolean m() {
        if (hasReadStreamToEnd()) {
            return this.f62123k;
        }
        return this.f62119g.isReady();
    }
}
