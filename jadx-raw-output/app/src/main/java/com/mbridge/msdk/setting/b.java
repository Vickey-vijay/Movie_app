package com.mbridge.msdk.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.ironsource.T1;
import com.ironsource.Y1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseSetting.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static int f36795e1 = 1500;
    private boolean E0;
    private long F;
    private JSONArray G0;
    private ArrayList<Integer> H;
    private JSONObject H0;
    private d I;
    private C0376b J;
    private long J0;
    private HashMap<String, String> O;
    private long O0;
    private String P;
    private boolean P0;
    private int U;
    private String V0;
    private String X;
    private Map<String, String> Y;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f36801b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f36804c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private String f36807d1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f36815h0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private String f36821k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36822l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private String f36823l0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<com.mbridge.msdk.foundation.entity.a> f36826n;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f36829o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f36830p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f36831p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.setting.a f36832q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f36833q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f36834r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f36835r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map<String, a> f36836s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f36837s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f36838t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f36840u;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f36843v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private long f36845w0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36796a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONArray f36799b = new JSONArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONArray f36802c = new JSONArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36805d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36808e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36810f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36812g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36814h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f36816i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f36818j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f36820k = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36824m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f36828o = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f36842v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f36844w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f36846x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f36848y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f36850z = "";
    private String A = "";
    private String B = "";
    private int C = 120;
    private String D = com.mbridge.msdk.foundation.same.net.utils.d.h().f35038i;
    private String E = com.mbridge.msdk.foundation.same.net.utils.d.h().f35042m;
    private int G = f36795e1;
    private int K = 0;
    private long L = 86400;
    private int M = 0;
    private int N = 3;
    private boolean Q = true;
    private int R = 0;
    private boolean S = false;
    private boolean T = false;
    private int V = 0;
    private int W = 0;
    private String Z = NastAdapter.ADAPTER_SDK_VERSION_NAME;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f36797a0 = 30;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f36800b0 = 9377;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f36803c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f36806d0 = 5;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f36809e0 = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f36811f0 = 8000;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private String f36813g0 = "";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f36817i0 = 10;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f36819j0 = 120;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private String f36825m0 = "";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private String f36827n0 = "";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private String f36839t0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private String f36841u0 = "";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private List<Integer> f36847x0 = new ArrayList();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f36849y0 = 3;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f36851z0 = 0;
    private int A0 = 3;
    private int B0 = 0;
    private int C0 = 10;
    private int D0 = 600;
    private int F0 = 0;
    private String I0 = "";
    private int K0 = 8000;
    private int L0 = 1;
    private long M0 = 10;
    private int N0 = 3;
    private int Q0 = 1;
    private int R0 = 1;
    private int S0 = 1;
    private int T0 = 1;
    private String U0 = "";
    private int W0 = 1300;
    private int X0 = 0;
    private int Y0 = 0;
    private long Z0 = 3600;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private String f36798a1 = "";

    /* JADX INFO: compiled from: BaseSetting.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f36852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f36853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f36854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<String> f36855d;

        public List<String> a() {
            return this.f36852a;
        }

        public void a(JSONObject jSONObject) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(VastAttributes.HORIZONTAL_POSITION);
                if (jSONArrayOptJSONArray != null) {
                    this.f36854c = d0.a(jSONArrayOptJSONArray);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(VastAttributes.VERTICAL_POSITION);
                if (jSONArrayOptJSONArray2 != null) {
                    this.f36855d = d0.a(jSONArrayOptJSONArray2);
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("width");
                if (jSONArrayOptJSONArray3 != null) {
                    this.f36853b = d0.a(jSONArrayOptJSONArray3);
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("height");
                if (jSONArrayOptJSONArray4 != null) {
                    this.f36852a = d0.a(jSONArrayOptJSONArray4);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        public List<String> b() {
            return this.f36853b;
        }

        public List<String> c() {
            return this.f36854c;
        }

        public List<String> d() {
            return this.f36855d;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseSetting.java */
    public static class C0376b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONArray f36857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f36858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f36859d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f36860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f36861f;

        public static C0376b a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            C0376b c0376b = new C0376b();
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            c0376b.f36861f = jSONObject.optString("title", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_title", TypedValues.Custom.S_STRING)));
            c0376b.f36856a = jSONObject.optString("cancel", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_close_close", TypedValues.Custom.S_STRING)));
            c0376b.f36859d = jSONObject.optString("submit", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_close_submit", TypedValues.Custom.S_STRING)));
            c0376b.f36860e = jSONObject.optString("submit_notice", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_submit_notice", TypedValues.Custom.S_STRING)));
            c0376b.f36858c = jSONObject.optString("privacy", contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_privacy_des", TypedValues.Custom.S_STRING)));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
            c0376b.f36857b = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                c0376b.f36857b = jSONArray;
                jSONArray.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_not_play", TypedValues.Custom.S_STRING)));
                c0376b.f36857b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_sound_problems", TypedValues.Custom.S_STRING)));
                c0376b.f36857b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_misleading", TypedValues.Custom.S_STRING)));
                c0376b.f36857b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_fraud", TypedValues.Custom.S_STRING)));
                c0376b.f36857b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_por_violence", TypedValues.Custom.S_STRING)));
                c0376b.f36857b.put(contextD.getString(i0.a(contextD, "mbridge_cm_feedback_dialog_content_other", TypedValues.Custom.S_STRING)));
            }
            return c0376b;
        }

        public JSONArray b() {
            return this.f36857b;
        }

        public String c() {
            return this.f36858c;
        }

        public String d() {
            return this.f36859d;
        }

        public String e() {
            return this.f36860e;
        }

        public String f() {
            return this.f36861f;
        }

        public String a() {
            return this.f36856a;
        }
    }

    public static String a(Context context, String str) {
        try {
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD != null && gVarD.G() != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = gVarD.G().entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = gVarD.G().get(key);
                        return TextUtils.isEmpty(str2) ? "" : str2.replace("{gaid}", com.mbridge.msdk.foundation.tools.g.d());
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public long A() {
        return this.L;
    }

    public int B() {
        return this.N;
    }

    public HashMap<String, String> C() {
        return this.O;
    }

    public void D(int i10) {
        this.f36801b1 = i10;
    }

    public int E() {
        return this.U;
    }

    public int F() {
        return this.V;
    }

    public Map<String, String> G() {
        return this.Y;
    }

    public JSONArray H() {
        return this.f36799b;
    }

    public JSONArray I() {
        return this.f36802c;
    }

    public String J() {
        return this.Z;
    }

    public int K() {
        return this.f36809e0;
    }

    public int L() {
        return this.f36811f0;
    }

    public int M() {
        return this.f36815h0;
    }

    public int N() {
        return this.f36819j0;
    }

    public String O() {
        return this.f36821k0;
    }

    public String P() {
        return this.f36823l0;
    }

    public String Q() {
        return this.f36798a1;
    }

    public long R() {
        return this.Z0;
    }

    public int S() {
        return this.f36801b1;
    }

    public String T() {
        return this.f36825m0;
    }

    public String U() {
        return this.f36827n0;
    }

    public int V() {
        return this.f36829o0;
    }

    public int W() {
        return this.f36831p0;
    }

    public int X() {
        return this.f36835r0;
    }

    public int Y() {
        return this.f36837s0;
    }

    public void Z(int i10) {
        this.X0 = i10;
    }

    public long a0() {
        return this.f36843v0;
    }

    public void b(Map<String, String> map) {
        this.Y = map;
    }

    public void c(int i10) {
        this.f36808e = i10;
    }

    public void d(long j10) {
        this.Z0 = j10;
    }

    public void e(int i10) {
        this.f36812g = i10;
    }

    public void f(int i10) {
        this.f36814h = i10;
    }

    public void g(int i10) {
        this.f36822l = i10;
    }

    public void h(int i10) {
        this.f36824m = i10;
    }

    public void i(int i10) {
        this.f36828o = i10;
    }

    public com.mbridge.msdk.setting.a j() {
        return this.f36832q;
    }

    public String k() {
        return this.f36834r;
    }

    public Map<String, a> l() {
        return this.f36836s;
    }

    public int m() {
        return this.f36840u;
    }

    public int n() {
        return this.f36842v;
    }

    public String o() {
        return this.f36846x;
    }

    public String p() {
        return this.f36848y;
    }

    public String q() {
        return this.f36850z;
    }

    public String r() {
        return this.A;
    }

    public String s() {
        return this.B;
    }

    public void t(String str) {
        this.f36798a1 = str;
    }

    public String u() {
        return this.D;
    }

    public String v() {
        return this.E;
    }

    public long w() {
        return this.F;
    }

    public ArrayList<Integer> x() {
        return this.H;
    }

    public d y() {
        return this.I;
    }

    public C0376b z() {
        return this.J;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static g b(JSONObject jSONObject) {
        g gVar = null;
        arrayList = null;
        ArrayList arrayList = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            g gVar2 = new g();
            try {
                gVar2.c(jSONObject);
                gVar2.f(jSONObject.optString("cc"));
                gVar2.s(jSONObject.optString("mv_wildcard", "<mvpackage>mbridge</mvpackage>"));
                gVar2.j(jSONObject.optInt("cfc"));
                gVar2.c(jSONObject.optLong("getpf"));
                gVar2.b(jSONObject.optLong("current_time"));
                gVar2.b(jSONObject.optBoolean("cfb"));
                gVar2.a(jSONObject.optLong("awct"));
                gVar2.e(jSONObject.optLong(CampaignEx.JSON_KEY_PLCT) == 0 ? 3600L : jSONObject.optLong(CampaignEx.JSON_KEY_PLCT));
                gVar2.g(jSONObject.optBoolean("rurl"));
                gVar2.i(jSONObject.optLong("uct"));
                gVar2.h(jSONObject.optBoolean("ujds"));
                gVar2.H(jSONObject.optInt("n2"));
                gVar2.I(jSONObject.optInt("n3"));
                gVar2.r(jSONObject.optInt("is_startup_crashsystem", 1));
                gVar2.G(jSONObject.optInt("pcrn"));
                gVar2.F(jSONObject.optInt("pcon", 0));
                gVar2.f(jSONObject.optLong(CampaignEx.JSON_KEY_PLCTB) == 0 ? 7200L : jSONObject.optLong(CampaignEx.JSON_KEY_PLCTB));
                gVar2.G(jSONObject.optInt("pcrn", 100));
                gVar2.E(jSONObject.optInt("opent", 1));
                gVar2.g(jSONObject.optLong("sfct", 1800L));
                gVar2.W(jSONObject.optInt("upgd", 1));
                gVar2.X(jSONObject.optInt("upsrl", 1));
                gVar2.V(jSONObject.optInt("updevid", 1));
                gVar2.Q(jSONObject.optInt("sc", 0));
                gVar2.U(jSONObject.optInt("up_tips", 1));
                gVar2.s(jSONObject.optInt("iseu", -1));
                gVar2.p(jSONObject.optString("jm_unit"));
                try {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("atf");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        arrayList = new ArrayList();
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            String strOptString = jSONArrayOptJSONArray.optString(i10);
                            if (a1.b(strOptString)) {
                                JSONObject jSONObject2 = new JSONObject(strOptString);
                                arrayList.add(new com.mbridge.msdk.foundation.entity.a(jSONObject2.optInt("adtype"), jSONObject2.optString("unitid")));
                            }
                        }
                    }
                    if (arrayList != null) {
                        gVar2.a((List<com.mbridge.msdk.foundation.entity.a>) arrayList);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                gVar2.g(jSONObject.optInt("adct", 259200));
                gVar2.k(jSONObject.optString("confirm_title", ""));
                gVar2.i(jSONObject.optString("confirm_description", ""));
                gVar2.j(jSONObject.optString("confirm_t", ""));
                gVar2.h(jSONObject.optString("confirm_c_rv", ""));
                gVar2.g(jSONObject.optString("confirm_c_play", ""));
                gVar2.c(jSONObject.optString("adchoice_icon", ""));
                gVar2.d(jSONObject.optString("adchoice_link", ""));
                gVar2.e(jSONObject.optString("adchoice_size", ""));
                gVar2.w(jSONObject.optString("platform_logo", ""));
                gVar2.x(jSONObject.optString("platform_name", ""));
                gVar2.a(a(jSONObject.optString("cdnate_cfg", "")));
                gVar2.i(jSONObject.optInt("atrqt", 0));
                gVar2.t(jSONObject.optInt("iupdid", 0));
                gVar2.C(jSONObject.optInt("mcs", 120));
                gVar2.b(jSONObject.optString("ab_id", ""));
                gVar2.y(jSONObject.optString(ImpressionLog.f43648x, ""));
                gVar2.q(jSONObject.optString("log_rate", Y1.f27894f));
                gVar2.v(jSONObject.optString("omsdkjs_url", ""));
                gVar2.u(jSONObject.optString("omsdkjs_h5_url", ""));
                gVar2.L(jSONObject.optInt("rty_tk_clk", 0));
                gVar2.N(jSONObject.optInt("rty_tk_imp", 0));
                gVar2.M(jSONObject.optInt("rty_cnt", 3));
                gVar2.P(jSONObject.optInt("rty_to", 600));
                gVar2.O(jSONObject.optInt("rty_inr", 10));
                gVar2.n(jSONObject.optString("dns"));
                gVar2.v(jSONObject.optString("omsdkjs_url", ""));
                gVar2.u(jSONObject.optString("omsdkjs_h5_url", ""));
                long jOptLong = jSONObject.optLong("tcto");
                if (jOptLong == 0) {
                    gVar2.h(10L);
                } else {
                    gVar2.h(jOptLong);
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("jt");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        HashMap map = new HashMap();
                        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i11);
                            map.put(jSONObjectOptJSONObject.optString(C3426d4.j.D), jSONObjectOptJSONObject.optString("format"));
                        }
                        gVar2.b(map);
                    }
                }
                gVar2.r(jSONObject.optString("mraid_js"));
                gVar2.B(jSONObject.optString("web_env_url"));
                int iOptInt = jSONObject.optInt("alrbs", 0);
                if (iOptInt > 2 || iOptInt < 0) {
                    iOptInt = 0;
                }
                gVar2.h(iOptInt);
                gVar2.e(jSONObject.optBoolean("GDPR_area", false));
                gVar2.l(jSONObject.optInt(T1.f27640b, 120));
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("ercd");
                if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                    ArrayList<Integer> arrayList2 = new ArrayList<>();
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                        int iOptInt2 = jSONArrayOptJSONArray3.optInt(i12);
                        if (iOptInt2 != 0) {
                            arrayList2.add(Integer.valueOf(iOptInt2));
                        }
                    }
                    if (arrayList2.size() > 0) {
                        arrayList2.add(-1);
                        gVar2.a(arrayList2);
                    }
                }
                String strOptString2 = jSONObject.optString("hst");
                if (!TextUtils.isEmpty(strOptString2)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(k0.a(strOptString2));
                        Iterator<String> itKeys = jSONObject3.keys();
                        HashMap<String, String> map2 = new HashMap<>();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(jSONObject3.optString(next)) && !TextUtils.isEmpty(k0.a(jSONObject3.optString(next)))) {
                                map2.put(next, jSONObject3.optString(next));
                            }
                        }
                        if (map2.size() > 0) {
                            gVar2.a(map2);
                        }
                    } catch (Exception e11) {
                        q0.b("SETTING", e11.getMessage());
                    }
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("refactor_switch");
                if (jSONArrayOptJSONArray4 != null && jSONArrayOptJSONArray4.length() > 0) {
                    for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                        JSONObject jSONObject4 = jSONArrayOptJSONArray4.getJSONObject(i13);
                        Iterator<String> itKeys2 = jSONObject4.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            if (!TextUtils.isEmpty(next2) && jSONObject4.getBoolean(next2)) {
                                gVar2.a(Integer.parseInt(next2));
                            }
                        }
                    }
                }
                try {
                    int iOptInt3 = jSONObject.optInt("lqcnt", 30);
                    int iOptInt4 = jSONObject.optInt("lqto", 5);
                    int iOptInt5 = jSONObject.optInt("lqswt", 0);
                    int iOptInt6 = jSONObject.optInt("lqtype", 1);
                    gVar2.x(iOptInt4);
                    gVar2.u(iOptInt3);
                    gVar2.w(iOptInt5);
                    gVar2.y(iOptInt6);
                    gVar2.a(jSONObject.optJSONArray("lg_bl"));
                    gVar2.b(jSONObject.optJSONArray("lg_wl"));
                    gVar2.Z(jSONObject.optInt("lg_wl_rt"));
                    gVar2.R(jSONObject.optInt("srml", 8000));
                    gVar2.z(jSONObject.optInt("lrml", 8000));
                    gVar2.Y(jSONObject.optInt("wgl_d_ms", 1300));
                    gVar2.m(jSONObject.optInt("dp_ct", f36795e1));
                    int i14 = Integer.parseInt(k0.a(jSONObject.optString("lqpt")));
                    if (i14 > 0 && i14 < 65535) {
                        gVar2.v(i14);
                    }
                } catch (Exception unused) {
                }
                gVar2.a0(jSONObject.optInt("wvddt", 0));
                gVar2.l(jSONObject.optString("hst_st", ""));
                gVar2.m(jSONObject.optString("hst_st_t", ""));
                try {
                    int iOptInt7 = jSONObject.optInt("l", 3);
                    boolean z10 = jSONObject.optInt(CampaignEx.JSON_KEY_AD_K, 0) == 1;
                    boolean z11 = jSONObject.optInt(InneractiveMediationDefs.GENDER_MALE, 1) == 1;
                    gVar2.K(iOptInt7);
                    gVar2.f(z10);
                    gVar2.a(z11);
                } catch (Exception e12) {
                    q0.b("Setting", e12.getMessage());
                }
                gVar2.n(jSONObject.optInt("fbk_swt", 0));
                gVar2.a(C0376b.a(jSONObject.optJSONObject("fbk")));
                try {
                    int iOptInt8 = jSONObject.optInt("ad_connection_timeout", com.mbridge.msdk.foundation.same.a.f34905o);
                    int iOptInt9 = jSONObject.optInt("ad_read_timeout", com.mbridge.msdk.foundation.same.a.f34907q);
                    int iOptInt10 = jSONObject.optInt("ad_write_timeout", com.mbridge.msdk.foundation.same.a.f34909s);
                    int iOptInt11 = jSONObject.optInt("ad_retry_count", com.mbridge.msdk.foundation.same.a.f34908r);
                    if (iOptInt8 <= 0) {
                        iOptInt8 = com.mbridge.msdk.foundation.same.a.f34905o;
                    }
                    gVar2.c(iOptInt8);
                    if (iOptInt9 <= 0) {
                        iOptInt9 = com.mbridge.msdk.foundation.same.a.f34907q;
                    }
                    gVar2.d(iOptInt9);
                    if (iOptInt10 <= 0) {
                        iOptInt10 = com.mbridge.msdk.foundation.same.a.f34909s;
                    }
                    gVar2.f(iOptInt10);
                    if (iOptInt11 < 0) {
                        iOptInt11 = com.mbridge.msdk.foundation.same.a.f34908r;
                    }
                    gVar2.e(iOptInt11);
                    int iOptInt12 = jSONObject.optInt("max_download_task_size", 10);
                    if (iOptInt12 <= 0) {
                        iOptInt12 = 10;
                    }
                    gVar2.B(iOptInt12);
                    gVar2.A(jSONObject.optInt("max_bitmap_cache_size", 10));
                    gVar2.T(jSONObject.optInt("t_t", 3));
                    gVar2.p(jSONObject.optInt("h_t", 3));
                    gVar2.o(jSONObject.optInt("gtp"));
                    gVar2.d(jSONObject.optLong("i_i_t", 3600L));
                    gVar2.t(jSONObject.optString(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I, ""));
                    gVar2.D(jSONObject.optInt("n_c_u_p", 0));
                } catch (Exception unused2) {
                }
                try {
                    gVar2.o(jSONObject.optString("http_track_url", ""));
                } catch (Exception unused3) {
                }
                gVar2.S(jSONObject.optInt("st_net", 1));
                gVar2.A(jSONObject.optString("vtag", ""));
                try {
                    gVar2.c(jSONObject.optInt("check_webview", 0) != 0);
                } catch (Exception unused4) {
                    gVar2.c(false);
                }
                gVar2.z(jSONObject.optString("swxid"));
                gVar2.c(jSONObject.optJSONArray("sdk_filters"));
                try {
                    gVar2.k(jSONObject.optInt("ch_nv_im_cb", 1));
                } catch (Exception unused5) {
                    gVar2.k(1);
                }
                try {
                    gVar2.d(jSONObject.optInt("do_us_fi_re", 1) != 0);
                } catch (Exception unused6) {
                    gVar2.d(true);
                }
                try {
                    a(jSONObject);
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
                String strOptString3 = jSONObject.optString("bcp");
                if (!TextUtils.isEmpty(strOptString3)) {
                    gVar2.a(com.mbridge.msdk.setting.a.a(k0.a(strOptString3)));
                }
                String strOptString4 = jSONObject.optString("monitor");
                if (!TextUtils.isEmpty(strOptString4)) {
                    gVar2.a(d.a(k0.a(strOptString4)));
                }
                if (jSONObject.has("new_pipeline_id")) {
                    gVar2.J(jSONObject.optInt("new_pipeline_id"));
                }
                return gVar2;
            } catch (Exception e14) {
                e = e14;
                gVar = gVar2;
                e.printStackTrace();
                return gVar;
            }
        } catch (Exception e15) {
            e = e15;
        }
    }

    public void A(int i10) {
        if (i10 > 0) {
            this.f36817i0 = i10;
        }
    }

    public int A0() {
        return this.Y0;
    }

    public void B(int i10) {
        this.f36815h0 = i10;
    }

    public boolean B0() {
        return this.Q;
    }

    public void C(int i10) {
        this.f36819j0 = i10;
    }

    public boolean C0() {
        return this.f36838t;
    }

    public int D() {
        return this.R;
    }

    public boolean D0() {
        return this.f36844w;
    }

    public void E(int i10) {
        this.f36829o0 = i10;
    }

    public boolean E0() {
        return this.S;
    }

    public void F(int i10) {
        this.f36833q0 = i10;
    }

    public boolean F0() {
        return this.f36796a;
    }

    public void G(int i10) {
        this.f36831p0 = i10;
    }

    public boolean G0() {
        return (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f36850z) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.f36846x)) ? false : true;
    }

    public void H(int i10) {
        this.f36835r0 = i10;
    }

    public boolean H0() {
        return (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.f36850z) || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.f36848y)) ? false : true;
    }

    public void I(int i10) {
        this.f36837s0 = i10;
    }

    public boolean I0() {
        return this.T;
    }

    public void J(int i10) {
        this.f36804c1 = i10;
    }

    public boolean J0() {
        return this.E0;
    }

    public void K(int i10) {
        this.f36849y0 = i10;
    }

    public boolean K0() {
        return this.P0;
    }

    public void L(int i10) {
        this.f36851z0 = i10;
    }

    public void M(int i10) {
        this.A0 = i10;
    }

    public void N(int i10) {
        this.B0 = i10;
    }

    public void O(int i10) {
        this.C0 = i10;
    }

    public void P(int i10) {
        this.D0 = i10;
    }

    public void Q(int i10) {
        this.F0 = i10;
    }

    public void R(int i10) {
        this.K0 = i10;
    }

    public void S(int i10) {
        this.L0 = i10;
    }

    public void T(int i10) {
        this.N0 = i10;
    }

    public void U(int i10) {
        this.Q0 = i10;
    }

    public void V(int i10) {
        this.R0 = i10;
    }

    public void W(int i10) {
        this.S0 = i10;
    }

    public void X(int i10) {
        this.T0 = i10;
    }

    public void Y(int i10) {
        this.W0 = i10;
    }

    public int Z() {
        return this.f36804c1;
    }

    public void a0(int i10) {
        this.Y0 = i10;
    }

    public long b0() {
        if (this.f36845w0 <= 0) {
            this.f36845w0 = 7200L;
        }
        return this.f36845w0;
    }

    public void c(String str) {
        this.f36816i = str;
    }

    public int c0() {
        return this.f36849y0;
    }

    public void d(int i10) {
        this.f36810f = i10;
    }

    public int d0() {
        return this.f36851z0;
    }

    public void e(String str) {
        this.f36820k = str;
    }

    public int e0() {
        return this.A0;
    }

    public int f() {
        return this.f36824m;
    }

    public int f0() {
        return this.B0;
    }

    public List<com.mbridge.msdk.foundation.entity.a> g() {
        return this.f36826n;
    }

    public int g0() {
        return this.C0;
    }

    public int h() {
        return this.f36828o;
    }

    public int h0() {
        return this.D0;
    }

    public long i() {
        return this.f36830p;
    }

    public int i0() {
        return this.F0;
    }

    public void j(int i10) {
        this.f36840u = i10;
    }

    public JSONArray j0() {
        return this.G0;
    }

    public void k(int i10) {
        this.f36842v = i10;
    }

    public JSONObject k0() {
        return this.H0;
    }

    public void l(int i10) {
        this.C = i10;
    }

    public String l0() {
        return this.I0;
    }

    public void m(String str) {
        this.E = str;
    }

    public long m0() {
        return this.J0;
    }

    public void n(int i10) {
        this.K = i10;
    }

    public int n0() {
        return this.K0;
    }

    public void o(int i10) {
        this.M = i10;
        com.mbridge.msdk.foundation.same.net.utils.d.h().d(i10);
    }

    public int o0() {
        return this.L0;
    }

    public void p(int i10) {
        this.N = i10;
    }

    public long p0() {
        return this.M0 * 1000;
    }

    public void q(int i10) {
        this.R = i10;
    }

    public int q0() {
        return this.N0;
    }

    public void r(int i10) {
        this.U = i10;
    }

    public long r0() {
        return this.O0;
    }

    public void s(int i10) {
        this.V = i10;
    }

    public int s0() {
        return this.Q0;
    }

    public int t() {
        return this.C;
    }

    public int t0() {
        return this.R0;
    }

    public String toString() {
        return " cfc=" + this.f36840u + " getpf=" + this.L + " rurl=" + this.E0;
    }

    public void u(int i10) {
        this.f36797a0 = i10;
    }

    public int u0() {
        return this.S0;
    }

    public void v(int i10) {
        this.f36800b0 = i10;
        com.mbridge.msdk.foundation.same.net.utils.d.h().b(i10);
        com.mbridge.msdk.foundation.same.net.utils.d.h().c(i10);
    }

    public int v0() {
        return this.T0;
    }

    public void w(int i10) {
        this.f36803c0 = i10;
    }

    public String w0() {
        return this.U0;
    }

    public void x(int i10) {
        this.f36806d0 = i10;
    }

    public String x0() {
        return this.V0;
    }

    public void y(int i10) {
        this.f36809e0 = i10;
    }

    public int y0() {
        return this.W0;
    }

    public void z(int i10) {
        this.f36811f0 = i10;
    }

    public int z0() {
        return this.X0;
    }

    public void A(String str) {
        this.U0 = str;
    }

    public void B(String str) {
        this.V0 = str;
    }

    public void L0() {
        String language = Locale.getDefault().getLanguage();
        if (!H0()) {
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.B = "确认关闭？";
                this.f36850z = "关闭后您将不会获得任何奖励噢~ ";
                this.A = "确认关闭";
                this.f36848y = "继续观看";
            } else {
                this.B = "Confirm to close? ";
                this.f36850z = "You will not be rewarded after closing the window";
                this.A = "Close it";
                this.f36848y = "Continue";
            }
        }
        if (!G0()) {
            if (!TextUtils.isEmpty(language) && language.equals("zh")) {
                this.B = "确认关闭？";
                this.f36850z = "关闭后您将不会获得任何奖励噢~ ";
                this.A = "确认关闭";
                this.f36846x = "继续试玩";
                return;
            }
            this.B = "Confirm to close? ";
            this.f36850z = "You will not be rewarded after closing the window";
            this.A = "Close it";
            this.f36846x = "Continue";
        }
    }

    public String c() {
        return this.f36818j;
    }

    public void d(String str) {
        this.f36818j = str;
    }

    public int e() {
        return this.f36822l;
    }

    public void f(String str) {
        this.f36834r = str;
    }

    public void g(String str) {
        this.f36846x = str;
    }

    public void h(String str) {
        this.f36848y = str;
    }

    public void i(String str) {
        this.f36850z = str;
    }

    public void j(String str) {
        this.A = str;
    }

    public void k(String str) {
        this.B = str;
    }

    public void l(String str) {
        this.D = str;
    }

    public void m(int i10) {
        this.G = i10;
        com.mbridge.msdk.click.utils.a.f32945d = i10;
    }

    public void n(String str) {
        this.f36807d1 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e.a().b(k0.a(str));
    }

    public void p(String str) {
        this.X = str;
    }

    public void q(String str) {
        this.Z = str;
    }

    public void r(String str) {
        this.f36821k0 = str;
    }

    public void s(String str) {
        this.f36823l0 = str;
    }

    public void t(int i10) {
        this.W = i10;
    }

    public void u(String str) {
        this.f36825m0 = str;
    }

    public void w(String str) {
        this.f36839t0 = str;
    }

    public void x(String str) {
        this.f36841u0 = str;
    }

    public void y(String str) {
        this.I0 = str;
    }

    public void z(String str) {
        if (TextUtils.isEmpty(this.f36813g0)) {
            return;
        }
        this.f36813g0 = str;
        if (TextUtils.isEmpty(com.mbridge.msdk.foundation.controller.c.n().j())) {
            com.mbridge.msdk.foundation.controller.c.n().d(this.f36813g0);
        }
    }

    public void c(long j10) {
        this.L = j10;
    }

    public String d() {
        return this.f36820k;
    }

    public void e(long j10) {
        this.f36843v0 = j10;
    }

    public void f(long j10) {
        this.f36845w0 = j10;
    }

    public void g(long j10) {
        this.J0 = j10;
    }

    public void h(long j10) {
        this.M0 = j10;
    }

    public void i(long j10) {
        this.O0 = j10;
    }

    public void o(String str) {
        this.P = str;
    }

    public void c(JSONArray jSONArray) {
        this.G0 = jSONArray;
    }

    public void d(boolean z10) {
        this.S = z10;
    }

    public void e(boolean z10) {
        this.f36796a = z10;
    }

    public void f(boolean z10) {
        this.T = z10;
    }

    public void g(boolean z10) {
        this.E0 = z10;
    }

    public void h(boolean z10) {
        this.P0 = z10;
    }

    public void v(String str) {
        this.f36827n0 = str;
    }

    public void c(JSONObject jSONObject) {
        this.H0 = jSONObject;
    }

    public void c(boolean z10) {
        this.f36844w = z10;
    }

    public static Map<String, a> a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a aVar = new a();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    aVar.a(jSONObjectOptJSONObject);
                }
                map.put(next, aVar);
            }
            return map;
        } catch (JSONException e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return null;
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                e11.printStackTrace();
            }
            return null;
        }
    }

    public void a(int i10) {
        this.f36847x0.add(Integer.valueOf(i10));
    }

    private static void a(JSONObject jSONObject) {
        FastKV fastKVBuild = null;
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            try {
                fastKVBuild = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), k0.a("H+tU+FeXHM==")).build();
            } catch (Exception unused) {
            }
        }
        if (fastKVBuild != null) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (jSONObject == null || contextD == null) {
                    return;
                }
                String strOptString = jSONObject.optString("b");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString)) {
                    com.mbridge.msdk.foundation.same.a.V = strOptString;
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b", com.mbridge.msdk.foundation.same.a.V);
                    try {
                        fastKVBuild.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    } catch (Exception unused2) {
                    }
                }
                String strOptString2 = jSONObject.optString("c");
                if (TextUtils.isEmpty(strOptString2) || TextUtils.equals(com.mbridge.msdk.foundation.same.a.f34897g, strOptString2)) {
                    return;
                }
                com.mbridge.msdk.foundation.same.a.f34897g = strOptString2;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f34897g);
                try {
                    fastKVBuild.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f34897g);
                    return;
                } catch (Exception unused3) {
                    return;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        try {
            Context contextD2 = com.mbridge.msdk.foundation.controller.c.n().d();
            if (jSONObject == null || contextD2 == null) {
                return;
            }
            String strOptString3 = jSONObject.optString("b");
            if (!TextUtils.isEmpty(strOptString3) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.V, strOptString3)) {
                com.mbridge.msdk.foundation.same.a.V = strOptString3;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("b", com.mbridge.msdk.foundation.same.a.V);
                SharedPreferences sharedPreferences = contextD2.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(k0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    editorEdit.apply();
                }
            }
            String strOptString4 = jSONObject.optString("c");
            if (TextUtils.isEmpty(strOptString4) || TextUtils.equals(com.mbridge.msdk.foundation.same.a.f34897g, strOptString4)) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.f34897g = strOptString4;
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("c", com.mbridge.msdk.foundation.same.a.f34897g);
            SharedPreferences sharedPreferences2 = contextD2.getSharedPreferences(k0.a("H+tU+FeXHM=="), 0);
            if (sharedPreferences2 != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.putString(k0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f34897g);
                editorEdit2.apply();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String a() {
        return this.f36805d;
    }

    public void a(List<com.mbridge.msdk.foundation.entity.a> list) {
        this.f36826n = list;
    }

    public void a(long j10) {
        this.f36830p = j10;
    }

    public void a(com.mbridge.msdk.setting.a aVar) {
        this.f36832q = aVar;
    }

    public void a(Map<String, a> map) {
        this.f36836s = map;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.H = arrayList;
    }

    public void a(d dVar) {
        this.I = dVar;
    }

    public void a(C0376b c0376b) {
        this.J = c0376b;
    }

    public void a(HashMap<String, String> map) {
        this.O = map;
    }

    public void a(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000088");
        }
        this.f36799b = jSONArray;
    }

    public void a(boolean z10) {
        this.Q = z10;
    }

    public void b(String str) {
        this.f36805d = str;
    }

    public String b() {
        return this.f36816i;
    }

    public void b(long j10) {
        this.F = j10;
    }

    public void b(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000041");
            jSONArray.put("2000042");
            jSONArray.put("2000032");
            jSONArray.put("2000079");
        }
        this.f36802c = jSONArray;
    }

    public void b(boolean z10) {
        this.f36838t = z10;
    }

    public boolean b(int i10) {
        return this.f36847x0.contains(Integer.valueOf(i10));
    }
}
