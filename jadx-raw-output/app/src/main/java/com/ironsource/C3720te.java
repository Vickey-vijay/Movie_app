package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3720te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<IronSource.a> f31318c;

    public C3720te(String str, String str2, List<IronSource.a> list) {
        ck.p.j(str, "appKey");
        ck.p.j(list, "legacyAdFormats");
        this.f31316a = str;
        this.f31317b = str2;
        this.f31318c = list;
    }

    public final String a() {
        return this.f31316a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3720te)) {
            return false;
        }
        C3720te c3720te = (C3720te) obj;
        return ck.p.e(this.f31316a, c3720te.f31316a) && ck.p.e(this.f31317b, c3720te.f31317b) && ck.p.e(this.f31318c, c3720te.f31318c);
    }

    public final C3720te a(String str, String str2, List<IronSource.a> list) {
        ck.p.j(str, "appKey");
        ck.p.j(list, "legacyAdFormats");
        return new C3720te(str, str2, list);
    }

    public final String b() {
        return this.f31317b;
    }

    public final List<IronSource.a> c() {
        return this.f31318c;
    }

    public final String d() {
        return this.f31316a;
    }

    public final List<IronSource.a> e() {
        return this.f31318c;
    }

    public final String f() {
        return this.f31317b;
    }

    public int hashCode() {
        int iHashCode = this.f31316a.hashCode() * 31;
        String str = this.f31317b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f31318c.hashCode();
    }

    public String toString() {
        return "SdkInitRequest(appKey=" + this.f31316a + ", userId=" + this.f31317b + ", legacyAdFormats=" + this.f31318c + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3720te a(C3720te c3720te, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3720te.f31316a;
        }
        if ((i10 & 2) != 0) {
            str2 = c3720te.f31317b;
        }
        if ((i10 & 4) != 0) {
            list = c3720te.f31318c;
        }
        return c3720te.a(str, str2, list);
    }

    public final void a(List<? extends IronSource.a> list) {
        ck.p.j(list, "adFormats");
        this.f31318c.clear();
        this.f31318c.addAll(list);
    }

    public /* synthetic */ C3720te(String str, String str2, List list, int i10, ck.i iVar) {
        this(str, (i10 & 2) != 0 ? null : str2, list);
    }
}
