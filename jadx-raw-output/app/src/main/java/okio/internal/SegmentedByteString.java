package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.q;
import ck.p;
import mj.r;
import nj.l;
import okio.Buffer;
import okio.ByteString;
import okio.C4761SegmentedByteString;
import okio.Segment;

/* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SegmentedByteString {
    public static final boolean commonRangeEquals(C4761SegmentedByteString c4761SegmentedByteString, int i10, ByteString byteString, int i11, int i12) {
        p.j(c4761SegmentedByteString, "<this>");
        p.j(byteString, "other");
        if (i10 < 0 || i10 > c4761SegmentedByteString.size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c4761SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c4761SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c4761SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c4761SegmentedByteString.getDirectory$okio()[c4761SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!byteString.rangeEquals(i11, c4761SegmentedByteString.getSegments$okio()[iSegment], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final void forEachSegment(C4761SegmentedByteString c4761SegmentedByteString, q<? super byte[], ? super Integer, ? super Integer, r> qVar) {
        p.j(c4761SegmentedByteString, "<this>");
        p.j(qVar, "action");
        int length = c4761SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = c4761SegmentedByteString.getDirectory$okio()[length + i10];
            int i13 = c4761SegmentedByteString.getDirectory$okio()[i10];
            qVar.invoke(c4761SegmentedByteString.getSegments$okio()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int binarySearch(int[] iArr, int i10, int i11, int i12) {
        p.j(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final void commonCopyInto(C4761SegmentedByteString c4761SegmentedByteString, int i10, byte[] bArr, int i11, int i12) {
        p.j(c4761SegmentedByteString, "<this>");
        p.j(bArr, TypedValues.AttributesType.S_TARGET);
        long j10 = i12;
        okio.SegmentedByteString.checkOffsetAndCount(c4761SegmentedByteString.size(), i10, j10);
        okio.SegmentedByteString.checkOffsetAndCount(bArr.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = segment(c4761SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c4761SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c4761SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c4761SegmentedByteString.getDirectory$okio()[c4761SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = i16 + (i10 - i14);
            l.g(c4761SegmentedByteString.getSegments$okio()[iSegment], bArr, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C4761SegmentedByteString c4761SegmentedByteString, Object obj) {
        p.j(c4761SegmentedByteString, "<this>");
        if (obj == c4761SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c4761SegmentedByteString.size() && c4761SegmentedByteString.rangeEquals(0, byteString, 0, c4761SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C4761SegmentedByteString c4761SegmentedByteString) {
        p.j(c4761SegmentedByteString, "<this>");
        return c4761SegmentedByteString.getDirectory$okio()[c4761SegmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(C4761SegmentedByteString c4761SegmentedByteString) {
        p.j(c4761SegmentedByteString, "<this>");
        int hashCode$okio = c4761SegmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c4761SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c4761SegmentedByteString.getDirectory$okio()[length + i10];
            int i14 = c4761SegmentedByteString.getDirectory$okio()[i10];
            byte[] bArr = c4761SegmentedByteString.getSegments$okio()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        c4761SegmentedByteString.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(C4761SegmentedByteString c4761SegmentedByteString, int i10) {
        p.j(c4761SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c4761SegmentedByteString.getDirectory$okio()[c4761SegmentedByteString.getSegments$okio().length - 1], i10, 1L);
        int iSegment = segment(c4761SegmentedByteString, i10);
        return c4761SegmentedByteString.getSegments$okio()[iSegment][(i10 - (iSegment == 0 ? 0 : c4761SegmentedByteString.getDirectory$okio()[iSegment - 1])) + c4761SegmentedByteString.getDirectory$okio()[c4761SegmentedByteString.getSegments$okio().length + iSegment]];
    }

    public static final ByteString commonSubstring(C4761SegmentedByteString c4761SegmentedByteString, int i10, int i11) {
        p.j(c4761SegmentedByteString, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c4761SegmentedByteString, i11);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (!(iResolveDefaultParameter <= c4761SegmentedByteString.size())) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c4761SegmentedByteString.size() + ')').toString());
        }
        int i12 = iResolveDefaultParameter - i10;
        if (!(i12 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == c4761SegmentedByteString.size()) {
            return c4761SegmentedByteString;
        }
        if (i10 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c4761SegmentedByteString, i10);
        int iSegment2 = segment(c4761SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) l.m(c4761SegmentedByteString.getSegments$okio(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = 0;
            int i14 = iSegment;
            while (true) {
                iArr[i13] = Math.min(c4761SegmentedByteString.getDirectory$okio()[i14] - i10, i12);
                int i15 = i13 + 1;
                iArr[i13 + bArr.length] = c4761SegmentedByteString.getDirectory$okio()[c4761SegmentedByteString.getSegments$okio().length + i14];
                if (i14 == iSegment2) {
                    break;
                }
                i14++;
                i13 = i15;
            }
        }
        int i16 = iSegment != 0 ? c4761SegmentedByteString.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new C4761SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C4761SegmentedByteString c4761SegmentedByteString) {
        p.j(c4761SegmentedByteString, "<this>");
        byte[] bArr = new byte[c4761SegmentedByteString.size()];
        int length = c4761SegmentedByteString.getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c4761SegmentedByteString.getDirectory$okio()[length + i10];
            int i14 = c4761SegmentedByteString.getDirectory$okio()[i10];
            int i15 = i14 - i11;
            l.g(c4761SegmentedByteString.getSegments$okio()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void commonWrite(C4761SegmentedByteString c4761SegmentedByteString, Buffer buffer, int i10, int i11) {
        p.j(c4761SegmentedByteString, "<this>");
        p.j(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = segment(c4761SegmentedByteString, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : c4761SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i14 = c4761SegmentedByteString.getDirectory$okio()[iSegment] - i13;
            int i15 = c4761SegmentedByteString.getDirectory$okio()[c4761SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            Segment segment = new Segment(c4761SegmentedByteString.getSegments$okio()[iSegment], i16, i16 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                p.g(segment2);
                Segment segment3 = segment2.prev;
                p.g(segment3);
                segment3.push(segment);
            }
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i11));
    }

    public static final int segment(C4761SegmentedByteString c4761SegmentedByteString, int i10) {
        p.j(c4761SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c4761SegmentedByteString.getDirectory$okio(), i10 + 1, 0, c4761SegmentedByteString.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C4761SegmentedByteString c4761SegmentedByteString, int i10, int i11, q<? super byte[], ? super Integer, ? super Integer, r> qVar) {
        int iSegment = segment(c4761SegmentedByteString, i10);
        while (i10 < i11) {
            int i12 = iSegment == 0 ? 0 : c4761SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i13 = c4761SegmentedByteString.getDirectory$okio()[iSegment] - i12;
            int i14 = c4761SegmentedByteString.getDirectory$okio()[c4761SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i11, i13 + i12) - i10;
            qVar.invoke(c4761SegmentedByteString.getSegments$okio()[iSegment], Integer.valueOf(i14 + (i10 - i12)), Integer.valueOf(iMin));
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(C4761SegmentedByteString c4761SegmentedByteString, int i10, byte[] bArr, int i11, int i12) {
        p.j(c4761SegmentedByteString, "<this>");
        p.j(bArr, "other");
        if (i10 < 0 || i10 > c4761SegmentedByteString.size() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c4761SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c4761SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i15 = c4761SegmentedByteString.getDirectory$okio()[iSegment] - i14;
            int i16 = c4761SegmentedByteString.getDirectory$okio()[c4761SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!okio.SegmentedByteString.arrayRangeEquals(c4761SegmentedByteString.getSegments$okio()[iSegment], i16 + (i10 - i14), bArr, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}
