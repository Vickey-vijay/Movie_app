package com.bytedance.adsdk.ugeno.ouw;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class pno implements ra {
    private float fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private float f10933le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private float f10934lh;
    public float ouw;
    private View vt;
    private float yu;

    public final void ouw(float f10) {
        View view = this.vt;
        if (view == null) {
            return;
        }
        this.ouw = f10;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f10);
        }
    }

    public final void fkw(float f10) {
        this.f10933le = f10;
        this.vt.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getRipple() {
        return this.f10934lh;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getRubIn() {
        return this.f10933le;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getShine() {
        return this.yu;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.ra
    public final float getStretch() {
        return this.fkw;
    }

    public final void lh(float f10) {
        View view = this.vt;
        if (view == null) {
            return;
        }
        this.yu = f10;
        view.postInvalidate();
    }

    public final void vt(float f10) {
        View view = this.vt;
        if (view == null) {
            return;
        }
        this.f10934lh = f10;
        view.postInvalidate();
    }

    public final void yu(float f10) {
        this.fkw = f10;
        this.vt.postInvalidate();
    }

    public pno(View view) {
        this.vt = view;
    }

    public final void ouw(int i10) {
        View view = this.vt;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i10);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i10);
        }
    }
}
