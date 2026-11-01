package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class mh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh1 f80175a = new nh1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d63 f80176b = new d63();

    public final void a(Runnable runnable) {
        this.f80176b.getClass();
        if (d63.a()) {
            runnable.run();
        } else {
            this.f80175a.f80674a.post(runnable);
        }
    }

    public final void a() {
        this.f80175a.f80674a.removeCallbacksAndMessages(null);
    }
}
