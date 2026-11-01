package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.safedk.android.analytics.events.CrashEvent;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Zl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4667ya f56299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X9 f56300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gi f56301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ae f56302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Im f56303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4233h3 f56304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4435p2 f56305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C4267ib f56306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Fm f56307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C4520sd f56308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E9 f56309k;

    public Zl() {
        this(new C4267ib(), new C4667ya(), new X9(), new Gi(), new Ae(), new Im(), new C4233h3(), new C4435p2(), new Fm(), new C4520sd(), new E9());
    }

    public Zl(C4267ib c4267ib, C4667ya c4667ya, X9 x10, Gi gi2, Ae ae2, Im im2, C4233h3 c4233h3, C4435p2 c4435p2, Fm fm2, C4520sd c4520sd, E9 e10) {
        this.f56299a = c4667ya;
        this.f56300b = x10;
        this.f56301c = gi2;
        this.f56302d = ae2;
        this.f56303e = im2;
        this.f56304f = c4233h3;
        this.f56305g = c4435p2;
        this.f56306h = c4267ib;
        this.f56307i = fm2;
        this.f56308j = c4520sd;
        this.f56309k = e10;
    }

    public final void a(C4174em c4174em, C4215gb c4215gb) {
        long jOptLong;
        long jOptLong2;
        String string;
        ArrayList arrayListA;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4 = c4215gb.optJSONObject("queries");
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("list")) != null && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("host")) != null) {
            c4174em.f56681g = jSONObjectOptJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c4215gb.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject jSONObjectOptJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (jSONObjectOptJSONObject5 != null) {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(next);
                if (jSONObjectOptJSONObject6 != null && jSONObjectOptJSONObject6.has("value")) {
                    map.put(next, jSONObjectOptJSONObject6.getString("value"));
                }
            }
            c4174em.f56684j = Gm.a((Map) map);
        }
        JSONObject jSONObjectOptJSONObject7 = c4215gb.optJSONObject(CommonUrlParts.LOCALE);
        String string2 = "";
        c4174em.f56687m = (jSONObjectOptJSONObject7 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject7.optJSONObject("country")) == null || !jSONObjectOptJSONObject.optBoolean("reliable", false)) ? "" : jSONObjectOptJSONObject.optString("value", "");
        JSONObject jSONObjectOptJSONObject8 = c4215gb.optJSONObject("time");
        if (jSONObjectOptJSONObject8 != null) {
            try {
                c4174em.f56686l = Long.valueOf(jSONObjectOptJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C4629wm c4629wm = new C4629wm();
        JSONObject jSONObjectOptJSONObject9 = c4215gb.optJSONObject("stat_sending");
        if (jSONObjectOptJSONObject9 != null) {
            c4629wm.f57898a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject9, "disabled_reporting_interval_seconds", c4629wm.f57898a);
        }
        this.f56303e.getClass();
        c4174em.f56690p = new Hm(c4629wm.f57898a);
        this.f56300b.getClass();
        C4529sm c4529sm = new C4529sm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c4215gb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject jSONObjectOptJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (jSONObjectOptJSONObject10 != null) {
                C4311k4 c4311k4 = new C4311k4();
                c4311k4.f57071a = X9.a(jSONObjectOptJSONObject10, "permissions_collecting", c4529sm.f57688a);
                c4311k4.f57072b = X9.a(jSONObjectOptJSONObject10, "features_collecting", c4529sm.f57689b);
                c4311k4.f57073c = X9.a(jSONObjectOptJSONObject10, "google_aid", c4529sm.f57690c);
                c4311k4.f57074d = X9.a(jSONObjectOptJSONObject10, "sim_info", c4529sm.f57691d);
                c4311k4.f57075e = X9.a(jSONObjectOptJSONObject10, "huawei_oaid", c4529sm.f57692e);
                c4311k4.f57076f = jSONObjectOptJSONObject10.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c4174em.f56676b = new C4362m4(c4311k4);
            }
        } catch (Throwable unused4) {
        }
        this.f56299a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c4215gb.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject jSONObjectOptJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (jSONObjectOptJSONObject11 != null) {
                try {
                    string = jSONObjectOptJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    string = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    c4174em.f56678d = string;
                }
                ArrayList arrayListA2 = C4667ya.a(jSONObjectOptJSONObject11, CrashEvent.f44624e);
                if (!mo.a((Collection) arrayListA2)) {
                    c4174em.f56679e = arrayListA2;
                }
                try {
                    string2 = jSONObjectOptJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(string2)) {
                    c4174em.f56680f = string2;
                }
                ArrayList arrayListA3 = C4667ya.a(jSONObjectOptJSONObject11, "startup");
                if (!mo.a((Collection) arrayListA3)) {
                    c4174em.f56677c = arrayListA3;
                }
                ArrayList arrayListA4 = C4667ya.a(jSONObjectOptJSONObject11, "diagnostic");
                if (!mo.a((Collection) arrayListA4)) {
                    c4174em.f56688n = arrayListA4;
                }
                HashMap map2 = new HashMap();
                Iterator<String> itKeys2 = jSONObjectOptJSONObject11.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!C4667ya.f58019a.contains(next2) && (arrayListA = C4667ya.a(jSONObjectOptJSONObject11, next2)) != null) {
                        map2.put(next2, arrayListA);
                    }
                }
                c4174em.f56689o = map2;
            }
        } catch (Throwable unused8) {
        }
        this.f56301c.getClass();
        C4654xm c4654xm = new C4654xm();
        JSONObject jSONObjectOptJSONObject12 = c4215gb.optJSONObject("retry_policy");
        int iOptInt = c4654xm.f57968w;
        int iOptInt2 = c4654xm.f57969x;
        if (jSONObjectOptJSONObject12 != null) {
            iOptInt = jSONObjectOptJSONObject12.optInt("max_interval_seconds", iOptInt);
            iOptInt2 = jSONObjectOptJSONObject12.optInt("exponential_multiplier", c4654xm.f57969x);
        }
        c4174em.f56691q = new RetryPolicyConfig(iOptInt, iOptInt2);
        this.f56302d.getClass();
        if (c4174em.f56676b.f57241a) {
            JSONObject jSONObjectOptJSONObject13 = c4215gb.optJSONObject("permissions_collecting");
            C4579um c4579um = new C4579um();
            if (jSONObjectOptJSONObject13 != null) {
                jOptLong = jSONObjectOptJSONObject13.optLong("check_interval_seconds", c4579um.f57777a);
                jOptLong2 = jSONObjectOptJSONObject13.optLong("force_send_interval_seconds", c4579um.f57778b);
            } else {
                jOptLong = c4579um.f57777a;
                jOptLong2 = c4579um.f57778b;
            }
            c4174em.f56685k = new C4671ye(jOptLong, jOptLong2);
        }
        C4233h3 c4233h3 = this.f56304f;
        c4233h3.getClass();
        C4455pm c4455pm = new C4455pm();
        JSONObject jSONObjectOptJSONObject14 = c4215gb.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject14 != null) {
            c4455pm.f57526a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject14, "last_known_location_ttl", c4455pm.f57526a);
        }
        c4233h3.f56875a.getClass();
        c4174em.f56692r = new C4155e3(c4455pm.f57526a);
        this.f56305g.getClass();
        C4435p2.a(c4174em, c4215gb);
        Fm fm2 = this.f56307i;
        fm2.getClass();
        JSONObject jSONObjectOptJSONObject15 = c4215gb.optJSONObject("startup_update");
        C4604vm c4604vm = new C4604vm();
        Integer numA = AbstractC4241hb.a(jSONObjectOptJSONObject15, "interval_seconds", null);
        if (numA != null) {
            c4604vm.f57849a = numA.intValue();
        }
        fm2.f55244a.getClass();
        c4174em.f56694t = new Dm(c4604vm.f57849a);
        Map<String, Zc> mapC = this.f56308j.f57658a.c();
        C4495rd c4495rd = new C4495rd(c4215gb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Zc> entry : mapC.entrySet()) {
            Object objInvoke = c4495rd.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(entry.getKey(), objInvoke);
            }
        }
        c4174em.f56695u = linkedHashMap;
        D9 d10 = this.f56309k.f55175a;
        C4504rm c4504rm = new C4504rm();
        JSONObject jSONObjectOptJSONObject16 = c4215gb.optJSONObject("external_attribution");
        if (jSONObjectOptJSONObject16 != null) {
            c4504rm.f57615a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(jSONObjectOptJSONObject16, "collecting_interval_seconds", c4504rm.f57615a);
        }
        d10.getClass();
        c4174em.f56696v = new C9(c4504rm.f57615a);
    }
}
