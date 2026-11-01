package sk;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class m {
    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    public static final nk.h0 b(nk.h0 h0Var, String str) {
        return str != null ? new v(h0Var, str) : h0Var;
    }
}
