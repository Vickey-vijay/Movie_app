package sg.bigo.ads.controller.landing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.b.f;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.form.AdFormActivity;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WeakHashMap<sg.bigo.ads.ad.c<?, ?>, Integer> f71009a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f71010b = 0;

    public static int a(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 != 1) {
            return i10 != 2 ? 5 : 4;
        }
        return 3;
    }

    public static String a(String str, int i10, int i11) {
        try {
            if (str.contains("ad_imp_indx=__ad_imp_indx__")) {
                str = q.a(str, "ad_imp_indx=__ad_imp_indx__", "ad_imp_indx=".concat(String.valueOf(i10)), true);
            }
            return str.contains("ad_click_indx=__ad_click_indx__") ? q.a(str, "ad_click_indx=__ad_click_indx__", "ad_click_indx=".concat(String.valueOf(i11)), true) : str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static sg.bigo.ads.api.core.d a(Context context, Activity activity, String str, String str2, String str3, boolean z10, int i10, @Nullable JSONArray jSONArray, @Nullable sg.bigo.ads.ad.c<?, ?> cVar, boolean z11, boolean z12) {
        ArrayList arrayList;
        if (str != null) {
            arrayList = new ArrayList();
            arrayList.add(str);
        } else {
            arrayList = null;
        }
        return a(context, activity, arrayList, str2, str3, z10, i10, jSONArray, cVar, z11, z12);
    }

    public static sg.bigo.ads.api.core.d a(Context context, Activity activity, @Nullable List<String> list, String str, String str2, boolean z10, int i10, @Nullable JSONArray jSONArray, @Nullable sg.bigo.ads.ad.c<?, ?> cVar, boolean z11, boolean z12) {
        int i11;
        int i12;
        a aVar;
        sg.bigo.ads.api.core.d dVar = new sg.bigo.ads.api.core.d();
        boolean zA = false;
        dVar.f69359a = 0;
        if (cVar != null && (aVar = cVar.f67548m) != null && !aVar.b()) {
            aVar.a();
        }
        if (list != null) {
            for (int i13 = 0; i13 < list.size(); i13++) {
                String str3 = list.get(i13);
                if (!TextUtils.isEmpty(str3)) {
                    zA = sg.bigo.ads.core.landing.a.a(Uri.parse(str3), context, activity, dVar, str2, z12, cVar != null ? cVar.f().n() : null, true);
                    if (zA) {
                        if (cVar != null && (i12 = dVar.f69362d) >= 0) {
                            cVar.a(new c(i12, dVar.f69363e));
                        }
                        dVar.f69359a = 1;
                        break;
                    }
                }
            }
        }
        if (!zA && z10 && !TextUtils.isEmpty(str2) && (zA = sg.bigo.ads.core.landing.a.a(context, str2))) {
            dVar.f69359a = 4;
        }
        if (!zA && !TextUtils.isEmpty(str)) {
            Uri uri = Uri.parse(str);
            if (sg.bigo.ads.core.landing.a.a(str)) {
                dVar.f69359a = 2;
                zA = sg.bigo.ads.core.landing.a.a(uri, context, activity, dVar, z12, cVar != null ? cVar.f().n() : null, true);
                if (cVar != null && (i11 = dVar.f69362d) >= 0) {
                    cVar.a(new c(i11, dVar.f69363e));
                }
            } else {
                dVar.f69359a = 3;
                zA = i10 == 1 ? sg.bigo.ads.core.landing.a.a(context, str, jSONArray) : i10 == 2 ? a(context, str, cVar, dVar, z11) : a(context, str, cVar, dVar, 0, z11);
            }
        }
        dVar.f69370l = zA;
        if (zA && cVar != null) {
            sg.bigo.ads.api.core.b bVarF = cVar.f();
            if (cVar.f67557v != bVarF.y()) {
                cVar.f67555t = -1;
                cVar.f67557v = bVarF.y();
            }
            cVar.f67556u = System.currentTimeMillis();
            cVar.f67555t++;
        }
        if (dVar.f69362d == 1) {
            dVar.f69359a = 5;
        }
        return dVar;
    }

    public static void a() {
    }

    private static void a(int i10, @NonNull sg.bigo.ads.ad.c<?, ?> cVar) {
        WeakHashMap<sg.bigo.ads.ad.c<?, ?>, Integer> weakHashMap = f71009a;
        synchronized (weakHashMap) {
            weakHashMap.put(cVar, Integer.valueOf(i10));
        }
    }

    public static void a(Activity activity, final sg.bigo.ads.ad.c cVar) {
        if (activity == null || activity.getWindow() == null || cVar == null || cVar.y() == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f71010b < 2000) {
            return;
        }
        f71010b = jElapsedRealtime;
        final c cVarY = cVar.y();
        cVar.a((c) null);
        final View decorView = activity.getWindow().getDecorView();
        decorView.postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.landing.e.2
            @Override // java.lang.Runnable
            public final void run() {
                final boolean zIsShown = decorView.isShown();
                sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.controller.landing.e.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.api.core.b bVarF = cVar.f();
                        c cVar2 = cVarY;
                        sg.bigo.ads.core.d.b.b(bVarF, cVar2.f70979a, zIsShown ? 1 : 2, cVar2.f70980b);
                    }
                });
            }
        }, 1500L);
    }

    public static void a(Context context, Activity activity, String str, @Nullable sg.bigo.ads.ad.c<?, ?> cVar) {
        int iC;
        sg.bigo.ads.api.core.d dVar = new sg.bigo.ads.api.core.d();
        dVar.f69359a = 0;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri uri = Uri.parse(str);
        JSONArray jSONArrayD = null;
        if (sg.bigo.ads.core.landing.a.a(str)) {
            dVar.f69359a = 2;
            sg.bigo.ads.core.landing.a.a(uri, context, activity, dVar, false, cVar != null ? cVar.f().n() : null, true);
            return;
        }
        dVar.f69359a = 3;
        if (cVar != null) {
            iC = cVar.f().N().c();
            jSONArrayD = cVar.f().N().d();
        } else {
            iC = 0;
        }
        if (iC == 1) {
            sg.bigo.ads.core.landing.a.a(context, str, jSONArrayD);
        } else if (iC == 2) {
            a(context, str, cVar, dVar, false);
        } else {
            a(context, str, cVar, dVar, 0, false);
        }
    }

    public static boolean a(Context context, @NonNull Class<? extends sg.bigo.ads.controller.e.b<?>> cls, @NonNull sg.bigo.ads.ad.c<?, ?> cVar) {
        if (Build.VERSION.SDK_INT == 26) {
            sg.bigo.ads.core.d.b.a(cVar.f(), 3000, 10116, "android 8.0 cannot show popup");
            return false;
        }
        try {
            Intent intentB = AdActivity.b(context, cls);
            int iHashCode = cVar.hashCode();
            a(iHashCode, cVar);
            intentB.putExtra("ad_identifier", iHashCode);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentB);
            return true;
        } catch (Exception e10) {
            sg.bigo.ads.core.d.b.a(cVar.f(), 3000, 10116, Log.getStackTraceString(e10));
            return false;
        }
    }

    public static boolean a(Context context, @NonNull Class<? extends sg.bigo.ads.controller.e.b<?>> cls, @NonNull sg.bigo.ads.ad.c<?, ?> cVar, boolean z10) {
        try {
            Intent intentE = z10 ? AdActivity.e(context, cls) : AdActivity.d(context, cls);
            int iHashCode = cVar.hashCode();
            a(iHashCode, cVar);
            intentE.putExtra("ad_identifier", iHashCode);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentE);
            return true;
        } catch (Exception e10) {
            sg.bigo.ads.core.d.b.a(cVar.f(), 3000, 10116, Log.getStackTraceString(e10));
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public static boolean a(Context context, String str, @Nullable sg.bigo.ads.ad.c<?, ?> cVar, @NonNull sg.bigo.ads.api.core.d dVar, int i10, boolean z10) {
        LandingPageStyleConfig landingPageStyleConfigA;
        Intent intentC;
        int i11;
        Class<? extends d> cls;
        if (cVar != null) {
            try {
                WeakReference<sg.bigo.ads.ad.c.a> weakReference = cVar.f67558w;
                if (weakReference == null || weakReference.get() == null) {
                    landingPageStyleConfigA = null;
                } else {
                    landingPageStyleConfigA = cVar.f67558w.get().a(context, str, i10, z10);
                }
            } catch (Exception e10) {
                sg.bigo.ads.core.d.b.a(cVar != null ? cVar.f() : null, 3000, 10116, Log.getStackTraceString(e10));
                return false;
            }
        } else {
            landingPageStyleConfigA = null;
        }
        if (landingPageStyleConfigA == null || !landingPageStyleConfigA.a() || landingPageStyleConfigA.b()) {
            Class<? extends d> cls2 = d.class;
            if (landingPageStyleConfigA != null && (cls = landingPageStyleConfigA.f70937g) != null) {
                cls2 = cls;
            }
            intentC = z10 ? AdActivity.c(context, cls2) : AdActivity.a(context, cls2);
            i11 = 0;
        } else {
            i11 = landingPageStyleConfigA.f70931a;
            intentC = AdActivity.f(context, landingPageStyleConfigA.f70937g);
        }
        intentC.putExtra("layout_style", landingPageStyleConfigA);
        intentC.putExtra("webview_force_time", landingPageStyleConfigA != null ? landingPageStyleConfigA.f70932b : 1);
        if (cVar != null) {
            if (cVar.f().a(16) && !(cVar instanceof f)) {
                intentC.putExtra("try_gp_inline", true);
                intentC.putExtra("gp_inline_ad_bundle", cVar.f().n());
                int iX = cVar.f().x();
                intentC.putExtra("gp_inline_real_launch", iX == 2 || iX == 1 || iX == 15 || iX == 16 || iX == 17 || iX == 18 || cVar.f67554s == 2);
            }
        }
        intentC.putExtra("url", str);
        if (cVar != null) {
            int iHashCode = cVar.hashCode();
            a(iHashCode, cVar);
            intentC.putExtra("ad_identifier", iHashCode);
            intentC.putExtra("land_way", i10);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentC);
        if (dVar != null) {
            dVar.f69366h = i11;
        }
        return true;
    }

    private static boolean a(Context context, final String str, @Nullable final sg.bigo.ads.ad.c<?, ?> cVar, @NonNull final sg.bigo.ads.api.core.d dVar, final boolean z10) {
        final b bVar = new b(str, cVar == null ? null : cVar.f(), cVar, cVar != null ? cVar.f67548m : null);
        sg.bigo.ads.a.a.C0646a c0646a = new sg.bigo.ads.a.a.C0646a();
        c0646a.f67268a = str;
        c0646a.f67269b = bVar;
        c0646a.f67270c = new sg.bigo.ads.a.a.b() { // from class: sg.bigo.ads.controller.landing.e.1
            @Override // sg.bigo.ads.a.a.b
            public final void a(Context context2, String str2, int i10, String str3) {
                sg.bigo.ads.common.t.a.a(0, 3, "WebViewStatHelper", "Open landing page by chrome tabs failed, using webView.");
                e.a(context2, str, cVar, dVar, e.a(i10), z10);
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                sg.bigo.ads.ad.c cVar2 = cVar;
                sg.bigo.ads.core.d.b.a(cVar2 == null ? null : cVar2.f(), 3002, 10114, str3);
            }

            @Override // sg.bigo.ads.a.a.b
            public final void a(String str2, String str3, String str4) {
                b bVar2 = bVar;
                bVar2.f70960a = str2;
                bVar2.f70961b = str3;
                bVar2.f70962c = str4;
            }
        };
        c0646a.a().a(context);
        return true;
    }

    public static boolean a(Context context, sg.bigo.ads.ad.c<?, ?> cVar) {
        if (cVar == null) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) null, 3000, 10221, "ad == null, launchFormActivity failed");
            return false;
        }
        try {
            Intent intentA = AdFormActivity.a(context);
            int iHashCode = cVar.hashCode();
            int iZ = cVar.z();
            a(iHashCode, cVar);
            intentA.putExtra("ad_identifier", iHashCode);
            intentA.putExtra("open_form_time", iZ);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intentA);
            return true;
        } catch (Exception e10) {
            sg.bigo.ads.core.d.b.a(cVar.f(), 3000, 10221, Log.getStackTraceString(e10));
            return false;
        }
    }

    @Nullable
    public static sg.bigo.ads.ad.c<?, ?> b(int i10) {
        sg.bigo.ads.ad.c<?, ?> key;
        WeakHashMap<sg.bigo.ads.ad.c<?, ?>, Integer> weakHashMap = f71009a;
        synchronized (weakHashMap) {
            for (Map.Entry<sg.bigo.ads.ad.c<?, ?>, Integer> entry : weakHashMap.entrySet()) {
                if (entry.getValue().intValue() == i10) {
                    key = entry.getKey();
                }
            }
            key = null;
        }
        return key;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }
}
