package jl;

/* JADX INFO: compiled from: UpdateThread.java */
/* JADX INFO: loaded from: classes11.dex */
public class i extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f61936b;

    public void c() {
        this.f61936b = true;
    }

    public boolean a() {
        return this.f61936b;
    }

    public i(String str) {
        super(str);
    }
}
