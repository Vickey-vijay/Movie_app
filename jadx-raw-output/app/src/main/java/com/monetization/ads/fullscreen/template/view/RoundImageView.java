package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import ck.i;
import yads.u10;
import yads.v10;

/* JADX INFO: loaded from: classes2.dex */
public final class RoundImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u10 f42962a;

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, null, 8, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        u10 u10Var = this.f42962a;
        if (u10Var.f83297d != null && !u10Var.f83296c.isEmpty()) {
            canvas.clipPath(u10Var.f83296c);
        }
        super.onDraw(canvas);
    }

    @SuppressLint({"CustomViewStyleable"})
    public RoundImageView(Context context, AttributeSet attributeSet, int i10, v10 v10Var) {
        super(context, attributeSet, i10);
        v10Var.getClass();
        this.f42962a = v10.a(context, this, attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f42962a.a();
    }

    public /* synthetic */ RoundImageView(Context context, AttributeSet attributeSet, int i10, v10 v10Var, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new v10() : v10Var);
    }
}
