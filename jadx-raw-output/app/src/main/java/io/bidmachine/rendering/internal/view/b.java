package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.internal.i;
import io.bidmachine.rendering.internal.n;
import io.bidmachine.rendering.model.AppearanceParams;
import io.bidmachine.rendering.model.FontStyleType;
import io.bidmachine.rendering.utils.UiUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public class b extends View implements io.bidmachine.rendering.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f60597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f60598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f60599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f60600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f60601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f60602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f60603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f60604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f60605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f60606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f60607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f60608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f60609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f60610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte f60611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f60612p;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.view.b$b, reason: collision with other inner class name */
    public class C0538b implements n {
        private C0538b() {
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public void onRun() {
            boolean z10 = !b.this.c() || b.this.isShown();
            c cVar = b.this.f60602f;
            if (z10) {
                cVar.j();
            } else {
                cVar.i();
            }
            long jB = b.this.f60602f.b();
            long jC = b.this.f60602f.c();
            if (z10) {
                b.this.a((jC * 100.0f) / jB, (int) Math.ceil((jB - jC) / 1000.0d));
            }
            if (b.this.f60602f.e()) {
                b.this.d();
            } else {
                UiUtils.onUiThread(this, 16L);
            }
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f60614a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f60615b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f60616c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f60617d = 0;

        public long a() {
            return SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.f60615b;
        }

        public long c() {
            return this.f60616c;
        }

        public boolean d() {
            return this.f60614a;
        }

        public boolean e() {
            return this.f60616c >= this.f60615b;
        }

        public void f() {
            this.f60614a = false;
        }

        public void g() {
            this.f60616c = 0L;
            this.f60617d = a();
        }

        public void h() {
            this.f60614a = true;
            this.f60617d = a();
        }

        public void i() {
            this.f60617d = a();
        }

        public void j() {
            if (d()) {
                long jA = a();
                this.f60616c = Math.min(this.f60615b, this.f60616c + (jA - this.f60617d));
                this.f60617d = jA;
            }
        }

        public void a(long j10) {
            this.f60615b = j10;
            g();
        }
    }

    public interface d {
        void a();
    }

    public b(Context context) {
        super(context);
        this.f60600d = new RectF();
        this.f60601e = new RectF();
        this.f60602f = new c();
        this.f60603g = new AtomicBoolean(false);
        this.f60609m = 100.0f;
        this.f60611o = (byte) -1;
        this.f60612p = false;
        Paint paint = new Paint(1);
        this.f60597a = paint;
        paint.setColor(i.f60429d);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f60598b = paint2;
        int i10 = i.f60428c;
        paint2.setColor(i10);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(1);
        this.f60599c = paint3;
        paint3.setColor(i10);
        paint3.setStyle(style);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        d dVar;
        if (this.f60603g.compareAndSet(false, true) && (dVar = this.f60604h) != null) {
            dVar.a();
        }
    }

    public boolean c() {
        return this.f60612p;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public void e() {
        g();
        if (this.f60603g.get()) {
            return;
        }
        this.f60602f.h();
        C0538b c0538b = new C0538b();
        this.f60605i = c0538b;
        UiUtils.onUiThread(c0538b, 16L);
    }

    public void f() {
        this.f60603g.set(false);
        this.f60602f.g();
        e();
    }

    public void g() {
        this.f60602f.f();
        Runnable runnable = this.f60605i;
        if (runnable == null) {
            return;
        }
        UiUtils.cancelOnUiThread(runnable);
        this.f60605i = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0 || this.f60610n == 0) {
            return;
        }
        a(canvas);
        b(canvas);
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

    public void setClockwise(boolean z10) {
        this.f60611o = z10 ? (byte) -1 : (byte) 1;
    }

    public void setDuration(long j10) {
        this.f60602f.a(j10);
    }

    public void setListener(@Nullable d dVar) {
        this.f60604h = dVar;
    }

    public void setOnlyVisibleWork(boolean z10) {
        this.f60612p = z10;
    }

    @Override // io.bidmachine.rendering.internal.e
    public void a(AppearanceParams appearanceParams) {
        FontStyleType fontStyleType = appearanceParams.getFontStyleType();
        if (fontStyleType != null) {
            this.f60599c.setTypeface(Typeface.create(Typeface.DEFAULT, fontStyleType.getTypeface()));
        }
        Integer fillColor = appearanceParams.getFillColor();
        if (fillColor != null) {
            this.f60597a.setColor(fillColor.intValue());
        }
        Integer strokeWidthPx = appearanceParams.getStrokeWidthPx(getContext());
        if (strokeWidthPx != null) {
            float fIntValue = strokeWidthPx.intValue();
            this.f60608l = fIntValue;
            this.f60598b.setStrokeWidth(fIntValue);
        }
        Integer strokeColor = appearanceParams.getStrokeColor();
        if (strokeColor != null) {
            this.f60598b.setColor(strokeColor.intValue());
        }
        a();
    }

    public void b() {
        g();
        this.f60604h = null;
    }

    private void b(Canvas canvas) {
        canvas.drawText(String.valueOf(this.f60610n), this.f60606j, this.f60607k - ((this.f60599c.descent() + this.f60599c.ascent()) / 2.0f), this.f60599c);
    }

    public void a(float f10, int i10) {
        if (f10 >= 0.0f || f10 <= 100.0f) {
            this.f60609m = f10;
        }
        this.f60610n = i10;
        postInvalidate();
    }

    public void a() {
        int iMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float width = (getWidth() - iMin) / 2.0f;
        float height = (getHeight() - iMin) / 2.0f;
        float f10 = iMin;
        this.f60600d.set(width, height, width + f10, f10 + height);
        this.f60606j = this.f60600d.centerX();
        this.f60607k = this.f60600d.centerY();
        float f11 = this.f60608l / 2.0f;
        RectF rectF = this.f60601e;
        RectF rectF2 = this.f60600d;
        rectF.set(rectF2.left + f11, rectF2.top + f11, rectF2.right - f11, rectF2.bottom - f11);
        this.f60599c.setTextSize(a(this.f60600d, true));
    }

    private void a(Canvas canvas) {
        float f10 = this.f60611o * (360.0f - ((this.f60609m * 360.0f) * 0.01f));
        canvas.drawArc(this.f60600d, 0.0f, 360.0f, false, this.f60597a);
        canvas.drawArc(this.f60601e, 270.0f, f10, false, this.f60598b);
    }

    public float a(RectF rectF, boolean z10) {
        float fWidth = rectF.width();
        if (z10) {
            fWidth -= this.f60608l * 2.0f;
        }
        return fWidth * 0.70710677f * 0.9f;
    }

    private void a(Context context) {
        setLayerType(1, null);
        this.f60606j = UiUtils.dpToPx(context, 54.0f);
        this.f60607k = UiUtils.dpToPx(context, 54.0f);
        float fDpToPx = UiUtils.dpToPx(context, 3.0f);
        this.f60608l = fDpToPx;
        this.f60598b.setStrokeWidth(fDpToPx);
        a();
    }
}
