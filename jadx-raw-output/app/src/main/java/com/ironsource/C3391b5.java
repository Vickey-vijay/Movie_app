package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3391b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f28216a = "b5";

    public static JSONObject a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        String limitAdTracking = SDKUtils.getLimitAdTracking();
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(f28216a, "add AID");
                jSONObjectJsonObjectInit.put("deviceIds" + C3426d4.j.f28586d + C3426d4.j.L + C3426d4.j.f28588e, SDKUtils.encodeString(advertiserId));
            }
            if (!TextUtils.isEmpty(limitAdTracking)) {
                Logger.i(f28216a, "add LAT");
                jSONObjectJsonObjectInit.put("isLimitAdTrackingEnabled", Boolean.parseBoolean(limitAdTracking));
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit;
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        a(jSONObjectJsonObjectInit);
        d(context, jSONObjectJsonObjectInit);
        c(jSONObjectJsonObjectInit);
        b(context, jSONObjectJsonObjectInit);
        g(context, jSONObjectJsonObjectInit);
        e(context, jSONObjectJsonObjectInit);
        b(jSONObjectJsonObjectInit);
        f(context, jSONObjectJsonObjectInit);
        c(context, jSONObjectJsonObjectInit);
        a(context, jSONObjectJsonObjectInit);
        h(context, jSONObjectJsonObjectInit);
        return jSONObjectJsonObjectInit;
    }

    private static void c(JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C3426d4.j.f28624y), SDKUtils.encodeString(String.valueOf(Lb.U().i().h())));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void f(Context context, JSONObject jSONObject) {
        B7 b7I = Lb.U().i();
        try {
            if (a(C3426d4.j.f28601k0)) {
                jSONObject.put(SDKUtils.encodeString(C3426d4.j.f28601k0), b7I.C(context));
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void h(Context context, JSONObject jSONObject) {
        B7 b7I = Lb.U().i();
        try {
            if (a(C3426d4.j.f28607n0)) {
                jSONObject.put(SDKUtils.encodeString(C3426d4.j.f28607n0), b7I.h(context));
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void d(Context context, JSONObject jSONObject) {
        try {
            String strB = C3372a4.b(context);
            String strD = C3372a4.d(context);
            if (!TextUtils.isEmpty(strD)) {
                jSONObject.put(SDKUtils.encodeString("rawConnectionType"), SDKUtils.encodeString(strD));
            }
            if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(strB));
            }
            jSONObject.put(SDKUtils.encodeString("hasVPN"), C3372a4.e(context));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void e(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C3426d4.j.P), C3409c5.b(context).a(context));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void g(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(Q6.Z0), Lb.U().i().J(context));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void c(Context context, JSONObject jSONObject) {
        B7 b7I = Lb.U().i();
        try {
            if (a(C3426d4.j.f28603l0)) {
                jSONObject.put(SDKUtils.encodeString(C3426d4.j.f28603l0), b7I.D(context));
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put(SDKUtils.encodeString(C3426d4.j.Y), Lb.U().i().k(context));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public static JSONObject c(Context context) {
        B7 b7I = Lb.U().i();
        C3409c5 c3409c5B = C3409c5.b(context);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            String strD = c3409c5B.d();
            if (strD != null) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(strD));
            }
            String strC = c3409c5B.c();
            if (strC != null) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(strC));
            }
            String strE = c3409c5B.e();
            if (strE != null) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.f28604m), SDKUtils.encodeString(strE));
            }
            String strF = c3409c5B.f();
            if (strF != null) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceOSVersion"), strF.replaceAll("[^0-9/.]", ""));
            }
            String strF2 = c3409c5B.f();
            if (strF2 != null) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.f28608o), SDKUtils.encodeString(strF2));
            }
            jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceApiLevel"), String.valueOf(c3409c5B.a()));
            jSONObjectJsonObjectInit.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            if (c3409c5B.b() != null && c3409c5B.b().length() > 0) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.f28614r), SDKUtils.encodeString(c3409c5B.b()));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase(Locale.getDefault())));
            }
            if (a(C3426d4.j.f28599j0)) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.f28599j0), SDKUtils.encodeString(String.valueOf(b7I.q(context))));
            }
            String strG = C1.g(context);
            if (!TextUtils.isEmpty(strG)) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(strG));
            }
            String strValueOf = String.valueOf(b7I.r());
            if (!TextUtils.isEmpty(strValueOf)) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.K), SDKUtils.encodeString(strValueOf));
            }
            String strValueOf2 = String.valueOf(b7I.p());
            if (!TextUtils.isEmpty(strValueOf2)) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.O), SDKUtils.encodeString(strValueOf2));
            }
            jSONObjectJsonObjectInit.put(SDKUtils.encodeString("gpi"), C3399bd.e(context));
            jSONObjectJsonObjectInit.put("mcc", Z3.b(context));
            jSONObjectJsonObjectInit.put("mnc", Z3.c(context));
            jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.S), Z3.f(context));
            jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.R), SDKUtils.encodeString(Z3.g(context)));
            jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.V), C1.f(context));
            jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.X), C1.d(context));
            jSONObjectJsonObjectInit.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(C1.b(context)));
            jSONObjectJsonObjectInit.put(SDKUtils.encodeString("stid"), C3399bd.d(context));
            String strE2 = C1.e(context);
            if (!TextUtils.isEmpty(strE2)) {
                jSONObjectJsonObjectInit.put(SDKUtils.encodeString(C3426d4.j.f28585c0), SDKUtils.encodeString(strE2));
            }
            jSONObjectJsonObjectInit.put(C3426d4.j.f28587d0, SDKUtils.encodeString(String.valueOf(b7I.a())));
            jSONObjectJsonObjectInit.put(C3426d4.j.f28589e0, SDKUtils.encodeString(String.valueOf(b7I.m())));
            String strG2 = b7I.G(context);
            if (!TextUtils.isEmpty(strG2)) {
                jSONObjectJsonObjectInit.put("icc", strG2);
            }
            String strD2 = b7I.d();
            if (!TextUtils.isEmpty(strD2)) {
                jSONObjectJsonObjectInit.put("tz", SDKUtils.encodeString(strD2));
            }
            jSONObjectJsonObjectInit.put("uxt", IronSourceStorageUtils.isUxt());
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit;
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void b(JSONObject jSONObject) {
        B7 b7I = Lb.U().i();
        try {
            if (a(C3426d4.j.f28597i0)) {
                jSONObject.put(SDKUtils.encodeString(C3426d4.j.f28597i0), b7I.j());
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static boolean a(String str) {
        return SDKUtils.getControllerConfigAsJSONObject().optBoolean(str);
    }

    private static void a(JSONObject jSONObject) {
        B7 b7I = Lb.U().i();
        try {
            a(jSONObject, C3426d4.j.H, String.valueOf(b7I.k()));
            a(jSONObject, C3426d4.j.I, String.valueOf(b7I.c()));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private static void a(Context context, JSONObject jSONObject) {
        B7 b7I = Lb.U().i();
        try {
            if (a(C3426d4.j.f28605m0)) {
                jSONObject.put(SDKUtils.encodeString(C3426d4.j.f28605m0), b7I.e(context));
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }
}
