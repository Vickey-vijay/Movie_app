package com.mbridge.msdk.setting;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: BaseUnitSetting.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {
    private String A;
    private int D;
    private int E;
    private int I;
    private String K;
    private int N;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f36863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f36864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36867f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36870i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f36872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f36873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36875n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f36876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f36877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f36878q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f36879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f36880s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f36881t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f36882u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f36887z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36862a = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36871j = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f36883v = 30;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f36884w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f36885x = 10;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f36886y = 60;
    private int B = 1;
    private String C = "";
    private int F = 100;
    private int G = 60;
    private int H = 5000;
    private int J = 1;
    private String L = "";
    private String M = "";

    public static l a(JSONObject jSONObject) {
        l lVar = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            l lVar2 = new l();
            try {
                lVar2.e(jSONObject.optString("unitId"));
                lVar2.a(jSONObject.optString("ab_id"));
                lVar2.f(jSONObject.optString(ImpressionLog.f43648x));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adSourceList");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i10)));
                    }
                    lVar2.a(arrayList);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                        arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i11)));
                    }
                    lVar2.b(arrayList2);
                }
                lVar2.x(jSONObject.optInt("tpqn"));
                lVar2.c(jSONObject.optInt("aqn"));
                lVar2.b(jSONObject.optInt("acn"));
                lVar2.z(jSONObject.optInt("wt"));
                int i12 = 1;
                lVar2.o(jSONObject.optInt("iscasf", 1));
                lVar2.w(jSONObject.optInt("spmxrt", 5000));
                lVar2.c(jSONObject.optLong("current_time"));
                lVar2.r(jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET));
                lVar2.d(jSONObject.optLong("dlct", 3600L));
                lVar2.d(jSONObject.optInt("autoplay", 0));
                lVar2.k(jSONObject.optInt("dlnet", 2));
                lVar2.c(jSONObject.optString("no_offer"));
                lVar2.f(jSONObject.optInt("cb_type"));
                lVar2.b(jSONObject.optLong("clct", 86400L));
                lVar2.a(jSONObject.optLong("clcq", 300L));
                lVar2.u(jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100));
                lVar2.g(jSONObject.optInt("cd_rate", 0));
                lVar2.i(jSONObject.optInt("content", 1));
                lVar2.m(jSONObject.optInt("impt", 0));
                lVar2.l(jSONObject.optInt("icon_type", 1));
                lVar2.b(jSONObject.optString("no_ads_url", ""));
                lVar2.t(jSONObject.optInt("playclosebtn_tm", -1));
                lVar2.s(jSONObject.optInt("play_ctdown", 0));
                lVar2.h(jSONObject.optInt("close_alert", 0));
                lVar2.n(jSONObject.optInt("intershowlimit", 30));
                lVar2.v(jSONObject.optInt("refreshFq", 60));
                lVar2.e(jSONObject.optInt("closeBtn", 0));
                int iOptInt = jSONObject.optInt("tmorl", 1);
                if (iOptInt <= 2 && iOptInt > 0) {
                    i12 = iOptInt;
                }
                lVar2.y(i12);
                lVar2.d(jSONObject.optString("placementid", ""));
                lVar2.p(jSONObject.optInt("ltafemty", 10));
                lVar2.q(jSONObject.optInt("ltorwc", 60));
                lVar2.g(jSONObject.optString("vtag", ""));
                return lVar2;
            } catch (Exception e10) {
                e = e10;
                lVar = lVar2;
                e.printStackTrace();
                return lVar;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public List<Integer> b() {
        return this.f36863b;
    }

    public void c(String str) {
        this.A = str;
    }

    public void d(int i10) {
        this.f36868g = i10;
    }

    public int e() {
        return this.f36866e;
    }

    public int f() {
        return this.f36867f;
    }

    public int g() {
        return this.f36869h;
    }

    public int h() {
        return this.f36870i;
    }

    public int i() {
        return this.f36871j;
    }

    public long j() {
        return this.f36872k;
    }

    public long k() {
        return this.f36873l;
    }

    public int l() {
        return this.f36874m;
    }

    public int m() {
        return this.f36875n;
    }

    public int n() {
        return this.f36876o;
    }

    public long o() {
        return this.f36877p;
    }

    public long p() {
        return this.f36878q;
    }

    public int q() {
        return this.f36879r;
    }

    public int r() {
        return this.f36881t;
    }

    public int s() {
        return this.f36882u;
    }

    public int t() {
        return this.f36884w;
    }

    public int u() {
        return this.f36885x;
    }

    public int v() {
        return this.f36886y;
    }

    public String w() {
        return this.f36887z;
    }

    public String x() {
        return this.A;
    }

    public void y(int i10) {
        this.J = i10;
    }

    public String z() {
        return this.C;
    }

    public int A() {
        return this.D;
    }

    public int B() {
        return this.E;
    }

    public int C() {
        return this.F;
    }

    public int D() {
        return this.G;
    }

    public int E() {
        return this.H;
    }

    public int F() {
        return this.I;
    }

    public int G() {
        return this.J;
    }

    public String H() {
        return this.K;
    }

    public String I() {
        return this.L;
    }

    public String J() {
        return this.M;
    }

    public int K() {
        return this.N;
    }

    public int L() {
        return this.f36868g;
    }

    public JSONObject M() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> listB = b();
            if (listB != null && listB.size() > 0) {
                int size = listB.size();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < size; i10++) {
                    jSONArray.put(listB.get(i10));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> listC = c();
            if (listC != null && listC.size() > 0) {
                int size2 = listC.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < size2; i11++) {
                    jSONArray2.put(listC.get(i11));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", F());
            jSONObject.put("aqn", f());
            jSONObject.put("acn", e());
            jSONObject.put("wt", K());
            jSONObject.put("current_time", o());
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, y());
            jSONObject.put("dlct", p());
            jSONObject.put("autoplay", L());
            jSONObject.put("dlnet", q());
            jSONObject.put("no_offer", x());
            jSONObject.put("cb_type", h());
            jSONObject.put("clct", k());
            jSONObject.put("clcq", j());
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, C());
            jSONObject.put("content", m());
            jSONObject.put("impt", s());
            jSONObject.put("icon_type", r());
            jSONObject.put("no_ads_url", w());
            jSONObject.put("playclosebtn_tm", B());
            jSONObject.put("play_ctdown", A());
            jSONObject.put("close_alert", l());
            jSONObject.put("closeBtn", g());
            jSONObject.put("refreshFq", D());
            jSONObject.put("countdown", n());
            jSONObject.put("allowSkip", d());
            jSONObject.put("tmorl", G());
            jSONObject.put("unitId", H());
            jSONObject.put("placementid", z());
            jSONObject.put("ltafemty", u());
            jSONObject.put("ltorwc", v());
            jSONObject.put("vtag", J());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public void b(List<Integer> list) {
        this.f36864c = list;
    }

    public List<Integer> c() {
        return this.f36864c;
    }

    public int d() {
        return this.f36865d;
    }

    public void e(int i10) {
        this.f36869h = i10;
    }

    public void f(int i10) {
        this.f36870i = i10;
    }

    public void g(int i10) {
        this.f36871j = i10;
    }

    public void h(int i10) {
        this.f36874m = i10;
    }

    public void i(int i10) {
        this.f36875n = i10;
    }

    public void j(int i10) {
        this.f36876o = i10;
    }

    public void k(int i10) {
        this.f36879r = i10;
    }

    public void l(int i10) {
        this.f36881t = i10;
    }

    public void m(int i10) {
        this.f36882u = i10;
    }

    public void n(int i10) {
        this.f36883v = i10;
    }

    public void o(int i10) {
        this.f36884w = i10;
    }

    public void p(int i10) {
        this.f36885x = i10;
    }

    public void q(int i10) {
        this.f36886y = i10;
    }

    public void r(int i10) {
        this.B = i10;
    }

    public void s(int i10) {
        this.D = i10;
    }

    public void t(int i10) {
        this.E = i10;
    }

    public String toString() {
        List<Integer> list = this.f36863b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f36863b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + StringUtils.COMMA;
            }
        }
        return "offset = " + y() + " unitId = " + this.K + " fbPlacementId = " + this.f36880s + str;
    }

    public void u(int i10) {
        this.F = i10;
    }

    public void v(int i10) {
        this.G = i10;
    }

    public void w(int i10) {
        this.H = i10;
    }

    public void x(int i10) {
        this.I = i10;
    }

    public int y() {
        return this.B;
    }

    public void z(int i10) {
        this.N = i10;
    }

    public void b(int i10) {
        this.f36866e = i10;
    }

    public void c(int i10) {
        this.f36867f = i10;
    }

    public void d(long j10) {
        this.f36878q = j10;
    }

    public void e(String str) {
        this.K = str;
    }

    public void f(String str) {
        this.L = str;
    }

    public void g(String str) {
        this.M = str;
    }

    public void b(long j10) {
        this.f36873l = j10;
    }

    public void c(long j10) {
        this.f36877p = j10;
    }

    public void d(String str) {
        this.C = str;
    }

    public void b(String str) {
        this.f36887z = str;
    }

    public String a() {
        return this.f36862a;
    }

    public void a(String str) {
        this.f36862a = str;
        com.mbridge.msdk.foundation.controller.a.f34556r.put(this.K, str);
    }

    public void a(List<Integer> list) {
        this.f36863b = list;
    }

    public void a(int i10) {
        this.f36865d = i10;
    }

    public void a(long j10) {
        this.f36872k = j10;
    }
}
