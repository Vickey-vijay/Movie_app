package c;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f5579b;

    public l(q qVar) {
        this.f5579b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.f5579b.f5589c;
        if (dVar.B) {
            return;
        }
        dVar.v("load ad time out");
        this.f5579b.f5589c.D = true;
    }
}
