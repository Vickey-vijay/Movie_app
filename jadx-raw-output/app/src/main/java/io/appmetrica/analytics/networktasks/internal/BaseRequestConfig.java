package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* JADX INFO: loaded from: classes8.dex */
public class BaseRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f58251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SdkEnvironment f58252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SdkIdentifiers f58253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppSetId f58254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RetryPolicyConfig f58255e;

    public static abstract class BaseRequestArguments<I, O> implements ArgumentsMerger<I, O> {
    }

    public static abstract class ComponentLoader<T extends BaseRequestConfig, A extends BaseRequestArguments, D extends DataSource<A>> implements RequestConfigLoader<T, D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f58256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f58257b;

        @NonNull
        public abstract T createBlankConfig();

        @NonNull
        public Context getContext() {
            return this.f58256a;
        }

        @NonNull
        public String getPackageName() {
            return this.f58257b;
        }

        @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
        @NonNull
        public T load(@NonNull D d10) {
            T t10 = (T) createBlankConfig();
            t10.setSdkIdentifiers(d10.sdkIdentifiers);
            t10.setSdkEnvironment(d10.sdkEnvironmentProvider.getSdkEnvironment());
            t10.setAppSetId(d10.platformIdentifiers.getAppSetIdProvider().getAppSetId());
            t10.setPackageName(this.f58257b);
            return t10;
        }

        public ComponentLoader(@NonNull Context context, @NonNull String str) {
            this.f58256a = context;
            this.f58257b = str;
        }
    }

    public interface RequestConfigLoader<T extends BaseRequestConfig, D> {
        @NonNull
        T load(D d10);
    }

    public String getAppPlatform() {
        return "android";
    }

    @NonNull
    public synchronized String getAppSetId() {
        AppSetId appSetId;
        appSetId = this.f58254d;
        return (appSetId == null || appSetId.getId() == null) ? "" : this.f58254d.getId();
    }

    @NonNull
    public synchronized String getAppSetIdScope() {
        AppSetId appSetId;
        appSetId = this.f58254d;
        return appSetId == null ? "" : appSetId.getScope().getValue();
    }

    @NonNull
    public synchronized String getDeviceIDHash() {
        String deviceIdHash;
        deviceIdHash = "";
        SdkIdentifiers sdkIdentifiers = this.f58253c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceIdHash() != null) {
            deviceIdHash = this.f58253c.getDeviceIdHash();
        }
        return deviceIdHash;
    }

    @NonNull
    public synchronized String getDeviceId() {
        String deviceId;
        deviceId = "";
        SdkIdentifiers sdkIdentifiers = this.f58253c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceId() != null) {
            deviceId = this.f58253c.getDeviceId();
        }
        return deviceId;
    }

    public String getProtocolVersion() {
        return "2";
    }

    @NonNull
    public synchronized String getUuid() {
        String uuid;
        uuid = "";
        SdkIdentifiers sdkIdentifiers = this.f58253c;
        if (sdkIdentifiers != null && sdkIdentifiers.getUuid() != null) {
            uuid = this.f58253c.getUuid();
        }
        return uuid;
    }

    public synchronized boolean isIdentifiersValid() {
        SdkIdentifiers sdkIdentifiers;
        String uuid;
        String deviceId;
        String deviceIdHash;
        sdkIdentifiers = this.f58253c;
        return (sdkIdentifiers == null || (uuid = sdkIdentifiers.getUuid()) == null || uuid.length() == 0 || (deviceId = sdkIdentifiers.getDeviceId()) == null || deviceId.length() == 0 || (deviceIdHash = sdkIdentifiers.getDeviceIdHash()) == null || deviceIdHash.length() == 0) ? false : true;
    }

    public static class DataSource<A> {

        @NonNull
        public final A componentArguments;

        @NonNull
        public final PlatformIdentifiers platformIdentifiers;

        @NonNull
        public final SdkEnvironmentProvider sdkEnvironmentProvider;

        @NonNull
        public final SdkIdentifiers sdkIdentifiers;

        public DataSource(@NonNull SdkIdentifiers sdkIdentifiers, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, @NonNull A a10) {
            this.sdkIdentifiers = sdkIdentifiers;
            this.componentArguments = a10;
            this.sdkEnvironmentProvider = sdkEnvironmentProvider;
            this.platformIdentifiers = platformIdentifiers;
        }
    }

    public String getAnalyticsSdkBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f58252b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildNumber();
    }

    @NonNull
    public String getAnalyticsSdkBuildType() {
        SdkEnvironment sdkEnvironment = this.f58252b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildType();
    }

    public String getAnalyticsSdkVersionName() {
        SdkEnvironment sdkEnvironment = this.f58252b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkVersionName();
    }

    public String getAppBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f58252b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppBuildNumber();
    }

    @NonNull
    public String getAppFramework() {
        SdkEnvironment sdkEnvironment = this.f58252b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppFramework();
    }

    public String getAppVersion() {
        SdkEnvironment sdkEnvironment = this.f58252b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppVersionName();
    }

    @NonNull
    public String getDeviceRootStatus() {
        return ConstantDeviceInfo.DEVICE_ROOT_STATUS;
    }

    @NonNull
    public String getDeviceType() {
        SdkEnvironment sdkEnvironment = this.f58252b;
        return sdkEnvironment != null ? sdkEnvironment.getDeviceType() : "phone";
    }

    @NonNull
    public String getLocale() {
        String str;
        SdkEnvironment sdkEnvironment = this.f58252b;
        return (sdkEnvironment == null || (str = (String) CollectionUtils.getFirstOrNull(sdkEnvironment.getLocales())) == null) ? "" : str;
    }

    @NonNull
    public String getManufacturer() {
        return (String) WrapUtils.getOrDefault(ConstantDeviceInfo.MANUFACTURER, "");
    }

    @NonNull
    public String getModel() {
        return ConstantDeviceInfo.MODEL;
    }

    public int getOsApiLevel() {
        return ConstantDeviceInfo.OS_API_LEVEL;
    }

    @NonNull
    public String getOsVersion() {
        return ConstantDeviceInfo.OS_VERSION;
    }

    public String getPackageName() {
        return this.f58251a;
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f58255e;
    }

    public float getScaleFactor() {
        SdkEnvironment sdkEnvironment = this.f58252b;
        if (sdkEnvironment == null) {
            return 0.0f;
        }
        return sdkEnvironment.getScreenInfo().getScaleFactor();
    }

    public int getScreenDpi() {
        SdkEnvironment sdkEnvironment = this.f58252b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getDpi();
    }

    public int getScreenHeight() {
        SdkEnvironment sdkEnvironment = this.f58252b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getHeight();
    }

    public int getScreenWidth() {
        SdkEnvironment sdkEnvironment = this.f58252b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getWidth();
    }

    public void setAppSetId(@NonNull AppSetId appSetId) {
        this.f58254d = appSetId;
    }

    public void setPackageName(String str) {
        this.f58251a = str;
    }

    public void setRetryPolicyConfig(RetryPolicyConfig retryPolicyConfig) {
        this.f58255e = retryPolicyConfig;
    }

    public void setSdkEnvironment(@NonNull SdkEnvironment sdkEnvironment) {
        this.f58252b = sdkEnvironment;
    }

    public void setSdkIdentifiers(@Nullable SdkIdentifiers sdkIdentifiers) {
        this.f58253c = sdkIdentifiers;
    }

    public String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f58251a + "', sdkEnvironment=" + this.f58252b + ", mProtocolVersion='2', sdkIdentifiers=" + this.f58253c + ", retryPolicyConfig=" + this.f58255e + '}';
    }
}
