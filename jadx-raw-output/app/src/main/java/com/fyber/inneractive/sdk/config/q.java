package com.fyber.inneractive.sdk.config;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f15141a;

    public q(s sVar) {
        this.f15141a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f15141a;
        Iterator it = sVar.f15196c.iterator();
        while (it.hasNext()) {
            ((r) it.next()).onGlobalConfigChanged(sVar, sVar.f15195b);
        }
    }
}
