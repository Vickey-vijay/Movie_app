package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3372a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28089a = "NETWORK_TYPE_WIFI";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f28090b = "NETWORK_TYPE_VPN";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f28091c = "NETWORK_TYPE_ETHERNET";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f28092d = "NETWORK_TYPE_UNKNOWN";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f28093e = "notReachable";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f28094f = "PHONE_TYPE_NONE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f28095g = "NETWORK_TYPE_GPRS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f28096h = "NETWORK_TYPE_EDGE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f28097i = "NETWORK_TYPE_UMTS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f28098j = "NETWORK_TYPE_CDMA";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f28099k = "NETWORK_TYPE_EVDO_0";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f28100l = "NETWORK_TYPE_EVDO_A";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f28101m = "NETWORK_TYPE_1xRTT";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f28102n = "NETWORK_TYPE_HSDPA";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f28103o = "NETWORK_TYPE_HSUPA";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f28104p = "NETWORK_TYPE_HSPA";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f28105q = "NETWORK_TYPE_IDEN";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f28106r = "NETWORK_TYPE_EVDO_B";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f28107s = "NETWORK_TYPE_LTE";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f28108t = "NETWORK_TYPE_EHRPD";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f28109u = "NETWORK_TYPE_HSPAP";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f28110v = "NETWORK_TYPE_GSM";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f28111w = "NETWORK_TYPE_TD_SCDMA";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f28112x = "NETWORK_TYPE_IWLAN";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f28113y = "NETWORK_TYPE_LTE_CA";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f28114z = "NETWORK_TYPE_NR";

    private static String a(int i10) {
        switch (i10) {
            case 0:
                return f28094f;
            case 1:
                return f28095g;
            case 2:
                return f28096h;
            case 3:
                return f28097i;
            case 4:
                return f28098j;
            case 5:
                return f28099k;
            case 6:
                return f28100l;
            case 7:
                return f28101m;
            case 8:
                return f28102n;
            case 9:
                return f28103o;
            case 10:
                return f28104p;
            case 11:
                return f28105q;
            case 12:
                return f28106r;
            case 13:
                return f28107s;
            case 14:
                return f28108t;
            case 15:
                return f28109u;
            case 16:
                return f28110v;
            case 17:
                return f28111w;
            case 18:
                return f28112x;
            case 19:
                return f28113y;
            case 20:
                return f28114z;
            default:
                return f28092d;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String a(Network network, Context context) {
        String strC;
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                return c(context);
            }
            if (networkCapabilities.hasTransport(1)) {
                strC = "wifi";
            } else {
                strC = networkCapabilities.hasTransport(0) ? Z3.f27966a : c(context);
            }
            return strC;
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "none";
        }
    }

    public static String b(Context context) {
        return a(a(context), context);
    }

    @SuppressLint({"MissingPermission"})
    private static String b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network != null && context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return Z3.f27970e;
                }
                if (networkCapabilities.hasTransport(5)) {
                    return Z3.f27973h;
                }
                if (networkCapabilities.hasTransport(6)) {
                    return Z3.f27974i;
                }
                if (networkCapabilities.hasTransport(2)) {
                    return Z3.f27969d;
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return "";
    }

    public static String d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            Network networkA = a(connectivityManager);
            if (networkA == null) {
                return f28093e;
            }
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkA);
                if (networkCapabilities == null) {
                    return f28092d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return f28089a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return a(activeNetworkInfo.getSubtype());
                }
            } catch (Throwable th2) {
                C3676r4.d().a(th2);
                IronLog.INTERNAL.error("Error getting network capabilities: " + th2);
            }
        }
        return f28092d;
    }

    private static String c(Context context) {
        String strA = Z3.a(context);
        if (TextUtils.isEmpty(strA)) {
            return "none";
        }
        return strA;
    }

    public static boolean e(Context context) {
        return b(context, a(context)).equals("vpn");
    }

    @SuppressLint({"MissingPermission"})
    public static Network a(Context context) {
        if (context == null) {
            return null;
        }
        return a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    @SuppressLint({"MissingPermission"})
    public static JSONObject a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return IronSourceVideoBridge.jsonObjectInit();
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObjectJsonObjectInit.put(Y3.f27897a, networkCapabilities.toString());
                    jSONObjectJsonObjectInit.put(Y3.f27898b, networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObjectJsonObjectInit.put(Y3.f27899c, networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObjectJsonObjectInit.put("hasVPN", e(context));
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
        return jSONObjectJsonObjectInit;
    }

    @Nullable
    private static Network a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            return null;
        }
    }
}
