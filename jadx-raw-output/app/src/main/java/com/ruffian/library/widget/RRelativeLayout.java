package com.ruffian.library.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import wb.a;

/* JADX INFO: loaded from: classes6.dex */
public class RRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f43366b;

    public RRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43366b = new a(context, this, attributeSet);
    }

    public a getHelper() {
        return this.f43366b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f43366b.c(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f43366b.m(z10, i10, i11, i12, i13);
    }
}
