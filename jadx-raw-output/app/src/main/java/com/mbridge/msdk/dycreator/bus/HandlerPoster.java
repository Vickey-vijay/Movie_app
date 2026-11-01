package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes8.dex */
final class HandlerPoster extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f34361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f34363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f34364d;

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost pendingPostA = this.f34361a.a();
                if (pendingPostA == null) {
                    synchronized (this) {
                        pendingPostA = this.f34361a.a();
                        if (pendingPostA == null) {
                            this.f34364d = false;
                            return;
                        }
                    }
                }
                this.f34363c.a(pendingPostA);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f34362b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f34364d = true;
        } catch (Throwable th2) {
            this.f34364d = false;
            throw th2;
        }
    }

    public HandlerPoster(EventBus eventBus, Looper looper, int i10) {
        super(looper);
        this.f34363c = eventBus;
        this.f34362b = i10;
        this.f34361a = new PendingPostQueue();
    }

    public void a(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            this.f34361a.a(pendingPostA);
            if (!this.f34364d) {
                this.f34364d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }
}
