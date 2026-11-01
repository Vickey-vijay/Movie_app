package com.iab.omid.library.appodeal.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f21196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f21197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f21198c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f21199d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f21196a = linkedBlockingQueue;
        this.f21197b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f21198c.poll();
        this.f21199d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f21197b);
        }
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b.a
    public void a(b bVar) {
        this.f21199d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f21198c.add(bVar);
        if (this.f21199d == null) {
            a();
        }
    }
}
