package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3380ac extends V {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f28150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<NetworkSettings> f28151t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Qb f28152u;

    public final C3380ac a(String str, List<? extends NetworkSettings> list, Qb qb2) {
        ck.p.j(qb2, C3537j8.f29262p);
        return new C3380ac(str, list, qb2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3380ac)) {
            return false;
        }
        C3380ac c3380ac = (C3380ac) obj;
        return ck.p.e(this.f28150s, c3380ac.f28150s) && ck.p.e(this.f28151t, c3380ac.f28151t) && ck.p.e(this.f28152u, c3380ac.f28152u);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3380ac(String str, List<? extends NetworkSettings> list, Qb qb2) {
        super(IronSource.a.NATIVE_AD, str, list, qb2.d(), qb2.b(), (int) (qb2.c() / ((long) 1000)), qb2.a(), qb2.f(), -1, new O0(O0.a.MANUAL, qb2.d().j(), qb2.d().b(), -1L), new I0(-1L), qb2.h(), qb2.i(), qb2.k(), qb2.j(), false, 32768, null);
        ck.p.j(qb2, C3537j8.f29262p);
        this.f28150s = str;
        this.f28151t = list;
        this.f28152u = qb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3380ac a(C3380ac c3380ac, String str, List list, Qb qb2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3380ac.f28150s;
        }
        if ((i10 & 2) != 0) {
            list = c3380ac.f28151t;
        }
        if ((i10 & 4) != 0) {
            qb2 = c3380ac.f28152u;
        }
        return c3380ac.a(str, list, qb2);
    }

    public int hashCode() {
        String str = this.f28150s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f28151t;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f28152u.hashCode();
    }

    @Override // com.ironsource.V
    public List<NetworkSettings> j() {
        return this.f28151t;
    }

    @Override // com.ironsource.V
    public String o() {
        return this.f28150s;
    }

    public final String s() {
        return this.f28150s;
    }

    public final List<NetworkSettings> t() {
        return this.f28151t;
    }

    public String toString() {
        return "NativeAdManagerData(userId=" + this.f28150s + ", providerList=" + this.f28151t + ", configs=" + this.f28152u + ")";
    }

    public final Qb u() {
        return this.f28152u;
    }

    public final Qb v() {
        return this.f28152u;
    }
}
