package yads;

import android.graphics.Matrix;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class jj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz2 f79072a;

    public jj3(yz2 yz2Var, yz2 yz2Var2) {
        this.f79072a = yz2Var;
    }

    public final Matrix a(float f10, float f11, hj3 hj3Var) {
        int iOrdinal = hj3Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                yz2 yz2Var = this.f79072a;
                float f12 = yz2Var.f85156b / 2.0f;
                float f13 = yz2Var.f85157c / 2.0f;
                Matrix matrix = new Matrix();
                matrix.setScale(f10, f11, f12, f13);
                return matrix;
            }
            throw new NoWhenBranchMatchedException();
        }
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f10, f11, 0.0f, 0.0f);
        return matrix2;
    }
}
