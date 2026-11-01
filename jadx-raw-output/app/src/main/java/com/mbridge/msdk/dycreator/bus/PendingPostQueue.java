package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes9.dex */
final class PendingPostQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PendingPost f34369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PendingPost f34370b;

    public synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.f34370b;
            if (pendingPost2 != null) {
                pendingPost2.f34368c = pendingPost;
                this.f34370b = pendingPost;
            } else {
                if (this.f34369a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f34370b = pendingPost;
                this.f34369a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f34369a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f34368c;
            this.f34369a = pendingPost2;
            if (pendingPost2 == null) {
                this.f34370b = null;
            }
        }
        return pendingPost;
    }

    public synchronized PendingPost a(int i10) throws InterruptedException {
        if (this.f34369a == null) {
            wait(i10);
        }
        return a();
    }
}
