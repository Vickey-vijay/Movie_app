package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.mo;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class AdRevenue {

    @Nullable
    public final String adNetwork;

    @Nullable
    public final String adPlacementId;

    @Nullable
    public final String adPlacementName;

    @NonNull
    public final BigDecimal adRevenue;

    @Nullable
    public final AdType adType;

    @Nullable
    public final String adUnitId;

    @Nullable
    public final String adUnitName;

    @NonNull
    public final Currency currency;

    @Nullable
    public final Map<String, String> payload;

    @Nullable
    public final String precision;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BigDecimal f54313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Currency f54314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AdType f54315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f54316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f54317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f54318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f54319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f54320h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f54321i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Map f54322j;

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i10) {
            this(bigDecimal, currency);
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f54313a = bigDecimal;
            this.f54314b = currency;
        }

        public AdRevenue build() {
            return new AdRevenue(this.f54313a, this.f54314b, this.f54315c, this.f54316d, this.f54317e, this.f54318f, this.f54319g, this.f54320h, this.f54321i, this.f54322j, 0);
        }

        public Builder withAdNetwork(@Nullable String str) {
            this.f54316d = str;
            return this;
        }

        public Builder withAdPlacementId(@Nullable String str) {
            this.f54319g = str;
            return this;
        }

        public Builder withAdPlacementName(@Nullable String str) {
            this.f54320h = str;
            return this;
        }

        public Builder withAdType(@Nullable AdType adType) {
            this.f54315c = adType;
            return this;
        }

        public Builder withAdUnitId(@Nullable String str) {
            this.f54317e = str;
            return this;
        }

        public Builder withAdUnitName(@Nullable String str) {
            this.f54318f = str;
            return this;
        }

        public Builder withPayload(@Nullable Map<String, String> map) {
            this.f54322j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(@Nullable String str) {
            this.f54321i = str;
            return this;
        }
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i10) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(@NonNull BigDecimal bigDecimal, @NonNull Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j10, @NonNull Currency currency) {
        return new Builder(mo.a(j10), currency, 0);
    }

    public static Builder newBuilder(double d10, @NonNull Currency currency) {
        return new Builder(new BigDecimal(mo.a(d10)), currency, 0);
    }
}
