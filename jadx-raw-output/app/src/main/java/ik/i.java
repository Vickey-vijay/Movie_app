package ik;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class i extends g implements f<Integer> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f54220f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f54221g = new i(1, 0);

    public i(int i10, int i11) {
        super(i10, i11, 1);
    }

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final i a() {
            return i.f54221g;
        }
    }

    @Override // ik.g
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (e() != iVar.e() || f() != iVar.f()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ik.g
    public String toString() {
        return e() + ".." + f();
    }

    @Override // ik.g
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + f();
    }

    @Override // ik.g
    public boolean isEmpty() {
        if (e() > f()) {
            return true;
        }
        return false;
    }

    public boolean l(int i10) {
        if (e() <= i10 && i10 <= f()) {
            return true;
        }
        return false;
    }

    @Override // ik.f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(f());
    }

    @Override // ik.f
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(e());
    }
}
