package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public final class ex extends FrameLayout {
    private static final int bly = (com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw("", 0.0f, true)[1] / 2) + 1;
    private static final int tlj = (com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw("", 0.0f, true)[1] / 2) + 3;
    public LinearLayout fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public LinearLayout f11500le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public double f11501lh;
    public float ouw;
    private Drawable pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private Drawable f11502ra;
    public float vt;
    public float yu;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final Drawable getStarEmptyDrawable() {
        return this.f11502ra;
    }

    public final Drawable getStarFillDrawable() {
        return this.pno;
    }

    public final ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.ouw, (int) this.vt));
        imageView.setPadding(1, bly, 1, tlj);
        return imageView;
    }

    public ex(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fkw = new LinearLayout(getContext());
        this.f11500le = new LinearLayout(getContext());
        this.fkw.setOrientation(0);
        this.fkw.setGravity(GravityCompat.START);
        this.f11500le.setOrientation(0);
        this.f11500le.setGravity(GravityCompat.START);
        this.f11502ra = com.bytedance.sdk.component.utils.vpp.lh(context, "tt_star_thick");
        this.pno = com.bytedance.sdk.component.utils.vpp.lh(context, "tt_star");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.fkw.measure(i10, i11);
        double d10 = this.f11501lh;
        float f10 = this.ouw;
        this.f11500le.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((int) d10) * f10) + 1.0f)) + (((double) (f10 - 2.0f)) * (d10 - ((double) ((int) d10))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.fkw.getMeasuredHeight(), 1073741824));
        if (this.yu > 0.0f) {
            LinearLayout linearLayout = this.fkw;
            linearLayout.setPadding(0, ((int) (linearLayout.getMeasuredHeight() - this.yu)) / 2, 0, 0);
            this.f11500le.setPadding(0, ((int) (this.fkw.getMeasuredHeight() - this.yu)) / 2, 0, 0);
        }
    }
}
