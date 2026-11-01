package io.bidmachine.iab.vast.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabElement;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.Utils;

/* JADX INFO: loaded from: classes10.dex */
public class CircleCountdownView extends View implements IabElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f59699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f59700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f59701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f59702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f59703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f59704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f59705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f59706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f59707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f59708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f59709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f59710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Paint f59711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Paint f59712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Rect f59713o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RectF f59714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Paint f59715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f59716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f59717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f59718t;

    public CircleCountdownView(@NonNull Context context) {
        super(context);
        this.f59701c = Assets.MAIN_ASSETS_COLOR;
        this.f59702d = Assets.BACKGROUND_COLOR;
        this.f59703e = false;
        this.f59704f = 0.0f;
        this.f59705g = 0.071428575f;
        this.f59706h = new RectF();
        this.f59707i = new RectF();
        this.f59708j = 54.0f;
        this.f59709k = 54.0f;
        this.f59710l = 5.0f;
        this.f59717s = 100.0f;
        a(context);
    }

    private void a() {
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float f10 = fMin / 2.0f;
        float width = (getWidth() / 2.0f) - f10;
        float height = (getHeight() / 2.0f) - f10;
        this.f59706h.set(width, height, width + fMin, fMin + height);
        this.f59708j = this.f59706h.centerX();
        this.f59709k = this.f59706h.centerY();
        RectF rectF = this.f59707i;
        RectF rectF2 = this.f59706h;
        float f11 = rectF2.left;
        float f12 = this.f59710l / 2.0f;
        rectF.set(f11 + f12, rectF2.top + f12, rectF2.right - f12, rectF2.bottom - f12);
    }

    private void b(Canvas canvas) {
        if (this.f59712n == null) {
            Paint paint = new Paint(1);
            this.f59712n = paint;
            paint.setAntiAlias(true);
            this.f59712n.setStyle(Paint.Style.FILL);
            this.f59712n.setTextAlign(Paint.Align.CENTER);
        }
        String strValueOf = String.valueOf(this.f59718t);
        this.f59712n.setColor(this.f59701c);
        this.f59712n.setTypeface(Typeface.create(Typeface.DEFAULT, this.f59700b));
        this.f59712n.setTextSize(a(this.f59705g, true));
        canvas.drawText(strValueOf, this.f59708j, this.f59709k - ((this.f59712n.descent() + this.f59712n.ascent()) / 2.0f), this.f59712n);
    }

    public void changePercentage(float f10, int i10) {
        if (this.f59699a == null || f10 == 100.0f) {
            this.f59717s = f10;
            this.f59718t = i10;
            postInvalidate();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public int getAccentColor() {
        return this.f59701c;
    }

    public int getBackgroundColor() {
        return this.f59702d;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f59718t == 0 && this.f59699a == null) {
            return;
        }
        a(canvas);
        Bitmap bitmap = this.f59699a;
        if (bitmap != null) {
            a(canvas, bitmap);
        } else {
            b(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setColors(int i10, int i11) {
        this.f59701c = i10;
        this.f59702d = i11;
        a();
    }

    public void setImage(@Nullable Bitmap bitmap) {
        this.f59699a = bitmap;
        if (bitmap != null) {
            this.f59717s = 100.0f;
        }
        postInvalidate();
    }

    @Override // io.bidmachine.iab.utils.IabElement
    public void setStyle(@NonNull IabElementStyle iabElementStyle) {
        this.f59700b = iabElementStyle.getFontStyle().intValue();
        this.f59701c = iabElementStyle.getStrokeColor().intValue();
        this.f59702d = iabElementStyle.getFillColor().intValue();
        this.f59703e = iabElementStyle.isOutlined().booleanValue();
        this.f59710l = iabElementStyle.getStrokeWidth(getContext()).floatValue();
        setPadding(iabElementStyle.getPaddingLeft(getContext()).intValue(), iabElementStyle.getPaddingTop(getContext()).intValue(), iabElementStyle.getPaddingRight(getContext()).intValue(), iabElementStyle.getPaddingBottom(getContext()).intValue());
        setAlpha(iabElementStyle.getOpacity().floatValue());
        a();
        postInvalidate();
    }

    public CircleCountdownView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59701c = Assets.MAIN_ASSETS_COLOR;
        this.f59702d = Assets.BACKGROUND_COLOR;
        this.f59703e = false;
        this.f59704f = 0.0f;
        this.f59705g = 0.071428575f;
        this.f59706h = new RectF();
        this.f59707i = new RectF();
        this.f59708j = 54.0f;
        this.f59709k = 54.0f;
        this.f59710l = 5.0f;
        this.f59717s = 100.0f;
        a(context);
    }

    private void a(Canvas canvas, Bitmap bitmap) {
        if (this.f59715q == null) {
            Paint paint = new Paint(7);
            this.f59715q = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f59715q.setAntiAlias(true);
        }
        if (this.f59713o == null) {
            this.f59713o = new Rect();
        }
        if (this.f59714p == null) {
            this.f59714p = new RectF();
        }
        float fA = a(this.f59704f, this.f59703e);
        float f10 = fA / 2.0f;
        float f11 = this.f59708j - f10;
        float f12 = this.f59709k - f10;
        this.f59713o.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f59714p.set(f11, f12, f11 + fA, fA + f12);
        this.f59715q.setColorFilter(new PorterDuffColorFilter(this.f59701c, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, this.f59713o, this.f59714p, this.f59715q);
        if (this.f59703e) {
            if (this.f59716r == null) {
                Paint paint2 = new Paint(1);
                this.f59716r = paint2;
                paint2.setStyle(Paint.Style.STROKE);
            }
            this.f59716r.setStrokeWidth(this.f59710l);
            this.f59716r.setColor(this.f59701c);
            canvas.drawArc(this.f59707i, 0.0f, 360.0f, false, this.f59716r);
        }
    }

    private void a(Canvas canvas) {
        if (this.f59711m == null) {
            this.f59711m = new Paint(1);
        }
        float f10 = 360.0f - ((this.f59717s * 360.0f) * 0.01f);
        this.f59711m.setColor(this.f59702d);
        this.f59711m.setStyle(Paint.Style.FILL);
        canvas.drawArc(this.f59706h, 0.0f, 360.0f, false, this.f59711m);
        this.f59711m.setColor(this.f59701c);
        this.f59711m.setStyle(Paint.Style.STROKE);
        this.f59711m.setStrokeWidth(this.f59710l);
        canvas.drawArc(this.f59707i, 270.0f, f10, false, this.f59711m);
    }

    private float a(float f10, boolean z10) {
        float fWidth = this.f59706h.width();
        if (z10) {
            fWidth -= this.f59710l * 2.0f;
        }
        float fSqrt = (float) (((double) (fWidth / 2.0f)) * Math.sqrt(2.0d));
        return fSqrt - ((f10 * fSqrt) * 2.0f);
    }

    private void a(Context context) {
        setLayerType(1, null);
        this.f59710l = Utils.dpToPx(context, 3.0f);
    }
}
