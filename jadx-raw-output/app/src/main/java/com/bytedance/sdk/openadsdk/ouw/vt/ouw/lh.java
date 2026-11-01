package com.bytedance.sdk.openadsdk.ouw.vt.ouw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.th;
import com.bytedance.sdk.openadsdk.core.cf.yu;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.ouw.vt.pno;
import com.bytedance.sdk.openadsdk.utils.osn;

/* JADX INFO: loaded from: classes4.dex */
public class lh extends pno {
    public AdSlot bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f13287cf;
    public final Context ouw;
    public boolean ryl;
    public qbp tlj;

    public lh(@NonNull Context context, vpp vppVar, AdSlot adSlot) {
        super(context, vppVar, true);
        this.f13287cf = "embeded_ad";
        this.ryl = false;
        this.f13289lh.yw = 1;
        this.fkw.fkw = this;
        this.ouw = context;
        this.bly = adSlot;
        ouw();
        qbp qbpVar = this.tlj;
        if (qbpVar != null) {
            qbpVar.setBackupListener(new com.bytedance.sdk.component.adexpress.vt.lh() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh.1
                @Override // com.bytedance.sdk.component.adexpress.vt.lh
                public final boolean ouw(ViewGroup viewGroup) {
                    ouw ouwVar = new ouw(lh.this.tlj.getContext());
                    ouwVar.setExtraFuncationHelper(lh.this.fkw);
                    qbp qbpVar2 = lh.this.tlj;
                    ouwVar.ouw = qbpVar2;
                    qbpVar2.addView(ouwVar, new FrameLayout.LayoutParams(-1, -1));
                    return true;
                }
            });
        }
    }

    public final void fkw() {
        qbp qbpVar = this.tlj;
        if (qbpVar != null) {
            qbpVar.ko();
        }
    }

    public final void lh() {
        qbp qbpVar = this.tlj;
        if (qbpVar != null) {
            qbpVar.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.ouw.vt.ouw.lh.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public final void onAdClicked() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public final void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public final void onAdShow(View view, int i10) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public final void onRenderFail(View view, String str, int i10) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public final void onRenderSuccess(View view, float f10, float f11) {
                    if (!lh.this.tlj.zih()) {
                        lh.ouw(lh.this, f10, f11);
                        if (lh.this.ryl) {
                            lh.this.tlj.jg();
                            return;
                        }
                        return;
                    }
                    lh lhVar = lh.this;
                    Context context = lhVar.ouw;
                    vpp vppVar = lhVar.f13289lh;
                    lh lhVar2 = lh.this;
                    com.bytedance.sdk.openadsdk.ouw.vt.vt vtVar = new com.bytedance.sdk.openadsdk.ouw.vt.vt(context, vppVar, lhVar2.bly, lhVar2.fkw, lh.this.vt);
                    lh lhVar3 = lh.this;
                    if (lhVar3 instanceof vt) {
                        vtVar.ouw = ((th) lhVar3.yu()).getVideoAdListener();
                    }
                    lh.this.fkw.bly = lh.this.tlj.getClickCreativeListener();
                    PAGMediaView pAGMediaViewLe = lh.this.fkw.le();
                    if (pAGMediaViewLe == null) {
                        pAGMediaViewLe = new PAGMediaView(lh.this.ouw);
                    }
                    lh.this.tlj.addView(pAGMediaViewLe);
                }
            });
        }
    }

    public void ouw() {
        this.tlj = new qbp(this.ouw, this.f13289lh, this.bly, this.f13287cf);
        lh();
    }

    public final qbp yu() {
        return this.tlj;
    }

    public static /* synthetic */ void ouw(lh lhVar, float f10, float f11) {
        qbp qbpVar = lhVar.tlj;
        if (qbpVar != null && yu.ouw(qbpVar.getDynamicShowType())) {
            ViewGroup.LayoutParams layoutParams = lhVar.tlj.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            lhVar.tlj.setLayoutParams(layoutParams);
            return;
        }
        int iOuw = osn.ouw(lhVar.ouw, f10);
        int iOuw2 = osn.ouw(lhVar.ouw, f11);
        ViewGroup.LayoutParams layoutParams2 = lhVar.tlj.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(iOuw, iOuw2);
        } else {
            layoutParams2.width = iOuw;
            layoutParams2.height = iOuw2;
        }
        lhVar.tlj.setLayoutParams(layoutParams2);
    }
}
