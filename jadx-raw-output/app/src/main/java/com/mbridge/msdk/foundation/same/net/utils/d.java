package com.mbridge.msdk.foundation.same.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.u;
import com.mbridge.msdk.tracker.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: RequestUrlUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    public String A;
    private String B;
    public String C;
    public String D;
    private String E;
    public String F;
    private String G;
    public String H;
    private String I;
    public String J;
    public String K;
    private String L;
    public String M;
    private String N;
    public String O;
    private String P;
    public String Q;
    public String R;
    private String S;
    public String T;
    public String U;
    private String V;
    public String W;
    public String X;
    private String Y;
    public String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35024a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f35025a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35026b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f35027b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35028c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f35029c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35030d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f35031d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35032e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f35033e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f35034f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f35035f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f35038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f35040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f35041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f35042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f35047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f35048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35049t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<String> f35050u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35051v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<String> f35053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f35054y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f35055z;

    /* JADX INFO: compiled from: RequestUrlUtil.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f35056a = new d();
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private void b() {
        this.M = this.f35034f + this.L;
    }

    private void c() {
        this.A = this.f35054y + this.f35055z;
        this.H = this.f35054y + this.G;
        i.b().f(this.f35054y);
    }

    public void d(int i10) {
        this.f35035f0 = i10;
    }

    public boolean g() {
        try {
            if (this.f35048s) {
                ArrayList<String> arrayList = this.f35053x;
                if (arrayList != null && this.f35052w <= arrayList.size() - 1) {
                    if (!a(this.f35053x.get(this.f35052w))) {
                        this.f35042m = this.f35053x.get(this.f35052w);
                        f();
                    }
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f35050u;
                if (arrayList2 != null && this.f35051v <= arrayList2.size() - 1) {
                    this.f35038i = this.f35050u.get(this.f35051v);
                    e();
                    return true;
                }
            }
            if (this.f35047r) {
                this.f35051v = 0;
                this.f35052w = 0;
            }
            return false;
        } catch (Throwable th2) {
            q0.a("RequestUrlUtil", th2.getMessage());
            return false;
        }
    }

    private d() {
        this.f35024a = "RequestUrlUtil";
        this.f35026b = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f35028c = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f35030d = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f35032e = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f35034f = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f35036g = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f35037h = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f35038i = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f35039j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f35040k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f35041l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f35042m = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f35043n = 9377;
        this.f35044o = 9377;
        this.f35045p = 9988;
        this.f35046q = 9377;
        this.f35047r = false;
        this.f35048s = false;
        this.f35049t = 1;
        this.f35050u = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f35051v = 0;
        this.f35052w = 0;
        this.f35053x = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f35054y = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f35055z = "/bid";
        this.A = this.f35054y + this.f35055z;
        this.B = "/sdk/customid";
        this.C = this.f35038i + this.B;
        this.D = this.f35042m + this.B;
        this.E = "/image";
        this.F = this.f35032e + this.E;
        this.G = "/load";
        this.H = this.f35054y + this.G;
        this.I = "/mapping";
        this.J = this.f35038i + this.I;
        this.K = this.f35042m + this.I;
        this.L = "";
        this.M = this.f35037h + this.L;
        this.N = "/batchPaidEvent";
        this.O = this.f35037h + this.N;
        this.P = "/setting";
        this.Q = this.f35038i + this.P;
        this.R = this.f35042m + this.P;
        this.S = "/rewardsetting";
        this.T = this.f35038i + this.S;
        this.U = this.f35042m + this.S;
        this.V = "/appwall/setting";
        this.W = this.f35038i + this.V;
        this.X = this.f35042m + this.V;
        this.Y = "/openapi/ad/v3";
        this.Z = this.f35032e + this.Y;
        this.f35025a0 = "/openapi/ad/v4";
        this.f35027b0 = this.f35032e + this.f35025a0;
        this.f35029c0 = "/openapi/ad/v5";
        this.f35031d0 = this.f35032e + this.f35029c0;
        this.f35033e0 = true;
        this.f35035f0 = 0;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th2) {
            q0.b("RequestUrlUtil", th2.getMessage());
            return "";
        }
    }

    private void d() {
        this.Z = this.f35032e + this.Y;
        this.f35027b0 = this.f35032e + this.f35025a0;
        this.f35031d0 = this.f35032e + this.f35029c0;
        this.F = this.f35032e + this.E;
    }

    public void e() {
        this.Q = this.f35038i + this.P;
        this.C = this.f35038i + this.B;
        this.T = this.f35038i + this.S;
        this.J = this.f35038i + this.I;
        this.W = this.f35038i + this.V;
    }

    public void f() {
        this.R = this.f35042m + this.P;
        this.D = this.f35042m + this.B;
        this.U = this.f35042m + this.S;
        this.K = this.f35042m + this.I;
        this.X = this.f35042m + this.V;
    }

    public int i() {
        return this.f35035f0;
    }

    public static d h() {
        return b.f35056a;
    }

    public void j() {
        boolean z10;
        HashMap<String, String> mapC;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD != null) {
            com.mbridge.msdk.setting.a aVarJ = gVarD.j();
            if (aVarJ != null) {
                this.f35041l = aVarJ.f();
                this.f35045p = aVarJ.g();
                this.f35037h = aVarJ.e();
                a();
            }
            com.mbridge.msdk.setting.d dVarY = gVarD.y();
            if (dVarY != null) {
                this.f35040k = dVarY.d();
                this.f35044o = dVarY.e();
                this.f35034f = dVarY.c();
                b();
                a(gVarD);
            }
            if (gVarD.o0() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f35048s = z10;
            this.f35049t = gVarD.o0();
            a(!gVarD.b(2));
            if (gVarD.C() != null && gVarD.C().size() > 0 && (mapC = gVarD.C()) != null && mapC.size() > 0) {
                if (mapC.containsKey("v") && !TextUtils.isEmpty(mapC.get("v")) && a(mapC.get("v"))) {
                    this.f35032e = mapC.get("v");
                    d();
                }
                if (mapC.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(mapC.get(CampaignEx.JSON_KEY_HB)) && a(mapC.get(CampaignEx.JSON_KEY_HB))) {
                    this.f35054y = mapC.get(CampaignEx.JSON_KEY_HB);
                    c();
                }
                if (mapC.containsKey("lg") && !TextUtils.isEmpty(mapC.get("lg"))) {
                    String str = mapC.get("lg");
                    if (a(str)) {
                        this.f35030d = str;
                    } else {
                        this.f35039j = str;
                    }
                }
                if (mapC.containsKey("lgt") && !TextUtils.isEmpty(mapC.get("lgt"))) {
                    String str2 = mapC.get("lgt");
                    if (a(str2)) {
                        String strB = b(str2);
                        if (!TextUtils.isEmpty(strB)) {
                            this.f35039j = strB;
                        }
                    } else {
                        this.f35039j = str2;
                    }
                }
            }
            String strU = gVarD.u();
            if (!TextUtils.isEmpty(strU)) {
                this.f35038i = strU;
                e();
                this.f35050u.add(0, strU);
            }
            String strV = gVarD.v();
            if (!TextUtils.isEmpty(strV)) {
                this.f35042m = strV;
                f();
                this.f35053x.add(0, strV);
            }
        }
    }

    public void c(int i10) {
        this.f35046q = i10;
    }

    public String a(String str, int i10) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("_");
                if (strArrSplit.length > 1) {
                    return a(true, strArrSplit[1]);
                }
                return a(true, "");
            }
        } catch (Exception e10) {
            q0.b("RequestUrlUtil", e10.getMessage());
        }
        return i10 % 2 == 0 ? this.f35031d0 : this.Z;
    }

    public void b(int i10) {
        this.f35043n = i10;
    }

    public String a(boolean z10, String str) {
        if (z10) {
            if (this.H.contains(JsonUtils.EMPTY_JSON) && !TextUtils.isEmpty(str)) {
                return this.H.replace(JsonUtils.EMPTY_JSON, str + "-");
            }
            return this.H.replace(JsonUtils.EMPTY_JSON, "");
        }
        return this.A.replace(JsonUtils.EMPTY_JSON, "");
    }

    public void a(boolean z10) {
        this.f35033e0 = z10;
    }

    private void a() {
        this.O = this.f35037h + this.N;
    }

    private void a(g gVar) {
        com.mbridge.msdk.setting.d dVarY;
        if (gVar == null || (dVarY = gVar.y()) == null || dVarY.a() == 1) {
            return;
        }
        int iB = s0.a().b("monitor", "type", s0.a().b("t_r_t", 1));
        if (iB != 0 && iB != 1) {
            iB = 0;
        }
        u.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), new x.b().a(new com.mbridge.msdk.foundation.same.report.d()).a(new n()).a(iB, a(iB)).a(s0.a().b("t_m_e_t", 604800000)).b(s0.a().b("t_m_e_s", 50)).d(s0.a().b("t_m_r_c", 50)).c(s0.a().b("t_m_t", 15000)).e(s0.a().b("t_m_r_t_s", 1)).a(), dVarY.b() * 1000, com.mbridge.msdk.foundation.same.report.c.b());
    }

    private p a(int i10) {
        if (i10 == 1) {
            return new p(new m((byte) 2), h().f35040k, h().f35044o);
        }
        return new p(new com.mbridge.msdk.tracker.network.toolbox.h(), h().M, 0);
    }
}
