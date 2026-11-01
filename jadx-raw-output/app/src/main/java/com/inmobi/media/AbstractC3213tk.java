package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.AbstractC3213tk;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okio.Buffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3213tk {
    public static String a(Map map, String str) throws JSONException {
        Map map2;
        String string;
        C3053n9 c3053n9A = Jh.a("getToken", "AB");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            String str2 = (String) map.get("tp");
            if (!TextUtils.isEmpty(str2)) {
                Ki.f23020b = str2;
            }
            String str3 = (String) map.get("tp-v");
            if (!TextUtils.isEmpty(str3)) {
                Ki.f23019a = str3;
            }
        }
        a();
        if (!Ji.d()) {
            if (c3053n9A != null) {
                ck.p.i("com.inmobi.media.tk", "LOG_TAG");
                c3053n9A.b("com.inmobi.media.tk", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, jCurrentTimeMillis, c3053n9A);
            return null;
        }
        Context context = Ji.f22951a;
        C2859ff c2859ff = context != null ? new C2859ff(context, c3053n9A) : null;
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(RootConfig.class, "clazz");
        C2924i4 c2924i5 = Y3.f23815a;
        if (((RootConfig) c2924i5.a(RootConfig.class)).isMonetizationDisabled()) {
            a(2012, jCurrentTimeMillis, c3053n9A);
            if (c3053n9A != null) {
                ck.p.i("com.inmobi.media.tk", "LOG_TAG");
                c3053n9A.b("com.inmobi.media.tk", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        ck.p.j(AdConfig.class, "clazz");
        Ak ak2 = new Ak(((AdConfig) c2924i5.a(AdConfig.class)).getIncludeIdParams());
        C3238uk c3238uk = new C3238uk(str, map);
        C2808df c2808dfA = c2859ff != null ? c2859ff.a() : null;
        ck.p.j(ak2, "uidMap");
        ck.p.j(c3238uk, "metaData");
        ck.p.j("https://www.123.com", "url");
        ck.p.j("https://www.123.com", "url");
        ck.p.j(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) c2924i5.a(SignalsConfig.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strA = AbstractC3301x8.a();
        if (strA != null) {
        }
        ck.p.j(linkedHashMap, "<this>");
        Pk pkA = Ok.a();
        String str4 = pkA.f23345a;
        if (str4 != null) {
        }
        linkedHashMap.put("is-unifid-service-used", String.valueOf(pkA.f23346b));
        AbstractC3277w9.d(linkedHashMap);
        linkedHashMap.put("d-media-volume", String.valueOf(C3298x5.f25687a.a(Ji.f22951a, false)));
        linkedHashMap.putAll(ak2.a());
        String str5 = c3238uk.f25488a;
        if (str5 != null) {
        }
        HashMap map3 = new HashMap();
        map3.putAll(X3.f23778a);
        linkedHashMap.putAll(map3);
        Map map4 = c3238uk.f25489b;
        ck.p.j(linkedHashMap, "<this>");
        if (map4 != null) {
            for (Map.Entry entry : map4.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!linkedHashMap.containsKey(str6)) {
                    linkedHashMap.put(str6, str7);
                }
            }
        }
        ck.p.j(linkedHashMap, "<this>");
        C2924i4 c2924i6 = Y3.f23815a;
        ck.p.j(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) Y3.f23815a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String string2 = ext.toString();
            ck.p.i(string2, "toString(...)");
            linkedHashMap.put("im-ext", string2);
        }
        ck.p.j(linkedHashMap, "<this>");
        C3298x5 c3298x5 = C3298x5.f25687a;
        c3298x5.getClass();
        if (C3298x5.q()) {
            if (J5.f22897e) {
                string = null;
            } else {
                string = J5.f22895c;
                if (string == null) {
                    Context context2 = Ji.f22951a;
                    if (context2 == null) {
                        string = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                        Ea eaA = Da.a(context2, "display_info_store");
                        ck.p.j("gesture_margin", C3426d4.i.W);
                        string = eaA.f22577a.getString("gesture_margin", null);
                    }
                    J5.f22895c = string;
                }
            }
            if (string != null) {
                linkedHashMap.put("d-device-gesture-margins", string);
            }
        }
        AbstractC3277w9.c(linkedHashMap);
        AbstractC3277w9.e(linkedHashMap);
        AbstractC3277w9.a(linkedHashMap);
        AbstractC3277w9.b(linkedHashMap);
        linkedHashMap.put("h-user-agent", Ji.c());
        ck.p.j(linkedHashMap, "<this>");
        String str8 = Vg.f23705a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str9 = Vg.f23705a;
        if (str9 != null) {
            linkedHashMap2.put("u-nip", str9);
        } else {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.putAll(Tg.a());
        linkedHashMap.putAll(J5.c());
        linkedHashMap.putAll(O2.a());
        if (c2808dfA != null && (map2 = c2808dfA.f24240a) != null) {
            linkedHashMap.putAll(map2);
        }
        ck.p.j(linkedHashMap, "<this>");
        mj.g gVar = E0.f22558c;
        if (!((CopyOnWriteArrayList) gVar.getValue()).isEmpty()) {
            String string3 = new JSONArray((Collection) gVar.getValue()).toString();
            ck.p.i(string3, "toString(...)");
            linkedHashMap.put("u-r-crid", string3);
        }
        JSONObject jSONObjectA = W8.f23730c.a();
        if (jSONObjectA.length() > 0) {
            String string4 = jSONObjectA.toString();
            ck.p.i(string4, "toString(...)");
            linkedHashMap.put("audioObject", string4);
        }
        AppSetIdInfo appSetIdInfo = B1.f22394a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        B1.a(linkedHashMap3);
        linkedHashMap.putAll(linkedHashMap3);
        if (signalsConfig.getPublisherConfig().getEnableAB()) {
            ck.p.j(linkedHashMap, "<this>");
            JSONObject jSONObjectE = Og.f23290a.e();
            if (jSONObjectE.length() > 0) {
                String string5 = jSONObjectE.toString();
                ck.p.i(string5, "toString(...)");
                linkedHashMap.put(C3426d4.i.f28551l0, string5);
            }
        }
        ck.p.j(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) A1.f22338f));
        ck.p.j(linkedHashMap, "<this>");
        if (K4.e() && F3.a(K4.d())) {
            linkedHashMap.put("ik", K4.f23001f);
            linkedHashMap.put("c_data", K4.d());
            Context context3 = Ji.f22951a;
            int i10 = 1;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f22576b;
                Ea eaA2 = Da.a(context3, "c_data_store");
                ck.p.j("akv", C3426d4.i.W);
                i10 = eaA2.f22577a.getInt("akv", 1);
            }
            linkedHashMap.put("aKV", String.valueOf(i10));
        }
        ck.p.j(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string6 = jSONObjectB.toString();
            ck.p.i(string6, "toString(...)");
            linkedHashMap.put("consentObject", string6);
        }
        ck.p.j(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f22337e);
        linkedHashMap.putAll(c3298x5.a(false));
        linkedHashMap.putAll(AbstractC3351z8.a());
        ck.p.j(linkedHashMap, "mHttpHeaders");
        linkedHashMap.put("User-Agent", Ji.c());
        ck.p.j(linkedHashMap, "payload");
        if (!W6.a()) {
            if (c3053n9A != null) {
                ck.p.i("com.inmobi.media.tk", "LOG_TAG");
                c3053n9A.b("com.inmobi.media.tk", "get Signals failed - GDPR Compliance");
            }
            a(2141, jCurrentTimeMillis, c3053n9A);
            return null;
        }
        a(jCurrentTimeMillis, c3053n9A);
        if (c3053n9A != null) {
            ck.p.i("com.inmobi.media.tk", "LOG_TAG");
            c3053n9A.a("com.inmobi.media.tk", "get signals success");
        }
        byte[] bArrEncode = Base64.encode(new Buffer().writeUtf8(F3.a(linkedHashMap)).readByteArray(), 8);
        ck.p.i(bArrEncode, "encode(...)");
        return new String(bArrEncode, lk.c.f63591b);
    }

    public static final void b() {
        HashMap mapL = kotlin.collections.a.l(mj.h.a("networkType", C3298x5.m()), mj.h.a("plType", "AB"));
        Wj wj2 = Wj.f23753a;
        Wj.b("AdGetSignalsCalled", mapL, EnumC2735ak.SDK);
    }

    public static void a(final int i10, final long j10, C3053n9 c3053n9) {
        if (c3053n9 != null) {
            ck.p.i("com.inmobi.media.tk", "LOG_TAG");
            c3053n9.c("com.inmobi.media.tk", "submitAdGetSignalsFailed - errorCode - " + i10 + ", startTime - " + j10);
        }
        Runnable runnable = new Runnable() { // from class: b7.ia
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3213tk.a(j10, i10);
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
        if (c3053n9 != null) {
            c3053n9.a();
        }
    }

    public static final void a(long j10, int i10) {
        HashMap mapL = kotlin.collections.a.l(mj.h.a("latency", Long.valueOf(System.currentTimeMillis() - j10)), mj.h.a("networkType", C3298x5.m()), mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)), mj.h.a("plType", "AB"));
        Wj wj2 = Wj.f23753a;
        Wj.b("AdGetSignalsFailed", mapL, EnumC2735ak.SDK);
    }

    public static void a(final long j10, C3053n9 c3053n9) {
        if (c3053n9 != null) {
            ck.p.i("com.inmobi.media.tk", "LOG_TAG");
            c3053n9.c("com.inmobi.media.tk", "submitAdGetSignalsSucceeded - startTime - " + j10);
        }
        Runnable runnable = new Runnable() { // from class: b7.ka
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3213tk.a(j10);
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
        if (c3053n9 != null) {
            c3053n9.a();
        }
    }

    public static final void a(long j10) {
        HashMap mapL = kotlin.collections.a.l(mj.h.a("latency", Long.valueOf(System.currentTimeMillis() - j10)), mj.h.a("networkType", C3298x5.m()), mj.h.a("plType", "AB"));
        Wj wj2 = Wj.f23753a;
        Wj.b("AdGetSignalsSucceeded", mapL, EnumC2735ak.SDK);
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: b7.ja
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3213tk.b();
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }
}
