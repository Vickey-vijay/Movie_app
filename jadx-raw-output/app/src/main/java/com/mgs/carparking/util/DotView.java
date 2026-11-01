package com.mgs.carparking.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.fvvcl.flickverse.R;

/* JADX INFO: loaded from: classes2.dex */
public class DotView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f42213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f42215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f42216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f42219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f42220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42222k;

    public DotView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context);
    }

    public void b(int i10, int i11) {
        this.f42217f = i10;
        this.f42218g = i11;
        this.f42219h = this.f42214c - ((((i11 - 1) * this.f42216e) + (i11 * this.f42215d)) + 70.0f);
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i10 = 0; i10 < this.f42218g; i10++) {
            if (this.f42217f == i10) {
                this.f42220i.setColor(this.f42221j);
            } else {
                this.f42220i.setColor(this.f42222k);
            }
            int i11 = this.f42217f;
            if (i11 == i10) {
                float f10 = this.f42219h;
                float f11 = i10;
                float f12 = this.f42216e;
                float f13 = this.f42215d;
                canvas.drawRect((f11 * f12) + f10 + (f11 * f13), 0.0f, f10 + (f12 * f11) + (f11 * f13) + (2.0f * f13), f13 + 0.0f, this.f42220i);
            } else if (i11 > i10) {
                float f14 = this.f42219h;
                float f15 = i10;
                float f16 = this.f42216e;
                float f17 = this.f42215d;
                canvas.drawRect((f15 * f16) + f14 + (f15 * f17), 0.0f, f14 + (f16 * f15) + (f15 * f17) + f17, f17 + 0.0f, this.f42220i);
            } else if (i11 < i10) {
                float f18 = this.f42219h;
                float f19 = i10;
                float f20 = this.f42216e;
                float f21 = this.f42215d;
                canvas.drawRect((f19 * f20) + f18 + (f19 * f21) + f21, 0.0f, f18 + (f20 * f19) + (f19 * f21) + (2.0f * f21), f21 + 0.0f, this.f42220i);
            }
        }
    }

    public DotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(Context context) {
        this.f42214c = getResources().getDisplayMetrics().widthPixels;
        float f10 = getResources().getDisplayMetrics().density;
        this.f42213b = f10;
        this.f42215d = 10.0f;
        this.f42216e = f10 * 5.0f;
        this.f42220i = new Paint();
        this.f42221j = getResources().getColor(R.color.color_commen);
        this.f42222k = getResources().getColor(R.color.color_e7e7e7);
    }
}
