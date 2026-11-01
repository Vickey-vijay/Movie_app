package com.bytedance.sdk.openadsdk.core.mwh.vt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.vm;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.fak;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.ra;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class le extends com.bytedance.sdk.openadsdk.core.le.lh implements com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw, jae.ouw, lh.ouw {
    public ImageView bly;
    private long bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private long f12935cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f12936cf;
    private String ex;
    private com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh ey;
    private boolean fak;
    public boolean fkw;
    private final Runnable fqk;
    private boolean fvf;
    private final AtomicBoolean hun;
    private boolean jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public boolean f12937jg;
    private final AtomicBoolean jvy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public boolean f12938ko;
    private boolean ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ra f12939le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public FrameLayout f12940lh;
    public int mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private boolean f12941od;
    private View osn;
    public final vpp ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private final Handler f12942pd;
    public ImageView pno;
    private boolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public RelativeLayout f12943ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public vt f12944rn;
    private ViewTreeObserver.OnGlobalLayoutListener rrs;
    public String ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private boolean f12945tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private boolean f12946th;
    public ImageView tlj;
    private final String uoy;
    private final boolean uq;
    private final ViewTreeObserver.OnScrollChangedListener ux;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private ViewGroup f12947vm;
    public lh vt;
    public boolean yu;
    private final Context zih;
    private String zin;
    private static final Integer vpp = 0;
    private static final Integer jqy = 1;

    public interface ouw {
        void ouw(View view, int i10);
    }

    public interface vt {
        void ouw(boolean z10, long j10, long j11, long j12, boolean z11);
    }

    public le(@NonNull Context context, @NonNull vpp vppVar, boolean z10, ra raVar) {
        this(context, vppVar, z10, "embeded_ad", false, raVar);
    }

    private void zih() {
        this.f12944rn = null;
        lh lhVar = this.vt;
        if ((lhVar instanceof lh) && !this.qbp) {
            lhVar.rrs();
        }
        ksc();
        ouw(false);
        vm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
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

    public le(@NonNull Context context, @NonNull vpp vppVar, String str, ra raVar) {
        this(context, vppVar, false, str, true, raVar);
    }

    private boolean ex() {
        int iFqk = this.ouw.fqk();
        zih.yu();
        return 2 == cf.vt(iFqk);
    }

    private void fkw() {
        this.vt = new lh(this.zih, this.f12940lh, this.ouw, this.ryl, !this.qbp, this.ksc, this.jae, this.f12939le);
        ko();
        if (this.rrs == null) {
            this.rrs = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    le leVar;
                    lh lhVar;
                    if (le.this.f12947vm == null || le.this.f12947vm.getViewTreeObserver() == null || (lhVar = (leVar = le.this).vt) == null) {
                        return;
                    }
                    lhVar.ouw(leVar.f12947vm.getWidth(), le.this.f12947vm.getHeight());
                    le.this.f12947vm.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    le.this.rrs = null;
                }
            };
            this.f12947vm.getViewTreeObserver().addOnGlobalLayoutListener(this.rrs);
        }
    }

    private void jae() {
        osn.fkw(this.bly);
        osn.fkw(this.f12943ra);
    }

    private void jqy() {
        if (!(this.vt == null || this.qbp || (th() && !com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_update_flag", false))) && th()) {
            long jTh = this.vt.th();
            long jZih = this.vt.zih() + jTh;
            boolean zOuw = com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_native_video_complete", false);
            long jOuw = com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long jOuw2 = com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_total_play_duration", jZih);
            long jOuw3 = com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_duration", jTh);
            com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            lh lhVar = this.vt;
            lhVar.f12909jg = zOuw;
            lhVar.vt(jOuw);
            lh lhVar2 = this.vt;
            lhVar2.uoy = jOuw2;
            lhVar2.bs = jOuw3;
            ko.fkw("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + zOuw + ",position=" + jOuw + ",totalPlayDuration=" + jOuw2 + ",duration=" + jOuw3);
        }
    }

    private void ko() {
        lh lhVar = this.vt;
        if (lhVar == null) {
            return;
        }
        lhVar.osn = this.f12946th;
        lhVar.ouw((lh.ouw) this);
        this.vt.f12913od = this;
    }

    private void ksc() {
        fkw fkwVar;
        lh lhVar = this.vt;
        if (lhVar == null || (fkwVar = lhVar.f12915ra) == null) {
            return;
        }
        fkwVar.ouw();
        View viewLh = fkwVar.lh();
        if (viewLh != null) {
            viewLh.setVisibility(8);
            if (viewLh.getParent() != null) {
                ((ViewGroup) viewLh.getParent()).removeView(viewLh);
            }
        }
    }

    private boolean od() {
        return fak.ouw(this, 50, ex.vt(this.ryl) ? 1 : 5, false);
    }

    private boolean qbp() {
        if (this.qbp || !th()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void rn() {
        lh lhVar = this.vt;
        if (lhVar == null) {
            fkw();
        } else if ((lhVar instanceof lh) && !this.qbp) {
            lhVar.ey();
        }
        if (this.vt == null || !this.jvy.get()) {
            return;
        }
        this.jvy.set(false);
        vt();
        if (!this.f12946th) {
            if (!this.vt.f12909jg) {
                ko.lh("NativeVideoTsView", "attachTask.......mRlImgCover.....VISIBLE");
                pno();
                osn.ouw((View) this.f12943ra, 0);
                return;
            } else {
                ko.vt("NativeVideoTsView", "attachTask-mNativeVideoController.isPlayComplete()=" + this.vt.f12909jg);
                bly();
                return;
            }
        }
        osn.ouw((View) this.f12943ra, 8);
        ImageView imageView = this.bly;
        if (imageView != null) {
            osn.ouw((View) imageView, 8);
        }
        vpp vppVar = this.ouw;
        if (vppVar == null || vppVar.f12874sd == null) {
            ko.fkw("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
            return;
        }
        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(vppVar.f12875sm).lh(), this.ouw);
        vtVarOuw.f10445le = this.ouw.pv;
        vtVarOuw.f10448ra = this.f12947vm.getWidth();
        vtVarOuw.pno = this.f12947vm.getHeight();
        vtVarOuw.bly = this.ouw.yhj;
        vtVarOuw.tlj = 0L;
        vtVarOuw.f10442cf = this.yu;
        ouw(vtVarOuw);
        this.vt.ouw(vtVarOuw);
        this.vt.f12909jg = false;
    }

    private void tc() {
        lh lhVar = this.vt;
        if (lhVar != null) {
            fkw fkwVar = lhVar.f12915ra;
            if (fkwVar != null) {
                fkwVar.ouw();
            }
            jae();
        }
    }

    private boolean th() {
        vpp vppVar = this.ouw;
        if (vppVar == null) {
            return false;
        }
        int i10 = vppVar.fvf;
        return (i10 == 2 || i10 == 1) && 3 == vppVar.f12868pd;
    }

    private void vm() {
        if (!this.jvy.get()) {
            this.jvy.set(true);
            lh lhVar = this.vt;
            if (lhVar != null) {
                lhVar.jg();
            }
        }
        this.hun.set(false);
    }

    private void vpp() {
        this.f12942pd.removeMessages(1);
        jg.lh().removeCallbacks(this.fqk);
    }

    private void yu() {
        ouw(0L, 0);
        this.ey = null;
    }

    private void zin() {
        if (this.qbp || !th()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    public final void bly() {
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.f12909jg = true;
            fkw fkwVar = lhVar.f12915ra;
            if (fkwVar != null) {
                fkwVar.vt();
                View viewLh = fkwVar.lh();
                if (viewLh != null) {
                    if (viewLh.getParent() != null) {
                        ((ViewGroup) viewLh.getParent()).removeView(viewLh);
                    }
                    viewLh.setVisibility(0);
                    addView(viewLh);
                    vpp vppVar = this.ouw;
                    new WeakReference(this.zih);
                    fkwVar.ouw(vppVar);
                }
            }
        }
    }

    public double getCurrentPlayTime() {
        lh lhVar = this.vt;
        if (lhVar != null) {
            return (lhVar.bly * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public lh getNativeVideoController() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.lh.ouw
    public final void le() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh interfaceC0061lh = this.ey;
        if (interfaceC0061lh != null) {
            interfaceC0061lh.h_();
        }
    }

    public void lh() {
        if (tlj()) {
            return;
        }
        ryl();
    }

    public final void mwh() {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        vpp vppVar = this.ouw;
        if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.yu(this.f12935cd);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vt vtVar;
        lh lhVar;
        if (!this.qbp && (vtVar = this.f12944rn) != null && (lhVar = this.vt) != null) {
            boolean z10 = lhVar.f12909jg;
            long jTh = lhVar.th();
            lh lhVar2 = this.vt;
            vtVar.ouw(z10, jTh, lhVar2.bly + lhVar2.zih(), this.vt.bly, this.f12946th);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        lh lhVar;
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar2;
        lh lhVar3;
        lh lhVar4;
        if ("open_ad".equals(this.ryl)) {
            vpp();
            return;
        }
        this.f12945tc = z10;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(this.ouw, z10);
        jqy();
        if (this.f12938ko) {
            if (qbp() && (lhVar4 = this.vt) != null && lhVar4.f12909jg) {
                zin();
                osn.ouw((View) this.f12943ra, 8);
                bly();
                yu();
                return;
            }
            vt();
            if (!this.qbp && this.f12946th && (lhVar3 = this.vt) != null && !lhVar3.zih) {
                Handler handler = this.f12942pd;
                if (handler != null) {
                    if (z10 && lhVar3 != null && !lhVar3.f12909jg) {
                        handler.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        vpp();
                        ouw(false, vpp.intValue());
                        return;
                    }
                }
                return;
            }
            if (this.f12946th) {
                return;
            }
            if (!z10 && (lhVar = this.vt) != null && (lhVar2 = lhVar.f12911le) != null && lhVar2.le()) {
                vpp();
                ouw(false, vpp.intValue());
            } else if (z10) {
                this.f12942pd.obtainMessage(1).sendToTarget();
            }
        }
    }

    public final void pno() {
        View view;
        if (this.zih == null || (view = this.osn) == null || view.getParent() == null || this.ouw == null || this.f12943ra != null) {
            return;
        }
        ViewParent parent = this.osn.getParent();
        Context context = this.zih;
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        raVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        raVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        yuVar.setLayoutParams(layoutParams);
        yuVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.pno = yuVar;
        com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        yuVar2.setLayoutParams(layoutParams2);
        yuVar2.setVisibility(8);
        yuVar2.setBackground(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_new_play_video"));
        this.tlj = yuVar2;
        raVar.addView(yuVar);
        raVar.addView(yuVar2);
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View view2 = this.osn;
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            viewGroup.removeViewInLayout(view2);
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 != null) {
                viewGroup.addView(raVar, iIndexOfChild, layoutParams3);
            } else {
                viewGroup.addView(raVar, iIndexOfChild);
            }
        }
        this.f12943ra = raVar;
        if (this.f12936cf) {
            osn.ouw((View) this.tlj, 0);
        }
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = this.ouw.f12874sd;
        if (vtVar != null && vtVar.f10457le != null) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = this.ouw;
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = vppVar.f12874sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vtVar2.f10457le, vtVar2.vt, vtVar2.ouw, this.pno, vppVar);
        }
        ImageView imageView = this.tlj;
        if (imageView != null) {
            imageView.setClickable(true);
            this.tlj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mwh/vt/le$2;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view3);
                    safedk_le$2_onClick_ca4cfea3a654cef3efbc46a54309a093(view3);
                }

                public void safedk_le$2_onClick_ca4cfea3a654cef3efbc46a54309a093(View p10) {
                    le.this.lh();
                }
            });
        }
    }

    public void setAdCreativeClickListener(final ouw ouwVar) {
        fkw fkwVar;
        final lh lhVar = this.vt;
        if (lhVar == null || !lhVar.f12910ko || (fkwVar = lhVar.f12915ra) == null) {
            return;
        }
        fkwVar.ey = new ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.2
            @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.ouw
            public final void ouw(View view, int i10) {
                le.ouw ouwVar2 = ouwVar;
                if (ouwVar2 != null) {
                    ouwVar2.ouw(view, i10);
                }
            }
        };
    }

    public void setControllerStatusCallBack(vt vtVar) {
        this.f12944rn = vtVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public void setIsAutoPlay(boolean z10) {
        if (this.fak) {
            return;
        }
        int iFqk = this.ouw.fqk();
        zih.yu();
        int iVt = cf.vt(iFqk);
        if (z10 && iVt != 4) {
            if (!(ksc.ouw(this.zih, 60000L) == 5)) {
                if (ksc.ouw(this.zih, 60000L) == 6) {
                    if (!ex()) {
                        int iFqk2 = this.ouw.fqk();
                        zih.yu();
                        if (!(5 == cf.vt(iFqk2))) {
                            z10 = false;
                        }
                    }
                } else if (!vm.ouw(this.zih)) {
                    z10 = false;
                }
            } else if (!ex()) {
                z10 = false;
            }
        }
        this.f12946th = z10;
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.osn = z10;
        }
        if (z10) {
            osn.ouw((View) this.f12943ra, 8);
        } else {
            pno();
            RelativeLayout relativeLayout = this.f12943ra;
            if (relativeLayout != null) {
                osn.ouw((View) relativeLayout, 0);
                vpp vppVar = this.ouw;
                if (vppVar != null && vppVar.f12874sd != null) {
                    com.bytedance.sdk.openadsdk.th.vt.ouw();
                    vpp vppVar2 = this.ouw;
                    com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar2.f12874sd;
                    com.bytedance.sdk.openadsdk.th.vt.ouw(vtVar.f10457le, vtVar.vt, vtVar.ouw, this.pno, vppVar2);
                }
            }
        }
        this.fak = true;
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z10) {
        this.f12936cf = z10;
    }

    public void setNeedSelfManagerVideo(boolean z10) {
        this.f12938ko = z10;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        fkw fkwVar;
        lh lhVar = this.vt;
        if (lhVar == null || !lhVar.f12910ko || (fkwVar = lhVar.f12915ra) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = fkwVar.fak;
        if (ouwVar != null) {
            ouwVar.ouw(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar2 = fkwVar.uoy;
        if (ouwVar2 != null) {
            ouwVar2.ouw(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh interfaceC0061lh) {
        this.ey = interfaceC0061lh;
    }

    public void setVideoAdLoadListener(com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu yuVar) {
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.jvy = new WeakReference<>(yuVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.zin = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.mwh.vt.vt vtVar) {
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.fqk = vtVar;
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
    public final void vt(long j10, int i10) {
        ko.vt("NativeVideoTsView", "onError() called with: totalPlayTime = [" + j10 + "], percent = [" + i10 + C3426d4.j.f28588e);
    }

    public le(@NonNull Context context, @NonNull vpp vppVar, ra raVar) {
        this(context, vppVar, false, raVar);
    }

    public final void cf() {
        if (getNativeVideoController() != null && (getNativeVideoController() instanceof lh)) {
            getNativeVideoController().ouw();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        rn();
        if (this.f12938ko) {
            getViewTreeObserver().addOnScrollChangedListener(this.ux);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zih();
        if (this.f12938ko) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.ux);
            }
            ViewGroup viewGroup = this.f12947vm;
            if (viewGroup != null && this.rrs != null) {
                ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this.rrs);
                    this.rrs = null;
                }
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        rn();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        zih();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        lh lhVar;
        vpp vppVar;
        Handler handler;
        lh lhVar2;
        lh lhVar3;
        super.onWindowVisibilityChanged(i10);
        jqy();
        if (qbp() && (lhVar3 = this.vt) != null && lhVar3.f12909jg) {
            zin();
            osn.ouw((View) this.f12943ra, 8);
            bly();
            yu();
            return;
        }
        vt();
        if (!this.qbp && this.f12946th && (lhVar = this.vt) != null && !lhVar.zih && (vppVar = this.ouw) != null) {
            if (this.f12941od && vppVar.f12874sd != null) {
                com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(vppVar.f12875sm).lh(), this.ouw);
                vtVarOuw.f10445le = this.ouw.pv;
                vtVarOuw.f10448ra = this.f12947vm.getWidth();
                vtVarOuw.pno = this.f12947vm.getHeight();
                vtVarOuw.bly = this.ouw.yhj;
                vtVarOuw.tlj = this.f12935cd;
                vtVarOuw.f10442cf = this.yu;
                ouw(vtVarOuw);
                this.vt.ouw(vtVarOuw);
                this.f12941od = false;
                osn.ouw((View) this.f12943ra, 8);
            } else {
                ko.fkw("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
            }
            if (i10 == 0 && this.f12938ko && (handler = this.f12942pd) != null && (lhVar2 = this.vt) != null && !lhVar2.f12909jg) {
                handler.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
    public final void ouw(long j10, int i10) {
        ko.vt("NativeVideoTsView", "onComplete() called with: totalPlayTime = [" + j10 + "], percent = [" + i10 + C3426d4.j.f28588e);
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh interfaceC0061lh = this.ey;
        if (interfaceC0061lh != null) {
            interfaceC0061lh.j_();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.lh.ouw
    public final void ra() {
        vt();
    }

    public final void ryl() {
        if (ksc.ouw(zih.ouw(), 60000L) == 0 || !od()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.vt.f12911le;
        if (lhVar != null) {
            if (lhVar.ra()) {
                ouw(true, jqy.intValue());
                vt();
                Handler handler = this.f12942pd;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(1, 500L);
                    return;
                }
                return;
            }
            if (this.vt.f12911le.vt() && !this.f12938ko) {
                tc();
                lh lhVar2 = this.vt;
                if (lhVar2 instanceof lh) {
                    lhVar2.jvy();
                    return;
                }
                return;
            }
        }
        if (!this.f12946th && !this.hun.get()) {
            this.hun.set(true);
            jae();
            vpp vppVar = this.ouw;
            if (vppVar != null && vppVar.f12874sd != null) {
                jae();
                com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(this.ouw.f12875sm).lh(), this.ouw);
                vtVarOuw.f10445le = this.ouw.pv;
                vtVarOuw.f10448ra = this.f12947vm.getWidth();
                vtVarOuw.pno = this.f12947vm.getHeight();
                vpp vppVar2 = this.ouw;
                vtVarOuw.bly = vppVar2.yhj;
                vtVarOuw.tlj = this.f12935cd;
                vtVarOuw.f10442cf = this.yu;
                vtVarOuw.f10446lh = CacheDirFactory.getICacheDir(vppVar2.f12875sm).lh();
                ouw(vtVarOuw);
                this.vt.ouw(vtVarOuw);
            }
            Handler handler2 = this.f12942pd;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            ouw(false);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 4 || i10 == 8) {
            vm();
        }
    }

    public final boolean tlj() {
        boolean z10 = false;
        if (ksc.ouw(zih.ouw(), 60000L) == 0) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.vt.f12911le;
        if (lhVar != null && lhVar.le()) {
            ouw(false, vpp.intValue());
            Handler handler = this.f12942pd;
            z10 = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z10;
    }

    public void vt() {
        vpp vppVar = this.ouw;
        if (vppVar == null) {
            return;
        }
        int iFqk = vppVar.fqk();
        zih.yu();
        int iVt = cf.vt(iFqk);
        int iOuw = ksc.ouw(zih.ouw(), 60000L);
        if (iVt == 1) {
            this.f12946th = uoy.yu(iOuw);
        } else if (iVt == 2) {
            this.f12946th = uoy.fkw(iOuw) || uoy.yu(iOuw) || uoy.le(iOuw);
        } else if (iVt == 3) {
            this.f12946th = false;
        } else if (iVt == 4) {
            this.f12937jg = true;
        } else if (iVt == 5) {
            this.f12946th = uoy.yu(iOuw) || uoy.le(iOuw);
        }
        if (!this.qbp) {
            if (!this.fkw || !ex.vt(this.ryl)) {
                zih.yu();
                this.yu = cf.vt(String.valueOf(iFqk));
            }
        } else {
            this.yu = false;
        }
        if ("open_ad".equals(this.ryl)) {
            this.f12946th = true;
            this.yu = true;
        }
        if (ex.vt(this.ryl)) {
            this.yu = true;
        }
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.osn = this.f12946th;
        }
        this.fkw = true;
    }

    public le(@NonNull Context context, @NonNull vpp vppVar, boolean z10, String str, boolean z11, ra raVar) {
        super(context);
        this.f12946th = true;
        this.yu = true;
        this.qbp = false;
        this.fkw = false;
        this.f12945tc = true;
        this.ksc = false;
        this.jae = true;
        this.f12936cf = true;
        this.ryl = "embeded_ad";
        this.mwh = 50;
        this.f12941od = true;
        this.uq = false;
        this.f12942pd = new jae(jg.vt().getLooper(), this);
        this.fak = false;
        this.uoy = Build.MODEL;
        this.f12937jg = false;
        this.f12938ko = true;
        this.jvy = new AtomicBoolean(false);
        this.fqk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.4
            @Override // java.lang.Runnable
            public final void run() {
                le leVar = le.this;
                leVar.ouw(leVar.fvf, le.vpp.intValue());
            }
        };
        this.hun = new AtomicBoolean(false);
        this.ux = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                le.ouw(le.this);
            }
        };
        try {
            if (vppVar.osn()) {
                this.ex = CacheDirFactory.getICacheDir(0).vt();
            }
        } catch (Throwable unused) {
        }
        if (raVar != null) {
            this.f12939le = raVar;
        }
        this.ryl = str;
        this.zih = context;
        this.ouw = vppVar;
        this.qbp = z10;
        setContentDescription("NativeVideoTsView");
        this.ksc = z11;
        this.jae = false;
        vt();
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.f12947vm = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.f12940lh = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.osn = view;
        addView(frameLayout);
        fkw();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                le.ouw(le.this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                le.ouw(le.this);
            }
        });
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
    public final void ouw() {
        ko.ouw("NativeVideoTsView", "embeded_ad", "onTimeOut、、、、、、、、");
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
    public final void ouw(long j10, long j11) {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh interfaceC0061lh = this.ey;
        if (interfaceC0061lh != null) {
            interfaceC0061lh.ouw(j10, j11);
        }
    }

    public final boolean ouw(long j10, boolean z10, boolean z11) {
        boolean zOuw = false;
        this.f12947vm.setVisibility(0);
        this.f12935cd = j10;
        if (!this.qbp) {
            return true;
        }
        this.vt.vt(false);
        vpp vppVar = this.ouw;
        if (vppVar != null && vppVar.f12874sd != null) {
            com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(vppVar.f12875sm).lh(), this.ouw);
            vtVarOuw.f10445le = this.ouw.pv;
            vtVarOuw.f10448ra = this.f12947vm.getWidth();
            vtVarOuw.pno = this.f12947vm.getHeight();
            vtVarOuw.bly = this.ouw.yhj;
            vtVarOuw.tlj = j10;
            vtVarOuw.f10442cf = this.yu;
            ouw(vtVarOuw);
            if (z11) {
                this.vt.vt(vtVarOuw);
                return true;
            }
            zOuw = this.vt.ouw(vtVarOuw);
        }
        if (((j10 > 0 && !z10 && !z11) || (j10 > 0 && z10)) && this.vt != null) {
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw ouwVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw();
            ouwVar.ouw(this.vt.bly);
            ouwVar.vt(this.vt.th());
            ouwVar.vt = this.vt.zih();
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(this.vt.f12915ra, ouwVar);
        }
        return zOuw;
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what == 1) {
            this.fvf = od();
            bs.ouw(this.fqk);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(boolean z10, int i10) {
        if (this.ouw == null || this.vt == null) {
            return;
        }
        boolean zQbp = qbp();
        zin();
        if (zQbp && this.vt.f12909jg) {
            ko.vt("NativeVideoTsView", "changeVideoStatus---isFromDetailPage()=" + zQbp + "，mNativeVideoController.isPlayComplete()=" + this.vt.f12909jg);
            bly();
            yu();
            return;
        }
        if (z10 && this.f12945tc) {
            lh lhVar = this.vt;
            if (!lhVar.f12909jg && !lhVar.zih) {
                com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar2 = lhVar.f12911le;
                if (lhVar2 != null && lhVar2.ra()) {
                    if (this.f12946th || i10 == 1) {
                        lh lhVar3 = this.vt;
                        if (lhVar3 != null) {
                            ouw(lhVar3.f12916rn, "changeVideoStatus");
                        }
                        if ("ALP-AL00".equals(this.uoy)) {
                            this.vt.ryl();
                        } else {
                            bly.ouw();
                            this.vt.yu(zQbp);
                        }
                        ouw(false);
                        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh interfaceC0061lh = this.ey;
                        if (interfaceC0061lh != null) {
                            interfaceC0061lh.i_();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.f12946th && this.vt.f12911le == null) {
                    if (!this.jvy.get()) {
                        this.jvy.set(true);
                    }
                    this.hun.set(false);
                    rn();
                    return;
                }
                return;
            }
        }
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar4 = this.vt.f12911le;
        if (lhVar4 == null || !lhVar4.le()) {
            return;
        }
        this.vt.cf();
        ouw(true);
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh interfaceC0061lh2 = this.ey;
        if (interfaceC0061lh2 != null) {
            interfaceC0061lh2.vt();
        }
    }

    public final void ouw(boolean z10, String str) {
        if (ex.vt(this.ryl)) {
            z10 = true;
        }
        this.yu = z10;
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.ouw(z10, str);
        }
    }

    public void ouw(boolean z10) {
        if (this.bly == null) {
            this.bly = new ImageView(getContext());
            if (bly.ouw().mwh() != null) {
                this.bly.setImageBitmap(bly.ouw().mwh());
            } else {
                this.bly.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(zih.ouw(), "tt_new_play_video"));
            }
            this.bly.setScaleType(ImageView.ScaleType.FIT_XY);
            int iOuw = osn.ouw(getContext(), this.mwh);
            int iOuw2 = osn.ouw(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOuw, iOuw);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iOuw2;
            layoutParams.bottomMargin = iOuw2;
            this.f12947vm.addView(this.bly, layoutParams);
            this.bly.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mwh/vt/le$5;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_le$5_onClick_8e0027ca8c1292a9f21ea443e9aa3725(view);
                }

                public void safedk_le$5_onClick_8e0027ca8c1292a9f21ea443e9aa3725(View p10) {
                    le.this.ryl();
                }
            });
        }
        if (z10) {
            this.bly.setVisibility(0);
        } else {
            this.bly.setVisibility(8);
        }
    }

    public final com.bytedance.sdk.openadsdk.core.ryl.le ouw(List<Pair<View, FriendlyObstructionPurpose>> list) {
        lh lhVar = this.vt;
        if (lhVar instanceof lh) {
            return lhVar.ouw(this, list);
        }
        return null;
    }

    private void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        try {
            if (this.ouw.osn()) {
                lhVar.f10446lh = this.ex;
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void ouw(le leVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = leVar.f12942pd;
        if (handler == null || jElapsedRealtime - leVar.bs <= 500) {
            return;
        }
        leVar.bs = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }
}
