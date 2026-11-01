package ap;

import android.view.View;

/* JADX INFO: compiled from: MeasureHelper.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4698d;

    /* JADX WARN: Code duplicated, block: B:39:0x006b A[PHI: r12
  0x006b: PHI (r12v5 int) = (r12v3 int), (r12v7 int), (r12v10 int), (r12v13 int) binds: [B:38:0x0069, B:34:0x005e, B:31:0x0053, B:25:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    public int[] a(int i10, int i11) {
        int i12;
        int i13 = this.f4698d;
        if (i13 == 90 || i13 == 270) {
            int i14 = i10 + i11;
            i11 = i14 - i11;
            i10 = i14 - i11;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i15 = this.f4696b;
        if (i15 == 0 || (i12 = this.f4695a) == 0) {
            return new int[]{size, size2};
        }
        int i16 = this.f4697c;
        if (i16 == 1) {
            i11 = (size / 16) * 9;
            if (size2 > i11) {
                i10 = size;
            } else {
                i10 = (size2 / 9) * 16;
                i11 = size2;
            }
        } else if (i16 == 2) {
            i11 = (size / 4) * 3;
            if (size2 > i11) {
                i10 = size;
            } else {
                i10 = (size2 / 3) * 4;
                i11 = size2;
            }
        } else if (i16 != 3) {
            if (i16 == 4) {
                i11 = i15;
                i10 = i12;
            } else if (i16 != 5) {
                if (i12 * size2 < size * i15) {
                    i10 = (i12 * size2) / i15;
                } else if (i12 * size2 > size * i15) {
                    i11 = (i15 * size) / i12;
                    i10 = size;
                } else {
                    i10 = size;
                }
                i11 = size2;
            } else if (i12 * size2 > size * i15) {
                i10 = (i12 * size2) / i15;
                i11 = size2;
            } else {
                i11 = (i15 * size) / i12;
                i10 = size;
            }
        }
        return new int[]{i10, i11};
    }

    public void b(int i10) {
        this.f4697c = i10;
    }

    public void c(int i10) {
        this.f4698d = i10;
    }

    public void d(int i10, int i11) {
        this.f4695a = i10;
        this.f4696b = i11;
    }
}
