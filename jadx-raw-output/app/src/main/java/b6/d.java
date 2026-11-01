package b6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: HighLevelEncoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f4820b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f4821c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f4822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[][] f4823e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4824a;

    /* JADX INFO: compiled from: HighLevelEncoder.java */
    public class a implements Comparator<f> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.e() - fVar2.e();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        f4822d = iArr;
        iArr[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f4822d[0][i10] = (i10 - 65) + 2;
        }
        f4822d[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f4822d[1][i11] = (i11 - 97) + 2;
        }
        f4822d[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f4822d[2][i12] = (i12 - 48) + 2;
        }
        int[] iArr2 = f4822d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f4822d[3][iArr3[i13]] = i13;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr4[i14];
            if (i15 > 0) {
                f4822d[4][i15] = i14;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f4823e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f4823e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public static Collection<f> b(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f fVar : iterable) {
            boolean z10 = true;
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (fVar2.g(fVar)) {
                    z10 = false;
                    break;
                }
                if (fVar.g(fVar2)) {
                    it.remove();
                }
            }
            if (z10) {
                linkedList.add(fVar);
            }
        }
        return linkedList;
    }

    public static Collection<f> f(Iterable<f> iterable, int i10, int i11) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            d(it.next(), i10, i11, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public c6.a a() {
        int i10;
        Collection<f> collectionSingletonList = Collections.singletonList(f.f4828e);
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f4824a;
            if (i11 >= bArr.length) {
                return ((f) Collections.min(collectionSingletonList, new a())).j(this.f4824a);
            }
            int i12 = i11 + 1;
            byte b10 = i12 < bArr.length ? bArr[i12] : (byte) 0;
            byte b11 = bArr[i11];
            if (b11 != 13) {
                if (b11 != 44) {
                    if (b11 != 46) {
                        if (b11 == 58 && b10 == 32) {
                            i10 = 5;
                        } else {
                            i10 = 0;
                        }
                    } else if (b10 == 32) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                } else if (b10 == 32) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
            } else if (b10 == 10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                collectionSingletonList = f(collectionSingletonList, i11, i10);
                i11 = i12;
            } else {
                collectionSingletonList = e(collectionSingletonList, i11);
            }
            i11++;
        }
    }

    public final void c(f fVar, int i10, Collection<f> collection) {
        char c10 = (char) (this.f4824a[i10] & 255);
        boolean z10 = f4822d[fVar.f()][c10] > 0;
        f fVarC = null;
        for (int i11 = 0; i11 <= 4; i11++) {
            int i12 = f4822d[i11][c10];
            if (i12 > 0) {
                if (fVarC == null) {
                    fVarC = fVar.c(i10);
                }
                if (!z10 || i11 == fVar.f() || i11 == 2) {
                    collection.add(fVarC.h(i11, i12));
                }
                if (!z10 && f4823e[fVar.f()][i11] >= 0) {
                    collection.add(fVarC.i(i11, i12));
                }
            }
        }
        if (fVar.d() > 0 || f4822d[fVar.f()][c10] == 0) {
            collection.add(fVar.a(i10));
        }
    }

    public final Collection<f> e(Iterable<f> iterable, int i10) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next(), i10, linkedList);
        }
        return b(linkedList);
    }

    public d(byte[] bArr) {
        this.f4824a = bArr;
    }

    public static void d(f fVar, int i10, int i11, Collection<f> collection) {
        f fVarC = fVar.c(i10);
        collection.add(fVarC.h(4, i11));
        if (fVar.f() != 4) {
            collection.add(fVarC.i(4, i11));
        }
        if (i11 == 3 || i11 == 4) {
            collection.add(fVarC.h(2, 16 - i11).h(2, 1));
        }
        if (fVar.d() > 0) {
            collection.add(fVar.a(i10).a(i10 + 1));
        }
    }
}
