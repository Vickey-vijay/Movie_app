package com.safedk.android.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.i;
import com.safedk.android.utils.k;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceData implements AppLovinCommunicatorSubscriber {
    private static final String A = "is_ad_tracking_enabled";
    private static final String B = "enduser_id";
    private static final String C = "app_version_name";
    private static final String D = "app_version";
    private static final String E = "init_success";
    private static final String F = "value";
    private static final String G = "user_id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44695a = "sdk_key";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44696l = "DeviceData";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f44697m = "values";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f44698n = "operator";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f44699o = "lte";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f44700p = "gte";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f44701q = "deactivationPercentage";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f44702r = "device_type";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f44703s = "applovin_random_token";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f44704t = "device_brand";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f44705u = "device_model";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f44706v = "device_revision";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f44707w = "os_version";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f44708x = "safedk_version";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f44709y = "applovin_version";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f44710z = "from_store";
    private i H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f44711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f44712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f44713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f44714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f44715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f44716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f44717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f44718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f44719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f44720k = false;

    private enum CriteriaField {
        deviceModel,
        manufacturer,
        country,
        appVersionCode,
        androidVersion,
        osVersion,
        appDeviceIDs,
        age,
        region
    }

    private DeviceData() {
    }

    public DeviceData(final Context context, i prefs) {
        Logger.d(f44696l, "DeviceData started");
        this.H = prefs;
        this.f44711b = Build.MODEL;
        this.f44712c = Build.MANUFACTURER.toLowerCase();
        this.f44714e = Build.VERSION.SDK_INT;
        try {
            new Thread(new Runnable() { // from class: com.safedk.android.internal.DeviceData.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        DeviceData.this.f44720k = DeviceData.this.a(context);
                    } catch (Throwable th2) {
                    }
                }
            }).start();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f44715f = packageInfo.versionName;
            this.f44713d = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Logger.e(f44696l, "Error getting device data", e10);
        } catch (Throwable th2) {
            Logger.e(f44696l, "Error getting device data", th2);
        }
        AppLovinBridge.registerToReceiveSafeDKSettings(this);
        AppLovinBridge.registerToReceiveUserInfo(this);
    }

    public String a() {
        if (this.f44718i != null) {
            return this.f44718i;
        }
        if (this.H != null && this.H.n() == this.f44713d) {
            return this.H.m();
        }
        return null;
    }

    public String b() {
        if (this.f44717h != null) {
            return this.f44717h;
        }
        if (this.H != null && this.H.n() == this.f44713d) {
            return this.H.o();
        }
        return null;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        Logger.d(f44696l, "message received " + message.getMessageData());
        Bundle messageData = message.getMessageData();
        if (messageData.containsKey(E)) {
            if (this.H != null) {
                this.f44717h = messageData.getString(f44703s);
                this.f44718i = messageData.getString("sdk_key");
                this.H.a(this.f44713d, this.f44717h, this.f44718i);
                this.f44716g = messageData.getString("device_type");
                SdksMapping.setMaxAdapterVersions(messageData);
                if (Boolean.parseBoolean(messageData.getString(E))) {
                    Logger.d(f44696l, "AppLovinSdk reported success to retrieve settings");
                    SafeDK.getInstance().a(messageData, true);
                } else {
                    SafeDK.getInstance().a(true);
                    Logger.d(f44696l, "AppLovinSdk reported a failure to retrieve settings. The saved settings from a previous session will be used.");
                }
            } else {
                Logger.d(f44696l, "AppLovinSdk prefs is null");
            }
        } else if (messageData.containsKey("value")) {
            this.f44719j = messageData.getString("value");
        } else if (messageData.containsKey(G)) {
            this.f44719j = messageData.getString(G);
        }
        SafeDK.Z();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f43423a;
    }

    public static float a(String str, String str2) {
        return (Math.abs((str + str2).hashCode()) % 100000) / 1000;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("package", SafeDK.getInstance().l().getPackageName());
        bundle.putString("platform", "android");
        bundle.putString(f44703s, b());
        bundle.putString(f44709y, k.a());
        bundle.putString("safedk_version", com.safedk.android.a.f43397a);
        bundle.putString("device_type", this.f44716g);
        bundle.putString(f44705u, Build.MODEL);
        bundle.putString(f44704t, Build.MANUFACTURER);
        bundle.putString(f44706v, Build.DEVICE);
        bundle.putString("os_version", Build.VERSION.RELEASE);
        bundle.putString(D, String.valueOf(this.f44713d));
        bundle.putString("app_version_name", this.f44715f);
        SafeDK.getInstance();
        bundle.putBoolean(f44710z, SafeDK.a());
        bundle.putString(B, this.f44719j);
        bundle.putBoolean(A, this.f44720k);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo == null) {
                return false;
            }
            Logger.d(f44696l, "Ad Tracking id is " + advertisingIdInfo.getId());
            return !advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Throwable th2) {
            return false;
        }
    }
}
