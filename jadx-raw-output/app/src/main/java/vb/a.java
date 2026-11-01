package vb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: ClipHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f73144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PorterDuffXfermode f73145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuffXfermode f73146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Path f73147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f73148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f73149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f73150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f73151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f73152i;

    public void g() {
        this.f73150g = true;
        d().postInvalidate();
    }

    public final void a(int i10, int i11) {
        this.f73148e.reset();
        this.f73148e.addRect(0.0f, 0.0f, d().getWidth() * 1.0f, d().getHeight() * 1.0f, Path.Direction.CW);
        if (i10 > 0 && i11 > 0) {
            this.f73149f.c(i10, i11);
            this.f73147d.reset();
            this.f73147d.set(this.f73149f.a());
            if (Build.VERSION.SDK_INT > 27) {
                this.f73148e.op(this.f73147d, Path.Op.DIFFERENCE);
            }
            if (ViewCompat.getElevation(d()) > 0.0f) {
                try {
                    d().setOutlineProvider(d().getOutlineProvider());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        d().postInvalidate();
    }

    public View d() {
        return this.f73151h;
    }

    public void e(View view, boolean z10, b.a aVar) {
        this.f73151h = view;
        this.f73152i = z10;
        if (b()) {
            d().setDrawingCacheEnabled(true);
            d().setWillNotDraw(false);
            if (Build.VERSION.SDK_INT <= 27) {
                this.f73144a.setXfermode(this.f73146c);
                d().setLayerType(1, this.f73144a);
            } else {
                this.f73144a.setXfermode(this.f73145b);
                d().setLayerType(1, null);
            }
            this.f73149f.b(aVar);
            g();
        }
    }

    public a() {
        Paint paint = new Paint(1);
        this.f73144a = paint;
        this.f73145b = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f73146c = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        this.f73147d = new Path();
        this.f73148e = new Path();
        this.f73149f = new b();
        this.f73150g = true;
        paint.setAntiAlias(true);
        paint.setColor(-16776961);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
    }

    public boolean b() {
        if (d() != null && (d() instanceof ViewGroup) && this.f73152i) {
            return true;
        }
        return false;
    }

    public void c(Canvas canvas) {
        if (!b()) {
            return;
        }
        if (this.f73150g) {
            a(canvas.getWidth(), canvas.getHeight());
            this.f73150g = false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 27) {
            canvas.drawPath(this.f73147d, this.f73144a);
        } else {
            canvas.drawPath(this.f73148e, this.f73144a);
        }
        if (i10 <= 27) {
            d().setLayerType(2, null);
        }
    }

    public void f(boolean z10, int i10, int i11, int i12, int i13) {
        if (b() && z10) {
            g();
        }
    }
}
