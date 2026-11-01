package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class R6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B7 f27540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f27541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f27542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f27543d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f27544a;

        public a(Context context) {
            this.f27544a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                R6.this.e(this.f27544a);
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            R6.this.f27542c.set(false);
        }
    }

    private R6() {
        this.f27542c = new AtomicBoolean(false);
        this.f27543d = new AtomicBoolean(false);
        this.f27540a = Lb.U().i();
        this.f27541b = new ConcurrentHashMap<>();
    }

    public static R6 b() {
        return b.f27546a;
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static volatile R6 f27546a = new R6();

        private b() {
        }
    }

    private void d(Context context) {
        if (context == null || this.f27543d.getAndSet(true)) {
            return;
        }
        a("auid", this.f27540a.d(context));
        a("model", this.f27540a.l());
        a(Q6.f27469t, this.f27540a.q());
        a(Q6.F, this.f27540a.f());
        a(Q6.f27457p, this.f27540a.L(context));
        String adQualitySdkVersion = AdQualityBridge.getAdQualitySdkVersion();
        if (!TextUtils.isEmpty(adQualitySdkVersion)) {
            a(Q6.C1, adQualitySdkVersion);
        }
        String strI = this.f27540a.i();
        if (strI != null) {
            a(Q6.G, strI.replaceAll("[^0-9/.]", ""));
            a(Q6.J, strI);
        }
        a(Q6.f27412a, String.valueOf(this.f27540a.e()));
        String strU = this.f27540a.u(context);
        if (!TextUtils.isEmpty(strU)) {
            a(Q6.Q0, strU);
        }
        String strE = C1.e(context);
        if (!TextUtils.isEmpty(strE)) {
            a(Q6.f27454o, strE);
        }
        String strR = this.f27540a.r(context);
        if (!TextUtils.isEmpty(strR)) {
            a(Q6.f27479w0, strR);
        }
        a("bid", context.getPackageName());
        a("mem", String.valueOf(this.f27540a.q(context)));
        a(Q6.f27416b0, "2.0");
        a(Q6.f27419c0, Long.valueOf(C1.f(context)));
        a(Q6.f27413a0, Long.valueOf(C1.d(context)));
        a(Q6.f27421d, C1.b(context));
        a(Q6.O, Integer.valueOf(Z3.f(context)));
        a(Q6.Y, Z3.g(context));
        a("stid", C3399bd.d(context));
        a("platform", "android");
        a("osArch", this.f27540a.t());
        a("mThreshold", this.f27540a.a(this.f27540a.n(context)));
        a(Q6.f27434h0, KotlinVersion.CURRENT.toString());
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String strI = this.f27540a.I(context);
            if (!TextUtils.isEmpty(strI)) {
                a(Q6.V0, strI);
            }
            String strB = this.f27540a.b(context);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            a(Q6.f27466s, Boolean.valueOf(Boolean.parseBoolean(strB)));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void f(Context context) {
        if (context == null) {
            return;
        }
        a(context);
        String strY = this.f27540a.y(context);
        if (!TextUtils.isEmpty(strY)) {
            a(Q6.L0, strY);
        } else if (a(Q6.L0)) {
            b(Q6.L0);
        }
        a("idfi", this.f27540a.i(context));
        String strC = this.f27540a.c(context);
        if (!TextUtils.isEmpty(strC)) {
            a(Q6.f27460q, strC.toUpperCase(Locale.getDefault()));
        }
        a(Q6.f27463r, this.f27540a.A(context));
        String strD = this.f27540a.d();
        if (!TextUtils.isEmpty(strD)) {
            a("tz", strD);
        }
        String strB = C3372a4.b(context);
        if (!TextUtils.isEmpty(strB) && !strB.equals("none")) {
            a(Q6.f27439j, strB);
        }
        String strD2 = C3372a4.d(context);
        if (!TextUtils.isEmpty(strD2)) {
            a(Q6.f27442k, strD2);
        }
        a("vpn", Boolean.valueOf(C3372a4.e(context)));
        String strG = this.f27540a.G(context);
        if (!TextUtils.isEmpty(strG)) {
            a("icc", strG);
        }
        int iS = this.f27540a.s(context);
        if (iS >= 0) {
            a(Q6.f27444k1, Integer.valueOf(iS));
        }
        a(Q6.f27447l1, this.f27540a.v(context));
        a(Q6.f27450m1, this.f27540a.F(context));
        a(Q6.f27437i0, Float.valueOf(this.f27540a.E(context)));
        a(Q6.f27448m, String.valueOf(this.f27540a.h()));
        a(Q6.R, Integer.valueOf(this.f27540a.k()));
        a(Q6.Q, Integer.valueOf(this.f27540a.c()));
        a(Q6.Y0, String.valueOf(this.f27540a.a()));
        a(Q6.f27435h1, String.valueOf(this.f27540a.m()));
        a("mcc", Integer.valueOf(Z3.b(context)));
        a("mnc", Integer.valueOf(Z3.c(context)));
        a(Q6.T, Boolean.valueOf(this.f27540a.j()));
        a(Q6.f27430g, Boolean.valueOf(this.f27540a.C(context)));
        a(Q6.f27433h, Integer.valueOf(this.f27540a.D(context)));
        a(Q6.f27415b, Boolean.valueOf(this.f27540a.e(context)));
        a(Q6.K, Boolean.valueOf(this.f27540a.h(context)));
        a("rt", Boolean.valueOf(this.f27540a.p()));
        a(Q6.Z, String.valueOf(this.f27540a.r()));
        a(Q6.f27424e, Integer.valueOf(this.f27540a.k(context)));
        a(Q6.Z0, Boolean.valueOf(this.f27540a.J(context)));
        a(Q6.f27418c, this.f27540a.m(context));
        a(Q6.f27422d0, this.f27540a.s());
        C3807z c3807z = new C3807z(Lb.U().s());
        HashMap map = new HashMap();
        c3807z.a(map);
        a(Q6.E0, map);
        a(Q6.L, ConfigFile.getConfigFile().getPluginType());
        a(Q6.M, ConfigFile.getConfigFile().getPluginVersion());
        a(Q6.N, ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    public void b(String str, Object obj) {
        a(str, obj);
    }

    public void b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.f27541b.remove(str);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void c(Context context) {
        try {
            d(context);
            f(context);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public JSONObject b(Context context) throws JSONException {
        f(context);
        return new JSONObject(T6.a(this.f27541b));
    }

    public void a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            Object obj = this.f27541b.get(str);
            if (!(obj instanceof JSONArray)) {
                a(str, (Object) jSONArray);
                return;
            }
            JSONArray jSONArray2 = (JSONArray) obj;
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                jSONArray2.put(jSONArray.get(i10));
            }
            a(str, (Object) jSONArray2);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.f27541b.get(str);
            if (!(obj instanceof JSONObject)) {
                a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (Object) jSONObject2);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.f27541b.put(str, obj);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(String str) {
        return str != null && this.f27541b.containsKey(str);
    }

    private void a(Context context) {
        if (this.f27542c.get()) {
            return;
        }
        try {
            this.f27542c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            this.f27542c.set(false);
        }
    }

    private void a() {
        String strA = C3456eg.f28795a.a();
        if (strA != null) {
            HashMap map = new HashMap();
            map.put("sdk", strA);
            HashMap map2 = new HashMap();
            map2.put(Q6.H1, map);
            Map<String, Object> map3 = new HashMap<>();
            map3.put(Q6.E1, map2);
            a(map3);
        }
    }
}
