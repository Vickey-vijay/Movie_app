package com.bytedance.adsdk.vt.fkw;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mwh implements osn<com.bytedance.adsdk.vt.lh.vt.yu> {
    private int ouw;

    private com.bytedance.adsdk.vt.lh.vt.yu ouw(com.bytedance.adsdk.vt.lh.vt.yu yuVar, List<Float> list) {
        char c10;
        int iArgb;
        float f10;
        int i10 = this.ouw * 4;
        if (list.size() <= i10) {
            return yuVar;
        }
        float[] fArr = yuVar.ouw;
        int[] iArr = yuVar.vt;
        int i11 = 2;
        int size = (list.size() - i10) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        char c11 = 0;
        int i12 = 0;
        while (i10 < list.size()) {
            if (i10 % 2 == 0) {
                fArr2[i12] = list.get(i10).floatValue();
            } else {
                fArr3[i12] = list.get(i10).floatValue();
                i12++;
            }
            i10++;
        }
        float[] fArrCopyOf = yuVar.ouw;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                float f11 = i14 < fArrCopyOf.length ? fArrCopyOf[i14] : Float.NaN;
                float f12 = i15 < size ? fArr2[i15] : Float.NaN;
                if (Float.isNaN(f12) || f11 < f12) {
                    fArr4[i16] = f11;
                    i14++;
                } else if (Float.isNaN(f11) || f12 < f11) {
                    fArr4[i16] = f12;
                    i15++;
                } else {
                    fArr4[i16] = f11;
                    i14++;
                    i15++;
                    i13++;
                }
            }
            fArrCopyOf = i13 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i13);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i17 = 0;
        while (i17 < length2) {
            float f13 = fArrCopyOf[i17];
            int iBinarySearch = Arrays.binarySearch(fArr, f13);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f13);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f14 = fArr3[iBinarySearch2];
                if (iArr.length < i11 || f13 == fArr[c11]) {
                    c10 = c11;
                    iArgb = iArr[c10];
                } else {
                    int i18 = 1;
                    while (true) {
                        if (i18 >= fArr.length) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f10 = fArr[i18];
                        if (f10 >= f13 || i18 == fArr.length - 1) {
                            break;
                        }
                        i18++;
                    }
                    int i19 = i18 - 1;
                    float f15 = fArr[i19];
                    float f16 = (f13 - f15) / (f10 - f15);
                    int i20 = iArr[i18];
                    int i21 = iArr[i19];
                    iArgb = Color.argb((int) (f14 * 255.0f), com.bytedance.adsdk.vt.le.vt.ouw(f16, Color.red(i21), Color.red(i20)), com.bytedance.adsdk.vt.le.vt.ouw(f16, Color.green(i21), Color.green(i20)), com.bytedance.adsdk.vt.le.vt.ouw(f16, Color.blue(i21), Color.blue(i20)));
                    c10 = 0;
                }
                iArr2[i17] = iArgb;
            } else {
                iArr2[i17] = ouw(f13, iArr[iBinarySearch], fArr2, fArr3);
                c10 = c11;
            }
            i17++;
            c11 = c10;
            i11 = 2;
        }
        return new com.bytedance.adsdk.vt.lh.vt.yu(fArrCopyOf, iArr2);
    }

    public mwh(int i10) {
        this.ouw = i10;
    }

    private static int ouw(float f10, int i10, float[] fArr, float[] fArr2) {
        float fOuw;
        if (fArr2.length >= 2 && f10 > fArr[0]) {
            for (int i11 = 1; i11 < fArr.length; i11++) {
                float f11 = fArr[i11];
                if (f11 >= f10 || i11 == fArr.length - 1) {
                    if (f11 <= f10) {
                        fOuw = fArr2[i11];
                    } else {
                        int i12 = i11 - 1;
                        float f12 = fArr[i12];
                        fOuw = com.bytedance.adsdk.vt.le.ra.ouw(fArr2[i12], fArr2[i11], (f10 - f12) / (f11 - f12));
                    }
                    return Color.argb((int) (fOuw * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    @Override // com.bytedance.adsdk.vt.fkw.osn
    public final /* synthetic */ com.bytedance.adsdk.vt.lh.vt.yu ouw(JsonReader jsonReader, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z10 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z10) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.ouw = 2;
        }
        if (z10) {
            jsonReader.endArray();
        }
        if (this.ouw == -1) {
            this.ouw = arrayList.size() / 4;
        }
        int i10 = this.ouw;
        float[] fArr = new float[i10];
        int[] iArr = new int[i10];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.ouw * 4; i13++) {
            int i14 = i13 / 4;
            double dFloatValue = arrayList.get(i13).floatValue();
            int i15 = i13 % 4;
            if (i15 != 0) {
                if (i15 == 1) {
                    i11 = (int) (dFloatValue * 255.0d);
                } else if (i15 == 2) {
                    i12 = (int) (dFloatValue * 255.0d);
                } else if (i15 == 3) {
                    iArr[i14] = Color.argb(255, i11, i12, (int) (dFloatValue * 255.0d));
                }
            } else if (i14 > 0) {
                float f11 = (float) dFloatValue;
                if (fArr[i14 - 1] >= f11) {
                    fArr[i14] = f11 + 0.01f;
                } else {
                    fArr[i14] = (float) dFloatValue;
                }
            } else {
                fArr[i14] = (float) dFloatValue;
            }
        }
        return ouw(new com.bytedance.adsdk.vt.lh.vt.yu(fArr, iArr), arrayList);
    }
}
