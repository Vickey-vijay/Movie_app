package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public final class vt extends com.bytedance.sdk.openadsdk.core.le.lh {
    private float fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.activity.pno f12475le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final boolean f12476lh;
    public com.bytedance.sdk.openadsdk.core.le.lh ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f12477ra;
    private final boolean vt;
    private float yu;

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final void setScene(com.bytedance.sdk.openadsdk.activity.pno pnoVar) {
        this.f12475le = pnoVar;
    }

    public final void setWidthAndHeightRatio(float f10) {
        this.yu = f10;
    }

    public final void setWidthOrHeightInParentRatio(float f10) {
        this.fkw = f10;
    }

    public vt(@NonNull Context context, boolean z10, boolean z11, final int i10) {
        super(context);
        this.vt = z10;
        this.f12476lh = z11;
        if (!z10) {
            this.ouw = new com.bytedance.sdk.openadsdk.core.le.lh(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            addView(this.ouw, layoutParams);
            this.ouw.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.vt.1
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i10);
                }
            });
            this.ouw.setClipToOutline(true);
            return;
        }
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.vt.2
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i10);
            }
        });
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc;
        super.onAttachedToWindow();
        if (this.f12477ra || (pnoVar = this.f12475le) == null || (ouwVarKsc = pnoVar.ksc()) == null) {
            return;
        }
        ouwVarKsc.f12371cd.vt(true);
        this.f12477ra = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc;
        super.onDetachedFromWindow();
        if (!this.f12477ra || (pnoVar = this.f12475le) == null || (ouwVarKsc = pnoVar.ksc()) == null) {
            return;
        }
        ouwVarKsc.f12371cd.vt(false);
        this.f12477ra = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (!this.f12476lh) {
            if (this.vt) {
                float f10 = this.yu;
                if (f10 > 0.0f) {
                    i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
                } else {
                    float f11 = this.fkw;
                    if (f11 > 0.0f) {
                        i11 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f11), 1073741824);
                    }
                }
            } else {
                float f12 = this.yu;
                if (f12 > 0.0f) {
                    int iMax = Math.max(0, (size - ((int) (size2 * f12))) / 2);
                    setPadding(iMax, 0, iMax, 0);
                } else {
                    float f13 = this.fkw;
                    if (f13 > 0.0f) {
                        int iMax2 = Math.max(0, (size - ((int) (size * f13))) / 2);
                        setPadding(iMax2, 0, iMax2, 0);
                    }
                }
            }
        } else {
            float f14 = this.yu;
            if (f14 > 0.0f) {
                int iMax3 = Math.max(0, (size - ((int) (size2 * f14))) / 2);
                setPadding(iMax3, 0, iMax3, 0);
            } else {
                float f15 = this.fkw;
                if (f15 > 0.0f) {
                    int iMax4 = Math.max(0, (size - ((int) (size * f15))) / 2);
                    setPadding(iMax4, 0, iMax4, 0);
                }
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc;
        super.onWindowFocusChanged(z10);
        if (this.f12477ra == z10 || (pnoVar = this.f12475le) == null || (ouwVarKsc = pnoVar.ksc()) == null) {
            return;
        }
        ouwVarKsc.f12371cd.vt(z10);
    }
}
