package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC4067ai implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f56378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4248hi f56379b;

    public RunnableC4067ai(C4248hi c4248hi, List list) {
        this.f56379b = c4248hi;
        this.f56378a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f56379b;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportAnr(CollectionUtils.getMapFromList(this.f56378a));
    }
}
