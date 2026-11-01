package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C3426d4;
import com.ironsource.C3754ve;
import com.ironsource.Q6;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends t0 implements o {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InneractiveAdRequest f16069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap f16070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public StringBuffer f16071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.d f16072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.j f16073t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16074u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.timeouts.request.a f16075v;

    @Override // com.fyber.inneractive.sdk.network.o
    public final StringBuffer a() {
        return this.f16071r;
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final Map b() {
        return this.f16070q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    public q0(q qVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.r rVar) {
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(rVar);
        super(qVar, g0.f16028c.a(), rVar);
        this.f16073t = null;
        this.f16074u = false;
        this.f16099o = true;
        this.f16069p = inneractiveAdRequest;
        this.f16072s = cVar;
        if (inneractiveAdRequest != null) {
            String strA = com.fyber.inneractive.sdk.util.n1.a(inneractiveAdRequest.getSpotId());
            String mediationName = inneractiveAdRequest.getMediationName();
            com.fyber.inneractive.sdk.config.global.features.j jVar = (com.fyber.inneractive.sdk.config.global.features.j) rVar.a(com.fyber.inneractive.sdk.config.global.features.j.class);
            this.f16075v = TextUtils.isEmpty(mediationName) ? new com.fyber.inneractive.sdk.network.timeouts.request.b(jVar, strA) : new com.fyber.inneractive.sdk.network.timeouts.request.d(strA, jVar, mediationName);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    @Override // com.fyber.inneractive.sdk.network.t0
    public final o0 a(l lVar, Map map, int i10) throws n0 {
        StringBuffer stringBufferB;
        String str;
        List list;
        if (map != null) {
            HashMap map2 = new HashMap();
            for (String str2 : map.keySet()) {
                if (str2 != null && (list = (List) map.get(str2)) != null && list.size() > 0) {
                    map2.put(str2.toLowerCase(Locale.US), (String) list.get(0));
                }
            }
            this.f16070q = map2;
        }
        InputStream inputStream = lVar == null ? null : lVar.f16041c;
        super.d(System.currentTimeMillis());
        IAlog.a("%s : NetworkRequestAd : set start read timestamp", IAlog.a(this));
        if (inputStream != null) {
            try {
                stringBufferB = com.fyber.inneractive.sdk.util.v.b(inputStream);
            } catch (Exception e10) {
                IAlog.a("failed create response builder in network request ad for url: %s msg: %s", r(), e10.getMessage());
                stringBufferB = null;
            }
            this.f16071r = stringBufferB;
        }
        b(System.currentTimeMillis());
        o0 o0Var = new o0();
        try {
            HashMap map3 = this.f16070q;
            if (map3 != null) {
                str = (String) map3.get(n.RETURNED_AD_TYPE.key.toLowerCase(Locale.US));
                if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str)) {
                    str = null;
                }
            } else {
                str = null;
            }
            o0Var.f16063a = a(str != null ? Integer.parseInt(str) : 6, this, null, this.f16073t);
            return o0Var;
        } catch (Exception e11) {
            b(System.currentTimeMillis());
            IAlog.a("failed parse ad network request url: %s msg: %s", r(), e11.getMessage());
            throw new n0(e11);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void b(long j10) {
        super.b(j10);
        IAlog.a("%s : NetworkRequestAd : set end read timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        JSONArray jSONArrayA;
        byte[] bytes = new byte[0];
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            com.fyber.inneractive.sdk.config.global.r rVar = ((com.fyber.inneractive.sdk.serverapi.c) this.f16072s).f18488a;
            if (rVar != null) {
                jSONArrayA = com.fyber.inneractive.sdk.config.global.g.a(rVar.f15109b, true);
                IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
            } else {
                jSONArrayA = null;
            }
            if (jSONArrayA != null && jSONArrayA.length() > 0) {
                jSONObject2.put(C3754ve.f31473d, jSONArrayA);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            UnitDisplayType unitDisplayTypeA = com.fyber.inneractive.sdk.serverapi.b.a(this.f16069p.getSpotId());
            IAConfigManager iAConfigManager = IAConfigManager.O;
            JSONArray jSONArrayA2 = iAConfigManager.f15029x.a(unitDisplayTypeA);
            if (jSONArrayA2 != null && jSONArrayA2.length() > 0) {
                jSONObject.put("user_sessions", jSONArrayA2);
            }
            int iA = iAConfigManager.f15026u.f15195b.a("dv_enabled_v3", 0, 0);
            if (unitDisplayTypeA != null && iA == 1) {
                com.fyber.inneractive.sdk.dv.j jVarA = iAConfigManager.G.a(unitDisplayTypeA);
                this.f16073t = jVarA;
                if (jVarA != null) {
                    jSONObject.put("gdem_signal", jVarA.f15258a.getQuery());
                }
            }
            com.fyber.inneractive.sdk.topics.b bVar = iAConfigManager.F;
            if (bVar != null && IAConfigManager.f()) {
                Object objB = bVar.b();
                if (objB != null) {
                    jSONObject.put("topics", objB);
                }
                Object objA = bVar.a();
                if (objA != null) {
                    jSONObject.put("encrypted_topics", objA);
                }
            }
            String string = jSONObject.toString();
            bytes = string.getBytes(StandardCharsets.UTF_8);
            IAlog.a("request json body - %s", string);
            IAlog.d("request json body - %s", string);
            return bytes;
        } catch (Exception unused) {
            IAlog.a("Failed building body for ad request!", new Object[0]);
            return bytes;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final Map l() {
        int i10 = com.fyber.inneractive.sdk.config.k.f15121a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.response");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("mockadnetworkresponseid", property);
        IAlog.a("NetworkRequestAd: Adding mock response header - %s", property);
        return map;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final m0 m() {
        return m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final g1 o() {
        return g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l1 p() {
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.f16075v;
        return new l1(aVar.f16109i, aVar.f16108h);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final String r() {
        String str;
        String str2;
        int i10 = com.fyber.inneractive.sdk.config.k.f15121a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        String strA = TextUtils.isEmpty(property) ? "https://" + IAConfigManager.O.f15014i.f15126e : com.fyber.inneractive.sdk.config.a.a(property, "clientRequestEnhancedXmlAd");
        if (this.f16069p.getFloorPrice() != null) {
            String property2 = System.getProperty("ia.testEnvironmentConfiguration.name");
            strA = TextUtils.isEmpty(property2) ? "https://" + IAConfigManager.O.f15014i.f15128g : com.fyber.inneractive.sdk.config.a.a(property2, "clientRequestEnhancedXmlAd");
        }
        InneractiveAdRequest inneractiveAdRequest = this.f16069p;
        com.fyber.inneractive.sdk.serverapi.d dVar = this.f16072s;
        r0 r0Var = new r0(inneractiveAdRequest, dVar);
        r0Var.f16078b = new HashMap();
        r0Var.a("fromSDK", Boolean.toString(true));
        r0Var.a("po", System.getProperty("ia.testEnvironmentConfiguration.number"));
        r0Var.a("secure", (com.fyber.inneractive.sdk.util.s.a() ^ true) || IAConfigManager.O.f15022q ? "1" : "0");
        r0Var.a("spotid", inneractiveAdRequest.getSpotId());
        String property3 = System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
        if (property3 == null) {
            property3 = inneractiveAdRequest.getSelectedUnitConfig() == null ? null : ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f15144a;
        }
        r0Var.a("uid", property3);
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (TextUtils.isEmpty(iAConfigManager.f15019n)) {
            r0Var.a("med", iAConfigManager.f15017l);
        } else {
            r0Var.a("med", iAConfigManager.f15017l + "_" + iAConfigManager.f15019n);
        }
        dVar.getClass();
        r0Var.a(InneractiveMediationDefs.GENDER_FEMALE, Integer.toString(372));
        com.fyber.inneractive.sdk.serverapi.c cVar = (com.fyber.inneractive.sdk.serverapi.c) dVar;
        List list = com.fyber.inneractive.sdk.serverapi.c.f18487d;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf((Integer) it.next()));
            }
            r0Var.a("protocols", com.fyber.inneractive.sdk.util.o.a(arrayList));
        }
        List list2 = com.fyber.inneractive.sdk.serverapi.c.f18486c;
        if (!list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(String.valueOf((Integer) it2.next()));
            }
            r0Var.a("api", com.fyber.inneractive.sdk.util.o.a(arrayList2));
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("zip", iAConfigManager.f15015j.getZipCode());
        }
        r0Var.a("a", Integer.toString(iAConfigManager.f15015j.getAge()));
        InneractiveUserConfig.Gender gender = iAConfigManager.f15015j.getGender();
        if (InneractiveUserConfig.Gender.MALE.equals(gender)) {
            r0Var.a("g", InneractiveMediationDefs.GENDER_MALE);
        } else if (InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            r0Var.a("g", InneractiveMediationDefs.GENDER_FEMALE);
        }
        r0Var.a("t", Long.toString(System.currentTimeMillis()));
        StringBuilder sb2 = new StringBuilder("2.2.0-Android-8.4.1");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb2.append('-');
            sb2.append(InneractiveAdManager.getDevPlatform());
        }
        r0Var.a("v", sb2.toString());
        Boolean boolD = iAConfigManager.D.d();
        if (boolD != null) {
            r0Var.a("gdpr_privacy_consent", boolD.booleanValue() ? "1" : "0");
        }
        com.fyber.inneractive.sdk.config.g gVar = iAConfigManager.D;
        if (gVar != null) {
            Boolean bool = com.fyber.inneractive.sdk.util.o.f18599a == null ? null : gVar.f15071i;
            if (bool != null) {
                r0Var.a("lgpd_consent", bool.booleanValue() ? "1" : "0");
            }
            Boolean bool2 = iAConfigManager.D.f15072j;
            if (bool2 != null && bool2.booleanValue()) {
                r0Var.a("coppaApplies", "1");
            }
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            String property4 = System.getProperty("ia.testEnvironmentConfiguration.device");
            com.fyber.inneractive.sdk.config.w wVar = com.fyber.inneractive.sdk.config.u.f15211a;
            com.fyber.inneractive.sdk.config.v vVar = wVar.f15219b;
            String str3 = vVar != null ? vVar.f15217c : false ? "amazonId" : "aaid";
            if (TextUtils.isEmpty(property4)) {
                com.fyber.inneractive.sdk.config.v vVar2 = wVar.f15219b;
                property4 = vVar2 != null ? vVar2.f15215a : null;
            }
            r0Var.a(str3, property4);
        }
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            com.fyber.inneractive.sdk.config.v vVar3 = com.fyber.inneractive.sdk.config.u.f15211a.f15219b;
            r0Var.a("dnt", Boolean.toString(vVar3 != null ? vVar3.f15216b : false));
        }
        r0Var.a("dml", com.fyber.inneractive.sdk.util.k.j());
        int iC = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        int iC2 = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        if (iC > 0 && iC2 > 0) {
            r0Var.a("w", Integer.toString(iC));
            r0Var.a("h", Integer.toString(iC2));
        }
        int iC3 = com.fyber.inneractive.sdk.util.o.c();
        r0Var.a("o", iC3 == 1 ? "p" : iC3 == 2 ? "l" : "u");
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("ciso", com.fyber.inneractive.sdk.util.k.i());
            String str4 = cVar.f18489b;
            r0Var.a("mcc", str4 == null ? "" : str4.substring(0, Math.min(3, str4.length())));
            String str5 = cVar.f18489b;
            r0Var.a("mnc", str5 == null ? "" : str5.substring(Math.min(3, str5.length())));
            com.fyber.inneractive.sdk.util.z0 z0VarA = com.fyber.inneractive.sdk.util.z0.a();
            IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", z0VarA, z0VarA.b());
            r0Var.a("nt", z0VarA.b());
            r0Var.a("crn", cVar.a());
        }
        r0Var.a(Q6.F, C3426d4.f28386d);
        r0Var.a("lng", iAConfigManager.f15020o);
        ArrayList arrayList3 = iAConfigManager.f15021p;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            r0Var.a("in_lng", com.fyber.inneractive.sdk.util.o.a(arrayList3));
        }
        r0Var.a("bid", com.fyber.inneractive.sdk.util.o.f18599a.getPackageName());
        r0Var.a("appv", com.fyber.inneractive.sdk.util.k.l());
        com.fyber.inneractive.sdk.config.g gVar2 = iAConfigManager.D;
        if (gVar2.f15066d == null) {
            gVar2.f15067e = gVar2.h();
        }
        if (com.fyber.inneractive.sdk.util.o.f18599a == null) {
            str = null;
        } else {
            str = gVar2.f15066d;
            if (str == null) {
                str = gVar2.f15067e;
            }
        }
        r0Var.a("gdpr_consent_data", str);
        com.fyber.inneractive.sdk.config.g gVar3 = iAConfigManager.D;
        if (com.fyber.inneractive.sdk.util.o.f18599a == null) {
            gVar3.getClass();
            str2 = null;
        } else {
            str2 = gVar3.f15070h;
        }
        r0Var.a("us_privacy", str2);
        r0Var.a("mute_video", Boolean.toString(iAConfigManager.f15016k));
        r0Var.a(Q6.G, Build.VERSION.RELEASE);
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f15795p;
        r0Var.a("ignitep", lVar != null ? lVar.f61679a.d() : null);
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.E.f15795p;
        r0Var.a("ignitev", lVar2 != null ? lVar2.f61679a.i() : null);
        HashMap map = new HashMap();
        cVar.a(inneractiveAdRequest.getSpotId(), map);
        for (Map.Entry entry : map.entrySet()) {
            r0Var.a((String) entry.getKey(), (String) entry.getValue());
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("childMode", "1");
        }
        com.fyber.inneractive.sdk.ignite.l lVar3 = IAConfigManager.O.E.f15795p;
        r0Var.a("odt", lVar3 != null ? lVar3.getOdt() : "");
        Double floorPrice = r0Var.f16077a.getFloorPrice();
        r0Var.a("floorprice", floorPrice != null ? new BigDecimal(Double.toString(floorPrice.doubleValue())).setScale(5, RoundingMode.CEILING).stripTrailingZeros().toPlainString() : null);
        String strA2 = com.fyber.inneractive.sdk.util.f1.a(strA, r0Var.f16078b);
        if (!this.f16074u) {
            IAlog.d("%s %s", "AD_REQUEST", strA2);
            this.f16074u = true;
        }
        return strA2;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int s() {
        return this.f16075v.f16105f;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c(long j10) {
        super.c(j10);
        IAlog.a("%s : NetworkRequestAd : set start connection timestamp", IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d() {
        super.d();
        IAlog.a("%s : NetworkRequestAd cancel by timeout - resolve request with no fill", IAlog.a(this));
        this.f16085a = true;
        a((Object) null, (Exception) new k1("no fill", 204), false);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int j() {
        return q();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final l a(String str) {
        IAlog.a("%s: NetworkRequestAd Ad request execution started, timeouts(connection: %d read: %d)", IAlog.a(this), Integer.valueOf(p().f16052a), Integer.valueOf(p().f16053b));
        return super.a(str);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void a(long j10) {
        super.a(j10);
        IAlog.a("%s : NetworkRequestAd : set end connection timestamp, total execution time: %d", IAlog.a(this), Integer.valueOf(q()));
    }
}
