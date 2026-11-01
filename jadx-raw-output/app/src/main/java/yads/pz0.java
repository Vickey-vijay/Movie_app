package yads;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public final class pz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81659a;

    public static pz0 a(int i10, int i11) {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i10, 35722, iArr, 0);
        int i12 = iArr[0];
        byte[] bArr = new byte[i12];
        GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13] == 0) {
                i12 = i13;
                break;
            }
        }
        String str = new String(bArr, 0, i12);
        GLES20.glGetAttribLocation(i10, str);
        return new pz0(str);
    }

    public pz0(String str) {
        this.f81659a = str;
    }
}
