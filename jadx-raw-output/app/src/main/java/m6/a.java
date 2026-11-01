package m6;

import com.google.zxing.NotFoundException;
import l6.q;

/* JADX INFO: compiled from: AbstractRSSReader.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f64145b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f64148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f64149f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f64144a = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f64146c = new float[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f64147d = new float[4];

    public static void g(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 < f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    public static void n(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 > f10) {
                i10 = i11;
                f10 = f11;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    public static boolean o(int[] iArr) {
        int i10 = iArr[0] + iArr[1];
        float f10 = i10 / ((iArr[2] + i10) + iArr[3]);
        if (f10 >= 0.7916667f && f10 <= 0.89285713f) {
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            for (int i13 : iArr) {
                if (i13 > i12) {
                    i12 = i13;
                }
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i12 < i11 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int p(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (q.d(iArr, iArr2[i10], 0.45f) < 0.2f) {
                return i10;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final int[] h() {
        return this.f64145b;
    }

    public final int[] i() {
        return this.f64144a;
    }

    public final int[] j() {
        return this.f64149f;
    }

    public final float[] k() {
        return this.f64147d;
    }

    public final int[] l() {
        return this.f64148e;
    }

    public final float[] m() {
        return this.f64146c;
    }

    public a() {
        int[] iArr = new int[8];
        this.f64145b = iArr;
        this.f64148e = new int[iArr.length / 2];
        this.f64149f = new int[iArr.length / 2];
    }
}
