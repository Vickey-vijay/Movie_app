package yads;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes11.dex */
public final class v13 implements yf1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u13 f83725b;

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11) {
        boolean z10;
        if (this.f83725b != null) {
            synchronized (x13.f84421b) {
                z10 = x13.f84422c;
            }
            if (z10) {
                ((com.monetization.ads.exo.source.dash.a) this.f83725b).a();
                return;
            }
            u13 u13Var = this.f83725b;
            ((com.monetization.ads.exo.source.dash.a) u13Var).f42915a.a(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11, boolean z10) {
    }

    public v13(com.monetization.ads.exo.source.dash.a aVar) {
        this.f83725b = aVar;
    }

    @Override // yads.yf1
    public final zf1 a(bg1 bg1Var, long j10, long j11, IOException iOException, int i10) {
        u13 u13Var = this.f83725b;
        if (u13Var != null) {
            ((com.monetization.ads.exo.source.dash.a) u13Var).f42915a.a(iOException);
        }
        return fg1.f77388d;
    }
}
