package ik;

import ck.p;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends ik.a implements f<Character> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f54208f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f54209g = new c(1, 0);

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (e() != cVar.e() || f() != cVar.f()) {
                }
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return e() + ".." + f();
    }

    @Override // ik.f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Character getEndInclusive() {
        return Character.valueOf(f());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + f();
    }

    public boolean isEmpty() {
        if (p.l(e(), f()) > 0) {
            return true;
        }
        return false;
    }

    @Override // ik.f
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Character getStart() {
        return Character.valueOf(e());
    }
}
