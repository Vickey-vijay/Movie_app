package com.bytedance.sdk.openadsdk.ouw.vt.ouw;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw extends com.bytedance.sdk.openadsdk.core.bly.ouw {
    private com.bytedance.sdk.openadsdk.ouw.vt.ouw mwh;
    public qbp ouw;

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw
    public final void ouw(View view, int i10, ko koVar) {
        qbp qbpVar = this.ouw;
        if (qbpVar != null) {
            qbpVar.ouw(view, i10, koVar);
        }
    }

    public final void setExtraFuncationHelper(com.bytedance.sdk.openadsdk.ouw.vt.ouw ouwVar) {
        this.mwh = ouwVar;
    }

    public ouw(@NonNull Context context) {
        super(context);
    }
}
