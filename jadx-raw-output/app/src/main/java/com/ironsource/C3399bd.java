package com.ironsource;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Log;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3399bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28255a = "com.google.market";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f28256b = "com.android.vending";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f28257c = "isInstalled";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f28258d = "bd";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ArrayList<String> f28259e = new a();

    /* JADX INFO: renamed from: com.ironsource.bd$b */
    public class b extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f28260a;

        public b(boolean z10) throws JSONException {
            this.f28260a = z10;
            put("isInstalled", z10);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.bd$c */
    public enum c {
        GOOGLE_PLAY(2, new String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new String[]{C3399bd.f28255a}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Map<String, c> f28266h = new HashMap();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f28268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f28269b;

        /* JADX INFO: Access modifiers changed from: private */
        public static ArrayList<String> b() {
            return new ArrayList<>(f28266h.keySet());
        }

        static {
            for (c cVar : values()) {
                for (String str : cVar.d()) {
                    f28266h.put(str, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c() {
            return this.f28268a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String[] d() {
            return this.f28269b;
        }

        c(int i10, String[] strArr) {
            this.f28268a = i10;
            this.f28269b = strArr;
        }
    }

    private static JSONObject a(Context context) {
        return a(context, f28259e);
    }

    /* JADX INFO: renamed from: com.ironsource.bd$a */
    public class a extends ArrayList<String> {
        public a() {
            add("com.android.vending");
            add(C3399bd.f28255a);
        }
    }

    private static String a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(Context context) {
        Iterator<String> it = f28259e.iterator();
        while (it.hasNext()) {
            String strA = a(context, it.next());
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
        }
        return "";
    }

    private static ArrayList<String> c(Context context) {
        List<ApplicationInfo> listH = Lb.U().i().H(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : listH) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase(Locale.getDefault()));
            }
        }
        return arrayList;
    }

    public static Integer d(Context context) {
        JSONObject jSONObjectA = a(context, (ArrayList<String>) c.b());
        int iPow = 0;
        for (c cVar : c.values()) {
            for (String str : cVar.d()) {
                JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(str);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                    iPow = (int) (((double) iPow) + Math.pow(2.0d, cVar.c() - 1));
                    break;
                }
            }
        }
        return Integer.valueOf(iPow);
    }

    public static boolean e(Context context) {
        JSONObject jSONObjectA = a(context);
        Iterator<String> itKeys = jSONObjectA.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject = jSONObjectA.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    private static JSONObject a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            ArrayList<String> arrayListC = c(context);
            for (String str : arrayList) {
                jSONObjectJsonObjectInit.put(str, a(arrayListC.contains(str.trim().toLowerCase(Locale.getDefault()))));
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            Log.d(f28258d, "Error while extracting packages installation data");
        }
        return jSONObjectJsonObjectInit;
    }

    private static JSONObject a(boolean z10) throws JSONException {
        return SafeIronSourceIronsourceBridge.com_ironsource_bd$b_jsonObjectInit(z10);
    }
}
