package yads;

import android.graphics.Matrix;
import android.view.TextureView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class fj3 implements me2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yz2 f77415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yz2 f77416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextureView f77417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kj3 f77418d;

    public final void a() {
        Matrix matrixA;
        yz2 yz2Var = this.f77416b;
        kj3 kj3Var = this.f77418d;
        yz2 yz2Var2 = this.f77415a;
        TextureView textureView = this.f77417c;
        if (yz2Var2 == null || yz2Var == null || kj3Var == null || textureView == null) {
            return;
        }
        jj3 jj3Var = new jj3(yz2Var, yz2Var2);
        if (yz2Var2.f85156b <= 0 || yz2Var2.f85157c <= 0 || yz2Var.f85156b <= 0 || yz2Var.f85157c <= 0) {
            matrixA = null;
        } else {
            int iOrdinal = kj3Var.ordinal();
            if (iOrdinal == 0) {
                matrixA = jj3Var.a(1.0f, 1.0f, hj3.f78254b);
            } else if (iOrdinal == 1) {
                float f10 = yz2Var.f85156b / yz2Var2.f85156b;
                float f11 = yz2Var.f85157c / yz2Var2.f85157c;
                float fMin = Math.min(f10, f11);
                matrixA = jj3Var.a(fMin / f10, fMin / f11, hj3.f78255c);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                float f12 = yz2Var.f85156b / yz2Var2.f85156b;
                float f13 = yz2Var.f85157c / yz2Var2.f85157c;
                float fMax = Math.max(f12, f13);
                matrixA = jj3Var.a(fMax / f12, fMax / f13, hj3.f78255c);
            }
        }
        if (matrixA != null) {
            textureView.setTransform(matrixA);
        }
    }

    public final void b() {
        TextureView textureView = this.f77417c;
        if (this.f77418d == null || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
    }

    @Override // yads.me2
    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.f77416b = new yz2(i10, i11);
        a();
    }

    @Override // yads.me2
    public final void a(oj3 oj3Var) {
        int iC = oj3Var.f81057b;
        float f10 = oj3Var.f81060e;
        if (f10 > 0.0f) {
            iC = ek.b.c(iC * f10);
        }
        this.f77415a = new yz2(iC, oj3Var.f81058c);
        a();
    }
}
