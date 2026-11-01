package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4459q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f57536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f57537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f57538c;

    public RunnableC4459q1(C4558u1 c4558u1, String str, List list) {
        this.f57538c = c4558u1;
        this.f57536a = str;
        this.f57537b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f57538c).reportEvent(this.f57536a, CollectionUtils.getMapFromList(this.f57537b));
    }
}
