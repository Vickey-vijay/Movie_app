package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.ironsource.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3540jb extends LevelPlayMediaView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3540jb(Context context) {
        super(context);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44960f, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3540jb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3540jb(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
    }
}
