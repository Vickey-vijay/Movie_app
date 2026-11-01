package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class cj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg1 f76292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f76293b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f76294c;

    public final String a() {
        String str;
        synchronized (this.f76293b) {
            if (this.f76294c == null) {
                this.f76294c = ((tg1) this.f76292a).c("YmadMauid");
            }
            str = this.f76294c;
        }
        return str;
    }

    public cj1(rg1 rg1Var) {
        this.f76292a = rg1Var;
    }

    public final void a(String str) {
        synchronized (this.f76293b) {
            this.f76294c = str;
            ((tg1) this.f76292a).a("YmadMauid", str);
            mj.r rVar = mj.r.f64562a;
        }
    }
}
