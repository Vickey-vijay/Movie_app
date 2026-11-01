package yads;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class kq {
    public static Bitmap a(Bitmap bitmap, double d10) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, ek.b.b(((double) bitmap.getWidth()) * d10), ek.b.b(((double) bitmap.getHeight()) * d10), false);
        int i10 = 1;
        Bitmap bitmapCopy = bitmapCreateScaledBitmap.copy(bitmapCreateScaledBitmap.getConfig(), true);
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i11 = width * height;
        int[] iArr = new int[i11];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i12 = width - 1;
        int i13 = height - 1;
        int[] iArr2 = new int[i11];
        int[] iArr3 = new int[i11];
        int[] iArr4 = new int[i11];
        int[] iArr5 = new int[ik.k.d(width, height)];
        int[] iArr6 = new int[1024];
        for (int i14 = 0; i14 < 1024; i14++) {
            iArr6[i14] = i14 / 4;
        }
        int[][] iArr7 = new int[3][];
        for (int i15 = 0; i15 < 3; i15++) {
            iArr7[i15] = new int[3];
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < height) {
            int i19 = -1;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i19 <= i10) {
                Bitmap bitmap2 = bitmapCopy;
                int i29 = iArr[ik.k.g(i12, ik.k.d(i19, 0)) + i17];
                int i30 = i19 + 1;
                int[] iArr8 = iArr7[i30];
                iArr8[0] = (i29 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr8[1] = (i29 & 65280) >> 8;
                iArr8[2] = i29 & 255;
                int iAbs = 2 - StrictMath.abs(i19);
                int i31 = iArr8[0];
                i20 = (i31 * iAbs) + i20;
                int i32 = iArr8[1];
                i21 = (i32 * iAbs) + i21;
                int i33 = iArr8[2];
                i22 = (iAbs * i33) + i22;
                if (i19 > 0) {
                    i28 += i31;
                    i27 += i32;
                    i26 += i33;
                } else {
                    i25 += i31;
                    i24 += i32;
                    i23 += i33;
                }
                bitmapCopy = bitmap2;
                i19 = i30;
                i10 = 1;
            }
            Bitmap bitmap3 = bitmapCopy;
            int i34 = 0;
            int i35 = 1;
            while (i34 < width) {
                iArr2[i17] = iArr6[i20];
                iArr3[i17] = iArr6[i21];
                iArr4[i17] = iArr6[i22];
                int i36 = i20 - i25;
                int i37 = i21 - i24;
                int i38 = i22 - i23;
                int[] iArr9 = iArr7[(i35 + 2) % 3];
                int i39 = i25 - iArr9[0];
                int i40 = i24 - iArr9[1];
                int i41 = i23 - iArr9[2];
                if (i16 == 0) {
                    iArr5[i34] = Math.min(i34 + 2, i12);
                }
                int i42 = iArr[i18 + iArr5[i34]];
                int i43 = (i42 & ItemTouchHelper.ACTION_MODE_DRAG_MASK) >> 16;
                iArr9[0] = i43;
                int i44 = (i42 & 65280) >> 8;
                iArr9[1] = i44;
                int i45 = i42 & 255;
                iArr9[2] = i45;
                int i46 = i28 + i43;
                int i47 = i27 + i44;
                int i48 = i26 + i45;
                i20 = i36 + i46;
                i21 = i37 + i47;
                i22 = i38 + i48;
                i35 = (i35 + 1) % 3;
                int[] iArr10 = iArr7[i35 % 3];
                int i49 = iArr10[0];
                i25 = i39 + i49;
                int i50 = iArr10[1];
                i24 = i40 + i50;
                int i51 = iArr10[2];
                i23 = i41 + i51;
                i28 = i46 - i49;
                i27 = i47 - i50;
                i26 = i48 - i51;
                i17++;
                i34++;
                iArr6 = iArr6;
            }
            i18 += width;
            i16++;
            bitmapCopy = bitmap3;
            i10 = 1;
        }
        Bitmap bitmap4 = bitmapCopy;
        int[] iArr11 = iArr6;
        int i52 = 0;
        while (i52 < width) {
            int[] iArr12 = iArr5;
            int i53 = height;
            int[] iArr13 = iArr;
            int i54 = -1;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = width * (-1);
            int i64 = 0;
            for (int i65 = 1; i54 <= i65; i65 = 1) {
                int iMax = Math.max(0, i63) + i52;
                int i66 = i54 + 1;
                int[] iArr14 = iArr7[i66];
                iArr14[0] = iArr2[iMax];
                iArr14[1] = iArr3[iMax];
                iArr14[2] = iArr4[iMax];
                int iAbs2 = 2 - StrictMath.abs(i54);
                i64 = (iArr2[iMax] * iAbs2) + i64;
                i55 = (iArr3[iMax] * iAbs2) + i55;
                i56 = (iArr4[iMax] * iAbs2) + i56;
                if (i54 > 0) {
                    i62 += iArr14[0];
                    i61 += iArr14[1];
                    i60 += iArr14[2];
                } else {
                    i59 += iArr14[0];
                    i58 += iArr14[1];
                    i57 += iArr14[2];
                }
                if (i54 < i13) {
                    i63 += width;
                }
                i54 = i66;
            }
            int i67 = i52;
            int i68 = i56;
            int i69 = i53;
            int i70 = 0;
            int i71 = 1;
            while (i70 < i69) {
                iArr13[i67] = (iArr13[i67] & ViewCompat.MEASURED_STATE_MASK) | (iArr11[i64] << 16) | (iArr11[i55] << 8) | iArr11[i68];
                int i72 = i64 - i59;
                int i73 = i55 - i58;
                int i74 = i68 - i57;
                int[] iArr15 = iArr7[(i71 + 2) % 3];
                int i75 = i59 - iArr15[0];
                int i76 = i58 - iArr15[1];
                int i77 = i57 - iArr15[2];
                if (i52 == 0) {
                    iArr12[i70] = Math.min(i70 + 2, i13) * width;
                }
                int i78 = iArr12[i70] + i52;
                int i79 = iArr2[i78];
                iArr15[0] = i79;
                int i80 = iArr3[i78];
                iArr15[1] = i80;
                int i81 = iArr4[i78];
                iArr15[2] = i81;
                int i82 = i62 + i79;
                int i83 = i61 + i80;
                int i84 = i60 + i81;
                i64 = i72 + i82;
                i55 = i73 + i83;
                i68 = i74 + i84;
                i71 = (i71 + 1) % 3;
                int[] iArr16 = iArr7[i71];
                int i85 = iArr16[0];
                i59 = i75 + i85;
                int i86 = iArr16[1];
                i58 = i76 + i86;
                int i87 = iArr16[2];
                i57 = i77 + i87;
                i62 = i82 - i85;
                i61 = i83 - i86;
                i60 = i84 - i87;
                i67 += width;
                i70++;
                i69 = i69;
            }
            i52++;
            iArr5 = iArr12;
            iArr = iArr13;
            height = i69;
        }
        bitmap4.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap4;
    }
}
