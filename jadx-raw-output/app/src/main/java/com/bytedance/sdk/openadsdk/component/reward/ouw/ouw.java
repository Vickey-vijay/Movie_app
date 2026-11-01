package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ouw {

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.reward.top.lh f12370an;
    public int bly;
    public final rn bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public final tlj f12371cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final AtomicBoolean f12372cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    public boolean f12373cj;
    public com.bytedance.sdk.openadsdk.component.reward.vt.vt coz;
    public boolean euf;

    @NonNull
    public final ko ex;
    public final com.bytedance.sdk.openadsdk.component.reward.view.ryl ey;
    public final mwh fak;
    public final String fkw;
    public final com.bytedance.sdk.openadsdk.core.mwh.yu.vt fqk;
    public com.bytedance.sdk.openadsdk.mwh.bly fvf;
    public boolean fwd;

    /* JADX INFO: renamed from: gh, reason: collision with root package name */
    @Nullable
    public com.bytedance.sdk.openadsdk.activity.pno f12374gh;
    public final Context hun;
    public final com.bytedance.sdk.openadsdk.component.reward.view.tlj jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public final AtomicBoolean f12375jg;
    public final AtomicBoolean jqy;

    @NonNull
    public final Activity jvy;
    public long kfa;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    public boolean f12376kn;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public final AtomicBoolean f12377ko;
    public final pno ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final int f12378le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final boolean f12379lh;
    public final boolean lso;
    public boolean lvd;
    public boolean mq;
    public boolean mt;
    public final AtomicBoolean mwh;
    public long myk;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.common.jg f12380ng;
    public boolean njr;
    public boolean npr;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public final cf f12381od;
    public boolean odc;
    public final fkw osn;
    public final int ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public final lh f12382pd;
    public int pno;
    public boolean pv;
    public final AtomicBoolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final boolean f12383ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public final AtomicBoolean f12384rn;
    public final com.bytedance.sdk.openadsdk.component.reward.view.bly rrs;
    public final AtomicBoolean ryl;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.utils.jg f12385sd;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public final yu f12386tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public final AtomicBoolean f12387th;
    public final AtomicBoolean tlj;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    public String f12388ub;
    public int ucs;

    @NonNull
    public final ryl uoy;
    public final le uq;
    public final jae ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    public float f12389vh;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    public boolean f12390vi;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public final AtomicBoolean f12391vm;
    public final AtomicBoolean vpp;
    public vpp vt;
    public int wp;
    public boolean xdk;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    public boolean f12392xn;
    public com.bytedance.sdk.openadsdk.component.reward.tlj ycd;
    public int yhj;
    public int yib;
    public final boolean yu;
    public long yw;
    public final AtomicBoolean zih;
    public final AtomicBoolean zin;
    public final boolean zjp;
    public boolean zvq;

    public ouw(@NonNull Activity activity, jae jaeVar, @NonNull vpp vppVar, com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, int i10, boolean z10) {
        this(activity, jaeVar, vppVar, vtVar, i10, z10, null);
    }

    public final void ouw(boolean z10) {
        this.xdk = z10;
        this.uoy.yu(z10);
    }

    public ouw(@NonNull Activity activity, jae jaeVar, @NonNull vpp vppVar, com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, int i10, boolean z10, @Nullable ouw ouwVar) {
        this.pno = 0;
        this.bly = 0;
        this.tlj = new AtomicBoolean(false);
        this.f12372cf = new AtomicBoolean(false);
        this.ryl = new AtomicBoolean(false);
        this.mwh = new AtomicBoolean(false);
        this.f12375jg = new AtomicBoolean(false);
        this.f12377ko = new AtomicBoolean(false);
        this.f12384rn = new AtomicBoolean(false);
        this.zih = new AtomicBoolean(false);
        this.f12391vm = new AtomicBoolean(false);
        this.f12387th = new AtomicBoolean(false);
        this.qbp = new AtomicBoolean(false);
        this.zin = new AtomicBoolean(false);
        this.vpp = new AtomicBoolean(false);
        this.jqy = new AtomicBoolean(false);
        this.pv = false;
        this.ucs = 1;
        this.myk = 0L;
        this.f12374gh = null;
        this.odc = true;
        this.npr = false;
        this.f12392xn = false;
        this.jvy = activity;
        this.fqk = vtVar;
        Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
        this.hun = contextOuw;
        this.vt = vppVar;
        this.ouw = i10;
        this.f12390vi = ouwVar != null;
        this.lvd = i10 == 0 || i10 == 1;
        this.lso = i10 == 0 || i10 == 2;
        this.ux = jaeVar;
        this.zjp = z10;
        boolean z11 = vppVar.yiz.getDurationSlotType() == 7;
        this.yu = z11;
        this.fkw = z11 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.fwd = vppVar.lh();
        this.f12383ra = th.mwh(vppVar);
        int iFqk = vppVar.fqk();
        this.f12378le = iFqk;
        com.bytedance.sdk.openadsdk.core.zih.yu();
        this.f12373cj = com.bytedance.sdk.openadsdk.core.settings.cf.ryl(String.valueOf(iFqk));
        com.bytedance.sdk.openadsdk.core.settings.cf.vt();
        this.f12379lh = com.bytedance.sdk.openadsdk.core.settings.cf.tlj(String.valueOf(iFqk));
        this.f12381od = new cf(this);
        this.ey = i10 == 2 ? new com.bytedance.sdk.openadsdk.component.reward.view.mwh(this) : vppVar.lh() ? new com.bytedance.sdk.openadsdk.component.reward.view.ryl(this) : new com.bytedance.sdk.openadsdk.component.reward.view.cf(this);
        this.rrs = new com.bytedance.sdk.openadsdk.component.reward.view.bly(this);
        this.ex = new ko(this);
        this.f12386tc = new yu(this);
        this.ksc = new pno(this, vppVar);
        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = ouwVar != null ? ouwVar.jae : new com.bytedance.sdk.openadsdk.component.reward.view.tlj(this);
        this.jae = tljVar;
        tljVar.f12474ra = this;
        this.bs = new rn(this);
        this.fak = new mwh(this);
        this.uoy = new ryl(this);
        this.osn = new fkw(this);
        this.f12371cd = new tlj(this);
        le leVar = ouwVar != null ? ouwVar.uq : new le(this);
        this.uq = leVar;
        leVar.ouw = this;
        this.f12382pd = new lh(this);
        this.fvf = new com.bytedance.sdk.openadsdk.mwh.bly(contextOuw);
        this.f12385sd = com.bytedance.sdk.openadsdk.utils.bly.ouw(activity, new com.bytedance.sdk.openadsdk.utils.bly.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.ouw.1
            @Override // com.bytedance.sdk.openadsdk.utils.bly.ouw
            public final View ouw() {
                com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = ouw.this.ey;
                if (rylVar != null) {
                    return rylVar.tlj();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.bly.ouw
            public final void vt() {
                ryl rylVar = ouw.this.uoy;
                if (rylVar != null) {
                    rylVar.yu();
                }
            }
        });
    }

    public final Map<String, Object> lh() {
        vpp vppVar;
        HashMap map = new HashMap();
        if (this.jae != null && (vppVar = this.vt) != null && vppVar.rn() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.jae.fkw()));
            JSONObject jSONObjectOuw = this.jae.ouw((JSONObject) null);
            if (jSONObjectOuw != null) {
                Iterator<String> itKeys = jSONObjectOuw.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectOuw.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    public final boolean vt() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        return !this.euf || (pnoVar = this.f12374gh) == null || !(pnoVar instanceof com.bytedance.sdk.openadsdk.activity.fkw) || ((com.bytedance.sdk.openadsdk.activity.fkw) pnoVar).ouw;
    }

    public final long ouw() {
        return this.yw + (SystemClock.elapsedRealtime() - this.kfa);
    }
}
