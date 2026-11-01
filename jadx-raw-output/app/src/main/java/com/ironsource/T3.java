package com.ironsource;

/* JADX INFO: loaded from: classes5.dex */
public final class T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zd f27656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H9 f27657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U2 f27658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Qb f27659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A1 f27660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Of f27661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.ironsource.mediationsdk.adquality.a f27662g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Zd f27663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private H9 f27664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private U2 f27665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Qb f27666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private A1 f27667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Of f27668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.ironsource.mediationsdk.adquality.a f27669g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final a a(Zd zd2, H9 h10, U2 u10, Qb qb2, A1 a10, Of of2, com.ironsource.mediationsdk.adquality.a aVar) {
            return new a(zd2, h10, u10, qb2, a10, of2, aVar);
        }

        public final Zd b() {
            return this.f27663a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return ck.p.e(this.f27663a, aVar.f27663a) && ck.p.e(this.f27664b, aVar.f27664b) && ck.p.e(this.f27665c, aVar.f27665c) && ck.p.e(this.f27666d, aVar.f27666d) && ck.p.e(this.f27667e, aVar.f27667e) && ck.p.e(this.f27668f, aVar.f27668f) && ck.p.e(this.f27669g, aVar.f27669g);
        }

        public a(Zd zd2, H9 h10, U2 u10, Qb qb2, A1 a10, Of of2, com.ironsource.mediationsdk.adquality.a aVar) {
            this.f27663a = zd2;
            this.f27664b = h10;
            this.f27665c = u10;
            this.f27666d = qb2;
            this.f27667e = a10;
            this.f27668f = of2;
            this.f27669g = aVar;
        }

        public static /* synthetic */ a a(a aVar, Zd zd2, H9 h10, U2 u10, Qb qb2, A1 a10, Of of2, com.ironsource.mediationsdk.adquality.a aVar2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                zd2 = aVar.f27663a;
            }
            if ((i10 & 2) != 0) {
                h10 = aVar.f27664b;
            }
            H9 h11 = h10;
            if ((i10 & 4) != 0) {
                u10 = aVar.f27665c;
            }
            U2 u11 = u10;
            if ((i10 & 8) != 0) {
                qb2 = aVar.f27666d;
            }
            Qb qb3 = qb2;
            if ((i10 & 16) != 0) {
                a10 = aVar.f27667e;
            }
            A1 a11 = a10;
            if ((i10 & 32) != 0) {
                of2 = aVar.f27668f;
            }
            Of of3 = of2;
            if ((i10 & 64) != 0) {
                aVar2 = aVar.f27669g;
            }
            return aVar.a(zd2, h11, u11, qb3, a11, of3, aVar2);
        }

        public final void b(Zd zd2) {
            this.f27663a = zd2;
        }

        public final H9 c() {
            return this.f27664b;
        }

        public final U2 d() {
            return this.f27665c;
        }

        public final Qb e() {
            return this.f27666d;
        }

        public final A1 f() {
            return this.f27667e;
        }

        public final Of g() {
            return this.f27668f;
        }

        public final com.ironsource.mediationsdk.adquality.a h() {
            return this.f27669g;
        }

        public int hashCode() {
            Zd zd2 = this.f27663a;
            int iHashCode = (zd2 == null ? 0 : zd2.hashCode()) * 31;
            H9 h10 = this.f27664b;
            int iHashCode2 = (iHashCode + (h10 == null ? 0 : h10.hashCode())) * 31;
            U2 u10 = this.f27665c;
            int iHashCode3 = (iHashCode2 + (u10 == null ? 0 : u10.hashCode())) * 31;
            Qb qb2 = this.f27666d;
            int iHashCode4 = (iHashCode3 + (qb2 == null ? 0 : qb2.hashCode())) * 31;
            A1 a10 = this.f27667e;
            int iHashCode5 = (iHashCode4 + (a10 == null ? 0 : a10.hashCode())) * 31;
            Of of2 = this.f27668f;
            int iHashCode6 = (iHashCode5 + (of2 == null ? 0 : of2.hashCode())) * 31;
            com.ironsource.mediationsdk.adquality.a aVar = this.f27669g;
            return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final com.ironsource.mediationsdk.adquality.a i() {
            return this.f27669g;
        }

        public final A1 j() {
            return this.f27667e;
        }

        public final U2 k() {
            return this.f27665c;
        }

        public final H9 l() {
            return this.f27664b;
        }

        public final Qb m() {
            return this.f27666d;
        }

        public final Zd n() {
            return this.f27663a;
        }

        public final Of o() {
            return this.f27668f;
        }

        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f27663a + ", interstitialConfigurations=" + this.f27664b + ", bannerConfigurations=" + this.f27665c + ", nativeAdConfigurations=" + this.f27666d + ", applicationConfigurations=" + this.f27667e + ", testSuiteSettings=" + this.f27668f + ", adQualityConfigurations=" + this.f27669g + ")";
        }

        public final void a(Of of2) {
            this.f27668f = of2;
        }

        public final void b(H9 h10) {
            this.f27664b = h10;
        }

        public final a a(Zd zd2) {
            this.f27663a = zd2;
            return this;
        }

        public final void b(U2 u10) {
            this.f27665c = u10;
        }

        public final a a(H9 h10) {
            this.f27664b = h10;
            return this;
        }

        public final void b(Qb qb2) {
            this.f27666d = qb2;
        }

        public final a a(U2 u10) {
            this.f27665c = u10;
            return this;
        }

        public final void b(A1 a10) {
            this.f27667e = a10;
        }

        public final a a(Qb qb2) {
            this.f27666d = qb2;
            return this;
        }

        public final void b(com.ironsource.mediationsdk.adquality.a aVar) {
            this.f27669g = aVar;
        }

        public final a a(A1 a10) {
            this.f27667e = a10;
            return this;
        }

        public final a b(Of of2) {
            this.f27668f = of2;
            return this;
        }

        public final a a(com.ironsource.mediationsdk.adquality.a aVar) {
            this.f27669g = aVar;
            return this;
        }

        public /* synthetic */ a(Zd zd2, H9 h10, U2 u10, Qb qb2, A1 a10, Of of2, com.ironsource.mediationsdk.adquality.a aVar, int i10, ck.i iVar) {
            this((i10 & 1) != 0 ? null : zd2, (i10 & 2) != 0 ? null : h10, (i10 & 4) != 0 ? null : u10, (i10 & 8) != 0 ? null : qb2, (i10 & 16) != 0 ? null : a10, (i10 & 32) != 0 ? null : of2, (i10 & 64) != 0 ? null : aVar);
        }

        public final T3 a() {
            return new T3(this.f27663a, this.f27664b, this.f27665c, this.f27666d, this.f27667e, this.f27668f, this.f27669g, null);
        }
    }

    public /* synthetic */ T3(Zd zd2, H9 h10, U2 u10, Qb qb2, A1 a10, Of of2, com.ironsource.mediationsdk.adquality.a aVar, ck.i iVar) {
        this(zd2, h10, u10, qb2, a10, of2, aVar);
    }

    private T3(Zd zd2, H9 h10, U2 u10, Qb qb2, A1 a10, Of of2, com.ironsource.mediationsdk.adquality.a aVar) {
        this.f27656a = zd2;
        this.f27657b = h10;
        this.f27658c = u10;
        this.f27659d = qb2;
        this.f27660e = a10;
        this.f27661f = of2;
        this.f27662g = aVar;
    }

    public final com.ironsource.mediationsdk.adquality.a a() {
        return this.f27662g;
    }

    public final A1 b() {
        return this.f27660e;
    }

    public final U2 c() {
        return this.f27658c;
    }

    public final H9 d() {
        return this.f27657b;
    }

    public final Qb e() {
        return this.f27659d;
    }

    public final Zd f() {
        return this.f27656a;
    }

    public final Of g() {
        return this.f27661f;
    }

    public String toString() {
        return "configurations(\n" + this.f27656a + "\n" + this.f27657b + "\n" + this.f27658c + "\n" + this.f27659d + ")";
    }
}
