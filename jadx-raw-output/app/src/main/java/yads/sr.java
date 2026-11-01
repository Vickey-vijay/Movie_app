package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class sr implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ po2 f82736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr f82737c;

    public sr(tr trVar, po2 po2Var) {
        this.f82737c = trVar;
        this.f82736b = po2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f82737c.f83145c.put(this.f82736b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
