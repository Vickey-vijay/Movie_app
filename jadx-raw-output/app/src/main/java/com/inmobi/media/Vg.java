package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.inmobi.media.Vg;
import com.inmobi.media.Wg;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f23705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C2961jh f23706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f23707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final mj.g f23708d = kotlin.b.a(new bk.a() { // from class: b7.y4
        @Override // bk.a
        public final Object invoke() {
            return Boolean.valueOf(Vg.c());
        }
    });

    public static void a() {
        Ea eaA;
        Context context = Ji.f22951a;
        String string = null;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f22576b;
            eaA = Da.a(context, "purchase_store");
        } else {
            eaA = null;
        }
        if (eaA != null) {
            ck.p.j("purchase_pref", C3426d4.i.W);
            string = eaA.f22577a.getString("purchase_pref", null);
        }
        if (string != null) {
            f23705a = string;
        }
    }

    public static void b() {
        try {
            Context context = Ji.f22951a;
            if (context == null) {
                return;
            }
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(SignalsConfig.class, "clazz");
            if (((SignalsConfig) Y3.f23815a.a(SignalsConfig.class)).getPurchases().getInapp()) {
                a();
                if (a(context)) {
                    f23707c = 1;
                    C2961jh c2961jh = new C2961jh();
                    f23706b = c2961jh;
                    c2961jh.a(context, new bk.l() { // from class: b7.z4
                        @Override // bk.l
                        public final Object invoke(Object obj) {
                            return Vg.a((Wg) obj);
                        }
                    });
                }
            }
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e10));
            e10.getMessage();
        }
    }

    public static final boolean c() {
        try {
            Class.forName("com.android.billingclient.api.BillingClient");
            return true;
        } catch (ClassNotFoundException e10) {
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e10));
            return false;
        } catch (Exception e11) {
            mj.g gVar2 = P9.f23321a;
            P9.a(new L2(e11));
            e11.getMessage();
            return false;
        }
    }

    public static final mj.r a(Wg wg2) throws JSONException {
        Ea eaA;
        f23707c = 2;
        if (wg2 == null) {
            C2961jh c2961jh = f23706b;
            if (c2961jh != null) {
                c2961jh.f24615a = null;
                BillingClient billingClient = c2961jh.f24616b;
                if (billingClient != null) {
                    billingClient.endConnection();
                }
            }
            f23706b = null;
            return mj.r.f64562a;
        }
        wg2.toString();
        JSONObject jSONObject = new JSONObject();
        int i10 = wg2.f23748a;
        if (i10 > 0) {
            jSONObject.put("p", i10);
        }
        int i11 = wg2.f23749b;
        if (i11 > 0) {
            jSONObject.put("s", i11);
        }
        String string = jSONObject.length() == 0 ? null : jSONObject.toString();
        if (string != null) {
            f23705a = string;
            ck.p.j(string, "nipMapJSON");
            ck.p.j(string, "nipMapJSON");
            Context context = Ji.f22951a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                eaA = Da.a(context, "purchase_store");
            } else {
                eaA = null;
            }
            if (eaA != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f22576b;
                eaA.a("purchase_pref", string, false);
            }
        }
        C2961jh c2961jh2 = f23706b;
        if (c2961jh2 != null) {
            c2961jh2.f24615a = null;
            BillingClient billingClient2 = c2961jh2.f24616b;
            if (billingClient2 != null) {
                billingClient2.endConnection();
            }
        }
        f23706b = null;
        return mj.r.f64562a;
    }

    public static boolean b(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            ck.p.i(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(SignalsConfig.class, "clazz");
            boolean zU = nj.b0.U(((SignalsConfig) Y3.f23815a.a(SignalsConfig.class)).getPurchases().getVersionList(), string);
            if (!zU) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (string == null) {
                    string = "";
                }
                linkedHashMap.put("trigger", string);
                Wj wj2 = Wj.f23753a;
                Wj.b("BillingClientNotCompatible", linkedHashMap, EnumC2735ak.SDK);
            }
            return zU;
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e10));
            e10.getMessage();
            return false;
        }
    }

    public static boolean a(Context context) {
        short s10;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        C3298x5.f25687a.getClass();
        if (!C3298x5.v()) {
            return false;
        }
        if (!((Boolean) f23708d.getValue()).booleanValue()) {
            AbstractC2758bh.a(new Yg((short) 2230));
            return false;
        }
        if (!b(context)) {
            return false;
        }
        int i10 = f23707c;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        if (i10 != 1) {
            s10 = i10 != 2 ? (short) 0 : (short) 2232;
        } else {
            s10 = 2231;
        }
        AbstractC2758bh.a(new Yg(s10));
        return false;
    }
}
