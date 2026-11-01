package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class qd implements jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f81828b;

    public final void a() {
        this.f81828b.run();
    }

    public final boolean a(String str, String str2) {
        return ck.p.e("mobileads", str) && ck.p.e(this.f81827a, str2);
    }

    public qd(String str, Runnable runnable) {
        this.f81827a = str;
        this.f81828b = runnable;
    }
}
