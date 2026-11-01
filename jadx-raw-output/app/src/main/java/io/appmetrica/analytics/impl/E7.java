package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class E7 implements Ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Location f55161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f55162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f55163c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f55165e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f55168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f55169i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f55171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C4650xi f55172l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f55164d = Boolean.FALSE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f55166f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f55167g = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public List<String> f55170j = new ArrayList();

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        this.f55162b = boolValueOf;
        C4650xi c4650xi = this.f55172l;
        if (c4650xi != null) {
            c4650xi.a(boolValueOf, this.f55165e, this.f55163c, this.f55164d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void clearAppEnvironment() {
        this.f55168h = true;
        this.f55166f.clear();
    }

    public final C4333l0 j() {
        return new C4333l0(this.f55170j, this.f55168h);
    }

    public final Location k() {
        return this.f55161a;
    }

    public final Boolean l() {
        return this.f55163c;
    }

    public final Boolean m() {
        return this.f55165e;
    }

    public final Boolean n() {
        return this.f55162b;
    }

    public final boolean o() {
        return this.f55168h;
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f55166f.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void setUserProfileID(@Nullable String str) {
        this.f55169i = str;
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void setDataSendingEnabled(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        this.f55165e = boolValueOf;
        C4650xi c4650xi = this.f55172l;
        if (c4650xi != null) {
            c4650xi.a(this.f55162b, boolValueOf, this.f55163c, this.f55164d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(boolean z10, boolean z11) {
        boolean z12 = this.f55163c == null;
        boolean zBooleanValue = true ^ this.f55164d.booleanValue();
        if (z11 || z12 || zBooleanValue) {
            this.f55163c = Boolean.valueOf(z10);
            Boolean boolValueOf = Boolean.valueOf(z11);
            this.f55164d = boolValueOf;
            C4650xi c4650xi = this.f55172l;
            if (c4650xi != null) {
                c4650xi.a(this.f55162b, this.f55165e, this.f55163c, boolValueOf);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(@Nullable Location location) {
        this.f55161a = location;
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(String str, String str2) {
        this.f55167g.put(str, str2);
    }

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.f55171k) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder builderNewConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        builderNewConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        builderNewConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        builderNewConfigBuilder.withLocation(appMetricaConfig.location);
        if (mo.a(appMetricaConfig.appVersion)) {
            builderNewConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (mo.a(appMetricaConfig.dispatchPeriodSeconds)) {
            builderNewConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (mo.a(appMetricaConfig.appBuildNumber)) {
            builderNewConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (mo.a(appMetricaConfig.maxReportsCount)) {
            builderNewConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (mo.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (mo.a(appMetricaConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (mo.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (mo.a(appMetricaConfig.crashReporting)) {
            builderNewConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (mo.a(appMetricaConfig.nativeCrashReporting)) {
            builderNewConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (mo.a(appMetricaConfig.locationTracking)) {
            builderNewConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (mo.a(appMetricaConfig.advIdentifiersTracking)) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (mo.a(appMetricaConfig.firstActivationAsUpdate)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (mo.a(appMetricaConfig.dataSendingEnabled)) {
            builderNewConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (mo.a(appMetricaConfig.anrMonitoring)) {
            builderNewConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (mo.a(appMetricaConfig.anrMonitoringTimeout)) {
            builderNewConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (mo.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (mo.a(appMetricaConfig.crashTransformer)) {
            builderNewConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (mo.a(appMetricaConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (mo.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (mo.a(appMetricaConfig.appOpenTrackingEnabled)) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (mo.a((Object) appMetricaConfig.customHosts)) {
            builderNewConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f55166f;
        if (!mo.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!mo.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                builderNewConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f55167g;
        if (!mo.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!mo.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!mo.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                builderNewConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f55162b;
        if (appMetricaConfig.locationTracking == null && mo.a(bool)) {
            builderNewConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f55161a;
        if (appMetricaConfig.location == null && mo.a(location)) {
            builderNewConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f55165e;
        if (appMetricaConfig.dataSendingEnabled == null && mo.a(bool2)) {
            builderNewConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!mo.a(appMetricaConfig.userProfileID) && mo.a(this.f55169i)) {
            builderNewConfigBuilder.withUserProfileID(this.f55169i);
        }
        Boolean bool3 = this.f55163c;
        if (appMetricaConfig.advIdentifiersTracking == null && mo.a(bool3)) {
            builderNewConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f55171k = true;
        this.f55161a = null;
        this.f55162b = null;
        this.f55163c = null;
        this.f55164d = Boolean.FALSE;
        this.f55165e = null;
        this.f55166f.clear();
        this.f55167g.clear();
        this.f55168h = false;
        this.f55169i = null;
        return builderNewConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(@NonNull String str) {
        this.f55170j.add(str);
    }

    public final void a(C4650xi c4650xi) {
        Boolean bool = this.f55162b;
        if (bool != null || this.f55165e != null || this.f55163c != null) {
            c4650xi.a(bool, this.f55165e, this.f55163c, this.f55164d);
        }
        this.f55172l = c4650xi;
    }
}
