package k3;

/* JADX INFO: compiled from: DefaultControlDispatcher.java */
/* JADX INFO: loaded from: classes8.dex */
public class g implements f {
    @Override // k3.f
    public boolean a(n0 n0Var, boolean z10) {
        n0Var.setShuffleModeEnabled(z10);
        return true;
    }

    @Override // k3.f
    public boolean b(n0 n0Var, int i10) {
        n0Var.setRepeatMode(i10);
        return true;
    }

    @Override // k3.f
    public boolean c(n0 n0Var, int i10, long j10) {
        n0Var.seekTo(i10, j10);
        return true;
    }

    @Override // k3.f
    public boolean d(n0 n0Var, boolean z10) {
        n0Var.setPlayWhenReady(z10);
        return true;
    }
}
