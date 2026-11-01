package com.mgs.carparking.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.mgs.carparking.R$styleable;

/* JADX INFO: loaded from: classes11.dex */
public class CircularImageView extends ImageView {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f42274u = CircularImageView.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f42281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f42282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f42283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f42284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f42285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public BitmapShader f42286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f42287n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Paint f42288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Paint f42289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Paint f42290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorFilter f42291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f42292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap f42293t;

    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Bitmap a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            Log.i(f42274u, "Bitmap drawable!");
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            } catch (OutOfMemoryError unused) {
                Log.e(f42274u, "Encountered OutOfMemoryError while generating bitmap!");
            }
        }
        return null;
    }

    public void setIconModeEnabled(boolean z10) {
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42293t = null;
        b(context, attributeSet, i10);
        this.f42292s = context;
    }

    public final void b(Context context, AttributeSet attributeSet, int i10) {
        Paint paint = new Paint();
        this.f42288o = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f42289p = paint2;
        paint2.setAntiAlias(true);
        this.f42289p.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.f42290q = paint3;
        paint3.setAntiAlias(true);
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircularImageView, i10, 0);
        this.f42275b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f42276c = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.f42281h = typedArrayObtainStyledAttributes.getBoolean(7, false);
        if (this.f42275b) {
            setBorderWidth(typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f)));
            setBorderColor(typedArrayObtainStyledAttributes.getColor(1, -1));
        }
        if (this.f42276c) {
            int i11 = (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f);
            setSelectorColor(typedArrayObtainStyledAttributes.getColor(4, 0));
            setSelectorStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, i11));
            setSelectorStrokeColor(typedArrayObtainStyledAttributes.getColor(5, -16776961));
        }
        if (this.f42281h) {
            this.f42282i = typedArrayObtainStyledAttributes.getFloat(11, 4.0f);
            this.f42283j = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            this.f42284k = typedArrayObtainStyledAttributes.getFloat(10, 2.0f);
            this.f42285l = typedArrayObtainStyledAttributes.getColor(8, ViewCompat.MEASURED_STATE_MASK);
            setShadowEnabled(true);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void e() {
        if (this.f42287n == null) {
            return;
        }
        Bitmap bitmap = this.f42287n;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f42286m = new BitmapShader(bitmap, tileMode, tileMode);
        if (this.f42279f == this.f42287n.getWidth() && this.f42279f == this.f42287n.getHeight()) {
            return;
        }
        Matrix matrix = new Matrix();
        float width = this.f42279f / this.f42287n.getWidth();
        matrix.setScale(width, width);
        this.f42286m.setLocalMatrix(matrix);
    }

    public final void f() {
        float f10 = this.f42281h ? this.f42282i : 0.0f;
        this.f42289p.setShadowLayer(f10, this.f42283j, this.f42284k, this.f42285l);
        this.f42290q.setShadowLayer(f10, this.f42283j, this.f42284k, this.f42285l);
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.f42277d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        Bitmap bitmap = this.f42287n;
        if (bitmap == null || bitmap.getHeight() == 0 || this.f42287n.getWidth() == 0) {
            return;
        }
        int i13 = this.f42279f;
        int width = getWidth() < getHeight() ? getWidth() : getHeight();
        this.f42279f = width;
        if (i13 != width) {
            e();
        }
        this.f42288o.setShader(this.f42286m);
        int i14 = this.f42279f;
        int i15 = i14 / 2;
        if (!this.f42276c || !this.f42277d) {
            if (this.f42275b) {
                i11 = this.f42278e;
                i12 = (i14 - (i11 * 2)) / 2;
                this.f42288o.setColorFilter(null);
                int i16 = i11 / 2;
                float f10 = i16 + 0;
                int i17 = this.f42279f;
                canvas.drawArc(new RectF(f10, f10, i17 - i16, i17 - i16), 360.0f, 360.0f, false, this.f42289p);
            } else {
                this.f42288o.setColorFilter(null);
                i10 = 0;
            }
            float f11 = i15 + i10;
            canvas.drawCircle(f11, f11, (this.f42279f - (i10 * 2)) / 2, this.f42288o);
        }
        i11 = this.f42280g;
        int i18 = i11 * 2;
        i12 = (i14 - i18) / 2;
        this.f42288o.setColorFilter(this.f42291r);
        float f12 = i12 + i11;
        canvas.drawCircle(f12, f12, (((this.f42279f - i18) / 2) + i11) - 4.0f, this.f42290q);
        int i19 = i11;
        i15 = i12;
        i10 = i19;
        float f13 = i15 + i10;
        canvas.drawCircle(f13, f13, (this.f42279f - (i10 * 2)) / 2, this.f42288o);
    }

    public void setBorderColor(int i10) {
        Paint paint = this.f42289p;
        if (paint != null) {
            paint.setColor(i10);
        }
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.f42278e = i10;
        Paint paint = this.f42289p;
        if (paint != null) {
            paint.setStrokeWidth(i10);
        }
        requestLayout();
        invalidate();
    }

    public void setSelectorColor(int i10) {
        this.f42291r = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
        invalidate();
    }

    public void setSelectorStrokeColor(int i10) {
        Paint paint = this.f42290q;
        if (paint != null) {
            paint.setColor(i10);
        }
        invalidate();
    }

    public void setSelectorStrokeWidth(int i10) {
        this.f42280g = i10;
        requestLayout();
        invalidate();
    }

    public void setShadowEnabled(boolean z10) {
        this.f42281h = z10;
        f();
    }

    public final int c(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            size = this.f42279f;
        }
        return size + 2;
    }

    public final int d(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            return this.f42279f;
        }
        return size;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            this.f42277d = false;
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3 || action == 4 || action == 8) {
                this.f42277d = false;
            }
        } else {
            this.f42277d = true;
        }
        invalidate();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(d(i10), c(i11));
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f42287n = bitmap;
        if (this.f42279f > 0) {
            e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f42287n = a(getDrawable());
        if (this.f42279f > 0) {
            e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.f42287n = a(getDrawable());
        if (this.f42279f > 0) {
            e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f42287n = a(getDrawable());
        if (this.f42279f > 0) {
            e();
        }
    }
}
