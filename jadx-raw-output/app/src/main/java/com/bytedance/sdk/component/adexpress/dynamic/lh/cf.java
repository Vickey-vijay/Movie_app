package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.cd;
import com.bytedance.sdk.component.utils.vpp;

/* JADX INFO: loaded from: classes11.dex */
public final class cf implements ra<ViewGroup> {
    private final com.bytedance.sdk.component.adexpress.le.tlj ouw;
    private final FrameLayout vt;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final ViewGroup lh() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void ouw() {
        this.ouw.yu();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final void vt() {
        this.ouw.vt();
        ViewParent parent = this.vt.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.vt);
        }
    }

    public cf(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar, String str, String str2) {
        com.bytedance.sdk.component.adexpress.le.tlj tljVar = new com.bytedance.sdk.component.adexpress.le.tlj(context);
        this.ouw = tljVar;
        tljVar.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.vt = frameLayout;
        frameLayout.addView(tljVar, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = raVar.yu;
        double d10 = leVar.jqy;
        d10 = d10 == 0.0d ? 1.0d : d10;
        double d11 = leVar.ex;
        double d12 = d11 != 0.0d ? d11 : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if ("20".equals(str2)) {
            LinearLayout linearLayout = new LinearLayout(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            layoutParams2.setMargins(0, -cd.ouw(context, 5.0f), 0, 0);
            linearLayout.setLayoutParams(layoutParams2);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            textView.setText(context.getString(vpp.vt(context, "tt_splash_brush_mask_title")));
            textView.setTextColor(-1);
            textView.setTextSize(2, 20.0f);
            TextView textView2 = new TextView(context);
            textView2.setId(2097610738);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.setMargins(0, cd.ouw(context, 5.0f), 0, 0);
            textView2.setLayoutParams(layoutParams3);
            textView2.setText(context.getString(vpp.vt(context, "tt_splash_brush_mask_hint")));
            if (!TextUtils.isEmpty(raVar.yu.f11460vm)) {
                textView2.setText(raVar.yu.f11460vm);
            }
            textView2.setTextColor(-1);
            textView2.setTextSize(2, 14.0f);
            linearLayout.addView(textView);
            linearLayout.addView(textView2);
            frameLayout.addView(linearLayout);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 81;
            int i10 = raVar.yu.f11461xn;
            if (i10 <= 0) {
                if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                    i10 = 0;
                } else {
                    i10 = 120;
                }
            }
            layoutParams4.bottomMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, i10);
            frameLayout.setLayoutParams(layoutParams4);
            frameLayout.setClipChildren(false);
            return;
        }
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) (((double) fkwVar.getDynamicWidth()) * 0.32d * d10), (int) (((double) fkwVar.getDynamicWidth()) * 0.32d * d12));
        layoutParams5.gravity = 17;
        frameLayout.setLayoutParams(layoutParams5);
    }
}
