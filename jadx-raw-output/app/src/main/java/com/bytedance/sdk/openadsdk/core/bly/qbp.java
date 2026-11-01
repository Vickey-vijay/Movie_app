package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.fak;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.uoy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.PangleVideoBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class qbp extends com.bytedance.sdk.openadsdk.core.le.lh implements com.bytedance.sdk.component.adexpress.dynamic.yu, com.bytedance.sdk.component.adexpress.vt.ko, com.bytedance.sdk.component.adexpress.vt.pno, ko, com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0125ouw {
    private float bly;
    private String bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public long f12536cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.yu.yu.fkw f12537cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private ThemeStatusBroadcastReceiver f12538cj;
    private float coz;
    private com.bytedance.sdk.openadsdk.core.yu.bly euf;
    public ViewGroup ex;
    private com.bytedance.sdk.openadsdk.core.yu.ra.ouw ey;
    private com.bytedance.sdk.openadsdk.core.cf.lh.vt fak;
    private PAGExpressAdWrapperListener fkw;
    private lh fqk;
    public com.bytedance.sdk.component.adexpress.vt.yu<? extends View> fvf;
    private float fwd;
    private final ViewTreeObserver.OnScrollChangedListener hun;
    public boolean jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public AdSlot f12539jg;
    public HashSet<String> jqy;
    private vpp jvy;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    private List<com.bytedance.sdk.component.adexpress.vt.tlj> f12540kn;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.model.vpp f12541ko;
    public int ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private pno f12542le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.lh.lh f12543lh;
    private final Runnable lso;
    private float lvd;
    private com.bytedance.sdk.component.adexpress.vt.bly mt;
    public String mwh;
    private final SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> myk;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    private float f12544ng;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.yu.ra f12545od;
    private String osn;
    private boolean ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public com.bytedance.sdk.component.adexpress.vt.vt f12546pd;
    private String pno;
    private ex pv;
    public boolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private bly f12547ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public FrameLayout f12548rn;
    private boolean rrs;
    public final Context ryl;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private long f12549sd;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public boolean f12550tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public com.bytedance.sdk.component.adexpress.vt.lh f12551th;
    private float tlj;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    private final Runnable f12552ub;
    private com.bytedance.sdk.component.adexpress.vt.rn ucs;
    private boolean uoy;
    public final AtomicBoolean uq;
    private final Runnable ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.vt.le f12553vh;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public boolean f12554vm;
    public String vpp;
    private int vt;
    private com.bytedance.sdk.component.adexpress.vt.tlj.ouw wp;
    private com.bytedance.sdk.component.adexpress.vt.mwh xdk;
    private com.bytedance.sdk.openadsdk.core.cf.le.yu yhj;
    private com.bytedance.sdk.openadsdk.core.cf.vt.ra yib;
    private TTDislikeDialogAbstract yu;
    public boolean zih;
    public int zin;
    private int zvq;

    public qbp(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, String str) {
        super(context);
        this.ouw = true;
        this.vt = 0;
        this.mwh = "embeded_ad";
        this.pno = null;
        this.f12554vm = false;
        this.qbp = true;
        this.zin = -1;
        this.bs = "";
        this.f12550tc = false;
        this.rrs = true;
        this.ksc = -1;
        this.f12545od = new com.bytedance.sdk.openadsdk.yu.ra();
        this.f12536cd = 0L;
        this.uq = new AtomicBoolean(false);
        this.hun = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                qbp qbpVar = qbp.this;
                if (qbpVar.qbp && qbpVar.tlj()) {
                    qbp.this.zin();
                    qbp qbpVar2 = qbp.this;
                    qbpVar2.removeCallbacks(qbpVar2.ux);
                    qbp qbpVar3 = qbp.this;
                    qbpVar3.postDelayed(qbpVar3.ux, 500L);
                }
            }
        };
        this.ux = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.2
            @Override // java.lang.Runnable
            public final void run() {
                if (!fak.ouw(qbp.this, 0, 5, false)) {
                    qbp.this.fkw(8);
                } else {
                    qbp qbpVar = qbp.this;
                    qbpVar.fkw(qbpVar.getVisibility());
                }
            }
        };
        this.lso = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.3
            @Override // java.lang.Runnable
            public final void run() {
                qbp.this.fkw(0);
            }
        };
        this.f12552ub = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.4
            @Override // java.lang.Runnable
            public final void run() {
                qbp.this.fkw(8);
            }
        };
        this.zvq = 8;
        this.myk = new SparseArray<>();
        this.f12544ng = -1.0f;
        this.fwd = -1.0f;
        this.coz = -1.0f;
        this.lvd = -1.0f;
        this.f12549sd = 0L;
        this.mwh = str;
        this.ryl = context;
        this.f12541ko = vppVar;
        this.f12539jg = adSlot;
        this.f12550tc = false;
        pno();
    }

    public boolean bly() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/qbp;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(g.f44975u, this, motionEvent);
        return safedk_qbp_dispatchTouchEvent_b119640a8dfd335807573089f2af869f(motionEvent);
    }

    public long fkw() {
        return 0L;
    }

    public boolean l_() {
        return false;
    }

    public int le() {
        return 0;
    }

    public void lh() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void onvideoComplate() {
    }

    public void ouw() {
    }

    public void ouw(int i10) {
    }

    public void ouw(int i10, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
    }

    public void ouw(int i10, String str) {
    }

    public void ouw(com.bytedance.sdk.component.adexpress.vt.mwh.ouw ouwVar) {
    }

    public void ouw(String str, JSONObject jSONObject) {
    }

    public void ouw(boolean z10, String str) {
    }

    public boolean ouw(JSONObject jSONObject) {
        return false;
    }

    public void ra() {
    }

    public void ryl() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTimeUpdate(int i10) {
    }

    public boolean tlj() {
        return true;
    }

    public void vt(int i10) {
    }

    public void vt(JSONObject jSONObject) {
    }

    public long yu() {
        return 0L;
    }

    private void th() {
        if (com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu.ouw(this.mwh)) {
            com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu(this.ryl, this.f12541ko, this.f12550tc, (com.bytedance.sdk.openadsdk.core.cf.le.ouw) this.xdk, this, this.bly, this.tlj, this.f12554vm, this.mwh);
            com.bytedance.sdk.openadsdk.core.cf.vt.ra raVar = new com.bytedance.sdk.openadsdk.core.cf.vt.ra(this.ryl, yuVar, this, this.xdk);
            yuVar.ouw((ko) this);
            this.f12540kn.add(raVar);
            return;
        }
        com.bytedance.sdk.component.adexpress.vt.le leVar = new com.bytedance.sdk.component.adexpress.vt.le(this.ryl, this.xdk, new zin(this, this.xdk));
        this.f12553vh = leVar;
        this.f12540kn.add(leVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zin() {
        if (this.uq.get()) {
            this.f12545od.ouw(System.currentTimeMillis(), fak.ouw(this));
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.ko
    public final void a_(int i10) {
        com.bytedance.sdk.component.adexpress.vt.bly blyVar = this.mt;
        if (blyVar != null) {
            if (!this.ouw) {
                blyVar.bly();
            }
            this.mt.tlj();
            ((mwh) this.mt).ryl();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.fkw;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.pno.ouw(i10), i10);
        }
        vpp vppVar = this.jvy;
        if (vppVar != null) {
            vppVar.ouw(this.f12541ko, this.mwh);
        }
    }

    public void cf() {
        com.bytedance.sdk.component.bly.le leVar;
        ex exVar = this.pv;
        if (exVar == null || exVar.lh() == null || (leVar = this.pv.f11492le) == null) {
            return;
        }
        try {
            leVar.getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public final void fkw(int i10) {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar == null || !(yuVar instanceof ex)) {
            return;
        }
        ((ex) yuVar).ouw(i10);
        this.zvq = i10;
    }

    public com.bytedance.sdk.openadsdk.yu.ra getAdShowTime() {
        return this.f12545od;
    }

    public lh getBrandBannerController() {
        return this.fqk;
    }

    public pno getClickCreativeListener() {
        return this.f12542le;
    }

    public bly getClickListener() {
        return this.f12547ra;
    }

    public String getClosedListenerKey() {
        return this.osn;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar != null) {
            return yuVar.vt();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.tlj).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.bly).intValue();
    }

    public bs getJsObject() {
        ex exVar = this.pv;
        if (exVar != null) {
            return exVar.f12507jg;
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        tlj tljVar;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (!(yuVar instanceof ex) || (tljVar = ((ex) yuVar).f12508ko) == null) {
            return 0;
        }
        for (Integer num : tljVar.ouw) {
            if (num.intValue() == 3 || num.intValue() == 2 || num.intValue() == -1) {
                return num.intValue();
            }
        }
        return TextUtils.isEmpty(tljVar.ouw()) ? -1 : 1;
    }

    public String getUgenTemplateErrorReason() {
        return this.bs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0125ouw
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.yu.bly blyVar = this.euf;
        if (blyVar != null) {
            return blyVar.getVideoProgress();
        }
        return 0L;
    }

    public com.bytedance.sdk.component.bly.le getWebView() {
        ex exVar = this.pv;
        if (exVar == null) {
            return null;
        }
        return exVar.f11492le;
    }

    public final void jg() {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar2 = this.fvf;
        if (yuVar2 instanceof ex) {
            if (yuVar2 == null) {
                return;
            }
            ((ex) yuVar2).le();
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f12541ko;
            com.bytedance.sdk.component.utils.bly.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.6
                @Override // java.lang.Runnable
                public final void run() {
                    qbp.this.yu(1);
                }
            }, ((long) (vppVar != null ? vppVar.f12863mb.f12838lh : 5)) * 1000);
        } else if (yuVar2 instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.ra) yuVar2).cf();
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.f12541ko;
        if (vppVar2 != null && (yuVarSd = vppVar2.sd()) != null && (yuVar = yuVarSd.ouw) != null) {
            yuVar.ouw();
        }
        if ((this.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) && com.bytedance.sdk.openadsdk.core.model.rn.ouw(this.f12541ko, false)) {
            com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar3 = this.fvf;
            if (this.fak != null) {
                try {
                    if (yuVar3 instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) {
                        ViewGroup viewGroup = (ViewGroup) ((com.bytedance.sdk.openadsdk.core.cf.le.ra) yuVar3).ra().fkw;
                        this.ex = viewGroup;
                        if (viewGroup != null) {
                            this.fak.ouw();
                            View viewVt = this.fak.vt();
                            if (viewVt != null) {
                                ViewGroup viewGroup2 = (ViewGroup) viewVt.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(viewVt);
                                }
                                this.ex.addView(viewVt, new ViewGroup.LayoutParams(-1, -1));
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void ko() {
        if (this.f12541ko == null) {
            return;
        }
        this.f12536cd = SystemClock.elapsedRealtime();
        if (!this.f12541ko.pd()) {
            this.f12537cf.ouw();
            com.bytedance.sdk.component.adexpress.vt.tlj.ouw ouwVar = this.wp;
            if (ouwVar != null) {
                ouwVar.ouw(this);
            }
            try {
                this.wp.ouw();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        final lh lhVar = this.fqk;
        if (lhVar == null) {
            a_(106);
            return;
        }
        lhVar.vt = this;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = lhVar.yu;
        if (vppVar != null && vppVar.lso()) {
            lhVar.fkw = com.bytedance.sdk.openadsdk.utils.bs.ouw().schedule(new lh.vt(lhVar.ouw.pno), com.bytedance.sdk.openadsdk.core.zih.yu().ko(), TimeUnit.MILLISECONDS);
        }
        lh.ouw ouwVar2 = lhVar.ouw;
        if (ouwVar2 == null) {
            com.bytedance.sdk.component.adexpress.vt.ko koVar = lhVar.vt;
            if (koVar != null) {
                koVar.a_(106);
                return;
            }
            return;
        }
        ouwVar2.ouw(new com.bytedance.sdk.component.adexpress.vt.ra() { // from class: com.bytedance.sdk.openadsdk.core.bly.lh.1
            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(View view, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
                if (lh.this.f12522lh == null || view == null) {
                    if (lh.this.vt != null) {
                        lh.this.vt.a_(106);
                    }
                } else if (lh.this.vt != null) {
                    lh.this.vt.ouw(lh.this.ouw, jgVar);
                }
                lh.this.vt();
            }

            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(int i10, String str) {
                if (lh.this.vt != null) {
                    lh.this.vt.a_(106);
                }
                lh.this.vt();
            }
        });
        View viewLh = lhVar.ouw.lh();
        lhVar.f12522lh.removeView(viewLh);
        if (viewLh.getParent() != null) {
            ((ViewGroup) viewLh.getParent()).removeView(viewLh);
        }
        lhVar.f12522lh.addView(viewLh, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void le(int i10) {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if ((yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) && i10 == 4) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.ra) yuVar).tlj();
        }
    }

    public com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw lh(int i10) {
        return new com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(i10);
    }

    public void mwh() {
        try {
            lh lhVar = this.fqk;
            if (lhVar != null) {
                lhVar.ouw();
            }
            vm();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.vt.tlj> list = this.f12540kn;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.vt.tlj> it = list.iterator();
                while (it.hasNext()) {
                    it.next().ouw();
                }
            }
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.f12541ko);
            com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(this.f12541ko);
            this.f12543lh = null;
            this.yu = null;
            this.f12539jg = null;
            this.f12541ko = null;
            this.fkw = null;
            this.f12542le = null;
            this.f12551th = null;
            this.f12547ra = null;
            com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar = this.fak;
            if (vtVar != null) {
                vtVar.lh();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw("NativeExpressView", "detach error", th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0378 A[Catch: Exception -> 0x03a6, TRY_LEAVE, TryCatch #5 {Exception -> 0x03a6, blocks: (B:102:0x0297, B:104:0x029f, B:106:0x02a6, B:108:0x02ae, B:110:0x02b6, B:112:0x02ba, B:114:0x02c0, B:125:0x02d9, B:127:0x02dd, B:129:0x02e1, B:131:0x0302, B:130:0x02ed, B:132:0x031b, B:133:0x0346, B:134:0x0378), top: B:171:0x0297 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0108  */
    /* JADX WARN: Code duplicated, block: B:48:0x011f  */
    public void pno() {
        long jOptLong;
        boolean z10;
        com.bytedance.sdk.component.adexpress.vt.mwh.ouw ouwVar;
        com.bytedance.sdk.openadsdk.core.cf.le.yu yuVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar2;
        int i10;
        this.jqy = new HashSet<>();
        this.f12538cj = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.f12539jg;
        if (adSlot != null) {
            this.bly = adSlot.getExpressViewAcceptedWidth();
            this.tlj = this.f12539jg.getExpressViewAcceptedHeight();
            com.bytedance.sdk.openadsdk.core.model.vpp.ouw ouwVar2 = this.f12541ko.f12886xn;
            if (TextUtils.equals(this.mwh, "embeded_ad") && ouwVar2 != null) {
                String str = ouwVar2.f12888cf;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
                        int iOptInt = jSONObjectJsonObjectInit.optInt("width");
                        int iOptInt2 = jSONObjectJsonObjectInit.optInt("height");
                        if (iOptInt != 0 && iOptInt2 != 0) {
                            this.tlj = iOptInt2;
                            this.bly = iOptInt;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            this.pno = this.f12539jg.getCodeId();
            if (TextUtils.equals(this.mwh, "fullscreen_interstitial_ad")) {
                this.ksc = this.f12541ko.myk();
            } else if (TextUtils.equals(this.mwh, "rewarded_video")) {
                this.ksc = this.f12541ko.ng();
            } else if (TextUtils.equals(this.mwh, "open_ad")) {
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar3 = this.f12541ko;
                if (vppVar3 == null || vppVar3.ouw() < 0) {
                    com.bytedance.sdk.openadsdk.core.zih.yu();
                    this.ksc = com.bytedance.sdk.openadsdk.core.settings.cf.zih(this.pno);
                } else {
                    this.ksc = this.f12541ko.ouw();
                }
                if (this.ksc < 0) {
                    this.ksc = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.f12541ko.pd()) {
            this.fqk = new lh(this.ryl, this, this.f12541ko, this.mwh);
            return;
        }
        com.bytedance.sdk.openadsdk.yu.th thVar = new com.bytedance.sdk.openadsdk.yu.th(1, this.mwh, this.f12541ko);
        this.f12537cf = thVar;
        this.mt = new mwh(thVar, this.mwh, this.f12541ko, this.pno, this.uoy);
        final boolean zTh = this.f12541ko.th();
        try {
            com.bytedance.sdk.openadsdk.core.model.vpp.ouw ouwVar3 = this.f12541ko.f12886xn;
            if (ouwVar3 != null) {
                String str2 = ouwVar3.f12892ra;
                if (TextUtils.isEmpty(str2)) {
                    jOptLong = 0;
                } else {
                    jOptLong = PangleVideoBridge.jsonObjectInit(str2).optLong("render_delay_time");
                }
            } else {
                jOptLong = 0;
            }
        } catch (Exception unused2) {
        }
        try {
            if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(this.f12541ko)) {
                z10 = false;
            } else {
                com.bytedance.sdk.openadsdk.core.zih.yu();
                if (com.bytedance.sdk.openadsdk.core.settings.cf.bly(this.pno) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            try {
                com.bytedance.sdk.openadsdk.core.settings.cf.vt();
                if (!com.bytedance.sdk.openadsdk.core.settings.cf.tlj(this.pno) || (i10 = (vppVar2 = this.f12541ko).fvf) == 5 || i10 == 6 || vppVar2.lna == 3) {
                    z10 = true;
                }
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
            z10 = false;
        }
        long jMin = Math.min(Math.max(jOptLong, 0L), 10000L);
        int renderTimeout = getRenderTimeout();
        com.bytedance.sdk.component.utils.ko.vt("NativeExpressView", "initRenderRequest: renderTimeout=".concat(String.valueOf(renderTimeout)));
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar4 = this.f12541ko;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar4.f12874sd;
        double d10 = vtVar != null ? ((double) vtVar.f10461th) * vtVar.yu : 0.0d;
        int i11 = this.ksc;
        this.jae = i11 != -1 && i11 < ((int) d10);
        if (com.bytedance.sdk.openadsdk.core.cf.yu.ouw(vppVar4) || com.bytedance.sdk.openadsdk.core.cf.yu.vt(this.f12541ko) || com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu.ouw(this.mwh)) {
            com.bytedance.sdk.openadsdk.core.cf.le.ouw.C0114ouw c0114ouw = new com.bytedance.sdk.openadsdk.core.cf.le.ouw.C0114ouw();
            if (com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.f12541ko)) {
                c0114ouw.osn = com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.f12541ko, this.mwh);
            }
            c0114ouw.ey = (com.bytedance.adsdk.ugeno.core.vm) this.mt;
            c0114ouw.rrs = this.bly;
            c0114ouw.jvy = this.tlj;
            c0114ouw.fqk = this.uoy;
            ouwVar = c0114ouw;
        } else {
            ouwVar = new com.bytedance.sdk.component.adexpress.vt.mwh.ouw();
        }
        ouwVar.uq = zTh;
        ouwVar.f11610lh = this.mwh;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar5 = this.f12541ko;
        ouwVar.f11609le = vppVar5.pv;
        ouwVar.f11613ra = vppVar5.hun();
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar6 = this.f12541ko;
        ouwVar.pno = vppVar6.yhj;
        ouwVar.yu = this.mt;
        ouwVar.f11608ko = vppVar6.f12861lk;
        ouwVar.fkw = renderTimeout;
        ouwVar.bly = vppVar6.ksc();
        ouwVar.fvf = this.rrs;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar7 = this.f12541ko;
        ouwVar.tlj = vppVar7.wbf;
        ouwVar.f11606cf = jMin;
        ouwVar.ryl = vppVar7.f12868pd;
        ouwVar.f11607jg = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.vt(vppVar7);
        ouwVar.f11614rn = z10;
        ouwVar.f11615tc = this.ksc;
        ouwVar.ksc = this.jae;
        ouwVar.ex = d10;
        ouwVar.f11612pd = com.bytedance.sdk.openadsdk.core.settings.cf.vt().tlj();
        ouwVar.uoy = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("inject_data_reuse_open", 0);
        com.bytedance.sdk.openadsdk.core.model.vt vtVar2 = this.f12541ko.f12852hk;
        ouwVar.bs = vtVar2.ouw;
        ouwVar.fak = vtVar2.vt;
        ouwVar.vt = new com.bytedance.sdk.component.adexpress.vt.fkw() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.5
            @Override // com.bytedance.sdk.component.adexpress.vt.fkw
            public final JSONObject ouw() {
                try {
                    qbp qbpVar = qbp.this;
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar8 = qbpVar.f12541ko;
                    if (vppVar8 == null) {
                        qbpVar.bs = "material is null";
                        return null;
                    }
                    if (zTh) {
                        qbpVar.jvy = new vpp();
                        float f10 = qbp.this.bly;
                        float f11 = qbp.this.tlj;
                        qbp qbpVar2 = qbp.this;
                        JSONObject jSONObjectOuw = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(f10, f11, qbpVar2.f12554vm, qbpVar2.f12541ko, qbpVar2.mwh, qbpVar2.jvy);
                        qbp.this.bs = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw();
                        return jSONObjectOuw;
                    }
                    if (!com.bytedance.sdk.openadsdk.core.cf.yu.ouw(vppVar8)) {
                        float f12 = qbp.this.bly;
                        float f13 = qbp.this.tlj;
                        qbp qbpVar3 = qbp.this;
                        JSONObject jSONObjectOuw2 = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(f12, f13, qbpVar3.f12554vm, qbpVar3.f12541ko);
                        qbp.this.vt(jSONObjectOuw2);
                        return jSONObjectOuw2;
                    }
                    qbp.this.jvy = new vpp();
                    qbp qbpVar4 = qbp.this;
                    JSONObject jSONObjectOuw3 = com.bytedance.sdk.openadsdk.core.cf.yu.ouw(qbpVar4.f12541ko, qbpVar4.jvy);
                    qbp.this.bs = com.bytedance.sdk.openadsdk.core.cf.yu.ouw();
                    return jSONObjectOuw3;
                } catch (Throwable unused5) {
                    return null;
                }
            }
        };
        ouw(ouwVar);
        this.xdk = ouwVar.ouw();
        this.f12540kn = new ArrayList();
        if (this.f12541ko.uoy() == 1 && this.f12541ko.cd()) {
            th();
            this.wp = new com.bytedance.sdk.component.adexpress.vt.ryl(this.f12540kn, this.mt);
        } else {
            if (TextUtils.equals(this.mwh, "fullscreen_interstitial_ad") || TextUtils.equals(this.mwh, "rewarded_video") || TextUtils.equals("open_ad", this.mwh) || ex.vt(this.mwh) || TextUtils.equals(this.mwh, "embeded_ad")) {
                this.vt = this.f12541ko.kfa;
                try {
                    qbp();
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar8 = this.f12541ko;
                    if ((vppVar8 == null || vppVar8.uoy() != 1 || this.f12541ko.rn() == 2) && (!com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu.ouw(this.mwh) || (vppVar = this.f12541ko) == null || vppVar.rn() == 2)) {
                        com.bytedance.sdk.openadsdk.core.ra.ouw.ouw ouwVar4 = new com.bytedance.sdk.openadsdk.core.ra.ouw.ouw();
                        int i12 = this.vt;
                        if (i12 == 0) {
                            ex exVar = new ex(this.ryl, this.xdk, this.f12538cj, this.f12537cf, this.f12541ko);
                            this.pv = exVar;
                            com.bytedance.sdk.component.adexpress.vt.rn rnVar = new com.bytedance.sdk.component.adexpress.vt.rn(this.ryl, this.xdk, exVar, this);
                            this.ucs = rnVar;
                            this.f12540kn.add(rnVar);
                        } else if (i12 == 3) {
                            com.bytedance.sdk.component.adexpress.dynamic.fkw.ra raVar = new com.bytedance.sdk.component.adexpress.dynamic.fkw.ra();
                            Context applicationContext = this.ryl.getApplicationContext();
                            com.bytedance.sdk.component.adexpress.vt.mwh mwhVar = this.xdk;
                            ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver = this.f12538cj;
                            com.bytedance.sdk.component.adexpress.vt.vt vtVar3 = new com.bytedance.sdk.component.adexpress.vt.vt(applicationContext, mwhVar, themeStatusBroadcastReceiver, this, new le(this.ryl, themeStatusBroadcastReceiver, this.f12550tc, raVar, mwhVar, ouwVar4));
                            this.f12546pd = vtVar3;
                            this.f12540kn.add(vtVar3);
                        } else if (i12 == 7) {
                            com.bytedance.sdk.openadsdk.core.cf.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.cf.le.yu(this.ryl, this.f12541ko, this.f12550tc, (com.bytedance.sdk.openadsdk.core.cf.le.ouw) this.xdk, this);
                            this.yhj = yuVar2;
                            com.bytedance.sdk.openadsdk.core.cf.vt.ra raVar2 = new com.bytedance.sdk.openadsdk.core.cf.vt.ra(this.ryl, yuVar2, this, this.xdk);
                            this.yib = raVar2;
                            raVar2.ouw(this);
                            this.f12540kn.add(this.yib);
                        } else if (i12 == 9) {
                            ex exVar2 = new ex(this.ryl, this.xdk, this.f12538cj, this.f12537cf, this.f12541ko);
                            this.pv = exVar2;
                            com.bytedance.sdk.component.adexpress.vt.rn rnVar2 = new com.bytedance.sdk.component.adexpress.vt.rn(this.ryl, this.xdk, exVar2, this);
                            this.ucs = rnVar2;
                            this.f12540kn.add(rnVar2);
                        } else if (i12 == 10) {
                            if (!this.uoy || (yuVar = this.yhj) == null) {
                                this.yhj = new com.bytedance.sdk.openadsdk.core.cf.le.ra(this.ryl, this.f12541ko, this.f12550tc, (com.bytedance.sdk.openadsdk.core.cf.le.ouw) this.xdk, this);
                            } else {
                                yuVar.ouw(this.f12541ko, this.f12550tc, (com.bytedance.sdk.openadsdk.core.cf.le.ouw) this.xdk, this);
                            }
                            com.bytedance.sdk.openadsdk.core.cf.vt.ra raVar3 = new com.bytedance.sdk.openadsdk.core.cf.vt.ra(this.ryl, this.yhj, this, this.xdk);
                            this.yib = raVar3;
                            raVar3.ouw(this);
                            this.f12540kn.add(this.yib);
                        }
                    }
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.qbp.ouw("NativeExpressView", "NativeExpressView dynamicRender fail", e10);
                }
                boolean z11 = this.f12541ko.yw == 1;
                this.ouw = z11;
                if (z11) {
                    th();
                }
                com.bytedance.sdk.component.utils.ko.vt("NativeExpressView", "initRender: mRenderSequenceType is " + this.vt + ", mInterceptors is " + this.f12540kn);
                this.wp = new com.bytedance.sdk.component.adexpress.vt.ryl(this.f12540kn, this.mt);
            } else {
                try {
                    qbp();
                    ex exVar3 = new ex(this.ryl, this.xdk, this.f12538cj, this.f12537cf, this.f12541ko);
                    this.pv = exVar3;
                    com.bytedance.sdk.component.adexpress.vt.rn rnVar3 = new com.bytedance.sdk.component.adexpress.vt.rn(this.ryl, this.xdk, exVar3, this);
                    this.ucs = rnVar3;
                    this.f12540kn.add(rnVar3);
                } catch (Exception e11) {
                    com.bytedance.sdk.component.utils.qbp.ouw("NativeExpressView", "NativeExpressView dynamicRender fail", e11);
                }
                th();
                this.wp = new com.bytedance.sdk.component.adexpress.vt.ryl(this.f12540kn, this.mt);
            }
        }
        com.bytedance.sdk.component.adexpress.vt.rn rnVar4 = this.ucs;
        if (rnVar4 != null) {
            this.pv = (ex) rnVar4.ouw;
        }
        bs jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.ex = this.mwh;
        }
    }

    public final void rn() {
        try {
            FrameLayout frameLayout = this.f12548rn;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.f12548rn);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.ouw("NativeExpressView", "backupDestroy remove video container error", th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    public boolean safedk_qbp_dispatchTouchEvent_b119640a8dfd335807573089f2af869f(MotionEvent p10) {
        int i10;
        SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> sparseArray;
        pno pnoVar = this.f12542le;
        int i11 = 0;
        if (pnoVar != null) {
            pnoVar.vt(p10.getDeviceId());
            this.f12542le.ouw(p10.getSource());
            this.f12542le.lh(p10.getToolType(0));
        }
        bly blyVar = this.f12547ra;
        if (blyVar != null) {
            blyVar.vt(p10.getDeviceId());
            this.f12547ra.ouw(p10.getSource());
            this.f12547ra.lh(p10.getToolType(0));
        }
        int actionMasked = p10.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i10 = 3;
            } else if (actionMasked != 2) {
                i11 = actionMasked != 3 ? -1 : 4;
            } else {
                this.coz += Math.abs(p10.getX() - this.f12544ng);
                this.lvd += Math.abs(p10.getY() - this.fwd);
                this.f12544ng = p10.getX();
                this.fwd = p10.getY();
                i10 = (System.currentTimeMillis() - this.f12549sd <= 200 || (this.coz <= 8.0f && this.lvd <= 8.0f)) ? 2 : 1;
            }
            sparseArray = this.myk;
            if (sparseArray != null) {
                sparseArray.put(p10.getActionMasked(), new com.bytedance.sdk.openadsdk.core.lh.lh.ouw(i10, p10.getSize(), p10.getPressure(), System.currentTimeMillis()));
            }
            return super.dispatchTouchEvent(p10);
        }
        this.f12544ng = p10.getRawX();
        this.fwd = p10.getRawY();
        this.f12549sd = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.tlj.lh.ouw(p10);
        i10 = i11;
        sparseArray = this.myk;
        if (sparseArray != null) {
            sparseArray.put(p10.getActionMasked(), new com.bytedance.sdk.openadsdk.core.lh.lh.ouw(i10, p10.getSize(), p10.getPressure(), System.currentTimeMillis()));
        }
        return super.dispatchTouchEvent(p10);
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.vt.lh lhVar) {
        this.f12551th = lhVar;
        com.bytedance.sdk.component.adexpress.vt.le leVar = this.f12553vh;
        if (leVar != null) {
            leVar.ouw.ouw(lhVar);
        }
    }

    public void setBannerClickClosedListener(com.bytedance.sdk.openadsdk.core.yu.ra.ouw ouwVar) {
        this.ey = ouwVar;
    }

    public void setClickCreativeListener(pno pnoVar) {
        this.f12542le = pnoVar;
        if (pnoVar != null) {
            pnoVar.ouw((com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0125ouw) this);
        }
    }

    public void setClickListener(bly blyVar) {
        this.f12547ra = blyVar;
    }

    public void setClosedListenerKey(String str) {
        lh.ouw ouwVar;
        this.osn = str;
        lh lhVar = this.fqk;
        if (lhVar == null || (ouwVar = lhVar.ouw) == null) {
            return;
        }
        ouwVar.f12528lh = str;
    }

    public void setDislike(com.bytedance.sdk.openadsdk.lh.lh lhVar) {
        lh.ouw ouwVar;
        ouw ouwVar2;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar != null && (yuVar instanceof zin) && (ouwVar2 = (ouw) yuVar.lh()) != null) {
            ouwVar2.setDislikeInner(lhVar);
        }
        lh lhVar2 = this.fqk;
        if (lhVar2 != null && (ouwVar = lhVar2.ouw) != null && (lhVar instanceof com.bytedance.sdk.openadsdk.lh.lh)) {
            ouwVar.ouw = lhVar;
        }
        this.f12543lh = lhVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        lh.ouw ouwVar;
        this.fkw = pAGExpressAdWrapperListener;
        lh lhVar = this.fqk;
        if (lhVar == null || (ouwVar = lhVar.ouw) == null) {
            return;
        }
        ouwVar.bly = pAGExpressAdWrapperListener;
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.fkw fkwVar) {
        if (this.pv != null && getJsObject() != null) {
            getJsObject().vt = fkwVar;
        }
        com.bytedance.sdk.openadsdk.core.cf.le.yu yuVar = this.yhj;
        if (yuVar != null) {
            yuVar.ouw(fkwVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        lh.ouw ouwVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        ouw ouwVar2;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar != null && (yuVar instanceof zin) && (ouwVar2 = (ouw) yuVar.lh()) != null) {
            ouwVar2.setDislikeOuter(tTDislikeDialogAbstract);
        }
        lh lhVar = this.fqk;
        if (lhVar != null && (ouwVar = lhVar.ouw) != null) {
            if (tTDislikeDialogAbstract != null && (vppVar = ouwVar.fkw) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(vppVar.yhj, vppVar.jae);
            }
            ouwVar.vt = tTDislikeDialogAbstract;
        }
        this.yu = tTDislikeDialogAbstract;
    }

    public void setSoundMute(boolean z10) {
        this.f12550tc = z10;
        com.bytedance.sdk.component.adexpress.vt.vt vtVar = this.f12546pd;
        if (vtVar != null && vtVar.vt() != null) {
            this.f12546pd.vt().setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).setSoundMute(z10);
        }
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.yu.bly blyVar) {
        this.euf = blyVar;
    }

    public void setVideoBusiness(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        bs bsVar;
        ex exVar = this.pv;
        if (exVar == null || (bsVar = exVar.f12507jg) == null) {
            return;
        }
        bsVar.uq = vtVar;
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.mwh.ra raVar) {
        if (this.pv == null || getJsObject() == null) {
            return;
        }
        getJsObject().jae = raVar;
    }

    public final void vm() {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f12541ko;
        if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.yu(getVideoProgress());
    }

    public final void vt(int i10, String str) {
        bs bsVar;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar == null || !(yuVar instanceof ex) || (bsVar = ((ex) yuVar).f12507jg) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i10);
            jSONObject.put("flag", str);
            bsVar.ouw("onVideoPaused", jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final void yu(int i10) {
        if (com.bytedance.sdk.openadsdk.core.model.th.lh(this.f12541ko)) {
            com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
            if (yuVar instanceof ex) {
                ex exVar = (ex) yuVar;
                com.bytedance.sdk.component.utils.ko.vt("TTAD.WebViewRender", "notifyWillZoom() method called");
                if (exVar.f12507jg != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("zoom_type", i10);
                        exVar.f12507jg.ouw("expressAdViewWillZoom", jSONObject);
                    } catch (JSONException e10) {
                        com.bytedance.sdk.component.utils.qbp.lh("TTAD.WebViewRender", e10.getMessage());
                    }
                }
            }
        }
    }

    public final boolean zih() {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        return yuVar != null && (yuVar instanceof zin);
    }

    private static void qbp() {
        if (!com.bytedance.sdk.openadsdk.core.jg.fkw()) {
            ryl.ouw();
        }
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.zih.yu().ko();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zin();
        List<com.bytedance.sdk.component.adexpress.vt.tlj> list = this.f12540kn;
        if (list != null) {
            Iterator<com.bytedance.sdk.component.adexpress.vt.tlj> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        com.bytedance.sdk.component.utils.ko.fkw("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.hun);
        com.bytedance.sdk.openadsdk.core.bly.ouw().ouw(this.osn, this.ey);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.hun);
        com.bytedance.sdk.openadsdk.core.bly.ouw().yu(this.osn);
        List<com.bytedance.sdk.component.adexpress.vt.tlj> list = this.f12540kn;
        if (list != null) {
            Iterator<com.bytedance.sdk.component.adexpress.vt.tlj> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        com.bytedance.sdk.component.utils.ko.fkw("webviewpool", "onDetachedFromWindow===");
        ouw(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.bytedance.sdk.component.utils.ko.fkw("webviewpool", "onFinishTemporaryDetach+++");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        zin();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.bytedance.sdk.component.utils.ko.fkw("webviewpool", "onStartTemporaryDetach===");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        int visibility;
        super.onWindowFocusChanged(z10);
        if (Build.VERSION.SDK_INT < 28) {
            if (z10) {
                visibility = getVisibility();
            } else {
                visibility = 8;
            }
            onWindowVisibilityChanged(visibility);
        }
        zin();
        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(this.f12541ko, z10);
        if (z10) {
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.f12541ko, 4);
        } else {
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.f12541ko, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        ouw(i10, true, false);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        bs bsVar;
        com.bytedance.sdk.openadsdk.mwh.vt vtVar;
        int i12;
        int iMin;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2;
        try {
            int i13 = Integer.parseInt(String.valueOf(charSequence));
            if (!TextUtils.equals(this.mwh, "banner_ad")) {
                int i14 = this.ksc;
                if ((i10 >= i14 && i14 >= 0 && (this.jae || TextUtils.equals(this.mwh, "open_ad"))) || ((i13 == 0 && TextUtils.equals(this.mwh, "open_ad")) || le() == 5)) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                int i15 = this.ksc;
                if (i10 <= i15) {
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f12541ko;
                    if (vppVar != null && (vtVar2 = vppVar.f12874sd) != null) {
                        iMin = (int) (Math.min(i15, vtVar2.yu * ((double) vtVar2.f10461th)) - ((double) i10));
                    } else {
                        iMin = i15 - i10;
                    }
                } else {
                    iMin = 0;
                }
                com.bytedance.sdk.component.adexpress.vt.vt vtVar3 = this.f12546pd;
                if (vtVar3 != null && vtVar3.vt() != null) {
                    this.f12546pd.vt().setTime(String.valueOf(i13), i12, iMin, false);
                }
                com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
                if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
                    ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).setTime(String.valueOf(i13), i12, iMin, false);
                }
            }
            com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar4 = this.fak;
            if (vtVar4 != null) {
                com.bytedance.sdk.openadsdk.core.cf.lh.lh lhVar = vtVar4.ouw;
                if ((lhVar instanceof com.bytedance.sdk.openadsdk.core.cf.lh.yu) && (bsVar = ((com.bytedance.sdk.openadsdk.core.cf.lh.yu) lhVar).ouw) != null && (vtVar = bsVar.jqy) != null) {
                    vtVar.ouw(i13);
                }
            }
        } catch (NumberFormatException unused) {
        }
    }

    public final void ouw(int i10, boolean z10, boolean z11) {
        this.qbp = z10;
        removeCallbacks(this.f12552ub);
        removeCallbacks(this.lso);
        if (i10 == 0) {
            if (z11) {
                this.lso.run();
                return;
            } else {
                postDelayed(this.lso, 50L);
                return;
            }
        }
        if (z11) {
            this.f12552ub.run();
        } else {
            postDelayed(this.f12552ub, 50L);
        }
    }

    public void ouw(View view, int i10, com.bytedance.sdk.component.adexpress.lh lhVar) {
        View view2;
        JSONObject jSONObject;
        com.bytedance.sdk.component.utils.qbp.ouw("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i10));
        if (i10 == -1 || lhVar == null) {
            return;
        }
        HashMap map = new HashMap();
        if (od.lh(this.f12541ko)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.ko koVar = (com.bytedance.sdk.openadsdk.core.model.ko) lhVar;
        if (com.bytedance.sdk.openadsdk.core.model.th.lh(this.f12541ko)) {
            try {
                JSONObject jSONObject2 = koVar.mwh;
                if (jSONObject2 != null) {
                    int iOptInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", iOptInt);
                    map.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.yu(th2.toString(), new Object[0]);
            }
        }
        pno pnoVar = this.f12542le;
        if (pnoVar != null) {
            pnoVar.yu(getDynamicShowType());
            this.f12542le.ouw(map);
        }
        bly blyVar = this.f12547ra;
        if (blyVar != null) {
            blyVar.yu(getDynamicShowType());
            this.f12547ra.ouw(map);
        }
        float f10 = koVar.ouw;
        float f11 = koVar.vt;
        float f12 = koVar.f12766lh;
        float f13 = koVar.yu;
        boolean z10 = koVar.f12762cf;
        SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> sparseArray = koVar.tlj;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.myk;
        }
        SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> sparseArray2 = sparseArray;
        String str = koVar.f12767ra;
        JSONObject jSONObjectOuw = null;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectOuw = view != this ? ouw(view) : null;
            view2 = view;
        }
        koVar.pno = i10;
        if (jSONObjectOuw != null && koVar.bly == null) {
            koVar.bly = jSONObjectOuw;
        }
        if (i10 != 13) {
            switch (i10) {
                case 1:
                    FrameLayout frameLayout = this.f12548rn;
                    if (frameLayout != null) {
                        frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f12541ko;
                    if (vppVar == null || vppVar.ajl != 1 || z10) {
                        bly blyVar2 = this.f12547ra;
                        if (blyVar2 != null) {
                            blyVar2.bly = koVar;
                            blyVar2.ex = str;
                            blyVar2.ouw(view2, f10, f11, f12, f13, sparseArray2, z10);
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.fkw;
                        if (pAGExpressAdWrapperListener != null && !koVar.f12763jg) {
                            pAGExpressAdWrapperListener.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 2:
                    if (koVar.ryl > 0) {
                        uoy.ouw(true);
                    }
                    pno pnoVar2 = this.f12542le;
                    if (pnoVar2 != null) {
                        pnoVar2.bly = koVar;
                        pnoVar2.ex = str;
                        if (com.bytedance.sdk.openadsdk.core.model.th.lh(this.f12541ko) && (jSONObject = koVar.mwh) != null) {
                            ((com.bytedance.sdk.openadsdk.core.lh.ouw) this.f12542le).f12719ra = jSONObject.optBoolean("is_ceiling_page", false);
                        }
                        this.f12542le.ouw(view2, f10, f11, f12, f13, sparseArray2, z10);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.fkw;
                    if (pAGExpressAdWrapperListener2 != null && !koVar.f12763jg) {
                        pAGExpressAdWrapperListener2.onAdClicked();
                    }
                    uoy.ouw(false);
                    com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.f12541ko, 9);
                    break;
                case 3:
                    TTDislikeDialogAbstract tTDislikeDialogAbstract = this.yu;
                    if (tTDislikeDialogAbstract != null) {
                        tTDislikeDialogAbstract.show();
                    } else {
                        com.bytedance.sdk.openadsdk.lh.lh lhVar2 = this.f12543lh;
                        if (lhVar2 != null) {
                            lhVar2.ouw();
                        } else {
                            TTDelegateActivity.ouw(this.f12541ko, this.osn);
                        }
                    }
                    break;
                case 4:
                    FrameLayout frameLayout2 = this.f12548rn;
                    if (frameLayout2 != null) {
                        frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.f12541ko;
                    if (vppVar2 == null || vppVar2.ajl != 1 || z10) {
                        StringBuilder sb2 = new StringBuilder("Creativity....mAdType=");
                        sb2.append(this.mwh);
                        sb2.append(",!mVideoPause=");
                        sb2.append(!this.zih);
                        sb2.append("，isAutoPlay=");
                        sb2.append(com.bytedance.sdk.openadsdk.utils.uoy.lh(this.f12541ko));
                        com.bytedance.sdk.component.utils.ko.vt("ClickCreativeListener", sb2.toString());
                        if ("embeded_ad".equals(this.mwh) && com.bytedance.sdk.openadsdk.core.model.vpp.fkw(this.f12541ko) && !this.zih && com.bytedance.sdk.openadsdk.utils.uoy.lh(this.f12541ko)) {
                            com.bytedance.sdk.component.utils.ko.vt("ClickCreativeListener", "Creative....");
                            pno pnoVar3 = this.f12542le;
                            if (pnoVar3 != null) {
                                pnoVar3.bly = koVar;
                                pnoVar3.ex = str;
                                pnoVar3.ouw(view2, f10, f11, f12, f13, sparseArray2, z10);
                            }
                        } else {
                            com.bytedance.sdk.component.utils.ko.vt("ClickCreativeListener", "normal....");
                            bly blyVar3 = this.f12547ra;
                            if (blyVar3 != null) {
                                blyVar3.bly = koVar;
                                blyVar3.ex = str;
                                blyVar3.ouw(view2, f10, f11, f12, f13, sparseArray2, z10);
                            }
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.fkw;
                        if (pAGExpressAdWrapperListener3 != null && !koVar.f12763jg) {
                            pAGExpressAdWrapperListener3.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 5:
                    ouw(!this.f12550tc, "dynamicClick");
                    break;
                case 6:
                    ouw();
                    break;
                case 7:
                    TTWebsiteActivity.ouw(this.ryl, this.f12541ko, this.mwh);
                    break;
            }
            return;
        }
        int i11 = koVar.f12764ko;
        if (i11 >= 0) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("switch", i11);
                ouw(jSONObject4);
            } catch (Throwable unused) {
            }
        }
    }

    public qbp(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, String str, boolean z10, boolean z11) {
        super(context);
        this.ouw = true;
        this.vt = 0;
        this.mwh = "embeded_ad";
        this.pno = null;
        this.f12554vm = false;
        this.qbp = true;
        this.zin = -1;
        this.bs = "";
        this.f12550tc = false;
        this.rrs = true;
        this.ksc = -1;
        this.f12545od = new com.bytedance.sdk.openadsdk.yu.ra();
        this.f12536cd = 0L;
        this.uq = new AtomicBoolean(false);
        this.hun = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                qbp qbpVar = qbp.this;
                if (qbpVar.qbp && qbpVar.tlj()) {
                    qbp.this.zin();
                    qbp qbpVar2 = qbp.this;
                    qbpVar2.removeCallbacks(qbpVar2.ux);
                    qbp qbpVar3 = qbp.this;
                    qbpVar3.postDelayed(qbpVar3.ux, 500L);
                }
            }
        };
        this.ux = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.2
            @Override // java.lang.Runnable
            public final void run() {
                if (!fak.ouw(qbp.this, 0, 5, false)) {
                    qbp.this.fkw(8);
                } else {
                    qbp qbpVar = qbp.this;
                    qbpVar.fkw(qbpVar.getVisibility());
                }
            }
        };
        this.lso = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.3
            @Override // java.lang.Runnable
            public final void run() {
                qbp.this.fkw(0);
            }
        };
        this.f12552ub = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.4
            @Override // java.lang.Runnable
            public final void run() {
                qbp.this.fkw(8);
            }
        };
        this.zvq = 8;
        this.myk = new SparseArray<>();
        this.f12544ng = -1.0f;
        this.fwd = -1.0f;
        this.coz = -1.0f;
        this.lvd = -1.0f;
        this.f12549sd = 0L;
        this.mwh = str;
        this.ryl = context;
        this.f12541ko = vppVar;
        this.f12539jg = adSlot;
        this.f12550tc = z10;
        this.rrs = z11;
        pno();
    }

    public static JSONObject ouw(View view) {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void ouw(com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        this.uq.set(true);
        this.fvf = yuVar;
        com.bytedance.sdk.component.utils.ko.ouw("NativeExpressView", "render type is  ", Integer.valueOf(yuVar.vt()));
        if (this.zvq != getWindowVisibility() && bly()) {
            fkw(getWindowVisibility());
        }
        if (yuVar.vt() == 3 && (vppVar = this.f12541ko) != null && vppVar.fvf == 1) {
            vppVar.fvf = 0;
        }
        if (yuVar.vt() != 1 || (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu)) {
            View viewLh = yuVar.lh();
            if (viewLh.getParent() != null) {
                ((ViewGroup) viewLh.getParent()).removeView(viewLh);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                arrayList.add(getChildAt(i10));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof com.bytedance.sdk.component.bly.le) {
                    removeView((View) arrayList.get(i11));
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.th.lh(this.f12541ko)) {
                addView(yuVar.lh(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(yuVar.lh());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.f12541ko;
        if (vppVar2 != null) {
            com.bytedance.sdk.openadsdk.rn.lh.ouw(vppVar2.ouw, this.f12536cd, this.mwh, yuVar.vt());
        }
        com.bytedance.sdk.component.adexpress.vt.bly blyVar = this.mt;
        if (blyVar != null) {
            ((mwh) blyVar).ryl();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.fkw;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) jgVar.f11588lh, (float) jgVar.yu);
        }
        if ((this.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) && com.bytedance.sdk.openadsdk.core.model.rn.ouw(this.f12541ko, false)) {
            com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar = new com.bytedance.sdk.openadsdk.core.cf.lh.vt(this.ryl, this.f12541ko);
            this.fak = vtVar;
            vtVar.ouw(this);
            this.fak.ouw(new com.bytedance.sdk.openadsdk.core.cf.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.7
                @Override // com.bytedance.sdk.openadsdk.core.cf.lh.ouw
                public final void ouw(View view, int i12, com.bytedance.sdk.component.adexpress.lh lhVar) {
                    while (true) {
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this, this.f12541ko, lh(getDynamicShowType()));
        vpp vppVar3 = this.jvy;
        if (vppVar3 != null) {
            vppVar3.ouw(this.f12541ko, this.mwh);
        }
    }

    public final JSONObject ouw(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        if (!(this.fvf instanceof ex)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (vppVar != null) {
                com.bytedance.sdk.openadsdk.core.model.vpp.ouw ouwVar = vppVar.f12886xn;
                if (ouwVar != null && ouwVar.ouw()) {
                    jSONObject.put("engine_version", vppVar.f12886xn.tlj);
                } else if (vppVar.lht != null) {
                    jSONObject.put("engine_version", "v3");
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ko.vt("NativeExpressView", "exception:" + e10.getMessage());
        }
        return jSONObject;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, String str, boolean z10, boolean z11) {
        if (vppVar == null) {
            return;
        }
        this.mwh = str;
        this.f12541ko = vppVar;
        this.f12539jg = adSlot;
        this.f12550tc = z10;
        this.rrs = z11;
        int i10 = vppVar.kfa;
        this.vt = i10;
        if (i10 != 10) {
            return;
        }
        this.uoy = true;
        pno();
        ko();
        this.uoy = false;
    }
}
