package com.inmobi.media;

import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes6.dex */
public abstract class D6 {
    public static final void a(ProgressBar progressBar, Fg fg2, float f10) {
        ck.p.j(progressBar, "<this>");
        ck.p.j(fg2, "progressConfig");
        progressBar.setProgressTintList(ColorStateList.valueOf(AbstractC3346z3.a(fg2.f22650c)));
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(AbstractC3346z3.a(fg2.f22651d)));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (fg2.f22652e * f10));
        layoutParams.addRule(12);
        progressBar.setLayoutParams(layoutParams);
    }
}
