package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4487r5 implements Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57591a;

    public final C4487r5 a(String str) {
        return new C4487r5(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4487r5) && ck.p.e(this.f57591a, ((C4487r5) obj).f57591a);
    }

    public static C4487r5 a(C4487r5 c4487r5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4487r5.f57591a;
        }
        c4487r5.getClass();
        return new C4487r5(str);
    }

    public final String b() {
        return this.f57591a;
    }

    public final int hashCode() {
        return this.f57591a.hashCode();
    }

    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f57591a + ')';
    }

    public C4487r5(String str) {
        this.f57591a = str;
    }

    @Override // io.appmetrica.analytics.impl.Sc
    public final String a() {
        return this.f57591a;
    }
}
