package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public abstract class wv0 {
    public static aw0 a(jb2 jb2Var) {
        jb2Var.e(jb2Var.f78967b + 1);
        int iO = jb2Var.o();
        long j10 = ((long) jb2Var.f78967b) + ((long) iO);
        int i10 = iO / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jI = jb2Var.i();
            if (jI == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jI;
            jArrCopyOf2[i11] = jb2Var.i();
            jb2Var.e(jb2Var.f78967b + 2);
        }
        int i12 = jb2Var.f78967b;
        jb2Var.e(i12 + ((int) (j10 - ((long) i12))));
        return new aw0(jArrCopyOf, jArrCopyOf2);
    }
}
