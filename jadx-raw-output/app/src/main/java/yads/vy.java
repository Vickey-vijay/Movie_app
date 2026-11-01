package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class vy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84041a;

    public vy() {
        this(0);
    }

    public final synchronized void a() {
        while (!this.f84041a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f84041a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        return this.f84041a;
    }

    public final synchronized boolean d() {
        if (this.f84041a) {
            return false;
        }
        this.f84041a = true;
        notifyAll();
        return true;
    }

    public vy(int i10) {
    }
}
