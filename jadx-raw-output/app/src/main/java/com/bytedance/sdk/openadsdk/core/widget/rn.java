package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public class rn extends View {
    private Drawable fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private float f13145le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f13146lh;
    private final Path ouw;
    private final boolean vt;
    private Drawable yu;

    public rn(Context context) {
        this(context, false);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final void ouw(double d10, int i10) {
        int iOuw = (int) osn.ouw(getContext(), i10, false);
        this.f13146lh = iOuw;
        this.yu.setBounds(0, 0, iOuw, iOuw);
        Drawable drawable = this.fkw;
        int i11 = this.f13146lh;
        drawable.setBounds(0, 0, i11, i11);
        this.f13145le = ((float) d10) / 5.0f;
        ouw();
        requestLayout();
    }

    public rn(Context context, boolean z10) {
        super(context);
        this.ouw = new Path();
        this.vt = z10;
        Context context2 = getContext();
        this.yu = vpp.lh(context2, z10 ? "tt_star_thick_dark" : "tt_star_thick");
        this.fkw = vpp.lh(context2, "tt_star");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f13146lh * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f13146lh, 1073741824));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f13146lh <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i10 = 0; i10 < 5; i10++) {
            this.yu.draw(canvas);
            canvas.translate(this.f13146lh, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.ouw);
        for (int i11 = 0; i11 < 5; i11++) {
            this.fkw.draw(canvas);
            canvas.translate(this.f13146lh, 0.0f);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ouw();
    }

    private void ouw() {
        int width = getWidth();
        int height = getHeight();
        if (this.f13145le <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.ouw.reset();
        this.ouw.addRect(new RectF(0.0f, 0.0f, width * this.f13145le, height), Path.Direction.CCW);
    }
}
