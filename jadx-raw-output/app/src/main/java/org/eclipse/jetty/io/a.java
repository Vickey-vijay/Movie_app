package org.eclipse.jetty.io;

import mm.h;

/* JADX INFO: compiled from: AbstractBuffers.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a implements Buffers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Buffers.Type f65582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Buffers.Type f65584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f65585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Buffers.Type f65586e;

    /* JADX INFO: renamed from: org.eclipse.jetty.io.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractBuffers.java */
    public static /* synthetic */ class C0607a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65587a;

        static {
            int[] iArr = new int[Buffers.Type.values().length];
            f65587a = iArr;
            try {
                iArr[Buffers.Type.BYTE_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65587a[Buffers.Type.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65587a[Buffers.Type.INDIRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public int d() {
        return this.f65585d;
    }

    public int e() {
        return this.f65583b;
    }

    public final mm.d h() {
        int i10 = C0607a.f65587a[this.f65584c.ordinal()];
        if (i10 == 1) {
            return new h(this.f65585d);
        }
        if (i10 == 2) {
            return new om.b(this.f65585d);
        }
        if (i10 == 3) {
            return new om.c(this.f65585d);
        }
        throw new IllegalStateException();
    }

    public final mm.d i(int i10) {
        int i11 = C0607a.f65587a[this.f65586e.ordinal()];
        if (i11 == 1) {
            return new h(i10);
        }
        if (i11 == 2) {
            return new om.b(i10);
        }
        if (i11 == 3) {
            return new om.c(i10);
        }
        throw new IllegalStateException();
    }

    public final mm.d j() {
        int i10 = C0607a.f65587a[this.f65582a.ordinal()];
        if (i10 == 1) {
            return new h(this.f65583b);
        }
        if (i10 == 2) {
            return new om.b(this.f65583b);
        }
        if (i10 == 3) {
            return new om.c(this.f65583b);
        }
        throw new IllegalStateException();
    }

    public a(Buffers.Type type, int i10, Buffers.Type type2, int i11, Buffers.Type type3) {
        this.f65582a = type;
        this.f65583b = i10;
        this.f65584c = type2;
        this.f65585d = i11;
        this.f65586e = type3;
    }

    public final boolean f(mm.d dVar) {
        if (dVar.e0() != this.f65585d) {
            return false;
        }
        int i10 = C0607a.f65587a[this.f65584c.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                return dVar instanceof om.c;
            }
            return dVar instanceof om.b;
        }
        if (!(dVar instanceof h) || (dVar instanceof om.c)) {
            return false;
        }
        return true;
    }

    public final boolean g(mm.d dVar) {
        if (dVar.e0() != this.f65583b) {
            return false;
        }
        int i10 = C0607a.f65587a[this.f65582a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                return dVar instanceof om.c;
            }
            return dVar instanceof om.b;
        }
        if (!(dVar instanceof h) || (dVar instanceof om.c)) {
            return false;
        }
        return true;
    }
}
