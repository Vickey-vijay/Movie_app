package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class K7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f55456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55458c;

    public final String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.f55456a + ", mDeeplink='" + this.f55457b + "', mUnparsedReferrer='" + this.f55458c + "'}";
    }

    public K7(String str, HashMap map, String str2) {
        this.f55457b = str;
        this.f55456a = map;
        this.f55458c = str2;
    }
}
