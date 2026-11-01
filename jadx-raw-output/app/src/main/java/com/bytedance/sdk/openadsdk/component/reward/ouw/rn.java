package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.webkit.WebView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.od;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class rn implements com.bytedance.sdk.openadsdk.mwh.pno {
    public String bly;
    public boolean bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public boolean f12399cd;
    public long ey;
    public boolean fak;
    public int fkw;
    public String hun;
    public long jqy;
    public int jvy;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.common.fkw f12403kn;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public com.bytedance.sdk.component.bly.le f12405le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final boolean f12406lh;
    public boolean mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.common.jg f12407od;
    public final String ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.widget.ouw.fkw f12408pd;
    public boolean pv;
    public View qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public bs f12409ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.yu.yu.fkw f12410rn;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public View f12412th;
    public com.bytedance.sdk.openadsdk.yu.mwh tlj;
    public boolean uoy;
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw uq;
    public ILoader ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    public boolean f12414vh;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public boolean f12415vm;
    public float vpp;
    public int vt;
    public com.bytedance.sdk.openadsdk.core.widget.ouw.le.ouw wp;
    private boolean xdk;
    public boolean yib;
    public int yu;
    public float zin;
    public boolean pno = true;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f12400cf = false;
    public final AtomicBoolean ryl = new AtomicBoolean(true);

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f12402jg = 0;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public String f12404ko = "";
    public boolean zih = false;
    public SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> ex = new SparseArray<>();

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public boolean f12411tc = true;
    public float ksc = -1.0f;
    public float jae = -1.0f;
    private boolean mt = false;
    public long fvf = 0;
    public long osn = -1;
    public volatile int rrs = 0;
    public int fqk = -1;
    public volatile int lso = 0;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    public volatile int f12413ub = 0;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    public long f12401cj = 0;
    public boolean ucs = false;
    public int yhj = -1;

    public static class lh implements com.bytedance.sdk.openadsdk.mwh.tlj {
        private final com.bytedance.sdk.component.bly.le ouw;

        public /* synthetic */ lh(com.bytedance.sdk.component.bly.le leVar, byte b10) {
            this(leVar);
        }

        private lh(com.bytedance.sdk.component.bly.le leVar) {
            this.ouw = leVar;
        }

        @Override // com.bytedance.sdk.openadsdk.mwh.tlj
        public final void ouw() {
            com.bytedance.sdk.component.bly.le leVar = this.ouw;
            if (leVar == null) {
                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "webView has destroy when onPauseWebView");
            } else {
                leVar.pno();
                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "js make webView onPause OK");
            }
        }

        @Override // com.bytedance.sdk.openadsdk.mwh.tlj
        public final void vt() {
            com.bytedance.sdk.component.bly.le leVar = this.ouw;
            if (leVar == null) {
                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "webView has destroy when onPauseWebViewTimers");
            } else {
                try {
                    leVar.ouw.pauseTimers();
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "js make webView pauseTimers OK");
            }
        }
    }

    public static class ouw extends com.bytedance.sdk.openadsdk.core.lh.ouw implements com.bytedance.sdk.openadsdk.core.lh.vt.ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final View.OnClickListener f12417lh;
        private final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;
        private final View vt;

        @Override // com.bytedance.sdk.openadsdk.core.lh.ouw, com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
        public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> sparseArray, boolean z10) {
            if (!this.ouw.vt.cj()) {
                super.ouw(view, f10, f11, f12, f13, sparseArray, z10);
                this.ouw.fqk.osn();
            } else {
                this.f12417lh.onClick(view);
                this.vt.setOnTouchListener(null);
                this.vt.setOnClickListener(this.f12417lh);
            }
        }

        public ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar, View view, View.OnClickListener onClickListener) {
            super(ouwVar.jvy, ouwVar.vt, ouwVar.fkw, ouwVar.yu ? 7 : 5);
            this.ouw = ouwVar;
            this.vt = view;
            this.f12417lh = onClickListener;
            HashMap map = new HashMap();
            map.put("close_auto_click", Boolean.TRUE);
            map.put("click_scence", 2);
            ouw(map);
            ouw(ouwVar.f12386tc.f12423lh);
            ouw(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
        public final void ouw(View view, int i10) {
            this.vt.setOnTouchListener(null);
            this.vt.setOnClickListener(this.f12417lh);
        }
    }

    public static class vt implements com.bytedance.sdk.openadsdk.mwh.ouw {
        private final View ouw;

        @Override // com.bytedance.sdk.openadsdk.mwh.ouw
        public final int ouw() {
            View view = this.ouw;
            int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
            com.bytedance.sdk.component.utils.ko.lh("TTAndroidObject", "mWebView height is ".concat(String.valueOf(measuredHeight)));
            return measuredHeight <= 0 ? osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw()) : measuredHeight;
        }

        @Override // com.bytedance.sdk.openadsdk.mwh.ouw
        public final int vt() {
            View view = this.ouw;
            int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
            com.bytedance.sdk.component.utils.ko.lh("TTAndroidObject", "mWebView width is ".concat(String.valueOf(measuredWidth)));
            return measuredWidth <= 0 ? osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw()) : measuredWidth;
        }

        public vt(View view) {
            this.ouw = view;
        }
    }

    public interface yu {
        void ouw();

        void ouw(WebView webView, int i10);
    }

    public final void fkw() {
        com.bytedance.sdk.component.bly.le leVar = this.f12405le;
        if (leVar != null) {
            od.ouw(leVar);
        }
        vpp vppVar = this.uq.vt;
        long j10 = this.ey;
        if (j10 > 0) {
            if (this.osn > 0) {
                this.ey = j10 + (SystemClock.elapsedRealtime() - this.osn);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", vpp.lh(vppVar) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(this.uq.vt, this.ouw, "second_endcard_duration", jSONObject, this.ey);
        }
        this.f12405le = null;
        if (this.f12410rn != null && !th.yu(vppVar) && !th.ra(vppVar) && !vpp.lh(vppVar)) {
            this.f12410rn.ryl();
            this.f12410rn.mwh();
        }
        bs bsVar = this.f12409ra;
        if (bsVar != null) {
            bsVar.lh();
        }
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.tlj;
        if (mwhVar != null) {
            mwhVar.ouw(vppVar.vm());
        }
        DeviceUtils.AudioInfoReceiver.vt(this);
    }

    public final void lh() {
        this.f12409ra.ouw("showPlayableEndCardOverlay", (JSONObject) null);
        this.uq.ux.sendEmptyMessageDelayed(600, 1000L);
        this.uq.ux.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.10
            @Override // java.lang.Runnable
            public final void run() {
                rn.ouw(rn.this);
            }
        }, 1000L);
        com.bytedance.sdk.openadsdk.utils.jg jgVar = this.uq.f12385sd;
        if (jgVar != null) {
            jgVar.ouw(0L);
        }
    }

    public final void ouw(int i10, com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "onHideLoadingLayout: errorCode = " + i10 + ",hasInvoke =" + this.uq.jqy.get());
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.uq;
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f12374gh;
        if (pnoVar == null || !pnoVar.ryl || ouwVar.jqy.get()) {
            return;
        }
        this.uq.jqy.set(true);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.uq;
        if (ouwVar2.euf && th.ryl(ouwVar2.vt) && vtVar != null) {
            vtVar.le();
        }
    }

    public final void vt() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.uq;
        vpp vppVar = ouwVar.vt;
        if (TextUtils.isEmpty(vpp.ouw(ouwVar.hun, vppVar))) {
            if (vppVar != null && !vppVar.hai && this.ux == null && ra()) {
                this.hun = vppVar.f12856ki;
                com.bytedance.sdk.openadsdk.ra.vt.ouw();
                this.ux = com.bytedance.sdk.openadsdk.ra.vt.vt();
                com.bytedance.sdk.openadsdk.ra.vt.ouw();
                int iOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(this.ux, this.hun);
                this.jvy = iOuw;
                this.fqk = iOuw > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.hun)) {
                    com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.tlj;
                    if (mwhVar != null) {
                        mwhVar.fak = this.fqk;
                    }
                    com.bytedance.sdk.openadsdk.yu.lh.ouw.ouw(this.f12401cj, vppVar, "landingpage_endcard", this.ux, this.hun);
                }
            }
            if ((!TextUtils.isEmpty(this.bly) && this.bly.contains("play.google.com/store")) || ((vppVar != null && !vppVar.tpk && th.pno(vppVar)) || th.ra(vppVar))) {
                this.zih = true;
                return;
            }
            Log.d("TTAD.RFWVM", "preLoadEndCardForce: return mShouldPreloadEndCard " + this.pno + ",webViewIsLoading " + this.f12414vh);
            if (this.pno) {
                boolean z10 = this.uq.mq;
                if (this.f12405le == null || ((!z10 && TextUtils.isEmpty(this.bly)) || !vpp.vt(vppVar))) {
                    if (vpp.lh(vppVar)) {
                        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "preLoadUgenEndCard: ");
                        this.uq.fak.ouw();
                        return;
                    }
                    return;
                }
                if (this.f12414vh) {
                    return;
                }
                String str = this.bly + "&is_pre_render=1";
                com.bytedance.sdk.openadsdk.yu.mwh mwhVar2 = this.tlj;
                if (mwhVar2 != null) {
                    mwhVar2.ouw();
                }
                zin.ouw(this.f12405le, str);
                this.f12414vh = true;
            }
        }
    }

    public final void yu() {
        String str;
        String str2;
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        vpp vppVar = this.uq.vt;
        String strYu = vppVar.yu();
        if (!TextUtils.isEmpty(strYu) && (pnoVar = this.uq.f12374gh) != null && (pnoVar.fqk() || (this.uq.f12374gh.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu))) {
            this.bly = strYu;
        } else if (com.bytedance.sdk.openadsdk.core.model.od.fkw(vppVar)) {
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar.f12874sd;
            if (vtVar != null) {
                this.bly = vtVar.pno;
            }
        } else {
            this.bly = com.bytedance.sdk.openadsdk.core.model.od.cf(vppVar);
        }
        String strOuw = this.bly;
        int i10 = this.vt;
        int i11 = this.fkw;
        int i12 = this.yu;
        float fEx = vppVar.ex();
        if (!TextUtils.isEmpty(strOuw)) {
            if (i10 == 1) {
                if (strOuw.contains("?")) {
                    str2 = strOuw + C3426d4.j.f28584c;
                } else {
                    str2 = strOuw + "?";
                }
                strOuw = str2 + "orientation=portrait";
            }
            if (strOuw.contains("?")) {
                str = strOuw + C3426d4.j.f28584c;
            } else {
                str = strOuw + "?";
            }
            strOuw = str + "height=" + i11 + "&width=" + i12 + "&aspect_ratio=" + fEx;
        }
        if (!com.bytedance.sdk.openadsdk.core.model.od.vt(vppVar)) {
            strOuw = com.bytedance.sdk.openadsdk.utils.le.ouw(strOuw);
        }
        this.bly = strOuw;
        if (TextUtils.isEmpty(strOuw)) {
            return;
        }
        this.xdk = this.bly.contains("use_second_endcard=1");
    }

    public final void bly() {
        ouw(this.f12409ra, true);
    }

    public final boolean cf() {
        if (vpp.lh(this.uq.vt)) {
            return this.xdk && !this.fak && this.uq.fak.yu.get();
        }
        return this.xdk && !this.fak && this.ryl.get() && this.mwh;
    }

    public final void jg() {
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.tlj;
        if (mwhVar != null) {
            mwhVar.vpp = System.currentTimeMillis();
        }
    }

    public final void ko() {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.f12410rn;
        if (fkwVar != null) {
            fkwVar.lh();
            this.f12410rn.yu();
        }
    }

    public final void le() {
        ouw(this.f12409ra);
    }

    public final void mwh() {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.f12410rn;
        if (fkwVar != null) {
            fkwVar.ra();
        }
    }

    public final void pno() {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.f12410rn;
        if (fkwVar != null) {
            fkwVar.bly();
        }
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.tlj;
        if (mwhVar != null) {
            mwhVar.le();
        }
    }

    public final void qbp() {
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.tlj;
        if (mwhVar != null) {
            mwhVar.vt();
        }
    }

    public final boolean ra() {
        String str = this.bly;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public final void rn() {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.f12410rn;
        if (fkwVar != null) {
            fkwVar.tlj();
        }
    }

    public final void ryl() {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.f12410rn;
        if (fkwVar != null) {
            fkwVar.pno();
        }
    }

    public final boolean th() {
        com.bytedance.sdk.component.bly.le leVar = this.f12405le;
        return leVar == null || leVar.getWebView() == null;
    }

    public final void tlj() {
        com.bytedance.sdk.component.bly.le leVar = this.f12405le;
        if (leVar != null) {
            leVar.le();
        }
        if (this.osn == 0) {
            this.osn = SystemClock.elapsedRealtime();
        }
        vpp vppVar = this.uq.vt;
        bs bsVar = this.f12409ra;
        if (bsVar != null) {
            bsVar.vt();
            com.bytedance.sdk.component.bly.le leVar2 = this.f12405le;
            if (leVar2 != null) {
                if (leVar2.getVisibility() == 0) {
                    bs bsVar2 = this.f12409ra;
                    bsVar2.f12592vm = true;
                    ouw(bsVar2, true);
                    ouw(this.f12409ra, false, true);
                    if (com.bytedance.sdk.openadsdk.core.model.od.pno(vppVar) && !this.bs && this.uq.vt.cj()) {
                        lh();
                    }
                } else {
                    bs bsVar3 = this.f12409ra;
                    bsVar3.f12592vm = false;
                    ouw(bsVar3, false);
                    ouw(this.f12409ra, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.tlj;
        if (mwhVar != null) {
            mwhVar.fkw();
        }
    }

    public final boolean vm() {
        return this.mwh && this.ryl.get();
    }

    public final boolean zih() {
        bs bsVar = this.f12409ra;
        if (bsVar == null) {
            return false;
        }
        return bsVar.f12589tc;
    }

    public rn(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.uq = ouwVar;
        this.ouw = ouwVar.fkw;
        this.f12406lh = ouwVar.yu;
    }

    public final void lh(boolean z10) {
        if (this.f12409ra == null || this.uq.jvy.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            this.f12409ra.ouw("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void ouw(String str, final com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        if (this.f12405le == null) {
            return;
        }
        HashMap map = new HashMap();
        final vpp vppVar = this.uq.vt;
        map.put("click_scence", 2);
        this.f12410rn = new com.bytedance.sdk.openadsdk.yu.th(2, this.f12406lh ? "rewarded_video" : "fullscreen_interstitial_ad", this.uq.vt);
        bs bsVar = new bs(this.uq.jvy);
        this.f12409ra = bsVar;
        bsVar.uq = this.uq.fqk;
        String strHun = vppVar.hun();
        bs bsVarOuw = this.f12409ra.vt(this.f12405le).ouw(vppVar);
        bsVarOuw.ryl = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(vppVar);
        bsVarOuw.f12584lh = vppVar.pv;
        bsVarOuw.fkw = vppVar.yhj;
        bsVarOuw.f12583le = vppVar.ey() ? 7 : 5;
        bsVarOuw.mwh = new vt(this.f12405le);
        bsVarOuw.f12587ra = strHun;
        bs bsVarOuw2 = bsVarOuw.ouw(this.f12405le);
        if (ra()) {
            str = "landingpage_endcard";
        }
        bsVarOuw2.ouw = str;
        bs bsVarOuw3 = bsVarOuw2.ouw(map);
        bsVarOuw3.zin = this.f12410rn;
        bsVarOuw3.vt = new com.bytedance.sdk.openadsdk.core.widget.fkw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.fkw
            public final void ouw() {
                com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar = rn.this.f12408pd;
                if (fkwVar != null) {
                    fkwVar.lh();
                }
                com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar2 = vtVar;
                if (vtVar2 != null) {
                    vtVar2.kn();
                }
            }
        };
        bsVarOuw3.fvf = new bs.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.7
            @Override // com.bytedance.sdk.openadsdk.core.bs.ouw
            public final void ouw() {
                rn.ouw(rn.this);
            }
        };
        this.f12409ra.f12588rn = new lh(this.f12405le, (byte) 0);
        bs bsVar2 = this.f12409ra;
        bsVar2.yu = new WeakReference<>(this.uq.ey.tlj());
        bsVar2.f12581jg = pno.vt();
        bsVar2.f12582ko = new com.bytedance.sdk.openadsdk.mwh.lh() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.rn.9
            @Override // com.bytedance.sdk.openadsdk.mwh.lh
            public final void ouw(boolean z10, int i10, String str2) {
                if (z10) {
                    rn rnVar = rn.this;
                    rnVar.ucs = true;
                    if (rnVar.pv) {
                        rnVar.pv = false;
                        rnVar.vt(rnVar.uq.f12373cj);
                    }
                }
                if (vpp.yu(vppVar)) {
                    com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "TimeTrackLog report from js ".concat(String.valueOf(z10)));
                    rn.this.ouw(z10, i10, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.mwh.lh
            public final void ouw() {
                rn rnVar = rn.this;
                rnVar.uoy = true;
                rnVar.uq.ey.tlj().performClick();
            }
        };
        this.f12409ra.f12578cd = this.xdk;
    }

    private void fkw(boolean z10) {
        if (com.bytedance.sdk.openadsdk.core.model.od.vt(this.uq.vt)) {
            return;
        }
        lh(z10);
    }

    public final void yu(boolean z10) {
        this.fak = true;
        JSONObject jSONObject = new JSONObject();
        vpp vppVar = this.uq.vt;
        try {
            jSONObject.put("endcard_overlay_render_type", vpp.lh(vppVar) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, this.ouw, "use_second_endcard", jSONObject);
        this.osn = SystemClock.elapsedRealtime();
        try {
            if (!vpp.lh(vppVar)) {
                this.f12409ra.ouw("click_endcard_close", (JSONObject) null);
            } else if (z10) {
                this.uq.fak.lh();
                com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar, this.ouw, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.uq;
        ouwVar.f12385sd.ouw(ouwVar.pno);
    }

    public final void vt(boolean z10) {
        ouw(this.f12409ra, z10, true);
    }

    @Override // com.bytedance.sdk.openadsdk.mwh.pno
    public final void vt(int i10) {
        int i11 = this.yhj;
        if (i11 <= 0 && i10 > 0) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "onVolumeChanged >>>> become unmuted, notify h5");
            fkw(false);
        } else if (i11 > 0 && i10 == 0) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "onVolumeChanged >>>> become mute notification h5");
            fkw(true);
        }
        this.yhj = i10;
    }

    public final void ouw(boolean z10) {
        this.pno = z10;
    }

    public final void ouw() {
        if (com.bytedance.sdk.openadsdk.core.model.od.fkw(this.uq.vt) && this.uq.odc) {
            return;
        }
        vt();
    }

    public final void ouw(int i10) {
        if (this.mwh || !this.ryl.get()) {
            ouw(0, this.uq.fqk);
        }
        osn.ouw((View) this.f12405le, i10);
        com.bytedance.sdk.component.bly.le leVar = this.f12405le;
        if (leVar != null) {
            osn.ouw((View) leVar.getWebView(), i10);
        }
        vpp vppVar = this.uq.vt;
        if (this.f12405le == null || !vppVar.vm()) {
            return;
        }
        this.f12405le.setLandingPage(true);
        this.f12405le.setTag("landingpage_endcard");
        this.f12405le.setMaterialMeta(vppVar.bs());
    }

    private void ouw(bs bsVar) {
        if (this.f12409ra == null || this.uq.jvy.isFinishing()) {
            return;
        }
        bsVar.f12592vm = true;
    }

    public static void ouw(bs bsVar, boolean z10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z10 ? 1 : 0);
            bsVar.ouw(C3426d4.h.V, jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void ouw(bs bsVar, boolean z10, boolean z11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z10);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z11);
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.uq.f12374gh;
            String str = "end";
            if (pnoVar != null) {
                jSONObject.put("multi_ads_show", pnoVar.hun().tlj.tlj());
                if (!pnoVar.zih) {
                    str = "mid";
                }
                jSONObject.put("endcard_type", str);
            } else {
                jSONObject.put("endcard_type", "end");
            }
            bsVar.ouw("endcard_control_event", jSONObject);
            if (z11) {
                if (this.mwh) {
                    return;
                }
                this.pv = true;
                return;
            }
            this.pv = false;
        } catch (Exception unused) {
        }
    }

    public final void ouw(boolean z10, int i10, String str) {
        com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar = this.f12410rn;
        if (fkwVar == null) {
            return;
        }
        if (z10) {
            fkwVar.vt();
        } else {
            fkwVar.ouw(i10, str);
        }
    }

    public static /* synthetic */ void ouw(rn rnVar) {
        int i10;
        rnVar.bs = true;
        int i11 = 0;
        rnVar.yib = false;
        rnVar.uq.ux.removeMessages(600);
        rnVar.uq.ux.removeMessages(700);
        rnVar.uq.ux.removeMessages(TypedValues.Custom.TYPE_INT);
        rnVar.uq.uoy.yu(false);
        rnVar.uq.f12387th.set(true);
        rnVar.uq.coz.jg();
        vpp vppVar = rnVar.uq.vt;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFWVM", "onOverlayRendFinish: hasClicked=" + vppVar.cj());
        if (vppVar.cj()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.od odVar = vppVar.nbp;
        if (odVar != null && (i10 = odVar.ouw) >= 0 && i10 <= 100) {
            i11 = i10;
        }
        if (uoy.pno(i11)) {
            View viewTlj = rnVar.uq.ey.tlj();
            View.OnClickListener onClickListener = (View.OnClickListener) viewTlj.getTag(viewTlj.getId());
            if (onClickListener != null) {
                ouw ouwVar = new ouw(rnVar.uq, viewTlj, onClickListener);
                viewTlj.setOnClickListener(ouwVar);
                viewTlj.setOnTouchListener(ouwVar);
            }
        }
    }

    public static /* synthetic */ boolean ouw(rn rnVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return rnVar.uq.vt.vm() && str.endsWith(".mp4");
    }
}
