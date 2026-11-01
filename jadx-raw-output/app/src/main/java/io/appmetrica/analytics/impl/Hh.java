package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Hh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f55310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f55311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4248hi f55312c;

    public Hh(C4248hi c4248hi, String str, List list) {
        this.f55312c = c4248hi;
        this.f55310a = str;
        this.f55311b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4248hi c4248hi = this.f55312c;
        C4248hi.a(c4248hi.f56907a, c4248hi.f56910d, c4248hi.f56911e).reportEvent(this.f55310a, CollectionUtils.getMapFromList(this.f55311b));
    }
}
