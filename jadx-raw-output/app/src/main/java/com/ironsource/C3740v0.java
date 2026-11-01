package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3740v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<NetworkSettings> f31440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3649pa f31441c;

    public final String a() {
        return this.f31439a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3740v0)) {
            return false;
        }
        C3740v0 c3740v0 = (C3740v0) obj;
        return ck.p.e(this.f31439a, c3740v0.f31439a) && ck.p.e(this.f31440b, c3740v0.f31440b) && ck.p.e(this.f31441c, c3740v0.f31441c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3740v0(String str, List<? extends NetworkSettings> list, C3649pa c3649pa) {
        ck.p.j(list, "providerList");
        ck.p.j(c3649pa, "publisherDataHolder");
        this.f31439a = str;
        this.f31440b = list;
        this.f31441c = c3649pa;
    }

    public final C3740v0 a(String str, List<? extends NetworkSettings> list, C3649pa c3649pa) {
        ck.p.j(list, "providerList");
        ck.p.j(c3649pa, "publisherDataHolder");
        return new C3740v0(str, list, c3649pa);
    }

    public final List<NetworkSettings> b() {
        return this.f31440b;
    }

    public final C3649pa c() {
        return this.f31441c;
    }

    public final List<NetworkSettings> d() {
        return this.f31440b;
    }

    public final C3649pa e() {
        return this.f31441c;
    }

    public final String f() {
        return this.f31439a;
    }

    public int hashCode() {
        String str = this.f31439a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f31440b.hashCode()) * 31) + this.f31441c.hashCode();
    }

    public String toString() {
        return "AdUnitCommonData(userId=" + this.f31439a + ", providerList=" + this.f31440b + ", publisherDataHolder=" + this.f31441c + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3740v0 a(C3740v0 c3740v0, String str, List list, C3649pa c3649pa, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3740v0.f31439a;
        }
        if ((i10 & 2) != 0) {
            list = c3740v0.f31440b;
        }
        if ((i10 & 4) != 0) {
            c3649pa = c3740v0.f31441c;
        }
        return c3740v0.a(str, list, c3649pa);
    }
}
