package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C4230h0;
import io.appmetrica.analytics.impl.C4413o5;
import io.appmetrica.analytics.impl.Fn;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ReporterConfig {

    @NonNull
    public final Map<String, Object> additionalConfig;

    @NonNull
    public final String apiKey;
    public final Map<String, String> appEnvironment;

    @Nullable
    public final Boolean dataSendingEnabled;

    @Nullable
    public final Integer dispatchPeriodSeconds;

    @Nullable
    public final Boolean logs;

    @Nullable
    public final Integer maxReportsCount;

    @Nullable
    public final Integer maxReportsInDatabaseCount;

    @Nullable
    public final Integer sessionTimeout;

    @Nullable
    public final String userProfileID;

    public static class Builder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Fn f54379l = new Fn(new C4230h0());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C4413o5 f54380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f54381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f54382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f54383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f54384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f54385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f54386g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f54387h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Integer f54388i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final HashMap f54389j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final HashMap f54390k;

        public /* synthetic */ Builder(String str, int i10) {
            this(str);
        }

        private Builder(String str) {
            this.f54389j = new HashMap();
            this.f54390k = new HashMap();
            f54379l.a(str);
            this.f54380a = new C4413o5(str);
            this.f54381b = str;
        }

        @NonNull
        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String str, @Nullable Object obj) {
            this.f54390k.put(str, obj);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f54389j.put(str, str2);
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.f54383d = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int i10) {
            this.f54385f = Integer.valueOf(this.f54380a.a(i10));
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String str) {
            this.f54386g = str;
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean z10) {
            this.f54384e = Boolean.valueOf(z10);
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int i10) {
            this.f54387h = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int i10) {
            this.f54388i = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int i10) {
            this.f54382c = Integer.valueOf(i10);
            return this;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i10) {
        this(builder);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f54381b;
        this.sessionTimeout = builder.f54382c;
        this.logs = builder.f54383d;
        this.dataSendingEnabled = builder.f54384e;
        this.maxReportsInDatabaseCount = builder.f54385f;
        this.userProfileID = builder.f54386g;
        this.dispatchPeriodSeconds = builder.f54387h;
        this.maxReportsCount = builder.f54388i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f54389j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f54390k);
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String str) {
        return new Builder(str, 0);
    }
}
