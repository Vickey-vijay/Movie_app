package yads;

/* JADX INFO: loaded from: classes11.dex */
public interface m73 {
    int a(l30 l30Var, int i10, boolean z10);

    void a(int i10, jb2 jb2Var);

    void a(long j10, int i10, int i11, int i12, l73 l73Var);

    void a(mx0 mx0Var);

    default int b(l30 l30Var, int i10, boolean z10) {
        return a(l30Var, i10, z10);
    }

    default void b(int i10, jb2 jb2Var) {
        a(i10, jb2Var);
    }
}
