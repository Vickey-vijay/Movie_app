package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.pc;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.fak;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.PangleVideoBridge;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.ads.networks.gam.GAMConfig;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class vpp {

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    public rn f12841ak;
    public boolean amr;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    public boolean f12842an;
    public PAGBannerSize bfk;
    public int bly;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public String f12843bo;
    public int bs;
    public boolean bu;
    public int byv;
    public tc ccd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f12845cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    public int f12846cj;
    public int coz;
    public com.bytedance.sdk.openadsdk.core.ryl.ouw cu;
    public String ehk;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public int f12848ej;
    public boolean elx;
    private JSONObject enl;
    public com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt euf;
    public String ey;
    public zih fak;
    public String fqk;
    public int fvf;
    public long fwd;

    /* JADX INFO: renamed from: gh, reason: collision with root package name */
    public boolean f12851gh;
    public boolean hai;
    public JSONObject hsa;
    public String hun;
    public int ixm;
    public int jcd;

    /* JADX INFO: renamed from: jf, reason: collision with root package name */
    public String f12853jf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public jqy f12854jg;

    /* JADX INFO: renamed from: jo, reason: collision with root package name */
    public String f12855jo;
    public int jqy;
    public JSONObject jvj;
    public jg kbx;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public String f12856ki;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    public ryl f12857kn;
    public qbp kq;
    public String lgp;
    public pd lht;

    /* JADX INFO: renamed from: li, reason: collision with root package name */
    private String f12860li;

    /* JADX INFO: renamed from: lk, reason: collision with root package name */
    public int f12861lk;
    public String lso;
    public int lvd;

    /* JADX INFO: renamed from: mb, reason: collision with root package name */
    public vm f12863mb;
    public boolean mq;
    public int mu;
    public String mwh;
    public od nbp;
    public com.bytedance.sdk.openadsdk.core.cf.pno.ouw nit;
    public com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt njr;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    public String f12865nn;
    public Map<String, Object> npr;
    public boolean odc;
    public jae oiz;
    public String osn;
    public pno our;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public int f12868pd;
    public String pev;
    public String qbp;

    /* JADX INFO: renamed from: qg, reason: collision with root package name */
    public String f12869qg;
    public ra qjg;
    public JSONObject qni;

    /* JADX INFO: renamed from: rh, reason: collision with root package name */
    public int f12871rh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public String f12873rn;
    private String rsx;
    public fkw ryl;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt f12874sd;
    public JSONObject smu;
    public String swm;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public String f12878th;

    /* JADX INFO: renamed from: tj, reason: collision with root package name */
    public cd f12879tj;
    public long tlj;
    public boolean tpk;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    public String f12880ub;
    public int ucs;

    /* JADX INFO: renamed from: uj, reason: collision with root package name */
    public int f12881uj;
    public zih uoy;
    public com.bytedance.sdk.openadsdk.core.cf.pno.ouw upp;
    public long uq;
    public String ux;
    public int uy;
    public String uz;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    public int f12882vf;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    public String f12883vh;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    public int f12884vi;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.model.ouw f12885vm;
    public boolean vpp;
    public boolean vr;
    public volatile boolean vrp;
    public le wp;
    public int wud;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    public ouw f12886xn;
    public int xne;
    public mwh xwt;
    public int ycd;
    public String yhj;
    public String yib;
    public AdSlot yiz;
    public int zin;
    public String zjp;
    public int zjq;
    public String znd;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final String f12840lh = pc.a("_", new CharSequence[]{"is", uoy.pd()});
    public static final String yu = pc.a("_", new CharSequence[]{"is", uoy.pd(), "sample"});
    public static final String fkw = pc.a("_", new CharSequence[]{uoy.pd(), C3426d4.f.f28486e});
    public static int ex = 330;
    public long ouw = 0;
    public boolean vt = false;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f12859le = com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f12870ra = com.bytedance.sdk.openadsdk.tc.ouw.lh.vt;
    public String pno = com.bytedance.sdk.openadsdk.tc.ouw.lh.f13343lh;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f12858ko = -1;
    public int zih = 0;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public final List<zih> f12877tc = new ArrayList();
    public final List<String> ksc = new ArrayList();
    public final List<FilterWord> jae = new ArrayList();

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public final fak f12867od = fak.vt();

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public boolean f12844cd = false;
    public List<String> rrs = new ArrayList();
    public List<String> jvy = new ArrayList();
    public String pv = "0";
    public String mt = "";
    public int xdk = 0;
    public int zvq = 2;
    public int myk = -1;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    public int f12864ng = 0;
    public int kfa = 0;
    public int yw = 1;
    public tlj ms = new tlj();
    public int mwe = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    public int qld = 0;
    public int zrz = 1;
    public int eay = 0;
    public int wbf = 0;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    public int f12862ln = 0;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    public int f12850fn = 1;

    /* JADX INFO: renamed from: fg, reason: collision with root package name */
    public int f12849fg = 1;
    public float baa = 100.0f;
    public int eot = -1;
    public int lai = 2;
    public int ajl = 1;

    /* JADX INFO: renamed from: sm, reason: collision with root package name */
    public int f12875sm = 0;
    public int lna = -1;
    public long zu = -1;
    public int cy = 0;
    public int ptd = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: cp, reason: collision with root package name */
    public boolean f12847cp = false;
    public int gls = 0;
    public int ybr = -1;
    public long vby = -1;

    /* JADX INFO: renamed from: ob, reason: collision with root package name */
    public int f12866ob = 50;
    private int qw = -1;

    /* JADX INFO: renamed from: hk, reason: collision with root package name */
    public final vt f12852hk = new vt();

    /* JADX INFO: renamed from: zn, reason: collision with root package name */
    public boolean f12887zn = false;

    /* JADX INFO: renamed from: sn, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.tc.ouw.vt f12876sn = null;
    public int wt = -1;
    public int eap = -1;

    /* JADX INFO: renamed from: rl, reason: collision with root package name */
    private float f12872rl = -1.0f;

    public static class ouw {
        public String bly;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public String f12888cf;
        public String fkw;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public String f12889jg;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public String f12890le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f12891lh;
        public String mwh;
        public String ouw;
        public List<Integer> pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public String f12892ra;
        public String ryl;
        public String tlj;
        public String vt;
        public String yu;

        public final boolean ouw() {
            return !TextUtils.isEmpty(this.tlj) && this.tlj.equals("v3");
        }
    }

    private static JSONObject le(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return PangleVideoBridge.jsonObjectInit(str);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.qbp.lh("MaterialMeta", e10.getMessage());
            }
        }
        return null;
    }

    private static boolean le(int i10) {
        return i10 == 44 || i10 == 43 || i10 == 30 || i10 == 40 || i10 == 41 || i10 == 39;
    }

    public static int lh(String str) {
        JSONObject jSONObjectLe = le(str);
        if (jSONObjectLe != null) {
            return jSONObjectLe.optInt("ut", 0);
        }
        return 0;
    }

    public static boolean ouw(vpp vppVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        if (ouw(vppVar) || z13 || vppVar == null || (vtVar = vppVar.f12874sd) == null || TextUtils.isEmpty(vtVar.pno)) {
            return false;
        }
        if (lh(vppVar)) {
            return z12;
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = vppVar.f12874sd;
        if (vtVar2 != null && vtVar2.f10454cf == 1) {
            com.bytedance.sdk.component.utils.ko.vt("MaterialMeta", "can show end card follow js");
            return z11;
        }
        com.bytedance.sdk.component.utils.ko.vt("MaterialMeta", "can show end card follow js WebViewClient -" + z10 + " jsIsSuc -" + z11);
        return z10;
    }

    private static String ra(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.utils.rn.ouw(str);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.yu("MaterialMeta", "generate icon key error", th2.getMessage());
            return null;
        }
    }

    public static boolean vt(vpp vppVar) {
        return (ouw(vppVar) || lh(vppVar)) ? false : true;
    }

    public final int bly() {
        try {
            JSONObject jSONObjectFak = fak();
            if (jSONObjectFak != null) {
                return jSONObjectFak.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vpp.class == obj.getClass()) {
            vpp vppVar = (vpp) obj;
            if (this.pv.equals(vppVar.pv) && this.yhj.equals(vppVar.yhj)) {
                return true;
            }
        }
        return false;
    }

    public final int fkw() {
        return this.zih;
    }

    public final JSONObject jae() {
        JSONObject jSONObjectOuw = ouw(false);
        JSONObject jSONObjectMwh = com.bytedance.sdk.openadsdk.core.settings.cf.vt().mwh(String.valueOf(fqk()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObjectOuw);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put(CommonUrlParts.REQUEST_ID, "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", jSONObjectMwh);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.qbp.yu("MaterialMeta", "toJsonObjPlus", e10.getMessage());
        }
        return jSONObject;
    }

    public final void kn() {
        this.vt = true;
    }

    public final String yu(String str) {
        JSONObject jSONObjectFak = fak();
        return jSONObjectFak != null ? jSONObjectFak.optString("rit", str) : str;
    }

    public static double vt(String str) {
        return ouw(le(str));
    }

    public final boolean an() {
        int i10 = this.bs;
        return i10 == 44 || i10 == 43;
    }

    public final com.bytedance.sdk.component.bly.vt.ouw bs() {
        com.bytedance.sdk.component.bly.vt.ouw ouwVar = new com.bytedance.sdk.component.bly.vt.ouw();
        ouwVar.ouw = this.f12884vi;
        ouwVar.f11656lh = this.pv;
        ouwVar.vt = this.yhj;
        return ouwVar;
    }

    public final boolean cd() {
        int i10 = this.cy;
        return (i10 == 1 || i10 == 3) && this.cu != null;
    }

    public final int cf() {
        if (this.qw < 0) {
            try {
                JSONObject jSONObjectFak = fak();
                if (jSONObjectFak != null) {
                    this.qw = jSONObjectFak.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.qw = 0;
                }
            } catch (Throwable unused) {
                this.qw = 0;
            }
        }
        return this.qw;
    }

    public final boolean cj() {
        return this.f12867od.ouw > 0;
    }

    public final float coz() {
        float f10 = this.f12872rl;
        if (f10 > 0.0f) {
            return f10;
        }
        pd pdVar = this.lht;
        if (pdVar != null) {
            String strOuw = pdVar.yu;
            if (TextUtils.isEmpty(strOuw)) {
                com.bytedance.sdk.openadsdk.core.cf.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.cf.ouw.vt.ouw();
                pd pdVar2 = this.lht;
                strOuw = vtVarOuw.ouw("adv3", pdVar2.ouw, pdVar2.vt);
            }
            if (strOuw != null) {
                try {
                    JSONObject jSONObjectOptJSONObject = PangleVideoBridge.jsonObjectInit(strOuw).optJSONObject("body");
                    if (jSONObjectOptJSONObject != null) {
                        float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("ratio");
                        this.f12872rl = fOptDouble;
                        return fOptDouble;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.f12872rl = 0.0f;
        return 0.0f;
    }

    public final boolean euf() {
        jqy jqyVar = this.f12854jg;
        return jqyVar != null && jqyVar.ouw > 0;
    }

    public final float ex() {
        if (this.baa <= 0.0f) {
            this.baa = 100.0f;
        }
        return (this.baa * 1000.0f) / 1000.0f;
    }

    public final JSONObject fak() {
        if (this.enl == null) {
            try {
                if (!TextUtils.isEmpty(this.yhj)) {
                    this.enl = PangleVideoBridge.jsonObjectInit(this.yhj);
                }
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.qbp.lh("MaterialMeta", e10.getMessage());
            }
        }
        return this.enl;
    }

    public final void fkw(String str) {
        if (TextUtils.isEmpty(str)) {
            this.pno = com.bytedance.sdk.openadsdk.tc.ouw.lh.f13343lh;
        } else {
            this.pno = str;
        }
    }

    public final boolean fvf() {
        return this.f12871rh == 1;
    }

    public final int fwd() {
        return this.eap;
    }

    @Nullable
    public final String hun() {
        le leVar = this.wp;
        if (leVar == null || TextUtils.isEmpty(leVar.ouw)) {
            return null;
        }
        return leVar.ouw;
    }

    public final int jqy() {
        if (this.f12849fg != 2) {
            this.f12849fg = 1;
        }
        return this.f12849fg;
    }

    public final long ko() {
        ra raVar = this.qjg;
        if (raVar == null) {
            return 0L;
        }
        return raVar.f12803lh;
    }

    public final boolean lso() {
        AdSlot adSlot = this.yiz;
        return adSlot != null && adSlot.getDurationSlotType() == 8 && pd();
    }

    public final void lvd() {
        if (!TextUtils.isEmpty(this.ehk)) {
            this.ehk = "0";
        }
        Map<String, Object> map = this.npr;
        if (map == null || !map.containsKey("price")) {
            return;
        }
        map.put("price", "0");
    }

    public final boolean mq() {
        tc tcVar = this.ccd;
        if (tcVar == null) {
            return false;
        }
        if (!(tcVar.vt == 1)) {
            return false;
        }
        jqy jqyVar = this.f12854jg;
        return jqyVar == null || jqyVar.ouw <= 0;
    }

    public final boolean mt() {
        return this.f12859le;
    }

    public final int mwh() {
        ra raVar = this.qjg;
        if (raVar == null) {
            return 2;
        }
        return raVar.ouw;
    }

    public final int myk() {
        int i10 = this.wt;
        if (i10 >= 0) {
            return i10;
        }
        com.bytedance.sdk.openadsdk.core.zih.yu();
        return com.bytedance.sdk.openadsdk.core.settings.cf.jg(String.valueOf(fqk()));
    }

    public final int ng() {
        int i10 = this.eap;
        if (i10 >= 0) {
            return i10;
        }
        com.bytedance.sdk.openadsdk.core.zih.yu();
        return com.bytedance.sdk.openadsdk.core.settings.cf.ra(String.valueOf(fqk()));
    }

    public final int njr() {
        int i10 = this.f12858ko;
        if (i10 >= 0) {
            return i10;
        }
        return ey() ? 30 : 5;
    }

    public final int od() {
        int i10 = this.eot;
        if (i10 >= 0) {
            return i10;
        }
        return 30;
    }

    public final boolean pd() {
        return this.cy == 2;
    }

    public final boolean pno() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject = this.jvj;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("tag_ids")) != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                if (jSONArrayOptJSONArray.optInt(i10) == 174) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void pv() {
        this.f12867od.yu();
        this.vr = false;
    }

    public final int qbp() {
        mwh mwhVar = this.xwt;
        if (mwhVar == null) {
            return 0;
        }
        return mwhVar.ouw;
    }

    public final int rn() {
        int i10 = this.fvf;
        if (i10 == 5 || i10 == 6 || i10 == 33) {
            return 1;
        }
        if (lso()) {
            return 2;
        }
        return this.zvq;
    }

    public final boolean ryl() {
        if (this.lna <= 0) {
            this.lna = uoy();
        }
        int i10 = this.lna;
        return (i10 == 7 || i10 == 8) && !fkw(this) && this.bs != 21 && this.wud == 1;
    }

    @Nullable
    public final yu sd() {
        yu yuVarVt;
        fkw fkwVar = this.ryl;
        if (fkwVar != null) {
            yuVarVt = fkwVar.vt();
        } else {
            com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar = this.cu;
            yuVarVt = ouwVar != null ? ouwVar.ouw : null;
        }
        if (yuVarVt != null) {
            yuVarVt.ouw(this);
        }
        return yuVarVt;
    }

    public final boolean tc() {
        boolean z10;
        if (this.f12877tc.isEmpty()) {
            return false;
        }
        if (this.ucs == 4 && this.f12877tc.size() < 3) {
            return false;
        }
        Iterator<zih> it = this.f12877tc.iterator();
        do {
            z10 = true;
            if (!it.hasNext()) {
                return true;
            }
            zih next = it.next();
            if (TextUtils.isEmpty(next.ouw) || next.vt <= 0 || next.f12895lh <= 0) {
                z10 = false;
            }
        } while (z10);
        return false;
    }

    public final boolean th() {
        ouw ouwVar = this.f12886xn;
        if (ouwVar != null) {
            return !TextUtils.isEmpty(ouwVar.tlj);
        }
        int i10 = this.kfa;
        return i10 == 9 || i10 == 10;
    }

    public final String tlj() {
        JSONObject jSONObjectFak;
        if (this.f12860li == null && (jSONObjectFak = fak()) != null) {
            this.f12860li = jSONObjectFak.optString("cid", "");
        }
        return this.f12860li;
    }

    public final boolean ucs() {
        vm vmVar;
        AdSlot adSlot = this.yiz;
        if (adSlot == null || (vmVar = this.f12863mb) == null) {
            return false;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
            int i10 = vmVar.pno;
            return i10 == 1 || i10 == 3;
        }
        int i11 = vmVar.pno;
        return i11 == 3 || i11 == 2;
    }

    public final int uoy() {
        if (this.lna < 0) {
            JSONObject jSONObjectFak = fak();
            if (jSONObjectFak != null) {
                this.lna = jSONObjectFak.optInt("ad_slot_type", 0);
            } else {
                this.lna = 0;
            }
        }
        return this.lna;
    }

    public final String ux() {
        JSONObject jSONObjectFak;
        String strOptString = this.rsx;
        if (TextUtils.isEmpty(strOptString) && (jSONObjectFak = fak()) != null) {
            strOptString = jSONObjectFak.optString("req_id", "");
            this.rsx = strOptString;
        }
        return strOptString == null ? "" : strOptString;
    }

    public final int vh() {
        return this.bly;
    }

    public final boolean vm() {
        return this.lvd == 100 || this.fvf == 20;
    }

    public final String vpp() {
        if (!TextUtils.isEmpty(this.ux)) {
            return this.ux;
        }
        Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
        int i10 = this.f12868pd;
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                return contextOuw != null ? com.bytedance.sdk.component.utils.vpp.ouw(contextOuw, "tt_video_download_apk") : this.ux;
            }
            if (i10 != 8) {
                return this.ux;
            }
        }
        return contextOuw != null ? com.bytedance.sdk.component.utils.vpp.ouw(contextOuw, "tt_video_mobile_go_detail") : this.ux;
    }

    public final boolean wp() {
        return this.vt;
    }

    public final int xdk() {
        return this.f12870ra;
    }

    public final int yhj() {
        Map<String, Object> map = this.npr;
        if (map == null) {
            return 0;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null) {
                return Integer.parseInt(obj.toString());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final long yib() {
        return this.tlj;
    }

    public final boolean zin() {
        return this.uy == 1;
    }

    public final String zvq() {
        return this.pno;
    }

    public vpp() {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.model.ouw();
        this.f12885vm = ouwVar;
        ouwVar.ouw(this);
    }

    public final boolean ey() {
        if (uoy() == 7) {
            return true;
        }
        return false;
    }

    public final int fqk() {
        JSONObject jSONObjectFak = fak();
        if (jSONObjectFak == null) {
            return 0;
        }
        return jSONObjectFak.optInt("rit", 0);
    }

    public final int jg() {
        if (ra()) {
            return 5;
        }
        if (pd()) {
            return 4;
        }
        return 1;
    }

    public final boolean jvy() {
        if (uoy() == 1) {
            return true;
        }
        return false;
    }

    public final boolean ksc() {
        if (cd() || this.f12864ng != 1) {
            return false;
        }
        return true;
    }

    public final void lh(int i10) {
        if (i10 < 0 || i10 > 30) {
            i10 = 6;
        }
        this.f12870ra = i10;
    }

    public final boolean osn() {
        if (uoy() != 3 && uoy() != 4) {
            return false;
        }
        return true;
    }

    public final boolean rrs() {
        if (uoy() == 8) {
            return true;
        }
        return false;
    }

    public final boolean ub() {
        jg jgVar;
        if (!cd() || cj() || (jgVar = this.kbx) == null || jgVar.ouw != 1) {
            return false;
        }
        return true;
    }

    public final boolean uq() {
        if (!cd() && this.ryl == null) {
            return false;
        }
        return true;
    }

    public final void yu(int i10) {
        this.wt = i10;
    }

    public final int zih() {
        if (cd()) {
            return 5;
        }
        if (ex() == 100.0f && rn() != 2) {
            return this.qld;
        }
        return 0;
    }

    public static boolean le(vpp vppVar) {
        if (vppVar == null) {
            return false;
        }
        int i10 = vppVar.ucs;
        return i10 == 5 || i10 == 15 || i10 == 50;
    }

    public static boolean ra(vpp vppVar) {
        Object obj;
        if (vppVar == null) {
            return false;
        }
        try {
            Map<String, Object> map = vppVar.npr;
            return (map == null || (obj = map.get(TTAdConstant.SDK_BIDDING_TYPE)) == null || 2 != Integer.parseInt(obj.toString())) ? false : true;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.fkw("MaterialMeta", th2.getMessage());
            return false;
        }
    }

    public final boolean lh() {
        tc tcVar;
        int i10 = this.fvf;
        if (this.tpk && od.lh(this) && i10 != 43 && i10 != 44) {
            return false;
        }
        if (!this.tpk && le(i10) && (tcVar = this.ccd) != null && tcVar.f12805lh == 1) {
            return false;
        }
        boolean z10 = (i10 == 33 || i10 == 5 || i10 == 6 || i10 == 19 || i10 == 12) ? false : true;
        if (cd() || rn() == 2 || !z10 || !com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu.ouw(uoy.lh(this.lna))) {
            return rn() == 2 && z10;
        }
        return true;
    }

    public final void vt(int i10) {
        this.bly = i10;
    }

    public final String yu() {
        ex exVar;
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = this.f12885vm;
        if (ouwVar == null || (exVar = ouwVar.f12793le) == null) {
            return null;
        }
        return exVar.pno;
    }

    public final void fkw(int i10) {
        this.eap = i10;
    }

    public final boolean le() {
        return (TextUtils.isEmpty(this.uz) || TextUtils.isEmpty(this.f12855jo)) ? false : true;
    }

    public final void vt(boolean z10) {
        this.f12859le = z10;
    }

    public static boolean fkw(vpp vppVar) {
        if (vppVar == null) {
            return false;
        }
        int i10 = vppVar.ucs;
        return vppVar.cd() || i10 == 5 || i10 == 15 || i10 == 50;
    }

    public final String vt() {
        int i10 = this.lna;
        if (i10 == 1) {
            return "banner_ad";
        }
        if (i10 == 3) {
            return "open_ad";
        }
        if (i10 == 5) {
            return "embeded_ad";
        }
        if (i10 != 7) {
            return i10 != 8 ? "unknown" : "fullscreen_interstitial_ad";
        }
        return "rewarded_video";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
    
        if (r1 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String vt(android.content.Context r3, com.bytedance.sdk.openadsdk.core.model.vpp r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L2d
            if (r4 != 0) goto L6
            goto L2d
        L6:
            int r1 = r4.f12868pd     // Catch: java.lang.Throwable -> L23
            r2 = 8
            if (r1 == r2) goto L17
            com.bytedance.sdk.openadsdk.core.model.pno r4 = r4.our     // Catch: java.lang.Throwable -> L23
            int r4 = r4.f12799le     // Catch: java.lang.Throwable -> L23
            r1 = 1
            if (r4 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 == 0) goto L2d
        L17:
            java.lang.String r3 = com.bytedance.sdk.openadsdk.core.ouw.ouw.ouw(r3)     // Catch: java.lang.Throwable -> L23
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L23
            if (r4 != 0) goto L22
            return r3
        L22:
            return r0
        L23:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "MaterialMeta"
            com.bytedance.sdk.component.utils.qbp.lh(r4, r3)
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.model.vpp.vt(android.content.Context, com.bytedance.sdk.openadsdk.core.model.vpp):java.lang.String");
    }

    public static boolean yu(vpp vppVar) {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        return (vppVar == null || (vtVar = vppVar.f12874sd) == null || vtVar.f10454cf != 1) ? false : true;
    }

    public final boolean ra() {
        List<Integer> list;
        ouw ouwVar = this.f12886xn;
        return (ouwVar == null || (list = ouwVar.pno) == null || !list.contains(57)) ? false : true;
    }

    public static long ouw(String str) {
        JSONObject jSONObjectLe = le(str);
        if (jSONObjectLe != null) {
            return jSONObjectLe.optLong("uid", 0L);
        }
        return 0L;
    }

    public static double ouw(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public static boolean lh(vpp vppVar) {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        return (vppVar == null || (vtVar = vppVar.f12874sd) == null || vtVar.ryl != 7 || od.vt(vppVar)) ? false : true;
    }

    public static String ouw(Context context, vpp vppVar) {
        if (context == null || vppVar == null || !((vppVar.uoy() == 8 || vppVar.uoy() == 7) && vppVar.vm())) {
            return null;
        }
        String strVt = vt(context, vppVar);
        if (TextUtils.isEmpty(strVt) || com.bytedance.sdk.openadsdk.core.ouw.ouw.ouw() != 1) {
            return null;
        }
        return strVt;
    }

    public static void vt(vpp vppVar, JSONObject jSONObject) throws JSONException {
        le leVar = vppVar.wp;
        if (leVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_name", leVar.vt);
            jSONObject2.put("package_name", leVar.f12779lh);
            jSONObject2.put(DownloadModel.DOWNLOAD_URL, leVar.ouw);
            jSONObject2.put(GAMConfig.KEY_SCORE, leVar.fkw);
            jSONObject2.put("comment_num", leVar.f12778le);
            jSONObject2.put(CampaignEx.JSON_KEY_APP_SIZE, leVar.f12780ra);
            jSONObject2.put("app_category", leVar.yu);
            jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject2);
        }
    }

    public final void ouw(int i10) {
        this.zih = i10;
    }

    public final void ouw(int i10, int i11) {
        this.bs = i10;
        this.fvf = i10;
        if (this.yiz == null) {
            this.fvf = 0;
            return;
        }
        if (i11 <= 0) {
            i11 = uoy();
        }
        if (this.yiz.getDurationSlotType() != 3 && i11 != 3) {
            if (this.yiz.getDurationSlotType() != 7 && this.yiz.getDurationSlotType() != 8 && i11 != 7 && i11 != 8) {
                if (!this.tpk && od.vt(this)) {
                    this.fvf = 4;
                    return;
                }
                if (this.bs == 4 && !od.vt(this)) {
                    this.fvf = 0;
                }
                int i12 = this.bs;
                if (i12 == 41) {
                    this.fvf = 41;
                    return;
                }
                if (i10 >= 5) {
                    this.fvf = 0;
                    return;
                }
                if (i12 == 2 && this.f12868pd != 3) {
                    this.fvf = 0;
                    return;
                } else {
                    if (i10 == 0 || (i10 == 1 && this.f12868pd != 3)) {
                        this.fvf = 0;
                        return;
                    }
                    return;
                }
            }
            if (!this.tpk) {
                if (od.lh(this)) {
                    this.fvf = 12;
                    return;
                } else if (od.vt(this)) {
                    this.fvf = 9;
                    return;
                }
            }
            if (this.bs == 5 && !th.yu(this)) {
                this.fvf = 7;
            }
            if (this.bs == 6 && !th.vt(this)) {
                this.fvf = 7;
            }
            int i13 = this.bs;
            if (i13 == 8 && this.lvd != 100) {
                this.fvf = 7;
            }
            if (i13 == 19 && TextUtils.isEmpty(this.osn)) {
                this.fvf = 7;
            }
            if (this.bs == 20 && TextUtils.isEmpty(this.osn)) {
                this.fvf = 7;
            }
            if (this.bs == 38 && !th.lh(this)) {
                this.fvf = 7;
            }
            if (i10 < 5) {
                this.fvf = 7;
                return;
            }
            return;
        }
        this.fvf = 14;
    }

    public final void ouw(zih zihVar) {
        int i10 = ex;
        try {
            if (!TextUtils.isEmpty(zihVar.ouw)) {
                int i11 = zihVar.vt;
                if (i11 == 0 && zihVar.f12895lh == 0) {
                    zihVar.vt = i10;
                    zihVar.f12895lh = i10;
                } else if (i11 == 0) {
                    int i12 = zihVar.f12895lh;
                    if (i12 > i10) {
                        zihVar.f12895lh = i10;
                        zihVar.vt = i10;
                    } else {
                        zihVar.vt = i12;
                    }
                } else {
                    int i13 = zihVar.f12895lh;
                    if (i13 == 0) {
                        if (i11 > i10) {
                            zihVar.f12895lh = i10;
                            zihVar.vt = i10;
                        } else {
                            zihVar.f12895lh = i11;
                        }
                    } else if (i11 > i13) {
                        if (i11 > i10) {
                            zihVar.f12895lh = (int) (i10 / (i11 / i13));
                            zihVar.vt = i10;
                        }
                    } else if (i13 > i10) {
                        zihVar.vt = (int) (i10 * (i11 / i13));
                        zihVar.f12895lh = i10;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String strRa = ra(zihVar.ouw);
        if (!TextUtils.isEmpty(strRa)) {
            zihVar.f12894le = strRa;
        }
        this.fak = zihVar;
    }

    public final JSONObject ouw(boolean z10) {
        JSONObject jSONObjectOuw;
        JSONObject jSONObjectFkw;
        JSONObject jSONObject = new JSONObject();
        if (z10) {
            try {
                jSONObject.put("raw_response_info", this.f12843bo);
            } catch (Exception unused) {
            }
        }
        jSONObject.put("interaction_type", this.f12868pd);
        jSONObject.put("iv_skip_time", this.wt);
        jSONObject.put("rv_skip_time", this.eap);
        jSONObject.put(yu, this.f12848ej);
        jSONObject.put("interaction_method", this.bs);
        jSONObject.put("lp_click_type", this.bly);
        jSONObject.put("lp_click_interval", this.tlj);
        jSONObject.put("proportion_watching", this.myk);
        jSONObject.put(f12840lh, this.uy);
        jSONObject.put(fkw, this.jcd);
        jSONObject.put("target_url", this.osn);
        jSONObject.put("app_log_url", this.yib);
        jSONObject.put("settings_url", this.mwh);
        jSONObject.put("gecko_id", this.f12856ki);
        jSONObject.put("extension", this.hsa);
        jSONObject.put(CreativeInfo.f44321c, this.pv);
        jSONObject.put("source", this.f12883vh);
        jSONObject.put("app_name", this.f12880ub);
        jSONObject.put("screenshot", this.odc);
        jSONObject.put("dislike_control", this.f12864ng);
        jSONObject.put("play_bar_show_time", this.mwe);
        jSONObject.put("play_bar_style", zih());
        jSONObject.put("if_block_lp", this.eay);
        jSONObject.put("cache_sort", this.f12850fn);
        jSONObject.put("if_sp_cache", this.byv);
        jSONObject.put("render_control", rn());
        jSONObject.put("mrc_report", this.f12871rh);
        jSONObject.put("isMrcReportFinish", this.vrp);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cta", this.lai);
        jSONObject2.put("other", this.ajl);
        jSONObject.put("set_click_type", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(CampaignEx.JSON_KEY_REWARD_NAME, this.mt);
        jSONObject3.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.xdk);
        jSONObject.put("reward_data", jSONObject3);
        if (!TextUtils.isEmpty(this.uz) && !TextUtils.isEmpty(this.f12855jo)) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("adchoices_icon", this.uz);
            jSONObject4.put("adchoices_url", this.f12855jo);
            jSONObject.put("dsp_adchoices", jSONObject4);
        }
        zih zihVar = this.fak;
        if (zihVar != null && !TextUtils.isEmpty(zihVar.ouw)) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("url", zihVar.ouw);
            jSONObject5.put("height", zihVar.f12895lh);
            jSONObject5.put("width", zihVar.vt);
            jSONObject.put("icon", jSONObject5);
        }
        zih zihVar2 = this.uoy;
        if (zihVar2 != null && !TextUtils.isEmpty(zihVar2.ouw)) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("url", zihVar2.ouw);
            jSONObject6.put("height", zihVar2.f12895lh);
            jSONObject6.put("width", zihVar2.vt);
            jSONObject.put("cover_image", jSONObject6);
        }
        JSONObject jSONObject7 = this.qni;
        if (jSONObject7 != null) {
            jSONObject.put("session_params", jSONObject7);
        }
        JSONObject jSONObject8 = this.smu;
        if (jSONObject8 != null) {
            jSONObject.put("dynamic_configs", jSONObject8);
        }
        tlj tljVar = this.ms;
        if (tljVar != null) {
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("click_upper_content_area", tljVar.ouw);
            jSONObject9.put("click_upper_non_content_area", tljVar.vt);
            jSONObject9.put("click_lower_content_area", tljVar.f12832lh);
            jSONObject9.put("click_lower_non_content_area", tljVar.yu);
            jSONObject9.put("click_button_area", tljVar.fkw);
            jSONObject9.put("click_video_area", tljVar.f12831le);
            jSONObject.put("click_area", jSONObject9);
        }
        pno pnoVar = this.our;
        if (pnoVar != null) {
            jSONObject.put("arbitrage_interceptor_params", pnoVar.vt());
        }
        AdSlot adSlot = this.yiz;
        if (adSlot != null) {
            jSONObject.put("adslot", adSlot.toJsonObj());
        }
        ouw(this, jSONObject);
        List<String> list = this.rrs;
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("show_url", jSONArray);
        }
        List<String> list2 = this.jvy;
        if (list2 != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next());
            }
            jSONObject.put("click_url", jSONArray2);
        }
        List<String> list3 = this.ksc;
        if (list3 != null) {
            JSONArray jSONArray3 = new JSONArray();
            Iterator<String> it3 = list3.iterator();
            while (it3.hasNext()) {
                jSONArray3.put(it3.next());
            }
            jSONObject.put("play_start", jSONArray3);
        }
        jSONObject.put("phone_num", this.ey);
        jSONObject.put("title", this.fqk);
        jSONObject.put(UnifiedMediationParams.KEY_DESCRIPTION, this.hun);
        jSONObject.put("ext", this.yhj);
        jSONObject.put("image_mode", this.ucs);
        jSONObject.put("cover_click_area", this.lvd);
        jSONObject.put("intercept_flag", this.ixm);
        jSONObject.put("button_text", vpp());
        jSONObject.put("ad_logo", this.zrz);
        jSONObject.put("video_adaptation", this.wbf);
        jSONObject.put("feed_video_opentype", this.f12862ln);
        jSONObject.put("orientation", jqy());
        jSONObject.put("aspect_ratio", ex());
        vt(this, jSONObject);
        ryl rylVar = this.f12857kn;
        if (rylVar != null) {
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("deeplink_url", rylVar.ouw);
            jSONObject10.put("fallback_url", rylVar.vt);
            jSONObject10.put("fallback_type", rylVar.f12804lh);
            jSONObject.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, jSONObject10);
        }
        jSONObject.put("is_web_jump_ip", this.zih);
        jae jaeVar = this.oiz;
        if (jaeVar != null && (jSONObjectFkw = jaeVar.fkw()) != null) {
            jSONObject.put("oem", jSONObjectFkw);
        }
        tc tcVar = this.ccd;
        if (tcVar != null && (jSONObjectOuw = tcVar.ouw()) != null) {
            jSONObject.put("multi_ad_scene", jSONObjectOuw);
        }
        List<FilterWord> list4 = this.jae;
        if (list4 != null) {
            JSONArray jSONArray4 = new JSONArray();
            Iterator<FilterWord> it4 = list4.iterator();
            while (it4.hasNext()) {
                JSONObject jSONObjectOuw2 = ouw(it4.next());
                if (jSONObjectOuw2 != null) {
                    jSONArray4.put(jSONObjectOuw2);
                }
            }
            jSONObject.put("filter_words", jSONArray4);
        }
        od odVar = this.nbp;
        try {
            jSONObject.put("is_playable", odVar.f12788lh);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.qbp.lh("PlayableModel", e10.getMessage());
        }
        if (!TextUtils.isEmpty(odVar.f12787le)) {
            JSONObject jSONObject11 = new JSONObject();
            try {
                jSONObject11.put("playable_url", odVar.f12787le);
                jSONObject11.put("playable_orientation", odVar.f12789ra);
                jSONObject11.put("new_style", odVar.vt);
                jSONObject11.put("close_2_app", odVar.ouw);
                jSONObject11.put("playable_webview_timeout", odVar.pno);
                jSONObject11.put("playable_js_timeout", odVar.bly);
                jSONObject11.put("playable_backup_enable", odVar.tlj ? 1 : 0);
                jSONObject11.put("wait_tips_time", odVar.ryl);
                jSONObject11.put("auto_to_next_time", odVar.mwh);
                jSONObject11.put("next_ad_tips_show_time", odVar.f12785jg);
                jSONObject11.put("max_show_time", odVar.f12786ko);
                jSONObject11.put("next_ad_in_xs", odVar.zih);
                jSONObject11.put("play_now_text", odVar.f12791vm);
                jSONObject11.put("next_ad_text", odVar.f12790rn);
                jSONObject11.put("countdown_show_type", odVar.f12784cf);
                jSONObject.put("playable", jSONObject11);
            } catch (Exception e11) {
                com.bytedance.sdk.component.utils.qbp.lh("PlayableModel", e11.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", odVar.yu);
        } catch (JSONException e12) {
            com.bytedance.sdk.component.utils.qbp.lh("PlayableModel", e12.getMessage());
        }
        try {
            jSONObject.put("playable_style", odVar.fkw);
        } catch (JSONException e13) {
            com.bytedance.sdk.component.utils.qbp.lh("PlayableModel", e13.getMessage());
        }
        jSONObject.put("count_down", this.coz);
        jSONObject.put(GAMConfig.KEY_EXPIRATION_TIME_SEC, this.fwd);
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = this.njr;
        if (vtVar != null) {
            jSONObject.put("video", vtVar.lh());
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = this.euf;
        if (vtVar2 != null) {
            jSONObject.put("h265_video", vtVar2.lh());
        }
        jSONObject.put("video_encode_type", this.f12882vf);
        JSONObject jSONObject12 = new JSONObject();
        jSONObject12.put("if_send_click", qbp());
        jSONObject.put("download_conf", jSONObject12);
        if (this.npr != null) {
            JSONObject jSONObject13 = new JSONObject();
            Set<Map.Entry<String, Object>> setEntrySet = this.npr.entrySet();
            if (!setEntrySet.isEmpty()) {
                for (Map.Entry<String, Object> entry : setEntrySet) {
                    jSONObject13.put(entry.getKey(), entry.getValue());
                }
            }
            jSONObject.put("media_ext", jSONObject13);
        }
        ouw ouwVar = this.f12886xn;
        if (ouwVar != null) {
            JSONObject jSONObject14 = new JSONObject();
            jSONObject14.put("id", ouwVar.ouw);
            jSONObject14.put("md5", ouwVar.vt);
            jSONObject14.put("url", ouwVar.f12891lh);
            jSONObject14.put("data", ouwVar.yu);
            jSONObject14.put("diff_data", ouwVar.fkw);
            jSONObject14.put("version", ouwVar.f12890le);
            jSONObject14.put("dynamic_creative", ouwVar.f12892ra);
            jSONObject14.put("engine_version", ouwVar.tlj);
            jSONObject14.put("ugen_data", ouwVar.f12889jg);
            jSONObject14.put("ugen_md5", ouwVar.mwh);
            jSONObject14.put("ugen_url", ouwVar.ryl);
            jSONObject.put("tpl_info", jSONObject14);
        }
        pd pdVar = this.lht;
        if (pdVar != null) {
            jSONObject.put("tpl_info_v3", pdVar.ouw());
        }
        jSONObject.put("dynamic_creative", this.jvj);
        jSONObject.put("creative_extra", this.zjp);
        jSONObject.put("market_url", this.lgp);
        jSONObject.put("auction_price", this.ehk);
        jSONObject.put("ad_info", this.f12865nn);
        jSONObject.put("is_package_open", this.zjq);
        jSONObject.put("playable_duration_time", od());
        jSONObject.put("playable_endcard_close_time", this.mu);
        jSONObject.put("endcard_close_time", this.xne);
        JSONObject jSONObject15 = new JSONObject();
        jSONObject15.put("render_sequence", this.kfa);
        jSONObject15.put("backup_render_control", this.yw);
        jSONObject15.put("reserve_time", this.f12881uj);
        jSONObject15.put("render_thread", this.f12861lk);
        jSONObject.put("render", jSONObject15);
        if (this.kq == null) {
            qbp qbpVar = new qbp();
            this.kq = qbpVar;
            qbpVar.fkw = "";
            qbpVar.ouw(10L);
            this.kq.vt(20L);
            this.kq.lh(10L);
            this.kq.yu(20L);
        }
        JSONObject jSONObject16 = new JSONObject();
        jSONObject16.put("onlylp_loading_maxtime", this.kq.ouw);
        jSONObject16.put("straight_lp_showtime", this.kq.vt);
        jSONObject16.put("onlyagg_loading_maxtime", this.kq.f12802lh);
        jSONObject16.put("straight_agg_showtime", this.kq.yu);
        jSONObject16.put("loading_text", this.kq.fkw);
        vm vmVar = this.f12863mb;
        if (vmVar != null) {
            jSONObject16 = vmVar.ouw(jSONObject16);
        }
        com.bytedance.sdk.component.utils.ko.ouw("MaterialMeta", "interaction_method_params is:", jSONObject16);
        jSONObject.put("interaction_method_params", jSONObject16);
        JSONObject jSONObject17 = new JSONObject();
        jSONObject17.put("splash_clickarea", mwh());
        jSONObject17.put("splash_layout_id", jg());
        jSONObject17.put("load_wait_time", ko());
        ra raVar = this.qjg;
        jSONObject17.put("skip_time", raVar != null ? raVar.yu : 0);
        jSONObject.put("splash_control", jSONObject17);
        if (pd()) {
            jSONObject.put("dsp_html", this.swm);
        }
        if (cd()) {
            com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar2 = this.cu;
            JSONObject jSONObject18 = new JSONObject();
            com.bytedance.sdk.openadsdk.core.ryl.yu yuVar = ouwVar2.ouw.ouw;
            if (yuVar != null) {
                jSONObject18.put("videoTrackers", yuVar.vt());
            }
            com.bytedance.sdk.openadsdk.core.ryl.vt vtVar3 = ouwVar2.vt;
            if (vtVar3 != null) {
                jSONObject18.put("vastIcon", vtVar3.ouw());
            }
            com.bytedance.sdk.openadsdk.core.ryl.lh lhVar = ouwVar2.f13013lh;
            if (lhVar != null) {
                jSONObject18.put("endCard", lhVar.ouw());
            }
            jSONObject18.put("title", ouwVar2.yu);
            jSONObject18.put(UnifiedMediationParams.KEY_DESCRIPTION, ouwVar2.fkw);
            jSONObject18.put("clickThroughUrl", ouwVar2.f13012le);
            jSONObject18.put(UnifiedMediationParams.KEY_VIDEO_URL, ouwVar2.f13014ra);
            jSONObject18.put("videDuration", ouwVar2.pno);
            jSONObject18.put("videoWidth", ouwVar2.bly);
            jSONObject18.put("videoHeight", ouwVar2.tlj);
            jSONObject18.put("viewabilityVendor", ouwVar2.vt());
            jSONObject.put("vast_json", jSONObject18);
        }
        jSONObject.put("dsp_material_type", this.cy);
        jSONObject.put("deep_link_appname", this.lso);
        jSONObject.put("landing_page_download_clicktype", this.f12846cj);
        jg jgVar = this.kbx;
        if (jgVar != null) {
            jSONObject.put("dsp_style", jgVar.ouw());
        }
        jSONObject.put("identificationOverlayContent", this.pev);
        if (this.upp != null) {
            JSONObject jSONObject19 = new JSONObject();
            jSONObject19.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.upp.ouw(this.nit));
            jSONObject.put("ugen", jSONObject19);
        }
        jSONObject.put("preload_h5_type", this.gls);
        jSONObject.put("hasReportShow", this.bu);
        jSONObject.put("endcard_creative", this.znd);
        jSONObject.put("image_stay", this.wud);
        jSONObject.put("ad_label", this.f12852hk.ouw());
        JSONObject jSONObject20 = new JSONObject();
        jSONObject20.put(a.f29888j, this.f12859le);
        jSONObject20.put("wait_time", this.f12870ra);
        jSONObject20.put("label", this.pno);
        jSONObject.put("ev", jSONObject20);
        jSONObject.put("ad_label", this.f12852hk.ouw());
        if (this.bfk != null) {
            JSONObject jSONObject21 = new JSONObject();
            jSONObject21.put("width", this.bfk.getWidth());
            jSONObject21.put("height", this.bfk.getHeight());
            jSONObject.put("banner", jSONObject21);
        }
        if (!TextUtils.isEmpty(this.f12869qg)) {
            jSONObject.put("gdid_encrypted", this.f12869qg);
        }
        fkw fkwVar = this.ryl;
        if (fkwVar != null) {
            jSONObject.put("ad_tracks", fkwVar.ouw());
        }
        jqy jqyVar = this.f12854jg;
        if (jqyVar != null) {
            jSONObject.put("popup", jqyVar.ouw());
        }
        jSONObject.put("playable_close_time", this.f12858ko);
        return jSONObject;
    }

    private JSONObject ouw(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(ouw(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final void ouw(long j10) {
        this.tlj = j10;
    }

    public final int ouw() {
        ra raVar = this.qjg;
        if (raVar != null) {
            return raVar.yu;
        }
        return -1;
    }

    public static boolean ouw(vpp vppVar) {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        return (vppVar == null || (vtVar = vppVar.f12874sd) == null || vtVar.ryl != 1) ? false : true;
    }

    public static com.bytedance.sdk.openadsdk.core.mwh.ouw.vt ouw(String str, vpp vppVar) {
        vppVar.f12875sm = 0;
        int iUoy = vppVar.uoy();
        int i10 = 3;
        if (iUoy == 3) {
            i10 = 4;
        } else if (iUoy == 7) {
            i10 = 1;
        } else if (iUoy == 8) {
            i10 = 2;
        }
        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVar = new com.bytedance.sdk.openadsdk.core.mwh.ouw.vt(str, vppVar.njr, vppVar.euf, vppVar.f12875sm, vppVar.f12882vf, i10);
        vtVar.vpp = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("video_error_conf", 0);
        vtVar.fkw = com.bykv.vk.openvk.ouw.ouw.vt.ouw.vt(vtVar.pno());
        return vtVar;
    }

    public static void ouw(vpp vppVar, JSONObject jSONObject) throws JSONException {
        List<zih> list = vppVar.f12877tc;
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (zih zihVar : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", zihVar.ouw);
                jSONObject2.put("height", zihVar.f12895lh);
                jSONObject2.put("width", zihVar.vt);
                jSONObject2.put("image_preview", zihVar.fkw);
                jSONObject2.put("image_key", zihVar.f12894le);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("image", jSONArray);
        }
    }
}
