package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4535t3 implements R7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4510s3 f57700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f57701b;

    public final C4535t3 a(C4510s3 c4510s3, List<C4510s3> list) {
        return new C4535t3(c4510s3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4535t3)) {
            return false;
        }
        C4535t3 c4535t3 = (C4535t3) obj;
        return ck.p.e(this.f57700a, c4535t3.f57700a) && ck.p.e(this.f57701b, c4535t3.f57701b);
    }

    public static C4535t3 a(C4535t3 c4535t3, C4510s3 c4510s3, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4510s3 = c4535t3.f57700a;
        }
        if ((i10 & 2) != 0) {
            list = c4535t3.f57701b;
        }
        c4535t3.getClass();
        return new C4535t3(c4510s3, list);
    }

    @Override // io.appmetrica.analytics.impl.R7
    public final Object b() {
        return this.f57700a;
    }

    public final C4510s3 c() {
        return this.f57700a;
    }

    public final List<C4510s3> d() {
        return this.f57701b;
    }

    public final C4510s3 e() {
        return this.f57700a;
    }

    public final int hashCode() {
        return this.f57701b.hashCode() + (this.f57700a.hashCode() * 31);
    }

    public final String toString() {
        return "ClidsInfo(chosen=" + this.f57700a + ", candidates=" + this.f57701b + ')';
    }

    public C4535t3(C4510s3 c4510s3, List<C4510s3> list) {
        this.f57700a = c4510s3;
        this.f57701b = list;
    }

    @Override // io.appmetrica.analytics.impl.R7
    public final List<C4510s3> a() {
        return this.f57701b;
    }
}
