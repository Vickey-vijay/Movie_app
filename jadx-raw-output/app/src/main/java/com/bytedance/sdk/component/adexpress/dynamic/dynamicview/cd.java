package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class cd extends le implements com.bytedance.sdk.component.adexpress.dynamic.lh {
    private boolean ouw;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh
    public final void ouw(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        int i11 = 0;
        if (!z10 && !z11) {
            i11 = 8;
        }
        setVisibility(i11);
    }

    public cd(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.f11367ra = this.pno;
        ImageView imageView = new ImageView(context);
        this.f11364ko = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.f11364ko, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            if (!dynamicRootView.getRenderRequest().f11602tc) {
                this.f11364ko.setVisibility(8);
                setVisibility(8);
            }
            this.ouw = dynamicRootView.getRenderRequest().bly;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        Drawable drawableLh;
        super.ra();
        View view = this.f11364ko;
        if (view != null) {
            ((ImageView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
            Drawable drawableOuw = com.bytedance.sdk.component.adexpress.yu.lh.ouw(getContext(), this.ryl);
            if (drawableOuw != null) {
                ((ImageView) this.f11364ko).setBackground(drawableOuw);
            }
            if (this.ouw) {
                drawableLh = com.bytedance.sdk.component.utils.vpp.lh(getContext(), "tt_close_btn");
            } else {
                drawableLh = com.bytedance.sdk.component.utils.vpp.lh(getContext(), "tt_skip_btn");
            }
            if (drawableLh != null) {
                drawableLh.setAutoMirrored(true);
                ((ImageView) this.f11364ko).setImageDrawable(drawableLh);
            }
            int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f11362cf, this.ryl.vt());
            this.f11364ko.setPadding(iOuw, iOuw, iOuw, iOuw);
        }
        setVisibility(8);
        return true;
    }
}
