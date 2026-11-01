package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class zih extends le {
    private LinearLayout jqy;
    private TextView ouw;
    private TextView qbp;
    private TextView vpp;
    private TextView vt;
    private TextView zin;

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

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le
    public final FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f11367ra, this.pno);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final boolean lh() {
        this.ouw.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.ouw.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.vt.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.vt.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.qbp.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.qbp.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        this.qbp.setText("Function");
        this.vt.setText("Permission list");
        this.zin.setText(" | ");
        this.vpp.setText(" | ");
        this.ouw.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        if (raVar != null) {
            this.qbp.setTextColor(raVar.le());
            this.qbp.setTextSize(this.ryl.yu.pno);
            this.vt.setTextColor(this.ryl.le());
            this.vt.setTextSize(this.ryl.yu.pno);
            this.zin.setTextColor(this.ryl.le());
            this.vpp.setTextColor(this.ryl.le());
            this.ouw.setTextColor(this.ryl.le());
            this.ouw.setTextSize(this.ryl.yu.pno);
            return false;
        }
        this.qbp.setTextColor(-1);
        this.qbp.setTextSize(12.0f);
        this.vt.setTextColor(-1);
        this.vt.setTextSize(12.0f);
        this.zin.setTextColor(-1);
        this.vpp.setTextColor(-1);
        this.ouw.setTextColor(-1);
        this.ouw.setTextSize(12.0f);
        return false;
    }

    public zih(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.ouw = new TextView(this.f11362cf);
        this.vt = new TextView(this.f11362cf);
        this.qbp = new TextView(this.f11362cf);
        this.jqy = new LinearLayout(this.f11362cf);
        this.zin = new TextView(this.f11362cf);
        this.vpp = new TextView(this.f11362cf);
        this.ouw.setTag(9);
        this.vt.setTag(10);
        this.qbp.setTag(12);
        this.jqy.addView(this.qbp);
        this.jqy.addView(this.vpp);
        this.jqy.addView(this.vt);
        this.jqy.addView(this.zin);
        this.jqy.addView(this.ouw);
        addView(this.jqy, getWidgetLayoutParams());
    }
}
