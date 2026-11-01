package nk;

/* JADX INFO: compiled from: MainCoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y1 extends h0 {
    public abstract y1 n();

    @Override // nk.h0
    public h0 limitedParallelism(int i10, String str) {
        sk.m.a(i10);
        return sk.m.b(this, str);
    }

    public final String p() {
        y1 y1VarN;
        y1 y1VarC = w0.c();
        if (this == y1VarC) {
            return "Dispatchers.Main";
        }
        try {
            y1VarN = y1VarC.n();
        } catch (UnsupportedOperationException unused) {
            y1VarN = null;
        }
        if (this != y1VarN) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // nk.h0
    public String toString() {
        String strP = p();
        if (strP == null) {
            return m0.a(this) + '@' + m0.b(this);
        }
        return strP;
    }
}
