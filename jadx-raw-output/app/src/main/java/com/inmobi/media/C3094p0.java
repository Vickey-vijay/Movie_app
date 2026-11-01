package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.C3426d4;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3094p0 extends AbstractC3277w9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ak f25022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3044n0 f25023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3114pk f25024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2808df f25025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3053n9 f25026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3094p0(String str, Ak ak2, C3044n0 c3044n0, C3114pk c3114pk, C2808df c2808df, C3053n9 c3053n9, boolean z10) {
        super(str == null ? AdConfig.DEFAULT_AD_SERVER_URL : str);
        ck.p.j(c3044n0, "metaData");
        ck.p.j(c3114pk, "timeoutConfig");
        this.f25022b = ak2;
        this.f25023c = c3044n0;
        this.f25024d = c3114pk;
        this.f25025e = c2808df;
        this.f25026f = c3053n9;
    }

    public final Le a() throws JSONException {
        String string;
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = Ji.f22953c;
        if (str == null) {
            throw new IllegalArgumentException("Account Id cannot be null");
        }
        linkedHashMap.put("account_id", str);
        linkedHashMap.putAll(J5.c());
        String str2 = A1.f22334b;
        if (str2 != null) {
        }
        linkedHashMap.put("client-request-id", this.f25023c.f24859a);
        linkedHashMap.put("sdk-flavor", "row");
        this.f25023c.getClass();
        linkedHashMap.put("format", "unifiedSdkJson");
        String str3 = this.f25023c.f24863e;
        if (str3 != null) {
        }
        ck.p.j(linkedHashMap, "<this>");
        Pk pkA = Ok.a();
        String str4 = pkA.f23345a;
        if (str4 != null) {
        }
        linkedHashMap.put("is-unifid-service-used", String.valueOf(pkA.f23346b));
        long j10 = this.f25023c.f24861c;
        if (j10 != Long.MIN_VALUE) {
            linkedHashMap.put("im-plid", String.valueOf(j10));
        }
        AbstractC3277w9.d(linkedHashMap);
        linkedHashMap.putAll(O2.a());
        ck.p.j(linkedHashMap, "<this>");
        linkedHashMap.putAll(O2.b());
        linkedHashMap.putAll(O2.c());
        C2808df c2808df = this.f25025e;
        if (c2808df != null && (map = c2808df.f24240a) != null) {
            linkedHashMap.putAll(map);
        }
        HashMap map2 = new HashMap();
        map2.putAll(X3.f23778a);
        linkedHashMap.putAll(map2);
        String str5 = this.f25023c.f24865g;
        if (str5 != null) {
        }
        Map map3 = this.f25023c.f24864f;
        if (map3 != null) {
            linkedHashMap.putAll(map3);
        }
        this.f25023c.getClass();
        linkedHashMap.put("int-origin", "im");
        AbstractC3277w9.c(linkedHashMap);
        AbstractC3277w9.e(linkedHashMap);
        ck.p.j(linkedHashMap, "<this>");
        mj.g gVar = E0.f22558c;
        if (!((CopyOnWriteArrayList) gVar.getValue()).isEmpty()) {
            String string2 = new JSONArray((Collection) gVar.getValue()).toString();
            ck.p.i(string2, "toString(...)");
            linkedHashMap.put("u-r-crid", string2);
        }
        linkedHashMap.put("m10n_context", ck.p.e("others", this.f25023c.f24862d) ? "M10N_CONTEXT_OTHER" : "M10N_CONTEXT_ACTIVITY");
        ck.p.j(linkedHashMap, "<this>");
        C3298x5.f25687a.getClass();
        if (C3298x5.q()) {
            if (J5.f22897e) {
                string = null;
            } else {
                string = J5.f22895c;
                if (string == null) {
                    Context context = Ji.f22951a;
                    if (context == null) {
                        string = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                        Ea eaA = Da.a(context, "display_info_store");
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
        ck.p.j(linkedHashMap, "<this>");
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) Y3.f23815a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String string3 = ext.toString();
            ck.p.i(string3, "toString(...)");
            linkedHashMap.put("im-ext", string3);
        }
        Map map4 = this.f25023c.f24860b;
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
        AbstractC3277w9.a(linkedHashMap);
        C3044n0 c3044n0 = this.f25023c;
        ck.p.j(linkedHashMap, "<this>");
        ck.p.j(c3044n0, "metaData");
        String str8 = c3044n0.f24863e;
        if (str8 != null && AbstractC3277w9.a(str8).length() > 0) {
            String string4 = AbstractC3277w9.a(str8).toString();
            ck.p.i(string4, "toString(...)");
            linkedHashMap.put("audioObject", string4);
        }
        ck.p.j(linkedHashMap, "<this>");
        String str9 = Vg.f23705a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str10 = Vg.f23705a;
        if (str10 != null) {
            linkedHashMap2.put("u-nip", str10);
        } else {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.putAll(Tg.a());
        AppSetIdInfo appSetIdInfo = B1.f22394a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        B1.a(linkedHashMap3);
        linkedHashMap.putAll(linkedHashMap3);
        ck.p.j(linkedHashMap, "<this>");
        if (K4.e() && F3.a(K4.d())) {
            linkedHashMap.put("ik", K4.f23001f);
            linkedHashMap.put("c_data", K4.d());
            Context context2 = Ji.f22951a;
            int i10 = 1;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.f22576b;
                Ea eaA2 = Da.a(context2, "c_data_store");
                ck.p.j("akv", C3426d4.i.W);
                i10 = eaA2.f22577a.getInt("akv", 1);
            }
            linkedHashMap.put("aKV", String.valueOf(i10));
        }
        ck.p.j(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) A1.f22338f));
        Ak ak2 = this.f25022b;
        HashMap mapA = ak2 != null ? ak2.a() : null;
        ck.p.j(linkedHashMap, "<this>");
        if (mapA != null) {
            for (Map.Entry entry2 : mapA.entrySet()) {
                linkedHashMap.put((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        C2924i4 c2924i5 = Y3.f23815a;
        ck.p.j(SignalsConfig.class, "clazz");
        if (((SignalsConfig) Y3.f23815a.a(SignalsConfig.class)).getPublisherConfig().getEnableMCO()) {
            ck.p.j(linkedHashMap, "<this>");
            JSONObject jSONObjectE = Og.f23290a.e();
            if (jSONObjectE.length() > 0) {
                String string5 = jSONObjectE.toString();
                ck.p.i(string5, "toString(...)");
                linkedHashMap.put(C3426d4.i.f28551l0, string5);
            }
        }
        AbstractC3277w9.b(linkedHashMap);
        boolean z10 = this.f25023c.f24866h;
        ck.p.j(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.f22337e);
        linkedHashMap.putAll(C3298x5.f25687a.a(z10));
        linkedHashMap.putAll(AbstractC3351z8.a());
        ck.p.j(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string6 = jSONObjectB.toString();
            ck.p.i(string6, "toString(...)");
            linkedHashMap.put("consentObject", string6);
        }
        this.f25023c.getClass();
        C3053n9 c3053n9 = this.f25026f;
        if (c3053n9 != null) {
            c3053n9.c("AdNetworkRequest", linkedHashMap.toString());
        }
        String str11 = this.f25628a;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        ck.p.j(linkedHashMap4, "mHttpHeaders");
        linkedHashMap4.put("User-Agent", Ji.c());
        return new Le(str11, linkedHashMap4, this.f25024d, new Y6(linkedHashMap), null, 48);
    }
}
