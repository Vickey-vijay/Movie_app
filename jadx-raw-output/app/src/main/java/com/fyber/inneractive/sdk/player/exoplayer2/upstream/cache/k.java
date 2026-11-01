package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f17708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f17709b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ConditionVariable conditionVariable) {
        super("SimpleCache.initialize()");
        this.f17709b = lVar;
        this.f17708a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f17709b) {
            this.f17708a.open();
            try {
                l.a(this.f17709b);
            } catch (a e10) {
                this.f17709b.f17715f = e10;
            }
            this.f17709b.f17711b.getClass();
        }
    }
}
