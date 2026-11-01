package com.vungle.ads.internal.platform;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.c;
import lk.a0;
import nj.n;

/* JADX INFO: compiled from: DeviceCheckUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b*\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/platform/DeviceCheckUtils;", "", "()V", "getSensorCount", "", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "hasSystemAlertWindowPermission", "", "isEmulator", "isProxyEnabled", "isVpnConnected", "isEnabled", "Landroid/net/ProxyInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceCheckUtils {
    public static final DeviceCheckUtils INSTANCE = new DeviceCheckUtils();

    private DeviceCheckUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    private final boolean isEnabled(ProxyInfo proxyInfo) {
        boolean z10;
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        if (host == null) {
            z10 = false;
        } else {
            if (host.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return (z10 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !p.e(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public final int getSensorCount(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        Object systemService = context.getSystemService("sensor");
        p.h(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    public final boolean hasSystemAlertWindowPermission(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return Settings.canDrawOverlays(context);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:6:0x0014  */
    public final boolean isEmulator() {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        String lowerCase5;
        String str = Build.FINGERPRINT;
        String str2 = "";
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            p.i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase == null) {
                lowerCase = "";
            }
        } else {
            lowerCase = "";
        }
        String str3 = Build.MODEL;
        if (str3 != null) {
            lowerCase2 = str3.toLowerCase(Locale.ROOT);
            p.i(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase2 == null) {
                lowerCase2 = "";
            }
        } else {
            lowerCase2 = "";
        }
        String str4 = Build.PRODUCT;
        if (str4 != null) {
            lowerCase3 = str4.toLowerCase(Locale.ROOT);
            p.i(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase3 == null) {
                lowerCase3 = "";
            }
        } else {
            lowerCase3 = "";
        }
        String str5 = Build.BRAND;
        if (str5 != null) {
            lowerCase4 = str5.toLowerCase(Locale.ROOT);
            p.i(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase4 == null) {
                lowerCase4 = "";
            }
        } else {
            lowerCase4 = "";
        }
        String str6 = Build.MANUFACTURER;
        if (str6 != null) {
            lowerCase5 = str6.toLowerCase(Locale.ROOT);
            p.i(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase5 == null) {
                lowerCase5 = "";
            }
        } else {
            lowerCase5 = "";
        }
        String str7 = Build.BOARD;
        if (str7 != null) {
            String lowerCase6 = str7.toLowerCase(Locale.ROOT);
            p.i(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase6 != null) {
                str2 = lowerCase6;
            }
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        p.i(strArr, "SUPPORTED_ABIS");
        String lowerCase7 = n.a0(strArr, null, null, null, 0, null, null, 63, null).toLowerCase(Locale.ROOT);
        p.i(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return a0.X(lowerCase, "generic", false, 2, null) || a0.X(lowerCase, "emulator", false, 2, null) || a0.X(lowerCase2, "google_sdk", false, 2, null) || a0.X(lowerCase2, "emulator", false, 2, null) || a0.X(lowerCase3, "sdk", false, 2, null) || a0.X(lowerCase3, "vbox", false, 2, null) || a0.X(lowerCase4, "generic", false, 2, null) || a0.X(lowerCase5, "genymotion", false, 2, null) || a0.X(str2, "nox", false, 2, null) || a0.X(lowerCase7, "x86", false, 2, null);
    }

    public final boolean isProxyEnabled(Context context) {
        Object objM3458constructorimpl;
        boolean zIsEnabled;
        p.j(context, GAMConfig.KEY_CONTEXT);
        try {
            Result.a aVar = Result.Companion;
            Object systemService = context.getSystemService("connectivity");
            p.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                zIsEnabled = false;
            } else {
                p.i(activeNetwork, "cm.activeNetwork ?: return@runCatching false");
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                zIsEnabled = isEnabled(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            objM3458constructorimpl = Result.m3458constructorimpl(Boolean.valueOf(zIsEnabled));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = bool;
        }
        return ((Boolean) objM3458constructorimpl).booleanValue();
    }

    public final boolean isVpnConnected(Context context) {
        Object objM3458constructorimpl;
        p.j(context, GAMConfig.KEY_CONTEXT);
        try {
            Result.a aVar = Result.Companion;
            Object systemService = context.getSystemService("connectivity");
            p.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            p.i(allNetworks, "cm.allNetworks");
            boolean z10 = false;
            for (Network network : allNetworks) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    z10 = true;
                    break;
                }
            }
            objM3458constructorimpl = Result.m3458constructorimpl(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = bool;
        }
        return ((Boolean) objM3458constructorimpl).booleanValue();
    }
}
