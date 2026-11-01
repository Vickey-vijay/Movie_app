package com.scwang.smart.refresh.footer;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import cc.c;
import cc.f;
import com.scwang.smart.refresh.footer.ball.R$styleable;
import fc.b;

/* JADX INFO: loaded from: classes7.dex */
public class BallPulseFooter extends b implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f45052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f45055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f45056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TimeInterpolator f45058m;

    public BallPulseFooter(Context context) {
        this(context, null);
    }

    @Override // fc.b, cc.a
    public int k(@NonNull f fVar, boolean z10) {
        this.f45057l = false;
        this.f45056k = 0L;
        this.f45052g.setColor(this.f45053h);
        return 0;
    }

    public BallPulseFooter(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f45053h = -1118482;
        this.f45054i = -1615546;
        this.f45056k = 0L;
        this.f45057l = false;
        this.f45058m = new AccelerateDecelerateInterpolator();
        setMinimumHeight(gc.b.c(60.0f));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BallPulseFooter);
        Paint paint = new Paint();
        this.f45052g = paint;
        paint.setColor(-1);
        this.f45052g.setStyle(Paint.Style.FILL);
        this.f45052g.setAntiAlias(true);
        dc.b bVar = dc.b.f51929d;
        this.f52940c = bVar;
        this.f52940c = dc.b.f51934i[typedArrayObtainStyledAttributes.getInt(R$styleable.BallPulseFooter_srlClassicsSpinnerStyle, bVar.f51935a)];
        int i10 = R$styleable.BallPulseFooter_srlNormalColor;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            s(typedArrayObtainStyledAttributes.getColor(i10, 0));
        }
        int i11 = R$styleable.BallPulseFooter_srlAnimatingColor;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            r(typedArrayObtainStyledAttributes.getColor(i11, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f45055j = gc.b.c(4.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float fMin = Math.min(width, height);
        float f10 = this.f45055j;
        float f11 = (fMin - (f10 * 2.0f)) / 6.0f;
        float f12 = f11 * 2.0f;
        float f13 = (width / 2.0f) - (f10 + f12);
        float f14 = height / 2.0f;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (i10 < 3) {
            int i11 = i10 + 1;
            long j10 = (jCurrentTimeMillis - this.f45056k) - ((long) (i11 * 120));
            float interpolation = this.f45058m.getInterpolation(j10 > 0 ? (j10 % 750) / 750.0f : 0.0f);
            canvas.save();
            float f15 = i10;
            canvas.translate((f12 * f15) + f13 + (this.f45055j * f15), f14);
            if (interpolation < 0.5d) {
                float f16 = 1.0f - ((interpolation * 2.0f) * 0.7f);
                canvas.scale(f16, f16);
            } else {
                float f17 = ((interpolation * 2.0f) * 0.7f) - 0.4f;
                canvas.scale(f17, f17);
            }
            canvas.drawCircle(0.0f, 0.0f, f11, this.f45052g);
            canvas.restore();
            i10 = i11;
        }
        super.dispatchDraw(canvas);
        if (this.f45057l) {
            invalidate();
        }
    }

    @Override // fc.b, cc.a
    public void n(@NonNull f fVar, int i10, int i11) {
        if (this.f45057l) {
            return;
        }
        invalidate();
        this.f45057l = true;
        this.f45056k = System.currentTimeMillis();
        this.f45052g.setColor(this.f45054i);
    }

    public BallPulseFooter r(@ColorInt int i10) {
        this.f45054i = i10;
        this.f45051f = true;
        if (this.f45057l) {
            this.f45052g.setColor(i10);
        }
        return this;
    }

    public BallPulseFooter s(@ColorInt int i10) {
        this.f45053h = i10;
        this.f45050e = true;
        if (!this.f45057l) {
            this.f45052g.setColor(i10);
        }
        return this;
    }

    @Override // fc.b, cc.a
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (!this.f45051f && iArr.length > 1) {
            r(iArr[0]);
            this.f45051f = false;
        }
        if (this.f45050e) {
            return;
        }
        if (iArr.length > 1) {
            s(iArr[1]);
        } else if (iArr.length > 0) {
            s(ColorUtils.compositeColors(-1711276033, iArr[0]));
        }
        this.f45050e = false;
    }
}
