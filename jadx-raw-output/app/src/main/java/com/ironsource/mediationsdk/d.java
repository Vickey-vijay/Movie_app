package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.B7;
import com.ironsource.C3406c2;
import com.ironsource.C3450ea;
import com.ironsource.C3478g2;
import com.ironsource.C3575la;
import com.ironsource.C3605n2;
import com.ironsource.C3676r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.Lb;
import com.ironsource.Q6;
import com.ironsource.V1;
import com.ironsource.X0;
import com.ironsource.X9;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class d {
    public static final boolean A = false;
    private static d B = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f29591c = "auctionId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f29592d = "armData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f29593e = "larmData";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f29594f = "isAdUnitCapped";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f29595g = "settings";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f29596h = "waterfall";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f29597i = "genericParams";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f29598j = "configurations";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f29599k = "instances";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f29600l = "${AUCTION_LOSS}";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f29601m = "${AUCTION_MBR}";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f29602n = "${AUCTION_PRICE}";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f29603o = "${DYNAMIC_DEMAND_SOURCE}";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f29604p = "${INSTANCE}";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f29605q = "${INSTANCE_TYPE}";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f29606r = "${PLACEMENT_NAME}";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f29607s = "adMarkup";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f29608t = "dynamicDemandSource";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f29609u = "params";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f29610v = "dlpl";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f29611w = "adUnit";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f29612x = "parallelLoad";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f29613y = "bidderExclusive";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f29614z = "showPriorityEnabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f29615a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B7 f29616b = Lb.U().i();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<C3605n2> f29618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C3605n2 f29619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f29620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private JSONObject f29621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f29622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f29623g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private V1 f29624h;

        public String a() {
            return this.f29617a;
        }

        public JSONObject b() {
            return this.f29621e;
        }

        public int c() {
            return this.f29622f;
        }

        public String d() {
            return this.f29623g;
        }

        public C3605n2 e() {
            return this.f29619c;
        }

        public JSONObject f() {
            return this.f29620d;
        }

        public V1 g() {
            return this.f29624h;
        }

        public List<C3605n2> h() {
            return this.f29618b;
        }

        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            V1 v10 = this.f29624h;
            return v10 != null ? v10.a(str) : new com.ironsource.mediationsdk.demandOnly.p.b();
        }

        public a(String str) {
            this.f29617a = str;
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f29625d = 15000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f29627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f29628c;

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f29626a + ";" + this.f29627b + ";" + this.f29628c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f29628c).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int iHttpUrlConnectionGetResponseCode = IronSourceNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                String responseMessage = httpURLConnection.getResponseMessage();
                IronSourceNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                Lb.U().q().a(new C5(iHttpUrlConnectionGetResponseCode == 200 || iHttpUrlConnectionGetResponseCode == 204 ? D5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : D5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, IronSourceVideoBridge.jsonObjectInit().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put(IronSourceConstants.EVENTS_ERROR_CODE, iHttpUrlConnectionGetResponseCode).put("reason", responseMessage)));
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e10.getMessage());
            }
        }

        public b(String str, String str2, String str3) {
            this.f29626a = str;
            this.f29627b = str2;
            this.f29628c = str3;
        }
    }

    public enum c {
        NOT_SECURE,
        SECURE
    }

    public static d b() {
        return B;
    }

    public a a(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(strOptString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(strOptString);
        JSONObject jSONObjectOptJSONObject = null;
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.f29619c = new C3605n2(jSONObject2);
            jSONObjectOptJSONObject = jSONObject2.has(f29592d) ? jSONObject2.optJSONObject(f29592d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.f29620d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.f29621e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(f29599k)) {
                aVar.f29624h = new V1.a(jSONObject2.optJSONObject(f29599k));
            }
        }
        aVar.f29618b = new ArrayList();
        if (jSONObject.has(f29596h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f29596h);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                C3605n2 c3605n2 = new C3605n2(jSONArray.getJSONObject(i10), i10, jSONObjectOptJSONObject);
                if (!c3605n2.n()) {
                    aVar.f29622f = 1002;
                    aVar.f29623g = "waterfall " + i10;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i10 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.f29618b.add(c3605n2);
            }
        }
        return aVar;
    }

    public Map<String, String> b(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            if (jSONObjectJsonObjectInit.has("params")) {
                JSONObject jSONObject = jSONObjectJsonObjectInit.getJSONObject("params");
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        map.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
        return map;
    }

    public String c(String str) {
        String string = "";
        try {
            if (TextUtils.isEmpty(str) || !C3575la.a(str)) {
                return "";
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            if (!jSONObjectJsonObjectInit.has("params")) {
                return "";
            }
            JSONObject jSONObject = jSONObjectJsonObjectInit.getJSONObject("params");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject);
            if (!jSONObject.has("dynamicDemandSource")) {
                return "";
            }
            string = jSONObject.getString("dynamicDemandSource");
            ironLog.verbose("demand source = " + string);
            return string;
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return string;
        }
    }

    private c a() {
        c cVar = c.SECURE;
        if (Build.VERSION.SDK_INT >= 28) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? c.NOT_SECURE : cVar;
        }
        return (ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0 ? c.NOT_SECURE : cVar;
    }

    public JSONObject a(i iVar) throws JSONException {
        boolean z10;
        boolean z11;
        ISBannerSize iSBannerSize;
        IronSource.a aVarC = iVar.c();
        boolean zT = iVar.t();
        Map<String, Object> mapH = iVar.h();
        List<String> listL = iVar.l();
        h hVarE = iVar.e();
        int iO = iVar.o();
        ISBannerSize iSBannerSizeF = iVar.f();
        C3450ea c3450eaN = iVar.n();
        boolean zP = iVar.p();
        boolean zQ = iVar.q();
        ArrayList<C3478g2> arrayListK = iVar.k();
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
        Iterator<String> it = mapH.keySet().iterator();
        while (true) {
            z10 = zP;
            z11 = zT;
            String strA = "";
            iSBannerSize = iSBannerSizeF;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Iterator<String> it2 = it;
            JSONObject jSONObjectJsonObjectInit3 = IronSourceVideoBridge.jsonObjectInit();
            C3450ea c3450ea = c3450eaN;
            jSONObjectJsonObjectInit3.put(Q6.f27485y0, 2);
            jSONObjectJsonObjectInit3.put(Q6.f27458p0, new JSONObject((Map) mapH.get(next)));
            if (hVarE != null) {
                strA = hVarE.a(next);
            }
            jSONObjectJsonObjectInit3.put(Q6.B0, strA);
            jSONObjectJsonObjectInit3.put("ts", zQ ? 1 : 0);
            jSONObjectJsonObjectInit2.put(next, jSONObjectJsonObjectInit3);
            zP = z10;
            zT = z11 ? 1 : 0;
            iSBannerSizeF = iSBannerSize;
            it = it2;
            c3450eaN = c3450ea;
        }
        C3450ea c3450ea2 = c3450eaN;
        int i10 = 2;
        for (String str : listL) {
            JSONObject jSONObjectJsonObjectInit4 = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit4.put(Q6.f27485y0, 1);
            jSONObjectJsonObjectInit4.put(Q6.B0, hVarE != null ? hVarE.a(str) : "");
            jSONObjectJsonObjectInit2.put(str, jSONObjectJsonObjectInit4);
        }
        for (C3478g2 c3478g2 : arrayListK) {
            JSONObject jSONObjectJsonObjectInit5 = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit5.put(Q6.f27485y0, c3478g2.e() ? i10 : 1);
            Map<String, Object> mapF = c3478g2.f();
            if (!mapF.isEmpty()) {
                jSONObjectJsonObjectInit5.put(Q6.f27458p0, new JSONObject(mapF));
            }
            jSONObjectJsonObjectInit5.put(Q6.B0, hVarE != null ? hVarE.a(c3478g2.g()) : "");
            jSONObjectJsonObjectInit5.put("ts", zQ ? 1 : 0);
            if (!c3478g2.h().isEmpty()) {
                jSONObjectJsonObjectInit5.put(f29610v, c3478g2.h());
            }
            jSONObjectJsonObjectInit2.put(c3478g2.g(), jSONObjectJsonObjectInit5);
            i10 = 2;
        }
        jSONObjectJsonObjectInit.put(Q6.f27482x0, jSONObjectJsonObjectInit2);
        if (iVar.v()) {
            jSONObjectJsonObjectInit.put(Q6.f27483x1, 1);
        }
        if (iVar.s()) {
            jSONObjectJsonObjectInit.put("do", 1);
        }
        new X9().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectA = new C3406c2(X0.a(aVarC)).a();
        a(jSONObjectA, false);
        jSONObjectA.put(Q6.f27488z0, iO);
        jSONObjectA.put(Q6.A0, a().ordinal());
        if (c3450ea2 != null) {
            jSONObjectA.put(Q6.f27441j1, c3450ea2.i());
        }
        jSONObjectJsonObjectInit.put(Q6.f27473u0, jSONObjectA);
        if (iSBannerSize != null) {
            JSONObject jSONObjectJsonObjectInit6 = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit6.put(Q6.f27464r0, iSBannerSize.getDescription());
            jSONObjectJsonObjectInit6.put(Q6.f27470t0, iSBannerSize.getWidth());
            jSONObjectJsonObjectInit6.put(Q6.f27467s0, iSBannerSize.getHeight());
            jSONObjectJsonObjectInit.put(Q6.f27461q0, jSONObjectJsonObjectInit6);
        }
        jSONObjectJsonObjectInit.put(Q6.f27446l0, aVarC.toString());
        if (iVar.b() != null) {
            jSONObjectJsonObjectInit.put("adf", iVar.b());
        }
        if (iVar.d() != null) {
            jSONObjectJsonObjectInit.put("mediationAdUnitId", iVar.d());
        }
        if (iVar.u() != null) {
            jSONObjectJsonObjectInit.put(Q6.f27455o0, iVar.u());
        }
        jSONObjectJsonObjectInit.put(Q6.f27476v0, !z11 ? 1 : 0);
        if (iVar.g() != null) {
            jSONObjectJsonObjectInit.put(Q6.f27471t1, IronSourceVideoBridge.jsonObjectInit().put(Q6.f27474u1, iVar.g()));
        } else {
            Object objRemove = jSONObjectA.remove(Q6.f27471t1);
            if (objRemove != null) {
                jSONObjectJsonObjectInit.put(Q6.f27471t1, objRemove);
            }
        }
        if (z10) {
            jSONObjectJsonObjectInit.put(Q6.f27465r1, 1);
        }
        return jSONObjectJsonObjectInit;
    }

    public String a(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(f29602n, str4).replace(f29600l, str6).replace(f29601m, str5).replace(f29604p, str2).replace(f29605q, Integer.toString(i10)).replace(f29603o, str3).replace(f29606r, str7);
    }

    public String a(String str, int i10, C3605n2 c3605n2, String str2, String str3, String str4) {
        String strI = c3605n2.i();
        return a(str, c3605n2.c(), i10, b().c(c3605n2.k()), strI, b().a(strI, str2), str3, str4);
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            return jSONObjectJsonObjectInit.has("adMarkup") ? jSONObjectJsonObjectInit.getString("adMarkup") : str;
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return str;
        }
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double d10 = Double.parseDouble(str);
        double d11 = Double.parseDouble(str2);
        return d11 == 0.0d ? "" : String.valueOf(Math.round((d10 / d11) * 1000.0d) / 1000.0d);
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(Q6.f27447l1)) || !this.f29615a.compareAndSet(false, true)) {
            return;
        }
        Lb.U().q().a(new C5(D5.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.a(z10, true, -1)));
    }
}
