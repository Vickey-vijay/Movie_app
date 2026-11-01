package dl;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f52173c = new o();

    public final void c(char[] cArr) {
        ck.p.j(cArr, "array");
        if (cArr.length == 16384) {
            a(cArr);
            return;
        }
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }

    public final char[] d() {
        return super.b(16384);
    }
}
