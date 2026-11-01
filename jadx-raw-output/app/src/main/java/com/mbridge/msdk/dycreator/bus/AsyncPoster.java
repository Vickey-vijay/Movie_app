package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes10.dex */
class AsyncPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f34336a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventBus f34337b;

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA = this.f34336a.a();
        if (pendingPostA == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f34337b.a(pendingPostA);
    }

    public AsyncPoster(EventBus eventBus) {
        this.f34337b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f34336a.a(PendingPost.a(subscription, obj));
        EventBus.f34341n.execute(this);
    }
}
