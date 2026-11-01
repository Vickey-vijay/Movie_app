package sg.bigo.ads.controller.c;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class b implements sg.bigo.ads.api.core.b {

    @Nullable
    private JSONObject A;

    @Nullable
    private List<sg.bigo.ads.api.core.b> B;
    private final long C;
    private final long E;

    @NonNull
    private final sg.bigo.ads.api.core.g F;
    private long G;
    private int H;
    private int I;
    private boolean K;
    private long L;
    private sg.bigo.ads.api.a.m M;
    private final String N;
    private String O;
    private boolean P;
    private boolean Q;
    private String R;
    private final double T;
    private String U;
    private final boolean V;
    private String W;
    private String X;
    private String Y;
    private sg.bigo.ads.api.core.b.d Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.a.l f70605a;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private int f70606aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private String f70607ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private int f70608ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private int f70609ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private boolean f70610ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private int f70611af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private boolean f70612ag;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private int f70614ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private int f70615aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private sg.bigo.ads.api.core.p f70616ak;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private String f70617al;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private int f70618am;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private int f70619an;

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private int f70620ao;

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private int f70621ap;
    private String ar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public String f70622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f70623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f70624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f70625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f70626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f70627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f70628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f70629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f70630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f70631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.api.core.b.e f70632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.api.core.b.f[] f70633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.api.core.b.f[] f70634n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.api.core.b.f[] f70635o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.api.core.b.f[] f70636p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public List<sg.bigo.ads.api.core.b.c> f70637q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public String f70638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f70639s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public String f70640t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public String f70641u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.api.core.b.InterfaceC0698b f70642v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public sg.bigo.ads.api.core.b.a f70643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f70644x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Map<String, String> f70645y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f70646z;
    private int J = 0;
    private int S = 2;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private int f70613ah = 1;
    private sg.bigo.ads.api.core.i aq = new sg.bigo.ads.api.core.i();
    private final long D = SystemClock.elapsedRealtime();

    public b(long j10, @NonNull sg.bigo.ads.api.core.g gVar, @NonNull sg.bigo.ads.api.a.l lVar, @NonNull JSONObject jSONObject) {
        this.f70618am = 1;
        this.f70619an = 0;
        this.f70620ao = 1;
        this.f70646z = 0;
        this.ar = "";
        this.E = j10;
        this.F = gVar;
        this.f70605a = lVar;
        this.f70622b = jSONObject.optString(CreativeInfo.f44321c, "");
        this.f70623c = jSONObject.optString("title", "");
        this.f70624d = jSONObject.optString(UnifiedMediationParams.KEY_DESCRIPTION, "");
        this.f70625e = jSONObject.optString("cta", "");
        String strOptString = jSONObject.optString("dsp_name", "");
        this.f70626f = strOptString;
        this.V = "BigoDsp".equalsIgnoreCase(strOptString);
        this.f70627g = jSONObject.optInt("adx_type", 0);
        this.f70628h = jSONObject.optInt("ad_type", -1);
        this.f70629i = jSONObject.optLong("sid");
        this.f70630j = jSONObject.optString("creative_id", "");
        this.f70631k = jSONObject.optString("series_id", "");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("privacy");
        if (jSONObjectOptJSONObject != null) {
            this.f70632l = new o(jSONObjectOptJSONObject);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("track_clicks_third");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject2 != null) {
                    arrayList.add(new q(jSONObjectOptJSONObject2));
                }
            }
            sg.bigo.ads.api.core.b.f[] fVarArr = new sg.bigo.ads.api.core.b.f[arrayList.size()];
            this.f70634n = fVarArr;
            this.f70634n = (sg.bigo.ads.api.core.b.f[]) arrayList.toArray(fVarArr);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("track_impls_third");
        if (jSONArrayOptJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i11);
                if (jSONObjectOptJSONObject3 != null) {
                    arrayList2.add(new q(jSONObjectOptJSONObject3));
                }
            }
            sg.bigo.ads.api.core.b.f[] fVarArr2 = new sg.bigo.ads.api.core.b.f[arrayList2.size()];
            this.f70633m = fVarArr2;
            this.f70633m = (sg.bigo.ads.api.core.b.f[]) arrayList2.toArray(fVarArr2);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("ad_nurls");
        if (jSONArrayOptJSONArray3 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray3.optJSONObject(i12);
                if (jSONObjectOptJSONObject4 != null) {
                    arrayList3.add(new q(jSONObjectOptJSONObject4));
                }
            }
            sg.bigo.ads.api.core.b.f[] fVarArr3 = new sg.bigo.ads.api.core.b.f[arrayList3.size()];
            this.f70635o = fVarArr3;
            this.f70635o = (sg.bigo.ads.api.core.b.f[]) arrayList3.toArray(fVarArr3);
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("ad_lurls");
        if (jSONArrayOptJSONArray4 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray4.optJSONObject(i13);
                if (jSONObjectOptJSONObject5 != null) {
                    arrayList4.add(new q(jSONObjectOptJSONObject5));
                }
            }
            sg.bigo.ads.api.core.b.f[] fVarArr4 = new sg.bigo.ads.api.core.b.f[arrayList4.size()];
            this.f70636p = fVarArr4;
            this.f70636p = (sg.bigo.ads.api.core.b.f[]) arrayList4.toArray(fVarArr4);
        }
        this.f70637q = new ArrayList();
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("om_data");
        if (jSONArrayOptJSONArray5 != null) {
            this.f70637q = new ArrayList();
            for (int i14 = 0; i14 < jSONArrayOptJSONArray5.length(); i14++) {
                this.f70637q.add(new m(jSONArrayOptJSONArray5.optJSONObject(i14)));
            }
        }
        this.f70638r = jSONObject.optString("enc_price", "");
        this.f70642v = new k(jSONObject);
        this.f70643w = new f(jSONObject);
        this.f70639s = jSONObject.optLong("switch_bit_map", 0L);
        this.f70640t = jSONObject.optString("abflags", "");
        this.C = jSONObject.optLong("expired_interval", 0L);
        this.f70641u = jSONObject.optString("mapping_slot", "");
        this.G = jSONObject.optLong("probe_interval");
        this.H = jSONObject.optInt("playable_ad_switch", 0);
        this.f70644x = jSONObject.optString("req_slot");
        String strOptString2 = jSONObject.optString("interstitial_style_getad_config");
        if (!TextUtils.isEmpty(strOptString2)) {
            try {
                this.M = new sg.bigo.ads.controller.b.j(new JSONObject(strOptString2));
            } catch (JSONException unused) {
            }
        }
        this.aq.a(jSONObject.optString("ad_form"));
        this.O = jSONObject.optString(C3426d4.i.F0);
        this.N = jSONObject.optString("sdk_style_id");
        this.P = jSONObject.optInt("banner_show_ad", 0) == 1;
        this.Q = jSONObject.optInt("banner_show_domain", 0) == 1;
        this.R = jSONObject.optString("ru_ad_marker");
        this.T = (jSONObject.optLong("bid_price", 0L) * 1.0d) / 1.0E8d;
        this.U = jSONObject.optString("adx_country");
        this.f70615aj = jSONObject.optInt("orientation", 0);
        if (sg.bigo.ads.api.core.a.d(this.f70628h)) {
            this.A = jSONObject;
        }
        this.W = jSONObject.optString("ad_bundle_id", "");
        this.X = jSONObject.optString("pop_h5");
        this.Y = jSONObject.optString("pop_img");
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("pop_page");
        if (jSONObjectOptJSONObject6 != null) {
            this.Z = new n(jSONObjectOptJSONObject6);
        }
        int iOptInt = jSONObject.optInt("ad_resp_type");
        this.f70606aa = iOptInt;
        if (iOptInt == 2) {
            a(jSONObject, j10, gVar, lVar);
        }
        this.f70645y = sg.bigo.ads.common.utils.l.a(jSONObject.optString("pub_extra_info"));
        this.f70617al = jSONObject.optString("dsp_extra");
        this.f70618am = jSONObject.optInt("native_banner_fill_strategy", 1);
        this.f70619an = jSONObject.optInt("guide_type", 0);
        this.f70620ao = jSONObject.optInt("native_banner_click_type", 0);
        this.f70621ap = jSONObject.optInt("is_interactive", 0);
        this.f70646z = jSONObject.optInt("vpaid_imp_method", 0);
        this.ar = jSONObject.optString("sponsored", "");
    }

    @Nullable
    public static b a(long j10, @NonNull sg.bigo.ads.api.core.g gVar, @NonNull sg.bigo.ads.api.a.l lVar, String str) {
        try {
            return a(j10, gVar, lVar, new JSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    public static b a(long j10, sg.bigo.ads.api.core.g gVar, sg.bigo.ads.api.a.l lVar, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("adx_type", 0);
        if (iOptInt != 1 && iOptInt != 2) {
            if (iOptInt == 3) {
                return new d(j10, gVar, lVar, jSONObject);
            }
            if (iOptInt != 5) {
                return null;
            }
        }
        return new l(j10, gVar, lVar, jSONObject);
    }

    private void a(JSONObject jSONObject, long j10, sg.bigo.ads.api.core.g gVar, sg.bigo.ads.api.a.l lVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        ArrayList arrayList = null;
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    b bVarA = a(j10, gVar, lVar, jSONObjectOptJSONObject);
                    if (bVarA != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        bVarA.f70606aa = this.f70606aa;
                        arrayList.add(bVarA);
                    } else {
                        sg.bigo.ads.core.d.b.a(1005, 10205, "Error ad in ads");
                    }
                }
            }
        }
        this.B = arrayList;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String A() {
        return this.f70631k;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final sg.bigo.ads.api.core.b.e B() {
        return this.f70632l;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final sg.bigo.ads.api.core.b.f[] C() {
        return this.f70633m;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final sg.bigo.ads.api.core.b.f[] D() {
        return this.f70634n;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final sg.bigo.ads.api.core.b.f[] E() {
        return this.f70635o;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final sg.bigo.ads.api.core.b.f[] F() {
        return this.f70636p;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final List<sg.bigo.ads.api.core.b.c> G() {
        return this.f70637q;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String H() {
        return this.f70638r;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String I() {
        return this.f70640t;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean J() {
        if (!this.K || this.L <= 0) {
            return SystemClock.elapsedRealtime() - this.D >= this.C * 1000;
        }
        return System.currentTimeMillis() > this.L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    @Override // sg.bigo.ads.api.core.b
    public final long K() {
        long jElapsedRealtime;
        if (this.K) {
            long j10 = this.L;
            if (j10 > 0) {
                long j11 = j10 - (this.C * 1000);
                jElapsedRealtime = j11 > 0 ? System.currentTimeMillis() - j11 : 0L;
            } else {
                jElapsedRealtime = SystemClock.elapsedRealtime() - this.D;
            }
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime() - this.D;
        }
        if (jElapsedRealtime > 0) {
            return jElapsedRealtime;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.core.b
    public final long L() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String M() {
        return this.f70641u;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.api.core.b.InterfaceC0698b N() {
        return this.f70642v;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final sg.bigo.ads.api.core.b.a O() {
        return this.f70643w;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int P() {
        return this.f70606aa;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String Q() {
        return this.f70607ab;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int R() {
        return this.f70608ac;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void S() {
        this.f70608ac = this.f70609ad;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void T() {
        this.f70610ae = true;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean U() {
        return this.f70610ae;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int V() {
        return this.f70611af;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int W() {
        return this.f70613ah;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int X() {
        return this.f70614ai;
    }

    @Override // sg.bigo.ads.api.core.b
    public final sg.bigo.ads.api.core.p Y() {
        return this.f70616ak;
    }

    @Override // sg.bigo.ads.api.core.b
    public final long Z() {
        return this.E;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final long a() {
        return sg.bigo.ads.api.a.i.f69318a.i();
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(int i10, int i11, boolean z10) {
        if (!this.f70612ag || z10) {
            this.f70612ag = true;
            this.f70613ah = i10;
            this.f70614ai = i11;
        }
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(long j10) {
        this.L = j10;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(String str) {
        this.f70607ab = str;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(@NonNull sg.bigo.ads.api.a.m mVar) {
        this.M = mVar;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(sg.bigo.ads.api.core.p pVar) {
        this.f70616ak = pVar;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void a(boolean z10) {
        this.S = z10 ? 1 : 2;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean a(int i10) {
        return (this.f70639s & ((long) i10)) > 0;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.api.core.g aa() {
        return this.F;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String ab() {
        return !sg.bigo.ads.common.utils.q.a((CharSequence) this.N) ? this.N : this.f70605a.p();
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ac() {
        return this.H == 1;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ad() {
        return this.I;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ae() {
        return this.J;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final JSONObject af() {
        return this.A;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void ag() {
        this.K = true;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ah() {
        return this.K;
    }

    @Override // sg.bigo.ads.api.core.b
    public final double ai() {
        return this.T;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int aj() {
        return this.f70605a.v();
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ak() {
        return this.f70605a.v() == 2;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean al() {
        return this.V;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final List<sg.bigo.ads.api.core.b> am() {
        return this.B;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String an() {
        return this.f70617al;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ao() {
        return this.f70618am;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int ap() {
        return this.f70619an;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int aq() {
        return this.f70620ao;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean ar() {
        return this.f70615aj == 1;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int as() {
        return this.f70621ap;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int at() {
        return this.f70646z;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String au() {
        return this.ar;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String b() {
        return this.f70605a.l();
    }

    @Override // sg.bigo.ads.api.core.b
    public final String b(String str) {
        if (str == null) {
            return "";
        }
        Map<String, String> map = this.f70645y;
        String str2 = map != null ? map.get(str) : "";
        return str2 == null ? "" : str2;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void b(int i10) {
        this.f70609ad = i10;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String c() {
        return this.f70605a.n();
    }

    @Override // sg.bigo.ads.api.core.b
    public final void c(int i10) {
        this.f70611af = i10;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.api.a.l d() {
        return this.f70605a;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void d(int i10) {
        this.I = i10;
    }

    @Override // sg.bigo.ads.api.core.b
    public final sg.bigo.ads.api.a.m e() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.core.b
    public final void e(int i10) {
        this.J = i10;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final sg.bigo.ads.api.a.e f() {
        return this.aq;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int g() {
        return this.S;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean h() {
        sg.bigo.ads.api.a.m mVar = this.M;
        return mVar != null && mVar.a("endpage.ad_component_layout") == 5;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String i() {
        return this.O;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean j() {
        return this.P;
    }

    @Override // sg.bigo.ads.api.core.b
    public final boolean k() {
        return this.Q;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String l() {
        return this.R;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String m() {
        return this.U;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String n() {
        return this.W;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String o() {
        return this.X;
    }

    @Override // sg.bigo.ads.api.core.b
    public final String p() {
        return this.Y;
    }

    @Override // sg.bigo.ads.api.core.b
    public final sg.bigo.ads.api.core.b.d q() {
        return this.Z;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String r() {
        return this.f70622b;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public String s() {
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.f70623c)) {
            return this.f70623c;
        }
        sg.bigo.ads.api.core.b.d dVar = this.Z;
        return (dVar == null || sg.bigo.ads.common.utils.q.a((CharSequence) dVar.b())) ? this.f70623c : this.Z.b();
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public String t() {
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.f70624d)) {
            return this.f70624d;
        }
        sg.bigo.ads.api.core.b.d dVar = this.Z;
        return (dVar == null || sg.bigo.ads.common.utils.q.a((CharSequence) dVar.c())) ? this.f70624d : this.Z.c();
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String u() {
        return this.f70625e;
    }

    @Override // sg.bigo.ads.api.core.b
    @NonNull
    public final String v() {
        return this.f70626f;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int w() {
        return this.f70627g;
    }

    @Override // sg.bigo.ads.api.core.b
    public final int x() {
        return this.f70628h;
    }

    @Override // sg.bigo.ads.api.core.b
    public final long y() {
        return this.f70629i;
    }

    @Override // sg.bigo.ads.api.core.b
    @Nullable
    public final String z() {
        return this.f70630j;
    }
}
