package gl;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f53450b;

    public b(a aVar) {
        this.f53450b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f53450b;
        int i10 = aVar.f53433a;
        if (i10 > 0) {
            aVar.f53433a = i10 - 1;
            aVar.f53435c.postDelayed(this, 1000L);
        } else {
            t1 t1Var = aVar.f53434b;
            if (t1Var != null) {
                t1Var.a();
            }
        }
    }
}
