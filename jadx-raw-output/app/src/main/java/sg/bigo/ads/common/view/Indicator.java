package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes.dex */
public class Indicator extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f70076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f70077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f70078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f70079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f70080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f70081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f70082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f70083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f70084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f70085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f70086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f70087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f70088m;

    public Indicator(Context context) {
        this(context, null);
    }

    public Indicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Indicator(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f70077b = 0;
        this.f70082g = -2130706433;
        float fA = e.a(getContext(), 2);
        this.f70081f = fA;
        this.f70084i = -1;
        this.f70083h = 8.0f * fA;
        this.f70085j = fA * 2.0f;
        this.f70080e = 0;
        this.f70086k = 0.0f;
        this.f70087l = 0;
    }

    public static float a(int i10, float f10, float f11, float f12) {
        float f13 = i10 - 1;
        return (f11 * 2.0f * f13) + (f10 * f13) + f12;
    }

    private void a() {
        Paint paint = new Paint();
        this.f70078c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f70078c.setColor(this.f70082g);
        this.f70078c.setAntiAlias(true);
        this.f70078c.setStrokeWidth(3.0f);
        Paint paint2 = new Paint(this.f70078c);
        this.f70079d = paint2;
        paint2.setColor(this.f70084i);
    }

    private void a(Canvas canvas) {
        float f10;
        if (this.f70080e <= 0) {
            return;
        }
        canvas.translate(((((canvas.getWidth() - getPaddingLeft()) - getPaddingRight()) - a(this.f70080e, this.f70085j, this.f70081f, this.f70083h)) / 2.0f) + getPaddingLeft() + this.f70081f, (((canvas.getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) + getPaddingTop());
        a();
        float f11 = -this.f70081f;
        for (int i10 = 0; i10 < this.f70080e; i10++) {
            if (i10 == this.f70087l) {
                float f12 = this.f70081f;
                canvas.drawCircle(f11 + f12, 0.0f, f12, this.f70078c);
                float f13 = this.f70083h + f11;
                float f14 = this.f70081f;
                canvas.drawCircle(f13 - f14, 0.0f, f14, this.f70078c);
                float f15 = (this.f70085j * this.f70086k) + f11;
                float f16 = this.f70081f;
                RectF rectF = new RectF(f15, -f16, this.f70083h + f15, f16);
                float f17 = this.f70081f;
                canvas.drawRoundRect(rectF, f17, f17, this.f70079d);
                f10 = this.f70083h;
            } else {
                float f18 = this.f70081f;
                canvas.drawCircle(f11 + f18, 0.0f, f18, this.f70078c);
                f10 = this.f70081f * 2.0f;
            }
            f11 = f11 + f10 + this.f70085j;
        }
    }

    public final void a(float f10, int i10) {
        if (i10 == this.f70087l) {
            this.f70086k = (-f10) * 2.0f;
            invalidate();
        }
    }

    public final void a(int i10) {
        if (this.f70087l != i10) {
            this.f70087l = i10;
            this.f70086k = 0.0f;
            invalidate();
        }
    }

    public float getDistance() {
        return this.f70085j;
    }

    public float getLengthSelected() {
        return this.f70083h;
    }

    public float getRadius() {
        return this.f70081f;
    }

    public int getType() {
        return this.f70077b;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f70077b != 1) {
            a(canvas);
            return;
        }
        if (this.f70088m > 0.0f) {
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            float f10 = this.f70088m;
            canvas.translate(((width - f10) / 2.0f) + this.f70081f, height / 2.0f);
            a();
            float f11 = this.f70081f;
            RectF rectF = new RectF(0.0f, -f11, f10, f11);
            float f12 = this.f70081f;
            canvas.drawRoundRect(rectF, f12, f12, this.f70078c);
            float f13 = (f10 - this.f70083h) * this.f70076a;
            float f14 = this.f70081f;
            RectF rectF2 = new RectF(f13, -f14, this.f70083h + f13, f14);
            float f15 = this.f70081f;
            canvas.drawRoundRect(rectF2, f15, f15, this.f70079d);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        float f10 = this.f70081f * 2.0f;
        int i12 = this.f70080e;
        float paddingLeft = (f10 * (i12 - 1)) + (this.f70085j * (i12 - 1)) + this.f70083h + getPaddingLeft() + getPaddingRight();
        float paddingTop = (this.f70081f * 2.0f) + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension((int) paddingLeft, (int) paddingTop);
            return;
        }
        if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension((int) paddingLeft, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, (int) paddingTop);
        } else {
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
        }
    }

    public void setColor(int i10) {
        if (this.f70082g != i10) {
            this.f70082g = i10;
            invalidate();
        }
    }

    public void setColorSelected(int i10) {
        if (this.f70084i != i10) {
            this.f70084i = i10;
            invalidate();
        }
    }

    public void setLineLength(float f10) {
        if (this.f70088m != f10) {
            this.f70088m = f10;
            requestLayout();
            invalidate();
        }
    }

    public void setNum(int i10) {
        if (this.f70080e != i10) {
            sg.bigo.ads.common.t.a.a("Indicator", "onMeasure, setNum=".concat(String.valueOf(i10)));
            this.f70080e = i10;
            requestLayout();
            invalidate();
        }
    }

    public void setRadius(float f10) {
        if (f10 != this.f70081f) {
            this.f70081f = f10;
            this.f70083h = 8.0f * f10;
            this.f70085j = f10 * 2.0f;
            requestLayout();
            invalidate();
        }
    }

    public void setType(int i10) {
        if (this.f70077b != i10) {
            this.f70077b = i10;
            invalidate();
        }
    }
}
