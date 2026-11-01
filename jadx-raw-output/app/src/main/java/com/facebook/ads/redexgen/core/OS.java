package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.ironsource.G5;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OS<E> implements Cloneable {
    public static byte[] A04;
    public static String[] A05 = {"3rdfmaS4Bvs6KD5DohCaazKJ5nPjrowZ", "nk5cgk6zHA99knZ4VIBWP6swe9j6XVxJ", "SR1GrmmGZb5WiV5DUpa8V4qNmvh", "hXJT0tWkN7S4w3G0a7yWDauM9ZCHUr7o", "HR23fndUBIfy3sX8NPdMDAzNZ7ikzeu", "Yza27yUTeZsQZywWns2Eqk9QSJgdTaNC", "To1PPTsvrqg0vOGGncKBfzj1ovx9xtsA", "AHHllHZ2j6xopeQt7"};
    public static final Object A06;
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{107, 55, 43, ExifInterface.START_CODE, 48, 99, 14, 34, 51, 106, 4, 8, 25, 31};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final String toString() {
        if (A06() <= 0) {
            String strA03 = A03(12, 2, 10);
            String[] strArr = A05;
            if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "Skpu9y55M8HCr5nD5qLEIrlUv7DMUr8f";
            strArr2[3] = "83PSjIhGPkyHWD5a17BzKCZMIovhzHLb";
            return strA03;
        }
        StringBuilder sb2 = new StringBuilder(this.A00 * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.A00; i10++) {
            if (i10 > 0) {
                sb2.append(A03(10, 2, 64));
            }
            sb2.append(A00(i10));
            sb2.append(G5.T);
            E eA07 = A07(i10);
            if (eA07 != this) {
                sb2.append(eA07);
            } else {
                sb2.append(A03(0, 10, 43));
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    static {
        A05();
        A06 = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OS != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public OS() {
        this(10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OS != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public OS(int i10) {
        this.A01 = false;
        if (i10 == 0) {
            this.A02 = OR.A02;
            this.A03 = OR.A03;
        } else {
            int iA00 = OR.A00(i10);
            this.A02 = new long[iA00];
            this.A03 = new Object[iA00];
        }
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OS != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final long A00(int i10) {
        if (this.A01) {
            A04();
        }
        return this.A02[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OS != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final OS<E> clone() {
        OS<E> os = null;
        try {
            os = (OS) super.clone();
            os.A02 = (long[]) this.A02.clone();
            os.A03 = (Object[]) this.A03.clone();
            return os;
        } catch (CloneNotSupportedException unused) {
            return os;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OS != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private final E A02(long j10, E e10) {
        int iA03 = OR.A03(this.A02, this.A00, j10);
        if (iA03 >= 0) {
            Object[] objArr = this.A03;
            if (A05[7].length() != 17) {
                throw new RuntimeException();
            }
            A05[2] = "jXlMUCcAItIj0GcupoJ3Otj";
            if (objArr[iA03] != A06) {
                return (E) this.A03[iA03];
            }
        }
        return e10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OS != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    private void A04() {
        int i10 = this.A00;
        int i11 = 0;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != A06) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.A01 = false;
        this.A00 = i11;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OS != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final int A06() {
        if (this.A01) {
            A04();
        }
        int i10 = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(16) != strArr[5].charAt(16)) {
            throw new RuntimeException();
        }
        A05[4] = "ypCZ";
        return i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OS != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A07(int i10) {
        if (this.A01) {
            A04();
        }
        return (E) this.A03[i10];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OS != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final E A08(long j10) {
        return A02(j10, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OS != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A09() {
        int i10 = this.A00;
        Object[] objArr = this.A03;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OS != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0A(int i10) {
        if (this.A03[i10] != A06) {
            this.A03[i10] = A06;
            this.A01 = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OS != com.facebook.ads.internal.androidx.support.v4.util.LongSparseArray<E> */
    public final void A0B(long j10, E e10) {
        int i10;
        int i11;
        int iA03 = OR.A03(this.A02, this.A00, j10);
        if (iA03 >= 0) {
            Object[] objArr = this.A03;
            if (A05[4].length() != 11) {
                A05[2] = "zIN2";
                objArr[iA03] = e10;
                return;
            }
        } else {
            int i12 = ~iA03;
            int i13 = this.A00;
            if (i12 < i13 && this.A03[i12] == A06) {
                this.A02[i12] = j10;
                this.A03[i12] = e10;
                return;
            }
            boolean z10 = this.A01;
            String[] strArr = A05;
            String str = strArr[1];
            String str2 = strArr[3];
            int iCharAt = str.charAt(17);
            int i14 = str2.charAt(17);
            if (iCharAt != i14) {
                A05[0] = "5FIvphvUgQVU1M732kCMD6tquLVSGC6u";
                if (z10) {
                    i10 = this.A00;
                    i11 = this.A02.length;
                    if (i10 >= i11) {
                        A04();
                        long[] jArr = this.A02;
                        int i15 = this.A00;
                        i12 = ~OR.A03(jArr, i15, j10);
                    }
                }
            } else {
                A05[2] = "2a9UU1wdCLKEgsYJNRrqpR";
                if (z10) {
                    i10 = this.A00;
                    i11 = this.A02.length;
                    if (i10 >= i11) {
                        A04();
                        long[] jArr2 = this.A02;
                        int i16 = this.A00;
                        i12 = ~OR.A03(jArr2, i16, j10);
                    }
                }
            }
            int i17 = this.A00;
            if (A05[7].length() != 17) {
                throw new RuntimeException();
            }
            A05[7] = "rLvHDd51XfoeTGgnr";
            int i18 = this.A02.length;
            if (i17 >= i18) {
                int i19 = this.A00;
                int i20 = OR.A00(i19 + 1);
                long[] jArr3 = new long[i20];
                Object[] objArr2 = new Object[i20];
                long[] jArr4 = this.A02;
                int length = this.A02.length;
                int n10 = A05[7].length();
                if (n10 == 17) {
                    A05[2] = "L48OP70swgk";
                    System.arraycopy(jArr4, 0, jArr3, 0, length);
                    Object[] objArr3 = this.A03;
                    int i21 = this.A03.length;
                    System.arraycopy(objArr3, 0, objArr2, 0, i21);
                    this.A02 = jArr3;
                    this.A03 = objArr2;
                }
            }
            int i22 = this.A00;
            if (i22 - i12 != 0) {
                int i23 = this.A00;
                System.arraycopy(this.A02, i12, this.A02, i12 + 1, i23 - i12);
                int i24 = this.A00;
                System.arraycopy(this.A03, i12, this.A03, i12 + 1, i24 - i12);
            }
            this.A02[i12] = j10;
            this.A03[i12] = e10;
            int i25 = this.A00;
            this.A00 = i25 + 1;
            return;
        }
        throw new RuntimeException();
    }
}
