package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public class rn extends com.bytedance.sdk.openadsdk.core.mwh.vt.le implements View.OnClickListener {
    private boolean zih;

    public rn(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str, com.bytedance.sdk.openadsdk.yu.ra raVar, boolean z10) {
        super(context, vppVar, false, str, false, raVar);
        this.zih = false;
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
        setNeedSelfManagerVideo(!z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/rn;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(g.f44975u, view);
        safedk_rn_onClick_1808d4b7fd0ad6adc531677557cabe75(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le
    public final void ouw(boolean z10) {
    }

    private void ko() {
        osn.ouw((View) this.f12943ra, 0);
        osn.ouw((View) this.pno, 0);
        osn.ouw((View) this.tlj, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le
    public final void lh() {
        if (this.zih) {
            super.lh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        ImageView imageView = this.bly;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowFocusChanged(z10);
        } else {
            rn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        ImageView imageView = this.bly;
        if (imageView == null || imageView.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i10);
        } else {
            rn();
        }
    }

    public final void ouw(int i10, int i11) {
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.ouw(i10, i11);
            com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar = lhVar.f12915ra;
            if (fkwVar == null || i10 <= 0 || i11 <= 0) {
                return;
            }
            fkwVar.vt(i10, i11);
            lhVar.f12915ra.ouw(i10, i11);
            lhVar.ksc();
        }
    }

    public void safedk_rn_onClick_1808d4b7fd0ad6adc531677557cabe75(View p10) {
        View p11 = this.bly;
        if (p11 != null && p11.getVisibility() == 0) {
            View p12 = this.f12943ra;
            osn.fkw(p12);
        }
        lh();
    }

    public void setCanInterruptVideoPlay(boolean z10) {
        this.zih = z10;
    }

    public void setShouldCheckNetChange(boolean z10) {
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.lh(z10);
        }
    }

    public void setShowAdInteractionView(boolean z10) {
        com.bytedance.sdk.openadsdk.core.mwh.vt.fkw fkwVar;
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh lhVar = this.vt;
        if (lhVar == null || (fkwVar = lhVar.f12915ra) == null) {
            return;
        }
        fkwVar.ouw(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le
    public final void vt() {
        if (!this.fkw || !ex.vt(this.ryl)) {
            this.yu = false;
        }
        super.vt();
    }

    public final void yu() {
        ImageView imageView = this.tlj;
        if (imageView != null) {
            osn.ouw((View) imageView, 8);
        }
    }

    private void rn() {
        pno();
        RelativeLayout relativeLayout = this.f12943ra;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            }
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.ouw;
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar.f12874sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vtVar.f10457le, vtVar.vt, vtVar.ouw, this.pno, vppVar);
        }
        ko();
    }

    public final void fkw() {
        pno();
        osn.ouw((View) this.f12943ra, 0);
    }
}
