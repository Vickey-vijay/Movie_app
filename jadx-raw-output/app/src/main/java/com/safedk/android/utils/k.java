package com.safedk.android.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.webkit.WebView;
import androidx.appcompat.widget.ActivityChooserModel;
import com.applovin.mediation.ads.MaxAdView;
import com.google.android.material.badge.BadgeDrawable;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45008a = "UNKNOWN_PROCESS";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f45009b = "Accept";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f45010c = "text:";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f45011d = "java.lang.String";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f45013f = "Utils";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f45014g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f45016i = "com.applovin.sdk.AppLovinSdk";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f45017j = "VERSION";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f45018k = "video/";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f45023p = "https://www.youtube.com/watch?v=";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static String f45026s = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f45030w = "market://details?id=";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f45031x = "amzn://apps/android?p=";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f45032y = "samsungapps://ProductDetail/";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f45033z = "http://play.google.com/store/apps/details?id=";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f45015h = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f45019l = {"jpg", "jpeg", "gif", "png", "mp4", "m4v", "js", "css", CreativeInfo.f44315al, "mkv", "3gp", "3gpp", "webm", "mp3", "htm", "svg", "3g2", "avi", "mpg", "mpeg", "mov", DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "zip", "webp", "raw"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final HashSet<String> f45020m = new HashSet<>(Arrays.asList(f45019l));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f45021n = {"image"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final HashSet<String> f45022o = new HashSet<>(Arrays.asList(f45021n));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final List<String> f45024q = Arrays.asList("gif", "jpg", "jpeg", "png", "bmp");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final List<String> f45025r = Arrays.asList("mp4", "m4v", "webm", "avi", "mpg", "mpeg", "mov", DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "3gp", "3gpp");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static Map<String, String> f45012e = new HashMap<String, String>() { // from class: com.safedk.android.utils.Utils$1
        {
            put("sms", "SMS MMS");
            put("calllog", "Call Log");
            put("packagemanager", "User Apps");
            put("advertising_identifier", "Identifier for Advertising");
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String[] f45027t = {"expire", "ei", "sig", "lsig", Q6.f27414a1, "lmt", "cpn"};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String[] f45028u = {"mp4", "m4v", "mkv", "3gp", "3gpp", "webm", "mov", "webp"};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String[] f45029v = {"jpg", "jpeg", "gif", "png", "mp4", "m4v", "mkv", "3gp", "3gpp", "webm", "mp3", "htm", "js", "css", CreativeInfo.f44315al, "svg", "3g2", "avi", "mpg", "mpeg", "mov", DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "zip", "webp"};
    private static final Map<String, String> A = new HashMap();

    static {
        A.put(f45030w, "https://play.google.com/store/apps/details?id=");
        A.put(f45031x, "https://www.amazon.com/gp/mas/dl/android?p=");
        A.put(f45032y, "https://www.samsungapps.com/appquery/appDetail.as?appId=");
        A.put(f45033z, f45033z);
    }

    public static String a() {
        if (f45026s == null) {
            f45026s = a(f45016i, f45017j);
        }
        return f45026s;
    }

    public static Object a(Object obj, String str) {
        Object obj2 = null;
        try {
            Field fieldA = a((Class) obj.getClass(), str);
            fieldA.setAccessible(true);
            obj2 = fieldA.get(obj);
            Logger.d("reflection", str + " = " + obj2);
            return obj2;
        } catch (NoSuchFieldException e10) {
            Logger.w(f45013f, "Failed to get reflection field:" + str);
            return obj2;
        } catch (Exception e11) {
            Logger.e(f45013f, "Failed to get reflection field value", e11);
            return obj2;
        }
    }

    private static Field a(Class cls, String str) throws NoSuchFieldException {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                throw e10;
            }
            return a(superclass, str);
        }
    }

    public static String a(String str, String str2) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField(str2);
            declaredField.setAccessible(true);
            return declaredField.isAccessible() ? (String) declaredField.get(null) : "";
        } catch (ClassNotFoundException e10) {
            Logger.d(f45013f, "Error retrieving field value. Class name :" + str + ", field name :" + str2, e10);
            return null;
        } catch (IllegalAccessException e11) {
            Logger.e(f45013f, "Error retrieving field value. Class name :" + str + ", field name :" + str2, e11);
            return null;
        } catch (IllegalArgumentException e12) {
            Logger.e(f45013f, "Error retrieving field value. Class name :" + str + ", field name :" + str2, e12);
            return null;
        } catch (NoSuchFieldException e13) {
            Logger.e(f45013f, "Error retrieving field value. Class name :" + str + ", field name :" + str2, e13);
            return null;
        } catch (SecurityException e14) {
            Logger.e(f45013f, "Error retrieving field value. Class name :" + str + ", field name :" + str2, e14);
            return null;
        }
    }

    public static Object b(Object obj, String str) {
        Object objInvoke = null;
        try {
            Method method = obj.getClass().getMethod(str, new Class[0]);
            method.setAccessible(true);
            objInvoke = method.invoke(obj, new Object[0]);
            Logger.d("reflection", str + Z7.f27998r + objInvoke);
            return objInvoke;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
            return objInvoke;
        } catch (Exception e11) {
            e11.printStackTrace();
            return objInvoke;
        }
    }

    public static long b() {
        return a(System.currentTimeMillis());
    }

    public static long a(long j10) {
        return (j10 / 60000) * 60;
    }

    public static long b(long j10) {
        return j10 / 1000;
    }

    public static boolean a(ArrayList<StatsEvent> arrayList) {
        for (int i10 = 0; i10 < arrayList.size() - 1; i10++) {
            StatsEvent statsEvent = arrayList.get(i10);
            StatsEvent statsEvent2 = arrayList.get(i10 + 1);
            int iC = statsEvent.compareTo(statsEvent2);
            if (iC > 0) {
                Logger.e(f45013f, "failed sort. first: " + statsEvent + " second: " + statsEvent2);
                Logger.e(f45013f, "compare score: " + iC);
                return false;
            }
        }
        return true;
    }

    public static String a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            char[] cArr = new char[65536];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    break;
                }
                sb2.append(cArr, 0, i10);
            }
        } catch (ArrayIndexOutOfBoundsException e10) {
            Logger.e(f45013f, "Failed to read configuration from input stream", e10);
        }
        return sb2.toString();
    }

    public static long c(long j10) {
        return (j10 / 60) * 60000;
    }

    public static String a(Context context) {
        String str;
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            str = "";
            break;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.pid == iMyPid) {
                str = next.processName;
                break;
            }
        }
        if (str.equals("")) {
            return f45008a;
        }
        return str;
    }

    public static String a(String str) {
        String str2 = f45012e.get(str);
        return TextUtils.isEmpty(str2) ? J(str) : str2;
    }

    private static String J(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
        }
        return str;
    }

    public static DisplayMetrics a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } catch (Throwable th2) {
            Logger.e(f45013f, "error during display metrics extraction");
        }
        return displayMetrics;
    }

    public static Map<String, String> b(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, (String) jSONObject.get(next));
                }
            } catch (JSONException e10) {
                Logger.e(f45013f, "exception while parsing json string to map", e10);
                return null;
            }
        }
        return map;
    }

    public static JSONObject a(Map<String, String> map) {
        try {
            return new JSONObject(map.toString());
        } catch (JSONException e10) {
            Logger.e(f45013f, "exception while parsing map to JSON object", e10);
            return null;
        }
    }

    public static void b(String str, String str2) {
        if (Logger.getDebugMode()) {
            int length = str2.length() / 4000;
            for (int i10 = 0; i10 <= length; i10++) {
                int length2 = (i10 + 1) * 4000;
                if (length2 >= str2.length()) {
                    length2 = str2.length();
                }
                Logger.v(str, str2.substring(i10 * 4000, length2));
            }
        }
    }

    public static String c(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                Map<String, String> mapB = b(str, true);
                if (mapB != null && mapB.containsKey(str2)) {
                    Logger.d(f45013f, "param " + str2 + " value is " + mapB.get(str2));
                    return mapB.get(str2);
                }
                return null;
            }
            return null;
        } catch (Throwable th2) {
            Logger.e(f45013f, "Exception in getting query param decoded : " + th2.getMessage(), th2);
        }
    }

    public static String d(String str, String str2) {
        Map<String, String> mapB;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || (mapB = b(str, true)) == null || !mapB.containsKey(str2)) {
            return null;
        }
        Logger.d(f45013f, "param " + str2 + " value is " + mapB.get(str2));
        return mapB.get(str2);
    }

    public static Map<String, String> a(String str, boolean z10) {
        String strSubstring;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (String str2 : str.split(C3426d4.j.f28584c)) {
                int iIndexOf = str2.indexOf("=");
                if (iIndexOf != -1) {
                    String strSubstring2 = str2.substring(0, iIndexOf);
                    String strDecode = z10 ? URLDecoder.decode(strSubstring2, "UTF-8") : strSubstring2;
                    if (iIndexOf + 1 < str2.length()) {
                        strSubstring = str2.substring(iIndexOf + 1);
                        if (z10) {
                            strSubstring = URLDecoder.decode(strSubstring, "UTF-8");
                        }
                    } else {
                        strSubstring = null;
                    }
                    linkedHashMap.put(strDecode, strSubstring);
                }
            }
            return linkedHashMap;
        } catch (UnsupportedEncodingException e10) {
            Logger.e(f45013f, "Exception in splitQuery, queryParams = " + str, e10);
            return null;
        } catch (Throwable th2) {
            Logger.e(f45013f, "Exception in splitQuery: " + th2);
            return null;
        }
    }

    public static Map<String, String> b(String str, boolean z10) {
        try {
            if (str.contains("?")) {
                return a(str.substring(str.indexOf("?") + 1), z10);
            }
            return null;
        } catch (Throwable th2) {
            Logger.e(f45013f, "Exception in splitQuery, url = " + str, th2);
            return null;
        }
    }

    public static boolean c(String str) {
        String strD = d(str);
        if (TextUtils.isEmpty(strD)) {
            return false;
        }
        return f45020m.contains(strD);
    }

    public static String d(String str) {
        int iLastIndexOf;
        if (!TextUtils.isEmpty(str)) {
            int iLastIndexOf2 = str.lastIndexOf(35);
            if (iLastIndexOf2 > 0) {
                str = str.substring(0, iLastIndexOf2);
            }
            int iLastIndexOf3 = str.lastIndexOf(63);
            if (iLastIndexOf3 > 0) {
                str = str.substring(0, iLastIndexOf3);
            }
            int iLastIndexOf4 = str.lastIndexOf(47);
            if (iLastIndexOf4 >= 0) {
                str = str.substring(iLastIndexOf4 + 1);
            }
            if (!str.isEmpty() && (iLastIndexOf = str.lastIndexOf(46)) >= 0) {
                return str.substring(iLastIndexOf + 1);
            }
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0154  */
    public static boolean a(String str, Map<String, String> map) {
        boolean z10;
        boolean z11;
        if (TextUtils.isEmpty(str) || str.startsWith("data:text/html")) {
            return false;
        }
        String strO = o(str);
        String strD = d(strO);
        if (strD != null && strD.length() > 0) {
            if (f45020m.contains(strD)) {
                Logger.d(f45013f, "should include resource url extension match: " + strO);
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            if (strO.toLowerCase().startsWith(f45023p.toLowerCase()) || strO.toLowerCase().startsWith("text:".toLowerCase())) {
                Logger.d(f45013f, "should include resource url prefix match :" + strO);
                z10 = true;
            } else {
                z10 = false;
            }
            String[] strArr = com.safedk.android.analytics.brandsafety.creatives.e.a().get(com.safedk.android.analytics.brandsafety.creatives.e.f44271d);
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (strO.contains(str2)) {
                        Logger.d(f45013f, "should include resource url will be included (GENERAL_INCLUSION_LIST) : " + strO);
                        z10 = true;
                    }
                }
            }
            if (map == null || !map.containsKey(f45009b)) {
                z11 = z10;
            } else {
                String str3 = map.get(f45009b);
                Logger.d(f45013f, "should include resource url 'Accept' header value is " + str3);
                if (str3 == null || str3.length() <= 0 || !(str3.contains(f45018k) || L(str3) || M(str3))) {
                    z11 = z10;
                } else {
                    z11 = true;
                }
            }
        }
        if (strO.startsWith("data:") || strO.startsWith("about:")) {
            Logger.d(f45013f, "should include resource url excluded : " + strO);
            z11 = false;
        }
        if (!z11) {
            return z11;
        }
        boolean zK = K(strO);
        Logger.d(f45013f, "should include resource url: " + strO + ", should excluded? " + zK);
        return !zK;
    }

    private static boolean K(String str) {
        String[] strArr = com.safedk.android.analytics.brandsafety.creatives.e.a().get(com.safedk.android.analytics.brandsafety.creatives.e.f44270c);
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    Logger.d(f45013f, "url will be excluded (GENERAL_EXCLUSION_LIST) : " + str);
                    return true;
                }
            }
        }
        String[] strArr2 = com.safedk.android.analytics.brandsafety.creatives.e.a().get(com.safedk.android.analytics.brandsafety.creatives.e.f44269b);
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str.contains(str3)) {
                    Logger.d(f45013f, "url will be excluded (ATTRIBUTION_URLS): " + str);
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean L(String str) {
        Logger.d(f45013f, "header contains image mime type, headerValue = " + str + ", list: " + SafeDK.getInstance().u().toString());
        Iterator<String> it = SafeDK.getInstance().u().iterator();
        while (it.hasNext()) {
            if (str.contains("image/" + it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean M(String str) {
        Logger.d(f45013f, "header contains audio mime type, headerValue = " + str + ", list: " + SafeDK.getInstance().v().toString());
        Iterator<String> it = SafeDK.getInstance().v().iterator();
        while (it.hasNext()) {
            if (str.contains("audio/" + it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String e(String str) {
        return String.format(Locale.ENGLISH, "https://www.youtube.com/watch?v=%s", str);
    }

    public static ArrayList<String> f(String str) {
        new ArrayList();
        StringBuffer stringBuffer = new StringBuffer(str);
        try {
            try {
                b(f45013f, "extract Urls from source with unicode unescape started, source length " + str.length());
                Matcher matcher = f.B().matcher(str);
                while (matcher.find()) {
                    stringBuffer.replace(matcher.start(), matcher.end(), m(str.substring(matcher.start(), matcher.end())));
                }
                b(f45013f, "extract Urls from source with unicode unescape, unescapeUnicode  " + stringBuffer.toString());
                return g(k(stringBuffer.toString()).replaceAll("\\/\\*(.*?)\\*\\/", ""));
            } catch (Throwable th2) {
                Logger.d(f45013f, "Exception in extract Urls from source with unicode unescape, : " + th2.getMessage(), th2);
                return g(k(stringBuffer.toString()).replaceAll("\\/\\*(.*?)\\*\\/", ""));
            }
        } catch (Throwable th3) {
            g(k(stringBuffer.toString()).replaceAll("\\/\\*(.*?)\\*\\/", ""));
            throw th3;
        }
    }

    public static ArrayList<String> g(String str) {
        HashSet hashSet = new HashSet();
        if (TextUtils.isEmpty(str)) {
            return new ArrayList<>();
        }
        try {
            Matcher matcher = f.D().matcher(str);
            while (matcher.find()) {
                String strK = k(matcher.group(1).replace("\\/", "/"));
                if (URLUtil.isValidUrl(strK)) {
                    hashSet.add(strK);
                } else {
                    try {
                        String strDecode = URLDecoder.decode(strK, "UTF-8");
                        if (URLUtil.isValidUrl(strDecode)) {
                            hashSet.add(strDecode);
                        }
                    } catch (IllegalArgumentException e10) {
                        Logger.d(f45013f, "extract urls from html - illegal argument exception occurred while decoding, so adding the original url instead: " + strK);
                        hashSet.add(strK);
                    }
                }
            }
            b(f45013f, "extract urls from html found: " + hashSet);
        } catch (Throwable th2) {
            Logger.d(f45013f, "extract urls from html - exception when decoding url: " + th2.getMessage());
        }
        return new ArrayList<>(hashSet);
    }

    public static ArrayList<String> h(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null) {
            b(f45013f, "extract urls from source with special chars: , source: " + str);
            Matcher matcher = f.A().matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1).replace("\\/", "/"));
            }
        }
        return arrayList;
    }

    public static ArrayList<String> i(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null) {
            try {
                Logger.v(f45013f, "extract base64 encoded resource from source. regex pattern: " + f.y());
                Matcher matcher = f.y().matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(2);
                    int iN = N(strGroup);
                    Logger.v(f45013f, "base64 encoded resource from source found. Hash: " + iN + " , resource: " + strGroup);
                    arrayList.add(matcher.group(1) + StringUtils.PROCESS_POSTFIX_DELIMITER + iN);
                }
            } catch (Throwable th2) {
                Logger.d(f45013f, "Exception in base64 encoded resource extraction " + th2.getMessage());
            }
        }
        return arrayList;
    }

    private static int N(String str) {
        int iCharAt = 0;
        if (str.length() == 0) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            int i11 = iCharAt;
            if (i10 >= str.length()) {
                return i11;
            }
            iCharAt = (str.charAt(i10) + ((i11 << 5) - i11)) | 0;
            i10++;
        }
    }

    public static String j(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            i10++;
            if (cCharAt == '\\' && i10 < str.length()) {
                char cCharAt2 = str.charAt(i10);
                i10++;
                if (cCharAt2 == '\\' || cCharAt2 == '/' || cCharAt2 == '\"' || cCharAt2 == '\'') {
                    sb2.append(cCharAt2);
                } else if (cCharAt2 == 'n') {
                    sb2.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb2.append('\r');
                } else if (cCharAt2 == 't') {
                    sb2.append('\t');
                } else if (cCharAt2 == 'b') {
                    sb2.append('\b');
                } else if (cCharAt2 == 'f') {
                    sb2.append('\f');
                } else if (cCharAt2 == 'u') {
                    StringBuilder sb3 = new StringBuilder();
                    if (i10 + 4 > str.length()) {
                        throw new RuntimeException("Not enough unicode digits! ");
                    }
                    for (char c10 : str.substring(i10, i10 + 4).toCharArray()) {
                        if (!Character.isLetterOrDigit(c10)) {
                            throw new RuntimeException("Bad character in unicode escape.");
                        }
                        sb3.append(Character.toLowerCase(c10));
                    }
                    i10 += 4;
                    sb2.append((char) Integer.parseInt(sb3.toString(), 16));
                } else {
                    throw new RuntimeException("Illegal escape sequence: \\" + cCharAt2);
                }
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static String k(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                System.currentTimeMillis();
                String strReplace = n(l(str)).replace("&amp;", C3426d4.j.f28584c).replace("\\/", "/");
                while (strReplace.contains("&amp;")) {
                    strReplace = strReplace.replace("&amp;", C3426d4.j.f28584c);
                }
                while (strReplace.contains("&apos;")) {
                    strReplace = strReplace.replace("&apos;", "'");
                }
                while (strReplace.contains("&#39;")) {
                    strReplace = strReplace.replace("&#39;", "'");
                }
                while (strReplace.contains("&nbsp;")) {
                    strReplace = strReplace.replace("&nbsp;", Z7.f27998r);
                }
                if (strReplace.contains("[CDATA[") && strReplace.contains("&lt;") && strReplace.contains("&gt;") && strReplace.contains("&quot;")) {
                    int iIndexOf = strReplace.indexOf("http");
                    int iLastIndexOf = strReplace.lastIndexOf("&quot;");
                    if (iLastIndexOf != -1 && iLastIndexOf > iIndexOf && !strReplace.substring(iLastIndexOf).contains("[CDATA[")) {
                        strReplace = strReplace.substring(0, iLastIndexOf);
                    }
                }
                return strReplace;
            } catch (Throwable th2) {
                Logger.e(f45013f, "exception in selective decode. input param is " + str + "' , error : " + th2.getMessage());
                return str;
            }
        }
        return str;
    }

    public static String l(String str) {
        Matcher matcher = f.x().matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, String.valueOf((char) Integer.parseInt(matcher.group(1), 16)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static String m(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replace("\\\\x21", "!").replace("\\\\x22", "\"").replace("\\\\x23", "#").replace("\\\\x24", "$").replace("\\\\x25", "%").replace("\\\\x26", C3426d4.j.f28584c).replace("\\\\x27", "'").replace("\\\\x28", "(").replace("\\\\x29", ")").replace("\\\\x2a", "*").replace("\\\\x2b", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX).replace("\\\\x2c", StringUtils.COMMA).replace("\\\\x2d", "-").replace("\\\\x2e", ".").replace("\\\\x2f", "/").replace("\\\\x3a", StringUtils.PROCESS_POSTFIX_DELIMITER).replace("\\\\x3b", ";").replace("\\\\x3c", "<").replace("\\\\x3d", "=").replace("\\\\x3e", ">").replace("\\\\x3f", "?").replace("\\\\x40", "@").replace("\\\\x5b", C3426d4.j.f28586d).replace("\\\\x5d", C3426d4.j.f28588e).replace("\\x21", "!").replace("\\x22", "\"").replace("\\x23", "#").replace("\\x24", "$").replace("\\x25", "%").replace("\\x26", C3426d4.j.f28584c).replace("\\x27", "'").replace("\\x28", "(").replace("\\x29", ")").replace("\\x2a", "*").replace("\\x2b", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX).replace("\\x2c", StringUtils.COMMA).replace("\\x2f", "/").replace("\\x3a", StringUtils.PROCESS_POSTFIX_DELIMITER).replace("\\x3b", ";").replace("\\x3c", "<").replace("\\x3d", "=").replace("\\x3e", ">").replace("\\x3f", "?").replace("\\x40", "@").replace("\\x5b", C3426d4.j.f28586d).replace("\\x5d", C3426d4.j.f28588e).replace("&amp;", C3426d4.j.f28584c);
            } catch (Throwable th2) {
                Logger.e(f45013f, "exception in unescapeUnicodeHex. input param is " + str + "' , error : " + th2.getMessage());
                return str;
            }
        }
        return str;
    }

    public static String n(String str) {
        Matcher matcher = Pattern.compile("\\\\+x([0-9a-f]{2})").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, String.valueOf((char) Integer.parseInt(matcher.group(1), 16)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static String a(Pattern pattern, String str, int i10) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find() || matcher.groupCount() < i10) {
            return null;
        }
        return matcher.group(i10);
    }

    public static List<String> b(Pattern pattern, String str, int i10) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group(i10));
        }
        return arrayList;
    }

    public static List<String> a(Pattern pattern, String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public static List<Integer> b(Pattern pattern, String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(Integer.valueOf(matcher.start()));
        }
        return arrayList;
    }

    public static List<MatchResult> c(Pattern pattern, String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.toMatchResult());
        }
        return arrayList;
    }

    public static boolean d(Pattern pattern, String str) {
        Logger.d(f45013f, "match exists for pattern: " + pattern.pattern());
        return pattern.matcher(str).find();
    }

    public static String e(Pattern pattern, String str) {
        Logger.d(f45013f, "get match for pattern: " + pattern.pattern());
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find() || matcher.groupCount() <= 0) {
            return null;
        }
        String strGroup = matcher.group(1);
        Logger.d(f45013f, "match for pattern: " + strGroup);
        return strGroup;
    }

    public static String e(String str, String str2) {
        return !str.contains("?") ? str : str.replaceFirst("(?<=[?&])" + str2 + "=.*?(&|$)", "").replaceFirst("[?&]$", "");
    }

    public static String o(String str) {
        if (str != null && str.contains("?")) {
            return str.substring(0, str.indexOf("?"));
        }
        return str;
    }

    public static boolean p(String str) {
        return d(f.z(), str);
    }

    public static String q(String str) {
        if (p(str)) {
            for (String str2 : f45027t) {
                str = e(str, str2);
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View a(String str, String str2, View view) {
        View view2;
        try {
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                Logger.d(str, str2 + " get absolute parent, new view parent : " + parent);
                ViewParent viewParent = parent;
                while (viewParent.getParent() != null) {
                    ViewParent parent2 = viewParent.getParent();
                    Logger.d(str, str2 + " get absolute parent, new parent : " + parent2);
                    viewParent = parent2;
                }
                view2 = (View) viewParent;
            } else {
                return view;
            }
        } catch (Throwable th2) {
            Logger.e(str, str2 + " exception in get absolute parent (input param is " + view + "' , error : " + th2.getMessage());
            view2 = view;
        }
        Logger.d(str, str2 + " get absolute parent returning " + view2);
        return view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(View view) {
        try {
            if (view.getParent() == null) {
                return false;
            }
            if (view instanceof MaxAdView) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof MaxAdView) {
                return true;
            }
            while (parent.getParent() != null) {
                parent = parent.getParent();
                if (parent instanceof MaxAdView) {
                    return true;
                }
            }
        } catch (Throwable th2) {
            Logger.e(f45013f, "exception in get absolute parent (input param is " + view + "' , error : " + th2.getMessage());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MaxAdView b(View view) {
        try {
            if (view.getParent() == null) {
                return null;
            }
            if (view instanceof MaxAdView) {
                return (MaxAdView) view;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof MaxAdView) {
                return (MaxAdView) parent;
            }
            while (parent.getParent() != null) {
                parent = parent.getParent();
                if (parent instanceof MaxAdView) {
                    return (MaxAdView) parent;
                }
            }
            return null;
        } catch (Throwable th2) {
            Logger.e(f45013f, "exception in get absolute parent (input param is " + view + "' , error : " + th2.getMessage());
        }
    }

    public static void a(SortedMap<Integer, List<String>> sortedMap, int i10, String str) {
        if (!sortedMap.containsKey(Integer.valueOf(i10))) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            sortedMap.put(Integer.valueOf(i10), arrayList);
            return;
        }
        sortedMap.get(Integer.valueOf(i10)).add(str);
    }

    public static boolean r(String str) {
        if (str == null) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e10) {
            return false;
        } catch (Throwable th2) {
            return false;
        }
    }

    public static boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof URL) {
            return true;
        }
        try {
            new URL((String) obj);
            return true;
        } catch (MalformedURLException e10) {
            return false;
        } catch (Throwable th2) {
            return false;
        }
    }

    public static boolean s(String str) {
        String lowerCase = str.toLowerCase();
        return (lowerCase.contains("<html") && lowerCase.contains("</html>")) || (lowerCase.contains("<div") && lowerCase.contains("</div>")) || (lowerCase.contains("<script") && lowerCase.contains("</script>"));
    }

    public static String a(String str, int i10) {
        int i11 = 0;
        int iIndexOf = str.indexOf("<div", i10);
        int iIndexOf2 = str.indexOf("</div", i10);
        int i12 = i10;
        while (i12 < str.length()) {
            if (iIndexOf < iIndexOf2) {
                i11++;
                i12 = iIndexOf + 1;
                iIndexOf = str.indexOf("<div", i12);
            } else {
                i11--;
                i12 = iIndexOf2 + 1;
                if (i11 == 0) {
                    return str.substring(i10, iIndexOf2);
                }
                iIndexOf2 = str.indexOf("</div", i12);
            }
        }
        return null;
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                Object obj = bundle.get(str);
                if (obj instanceof Bundle) {
                    jSONObject.put(str, a((Bundle) obj));
                } else {
                    jSONObject.put(str, obj);
                }
            } catch (JSONException e10) {
            }
        }
        return jSONObject;
    }

    public static String a(Intent intent) {
        if (intent == null) {
            return "";
        }
        StringBuilder sbAppend = new StringBuilder("action: ").append(intent.getAction()).append(" data: ").append(intent.getDataString()).append(" extras: ");
        if (intent.getExtras() != null) {
            for (String str : intent.getExtras().keySet()) {
                sbAppend.append(str).append("=").append(intent.getExtras().get(str)).append(Z7.f27998r);
            }
        }
        return sbAppend.toString();
    }

    public static boolean t(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException e10) {
            return false;
        }
    }

    public static boolean u(String str) {
        try {
            new JSONArray(str);
            return true;
        } catch (JSONException e10) {
            return false;
        }
    }

    public static boolean v(String str) {
        return t(str) || u(str);
    }

    public static String a(String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                str = e(str, str2);
            }
            Logger.d(f45013f, "remove query param from Url returned '" + str);
        }
        return str;
    }

    public static boolean w(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : A.keySet()) {
            if (str.startsWith(str2) || str.startsWith(A.get(str2))) {
                return true;
            }
        }
        return false;
    }

    public static String x(String str) {
        for (String str2 : A.keySet()) {
            if (str.startsWith(str2)) {
                return str.replace(str2, A.get(str2));
            }
        }
        return str;
    }

    public static String y(String str) {
        int iIndexOf;
        for (String str2 : A.keySet()) {
            if (str.startsWith(str2)) {
                String strReplace = str.replace(str2, "");
                int iIndexOf2 = strReplace.indexOf(63);
                if (iIndexOf2 < 0) {
                    iIndexOf2 = strReplace.indexOf(38);
                }
                if (iIndexOf2 > 0) {
                    return str2 + strReplace.substring(0, iIndexOf2);
                }
                return str;
            }
            if (str.startsWith(A.get(str2)) && (iIndexOf = str.indexOf(38)) > 0) {
                str = str.substring(0, iIndexOf);
            }
        }
        return str;
    }

    public static boolean z(String str) {
        if (str == null) {
            return false;
        }
        boolean z10 = false;
        for (String str2 : f45028u) {
            str = o(str);
            if (str.toLowerCase().endsWith("." + str2)) {
                z10 = true;
            }
        }
        Logger.d(f45013f, "is video media uri returned " + z10 + " for url = " + str);
        return z10;
    }

    public static boolean A(String str) {
        Logger.d(f45013f, "isBinaryUrlExtension started, url = " + str);
        boolean z10 = false;
        for (String str2 : f45029v) {
            if (str.endsWith(str2)) {
                Logger.d(f45013f, "is binary url extension returned true for url = " + str);
                z10 = true;
            }
        }
        return z10;
    }

    public static String d() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
    }

    public static String e() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
    }

    public static String a(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.getDefault()).format(date);
    }

    public static String B(String str) {
        try {
            Date date = new Date(new File(str).lastModified());
            if (date != null) {
                return a(date);
            }
        } catch (Throwable th2) {
            Logger.d(f45013f, "Error extracting file last modified date from file " + str + " : " + th2.getMessage(), th2);
        }
        return "NA";
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static boolean a(String str, List<String> list) {
        if (str != null && list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean C(String str) {
        Iterator<String> it = f45024q.iterator();
        while (it.hasNext()) {
            if (str.endsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean D(String str) {
        String strO = o(str);
        Iterator<String> it = f45025r.iterator();
        while (it.hasNext()) {
            if (strO.endsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(float f10, float f11) {
        boolean z10 = false;
        if (f11 == 0.0f || f10 == 0.0f) {
            Logger.d(f45013f, "Banner ratio height/width cannot be 0");
        } else {
            float f12 = f10 / f11;
            if ((f12 >= 6.0d && f12 <= 8.4d) || (f12 >= 12.0d && f12 <= 15.0d)) {
                z10 = true;
            }
            Logger.d(f45013f, "Banner ratio: " + f12 + " ? " + z10);
        }
        return z10;
    }

    public static boolean b(float f10, float f11) {
        boolean z10 = false;
        if (f11 == 0.0f || f10 == 0.0f) {
            Logger.d(f45013f, "MREC ratio height/width cannot be 0");
        } else {
            float f12 = f10 / f11;
            if (f12 >= 1.1d && f12 <= 1.3d) {
                z10 = true;
            }
            Logger.d(f45013f, "MREC ratio: " + f12 + " ? " + z10);
        }
        return z10;
    }

    public static boolean c(View view) {
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            while (parent != null) {
                Logger.d(f45013f, "is webview inside max ad view, view parent: " + parent);
                if (parent instanceof MaxAdView) {
                    Logger.d(f45013f, "is webview inside max ad view, max ad view found: " + parent);
                    return true;
                }
                if (parent.getParent() != null) {
                    parent = parent.getParent();
                }
            }
        }
        return false;
    }

    public static boolean b(String str, Map<String, String> map) {
        String str2;
        Logger.d(f45013f, "contains accept video header or has video extension, url: " + str + ", headers: " + map);
        if (map != null && map.containsKey(f45009b) && (str2 = map.get(f45009b)) != null && str2.length() > 0 && str2.contains(f45018k)) {
            Logger.d(f45013f, "identified video header, url: " + str + ", headers: " + map);
            return true;
        }
        if (str != null && D(str)) {
            Logger.d(f45013f, "identified video extension, url: " + str);
            return true;
        }
        return false;
    }

    public static String a(String str, Pattern pattern, int i10, String str2) {
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            stack.push(Integer.valueOf(matcher.start(i10)));
            stack2.push(Integer.valueOf(matcher.end(i10)));
        }
        StringBuilder sb2 = new StringBuilder(str);
        while (!stack.isEmpty()) {
            int iIntValue = ((Integer) stack.pop()).intValue();
            int iIntValue2 = ((Integer) stack2.pop()).intValue();
            if (iIntValue >= 0 && iIntValue2 >= 0) {
                Logger.d(f45013f, "replacing text of matching group. removing :  " + str.substring(iIntValue, iIntValue2));
                sb2.replace(iIntValue, iIntValue2, str2);
            }
        }
        return sb2.toString();
    }

    public static String E(String str) {
        if (str != null) {
            try {
                String strDecode = URLDecoder.decode(str, "UTF-8");
                if (strDecode.contains("?") && str.contains("%3F") && strDecode.indexOf("?") <= str.indexOf("%3F")) {
                    Logger.d(f45013f, "decodeUrlIfNeeded: " + str);
                    return strDecode;
                }
                return str;
            } catch (Throwable th2) {
                Logger.d(f45013f, "Exception decoding url " + str + " : " + th2.getMessage());
                return str;
            }
        }
        return str;
    }

    public static String F(String str) {
        if (str != null && str.length() != 0) {
            return str.replace("&nbsp;", Z7.f27998r).replace("&quot;", "\"").replace("&apos;", "'").replace("&#39;", "'").replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", C3426d4.j.f28584c).replaceAll("<\\s*?br\\s*?/\\s*?>", "\n").replaceAll("<\\s*?span\\s+?style\\s*?=\\s*?\"white-space:pre\"\\s*?>&#9;<\\s*?/\\s*?span\\s*?>", "\t");
        }
        return str;
    }

    public static String G(String str) {
        if (str != null && str.length() != 0) {
            try {
                return new String(Base64.decode(str, 0));
            } catch (IllegalArgumentException e10) {
                Logger.d(f45013f, "base64Decoder - failed to Base64 decode buffer (decoded): " + e10.getMessage());
                return str;
            }
        }
        return str;
    }

    public static boolean H(String str) {
        if (str.contains(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d) && str.contains(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e) && str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER) && str.contains("\"")) {
            return v(str);
        }
        return false;
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.size() == 0;
    }

    public static String a(ConcurrentHashMap<?, WeakReference<WebView>> concurrentHashMap, boolean z10) {
        StringBuilder sb2 = new StringBuilder(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d);
        Iterator<Map.Entry<?, WeakReference<WebView>>> it = concurrentHashMap.entrySet().iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 < concurrentHashMap.size()) {
                Map.Entry<?, WeakReference<WebView>> next = it.next();
                sb2.append(next.getKey()).append("=");
                if (next.getValue() != null && next.getValue().get() != null) {
                    if (z10) {
                        sb2.append(BrandSafetyUtils.a(next.getValue().get()));
                    } else {
                        sb2.append(next.getValue().get().toString());
                    }
                } else {
                    sb2.append("null");
                }
                if (i11 < concurrentHashMap.size() - 1) {
                    sb2.append(", ");
                }
                i10 = i11 + 1;
            } else {
                return sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e).toString();
            }
        }
    }

    public static ArrayList<String> a(Collection<String> collection, int i10) {
        return a(collection, 0, i10);
    }

    public static ArrayList<String> a(Collection<String> collection, int i10, int i11) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().substring(i10, i11));
        }
        return arrayList;
    }

    public static boolean f(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        b(f45013f, "stringSimilarity: s1 is: " + str);
        b(f45013f, "stringSimilarity: s2 is: " + str2);
        if (str.length() != str2.length()) {
            Logger.d(f45013f, "stringSimilarity: they don't have the same length s1=" + str.length() + " s2=" + str2.length());
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (str.charAt(i10) != str2.charAt(i10)) {
                Logger.d(f45013f, "stringSimilarity: they are not equal at char number i: s1[i]=" + str.charAt(i10) + " s2[i]=" + str2.charAt(i10));
                return false;
            }
        }
        Logger.d(f45013f, "stringSimilarity: they are equal!");
        return true;
    }

    public static boolean a(Reference<?> reference) {
        return (reference == null || reference.get() == null) ? false : true;
    }

    public static String b(Object obj) {
        return obj == null ? "null" : obj.toString();
    }

    public static String I(String str) {
        try {
            return new URI(o(str)).getHost();
        } catch (URISyntaxException e10) {
            Logger.e(f45013f, "getURLDomain - exception occurred: " + e10);
            return null;
        }
    }

    public static boolean a(WebView webView) {
        MaxAdView maxAdViewB = b((View) webView);
        if (maxAdViewB != null) {
            String strA = BrandSafetyUtils.a(maxAdViewB);
            SafeDK.getInstance().z();
            if (BannerFinder.d().containsKey(strA)) {
                SafeDK.getInstance().z();
                if (BannerFinder.d().get(strA) != null) {
                    SafeDK.getInstance().z();
                    if (BannerFinder.d().get(strA).equals(BrandSafetyUtils.AdType.MREC)) {
                        StringBuilder sbAppend = new StringBuilder().append("isMrecWebView returned true for webview = ").append(webView).append(", maxAdViewAddress = ").append(strA).append(", getMaxAdViewAddressToAdType= ");
                        SafeDK.getInstance().z();
                        Logger.d(f45013f, sbAppend.append(BannerFinder.d().toString()).toString());
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
