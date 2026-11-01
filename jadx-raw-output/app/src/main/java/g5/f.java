package g5;

/* JADX INFO: compiled from: ConditionVariable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f53072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53073b;

    public f() {
        this(c.f53058a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f53073b) {
            wait();
        }
    }

    public synchronized boolean b() {
        boolean z10;
        z10 = this.f53073b;
        this.f53073b = false;
        return z10;
    }

    public synchronized boolean c() {
        return this.f53073b;
    }

    public synchronized boolean d() {
        if (this.f53073b) {
            return false;
        }
        this.f53073b = true;
        notifyAll();
        return true;
    }

    public f(c cVar) {
        this.f53072a = cVar;
    }
}
