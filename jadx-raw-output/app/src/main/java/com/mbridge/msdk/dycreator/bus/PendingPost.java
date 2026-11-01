package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class PendingPost {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f34365d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f34366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f34367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PendingPost f34368c;

    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f34365d;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new PendingPost(obj, subscription);
            }
            PendingPost pendingPostRemove = list.remove(size - 1);
            pendingPostRemove.f34366a = obj;
            pendingPostRemove.f34367b = subscription;
            pendingPostRemove.f34368c = null;
            return pendingPostRemove;
        }
    }

    private PendingPost(Object obj, Subscription subscription) {
        this.f34366a = obj;
        this.f34367b = subscription;
    }

    public static void a(PendingPost pendingPost) {
        pendingPost.f34366a = null;
        pendingPost.f34367b = null;
        pendingPost.f34368c = null;
        List<PendingPost> list = f34365d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(pendingPost);
            }
        }
    }
}
