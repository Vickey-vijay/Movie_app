package j;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f61517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f61518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f61519d;

    public j0(x0 x0Var, int i10, String str) {
        this.f61519d = x0Var;
        this.f61517b = i10;
        this.f61518c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x0 x0Var = this.f61519d;
        x0Var.f61667c.IL1Iii(this.f61517b, this.f61518c, x0Var.f61666b);
    }
}
