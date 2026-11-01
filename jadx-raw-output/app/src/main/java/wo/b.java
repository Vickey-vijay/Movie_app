package wo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import top.zibin.luban.Checker;

/* JADX INFO: compiled from: Engine.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f74163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f74164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f74166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f74167e;

    public File a() throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = b();
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f74163a.open(), null, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Checker checker = Checker.SINGLE;
        if (checker.isJPG(this.f74163a.open())) {
            bitmapDecodeStream = c(bitmapDecodeStream, checker.getOrientation(this.f74163a.open()));
        }
        bitmapDecodeStream.compress((this.f74167e || bitmapDecodeStream.hasAlpha()) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 60, byteArrayOutputStream);
        bitmapDecodeStream.recycle();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f74164b);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
        byteArrayOutputStream.close();
        return this.f74164b;
    }

    public final int b() {
        int i10 = this.f74165c;
        if (i10 % 2 == 1) {
            i10++;
        }
        this.f74165c = i10;
        int i11 = this.f74166d;
        if (i11 % 2 == 1) {
            i11++;
        }
        this.f74166d = i11;
        int iMax = Math.max(i10, i11);
        float fMin = Math.min(this.f74165c, this.f74166d) / iMax;
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

    public final Bitmap c(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public b(d dVar, File file, boolean z10) throws IOException {
        this.f74164b = file;
        this.f74163a = dVar;
        this.f74167e = z10;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        BitmapFactory.decodeStream(dVar.open(), null, options);
        this.f74165c = options.outWidth;
        this.f74166d = options.outHeight;
    }
}
