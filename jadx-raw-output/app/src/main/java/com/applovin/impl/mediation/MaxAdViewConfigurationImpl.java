package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxAdViewConfiguration;

/* JADX INFO: loaded from: classes11.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdViewConfiguration.AdaptiveType f7998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8000c;

    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdViewConfiguration.AdaptiveType f8001a = MaxAdViewConfiguration.AdaptiveType.NONE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8002b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f8003c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f8001a;
        }

        public int getAdaptiveWidth() {
            return this.f8002b;
        }

        public int getInlineMaximumHeight() {
            return this.f8003c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.f8001a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i10) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i10 + ")");
            this.f8002b = i10;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i10) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i10 + ")");
            this.f8003c = i10;
            return this;
        }

        @NonNull
        public String toString() {
            return "MaxAdViewConfiguration.Builder{adaptiveType=" + this.f8001a + ", adaptiveWidth=" + this.f8002b + ", inlineMaximumHeight=" + this.f8003c + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
        }
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f7998a = builderImpl.f8001a;
        this.f7999b = builderImpl.f8002b;
        this.f8000c = builderImpl.f8003c;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f7998a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.f7999b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.f8000c;
    }

    @NonNull
    public String toString() {
        return "MaxAdViewConfiguration{adaptiveType=" + this.f7998a + ", adaptiveWidth=" + this.f7999b + ", inlineMaximumHeight=" + this.f8000c + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }
}
