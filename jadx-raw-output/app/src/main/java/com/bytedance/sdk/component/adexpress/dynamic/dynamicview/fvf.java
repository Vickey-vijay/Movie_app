package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class fvf extends le implements com.bytedance.sdk.component.adexpress.dynamic.fkw {
    public TextView ouw;
    public boolean qbp;
    public FrameLayout vt;

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

    private void vt(View view) {
        if (view == this.ouw || view == ((le) this).f11371th) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.f11421le)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i10 = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                return;
            }
            vt(viewGroup.getChildAt(i10));
            i10++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fkw
    public final void ouw() {
        this.ouw.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fkw
    public final void setTimeUpdate(int i10) {
        if (!this.mwh.bly.f11431lh.f11459vi || i10 <= 0 || this.qbp) {
            this.qbp = true;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                vt(getChildAt(i11));
            }
            this.ouw.setVisibility(8);
            return;
        }
        String str = (i10 >= 60 ? "0" + (i10 / 60) : "00") + StringUtils.PROCESS_POSTFIX_DELIMITER;
        int i12 = i10 % 60;
        this.ouw.setText(i12 > 9 ? str + i12 : str + "0" + i12);
        this.ouw.setVisibility(0);
    }

    public fvf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.qbp = false;
        View view = new View(context);
        this.f11364ko = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.ouw = new TextView(context);
        this.vt = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 15.0f));
        layoutParams.gravity = BadgeDrawable.BOTTOM_END;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.ouw.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.ouw.setBackground(gradientDrawable);
        this.ouw.setTextSize(10.0f);
        this.ouw.setGravity(17);
        this.ouw.setTextColor(-1);
        this.ouw.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            addView(this.vt, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.ouw);
        addView(this.f11364ko, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.yu.vt()) {
            addView(this.vt, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.vt;
        dynamicRootView.setVideoListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        double d10 = 0.0d;
        double d11 = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh; pnoVar != null; pnoVar = pnoVar.f11471cf) {
            double d12 = d11 + ((double) pnoVar.vt);
            double d13 = d10 + ((double) pnoVar.f11475lh);
            d11 = d12 - ((double) pnoVar.yu);
            d10 = d13 - ((double) pnoVar.fkw);
        }
        try {
            float f10 = (float) d11;
            int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), f10);
            int iOuw2 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), f10 + this.fkw);
            if (com.bytedance.sdk.component.adexpress.yu.vt.ouw(getContext())) {
                int dynamicWidth = ((vm) this.f11363jg.getChildAt(0)).getDynamicWidth();
                int i10 = dynamicWidth - iOuw2;
                iOuw2 = dynamicWidth - iOuw;
                iOuw = i10;
            }
            if (!"open_ad".equals(this.f11363jg.getRenderRequest().ouw)) {
                float f11 = (float) d10;
                ((vm) this.f11363jg.getChildAt(0)).ouw.ouw(iOuw, (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), f11), iOuw2, (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), f11 + this.f11365le));
            } else {
                this.f11363jg.videoView = this.vt;
            }
        } catch (Exception unused) {
        }
        this.f11363jg.updateRenderInfoForVideo(d11, d10, this.fkw, this.f11365le, this.ryl.yu.ouw);
        return true;
    }
}
