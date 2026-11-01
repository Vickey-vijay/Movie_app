package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import ck.p;
import ik.i;
import ik.k;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.util.Utils;
import nj.b0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BrokenCreativeAlgorithmParams brokenCreativeAlgorithmParams) {
        super(brokenCreativeAlgorithmParams);
        p.j(brokenCreativeAlgorithmParams, "algorithmParams");
    }

    @Override // io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a
    public Boolean a(Bitmap bitmap) {
        Boolean boolValueOf;
        p.j(bitmap, "image");
        Float fA = a(bitmap, a().getThreshold());
        if (fA != null) {
            boolValueOf = Boolean.valueOf(fA.floatValue() <= a().getThreshold());
        } else {
            boolValueOf = null;
        }
        a(fA, boolValueOf);
        return boolValueOf;
    }

    private final Float a(Bitmap bitmap, float f10) {
        float f11;
        i iVarQ = k.q(1, bitmap.getWidth() - 1);
        i iVarQ2 = k.q(1, bitmap.getHeight() - 1);
        int iV = b0.V(iVarQ) * b0.V(iVarQ2);
        if (iV <= 0) {
            return null;
        }
        int[] iArr = new int[bitmap.getWidth()];
        float[] fArr = new float[bitmap.getWidth()];
        float f12 = iV;
        float f13 = f10 * f12;
        int i10 = 0;
        int iE = iVarQ2.e();
        int iF = iVarQ2.f();
        if (iE > iF) {
            f11 = i10 / f12;
            break;
        }
        int i11 = 0;
        int i12 = iE;
        loop0: while (true) {
            int i13 = i12;
            int i14 = iF;
            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i12, bitmap.getWidth(), 1);
            int iE2 = iVarQ.e();
            int iF2 = iVarQ.f();
            if (iE2 <= iF2) {
                Float f14 = null;
                while (true) {
                    int iB = b(iArr[iE2]);
                    int iA = a(bitmap, iE2, i13 - 1);
                    int iA2 = a(bitmap, iE2, i13 + 1);
                    float fA = i13 == 1 ? a(iB, iA) : fArr[iE2];
                    float fA2 = a(iB, iA2);
                    fArr[iE2] = fA2;
                    if (fA + fA2 > 0.2d) {
                        i11++;
                    } else {
                        int iA3 = a(bitmap, iE2 - 1, i13);
                        int iA4 = a(bitmap, iE2 + 1, i13);
                        float fFloatValue = f14 != null ? f14.floatValue() : a(iB, iA3);
                        Float fValueOf = Float.valueOf(a(iB, iA4));
                        if (fFloatValue + fValueOf.floatValue() > 0.2d) {
                            f14 = fValueOf;
                            i11++;
                        } else {
                            f14 = fValueOf;
                        }
                    }
                    int i15 = i11;
                    if (i15 <= f13) {
                        if (iE2 == iF2) {
                            i11 = i15;
                            break;
                        }
                        iE2++;
                        i11 = i15;
                    } else {
                        f11 = 1.0f;
                        break loop0;
                    }
                }
            }
            if (i13 == i14) {
                i10 = i11;
                f11 = i10 / f12;
                break;
            }
            i12 = i13 + 1;
            iF = i14;
        }
        return Float.valueOf(f11);
    }

    private final float a(int i10, int i11) {
        float fRedToRatio = Utils.redToRatio(i10) - Utils.redToRatio(i11);
        float fGreenToRatio = Utils.greenToRatio(i10) - Utils.greenToRatio(i11);
        float fBlueToRatio = Utils.blueToRatio(i10) - Utils.blueToRatio(i11);
        return (float) Math.sqrt((fRedToRatio * fRedToRatio) + (fGreenToRatio * fGreenToRatio) + (fBlueToRatio * fBlueToRatio));
    }
}
