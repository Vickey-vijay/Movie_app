package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bundle f43947a = new Bundle();

    public boolean a(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f43947a.containsKey(adNetworkConfiguration.name());
    }

    public boolean b(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f43947a.getBoolean(adNetworkConfiguration.name());
    }

    public boolean a(AdNetworkConfiguration adNetworkConfiguration, boolean z10) {
        return this.f43947a.getBoolean(adNetworkConfiguration.name(), z10);
    }

    public String c(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f43947a.getString(adNetworkConfiguration.name());
    }

    public String a(AdNetworkConfiguration adNetworkConfiguration, String str) {
        return this.f43947a.getString(adNetworkConfiguration.name(), str);
    }

    public float d(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f43947a.getFloat(adNetworkConfiguration.name());
    }

    public long e(AdNetworkConfiguration adNetworkConfiguration) {
        return this.f43947a.getLong(adNetworkConfiguration.name());
    }

    public void b(AdNetworkConfiguration adNetworkConfiguration, boolean z10) {
        this.f43947a.putBoolean(adNetworkConfiguration.name(), z10);
    }

    public void b(AdNetworkConfiguration adNetworkConfiguration, String str) {
        this.f43947a.putString(adNetworkConfiguration.name(), str);
    }

    public void a(AdNetworkConfiguration adNetworkConfiguration, float f10) {
        this.f43947a.putFloat(adNetworkConfiguration.name(), f10);
    }

    public void a(AdNetworkConfiguration adNetworkConfiguration, long j10) {
        this.f43947a.putLong(adNetworkConfiguration.name(), j10);
    }

    public String toString() {
        return this.f43947a.toString();
    }
}
