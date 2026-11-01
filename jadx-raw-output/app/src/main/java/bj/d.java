package bj;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: BlockingIgnoringReceiver.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends CountDownLatch implements oi.g<Throwable>, oi.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f5362b;

    public d() {
        super(1);
    }

    @Override // oi.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        this.f5362b = th2;
        countDown();
    }

    @Override // oi.a
    public void run() {
        countDown();
    }
}
