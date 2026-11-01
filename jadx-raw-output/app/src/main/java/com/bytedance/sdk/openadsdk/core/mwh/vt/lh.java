package com.bytedance.sdk.openadsdk.core.mwh.vt;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.component.utils.bly;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.ko.jg;
import com.bytedance.sdk.openadsdk.ko.mwh;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.bytedance.sdk.openadsdk.yu.ra;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lh extends com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw {

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private final String f12948cj;
    public vt fqk;
    public int hun;
    public WeakReference<com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu> jvy;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    private WeakReference<ouw> f12949kn;
    private long lso;
    private int mt;
    private int myk;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    private boolean f12950ng;
    private final boolean pv;
    public boolean rrs;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    private final boolean f12951ub;
    private int ucs;
    private long ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private int f12952vh;
    private final boolean wp;
    private final Runnable xdk;
    private final com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw yhj;
    private ra yib;
    private final ksc.ouw zvq;

    public interface ouw {
        void le();

        void ra();
    }

    public static /* synthetic */ boolean cf(lh lhVar) {
        lhVar.f12917tc = false;
        return false;
    }

    public static /* synthetic */ boolean mt(lh lhVar) {
        lhVar.f12917tc = true;
        return true;
    }

    public static /* synthetic */ boolean sd(lh lhVar) {
        lhVar.f12917tc = false;
        return false;
    }

    public final void fkw(boolean z10) {
        if (z10 || this.fvf) {
            if (z10) {
                this.fvf = false;
            }
            if (this.vpp || !this.qbp.get()) {
                return;
            }
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.ouw(rn());
            ouwVar.vt(th());
            ouwVar.vt = zih();
            ouwVar.tlj = 3;
            ouwVar.ryl = vm();
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.f12915ra, ouwVar, this.yib);
        }
    }

    private void fqk() {
        com.bytedance.sdk.component.utils.ko.vt(this.ouw, "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.mwh));
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar != null) {
            if (lhVar.ra()) {
                if (this.mwh) {
                    cd();
                } else {
                    vt(this.fak);
                }
                com.bytedance.sdk.component.utils.ko.vt(this.ouw, "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.mwh));
            } else {
                this.f12911le.ouw(false, this.bly, this.f12916rn);
            }
        }
        if (this.qbp.get()) {
            fak();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.ouw.ouw.ouw.le.vt hun() {
        fkw fkwVar;
        if (this.f12908cf.getResources().getConfiguration().orientation != 1 || (fkwVar = this.f12915ra) == null) {
            return null;
        }
        return fkwVar.f12925le;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void bly() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar != null) {
            lhVar.ryl();
        }
    }

    public final void ey() {
        if (this.f12950ng || !this.jqy) {
            return;
        }
        Context applicationContext = zih.ouw().getApplicationContext();
        this.f12950ng = true;
        ksc.ouw(this.zvq, applicationContext);
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void jg() {
        if (!this.vpp && this.qbp.get()) {
            fkw(false);
            this.vpp = false;
        }
        ko();
        com.bytedance.sdk.openadsdk.core.ryl.le leVar = this.f12907cd;
        if (leVar != null) {
            leVar.yu();
        }
    }

    public final void jvy() {
        if (this.f12911le != null) {
            this.f12909jg = false;
            uoy();
            this.qbp.set(false);
            this.vpp = false;
            ouw(this.yib);
            this.f12911le.ryl();
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ko() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar != null) {
            lhVar.jg();
            this.f12911le = null;
        }
        if (this.rrs) {
            if ("embeded_ad".equals(this.f12948cj)) {
                this.f12915ra.zin();
            } else {
                this.f12915ra.ouw(this.pno);
            }
            this.f12912lh.removeCallbacksAndMessages(null);
            this.ryl.clear();
            if (this.f12910ko) {
                rrs();
            }
        }
    }

    public final void ksc() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar;
        int i10;
        int i11;
        com.bytedance.sdk.component.utils.ko.vt(this.ouw, "[step-0]  TAG is 'ChangeVideoSize' ....... start  changeVideoSize >>>>>>>>>>>>>>>>>>>>>>>");
        try {
            if (hun() != null && (lhVar = this.f12911le) != null && this.ksc != null) {
                int iYu = lhVar.yu();
                int iFkw = this.f12911le.fkw();
                final int width = this.ksc.getWidth();
                final int height = this.ksc.getHeight();
                if (width > 0 && height > 0 && iFkw > 0 && iYu > 0) {
                    if (iYu == iFkw) {
                        i11 = width > height ? height : width;
                        i10 = i11;
                    } else if (iYu > iFkw) {
                        i11 = (int) ((((double) width) * 1.0d) / ((double) ((iYu * 1.0f) / iFkw)));
                        i10 = width;
                    } else {
                        i10 = (int) ((((double) height) * 1.0d) / ((double) ((iFkw * 1.0f) / iYu)));
                        i11 = height;
                    }
                    if (i11 <= height && i11 > 0) {
                        height = i11;
                    }
                    if (i10 <= width && i10 > 0) {
                        width = i10;
                    }
                    this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (lh.this.hun() instanceof TextureView) {
                                    ((TextureView) lh.this.hun()).setLayoutParams(layoutParams);
                                    com.bytedance.sdk.component.utils.ko.vt(lh.this.ouw, "[step-9] >>>>> setLayoutParams to TextureView complete ! >>>>>>>");
                                } else if (lh.this.hun() instanceof SurfaceView) {
                                    ((SurfaceView) lh.this.hun()).setLayoutParams(layoutParams);
                                    com.bytedance.sdk.component.utils.ko.vt(lh.this.ouw, "[step-9] >>>>> setLayoutParams to SurfaceView complete !>>>>>>>");
                                }
                            } catch (Throwable unused) {
                                com.bytedance.sdk.component.utils.ko.vt(lh.this.ouw, "[step-9] setLayoutParams exception");
                            }
                        }
                    });
                    return;
                }
                com.bytedance.sdk.component.utils.ko.vt(this.ouw, " container or video exist size <= 0");
                return;
            }
            com.bytedance.sdk.component.utils.ko.vt(this.ouw, "[step-1] >>>>> mContextRef=" + this.f12908cf + ",getIRenderView() =" + hun());
            String str = this.ouw;
            StringBuilder sb2 = new StringBuilder("[step-1] >>>>> mMediaPlayerProxy == null:");
            boolean z10 = true;
            sb2.append(this.f12911le == null);
            sb2.append(",mMediaPlayerProxy.getMediaPlayer() == null:");
            if (this.f12911le == null) {
                z10 = false;
            }
            sb2.append(z10);
            com.bytedance.sdk.component.utils.ko.vt(str, sb2.toString());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.vt(this.ouw, "[step-11] >>>>> changeVideoSize error !!!!! ：".concat(String.valueOf(th2)));
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void mwh() {
        jg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw
    public final void pd() {
        this.f12918th = !this.f12918th;
        if (!(this.f12908cf instanceof Activity)) {
            com.bytedance.sdk.component.utils.ko.vt(this.ouw, "context is not activity, not support this function.");
            return;
        }
        fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.vt(this.ksc);
            this.f12915ra.yu(false);
        }
        lh(1);
        WeakReference<com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.vt> weakReference = this.jae;
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.vt vtVar = weakReference != null ? weakReference.get() : null;
        if (vtVar != null) {
            vtVar.ouw(this.f12918th);
        }
    }

    public final void rrs() {
        if (this.f12950ng && this.jqy) {
            this.f12950ng = false;
            ksc.ouw(this.zvq);
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final void ryl() {
        fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.ouw();
        }
        fkw fkwVar2 = this.f12915ra;
        if (fkwVar2 != null) {
            fkwVar2.th();
        }
        fqk();
    }

    public final void yu(boolean z10) {
        fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.ouw();
        }
        fkw fkwVar2 = this.f12915ra;
        if (fkwVar2 != null && z10) {
            fkwVar2.th();
        }
        fqk();
    }

    public lh(Context context, ViewGroup viewGroup, vpp vppVar, String str, boolean z10, boolean z11, boolean z12, ra raVar) {
        ViewGroup mwhVar;
        super(context, vppVar, viewGroup);
        this.ux = 0L;
        this.lso = 0L;
        this.rrs = true;
        this.ucs = 0;
        this.f12952vh = 0;
        this.yhj = new com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1
            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void lh(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                lh.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 5);
                            com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(lh.this.pno, 5);
                            if (lh.this.f12907cd != null) {
                                lh.this.f12907cd.ouw(9);
                            }
                        } catch (Exception unused) {
                        }
                        lh.fkw(lh.this);
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = lh.this.pno.sd();
                if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
                    return;
                }
                yuVar.lh(lh.this.bly);
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void vt(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10) {
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void fkw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = lh.this.pno.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    yuVar.vt(lh.this.bly);
                }
                if (lh.this.f12907cd != null) {
                    lh.this.f12907cd.ouw(1);
                }
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void vt(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
                lh.this.f12912lh.removeCallbacks(lh.this.xdk);
                lh.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (lh.this.jvy != null && lh.this.jvy.get() != null) {
                            ((com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu) lh.this.jvy.get()).k_();
                        }
                        if (lh.this.f12915ra != null) {
                            lh.this.f12915ra.vt();
                        }
                    }
                });
                if (lh.this.f12951ub) {
                    return;
                }
                lh lhVar = lh.this;
                lhVar.ouw(lhVar.yib);
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void yu(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = lh.this.pno.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    yuVar.ouw(lh.this.bly);
                }
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 3);
                if (lh.this.f12907cd != null) {
                    lh.this.f12907cd.ouw(0);
                }
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, long j10) {
                if (!lh.this.zin.get()) {
                    lh.this.bs();
                }
                lh.cf(lh.this);
                lh.this.f12912lh.removeCallbacks(lh.this.xdk);
                lh.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (lh.this.f12915ra != null) {
                            lh.this.f12915ra.vt();
                        }
                        if (!lh.this.f12910ko || lh.this.f12949kn == null || lh.this.f12949kn.get() == null) {
                            return;
                        }
                        ((ouw) lh.this.f12949kn.get()).le();
                    }
                });
                lh.this.osn();
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 0);
                if (lh.this.f12907cd != null) {
                    lh.this.f12907cd.vt();
                }
                lh lhVar = lh.this;
                lhVar.ouw(lhVar.yib);
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, final com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw ouwVar2) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                if (vpp.le(lh.this.pno)) {
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.5
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            try {
                                ouwVar3.f13464lh = "video_player";
                                ouwVar3.pno = uoy.ouw(lh.this.pno);
                                ouwVar3.vt = BuildConfig.VERSION_NAME;
                            } catch (Throwable unused) {
                            }
                            return ouwVar3;
                        }
                    });
                }
                com.bytedance.sdk.component.utils.ko.fkw(lh.this.ouw, "onError: " + ouwVar2.ouw + ", " + ouwVar2.vt + ", " + ouwVar2.f10453lh);
                lh.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw ouwVar3 = ouwVar2;
                        int i10 = ouwVar3.ouw;
                        int i11 = ouwVar3.vt;
                        if (!lh.this.fvf() || i11 == -1004) {
                            if (lh.ouw(lh.this, i10, i11)) {
                                com.bytedance.sdk.component.utils.ko.fkw(lh.this.ouw, "Play video error，show result page、、、、、、、");
                                lh.this.f12915ra.ouw(lh.this.pno);
                                lh lhVar = lh.this;
                                lhVar.f12909jg = true;
                                lhVar.ko();
                            }
                            if (lh.this.f12915ra != null) {
                                lh.this.f12915ra.vt();
                            }
                            if (lh.this.f12913od != null) {
                                lh.this.f12913od.vt(lh.this.lso, com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(lh.this.bly, lh.this.bs));
                            }
                            if (lh.this.jvy == null || lh.this.jvy.get() == null || lh.this.fvf()) {
                                return;
                            }
                            ((com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu) lh.this.jvy.get()).ouw(i10, i11);
                        }
                    }
                });
                lh.this.ouw(ouwVar2);
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = lh.this.pno.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    yuVar.ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 6);
                com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(lh.this.pno);
                if (lh.this.f12907cd != null) {
                    lh.this.f12907cd.ouw(14);
                }
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, boolean z13) {
                lh.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (lh.this.f12915ra != null) {
                            lh.this.f12915ra.vt();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10, int i11) {
                bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.this.ksc();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10, int i11, int i12) {
                lh.mt(lh.this);
                lh.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (lh.this.f12915ra != null) {
                            lh.this.f12915ra.vm();
                            lh.this.f12912lh.postDelayed(lh.this.xdk, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 2);
                if (lh.this.f12907cd != null) {
                    lh.this.f12907cd.ouw(4);
                }
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, int i10) {
                lh.sd(lh.this);
                lh.this.f12912lh.removeCallbacks(lh.this.xdk);
                lh.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.this.f12915ra.vt();
                    }
                });
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 0);
                if (lh.this.f12907cd != null) {
                    lh.this.f12907cd.ouw(5);
                }
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.ouw.InterfaceC0060ouw
            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVar, final long j10, final long j11) {
                if (Math.abs(j10 - lh.this.bly) < 50) {
                    return;
                }
                if (!lh.this.zin.get()) {
                    lh.this.bs();
                }
                lh lhVar = lh.this;
                lhVar.ouw(lhVar.yib);
                lh.this.f12912lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.this.ouw(j10, j11);
                        lh.this.vt(j10, j11);
                    }
                });
            }
        };
        this.mt = 0;
        this.xdk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.4
            @Override // java.lang.Runnable
            public final void run() {
                if (lh.this.f12915ra != null) {
                    lh.this.f12915ra.ouw(lh.this.pno);
                    lh.this.f12915ra.vt();
                    lh lhVar = lh.this;
                    lhVar.f12909jg = true;
                    com.bytedance.sdk.component.utils.ko.fkw(lhVar.ouw, "Show result page after error.......showAdCard");
                }
            }
        };
        this.zvq = new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.6
            @Override // com.bytedance.sdk.component.utils.ksc.ouw
            @WorkerThread
            public final void ouw(boolean z13, final int i10) {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.ouw(lh.this, i10);
                    }
                });
            }
        };
        this.f12950ng = false;
        this.myk = ksc.ouw(context, 60000L);
        vt(z10);
        this.f12948cj = str;
        try {
            this.ucs = viewGroup.getWidth();
            this.f12952vh = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        if (this.f12910ko) {
            mwhVar = new jg(context);
        } else {
            mwhVar = new mwh(context);
        }
        ViewGroup viewGroup2 = mwhVar;
        boolean z13 = this.f12910ko;
        if (z13) {
            this.f12915ra = new fkw(context, viewGroup2, this.pno, this, z13);
        } else {
            this.f12915ra = new yu(context, viewGroup2, this.pno, this);
        }
        this.f12915ra.ouw((com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw) this);
        this.f12951ub = true;
        this.pv = z11;
        this.wp = z12;
        if (raVar != null) {
            this.yib = raVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt(long j10, long j11) {
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        this.pno.uq = j10;
        this.bly = j10;
        this.bs = j11;
        this.f12915ra.ouw(j10, j11);
        this.f12915ra.ouw(com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(j10, j11));
        try {
            com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar = this.f12913od;
            if (ouwVar != null) {
                ouwVar.ouw(j10, j11);
            }
        } catch (Throwable th2) {
            qbp.ouw(this.ouw, "onProgressUpdate error: ", th2);
        }
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = this.pno.sd();
        if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.ouw(j10, j11, this.f12907cd);
    }

    public final void ouw(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        this.ucs = i10;
        this.f12952vh = i11;
        com.bytedance.sdk.component.utils.ko.vt(this.ouw, "width=" + i10 + "height=" + i11);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x014c  */
    public final void yu(int i10) {
        View view;
        View view2;
        com.bytedance.sdk.openadsdk.core.widget.qbp.vt vtVar;
        ViewGroup.LayoutParams layoutParams;
        if (this.myk == i10) {
            return;
        }
        this.myk = i10;
        if (i10 != 4 && i10 != 0) {
            this.f12919vm = false;
        }
        if (!this.f12919vm && !jqy() && this.pv) {
            if (i10 == 0) {
                cf();
                this.zih = true;
                fkw fkwVar = this.f12915ra;
                if (fkwVar != null) {
                    fkwVar.ouw(this.pno);
                }
            }
            if (i10 != 4 && i10 != 0) {
                fkw fkwVar2 = this.f12915ra;
                if (fkwVar2 != null) {
                    fkwVar2.ouw();
                }
                cf();
                this.zih = true;
                this.f12919vm = false;
                fkw fkwVar3 = this.f12915ra;
                if (fkwVar3 != null) {
                    com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = this.pno.f12874sd;
                    boolean z10 = this.wp;
                    com.bytedance.sdk.openadsdk.core.widget.qbp qbpVar = fkwVar3.f12921cd;
                    if (qbpVar != null) {
                        Context context = qbpVar.f13140lh;
                        if (context != null && vtVar2 != null) {
                            ViewGroup viewGroup = qbpVar.pno;
                            if (context != null && viewGroup != null && qbpVar.ouw == null) {
                                if (viewGroup instanceof RelativeLayout) {
                                    layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                                } else if (viewGroup instanceof LinearLayout) {
                                    layoutParams = new LinearLayout.LayoutParams(-1, -1);
                                } else {
                                    layoutParams = viewGroup instanceof FrameLayout ? new FrameLayout.LayoutParams(-1, -1) : null;
                                }
                                if (layoutParams != null) {
                                    com.bytedance.sdk.openadsdk.ko.ko koVar = new com.bytedance.sdk.openadsdk.ko.ko(context);
                                    qbpVar.ouw = koVar;
                                    koVar.setLayoutParams(layoutParams);
                                    qbpVar.pno.addView(qbpVar.ouw);
                                    qbpVar.vt = (TextView) qbpVar.ouw.findViewById(rn.f13405ak);
                                    View viewFindViewById = qbpVar.ouw.findViewById(rn.f13431rh);
                                    if (z10) {
                                        viewFindViewById.setClickable(true);
                                        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.qbp.1
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view3) {
                                                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/qbp$1;->onClick(Landroid/view/View;)V");
                                                CreativeInfoManager.onViewClicked(g.f44975u, view3);
                                                safedk_qbp$1_onClick_df27fdcca769b8a71271ed1865caac3e(view3);
                                            }

                                            public AnonymousClass1() {
                                            }

                                            public void safedk_qbp$1_onClick_df27fdcca769b8a71271ed1865caac3e(View p10) {
                                                qbp qbpVar2 = qbp.this;
                                                if (qbpVar2.f13140lh != null) {
                                                    qbpVar2.vt();
                                                }
                                                com.bytedance.sdk.openadsdk.core.mwh.vt.ouw ouwVar = qbp.this.yu;
                                                if (ouwVar != null) {
                                                    ouwVar.ouw(ouw.START_VIDEO);
                                                }
                                            }
                                        });
                                    } else {
                                        viewFindViewById.setOnClickListener(null);
                                        viewFindViewById.setClickable(false);
                                    }
                                }
                            }
                            qbpVar.f13141ra = vtVar2;
                            if (!qbpVar.ouw() && !qbpVar.f13139le) {
                                if (qbpVar.yu != null && (vtVar = qbpVar.fkw) != null) {
                                    if (vtVar.ryl()) {
                                        qbpVar.yu.le();
                                    }
                                    qbpVar.yu.ouw(com.bytedance.sdk.openadsdk.core.widget.qbp.ouw.PAUSE_VIDEO);
                                }
                                com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar3 = qbpVar.f13141ra;
                                if (vtVar3 != null && (view = qbpVar.ouw) != null && qbpVar.f13140lh != null && view.getVisibility() != 0) {
                                    com.bytedance.sdk.openadsdk.core.widget.qbp.vt vtVar4 = qbpVar.fkw;
                                    if (vtVar4 != null) {
                                        vtVar4.mwh();
                                    }
                                    String str = String.format(com.bytedance.sdk.component.utils.vpp.ouw(qbpVar.f13140lh, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(Math.ceil((vtVar3.f10458lh * 1.0d) / 1048576.0d)).floatValue()));
                                    osn.ouw(qbpVar.ouw, 0);
                                    osn.ouw(qbpVar.vt, str);
                                    Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
                                    if (osn.yu(qbpVar.ouw) && (view2 = qbpVar.ouw) != null) {
                                        view2.bringToFront();
                                        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (i10 == 4) {
                this.zih = false;
                fkw fkwVar4 = this.f12915ra;
                if (fkwVar4 != null) {
                    fkwVar4.rn();
                }
            }
        }
        WeakReference<ouw> weakReference = this.f12949kn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f12949kn.get().ra();
    }

    public final com.bytedance.sdk.openadsdk.core.ryl.le ouw(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.pno.uq()) {
            return null;
        }
        if (this.f12907cd == null) {
            this.f12907cd = new com.bytedance.sdk.openadsdk.core.ryl.le();
        }
        this.f12907cd.ouw(view, this.pno);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.f12907cd.ouw((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.f12907cd;
    }

    public static /* synthetic */ void fkw(lh lhVar) {
        lhVar.mt++;
        fkw fkwVar = lhVar.f12915ra;
        if (fkwVar != null) {
            fkwVar.vt();
            com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar = lhVar.f12913od;
            if (ouwVar != null) {
                ouwVar.ouw(lhVar.lso, com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(lhVar.bly, lhVar.bs));
            }
            lhVar.lso = System.currentTimeMillis() - lhVar.ux;
            if (lhVar.rrs) {
                lhVar.f12915ra.ouw(lhVar.pno);
            }
            if (!lhVar.vpp) {
                lhVar.vpp = true;
                long j10 = lhVar.bs;
                lhVar.vt(j10, j10);
                long j11 = lhVar.bs;
                lhVar.bly = j11;
                lhVar.tlj = j11;
                lhVar.vt(lhVar.yib);
            }
            if (!lhVar.f12910ko && lhVar.f12918th) {
                lhVar.pd();
            }
            lhVar.f12909jg = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh
    public final boolean ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        super.ouw(lhVar);
        if (this.f12911le != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(lhVar.pno())) {
            com.bytedance.sdk.component.utils.ko.fkw(this.ouw, "[video] play video stop , because no video info");
            return false;
        }
        this.f12909jg = false;
        com.bytedance.sdk.component.utils.ko.vt(this.ouw, "url is " + lhVar.pno());
        lhVar.yu = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("player_force_raw_url", 0) == 1;
        int i10 = this.hun + 1;
        this.hun = i10;
        lhVar.jqy = i10;
        vt(lhVar);
        uoy();
        com.bytedance.sdk.openadsdk.core.ryl.le leVar = this.f12907cd;
        if (leVar != null) {
            leVar.ouw(false, 0.0f);
        }
        if (!ex.vt(this.f12948cj) || this.bly <= 0) {
            this.bly = lhVar.tlj;
        }
        if (ex.vt(this.f12948cj) && this.bly == this.bs) {
            this.bly = 0L;
        }
        long j10 = lhVar.tlj;
        if (j10 <= 0) {
            this.vpp = false;
            this.qbp.set(false);
        } else {
            this.bly = j10;
            this.tlj = Math.max(this.tlj, j10);
        }
        fkw fkwVar = this.f12915ra;
        if (fkwVar != null) {
            fkwVar.ouw();
            if (this.mt == 0) {
                this.f12915ra.tlj();
            }
            this.f12915ra.vt(lhVar.f10448ra, lhVar.pno);
            this.f12915ra.lh(this.ksc);
            this.f12915ra.ouw(lhVar.f10448ra, lhVar.pno);
        }
        if (this.f12911le == null) {
            com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.mwh.yu.lh();
            this.f12911le = lhVar2;
            lhVar2.ouw(this.yhj);
        }
        od();
        this.lso = 0L;
        try {
            com.bytedance.sdk.component.utils.ko.vt(this.ouw, "[video] playVideo has invoke !");
            lhVar.f10444ko = 0;
            this.f12911le.ouw(lhVar);
            this.ux = System.currentTimeMillis();
            this.f12915ra.lh(8);
            this.f12915ra.lh(0);
            ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (lh.this.f12911le == null) {
                        return;
                    }
                    lh.this.ux = System.currentTimeMillis();
                    lh.this.f12915ra.yu(0);
                    lh.this.f12911le.ouw(true, lh.this.bly, lh.this.f12916rn);
                }
            });
            if (this.f12910ko) {
                ey();
            }
            return true;
        } catch (Exception e10) {
            ouw(new com.bykv.vk.openvk.ouw.ouw.ouw.lh.ouw(e10.getMessage()));
            qbp.lh(this.ouw, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e10)));
            return false;
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.ouw
    public final void ouw() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f12911le;
        if (lhVar == null) {
            return;
        }
        if (lhVar.le()) {
            cf();
            this.f12915ra.le(true);
            this.f12915ra.pno();
            return;
        }
        if (!this.f12911le.ra()) {
            fkw fkwVar = this.f12915ra;
            if (fkwVar != null) {
                fkwVar.lh(this.ksc);
            }
            lh(this.bly);
            fkw fkwVar2 = this.f12915ra;
            if (fkwVar2 != null) {
                fkwVar2.le(false);
                return;
            }
            return;
        }
        yu(false);
        fkw fkwVar3 = this.f12915ra;
        if (fkwVar3 != null) {
            fkwVar3.le(false);
        }
    }

    public final void ouw(ouw ouwVar) {
        this.f12949kn = new WeakReference<>(ouwVar);
    }

    public static /* synthetic */ boolean ouw(lh lhVar, int i10, int i11) {
        com.bytedance.sdk.component.utils.ko.vt(lhVar.ouw, "OnError - Error code: " + i10 + " Extra code: " + i11);
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    public static /* synthetic */ void ouw(lh lhVar, int i10) {
        lhVar.yu(i10);
        if (i10 == 4) {
            lhVar.zih = false;
        }
    }
}
