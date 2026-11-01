package k4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import k3.t0;

/* JADX INFO: compiled from: MaskingMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class o implements q, q.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f62580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r.a f62581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e5.b f62582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public q f62583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public q.a f62584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f62585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public a f62586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f62587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f62588j = -9223372036854775807L;

    /* JADX INFO: compiled from: MaskingMediaPeriod.java */
    public interface a {
        void a(r.a aVar, IOException iOException);
    }

    @Override // k4.q
    public long d(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, i0[] i0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f62588j;
        if (j12 == -9223372036854775807L || j10 != this.f62585g) {
            j11 = j10;
        } else {
            this.f62588j = -9223372036854775807L;
            j11 = j12;
        }
        return ((q) g5.k0.i(this.f62583e)).d(cVarArr, zArr, i0VarArr, zArr2, j11);
    }

    @Override // k4.q
    public long a(long j10, t0 t0Var) {
        return ((q) g5.k0.i(this.f62583e)).a(j10, t0Var);
    }

    public void b(r.a aVar) {
        long jH = h(this.f62585g);
        q qVarJ = this.f62580b.j(aVar, this.f62582d, jH);
        this.f62583e = qVarJ;
        if (this.f62584f != null) {
            qVarJ.c(this, jH);
        }
    }

    @Override // k4.q
    public void c(q.a aVar, long j10) {
        this.f62584f = aVar;
        q qVar = this.f62583e;
        if (qVar != null) {
            qVar.c(this, h(this.f62585g));
        }
    }

    @Override // k4.q, k4.j0
    public boolean continueLoading(long j10) {
        q qVar = this.f62583e;
        return qVar != null && qVar.continueLoading(j10);
    }

    @Override // k4.q
    public void discardBuffer(long j10, boolean z10) {
        ((q) g5.k0.i(this.f62583e)).discardBuffer(j10, z10);
    }

    @Override // k4.q.a
    public void f(q qVar) {
        ((q.a) g5.k0.i(this.f62584f)).f(this);
    }

    public long g() {
        return this.f62585g;
    }

    @Override // k4.q, k4.j0
    public long getBufferedPositionUs() {
        return ((q) g5.k0.i(this.f62583e)).getBufferedPositionUs();
    }

    @Override // k4.q, k4.j0
    public long getNextLoadPositionUs() {
        return ((q) g5.k0.i(this.f62583e)).getNextLoadPositionUs();
    }

    @Override // k4.q
    public TrackGroupArray getTrackGroups() {
        return ((q) g5.k0.i(this.f62583e)).getTrackGroups();
    }

    public final long h(long j10) {
        long j11 = this.f62588j;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // k4.j0.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void e(q qVar) {
        ((q.a) g5.k0.i(this.f62584f)).e(this);
    }

    @Override // k4.q, k4.j0
    public boolean isLoading() {
        q qVar = this.f62583e;
        return qVar != null && qVar.isLoading();
    }

    public void j(long j10) {
        this.f62588j = j10;
    }

    public void k() {
        q qVar = this.f62583e;
        if (qVar != null) {
            this.f62580b.c(qVar);
        }
    }

    @Override // k4.q
    public void maybeThrowPrepareError() throws IOException {
        try {
            q qVar = this.f62583e;
            if (qVar != null) {
                qVar.maybeThrowPrepareError();
            } else {
                this.f62580b.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e10) {
            a aVar = this.f62586h;
            if (aVar == null) {
                throw e10;
            }
            if (this.f62587i) {
                return;
            }
            this.f62587i = true;
            aVar.a(this.f62581c, e10);
        }
    }

    @Override // k4.q
    public long readDiscontinuity() {
        return ((q) g5.k0.i(this.f62583e)).readDiscontinuity();
    }

    @Override // k4.q, k4.j0
    public void reevaluateBuffer(long j10) {
        ((q) g5.k0.i(this.f62583e)).reevaluateBuffer(j10);
    }

    @Override // k4.q
    public long seekToUs(long j10) {
        return ((q) g5.k0.i(this.f62583e)).seekToUs(j10);
    }

    public o(r rVar, r.a aVar, e5.b bVar, long j10) {
        this.f62581c = aVar;
        this.f62582d = bVar;
        this.f62580b = rVar;
        this.f62585g = j10;
    }
}
