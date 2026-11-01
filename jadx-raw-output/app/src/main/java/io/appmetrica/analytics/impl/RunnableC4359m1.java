package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4359m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f57237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f57238b;

    public RunnableC4359m1(C4558u1 c4558u1, List list) {
        this.f57238b = c4558u1;
        this.f57237a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4558u1.a(this.f57238b).reportAnr(CollectionUtils.getMapFromList(this.f57237a));
    }
}
