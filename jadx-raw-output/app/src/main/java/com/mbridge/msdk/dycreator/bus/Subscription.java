package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes2.dex */
final class Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubscriberMethod f34378b;

    public boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return this.f34377a == subscription.f34377a && this.f34378b.equals(subscription.f34378b);
    }

    public int hashCode() {
        return this.f34377a.hashCode() + this.f34378b.f34374d.hashCode();
    }

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f34377a = obj;
        this.f34378b = subscriberMethod;
    }
}
