package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: loaded from: classes4.dex */
public final class Za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Za f28027a = new Za();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f28028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f28029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f28030c;

        public final boolean a() {
            return this.f28028a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28028a == aVar.f28028a && this.f28029b == aVar.f28029b && this.f28030c == aVar.f28030c;
        }

        public final a a(boolean z10, long j10, long j11) {
            return new a(z10, j10, j11);
        }

        public final long b() {
            return this.f28029b;
        }

        public final long c() {
            return this.f28030c;
        }

        public final long d() {
            return this.f28029b;
        }

        public final long e() {
            return this.f28030c;
        }

        public final boolean f() {
            return this.f28028a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z10 = this.f28028a;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return (((r10 * 31) + Long.hashCode(this.f28029b)) * 31) + Long.hashCode(this.f28030c);
        }

        public String toString() {
            return "BannerStrategyConfig(isAutoRefreshEnabled=" + this.f28028a + ", refreshInterval=" + this.f28029b + ", visibilityCheckerInterval=" + this.f28030c + ")";
        }

        public a(boolean z10, long j10, long j11) {
            this.f28028a = z10;
            this.f28029b = j10;
            this.f28030c = j11;
        }

        public static /* synthetic */ a a(a aVar, boolean z10, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = aVar.f28028a;
            }
            if ((i10 & 2) != 0) {
                j10 = aVar.f28029b;
            }
            long j12 = j10;
            if ((i10 & 4) != 0) {
                j11 = aVar.f28030c;
            }
            return aVar.a(z10, j12, j11);
        }
    }

    private Za() {
    }

    public final Da a(C3621o0 c3621o0, W2 w10, a aVar, J2 j10, Ea ea2, N2 n10, InterfaceC3710t4 interfaceC3710t4) {
        ck.p.j(c3621o0, "adTools");
        ck.p.j(w10, "bannerContainer");
        ck.p.j(aVar, "config");
        ck.p.j(j10, "bannerAdProperties");
        ck.p.j(ea2, "strategyListener");
        ck.p.j(n10, "bannerAdUnitFactory");
        ck.p.j(interfaceC3710t4, "timeProvider");
        IronLog.INTERNAL.verbose("Creating banner strategy, isAutoRefreshEnabled: " + aVar.f() + ", refreshInterval: " + aVar.d());
        if (aVar.f()) {
            return new Ha(c3621o0, w10, aVar.d(), aVar.e(), j10, ea2, n10, null, interfaceC3710t4, 128, null);
        }
        Ta ta2 = new Ta(c3621o0, w10, n10);
        ta2.a(ea2);
        return ta2;
    }
}
