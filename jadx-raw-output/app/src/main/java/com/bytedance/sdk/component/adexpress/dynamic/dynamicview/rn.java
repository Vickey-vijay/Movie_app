package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class rn extends le implements com.bytedance.sdk.component.adexpress.dynamic.vt {
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

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final boolean yu() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.vt
    public final void setSoundMute(boolean z10) {
        ((ImageView) this.f11364ko).setImageResource(z10 ? com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_reward_full_mute") : com.bytedance.sdk.component.utils.vpp.yu(getContext(), "tt_reward_full_unmute"));
        if (((ImageView) this.f11364ko).getDrawable() != null) {
            ((ImageView) this.f11364ko).getDrawable().setAutoMirrored(true);
        }
    }

    public rn(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        ImageView imageView = new ImageView(context);
        this.f11364ko = imageView;
        imageView.setTag(5);
        addView(this.f11364ko, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() != null && !dynamicRootView.getRenderRequest().f11602tc) {
            this.f11364ko.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            ((ImageView) this.f11364ko).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.f11364ko).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.f11363jg.mIsMute);
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            Drawable drawableOuw = com.bytedance.sdk.component.adexpress.yu.lh.ouw(getContext(), this.ryl);
            if (drawableOuw != null) {
                ((ImageView) this.f11364ko).setBackground(drawableOuw);
            }
        } else {
            ((ImageView) this.f11364ko).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.yu.pno.ouw(0, Integer.valueOf(this.ryl.mwh()), new int[]{this.pno / 2}, null, null, null));
        }
        return true;
    }
}
