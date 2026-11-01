package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseSameDiTool.java */
/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f35293a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f35294b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f35295c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f35296d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f35297e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f35298f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f35299g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f35300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f35301i;

    /* JADX INFO: compiled from: BaseSameDiTool.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35302a;

        public a(Context context) {
            this.f35302a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f35302a);
                    g.a(advertisingIdInfo.getId());
                    g.f35296d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    g.b(this.f35302a, advertisingIdInfo.getId(), g.f35296d);
                } catch (Exception unused) {
                    q0.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        c.b bVarA = new c().a(this.f35302a);
                        g.a(bVarA.a());
                        g.f35296d = bVarA.b() ? 1 : 0;
                        g.b(this.f35302a, bVarA.a(), g.f35296d);
                    } catch (Exception unused2) {
                        q0.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th2) {
                    q0.b("DomainSameDiTool", th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i10) {
        try {
            if (a1.b(str)) {
                y0.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            y0.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i10));
        } catch (Exception e10) {
            q0.b("DomainSameDiTool", e10.getMessage());
        }
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f35294b) ? "" : f35294b;
        }
        if (!TextUtils.isEmpty(f35294b)) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
                return f35294b;
            }
            return f35296d == 0 ? f35294b : "";
        }
        if (!f35295c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f35295c = true;
        }
        return "";
    }

    public static int a() {
        return f35296d;
    }

    public static String e() {
        if (TextUtils.isEmpty(f35299g) && !f35298f) {
            b();
        }
        return f35299g;
    }

    public static void a(int i10) {
        f35296d = i10;
    }

    public static String d() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            if (TextUtils.isEmpty(f35293a)) {
                return "";
            }
            return f35293a;
        }
        if (TextUtils.isEmpty(f35293a)) {
            m0.k();
            if (!f35295c) {
                a(com.mbridge.msdk.foundation.controller.c.n().d());
                f35295c = true;
            }
            if (TextUtils.isEmpty(f35293a)) {
                return "";
            }
            return f35293a;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
            if (f35296d != 0) {
                return "";
            }
            return f35293a;
        }
        return f35293a;
    }

    public static void a(Context context) {
        new Thread(new a(context)).start();
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f35298f) {
            return f35297e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING);
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    f35299g = string2;
                    f35297e = k0.b(string2);
                }
            } catch (Settings.SettingNotFoundException e10) {
                q0.b("DomainSameDiTool", e10.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("DomainSameDiTool", th2.getMessage());
        }
        f35298f = true;
        return f35297e;
    }

    public static void a(String str) {
        f35294b = k0.b(str);
        f35293a = str;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean b(Context context) {
        try {
            if (f35301i) {
                return f35300h;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                f35300h = context.getPackageManager().checkPermission(k0.a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
            } else {
                f35300h = true;
            }
            f35301i = true;
            return f35300h;
        } catch (Exception unused) {
            f35300h = false;
        }
    }
}
