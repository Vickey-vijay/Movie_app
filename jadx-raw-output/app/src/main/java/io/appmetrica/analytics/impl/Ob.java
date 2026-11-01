package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;

/* JADX INFO: loaded from: classes.dex */
public interface Ob extends LocationProvider {
    void a(Location location);

    void a(Object obj);

    void a(boolean z10);

    void b(Object obj);

    void init();
}
