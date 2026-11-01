package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class AdvertisingIdsHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f54638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f54639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f54640c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    public AdvertisingIdsHolder(@NonNull AdTrackingInfoResult adTrackingInfoResult, @NonNull AdTrackingInfoResult adTrackingInfoResult2, @NonNull AdTrackingInfoResult adTrackingInfoResult3) {
        this.f54638a = adTrackingInfoResult;
        this.f54639b = adTrackingInfoResult2;
        this.f54640c = adTrackingInfoResult3;
    }

    @NonNull
    public AdTrackingInfoResult getGoogle() {
        return this.f54638a;
    }

    @NonNull
    public AdTrackingInfoResult getHuawei() {
        return this.f54639b;
    }

    @NonNull
    public AdTrackingInfoResult getYandex() {
        return this.f54640c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f54638a + ", mHuawei=" + this.f54639b + ", yandex=" + this.f54640c + '}';
    }
}
