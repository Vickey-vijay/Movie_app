package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.luck.picture.lib.R$styleable;

/* JADX INFO: loaded from: classes10.dex */
public class RoundCornerRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f32459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f32460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f32461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f32462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f32463f;

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundCornerRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32463f = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.PictureRoundCornerRelativeLayout, i10, 0);
        this.f32460c = typedArrayObtainStyledAttributes.getDimension(R$styleable.PictureRoundCornerRelativeLayout_psCorners, 0.0f);
        this.f32461d = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PictureRoundCornerRelativeLayout_psTopNormal, false);
        this.f32462e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.PictureRoundCornerRelativeLayout_psBottomNormal, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f32459b = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f32459b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f32459b.reset();
        RectF rectF = this.f32463f;
        rectF.right = i10;
        rectF.bottom = i11;
        boolean z10 = this.f32461d;
        if (!z10 && !this.f32462e) {
            Path path = this.f32459b;
            float f10 = this.f32460c;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            return;
        }
        if (z10) {
            float f11 = this.f32460c;
            this.f32459b.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f11, f11, f11, f11}, Path.Direction.CW);
        }
        if (this.f32462e) {
            float f12 = this.f32460c;
            this.f32459b.addRoundRect(this.f32463f, new float[]{f12, f12, f12, f12, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
        }
    }
}
