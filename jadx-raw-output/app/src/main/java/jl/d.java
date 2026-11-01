package jl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: compiled from: DrawHelper.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Paint f61902a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Paint f61903b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static RectF f61904c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f61905d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f61906e = true;

    static {
        Paint paint = new Paint();
        f61902a = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        f61902a.setColor(0);
        f61904c = new RectF();
    }

    public static void a(Canvas canvas) {
        if (!f61905d) {
            f61904c.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            c(canvas, f61904c);
        } else if (f61906e) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } else {
            canvas.drawColor(0);
        }
    }

    public static void b(Canvas canvas, float f10, float f11, float f12, float f13) {
        f61904c.set(f10, f11, f12, f13);
        c(canvas, f61904c);
    }

    public static void d(Canvas canvas, String str) {
        if (f61903b == null) {
            Paint paint = new Paint();
            f61903b = paint;
            paint.setColor(SupportMenu.CATEGORY_MASK);
            f61903b.setTextSize(30.0f);
        }
        int height = canvas.getHeight() - 50;
        b(canvas, 10.0f, height - 50, (int) (f61903b.measureText(str) + 20.0f), canvas.getHeight());
        canvas.drawText(str, 10.0f, height, f61903b);
    }

    public static void e(boolean z10, boolean z11) {
        f61905d = z10;
        f61906e = z11;
    }

    public static void c(Canvas canvas, RectF rectF) {
        if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
            canvas.drawRect(rectF, f61902a);
        }
    }
}
