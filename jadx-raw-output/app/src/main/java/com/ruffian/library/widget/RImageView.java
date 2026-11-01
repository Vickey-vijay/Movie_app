package com.ruffian.library.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.ViewCompat;
import xb.a;

/* JADX INFO: loaded from: classes10.dex */
public class RImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f43351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f43352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f43353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f43354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f43355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f43356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f43357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f43359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView.ScaleType f43360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f43361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorFilter f43362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PorterDuff.Mode f43363n;

    public final PorterDuff.Mode g(int i10) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return PorterDuff.Mode.SRC_ATOP;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f43361l = 0;
        this.f43359j = a.b(bitmap);
        f();
        super.setImageDrawable(this.f43359j);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f43361l = 0;
        this.f43359j = a.c(drawable);
        f();
        super.setImageDrawable(this.f43359j);
    }

    public final void a() {
        if (this.f43359j == null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                return;
            }
            Drawable background = getBackground();
            if (background == null) {
                setImageBitmap(Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ALPHA_8));
            } else {
                background.setBounds(0, 0, measuredWidth, measuredHeight);
                setImageDrawable(background);
            }
        }
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RImageView);
        this.f43358i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RImageView_is_circle, false);
        this.f43351b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RImageView_corner_radius, -1);
        this.f43352c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RImageView_corner_radius_top_left, 0);
        this.f43353d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RImageView_corner_radius_top_right, 0);
        this.f43354e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RImageView_corner_radius_bottom_left, 0);
        this.f43355f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RImageView_corner_radius_bottom_right, 0);
        this.f43356g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RImageView_border_width, 0);
        this.f43357h = typedArrayObtainStyledAttributes.getColor(R$styleable.RImageView_border_color, ViewCompat.MEASURED_STATE_MASK);
        attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "tint", 0);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "tintMode", 0);
        if (attributeIntValue != 0) {
            this.f43363n = g(attributeIntValue);
        }
        setImageTintList(getImageTintList());
        typedArrayObtainStyledAttributes.recycle();
        f();
    }

    public void d() {
        Drawable drawable;
        ColorFilter colorFilter = this.f43362m;
        if (colorFilter == null || (drawable = this.f43359j) == null) {
            return;
        }
        drawable.setColorFilter(colorFilter);
    }

    public final void e(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof a) {
            ((a) drawable).e(scaleType, this.f43356g, this.f43357h, this.f43358i, this.f43351b, this.f43352c, this.f43353d, this.f43354e, this.f43355f);
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                e(layerDrawable.getDrawable(i10), scaleType);
            }
        }
    }

    public final void f() {
        e(this.f43359j, this.f43360k);
        d();
    }

    public int getBorderColor() {
        return this.f43357h;
    }

    public float getBorderWidth() {
        return this.f43356g;
    }

    public float getCorner() {
        return this.f43351b;
    }

    public float getCornerBottomLeft() {
        return this.f43354e;
    }

    public float getCornerBottomRight() {
        return this.f43355f;
    }

    public float getCornerTopLeft() {
        return this.f43352c;
    }

    public float getCornerTopRight() {
        return this.f43353d;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(@DrawableRes int i10) {
        if (this.f43361l != i10) {
            this.f43361l = i10;
            this.f43359j = c();
            f();
            super.setImageDrawable(this.f43359j);
        }
    }

    public RImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43351b = -1.0f;
        this.f43352c = 0.0f;
        this.f43353d = 0.0f;
        this.f43354e = 0.0f;
        this.f43355f = 0.0f;
        this.f43356g = 0.0f;
        this.f43357h = ViewCompat.MEASURED_STATE_MASK;
        this.f43358i = false;
        this.f43363n = PorterDuff.Mode.SRC_ATOP;
        b(context, attributeSet);
    }

    public final Drawable c() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.f43361l;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception unused) {
                this.f43361l = 0;
            }
        }
        return a.c(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a();
    }

    @Override // android.widget.ImageView
    public void setImageTintList(@Nullable ColorStateList colorStateList) {
        super.setImageTintList(colorStateList);
        if (colorStateList != null) {
            this.f43362m = new PorterDuffColorFilter(colorStateList.getDefaultColor(), this.f43363n);
        }
        d();
    }

    @Override // android.widget.ImageView
    public void setImageTintMode(@Nullable PorterDuff.Mode mode) {
        super.setImageTintMode(mode);
        this.f43363n = mode;
        d();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        if (this.f43360k != scaleType) {
            this.f43360k = scaleType;
            f();
            invalidate();
        }
    }
}
