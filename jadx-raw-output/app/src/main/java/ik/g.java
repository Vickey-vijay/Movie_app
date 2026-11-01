package ik;

import nj.g0;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes2.dex */
public class g implements Iterable<Integer>, dk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f54212e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54215d;

    /* JADX INFO: compiled from: Progressions.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final g a(int i10, int i11, int i12) {
            return new g(i10, i11, i12);
        }
    }

    public final int e() {
        return this.f54213b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f54213b != gVar.f54213b || this.f54214c != gVar.f54214c || this.f54215d != gVar.f54215d) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f54214c;
    }

    public final int g() {
        return this.f54215d;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public g0 iterator() {
        return new h(this.f54213b, this.f54214c, this.f54215d);
    }

    public boolean isEmpty() {
        if (this.f54215d > 0) {
            if (this.f54213b > this.f54214c) {
                return true;
            }
        } else if (this.f54213b < this.f54214c) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f54215d > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f54213b);
            sb2.append("..");
            sb2.append(this.f54214c);
            sb2.append(" step ");
            i10 = this.f54215d;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f54213b);
            sb2.append(" downTo ");
            sb2.append(this.f54214c);
            sb2.append(" step ");
            i10 = -this.f54215d;
        }
        sb2.append(i10);
        return sb2.toString();
    }

    public g(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f54213b = i10;
                this.f54214c = vj.c.b(i10, i11, i12);
                this.f54215d = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f54213b * 31) + this.f54214c) * 31) + this.f54215d;
    }
}
