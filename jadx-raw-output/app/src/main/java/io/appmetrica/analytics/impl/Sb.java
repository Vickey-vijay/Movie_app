package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class Sb extends Lambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Sb f55861a = new Sb();

    public Sb() {
        super(1);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return mj.r.f64562a;
    }
}
