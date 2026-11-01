package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4509s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f57644a;

    public C4509s2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public C4509s2(LocationManager locationManager) {
        this.f57644a = locationManager;
    }
}
