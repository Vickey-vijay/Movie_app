package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f8973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f8974h;

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f7903l.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f7903l.b());
                HashMap map = new HashMap(5);
                CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
                CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
                CollectionUtils.putStringIfValid("ad_zone_id", r5.this.f8973g.e(), map);
                CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f7903l.a()), map);
                CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f7903l.b()), map);
                this.f7705a.g().d(d2.f7241y, map);
                r5.this.b(jSONObject);
                return;
            }
            r5.this.a(i10, MaxAdapterError.NO_FILL.getErrorMessage());
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            r5.this.a(i10, str2);
            this.f7705a.D().a("fetchAd", str, i10, str2);
        }
    }

    public abstract i5 a(JSONObject jSONObject);

    public abstract String e();

    public abstract String f();

    private Map g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f8973g.e());
        if (this.f8973g.f() != null) {
            map.put("AppLovin-Ad-Size", this.f8973g.f().getLabel());
        }
        if (this.f8973g.g() != null) {
            map.put("AppLovin-Ad-Type", this.f8973g.g().getLabel());
        }
        return map;
    }

    public void b(JSONObject jSONObject) {
        r0.c(jSONObject, this.f7705a);
        r0.b(jSONObject, this.f7705a);
        r0.a(jSONObject, this.f7705a);
        u.a(jSONObject);
        this.f7705a.q0().a(a(jSONObject));
    }

    public Map h() {
        HashMap map = new HashMap(4);
        map.put("zone_id", this.f8973g.e());
        if (this.f8973g.f() != null) {
            map.put("size", this.f8973g.f().getLabel());
        }
        if (this.f8973g.g() != null) {
            map.put("require", this.f8973g.g().getLabel());
        }
        return map;
    }

    public r5(u uVar, String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
        this.f8973g = uVar;
        this.f8974h = kVar.b();
    }

    public void a(int i10, String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.b(this.f7706b, "Unable to fetch " + this.f8973g + " ad: server returned " + i10);
        }
        this.f7705a.g().a(d2.f7243z, this.f8973g, new AppLovinError(i10, str));
    }

    @Override // java.lang.Runnable
    public void run() {
        u4.a aVarA;
        Map map;
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Fetching next ad of zone: " + this.f8973g);
        }
        if (((Boolean) this.f7705a.a(x4.T3)).booleanValue() && n7.k() && com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "User is connected to a VPN");
        }
        n7.a(this.f7705a, this.f7706b);
        this.f7705a.g().a(d2.f7239x, this.f8973g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f7705a.k().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f7705a.a(x4.f9940h3)).booleanValue()) {
                aVarA = u4.a.a(((Integer) this.f7705a.a(x4.f10035s5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f7705a.A().a(h(), false, true));
                map = new HashMap();
                if (!((Boolean) this.f7705a.a(x4.D5)).booleanValue() && !((Boolean) this.f7705a.a(x4.f10091z5)).booleanValue()) {
                    map.put(ImpressionLog.f43648x, UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f7705a.a(x4.f9969k5)).booleanValue()) {
                    map.put("sdk_key", this.f7705a.i0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
            } else {
                u4.a aVarA2 = u4.a.a(((Integer) this.f7705a.a(x4.f10043t5)).intValue());
                Map mapA = n7.a(this.f7705a.A().a(h(), false, false));
                if (!((Boolean) this.f7705a.a(x4.M6)).booleanValue()) {
                    mapA.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVarA = aVarA2;
                map = mapA;
            }
            if (n7.h(a()) || n7.j(a())) {
                map.putAll(this.f7705a.k().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f8974h)) {
                map.put("sts", this.f8974h);
            }
            com.applovin.impl.sdk.network.a.C0048a c0048aF = com.applovin.impl.sdk.network.a.a(this.f7705a).b(f()).a(e()).b(map).c(str).a(g()).a((Object) new JSONObject()).a(((Integer) this.f7705a.a(x4.W2)).intValue()).c(((Boolean) this.f7705a.a(x4.X2)).booleanValue()).d(((Boolean) this.f7705a.a(x4.Y2)).booleanValue()).c(((Integer) this.f7705a.a(x4.V2)).intValue()).a(aVarA).f(true);
            if (andResetCustomPostBody != null) {
                c0048aF.a(andResetCustomPostBody);
                c0048aF.b(((Boolean) this.f7705a.a(x4.N5)).booleanValue());
            }
            a aVar = new a(c0048aF.a(), this.f7705a);
            aVar.c(x4.f9973l0);
            aVar.b(x4.f9982m0);
            this.f7705a.q0().a(aVar);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Unable to fetch ad for zone id: " + this.f8973g, th2);
            }
            a(0, th2.getMessage());
        }
    }
}
