package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;

/* JADX INFO: compiled from: Shader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ShaderKt {
    public static final void transform(Shader shader, bk.l<? super Matrix, mj.r> lVar) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
