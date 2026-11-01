package yads;

import android.graphics.Matrix;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class ij3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz2 f78679a;

    public ij3(yz2 yz2Var, yz2 yz2Var2) {
        this.f78679a = yz2Var;
    }

    public final Matrix a(float f10, float f11, gj3 gj3Var) {
        int iOrdinal = gj3Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                yz2 yz2Var = this.f78679a;
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
