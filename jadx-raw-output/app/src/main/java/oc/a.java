package oc;

/* JADX INFO: compiled from: DispatchGroup.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f65158a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f65159b;

    public synchronized void a() {
        this.f65158a++;
    }

    public synchronized void b() {
        this.f65158a--;
        d();
    }

    public void c(Runnable runnable) {
        this.f65159b = runnable;
        d();
    }

    public final void d() {
        Runnable runnable;
        if (this.f65158a > 0 || (runnable = this.f65159b) == null) {
            return;
        }
        runnable.run();
    }
}
