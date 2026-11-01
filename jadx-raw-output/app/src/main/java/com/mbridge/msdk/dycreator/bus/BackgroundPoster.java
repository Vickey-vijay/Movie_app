package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class BackgroundPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f34338a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f34339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f34340c;

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    PendingPost pendingPostA = this.f34338a.a(1000);
                    if (pendingPostA == null) {
                        synchronized (this) {
                            pendingPostA = this.f34338a.a();
                            if (pendingPostA == null) {
                                this.f34339b = false;
                                this.f34339b = false;
                                return;
                            }
                        }
                    }
                    this.f34340c.a(pendingPostA);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f34339b = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f34339b = false;
                throw th2;
            }
        }
    }

    public BackgroundPoster(EventBus eventBus) {
        this.f34340c = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            this.f34338a.a(pendingPostA);
            if (!this.f34339b) {
                this.f34339b = true;
                EventBus.f34341n.execute(this);
            }
        }
    }
}
