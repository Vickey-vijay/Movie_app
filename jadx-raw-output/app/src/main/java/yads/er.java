package yads;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: loaded from: classes11.dex */
public final class er extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f77174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f77175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f77176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f77177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f77178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f77179f;

    public final void a() {
        this.f77177d.setColor(kl3.a(SupportMenu.CATEGORY_MASK, this.f77179f));
        this.f77176c.setColor(kl3.a(-1, this.f77179f));
        this.f77178e.setColor(kl3.a(SupportMenu.CATEGORY_MASK, this.f77179f));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) this.f77174a;
        setMeasuredDimension(i12, i12);
    }

    public er(Context context, og0 og0Var) {
        super(context);
        og0Var.getClass();
        this.f77174a = og0.a(context, 34.0f);
        float fA = og0.a(context, 3.0f);
        this.f77175b = fA;
        float fA2 = og0.a(context, 20.0f);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f77176c = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fA);
        paint2.setAntiAlias(true);
        this.f77177d = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setTextSize(fA2);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.f77178e = paint3;
        this.f77179f = 40.0f;
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f10 = 2;
        float f11 = this.f77174a / f10;
        canvas.drawCircle(f11, f11, f11, this.f77176c);
        canvas.drawCircle(f11, f11, f11 - (this.f77175b / f10), this.f77177d);
        float f12 = this.f77174a / f10;
        canvas.drawText("!", f12, f12 - ((this.f77178e.ascent() + this.f77178e.descent()) / f10), this.f77178e);
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        float f10;
        super.setSelected(z10);
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f77179f = f10;
        a();
        invalidate();
    }
}
