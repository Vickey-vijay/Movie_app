package com.ironsource;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3656q0.a f26773a;

    public final C3656q0.a a() {
        return this.f26773a;
    }

    public final C3656q0.a b() {
        return this.f26773a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I) && this.f26773a == ((I) obj).f26773a;
    }

    public I(C3656q0.a aVar) {
        ck.p.j(aVar, "performance");
        this.f26773a = aVar;
    }

    public final I a(C3656q0.a aVar) {
        ck.p.j(aVar, "performance");
        return new I(aVar);
    }

    public final void b(C3656q0.a aVar) {
        ck.p.j(aVar, "<set-?>");
        this.f26773a = aVar;
    }

    public int hashCode() {
        return this.f26773a.hashCode();
    }

    public String toString() {
        return "AdInstancePerformance(performance=" + this.f26773a + ")";
    }

    public static /* synthetic */ I a(I i10, C3656q0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = i10.f26773a;
        }
        return i10.a(aVar);
    }
}
