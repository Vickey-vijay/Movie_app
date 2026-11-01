package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class mo2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f80306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f80307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po2 f80308d;

    public mo2(po2 po2Var, String str, long j10) {
        this.f80308d = po2Var;
        this.f80306b = str;
        this.f80307c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f80308d.f81488b.a(this.f80306b, this.f80307c);
        po2 po2Var = this.f80308d;
        km3 km3Var = po2Var.f81488b;
        po2Var.toString();
        km3Var.a();
    }
}
