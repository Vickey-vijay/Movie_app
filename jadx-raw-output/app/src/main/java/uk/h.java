package uk;

import nk.m0;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f72903d;

    @Override // java.lang.Runnable
    public void run() {
        this.f72903d.run();
    }

    public String toString() {
        return "Task[" + m0.a(this.f72903d) + '@' + m0.b(this.f72903d) + ", " + this.f72901b + ", " + i.c(this.f72902c) + ']';
    }

    public h(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f72903d = runnable;
    }
}
