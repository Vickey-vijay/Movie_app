package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import nj.l;

/* JADX INFO: renamed from: okio.SegmentedByteString, reason: case insensitive filesystem */
/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class C4761SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i10, ByteString byteString, int i11, int i12) {
        p.j(byteString, "other");
        if (i10 < 0 || i10 > size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i15 = getDirectory$okio()[iSegment] - i14;
            int i16 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!byteString.rangeEquals(i11, getSegments$okio()[iSegment], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4761SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.EMPTY.getData$okio());
        p.j(bArr, "segments");
        p.j(iArr, "directory");
        this.segments = bArr;
        this.directory = iArr;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    @Override // okio.ByteString
    public void copyInto(int i10, byte[] bArr, int i11, int i12) {
        p.j(bArr, TypedValues.AttributesType.S_TARGET);
        long j10 = i12;
        SegmentedByteString.checkOffsetAndCount(size(), i10, j10);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i15 = getDirectory$okio()[iSegment] - i14;
            int i16 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = i16 + (i10 - i14);
            l.g(getSegments$okio()[iSegment], bArr, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    @Override // okio.ByteString
    public ByteString digest$okio(String str) throws NoSuchAlgorithmException {
        p.j(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory$okio()[length + i10];
            int i13 = getDirectory$okio()[i10];
            messageDigest.update(getSegments$okio()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        p.g(bArrDigest);
        return new ByteString(bArrDigest);
    }

    public final int[] getDirectory$okio() {
        return this.directory;
    }

    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    @Override // okio.ByteString
    public ByteString hmac$okio(String str, ByteString byteString) throws NoSuchAlgorithmException {
        p.j(str, "algorithm");
        p.j(byteString, C3426d4.i.W);
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            int length = getSegments$okio().length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = getDirectory$okio()[length + i10];
                int i13 = getDirectory$okio()[i10];
                mac.update(getSegments$okio()[i10], i12, i13 - i11);
                i10++;
                i11 = i13;
            }
            byte[] bArrDoFinal = mac.doFinal();
            p.i(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // okio.ByteString
    public int indexOf(byte[] bArr, int i10) {
        p.j(bArr, "other");
        return toByteString().indexOf(bArr, i10);
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] bArr, int i10) {
        p.j(bArr, "other");
        return toByteString().lastIndexOf(bArr, i10);
    }

    @Override // okio.ByteString
    public String string(Charset charset) {
        p.j(charset, G5.M);
        return toByteString().string(charset);
    }

    @Override // okio.ByteString
    public void write(OutputStream outputStream) throws IOException {
        p.j(outputStream, "out");
        int length = getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = getDirectory$okio()[length + i10];
            int i13 = getDirectory$okio()[i10];
            outputStream.write(getSegments$okio()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
    }

    @Override // okio.ByteString
    public void write$okio(Buffer buffer, int i10, int i11) {
        p.j(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i14 = getDirectory$okio()[iSegment] - i13;
            int i15 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            Segment segment = new Segment(getSegments$okio()[iSegment], i16, i16 + iMin, true, false);
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

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        p.h(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    @Override // okio.ByteString
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        p.i(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // okio.ByteString
    public String base64() {
        return toByteString().base64();
    }

    @Override // okio.ByteString
    public String base64Url() {
        return toByteString().base64Url();
    }

    @Override // okio.ByteString
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio == 0) {
            int length = getSegments$okio().length;
            int i10 = 0;
            int i11 = 1;
            int i12 = 0;
            while (i10 < length) {
                int i13 = getDirectory$okio()[length + i10];
                int i14 = getDirectory$okio()[i10];
                byte[] bArr = getSegments$okio()[i10];
                int i15 = (i14 - i12) + i13;
                while (i13 < i15) {
                    i11 = (i11 * 31) + bArr[i13];
                    i13++;
                }
                i10++;
                i12 = i14;
            }
            setHashCode$okio(i11);
            return i11;
        }
        return hashCode$okio;
    }

    @Override // okio.ByteString
    public String hex() {
        return toByteString().hex();
    }

    @Override // okio.ByteString
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public byte internalGet$okio(int i10) {
        int i11;
        SegmentedByteString.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i10, 1L);
        int iSegment = okio.internal.SegmentedByteString.segment(this, i10);
        if (iSegment == 0) {
            i11 = 0;
        } else {
            i11 = getDirectory$okio()[iSegment - 1];
        }
        return getSegments$okio()[iSegment][(i10 - i11) + getDirectory$okio()[getSegments$okio().length + iSegment]];
    }

    @Override // okio.ByteString
    public ByteString substring(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i11);
        int i12 = 0;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (iResolveDefaultParameter <= size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i13 = iResolveDefaultParameter - i10;
                if (i13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (i10 == 0 && iResolveDefaultParameter == size()) {
                        return this;
                    }
                    if (i10 == iResolveDefaultParameter) {
                        return ByteString.EMPTY;
                    }
                    int iSegment = okio.internal.SegmentedByteString.segment(this, i10);
                    int iSegment2 = okio.internal.SegmentedByteString.segment(this, iResolveDefaultParameter - 1);
                    byte[][] bArr = (byte[][]) l.m(getSegments$okio(), iSegment, iSegment2 + 1);
                    int[] iArr = new int[bArr.length * 2];
                    if (iSegment <= iSegment2) {
                        int i14 = 0;
                        int i15 = iSegment;
                        while (true) {
                            iArr[i14] = Math.min(getDirectory$okio()[i15] - i10, i13);
                            int i16 = i14 + 1;
                            iArr[i14 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i15];
                            if (i15 == iSegment2) {
                                break;
                            }
                            i15++;
                            i14 = i16;
                        }
                    }
                    if (iSegment != 0) {
                        i12 = getDirectory$okio()[iSegment - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i10 - i12);
                    return new C4761SegmentedByteString(bArr, iArr);
                }
                throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i10).toString());
            }
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + size() + ')').toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
    }

    @Override // okio.ByteString
    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    @Override // okio.ByteString
    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    @Override // okio.ByteString
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = getDirectory$okio()[length + i10];
            int i14 = getDirectory$okio()[i10];
            int i15 = i14 - i11;
            l.g(getSegments$okio()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public String toString() {
        return toByteString().toString();
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i10, byte[] bArr, int i11, int i12) {
        p.j(bArr, "other");
        if (i10 < 0 || i10 > size() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = okio.internal.SegmentedByteString.segment(this, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : getDirectory$okio()[iSegment - 1];
            int i15 = getDirectory$okio()[iSegment] - i14;
            int i16 = getDirectory$okio()[getSegments$okio().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!SegmentedByteString.arrayRangeEquals(getSegments$okio()[iSegment], i16 + (i10 - i14), bArr, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}
