package com.bytedance.sdk.openadsdk.component.bly;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public final class fkw extends lh {
    public ouw mwh;

    public interface ouw {
        void ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh, com.bytedance.sdk.openadsdk.core.le.ra, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final com.bytedance.sdk.openadsdk.core.le.yu getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final com.bytedance.sdk.openadsdk.core.le.pno getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final rn getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final View getUserInfo() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.bly.lh, com.bytedance.sdk.openadsdk.core.le.ra, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setRenderListener(ouw ouwVar) {
        this.mwh = ouwVar;
    }

    public fkw(Context context, vpp vppVar) {
        super(context);
        com.bytedance.sdk.openadsdk.core.bly.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.bly.fkw(context);
        com.bytedance.sdk.openadsdk.core.bly.yu.ouw();
        com.bytedance.sdk.openadsdk.core.bly.yu.vt(fkwVar);
        fkwVar.ouw(vppVar, new com.bytedance.sdk.openadsdk.core.bly.fkw.vt() { // from class: com.bytedance.sdk.openadsdk.component.bly.fkw.1
            @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
            public final void n_() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
            public final void ouw(int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
            public final void m_() {
                ouw ouwVar = fkw.this.mwh;
                if (ouwVar != null) {
                    ouwVar.ouw();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
            public final View ouw() {
                return fkw.this;
            }
        }, "open_ad");
        addView(fkwVar, new ViewGroup.LayoutParams(-1, -1));
        fkwVar.cf();
        int iOuw = osn.ouw(context, 9.0f);
        int iOuw2 = osn.ouw(context, 10.0f);
        this.yu = PAGLogoView.createPAGLogoViewByMaterial(context, vppVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, osn.ouw(context, 14.0f));
        layoutParams.leftMargin = iOuw2;
        layoutParams.bottomMargin = iOuw2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.yu, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.lh lhVar = new com.bytedance.sdk.openadsdk.core.widget.lh(context);
        this.ryl = lhVar;
        lhVar.setPadding(iOuw, 0, iOuw, 0);
        this.ryl.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(osn.ouw(context, 32.0f), osn.ouw(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, iOuw2, iOuw2);
        addView(this.ryl, layoutParams2);
        View view = this.pno;
        if (view != null) {
            addView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mwh = null;
    }
}
