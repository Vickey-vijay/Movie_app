package kd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: BitmapLoadUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {
    public static boolean b(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= j()) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    public static int f(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return BaseTransientBottomBar.ANIMATION_FADE_DURATION;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int g(int i10) {
        return (i10 == 2 || i10 == 7 || i10 == 4 || i10 == 5) ? -1 : 1;
    }

    public static int h(@NonNull Context context, @NonNull Uri uri) {
        int iG = 0;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return 0;
            }
            iG = new f(inputStreamOpenInputStream).g();
            c(inputStreamOpenInputStream);
            return iG;
        } catch (IOException e10) {
            Log.e("BitmapLoadUtils", "getExifOrientation: " + uri.toString(), e10);
            return iG;
        }
    }

    public static Bitmap l(@NonNull Bitmap bitmap, @NonNull Matrix matrix) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            return !bitmap.sameAs(bitmapCreateBitmap) ? bitmapCreateBitmap : bitmap;
        } catch (OutOfMemoryError e10) {
            Log.e("BitmapLoadUtils", "transformBitmap: ", e10);
            return bitmap;
        }
    }

    public static int a(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int iSqrt = (int) Math.sqrt(Math.pow(point.x, 2.0d) + Math.pow(point.y, 2.0d));
        Canvas canvas = new Canvas();
        int iMin = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (iMin > 0) {
            iSqrt = Math.min(iSqrt, iMin);
        }
        int iB = d.b();
        if (iB > 0) {
            iSqrt = Math.min(iSqrt, iB);
        }
        Log.d("BitmapLoadUtils", "maxBitmapSize: " + iSqrt);
        return iSqrt;
    }

    public static void c(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int d(int i10, int i11) {
        if (i10 % 2 == 1) {
            i10++;
        }
        if (i11 % 2 == 1) {
            i11++;
        }
        int iMax = Math.max(i10, i11);
        float fMin = Math.min(i10, i11) / iMax;
        if (fMin > 1.0f || fMin <= 0.5625d) {
            double d10 = fMin;
            if (d10 > 0.5625d || d10 <= 0.5d) {
                return (int) Math.ceil(((double) iMax) / (1280.0d / d10));
            }
            int i12 = iMax / 1280;
            if (i12 == 0) {
                return 1;
            }
            return i12;
        }
        if (iMax < 1664) {
            return 1;
        }
        if (iMax < 4990) {
            return 2;
        }
        if (iMax <= 4990 || iMax >= 10240) {
            return iMax / 1280;
        }
        return 4;
    }

    public static void e(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i10, int i11, gd.b bVar) {
        new jd.b(context, uri, uri2, i10, i11, bVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static int[] i(Context context, Uri uri) {
        if (j.p(uri.toString())) {
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
            options.inSampleSize = d(options.outWidth, options.outHeight);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeStream = null;
        boolean z10 = false;
        while (!z10) {
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    c(inputStreamOpenInputStream);
                    if (!b(bitmapDecodeStream, options)) {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    c(inputStreamOpenInputStream);
                    throw th2;
                }
            } catch (IOException e11) {
                Log.e("BitmapLoadUtils", "doInBackground: ImageDecoder.createSource: ", e11);
            } catch (OutOfMemoryError e12) {
                Log.e("BitmapLoadUtils", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e12);
                options.inSampleSize *= 2;
            }
        }
        return bitmapDecodeStream == null ? new int[]{0, 0} : new int[]{bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight()};
    }

    public static boolean k(Uri uri) {
        return uri != null && "content".equals(uri.getScheme());
    }

    public static long j() {
        long j10 = Runtime.getRuntime().totalMemory();
        if (j10 > 104857600) {
            return 104857600L;
        }
        return j10;
    }
}
