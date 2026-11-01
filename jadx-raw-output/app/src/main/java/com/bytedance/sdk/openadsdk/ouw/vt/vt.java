package com.bytedance.sdk.openadsdk.ouw.vt;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.rn;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class vt extends pno implements com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu, com.bytedance.sdk.openadsdk.multipro.vt.ouw.InterfaceC0144ouw {
    private final com.bytedance.sdk.openadsdk.multipro.vt.ouw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private boolean f13291cf;
    private long mwh;
    public lh ouw;
    private AdSlot ryl;
    private boolean tlj;

    public vt(@NonNull Context context, @NonNull vpp vppVar, AdSlot adSlot) {
        super(context, vppVar, true);
        this.tlj = false;
        this.f13291cf = true;
        this.f13288le = 5;
        this.ryl = adSlot;
        this.bly = new com.bytedance.sdk.openadsdk.multipro.vt.ouw();
        ouw(this.f13290ra);
        super.ouw("embeded_ad");
        this.fkw.yu = this;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void i_() {
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu
    public final void k_() {
    }

    private void ouw(int i10) {
        zih.yu();
        int iVt = cf.vt(i10);
        int iOuw = ksc.ouw(zih.ouw(), 60000L);
        if (3 == iVt) {
            this.tlj = false;
            this.f13291cf = false;
        } else {
            if (1 == iVt && uoy.yu(iOuw)) {
                this.tlj = false;
            } else if (2 == iVt) {
                if (uoy.fkw(iOuw) || uoy.yu(iOuw) || uoy.le(iOuw)) {
                    this.tlj = false;
                }
            } else if (4 == iVt) {
                this.tlj = true;
            } else if (5 == iVt && (uoy.yu(iOuw) || uoy.le(iOuw))) {
            }
            this.f13291cf = true;
        }
        ouw ouwVar = this.fkw;
        if (ouwVar != null) {
            ouwVar.vt = this.tlj;
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void h_() {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.vt();
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void j_() {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.yu();
        }
    }

    public final View le() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar;
        vpp vppVar = this.f13289lh;
        if (vppVar != null && this.yu != null) {
            if (vpp.fkw(vppVar)) {
                try {
                    leVar = new com.bytedance.sdk.openadsdk.core.mwh.vt.le(this.yu, this.f13289lh, this.vt.f12988lh);
                    vpp vppVar2 = this.f13289lh;
                    if (vppVar2 != null && vppVar2.cd()) {
                        com.bytedance.sdk.openadsdk.core.ryl.le leVarOuw = leVar.ouw((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        ouw ouwVar = this.fkw;
                        if (ouwVar != null) {
                            ouwVar.f13280cf = new WeakReference<>(leVarOuw);
                        }
                    }
                    this.vt.ouw(leVar.getNativeVideoController());
                    ouw ouwVar2 = this.fkw;
                    if (ouwVar2 != null) {
                        ouwVar2.f13283lh = new WeakReference<>(leVar);
                    }
                    leVar.setVideoAdClickListenerTTNativeAd(this);
                    leVar.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.mwh.vt.le.ouw() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.vt.1
                        @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.ouw
                        public final void ouw(View view, int i10) {
                            le leVar2;
                            rn rnVar = vt.this.vt;
                            if (rnVar == null || (leVar2 = rnVar.vt) == null) {
                                return;
                            }
                            leVar2.onAdClicked();
                        }
                    });
                    leVar.setControllerStatusCallBack(new com.bytedance.sdk.openadsdk.core.mwh.vt.le.vt() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.vt.2
                        @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.vt
                        public final void ouw(boolean z10, long j10, long j11, long j12, boolean z11) {
                            vt.this.bly.ouw = z10;
                            vt.this.bly.fkw = j10;
                            vt.this.bly.f13265le = j11;
                            vt.this.bly.f13267ra = j12;
                            vt.this.bly.yu = z11;
                        }
                    });
                    leVar.setVideoAdLoadListener(this);
                    leVar.setVideoAdInteractionListener(this);
                    if (5 == this.f13288le) {
                        leVar.setIsAutoPlay(this.tlj ? this.ryl.isAutoPlay() : this.f13291cf);
                    } else {
                        leVar.setIsAutoPlay(this.f13291cf);
                    }
                    zih.yu();
                    leVar.ouw(cf.vt(String.valueOf(this.f13290ra)), "feedGetAdView");
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("", "getAdView null", e10);
                    leVar = null;
                }
            } else {
                leVar = null;
            }
            if (vpp.fkw(this.f13289lh) && leVar != null && leVar.ouw(0L, true, false)) {
                return leVar;
            }
            ApmHelper.reportCustomError(this.f13289lh.ucs + StringUtils.COMMA + leVar, "getAdView null", new RuntimeException());
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.vt.ouw.InterfaceC0144ouw
    public final com.bytedance.sdk.openadsdk.multipro.vt.ouw ra() {
        return this.bly;
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.vt.pno, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public final void showPrivacyActivity() {
        ouw ouwVar = this.fkw;
        if (ouwVar != null) {
            ouwVar.bly();
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void vt() {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.lh();
        }
    }

    public vt(@NonNull Context context, @NonNull vpp vppVar, AdSlot adSlot, ouw ouwVar, rn rnVar) {
        super(context, vppVar, false);
        this.tlj = false;
        this.f13291cf = true;
        this.fkw = ouwVar;
        this.vt = rnVar;
        this.f13288le = 5;
        this.ryl = adSlot;
        this.bly = new com.bytedance.sdk.openadsdk.multipro.vt.ouw();
        ouw(this.f13290ra);
        super.ouw("embeded_ad");
        ouwVar.yu = this;
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.yu
    public final void ouw(int i10, int i11) {
        lh lhVar = this.ouw;
        if (lhVar != null) {
            lhVar.ouw();
        }
    }

    @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.InterfaceC0061lh
    public final void ouw(long j10, long j11) {
        this.mwh = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.ouw.vt.pno
    public final void ouw(String str) {
        super.ouw(str);
    }
}
