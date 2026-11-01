package ll;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.lang.reflect.Array;
import tv.cjump.jni.NativeBitmapFactory;

/* JADX INFO: compiled from: DrawingCacheHolder.java */
/* JADX INFO: loaded from: classes8.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f63711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f63712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap[][] f63713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f63714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f63717g;

    public void a(int i10, int i11, int i12, boolean z10, int i13) {
        Bitmap bitmap;
        boolean z11 = true;
        if (!z10 ? i10 > this.f63715e || i11 > this.f63716f : i10 != this.f63715e || i11 != this.f63716f) {
            z11 = false;
        }
        if (z11 && (bitmap = this.f63712b) != null) {
            bitmap.eraseColor(0);
            this.f63711a.setBitmap(this.f63712b);
            d();
            return;
        }
        if (this.f63712b != null) {
            c();
        }
        this.f63715e = i10;
        this.f63716f = i11;
        Bitmap.Config config = Bitmap.Config.ARGB_4444;
        if (i13 == 32) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapA = NativeBitmapFactory.a(i10, i11, config);
        this.f63712b = bitmapA;
        if (i12 > 0) {
            this.f63717g = i12;
            bitmapA.setDensity(i12);
        }
        Canvas canvas = this.f63711a;
        if (canvas != null) {
            canvas.setBitmap(this.f63712b);
            return;
        }
        Canvas canvas2 = new Canvas(this.f63712b);
        this.f63711a = canvas2;
        canvas2.setDensity(i12);
    }

    public final synchronized boolean b(Canvas canvas, float f10, float f11, Paint paint) {
        if (this.f63713c == null) {
            Bitmap bitmap = this.f63712b;
            if (bitmap == null) {
                return false;
            }
            canvas.drawBitmap(bitmap, f10, f11, paint);
            return true;
        }
        for (int i10 = 0; i10 < this.f63713c.length; i10++) {
            int i11 = 0;
            while (true) {
                Bitmap[] bitmapArr = this.f63713c[i10];
                if (i11 < bitmapArr.length) {
                    Bitmap bitmap2 = bitmapArr[i11];
                    if (bitmap2 != null) {
                        float width = (bitmap2.getWidth() * i11) + f10;
                        if (width <= canvas.getWidth() && bitmap2.getWidth() + width >= 0.0f) {
                            float height = (bitmap2.getHeight() * i10) + f11;
                            if (height <= canvas.getHeight() && bitmap2.getHeight() + height >= 0.0f) {
                                canvas.drawBitmap(bitmap2, width, height, paint);
                            }
                        }
                    }
                    i11++;
                }
            }
        }
        return true;
    }

    public synchronized void c() {
        Bitmap bitmap = this.f63712b;
        this.f63712b = null;
        this.f63716f = 0;
        this.f63715e = 0;
        if (bitmap != null) {
            bitmap.recycle();
        }
        d();
        this.f63714d = null;
    }

    public final void d() {
        Bitmap[][] bitmapArr = this.f63713c;
        this.f63713c = null;
        if (bitmapArr != null) {
            for (int i10 = 0; i10 < bitmapArr.length; i10++) {
                int i11 = 0;
                while (true) {
                    Bitmap[] bitmapArr2 = bitmapArr[i10];
                    if (i11 < bitmapArr2.length) {
                        Bitmap bitmap = bitmapArr2[i11];
                        if (bitmap != null) {
                            bitmap.recycle();
                            bitmapArr[i10][i11] = null;
                        }
                        i11++;
                    }
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void e(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        d();
        int i17 = this.f63715e;
        if (i17 > 0 && (i14 = this.f63716f) > 0 && this.f63712b != null) {
            if (i17 <= i12 && i14 <= i13) {
                return;
            }
            int iMin = Math.min(i12, i10);
            int iMin2 = Math.min(i13, i11);
            int i18 = this.f63715e;
            int i19 = i18 / iMin;
            if (i18 % iMin == 0) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            int i20 = i19 + i15;
            int i21 = this.f63716f;
            int i22 = i21 / iMin2;
            if (i21 % iMin2 == 0) {
                i16 = 0;
            } else {
                i16 = 1;
            }
            int i23 = i22 + i16;
            int i24 = i18 / i20;
            int i25 = i21 / i23;
            Bitmap[][] bitmapArr = (Bitmap[][]) Array.newInstance((Class<?>) Bitmap.class, i23, i20);
            if (this.f63711a == null) {
                Canvas canvas = new Canvas();
                this.f63711a = canvas;
                int i26 = this.f63717g;
                if (i26 > 0) {
                    canvas.setDensity(i26);
                }
            }
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            for (int i27 = 0; i27 < i23; i27++) {
                for (int i28 = 0; i28 < i20; i28++) {
                    Bitmap[] bitmapArr2 = bitmapArr[i27];
                    Bitmap bitmapA = NativeBitmapFactory.a(i24, i25, Bitmap.Config.ARGB_8888);
                    bitmapArr2[i28] = bitmapA;
                    int i29 = this.f63717g;
                    if (i29 > 0) {
                        bitmapA.setDensity(i29);
                    }
                    this.f63711a.setBitmap(bitmapA);
                    int i30 = i28 * i24;
                    int i31 = i27 * i25;
                    rect.set(i30, i31, i30 + i24, i31 + i25);
                    rect2.set(0, 0, bitmapA.getWidth(), bitmapA.getHeight());
                    this.f63711a.drawBitmap(this.f63712b, rect, rect2, (Paint) null);
                }
            }
            this.f63711a.setBitmap(this.f63712b);
            this.f63713c = bitmapArr;
        }
    }
}
