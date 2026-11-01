package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import ck.p;
import ik.i;
import ik.k;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import nj.b0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BrokenCreativeAlgorithmParams brokenCreativeAlgorithmParams) {
        super(brokenCreativeAlgorithmParams);
        p.j(brokenCreativeAlgorithmParams, "algorithmParams");
    }

    private final float c(Bitmap bitmap) {
        float f10;
        float f11;
        i iVarQ = k.q(0, bitmap.getWidth());
        i iVarQ2 = k.q(0, bitmap.getHeight());
        int iV = b0.V(iVarQ) * b0.V(iVarQ2);
        int[] iArr = new int[bitmap.getWidth()];
        int iE = iVarQ2.e();
        int iF = iVarQ2.f();
        if (iE <= iF) {
            int i10 = iE;
            f10 = 0.0f;
            f11 = 0.0f;
            while (true) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i10, bitmap.getWidth(), 1);
                int iE2 = iVarQ.e();
                int iF2 = iVarQ.f();
                if (iE2 <= iF2) {
                    while (true) {
                        float fA = a(iArr[iE2]);
                        f10 += fA;
                        f11 += fA * fA;
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
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        float f12 = iV;
        float f13 = f10 / f12;
        float f14 = (f11 / f12) - (f13 * f13);
        if (f14 < 0.0f) {
            return 0.0f;
        }
        return (float) Math.sqrt(f14);
    }

    @Override // io.bidmachine.rendering.internal.detector.brokencreative.algorithm.a
    public Boolean a(Bitmap bitmap) {
        p.j(bitmap, "image");
        float fC = c(bitmap);
        boolean z10 = fC <= a().getThreshold();
        a(Float.valueOf(fC), Boolean.valueOf(z10));
        return Boolean.valueOf(z10);
    }
}
