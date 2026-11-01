package tv.cjump.jni;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;
import com.ironsource.C3426d4;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes11.dex */
public class NativeBitmapFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f72505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f72506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f72507c;

    private static native Bitmap createBitmap(int i10, int i11, int i12, boolean z10);

    public static int d(Bitmap.Config config) {
        try {
            Field field = f72505a;
            if (field == null) {
                return 0;
            }
            return field.getInt(config);
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return 0;
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    private static native boolean init();

    private static native boolean release();

    public static Bitmap a(int i10, int i11, Bitmap.Config config) {
        return b(i10, i11, config, config.equals(Bitmap.Config.ARGB_4444) || config.equals(Bitmap.Config.ARGB_8888));
    }

    public static synchronized Bitmap b(int i10, int i11, Bitmap.Config config, boolean z10) {
        if (f72506b && f72505a != null) {
            return c(i10, i11, config, z10);
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public static void e() {
        try {
            Field declaredField = Bitmap.Config.class.getDeclaredField("nativeInt");
            f72505a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            f72505a = null;
            e10.printStackTrace();
        }
    }

    public static void f() {
        if (f72507c) {
            return;
        }
        if (!DanDeviceUtils.g() && !DanDeviceUtils.h()) {
            f72507c = true;
            f72506b = false;
            return;
        }
        if (f72506b) {
            return;
        }
        try {
            f72507c = true;
            f72506b = false;
        } catch (Error e10) {
            e10.printStackTrace();
            f72507c = true;
            f72506b = false;
        } catch (Exception e11) {
            e11.printStackTrace();
            f72507c = true;
            f72506b = false;
        }
        if (f72506b) {
            if (init()) {
                e();
                if (!h()) {
                    release();
                    f72507c = true;
                    f72506b = false;
                }
            } else {
                release();
                f72507c = true;
                f72506b = false;
            }
        }
        Log.e("NativeBitmapFactory", C3426d4.i.f28562r + f72506b);
    }

    public static synchronized void g() {
        boolean z10 = f72506b;
        f72505a = null;
        f72506b = false;
        if (z10) {
            release();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[ExcHandler: Exception -> 0x0068, PHI: r0
  0x0068: PHI (r0v2 android.graphics.Bitmap) = (r0v1 android.graphics.Bitmap), (r0v5 android.graphics.Bitmap) binds: [B:35:0x0007, B:36:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0085 A[DONT_GENERATE] */
    @SuppressLint({"NewApi"})
    public static boolean h() {
        if (f72505a == null) {
            return false;
        }
        Bitmap bitmapC = null;
        try {
            bitmapC = c(2, 2, Bitmap.Config.ARGB_8888, true);
            boolean zIsPremultiplied = bitmapC != null && bitmapC.getWidth() == 2 && bitmapC.getHeight() == 2;
            if (zIsPremultiplied) {
                if (!bitmapC.isPremultiplied()) {
                    bitmapC.setPremultiplied(true);
                }
                Canvas canvas = new Canvas(bitmapC);
                Paint paint = new Paint();
                paint.setColor(SupportMenu.CATEGORY_MASK);
                paint.setTextSize(20.0f);
                canvas.drawRect(0.0f, 0.0f, bitmapC.getWidth(), bitmapC.getHeight(), paint);
                canvas.drawText("TestLib", 0.0f, 0.0f, paint);
                zIsPremultiplied = bitmapC.isPremultiplied();
            }
            return zIsPremultiplied;
        } catch (Exception e10) {
            Log.e("NativeBitmapFactory", "exception:" + e10.toString());
            return false;
        } catch (Error unused) {
            return false;
        } finally {
            if (bitmapC != null) {
                bitmapC.recycle();
            }
        }
    }

    public static Bitmap c(int i10, int i11, Bitmap.Config config, boolean z10) {
        return createBitmap(i10, i11, d(config), z10);
    }
}
