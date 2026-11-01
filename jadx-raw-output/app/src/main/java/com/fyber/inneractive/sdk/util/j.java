package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f18585a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f18586b;

    public j(int i10, i iVar) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18585a.offer(iVar.a());
        }
        this.f18586b = iVar;
    }
}
