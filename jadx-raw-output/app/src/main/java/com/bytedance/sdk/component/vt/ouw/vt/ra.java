package com.bytedance.sdk.component.vt.ouw.vt;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class ra extends yu {
    public final transient int[] pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final transient byte[][] f11967ra;

    public ra(ouw ouwVar, int i10) {
        super(null);
        bly.ouw(ouwVar.f11966lh, 0L, i10);
        fkw fkwVar = ouwVar.vt;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = fkwVar.f11964lh;
            int i15 = fkwVar.vt;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            fkwVar = fkwVar.f11963le;
        }
        this.f11967ra = new byte[i13][];
        this.pno = new int[i13 * 2];
        fkw fkwVar2 = ouwVar.vt;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f11967ra;
            bArr[i16] = fkwVar2.ouw;
            int i17 = fkwVar2.f11964lh;
            int i18 = fkwVar2.vt;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.pno;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            fkwVar2.yu = true;
            i16++;
            fkwVar2 = fkwVar2.f11963le;
        }
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof yu) {
            yu yuVar = (yu) obj;
            if (yuVar.lh() == lh()) {
                int iLh = lh();
                if (lh() - iLh < 0) {
                    z10 = false;
                } else {
                    int iVt = vt(0);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (iLh > 0) {
                            int i12 = iVt == 0 ? 0 : this.pno[iVt - 1];
                            int iMin = Math.min(iLh, ((this.pno[iVt] - i12) + i12) - i10);
                            int[] iArr = this.pno;
                            byte[][] bArr = this.f11967ra;
                            if (!yuVar.ouw(i11, bArr[iVt], (i10 - i12) + iArr[bArr.length + iVt], iMin)) {
                                break;
                            }
                            i10 += iMin;
                            i11 += iMin;
                            iLh -= iMin;
                            iVt++;
                        } else {
                            z10 = true;
                        }
                    }
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final String ouw() {
        return fkw().ouw();
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final String vt() {
        return fkw().vt();
    }

    private yu fkw() {
        return new yu(yu());
    }

    private int vt(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.pno, 0, this.f11967ra.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final int hashCode() {
        int i10 = this.fkw;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f11967ra.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.f11967ra[i11];
            int[] iArr = this.pno;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.fkw = i12;
        return i12;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final int lh() {
        return this.pno[this.f11967ra.length - 1];
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final yu ouw(int i10, int i11) {
        return fkw().ouw(i10, i11);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final byte[] yu() {
        int[] iArr = this.pno;
        byte[][] bArr = this.f11967ra;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.pno;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f11967ra[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final byte ouw(int i10) {
        bly.ouw(this.pno[this.f11967ra.length - 1], i10, 1L);
        int iVt = vt(i10);
        int i11 = iVt == 0 ? 0 : this.pno[iVt - 1];
        int[] iArr = this.pno;
        byte[][] bArr = this.f11967ra;
        return bArr[iVt][(i10 - i11) + iArr[bArr.length + iVt]];
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final String toString() {
        return fkw().toString();
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final boolean ouw(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > lh() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iVt = vt(i10);
        while (i12 > 0) {
            int i13 = iVt == 0 ? 0 : this.pno[iVt - 1];
            int iMin = Math.min(i12, ((this.pno[iVt] - i13) + i13) - i10);
            int[] iArr = this.pno;
            byte[][] bArr2 = this.f11967ra;
            if (!bly.ouw(bArr2[iVt], (i10 - i13) + iArr[bArr2.length + iVt], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iVt++;
        }
        return true;
    }
}
