package com.yalantis.ucrop.view.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.yalantis.ucrop.R$color;
import com.yalantis.ucrop.R$dimen;
import com.yalantis.ucrop.R$styleable;
import com.yalantis.ucrop.model.AspectRatio;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class AspectRatioTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f45751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f45752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f45753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f45755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f45757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f45758i;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void c(@NonNull TypedArray typedArray) {
        setGravity(1);
        this.f45756g = typedArray.getString(R$styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_title);
        this.f45757h = typedArray.getFloat(R$styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_x, 0.0f);
        float f10 = typedArray.getFloat(R$styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_y, 0.0f);
        this.f45758i = f10;
        float f11 = this.f45757h;
        if (f11 == 0.0f || f10 == 0.0f) {
            this.f45755f = 0.0f;
        } else {
            this.f45755f = f11 / f10;
        }
        this.f45754e = getContext().getResources().getDimensionPixelSize(R$dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.f45753d = paint;
        paint.setStyle(Paint.Style.FILL);
        d();
        a(getResources().getColor(R$color.ucrop_color_widget_active));
        typedArray.recycle();
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45751b = 1.5f;
        this.f45752c = new Rect();
        c(context.obtainStyledAttributes(attributeSet, R$styleable.ucrop_AspectRatioTextView));
    }

    public final void a(@ColorInt int i10) {
        Paint paint = this.f45753d;
        if (paint != null) {
            paint.setColor(i10);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{0}}, new int[]{i10, ContextCompat.getColor(getContext(), R$color.ucrop_color_widget)}));
    }

    public float b(boolean z10) {
        if (z10) {
            e();
            d();
        }
        return this.f45755f;
    }

    public final void d() {
        if (TextUtils.isEmpty(this.f45756g)) {
            setText(String.format(Locale.US, "%d:%d", Integer.valueOf((int) this.f45757h), Integer.valueOf((int) this.f45758i)));
        } else {
            setText(this.f45756g);
        }
    }

    public final void e() {
        if (this.f45755f != 0.0f) {
            float f10 = this.f45757h;
            float f11 = this.f45758i;
            this.f45757h = f11;
            this.f45758i = f10;
            this.f45755f = f11 / f10;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f45752c);
            Rect rect = this.f45752c;
            float f10 = (rect.right - rect.left) / 2.0f;
            float f11 = rect.bottom - (rect.top / 2.0f);
            int i10 = this.f45754e;
            canvas.drawCircle(f10, f11 - (i10 * 1.5f), i10 / 2.0f, this.f45753d);
        }
    }

    public void setActiveColor(@ColorInt int i10) {
        a(i10);
        invalidate();
    }

    public void setAspectRatio(@NonNull AspectRatio aspectRatio) {
        this.f45756g = aspectRatio.c();
        this.f45757h = aspectRatio.d();
        float fE = aspectRatio.e();
        this.f45758i = fE;
        float f10 = this.f45757h;
        if (f10 != 0.0f && fE != 0.0f) {
            this.f45755f = f10 / fE;
        } else {
            this.f45755f = 0.0f;
        }
        d();
    }
}
