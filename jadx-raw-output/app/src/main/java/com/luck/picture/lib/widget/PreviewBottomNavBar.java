package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.style.BottomNavBarStyle;
import o8.q;

/* JADX INFO: loaded from: classes2.dex */
public class PreviewBottomNavBar extends BottomNavBar {
    public PreviewBottomNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreviewBottomNavBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.luck.picture.lib.widget.BottomNavBar
    public void c() {
        this.f32434b.setVisibility(8);
        this.f32435c.setOnClickListener(this);
        this.f32435c.setVisibility(PictureSelectionConfig.Z0 != null ? 0 : 8);
    }

    public TextView getEditor() {
        return this.f32435c;
    }

    public void i(boolean z10) {
        this.f32435c.setVisibility((PictureSelectionConfig.Z0 == null || z10) ? 8 : 0);
    }

    @Override // com.luck.picture.lib.widget.BottomNavBar
    public void f() {
        super.f();
        BottomNavBarStyle bottomNavBarStyleB = PictureSelectionConfig.T0.b();
        if (q.c(bottomNavBarStyleB.l())) {
            setBackgroundColor(bottomNavBarStyleB.l());
        } else if (q.b(bottomNavBarStyleB.f())) {
            setBackgroundColor(bottomNavBarStyleB.f());
        }
    }

    @Override // com.luck.picture.lib.widget.BottomNavBar, android.view.View.OnClickListener
    public void onClick(View view) {
        BottomNavBar.b bVar;
        super.onClick(view);
        if (view.getId() == R$id.ps_tv_editor && (bVar = this.f32438f) != null) {
            bVar.b();
        }
    }
}
