package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class AppMetricaLibraryAdapterConfig {

    @Nullable
    public final Boolean advIdentifiersTracking;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Boolean f54352a;

        @NonNull
        public AppMetricaLibraryAdapterConfig build() {
            return new AppMetricaLibraryAdapterConfig(this, 0);
        }

        @NonNull
        public Builder withAdvIdentifiersTracking(boolean z10) {
            this.f54352a = Boolean.valueOf(z10);
            return this;
        }
    }

    public /* synthetic */ AppMetricaLibraryAdapterConfig(Builder builder, int i10) {
        this(builder);
    }

    private AppMetricaLibraryAdapterConfig(Builder builder) {
        this.advIdentifiersTracking = builder.f54352a;
    }

    public static Builder newConfigBuilder() {
        return new Builder();
    }

    @NonNull
    public String toString() {
        return "AppMetricaLibraryAdapterConfig{advIdentifiersTracking=" + this.advIdentifiersTracking + '}';
    }
}
