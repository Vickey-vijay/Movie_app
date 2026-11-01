package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import com.ironsource.Y1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.MBDownloadConfig;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper;
import com.mbridge.msdk.foundation.download.resource.ResourceConfig;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SameTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class v0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f35386a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Boolean f35387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f35388c = Pattern.compile("[一-龥]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map<String, String> f35389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Map<String, String> f35390e;

    /* JADX INFO: compiled from: SameTool.java */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f35391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f35392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.foundation.feedback.a f35393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f35394d;

        public a(ImageView imageView, CampaignEx campaignEx, com.mbridge.msdk.foundation.feedback.a aVar, int i10) {
            this.f35391a = imageView;
            this.f35392b = campaignEx;
            this.f35393c = aVar;
            this.f35394d = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                v0.a(this.f35392b, this.f35393c, this.f35394d, (String) this.f35391a.getTag());
            } catch (Exception e10) {
                q0.b("SameTools", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: SameTool.java */
    public class c implements ILogger {
        @Override // com.mbridge.msdk.foundation.download.utils.ILogger
        public void log(String str, String str2) {
            q0.a(str, str2);
        }

        @Override // com.mbridge.msdk.foundation.download.utils.ILogger
        public void log(String str, Exception exc) {
            q0.a(str, exc.getMessage());
        }
    }

    public static int a(int i10) {
        if ((i10 > 100 && i10 < 199) || i10 == 2) {
            return 1;
        }
        if ((i10 <= 200 || i10 >= 299) && i10 != 4) {
            return (i10 <= 500 || i10 >= 599) ? -1 : 5;
        }
        return 2;
    }

    public static String a(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                HashMap map = new HashMap();
                map.put(str2, str3);
                return a(str, map);
            }
            return str;
        } catch (Exception e10) {
            q0.b("SameTools", e10.getMessage());
            return str;
        }
    }

    public static int b(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            PackageInfo currentWebViewPackage = Build.VERSION.SDK_INT >= 26 ? WebView.getCurrentWebViewPackage() : context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null) {
                gVarD = com.mbridge.msdk.setting.h.b().a();
            }
            if (currentWebViewPackage == null || TextUtils.isEmpty(currentWebViewPackage.versionName) || !currentWebViewPackage.versionName.equals("77.0.3865.92")) {
                return gVarD.A0();
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int c(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return 0;
    }

    public static float d(Context context) {
        if (context == null) {
            return 2.5f;
        }
        try {
            float f10 = context.getResources().getDisplayMetrics().density;
            if (f10 == 0.0f) {
                return 2.5f;
            }
            return f10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 2.5f;
        }
    }

    public static DisplayMetrics e(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }

    public static int f(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return e(context).heightPixels;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return e(context).widthPixels;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int i(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static float j(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int k(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static boolean l(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean m(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SameTools", "isNetworkAvailable", e10);
            }
            return false;
        }
    }

    public static boolean n(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && "wifi".equals(activeNetworkInfo.getTypeName().toLowerCase(Locale.US));
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: compiled from: SameTool.java */
    public class b implements IDatabaseOpenHelper {
        @Override // com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper
        public SQLiteDatabase getReadableDatabase() {
            return com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()).c();
        }

        @Override // com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper
        public SQLiteDatabase getWritableDatabase() {
            return com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()).d();
        }
    }

    public static synchronized String d(String str) {
        String str2 = com.mbridge.msdk.foundation.controller.c.n().b() + "_" + str;
        Map<String, String> map = f35390e;
        if (map == null || !map.containsKey(str2)) {
            return null;
        }
        return f35390e.get(str2);
    }

    public static <T extends String> boolean j(T t10) {
        return t10 != null && t10.length() > 0;
    }

    public static int f(String str) {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", new Class[0]).invoke(m0.d(str), new Object[0])).intValue();
        } catch (Throwable th2) {
            q0.b("SameTools", th2.getMessage());
            return 0;
        }
    }

    public static Object g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", Context.class, String.class).invoke(null, com.mbridge.msdk.foundation.controller.c.n().d(), str);
        } catch (ClassNotFoundException e10) {
            q0.b("SameTools", e10.getMessage());
            return null;
        } catch (IllegalAccessException e11) {
            q0.b("SameTools", e11.getMessage());
            return null;
        } catch (NoSuchMethodException e12) {
            q0.b("SameTools", e12.getMessage());
            return null;
        } catch (InvocationTargetException e13) {
            q0.b("SameTools", e13.getMessage());
            return null;
        }
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return false;
            }
            String queryParameter = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_CAN_ANIM);
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("1");
        } catch (Exception e10) {
            q0.b("SameTools", e10.getMessage());
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    public static boolean i(String str) {
        boolean z10;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                try {
                    Uri uri = Uri.parse(str);
                    if (uri == null) {
                        return false;
                    }
                    String queryParameter = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW);
                    if (TextUtils.isEmpty(queryParameter)) {
                        z10 = false;
                    } else {
                        int i10 = -1;
                        try {
                            i10 = Integer.parseInt(queryParameter);
                        } catch (Exception unused) {
                        }
                        if (i10 % 2 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    try {
                        if (TextUtils.isEmpty(uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_NATMP))) {
                            return z10;
                        }
                        return true;
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Exception e11) {
                    e = e11;
                    z10 = false;
                }
            } catch (Throwable unused2) {
                return false;
            }
            q0.b("SameTools", e.getMessage());
            return false;
        } catch (Throwable unused3) {
            return z10;
        }
    }

    public static boolean j() {
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                return false;
            }
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (property2 == null) {
                property2 = Y1.f27894f;
            }
            int i10 = Integer.parseInt(property2);
            q0.a("address = ", property + "~");
            q0.a("port = ", i10 + "~");
            return (TextUtils.isEmpty(property) || i10 == -1) ? false : true;
        } catch (Throwable th2) {
            q0.b("SameTools", th2.getMessage());
            return false;
        }
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return false;
            }
            String queryParameter = uri.getQueryParameter(MBridgeConstans.ENDCARD_URL_IS_PLAYABLE);
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            return queryParameter.equals("0");
        } catch (Exception e10) {
            q0.b("SameTools", e10.getMessage());
            return false;
        }
    }

    public static String c(String str) {
        ConcurrentHashMap<String, com.mbridge.msdk.foundation.entity.c> concurrentHashMapC;
        List<String> listC;
        if (TextUtils.isEmpty(str) || (concurrentHashMapC = com.mbridge.msdk.foundation.same.buffer.b.c(str)) == null || concurrentHashMapC.size() <= 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (com.mbridge.msdk.foundation.entity.c cVar : concurrentHashMapC.values()) {
            if (cVar != null && a(cVar.e(), cVar.f()) && (listC = cVar.c()) != null && listC.size() > 0) {
                arrayList.addAll(listC);
            }
        }
        if (arrayList.size() <= 0) {
            return "";
        }
        HashSet hashSet = new HashSet(arrayList);
        arrayList.clear();
        arrayList.addAll(hashSet);
        return arrayList.toString();
    }

    public static BitmapDrawable n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (bitmapDecodeByteArray != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapDecodeByteArray);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                bitmapDrawable.setTileModeXY(tileMode, tileMode);
                return bitmapDrawable;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return null;
    }

    public static String a(String str, Map<String, String> map) {
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                StringBuilder sb2 = new StringBuilder(str);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        String value = entry.getValue();
                        if (str.contains(entry.getKey())) {
                            if (value.equals("0")) {
                                sb2 = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", ""));
                            } else {
                                sb2 = new StringBuilder(str.replaceAll("(" + entry.getKey() + "[^&]*)", entry.getKey() + entry.getValue()));
                            }
                        } else if (!value.equals("0")) {
                            sb2.append(entry.getKey() + entry.getValue());
                        }
                    }
                }
                return sb2.toString();
            }
            return str;
        } catch (Exception e10) {
            q0.b("SameTools", e10.getMessage());
            return str;
        }
    }

    public static String d() {
        String str;
        try {
            str = UUID.randomUUID().toString() + System.currentTimeMillis();
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        if (!a1.a(str)) {
            return str;
        }
        return System.currentTimeMillis() + "";
    }

    public static double m(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return Double.parseDouble(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return 0.0d;
    }

    public static final synchronized String e(String str) {
        boolean z10;
        boolean zI0;
        Map<String, String> map;
        try {
            String str2 = com.mbridge.msdk.foundation.controller.c.n().b() + "_" + str;
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            int iMax = 3;
            if (gVarD != null) {
                boolean zB0 = gVarD.B0();
                zI0 = gVarD.I0();
                iMax = Math.max(0, gVarD.c0());
                z10 = zB0;
            } else {
                z10 = true;
                zI0 = false;
            }
            if (zI0 && iMax != 0) {
                if (z10 && (map = f35389d) != null && map.containsKey(str2)) {
                    return f35389d.get(str2);
                }
                StringBuilder sb2 = new StringBuilder("");
                StackTraceElement[] stackTrace = new Exception().getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    List<String> listA = a(stackTrace);
                    Collections.reverse(listA);
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : listA) {
                        if (!str3.startsWith(MBridgeConstans.APPLICATION_STACK_COM_ANDROID) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_OS) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_APP) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_REFLECT_METHOD) && !str3.startsWith(MBridgeConstans.APPLICATION_STACK_ANDROID_VIEW) && !arrayList.contains(str3)) {
                            arrayList.add(str3);
                        }
                    }
                    int iMin = Math.min(arrayList.size(), iMax);
                    if (iMin > 0) {
                        for (int i10 = 0; i10 < iMin; i10++) {
                            sb2.append((String) arrayList.get(i10));
                            if (i10 < iMin - 1) {
                                sb2.append(ImpressionLog.Q);
                            }
                        }
                    }
                    JSONObject jSONObject = null;
                    if (!TextUtils.isEmpty(sb2.toString())) {
                        jSONObject = new JSONObject();
                        jSONObject.put("1", sb2.toString());
                    }
                    if (jSONObject == null || jSONObject.length() <= 0) {
                        return "";
                    }
                    String strB = com.mbridge.msdk.foundation.tools.a.b(jSONObject.toString());
                    if (z10 && !TextUtils.isEmpty(strB)) {
                        if (f35389d == null) {
                            f35389d = new HashMap();
                        }
                        f35389d.put(str2, strB);
                    }
                    return strB;
                }
                return "";
            }
            return "";
        } catch (Exception e10) {
            q0.b("SameTools", e10.getMessage());
        }
    }

    public static <T extends String> boolean k(T t10) {
        return t10 == null || t10.length() == 0;
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return -1;
            }
            String queryParameter = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW);
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return -1;
            }
            try {
                return Integer.parseInt(queryParameter);
            } catch (Exception unused) {
                return -1;
            }
        } catch (Exception e10) {
            q0.b("SameTools", e10.getMessage());
            return -1;
        }
    }

    public static void f() {
        try {
            HandlerThread handlerThread = new HandlerThread("mb_db_thread");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            MBDownloadConfig.Builder builder = new MBDownloadConfig.Builder();
            builder.setDatabaseHandler(handler);
            builder.setDatabaseOpenHelper(new b());
            builder.setLogger(new c());
            MBDownloadManager.getInstance().initialize(com.mbridge.msdk.foundation.controller.c.n().d(), builder.build(), new ResourceConfig.Builder().setMaxStorageSpace(100L).setMaxStorageTime(259200000L).build());
        } catch (Throwable th2) {
            q0.b("SameTools", th2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0015 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:15:0x0019 A[Catch: all -> 0x0013, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0006, B:8:0x000c, B:15:0x0019), top: B:22:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static synchronized int d(Context context, String str) {
        ?? A;
        A = 4;
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    A = a(str, context);
                } catch (Exception unused) {
                    A = 3;
                }
            } else if (context == null) {
                A = 5;
            } else if (TextUtils.isEmpty(str)) {
                A = 2;
            }
        } else if (context == null) {
            A = 5;
        } else if (TextUtils.isEmpty(str)) {
            A = 2;
        }
        throw th;
        return A;
    }

    public static boolean h() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean g() {
        if (TextUtils.isEmpty(com.mbridge.msdk.foundation.controller.c.n().j())) {
            return false;
        }
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
            return true;
        } catch (ClassNotFoundException e10) {
            q0.b("SameTools", e10.getMessage());
            return false;
        }
    }

    public static int d(String str, String str2) {
        return a(str, str2, 0);
    }

    public static boolean i() {
        NetworkInfo networkInfo;
        try {
            ConnectivityManager connectivityManagerA = h0.a();
            if (connectivityManagerA != null && (networkInfo = connectivityManagerA.getNetworkInfo(17)) != null) {
                return networkInfo.isConnected();
            }
            return false;
        } catch (Exception e10) {
            q0.b("SameTools", e10.getMessage());
            return false;
        }
    }

    public static String b(int i10) {
        String[] strArrA;
        try {
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null) {
                gVarD = com.mbridge.msdk.setting.h.b().a();
            }
            JSONArray jSONArray = new JSONArray();
            if (gVarD != null && gVarD.m() == 1 && (strArrA = com.mbridge.msdk.foundation.db.middle.a.b().a()) != null) {
                int length = strArrA.length;
                for (int i11 = (length <= i10 || i10 == 0) ? 0 : length - i10; i11 < length; i11++) {
                    jSONArray.put(strArrA[i11]);
                }
            }
            if (jSONArray.length() > 0) {
                return a(jSONArray);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return "";
    }

    public static String a(String str) {
        try {
            return a1.b(str) ? URLEncoder.encode(str, G5.N) : "";
        } catch (Throwable th2) {
            q0.b("SameTools", th2.getMessage(), th2);
            return "";
        }
    }

    public static final String c() {
        return MIMManager.b().d();
    }

    public static synchronized boolean c(Context context, String str) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                return a(str, context);
            }
        }
        return false;
    }

    public static void a(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        try {
            imageView.setImageResource(0);
            imageView.setImageDrawable(null);
            imageView.setImageURI(null);
            imageView.setImageBitmap(null);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    public static boolean c(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                return campaignEx.getRetarget_offer() == 1;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return false;
    }

    public static synchronized void c(String str, String str2) {
        if (f35390e == null) {
            f35390e = new HashMap();
        }
        f35390e.put(com.mbridge.msdk.foundation.controller.c.n().b() + "_" + str, str2);
    }

    public static JSONArray b(Context context, String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null) {
                gVarD = com.mbridge.msdk.setting.h.b().a();
            }
            if (gVarD != null && gVarD.m() == 1) {
                q0.c("SameTools", "fqci cfc:" + gVarD.m());
                String[] strArrA = com.mbridge.msdk.foundation.db.middle.a.b().a();
                if (strArrA != null) {
                    for (String str2 : strArrA) {
                        q0.c("SameTools", "cfc campaignIds:" + strArrA);
                        jSONArray.put(str2);
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONArray;
    }

    public static final void a(int i10, ImageView imageView, CampaignEx campaignEx, Context context, boolean z10, com.mbridge.msdk.foundation.feedback.a aVar) {
        if (imageView == null || campaignEx == null) {
            return;
        }
        q0.a("configPrivacyButton", "configPrivacyButton");
        boolean z11 = campaignEx.getPrivacyButtonTemplateVisibility() == 0;
        q0.a("configPrivacyButton", "privacyButtonVisibilityGone: " + z11 + " isIgnoreCampaignPrivacyConfig: " + z10);
        if (!z10 && z11) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e10) {
                q0.b("SameTools", e10.getMessage());
                return;
            }
        }
        if (TextUtils.isEmpty(a(campaignEx))) {
            try {
                imageView.setVisibility(8);
                return;
            } catch (Exception e11) {
                q0.b("SameTools", e11.getMessage());
                return;
            }
        }
        try {
            imageView.setVisibility(0);
        } catch (Exception e12) {
            q0.b("SameTools", e12.getMessage());
        }
        imageView.setOnClickListener(new a(imageView, campaignEx, aVar, i10));
    }

    public static int c(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int b() {
        int i10 = f35386a;
        f35386a = i10 + 1;
        return i10;
    }

    public static boolean b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            return !TextUtils.isEmpty(campaignEx.getDeepLinkURL());
        }
        return false;
    }

    public static String a(CampaignEx campaignEx) {
        com.mbridge.msdk.setting.g gVarD;
        CampaignEx.a adchoice;
        String privacyUrl = "";
        if (campaignEx != null) {
            try {
                privacyUrl = campaignEx.getPrivacyUrl();
            } catch (Exception e10) {
                q0.b("SameTools", e10.getMessage());
                return "";
            }
        }
        if (TextUtils.isEmpty(privacyUrl) && campaignEx != null && (adchoice = campaignEx.getAdchoice()) != null) {
            privacyUrl = adchoice.h();
        }
        if (TextUtils.isEmpty(privacyUrl) && (gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b())) != null) {
            privacyUrl = gVarD.c();
        }
        return TextUtils.isEmpty(privacyUrl) ? com.mbridge.msdk.foundation.same.net.utils.d.h().f35036g : privacyUrl;
    }

    public static boolean b(String str, Context context) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            try {
                try {
                    Uri uri = Uri.parse(str2);
                    return (uri == null || TextUtils.isEmpty(uri.getQueryParameter(str))) ? false : true;
                } catch (Exception e10) {
                    q0.b("SameTools", e10.getMessage());
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static int e() {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get(null)).intValue();
        } catch (Throwable th2) {
            q0.b("SameTools", th2.getMessage());
            return 0;
        }
    }

    public static List<String> b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (a1.b(strOptString)) {
                    arrayList.add(strOptString);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            q0.b("SameTools", th2.getMessage(), th2);
            return null;
        }
    }

    public static void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.feedback.a aVar, int i10, String str) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str2 = campaignEx.getCampaignUnitId() + "_" + i10;
            com.mbridge.msdk.foundation.feedback.b.b().d(str2);
            com.mbridge.msdk.foundation.feedback.b.b().a(str2, campaignEx);
            com.mbridge.msdk.foundation.feedback.b.b().a(str2, aVar);
            com.mbridge.msdk.foundation.feedback.b.b().a(str2, i10);
            com.mbridge.msdk.foundation.feedback.b.b().a(str2, str);
            com.mbridge.msdk.foundation.feedback.b.b().b(str2).p();
        } catch (Throwable th2) {
            q0.b("SameTools", "feedback error", th2);
        }
    }

    public static int b(Context context, float f10) {
        float f11 = 2.5f;
        if (context != null) {
            try {
                float f12 = context.getResources().getDisplayMetrics().density;
                if (f12 != 0.0f) {
                    f11 = f12;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return (int) ((f10 / f11) + 0.5f);
    }

    public static String b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject(C3426d4.i.G);
                if (jSONObject2 == null) {
                    return str;
                }
                if (jSONObject2.has(str2)) {
                    if (str3.equals("0")) {
                        jSONObject2.remove(str2);
                    } else {
                        jSONObject2.put(str2, str3);
                    }
                } else {
                    if (str3.equals("0")) {
                        return str;
                    }
                    jSONObject2.put(str2, str3);
                }
                return jSONObject.toString();
            } catch (Exception e10) {
                q0.b("SameTools", e10.getMessage());
            }
        }
        return str;
    }

    public static int a(Context context, float f10) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f10 * resources.getDisplayMetrics().density) + 0.5f);
    }

    public static double a(Double d10) {
        try {
            String str = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d10);
            if (a1.b(str)) {
                return Double.parseDouble(str);
            }
            return 0.0d;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0.0d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0029 A[EXC_TOP_SPLITTER, PHI: r0 r2
  0x0029: PHI (r0v1 long) = (r0v0 long), (r0v3 long) binds: [B:18:0x0027, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x0029: PHI (r2v3 java.io.FileInputStream) = (r2v2 java.io.FileInputStream), (r2v4 java.io.FileInputStream) binds: [B:18:0x0027, B:12:0x001d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static long a(File file) throws Exception {
        long jAvailable = 0;
        FileInputStream fileInputStream = null;
        try {
            if (file.exists()) {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    jAvailable = fileInputStream2.available();
                    fileInputStream = fileInputStream2;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } else {
                file.createNewFile();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (Exception unused4) {
        } catch (Throwable th3) {
            th = th3;
        }
        return jAvailable;
    }

    public static String a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = com.mbridge.msdk.setting.h.b().a();
        }
        int iW = gVarD.W();
        if (jSONArray.length() > iW) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i10 = 0; i10 < iW; i10++) {
                try {
                    jSONArray2.put(jSONArray.get(i10));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            return jSONArray2.toString();
        }
        return jSONArray.toString();
    }

    public static String a(Context context, String str) {
        String strA = "";
        try {
            JSONArray jSONArrayB = b(context, str);
            strA = jSONArrayB.length() > 0 ? a(jSONArrayB) : "";
            q0.c("SameTools", "get excludes:" + strA);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return strA;
    }

    private static boolean a(long j10, long j11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j10 > 0) {
            return j11 + (j10 * 1000) >= jCurrentTimeMillis;
        }
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            gVarD = com.mbridge.msdk.setting.h.b().a();
        }
        return j11 + (gVarD.b0() * 1000) >= jCurrentTimeMillis;
    }

    public static final int a() {
        if (f35387b == null) {
            try {
                f35387b = MIMManager.b().e();
            } catch (Exception e10) {
                q0.b("SameTools", e10.getMessage());
            }
        }
        if (f35387b != null) {
            return f35387b.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    public static synchronized String a(Context context, String str, String str2) {
        StringBuilder sb2;
        sb2 = new StringBuilder(str2);
        try {
            sb2.append(a(str2, context, str));
        } catch (Exception unused) {
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:13:0x0025
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private static synchronized java.lang.String a(java.lang.String r2, android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.v0> r0 = com.mbridge.msdk.foundation.tools.v0.class
            monitor-enter(r0)
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            java.util.Set r2 = r2.getQueryParameterNames()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r2 == 0) goto L1b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            if (r2 <= 0) goto L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            goto L2c
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            java.lang.String r1 = "?rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L25
            goto L2c
        L23:
            r2 = move-exception
            goto L46
        L25:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L23
        L2c:
            boolean r3 = a(r4, r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L3c
            if (r3 == 0) goto L37
            r3 = 1
            r2.append(r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L3c
            goto L40
        L37:
            r3 = 2
            r2.append(r3)     // Catch: java.lang.Throwable -> L23 java.lang.Exception -> L3c
            goto L40
        L3c:
            r3 = 0
            r2.append(r3)     // Catch: java.lang.Throwable -> L23
        L40:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return r2
        L46:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.v0.a(java.lang.String, android.content.Context, java.lang.String):java.lang.String");
    }

    public static boolean a(String str, Context context) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && packageManager.getPackageInfo(str, 1) != null) {
                    return true;
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    q0.a("SameTools", th2.getMessage());
                }
            }
        }
        return false;
    }

    public static List<String> a(StackTraceElement[] stackTraceElementArr) {
        ArrayList arrayList = new ArrayList();
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                arrayList.add(stackTraceElement.getClassName());
            }
        }
        return arrayList;
    }

    public static ImageView a(ImageView imageView, BitmapDrawable bitmapDrawable, DisplayMetrics displayMetrics) {
        try {
            bitmapDrawable.setTargetDensity(displayMetrics);
            imageView.setBackground(bitmapDrawable);
            imageView.setClickable(false);
            imageView.setFocusable(false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return imageView;
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        try {
            view.setSystemUiVisibility(4102);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void a(String str, CampaignEx campaignEx, int i10) {
        try {
            if (TextUtils.isEmpty(str) || campaignEx == null || com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                return;
            }
            com.mbridge.msdk.foundation.db.i iVarA = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
            fVar.a(System.currentTimeMillis());
            fVar.b(str);
            fVar.a(campaignEx.getId());
            fVar.a(i10);
            iVarA.a(fVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SameTools", e10.getMessage());
            }
        }
    }

    public static boolean a(JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0 || jSONObject.optInt("v", -1) != -1) ? false : true;
    }

    public static int a(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof String) {
                    return Integer.parseInt((String) obj);
                }
            } catch (Throwable th2) {
                q0.b("SameTools", th2.getMessage(), th2);
            }
        }
        return 0;
    }

    public static int a(String str, String str2, int i10) {
        if (TextUtils.isEmpty(str)) {
            return i10;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri != null) {
                String queryParameter = uri.getQueryParameter(str2);
                return TextUtils.isEmpty(queryParameter) ? i10 : (int) Math.round(Double.valueOf(String.valueOf(queryParameter)).doubleValue());
            }
        } catch (Exception e10) {
            q0.b("SameTools", e10.getMessage());
        }
        return i10;
    }

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                byte[] bArr = new byte[32];
                byte[] bArr2 = new byte[12];
                byte[] bArrDigest = MessageDigest.getInstance("SHA-384").digest(str2.getBytes("UTF-8"));
                System.arraycopy(bArrDigest, 0, bArr, 0, 32);
                System.arraycopy(bArrDigest, 32, bArr2, 0, 12);
                return com.mbridge.msdk.foundation.tools.b.a(str, bArr, bArr2);
            } catch (Exception e10) {
                q0.b("SameTools", "AES 加密失败: " + e10.getMessage(), e10);
            }
        }
        return null;
    }
}
