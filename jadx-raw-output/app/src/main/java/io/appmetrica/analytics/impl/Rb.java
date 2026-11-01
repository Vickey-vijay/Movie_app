package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Rb extends Lambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rb f55818a = new Rb();

    public Rb() {
        super(1);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).startLocationTracking();
        return mj.r.f64562a;
    }
}
