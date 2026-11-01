package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class nd implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od f80640b;

    public nd(od odVar) {
        this.f80640b = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pd pdVar = this.f80640b.f80998c;
        if (pdVar != null) {
            ((vc) pdVar).f83875a.f84528d.removeCallbacksAndMessages(null);
        }
    }
}
