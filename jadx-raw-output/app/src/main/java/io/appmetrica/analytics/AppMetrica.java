package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC4583v1;
import io.appmetrica.analytics.impl.C4558u1;
import io.appmetrica.analytics.impl.K0;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class AppMetrica {
    public static int getLibraryApiLevel() {
        return 116;
    }

    @NonNull
    public static String getLibraryVersion() {
        return "7.14.0";
    }

    public static void reportAppOpen(@NonNull Activity activity) {
        AbstractC4583v1.f57784a.b(activity);
    }

    public static void reportError(@NonNull String str, @Nullable String str2) {
        AbstractC4583v1.f57784a.a(str, str2, (Throwable) null);
    }

    public static void reportEvent(@NonNull String str) {
        AbstractC4583v1.f57784a.b(str);
    }

    public static void activate(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        AbstractC4583v1.f57784a.a(context, appMetricaConfig);
    }

    public static void activateReporter(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        AbstractC4583v1.f57784a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC4583v1.f57784a.a();
    }

    public static void enableActivityAutoTracking(@NonNull Application application) {
        AbstractC4583v1.f57784a.a(application);
    }

    @Nullable
    public static String getDeviceId(@NonNull Context context) {
        return AbstractC4583v1.f57784a.b();
    }

    @NonNull
    public static AppMetricaPlugins getPluginExtension() {
        return K0.f55441a;
    }

    @NonNull
    public static IReporter getReporter(@NonNull Context context, @NonNull String str) {
        return AbstractC4583v1.f57784a.a(context, str);
    }

    @Nullable
    public static String getUuid(@NonNull Context context) {
        return AbstractC4583v1.f57784a.a(context).f58084id;
    }

    @MainThread
    public static void initWebViewReporting(@NonNull WebView webView) {
        AbstractC4583v1.f57784a.a(webView);
    }

    public static void pauseSession(@Nullable Activity activity) {
        AbstractC4583v1.f57784a.a(activity);
    }

    public static void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        AbstractC4583v1.f57784a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(@NonNull String str, @Nullable String str2) {
        AbstractC4583v1.f57784a.b(str, str2);
    }

    public static void registerAnrListener(@NonNull AnrListener anrListener) {
        AbstractC4583v1.f57784a.a(anrListener);
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        AbstractC4583v1.f57784a.a(adRevenue);
    }

    public static void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        AbstractC4583v1.f57784a.a(map);
    }

    public static void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        AbstractC4583v1.f57784a.a(eCommerceEvent);
    }

    public static void reportExternalAdRevenue(@NonNull Object... objArr) {
        AbstractC4583v1.f57784a.b(objArr);
    }

    public static void reportExternalAttribution(@NonNull ExternalAttribution externalAttribution) {
        AbstractC4583v1.f57784a.a(externalAttribution);
    }

    public static void reportReferralUrl(@NonNull String str) {
        AbstractC4583v1.f57784a.d(str);
    }

    public static void reportRevenue(@NonNull Revenue revenue) {
        AbstractC4583v1.f57784a.a(revenue);
    }

    public static void reportUnhandledException(@NonNull Throwable th2) {
        AbstractC4583v1.f57784a.a(th2);
    }

    public static void reportUserProfile(@NonNull UserProfile userProfile) {
        AbstractC4583v1.f57784a.a(userProfile);
    }

    public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC4583v1.f57784a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC4583v1.f57784a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        C4558u1 c4558u1 = AbstractC4583v1.f57784a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c4558u1.a(context, startupParamsCallback, list);
    }

    public static void resumeSession(@Nullable Activity activity) {
        AbstractC4583v1.f57784a.c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC4583v1.f57784a.f();
    }

    public static void setAdvIdentifiersTracking(boolean z10) {
        AbstractC4583v1.f57784a.a(z10);
    }

    public static void setDataSendingEnabled(boolean z10) {
        AbstractC4583v1.f57784a.b(z10);
    }

    public static void setLocation(@Nullable Location location) {
        AbstractC4583v1.f57784a.a(location);
    }

    public static void setLocationTracking(boolean z10) {
        AbstractC4583v1.f57784a.c(z10);
    }

    public static void setUserProfileID(@Nullable String str) {
        AbstractC4583v1.f57784a.e(str);
    }

    public static void reportAppOpen(@NonNull Intent intent) {
        AbstractC4583v1.f57784a.a(intent);
    }

    public static void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th2) {
        AbstractC4583v1.f57784a.a(str, str2, th2);
    }

    public static void reportEvent(@NonNull String str, @Nullable String str2) {
        AbstractC4583v1.f57784a.c(str, str2);
    }

    public static void reportAppOpen(@NonNull String str) {
        AbstractC4583v1.f57784a.a(str);
    }

    public static void reportError(@NonNull String str, @Nullable Throwable th2) {
        AbstractC4583v1.f57784a.a(str, th2);
    }

    public static void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        AbstractC4583v1.f57784a.a(str, map);
    }
}
