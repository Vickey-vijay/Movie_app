package ve;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import c6.b;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.ironsource.G5;
import java.util.Hashtable;
import y5.f;

/* JADX INFO: compiled from: CodeCreator.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {
    public static Bitmap a(String str, int i10, int i11, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap;
        int i12;
        int i13;
        int i14;
        int i15;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i16 = i10 / 2;
        int i17 = i11 / 2;
        if (bitmap != null) {
            Matrix matrix = new Matrix();
            float fMin = Math.min(((i10 * 1.0f) / 5.0f) / bitmap.getWidth(), ((i11 * 1.0f) / 5.0f) / bitmap.getHeight());
            matrix.postScale(fMin, fMin);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } else {
            bitmapCreateBitmap = null;
        }
        int i18 = 0;
        if (bitmapCreateBitmap != null) {
            int width = bitmapCreateBitmap.getWidth();
            int height = bitmapCreateBitmap.getHeight();
            i14 = width;
            i15 = height;
            i12 = (i10 - width) / 2;
            i13 = (i11 - height) / 2;
        } else {
            i12 = i16;
            i13 = i17;
            i14 = 0;
            i15 = 0;
        }
        Hashtable hashtable = new Hashtable();
        hashtable.put(EncodeHintType.CHARACTER_SET, G5.N);
        hashtable.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hashtable.put(EncodeHintType.MARGIN, 0);
        try {
            b bVarA = new f().a(str, BarcodeFormat.QR_CODE, i10, i11, hashtable);
            int[] iArr = new int[i10 * i11];
            int i19 = 0;
            while (i19 < i11) {
                for (int i20 = i18; i20 < i10; i20++) {
                    int i21 = ViewCompat.MEASURED_STATE_MASK;
                    if (i20 >= i12 && i20 < i12 + i14 && i19 >= i13 && i19 < i13 + i15) {
                        int pixel = bitmapCreateBitmap.getPixel(i20 - i12, i19 - i13);
                        if (pixel != 0) {
                            i21 = pixel;
                        } else if (!bVarA.d(i20, i19)) {
                            i21 = -1;
                        }
                        iArr[(i19 * i10) + i20] = i21;
                    } else if (bVarA.d(i20, i19)) {
                        iArr[(i19 * i10) + i20] = -16777216;
                    } else {
                        iArr[(i19 * i10) + i20] = -1;
                    }
                }
                i19++;
                i18 = 0;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap2.setPixels(iArr, 0, i10, 0, 0, i10, i11);
            return bitmapCreateBitmap2;
        } catch (WriterException e10) {
            System.out.print(e10);
            return null;
        }
    }
}
