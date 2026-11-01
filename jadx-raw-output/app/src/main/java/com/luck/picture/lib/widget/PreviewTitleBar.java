package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.TitleBarStyle;
import o8.q;

/* JADX INFO: loaded from: classes5.dex */
public class PreviewTitleBar extends TitleBar {
    public PreviewTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewTitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.luck.picture.lib.widget.TitleBar
    public void d() {
        super.d();
        TitleBarStyle titleBarStyleD = PictureSelectionConfig.T0.d();
        if (q.c(titleBarStyleD.d())) {
            setBackgroundColor(titleBarStyleD.d());
        } else if (q.b(titleBarStyleD.g())) {
            setBackgroundColor(titleBarStyleD.g());
        }
        if (q.c(titleBarStyleD.e())) {
            this.f32491c.setImageResource(titleBarStyleD.e());
        }
        this.f32490b.setOnClickListener(null);
        this.f32497i.setOnClickListener(null);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f32490b.getLayoutParams();
        layoutParams.removeRule(17);
        layoutParams.addRule(14);
        this.f32490b.setBackgroundResource(R$drawable.ps_ic_trans_1px);
        this.f32495g.setVisibility(8);
        this.f32492d.setVisibility(8);
        this.f32497i.setVisibility(8);
    }
}
