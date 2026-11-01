package ik;

import nj.q;

/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes11.dex */
public class a implements Iterable<Character>, dk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0488a f54200e = new C0488a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f54201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f54202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54203d;

    /* JADX INFO: renamed from: ik.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Progressions.kt */
    public static final class C0488a {
        public C0488a() {
        }

        public /* synthetic */ C0488a(ck.i iVar) {
            this();
        }
    }

    public final char e() {
        return this.f54201b;
    }

    public final char f() {
        return this.f54202c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public q iterator() {
        return new b(this.f54201b, this.f54202c, this.f54203d);
    }

    public a(char c10, char c11, int i10) {
        if (i10 != 0) {
            if (i10 != Integer.MIN_VALUE) {
                this.f54201b = c10;
                this.f54202c = (char) vj.c.b(c10, c11, i10);
                this.f54203d = i10;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }
}
