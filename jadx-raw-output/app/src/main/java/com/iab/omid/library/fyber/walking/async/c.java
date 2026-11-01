package com.iab.omid.library.fyber.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f21582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f21583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f21584c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f21585d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f21582a = linkedBlockingQueue;
        this.f21583b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f21584c.poll();
        this.f21585d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f21583b);
        }
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.a
    public void a(b bVar) {
        this.f21585d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f21584c.add(bVar);
        if (this.f21585d == null) {
            a();
        }
    }
}
