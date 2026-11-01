package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4437p4 implements ArgumentsMerger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f57475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Boolean f57476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Location f57477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Boolean f57478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f57479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Integer f57480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Integer f57481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Boolean f57482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Boolean f57483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f57484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Integer f57485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Boolean f57486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Boolean f57487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Boolean f57488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final Set<String> f57489o;

    public C4437p4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.f57475a = str;
        this.f57476b = bool;
        this.f57477c = location;
        this.f57478d = bool2;
        this.f57479e = num;
        this.f57480f = num2;
        this.f57481g = num3;
        this.f57482h = bool3;
        this.f57483i = bool4;
        this.f57484j = map;
        this.f57485k = num4;
        this.f57486l = bool5;
        this.f57487m = bool6;
        this.f57488n = bool7;
        this.f57489o = set;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C4437p4.class != obj.getClass()) {
            return false;
        }
        C4437p4 c4437p4 = (C4437p4) obj;
        return Objects.equals(this.f57475a, c4437p4.f57475a) && Objects.equals(this.f57476b, c4437p4.f57476b) && Objects.equals(this.f57477c, c4437p4.f57477c) && Objects.equals(this.f57478d, c4437p4.f57478d) && Objects.equals(this.f57479e, c4437p4.f57479e) && Objects.equals(this.f57480f, c4437p4.f57480f) && Objects.equals(this.f57481g, c4437p4.f57481g) && Objects.equals(this.f57482h, c4437p4.f57482h) && Objects.equals(this.f57483i, c4437p4.f57483i) && Objects.equals(this.f57484j, c4437p4.f57484j) && Objects.equals(this.f57485k, c4437p4.f57485k) && Objects.equals(this.f57486l, c4437p4.f57486l) && Objects.equals(this.f57487m, c4437p4.f57487m) && Objects.equals(this.f57488n, c4437p4.f57488n) && Objects.equals(this.f57489o, c4437p4.f57489o);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4437p4 mergeFrom(@NonNull C4437p4 c4437p4) {
        return new C4437p4((String) WrapUtils.getOrDefaultNullable(this.f57475a, c4437p4.f57475a), (Boolean) WrapUtils.getOrDefaultNullable(this.f57476b, c4437p4.f57476b), (Location) WrapUtils.getOrDefaultNullable(this.f57477c, c4437p4.f57477c), (Boolean) WrapUtils.getOrDefaultNullable(this.f57478d, c4437p4.f57478d), (Integer) WrapUtils.getOrDefaultNullable(this.f57479e, c4437p4.f57479e), (Integer) WrapUtils.getOrDefaultNullable(this.f57480f, c4437p4.f57480f), (Integer) WrapUtils.getOrDefaultNullable(this.f57481g, c4437p4.f57481g), (Boolean) WrapUtils.getOrDefaultNullable(this.f57482h, c4437p4.f57482h), (Boolean) WrapUtils.getOrDefaultNullable(this.f57483i, c4437p4.f57483i), (Map) WrapUtils.getOrDefaultNullable(this.f57484j, c4437p4.f57484j), (Integer) WrapUtils.getOrDefaultNullable(this.f57485k, c4437p4.f57485k), (Boolean) WrapUtils.getOrDefaultNullable(this.f57486l, c4437p4.f57486l), (Boolean) WrapUtils.getOrDefaultNullable(this.f57487m, c4437p4.f57487m), (Boolean) WrapUtils.getOrDefaultNullable(this.f57488n, c4437p4.f57488n), CollectionUtils.merge(this.f57489o, c4437p4.f57489o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return equals((C4437p4) obj);
    }

    public final int hashCode() {
        return Objects.hash(this.f57475a, this.f57476b, this.f57477c, this.f57478d, this.f57479e, this.f57480f, this.f57481g, this.f57482h, this.f57483i, this.f57484j, this.f57485k, this.f57486l, this.f57487m, this.f57488n, this.f57489o);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f57475a + "', locationTracking=" + this.f57476b + ", manualLocation=" + this.f57477c + ", firstActivationAsUpdate=" + this.f57478d + ", sessionTimeout=" + this.f57479e + ", maxReportsCount=" + this.f57480f + ", dispatchPeriod=" + this.f57481g + ", logEnabled=" + this.f57482h + ", dataSendingEnabled=" + this.f57483i + ", clidsFromClient=" + this.f57484j + ", maxReportsInDbCount=" + this.f57485k + ", nativeCrashesEnabled=" + this.f57486l + ", revenueAutoTrackingEnabled=" + this.f57487m + ", advIdentifiersTrackingEnabled=" + this.f57488n + ", autoCollectedDataSubscribers=" + this.f57489o + '}';
    }

    public final boolean a(@NonNull C4437p4 c4437p4) {
        return equals(c4437p4);
    }

    public C4437p4(@NonNull CounterConfiguration counterConfiguration, @Nullable Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public C4437p4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }
}
