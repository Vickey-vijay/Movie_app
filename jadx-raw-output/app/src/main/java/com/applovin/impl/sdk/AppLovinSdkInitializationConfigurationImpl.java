package com.applovin.impl.sdk;

import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AppLovinSdkInitializationConfigurationImpl extends AppLovinSdkInitializationConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaxSegmentCollection f9083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f9084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f9085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f9086h;

    public static class BuilderImpl implements AppLovinSdkInitializationConfiguration.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private MaxSegmentCollection f9091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f9092f = Collections.emptyList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f9093g = Collections.emptyList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f9094h = true;

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration build() {
            return new AppLovinSdkInitializationConfigurationImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getAdUnitIds() {
            return this.f9093g;
        }

        @Nullable
        public String getAxonEventKey() {
            return this.f9088b;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public String getMediationProvider() {
            return this.f9089c;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public String getPluginVersion() {
            return this.f9090d;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getSdkKey() {
            return this.f9087a;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        @Nullable
        public MaxSegmentCollection getSegmentCollection() {
            return this.f9091e;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getTestDeviceAdvertisingIds() {
            return this.f9092f;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public boolean isExceptionHandlerEnabled() {
            return this.f9094h;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(List<String> list) {
            o.e("AppLovinSdkInitializationConfiguration", "setAdUnitIds(adUnitIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        o.h("AppLovinSdkInitializationConfiguration", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f9093g = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z10) {
            o.e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
            this.f9094h = z10;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setMediationProvider(@Nullable String str) {
            o.e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + ")");
            if (str == null || (!str.isEmpty() && str.length() <= 64 && StringUtils.isAlphaNumeric(str))) {
                this.f9089c = str;
                return this;
            }
            o.h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setPluginVersion(@Nullable String str) {
            o.e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + ")");
            this.f9090d = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSdkKey(String str) {
            this.f9087a = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection) {
            o.e("AppLovinSdkInitializationConfiguration", "setSegmentCollection(segmentCollection=" + maxSegmentCollection + ")");
            this.f9091e = maxSegmentCollection;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(List<String> list) {
            o.e("AppLovinSdkInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str == null || str.length() != 36) {
                    o.h("AppLovinSdkInitializationConfiguration", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(str);
                }
            }
            this.f9092f = arrayList;
            return this;
        }

        public String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.f9087a + ", axonEventKey=" + this.f9088b + ", mediationProvider=" + this.f9089c + ", pluginVersion=" + this.f9090d + ", testDeviceAdvertisingIdentifiers=" + this.f9092f + ", adUnitIdentifiers=" + this.f9093g + ", isExceptionHandlerEnabled=" + this.f9094h + ", segmentCollection=" + this.f9091e + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
        }

        public BuilderImpl(String str, @Nullable String str2) {
            this.f9087a = str;
            this.f9088b = str2;
            o.e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }
    }

    private AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl) {
        this.f9079a = builderImpl.f9087a;
        this.f9080b = builderImpl.f9088b;
        this.f9081c = builderImpl.f9089c;
        this.f9082d = builderImpl.f9090d;
        this.f9083e = builderImpl.f9091e;
        this.f9084f = builderImpl.f9092f;
        this.f9085g = builderImpl.f9093g;
        this.f9086h = builderImpl.f9094h;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getAdUnitIds() {
        return this.f9085g;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getAxonEventKey() {
        return this.f9080b;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getMediationProvider() {
        return this.f9081c;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getPluginVersion() {
        return this.f9082d;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public String getSdkKey() {
        return this.f9079a;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    @Nullable
    public MaxSegmentCollection getSegmentCollection() {
        return this.f9083e;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f9084f;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public boolean isExceptionHandlerEnabled() {
        return this.f9086h;
    }

    public String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.f9079a + ", axonEventKey=" + this.f9080b + ", mediationProvider=" + this.f9081c + ", pluginVersion=" + this.f9082d + ", testDeviceAdvertisingIds=" + this.f9084f + ", adUnitIdentifiers=" + this.f9085g + ", isExceptionHandlerEnabled=" + this.f9086h + ", segmentCollection=" + this.f9083e + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }
}
