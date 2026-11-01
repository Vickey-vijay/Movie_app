package o8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: BitmapUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static int[] b(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return new int[]{-1, -1};
        }
        int iA = a(i10, i11);
        long jC = c();
        int i12 = -1;
        boolean z10 = false;
        int i13 = -1;
        while (!z10) {
            i12 = i10 / iA;
            i13 = i11 / iA;
            if (i12 * i13 * 4 > jC) {
                iA *= 2;
            } else {
                z10 = true;
            }
        }
        return new int[]{i12, i13};
    }

    public static int d(Context context, String str) {
        ExifInterface exifInterface;
        int i10;
        InputStream inputStreamA = null;
        try {
            try {
                if (a8.d.c(str)) {
                    inputStreamA = z7.e.a(context, Uri.parse(str));
                    exifInterface = new ExifInterface(inputStreamA);
                } else {
                    exifInterface = new ExifInterface(str);
                }
                int attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                if (attributeInt == 3) {
                    i10 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                } else if (attributeInt == 6) {
                    i10 = 90;
                } else {
                    if (attributeInt != 8) {
                        k.a(inputStreamA);
                        return 0;
                    }
                    i10 = 270;
                }
                k.a(inputStreamA);
                return i10;
            } catch (Exception e10) {
                e10.printStackTrace();
                k.a(inputStreamA);
                return 0;
            }
        } catch (Throwable th2) {
            k.a(inputStreamA);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    public static void e(Context context, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        Bitmap bitmapF;
        FileOutputStream fileOutputStream2;
        InputStream inputStreamA;
        Bitmap bitmapDecodeFile;
        InputStream inputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream3 = null;
        InputStream inputStream2 = null;
        inputStream = null;
        try {
            int iD = d(context, str);
            if (iD > 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (a8.d.c(str)) {
                    inputStreamA = z7.e.a(context, Uri.parse(str));
                    try {
                        BitmapFactory.decodeStream(inputStreamA, null, options);
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = null;
                        bitmapF = null;
                        inputStream = inputStreamA;
                        try {
                            e.printStackTrace();
                            k.a(inputStream);
                            k.a(fileOutputStream);
                            if (bitmapF != null) {
                                return;
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            k.a(inputStream);
                            k.a(fileOutputStream);
                            if (bitmapF != null && !bitmapF.isRecycled()) {
                                bitmapF.recycle();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                        bitmapF = null;
                        inputStream = inputStreamA;
                        k.a(inputStream);
                        k.a(fileOutputStream);
                        if (bitmapF != null) {
                            bitmapF.recycle();
                        }
                        throw th;
                    }
                } else {
                    BitmapFactory.decodeFile(str, options);
                    inputStreamA = null;
                }
                options.inSampleSize = a(options.outWidth, options.outHeight);
                options.inJustDecodeBounds = false;
                if (a8.d.c(str)) {
                    inputStreamA = z7.e.a(context, Uri.parse(str));
                    bitmapDecodeFile = BitmapFactory.decodeStream(inputStreamA, null, options);
                } else {
                    bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                }
                if (bitmapDecodeFile != null) {
                    try {
                        bitmapF = f(bitmapDecodeFile, iD);
                        try {
                            fileOutputStream3 = a8.d.c(str) ? (FileOutputStream) z7.e.b(context, Uri.parse(str)) : new FileOutputStream(str);
                            g(bitmapF, fileOutputStream3);
                            fileOutputStream2 = fileOutputStream3;
                        } catch (Exception e11) {
                            e = e11;
                            fileOutputStream = fileOutputStream3;
                            inputStream = inputStreamA;
                            e.printStackTrace();
                            k.a(inputStream);
                            k.a(fileOutputStream);
                            if (bitmapF != null || bitmapF.isRecycled()) {
                                return;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileOutputStream = fileOutputStream3;
                            inputStream = inputStreamA;
                            k.a(inputStream);
                            k.a(fileOutputStream);
                            if (bitmapF != null) {
                                bitmapF.recycle();
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        fileOutputStream = null;
                        bitmapF = bitmapDecodeFile;
                    } catch (Throwable th5) {
                        th = th5;
                        fileOutputStream = null;
                        bitmapF = bitmapDecodeFile;
                    }
                } else {
                    fileOutputStream2 = null;
                    bitmapF = bitmapDecodeFile;
                }
                inputStream2 = inputStreamA;
            } else {
                fileOutputStream2 = null;
                bitmapF = null;
            }
            k.a(inputStream2);
            k.a(fileOutputStream2);
            if (bitmapF == null || bitmapF.isRecycled()) {
                return;
            }
        } catch (Exception e13) {
            e = e13;
            fileOutputStream = null;
            bitmapF = null;
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = null;
            bitmapF = null;
        }
        bitmapF.recycle();
    }

    public static void g(Bitmap bitmap, FileOutputStream fileOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
                    fileOutputStream.write(byteArrayOutputStream2.toByteArray());
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    k.a(fileOutputStream);
                    k.a(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    e.printStackTrace();
                    k.a(fileOutputStream);
                    k.a(byteArrayOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    k.a(fileOutputStream);
                    k.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static int a(int i10, int i11) {
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

    public static Bitmap f(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static long c() {
        long j10 = Runtime.getRuntime().totalMemory();
        if (j10 > 104857600) {
            return 104857600L;
        }
        return j10;
    }
}
