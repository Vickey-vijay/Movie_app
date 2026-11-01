package com.iab.omid.library.bigosg.walking.a;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f21317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f21318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f21319c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f21320d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f21317a = linkedBlockingQueue;
        this.f21318b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f21319c.poll();
        this.f21320d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f21318b);
        }
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.a
    public void a(b bVar) {
        this.f21320d = null;
        a();
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f21319c.add(bVar);
        if (this.f21320d == null) {
            a();
        }
    }
}
