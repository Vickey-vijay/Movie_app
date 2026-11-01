package bl;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class r1<Array> {
    public abstract Array a();

    public abstract void b(int i10);

    public abstract int d();

    public static /* synthetic */ void c(r1 r1Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i11 & 1) != 0) {
            i10 = r1Var.d() + 1;
        }
        r1Var.b(i10);
    }
}
