package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class li1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f79797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i73[] f79798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f79799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[][][] f79800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i73 f79801f;

    public final int a(int i10, int i11) {
        int i12 = this.f79798c[i10].a(i11).f78087b;
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            if ((this.f79800e[i10][i11][i15] & 7) == 4) {
                iArr[i14] = i15;
                i14++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
        int iMin = 16;
        int i16 = 0;
        String str = null;
        boolean z10 = false;
        while (i13 < iArrCopyOf.length) {
            String str2 = this.f79798c[i10].a(i11).f78090e[iArrCopyOf[i13]].f80429m;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z10 |= !ib3.a(str, str2);
            }
            iMin = Math.min(iMin, this.f79800e[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z10 ? Math.min(iMin, this.f79799d[i10]) : iMin;
    }

    public li1(int[] iArr, i73[] i73VarArr, int[] iArr2, int[][][] iArr3, i73 i73Var) {
        this.f79797b = iArr;
        this.f79798c = i73VarArr;
        this.f79800e = iArr3;
        this.f79799d = iArr2;
        this.f79801f = i73Var;
        this.f79796a = iArr.length;
    }
}
