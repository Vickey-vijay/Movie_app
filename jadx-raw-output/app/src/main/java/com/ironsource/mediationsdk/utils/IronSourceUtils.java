package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.B7;
import com.ironsource.C3379ab;
import com.ironsource.C3399bd;
import com.ironsource.C3521i9;
import com.ironsource.C3676r4;
import com.ironsource.Lb;
import com.ironsource.N6;
import com.ironsource.T9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.c;
import com.ironsource.mediationsdk.r;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class IronSourceUtils {
    private static int A = 1;
    private static AtomicBoolean B = new AtomicBoolean(false);
    private static String C = null;
    private static Boolean D = null;
    private static IronSourceUtils E = new IronSourceUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f30087a = "default_is_events_formatter_type";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30088b = "default_is_events_url";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f30089c = "default_is_non_connectivity_events";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30090d = "default_is_opt_in_events";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30091e = "default_is_opt_out_events";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f30092f = "default_is_trigger_events";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f30093g = "default_rv_events_formatter_type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f30094h = "default_rv_events_url";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f30095i = "default_rv_non_connectivity_events";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f30096j = "default_rv_opt_in_events";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f30097k = "default_rv_opt_out_events";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f30098l = "default_rv_trigger_events";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f30099m = "default_pxl_events_url";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f30100n = "default_pxl_trigger_events";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f30101o = "default_app_opt_in_events";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f30102p = "default_app_opt_out_events";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f30103q = "default_app_events_url";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f30104r = "default_app_trigger_events";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f30105s = "default_app_events_formatter_type";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f30106t = "default_app_non_connectivity_events";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f30107u = "general_properties";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f30108v = "last_response";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f30109w = "firstSessionTimestamp";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f30110x = "providerPriority";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f30111y = "9.2.0";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f30112z = "Mediation_Shared_Preferences";

    public static String a(long j10, String str) {
        return h(String.format("%s%s%s", Long.valueOf(j10), r.m().n(), str));
    }

    public static IronSourceUtils b() {
        return E;
    }

    private static String c(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return f30087a;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str) || IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return f30093g;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f30105s : "";
    }

    private static String d(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return f30089c;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return f30095i;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f30106t : "";
    }

    private static String e(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return f30090d;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return f30096j;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f30101o : "";
    }

    private static String f(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return f30091e;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return f30097k;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f30102p : "";
    }

    public static boolean g() {
        return A == 1;
    }

    @Deprecated
    public static String getSDKVersion() {
        return "9.2.0";
    }

    private static String b(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return f30088b;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return f30094h;
        }
        if (IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return f30099m;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f30103q : "";
    }

    private static String g(String str) {
        if (IronSourceConstants.INTERSTITIAL_EVENT_TYPE.equals(str)) {
            return f30092f;
        }
        if (IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE.equals(str)) {
            return f30098l;
        }
        if (IronSourceConstants.PIXEL_EVENT_TYPE.equals(str)) {
            return f30100n;
        }
        return IronSourceConstants.APP_EVENT_TYPE.equals(str) ? f30104r : "";
    }

    private static Map<LevelPlay.AdFormat, Map<String, JSONObject>> getAdUnitIds() {
        HashMap map = new HashMap();
        try {
            C3379ab c3379abA = Lb.U().e().a();
            if (c3379abA == null) {
                return map;
            }
            for (LevelPlay.AdFormat adFormat : LevelPlay.AdFormat.values()) {
                HashMap map2 = new HashMap();
                map.put(adFormat, map2);
                for (String str : c3379abA.a(adFormat)) {
                    if (!str.equals("external")) {
                        map2.put(str, IronSourceVideoBridge.jsonObjectInit());
                    }
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("failed to get ad unit ids - exception = " + e10);
        }
        return map;
    }

    public static String h(String str) {
        try {
            return String.format("%064x", new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException e10) {
            C3676r4.d().a(e10);
            if (str == null) {
                IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:null)", e10);
                return "";
            }
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getSHA256(input:" + str + ")", e10);
            return "";
        }
    }

    public static synchronized void i(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str, 0);
    }

    private static void setSerr(int i10) {
        A = i10;
    }

    public static String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "wifi";
            }
            return networkCapabilities.hasTransport(0) ? "cellular" : "none";
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.NATIVE.error("failed to connection type - exception = " + e10);
            return "none";
        }
    }

    public static synchronized void d(Context context, String str, int[] iArr) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f30112z, 0).edit();
            String string = null;
            if (iArr != null) {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 : iArr) {
                    sb2.append(i10);
                    sb2.append(StringUtils.COMMA);
                }
                string = sb2.toString();
            }
            editorEdit.putString(g(str), string);
            editorEdit.apply();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultTriggerEvents(eventType: " + str + ", triggerEvents:" + iArr + ")", e10);
        }
    }

    public static synchronized void e(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f30112z, 0).edit();
            editorEdit.putString(b(str), str2);
            editorEdit.apply();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsURL(eventType: " + str + ", eventsUrl:" + str2 + ")", e10);
        }
    }

    public static void f(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f30112z, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static synchronized void c(Context context, String str, int[] iArr) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f30112z, 0).edit();
            String string = null;
            if (iArr != null) {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 : iArr) {
                    sb2.append(i10);
                    sb2.append(StringUtils.COMMA);
                }
                string = sb2.toString();
            }
            editorEdit.putString(f(str), string);
            editorEdit.apply();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptOutEvents(eventType: " + str + ", optOutEvents:" + iArr + ")", e10);
        }
    }

    public static synchronized void b(Context context, String str, int[] iArr) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f30112z, 0).edit();
            String string = null;
            if (iArr != null) {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 : iArr) {
                    sb2.append(i10);
                    sb2.append(StringUtils.COMMA);
                }
                string = sb2.toString();
            }
            editorEdit.putString(e(str), string);
            editorEdit.apply();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultOptInEvents(eventType: " + str + ", optInEvents:" + iArr + ")", e10);
        }
    }

    public static boolean g(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.NATIVE.error("failed to check if network is connected - exception = " + e10);
            return false;
        }
    }

    public static String f() {
        String strA = N6.a().a("userId");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return strA;
    }

    public static boolean f(Context context) {
        return C3399bd.e(context);
    }

    public static void a(Runnable runnable, String str) {
        Thread thread = new Thread(runnable, str);
        thread.setUncaughtExceptionHandler(new c());
        thread.start();
    }

    public static synchronized void e(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f30112z, 0).edit();
        editorEdit.putString(f30108v, str);
        editorEdit.apply();
    }

    public static synchronized void a(Context context, String str, int[] iArr) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f30112z, 0).edit();
            String string = null;
            if (iArr != null) {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 : iArr) {
                    sb2.append(i10);
                    sb2.append(StringUtils.COMMA);
                }
                string = sb2.toString();
            }
            editorEdit.putString(d(str), string);
            editorEdit.apply();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultNonConnectivityEvents(eventType: " + str + ", nonConnectivityEvents:" + iArr + ")", e10);
        }
    }

    public static String e(Context context) {
        return context.getSharedPreferences(f30112z, 0).getString(f30108v, "");
    }

    public static synchronized void d(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(f30112z, 0).edit();
            editorEdit.putString(c(str), str2);
            editorEdit.apply();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:saveDefaultEventsFormatterType(eventType: " + str + ", formatterType:" + str2 + ")", e10);
        }
    }

    public static synchronized int[] c(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            String string = context.getSharedPreferences(f30112z, 0).getString(f(str), null);
            if (!TextUtils.isEmpty(string)) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, StringUtils.COMMA);
                ArrayList arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptOutEvents(eventType: " + str + ")", e10);
        }
        return iArr;
    }

    public static long e() {
        return System.currentTimeMillis();
    }

    public static synchronized String b(Context context, String str, String str2) {
        try {
            str2 = context.getSharedPreferences(f30112z, 0).getString(b(str), str2);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsURL(eventType: " + str + ", defaultEventsURL:" + str2 + ")", e10);
        }
        return str2;
    }

    public static synchronized int[] b(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            String string = context.getSharedPreferences(f30112z, 0).getString(e(str), null);
            if (!TextUtils.isEmpty(string)) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, StringUtils.COMMA);
                ArrayList arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultOptInEvents(eventType: " + str + ")", e10);
        }
        return iArr;
    }

    public static synchronized int[] d(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            String string = context.getSharedPreferences(f30112z, 0).getString(g(str), null);
            if (!TextUtils.isEmpty(string)) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, StringUtils.COMMA);
                ArrayList arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultTriggerEvents(eventType: " + str + ")", e10);
        }
        return iArr;
    }

    public static synchronized String a(Context context, String str, String str2) {
        try {
            str2 = context.getSharedPreferences(f30112z, 0).getString(c(str), str2);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultEventsFormatterType(eventType: " + str + ", defaultFormatterType:" + str2 + ")", e10);
        }
        return str2;
    }

    public static String c(Context context, String str, String str2) {
        return context.getSharedPreferences(f30112z, 0).getString(str, str2);
    }

    public static boolean c(Context context) {
        if (D == null) {
            D = Boolean.valueOf(!C3521i9.a(context));
        }
        return D.booleanValue();
    }

    public static synchronized int[] a(Context context, String str) {
        int[] iArr;
        iArr = null;
        try {
            String string = context.getSharedPreferences(f30112z, 0).getString(d(str), null);
            if (!TextUtils.isEmpty(string)) {
                StringTokenizer stringTokenizer = new StringTokenizer(string, StringUtils.COMMA);
                ArrayList arrayList = new ArrayList();
                while (stringTokenizer.hasMoreTokens()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                }
                int size = arrayList.size();
                iArr = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "IronSourceUtils:getDefaultNonConnectivityEvents(eventType: " + str + ")", e10);
        }
        return iArr;
    }

    public static String c() {
        return N6.a().a("userId");
    }

    public static JSONObject b(boolean z10) {
        return a(z10, false, 1);
    }

    public static void b(Context context, String str, boolean z10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f30112z, 0).edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }

    public static synchronized String d() {
        if (B.compareAndSet(false, true)) {
            C = UUID.randomUUID().toString();
        }
        return C;
    }

    public static T9 d(Context context) {
        String str;
        B7 b7I = Lb.U().i();
        if (context == null) {
            return null;
        }
        String strB = r.m().b(context);
        if (TextUtils.isEmpty(strB)) {
            strB = b7I.M(context);
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 0);
            str = IronSourceConstants.TYPE_UUID;
        } else {
            str = IronSourceConstants.TYPE_GAID;
        }
        return new T9(strB, str);
    }

    public static void b(Context context, String str, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f30112z, 0).edit();
        editorEdit.putInt(str, i10);
        editorEdit.apply();
    }

    public static JSONObject a(boolean z10) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z10) {
                jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, "dynamic");
            }
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
        }
        return jSONObjectJsonObjectInit;
    }

    public static void b(Context context, String str, long j10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(f30112z, 0).edit();
        editorEdit.putLong(str, j10);
        editorEdit.apply();
    }

    public static JSONObject a(String str, List<String> list, List<String> list2) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i10 < list.size() && i11 < list2.size(); i11++) {
                String str2 = list.get(i10);
                String str3 = list2.get(i11);
                if (!TextUtils.isEmpty(str3) && !str2.equals(str3)) {
                    str2 = str2 + ";" + str3;
                }
                arrayList.add(str2);
                i10++;
            }
            jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, str + ";" + TextUtils.join(StringUtils.COMMA, arrayList));
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
        }
        return jSONObjectJsonObjectInit;
    }

    public static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (jSONObject == null && jSONObject2 == null) {
                return IronSourceVideoBridge.jsonObjectInit();
            }
            if (jSONObject == null) {
                return jSONObject2;
            }
            if (jSONObject2 == null) {
                return jSONObject;
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
            return jSONObject;
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public static Map<String, String> b(JSONObject jSONObject) {
        HashMap map = new HashMap();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        map.put(next, jSONObject.get(next).toString());
                    }
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return map;
    }

    public static JSONObject a(boolean z10, boolean z11, int i10) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (z10) {
                jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            }
            if (z11 && i10 != -1) {
                jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_PROGRAMMATIC, i10);
            }
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
        }
        return jSONObjectJsonObjectInit;
    }

    public static String b(Context context) {
        return Lb.U().i().a(context) ? "Tablet" : "Phone";
    }

    public static boolean a(Context context, String str, boolean z10) {
        return context.getSharedPreferences(f30112z, 0).getBoolean(str, z10);
    }

    public static int a(Context context, String str, int i10) {
        return context.getSharedPreferences(f30112z, 0).getInt(str, i10);
    }

    public static long a(Context context, String str, long j10) {
        return context.getSharedPreferences(f30112z, 0).getLong(str, j10);
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(jSONObject.toString());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            if ((obj instanceof JSONObject) && jSONObjectJsonObjectInit.optJSONObject(next) != null) {
                jSONObjectJsonObjectInit.put(next, a(jSONObjectJsonObjectInit.getJSONObject(next), (JSONObject) obj));
            } else {
                jSONObjectJsonObjectInit.put(next, obj);
            }
        }
        return jSONObjectJsonObjectInit;
    }

    public static List<Pair<String, String>> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject != JSONObject.NULL) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.get(next).toString().isEmpty()) {
                        arrayList.add(new Pair(next, jSONObject.get(next).toString()));
                    }
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return arrayList;
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a() {
        try {
            return new Throwable().getStackTrace()[1].getMethodName();
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            return "";
        }
    }
}
