package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import ck.p;
import ik.i;
import ik.k;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import java.util.HashMap;
import nj.b0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BrokenCreativeAlgorithmParams brokenCreativeAlgorithmParams) {
        super(brokenCreativeAlgorithmParams);
        p.j(brokenCreativeAlgorithmParams, "algorithmParams");
    }

    private final float c(Bitmap bitmap) {
        i iVarQ = k.q(0, bitmap.getWidth());
        i iVarQ2 = k.q(0, bitmap.getHeight());
        int iV = b0.V(iVarQ) * b0.V(iVarQ2);
        int[] iArr = new int[bitmap.getWidth()];
        HashMap map = new HashMap();
        int iE = iVarQ2.e();
        int iF = iVarQ2.f();
        if (iE <= iF) {
            int i10 = iE;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i10, bitmap.getWidth(), 1);
                int iE2 = iVarQ.e();
                int iF2 = iVarQ.f();
                if (iE2 <= iF2) {
                    while (true) {
                        int i11 = iArr[iE2];
                        Integer numValueOf = Integer.valueOf(i11);
                        Integer num = (Integer) map.get(Integer.valueOf(i11));
                        map.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                        if (iE2 == iF2) {
                            break;
                        }
                        iE2++;
                    }
                }
                if (i10 == iF) {
                    break;
                }
                i10++;
            }
        }
        Integer num2 = (Integer) b0.t0(map.values());
        return (num2 != null ? num2.intValue() : 0) / iV;
    }

    @Override // io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a
    public Boolean a(Bitmap bitmap) {
        p.j(bitmap, "image");
        float threshold = a().getThreshold();
        float fA = threshold > 0.5f ? a(bitmap, threshold) : c(bitmap);
        boolean z10 = fA >= threshold;
        a(Float.valueOf(fA), Boolean.valueOf(z10));
        return Boolean.valueOf(z10);
    }

    private final float a(Bitmap bitmap, float f10) {
        int i10;
        int i11;
        int i12 = 0;
        i iVarQ = k.q(0, bitmap.getWidth());
        i iVarQ2 = k.q(0, bitmap.getHeight());
        int iV = b0.V(iVarQ) * b0.V(iVarQ2);
        int[] iArr = new int[bitmap.getWidth()];
        int iE = iVarQ2.e();
        int iF = iVarQ2.f();
        if (iE <= iF) {
            int i13 = 0;
            int i14 = 0;
            int i15 = iE;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i15, bitmap.getWidth(), 1);
                int iE2 = iVarQ.e();
                int iF2 = iVarQ.f();
                if (iE2 <= iF2) {
                    int i16 = i14;
                    while (true) {
                        int i17 = iArr[iE2];
                        if (i13 == 0) {
                            i16 = i17;
                            i13 = 1;
                        } else {
                            i13 = i17 == i16 ? i13 + 1 : i13 - 1;
                        }
                        if (iE2 == iF2) {
                            break;
                        }
                        iE2++;
                    }
                    i14 = i16;
                }
                if (i15 == iF) {
                    break;
                }
                i15++;
            }
            i10 = i13;
            i11 = i14;
        } else {
            i10 = 0;
            i11 = 0;
        }
        float f11 = iV;
        if (i10 < ((2 * f10) - 1) * f11) {
            return 0.0f;
        }
        int iE3 = iVarQ2.e();
        int iF3 = iVarQ2.f();
        if (iE3 <= iF3) {
            int i18 = iE3;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i18, bitmap.getWidth(), 1);
                int iE4 = iVarQ.e();
                int iF4 = iVarQ.f();
                if (iE4 <= iF4) {
                    while (true) {
                        if (iArr[iE4] == i11) {
                            i12++;
                        }
                        if (iE4 == iF4) {
                            break;
                        }
                        iE4++;
                    }
                }
                if (i18 == iF3) {
                    break;
                }
                i18++;
            }
        }
        return i12 / f11;
    }
}
