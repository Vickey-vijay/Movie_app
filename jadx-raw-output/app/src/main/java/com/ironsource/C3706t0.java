package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3706t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC3639p0 f31244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LevelPlayAdInfo f31245b;

    public C3706t0(AbstractC3639p0 abstractC3639p0, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(abstractC3639p0, "adUnit");
        this.f31244a = abstractC3639p0;
        this.f31245b = levelPlayAdInfo;
    }

    public final AbstractC3639p0 a() {
        return this.f31244a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3706t0)) {
            return false;
        }
        C3706t0 c3706t0 = (C3706t0) obj;
        return ck.p.e(this.f31244a, c3706t0.f31244a) && ck.p.e(this.f31245b, c3706t0.f31245b);
    }

    public /* synthetic */ C3706t0(AbstractC3639p0 abstractC3639p0, LevelPlayAdInfo levelPlayAdInfo, int i10, ck.i iVar) {
        this(abstractC3639p0, (i10 & 2) != 0 ? null : levelPlayAdInfo);
    }

    public final C3706t0 a(AbstractC3639p0 abstractC3639p0, LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(abstractC3639p0, "adUnit");
        return new C3706t0(abstractC3639p0, levelPlayAdInfo);
    }

    public final LevelPlayAdInfo b() {
        return this.f31245b;
    }

    public final LevelPlayAdInfo c() {
        return this.f31245b;
    }

    public final AbstractC3639p0 d() {
        return this.f31244a;
    }

    public int hashCode() {
        int iHashCode = this.f31244a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.f31245b;
        return iHashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public String toString() {
        return "AdUnitCallback(adUnit=" + this.f31244a + ", adInfo=" + this.f31245b + ")";
    }

    public static /* synthetic */ C3706t0 a(C3706t0 c3706t0, AbstractC3639p0 abstractC3639p0, LevelPlayAdInfo levelPlayAdInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC3639p0 = c3706t0.f31244a;
        }
        if ((i10 & 2) != 0) {
            levelPlayAdInfo = c3706t0.f31245b;
        }
        return c3706t0.a(abstractC3639p0, levelPlayAdInfo);
    }
}
