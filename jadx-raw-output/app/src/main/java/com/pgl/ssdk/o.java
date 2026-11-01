package com.pgl.ssdk;

/* JADX INFO: loaded from: classes10.dex */
public final class o<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f43311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f43312b;

    public static <A, B> o<A, B> a(A a10, B b10) {
        return new o<>(a10, b10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a10 = this.f43311a;
        if (a10 == null) {
            if (oVar.f43311a != null) {
                return false;
            }
        } else if (!a10.equals(oVar.f43311a)) {
            return false;
        }
        B b10 = this.f43312b;
        if (b10 == null) {
            if (oVar.f43312b != null) {
                return false;
            }
        } else if (!b10.equals(oVar.f43312b)) {
            return false;
        }
        return true;
    }

    public final A a() {
        return this.f43311a;
    }

    public final B b() {
        return this.f43312b;
    }

    public final int hashCode() {
        A a10 = this.f43311a;
        int iHashCode = ((a10 == null ? 0 : a10.hashCode()) + 31) * 31;
        B b10 = this.f43312b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public o(A a10, B b10) {
        this.f43311a = a10;
        this.f43312b = b10;
    }
}
