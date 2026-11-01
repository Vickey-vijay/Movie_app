package f4;

import androidx.annotation.Nullable;
import c4.c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import g5.k0;
import g5.m;
import g5.s;
import g5.t;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: Id3Decoder.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements c4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f52831b = new a() { // from class: f4.a
        @Override // f4.b.a
        public final boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
            return b.y(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final a f52832a;

    /* JADX INFO: compiled from: Id3Decoder.java */
    public interface a {
        boolean evaluate(int i10, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: renamed from: f4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Id3Decoder.java */
    public static final class C0469b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f52834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f52835c;

        public C0469b(int i10, boolean z10, int i11) {
            this.f52833a = i10;
            this.f52834b = z10;
            this.f52835c = i11;
        }
    }

    public b() {
        this(null);
    }

    public static ChapterFrame g(t tVar, int i10, int i11, boolean z10, int i12, @Nullable a aVar) throws UnsupportedEncodingException {
        int iC = tVar.c();
        int iX = x(tVar.f53154a, iC);
        String str = new String(tVar.f53154a, iC, iX - iC, "ISO-8859-1");
        tVar.L(iX + 1);
        int iJ = tVar.j();
        int iJ2 = tVar.j();
        long jA = tVar.A();
        long j10 = jA == 4294967295L ? -1L : jA;
        long jA2 = tVar.A();
        long j11 = jA2 == 4294967295L ? -1L : jA2;
        ArrayList arrayList = new ArrayList();
        int i13 = iC + i10;
        while (tVar.c() < i13) {
            Id3Frame id3FrameJ = j(i11, tVar, z10, i12, aVar);
            if (id3FrameJ != null) {
                arrayList.add(id3FrameJ);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, iJ, iJ2, j10, j11, id3FrameArr);
    }

    public static ChapterTocFrame h(t tVar, int i10, int i11, boolean z10, int i12, @Nullable a aVar) throws UnsupportedEncodingException {
        int iC = tVar.c();
        int iX = x(tVar.f53154a, iC);
        String str = new String(tVar.f53154a, iC, iX - iC, "ISO-8859-1");
        tVar.L(iX + 1);
        int iY = tVar.y();
        boolean z11 = (iY & 2) != 0;
        boolean z12 = (iY & 1) != 0;
        int iY2 = tVar.y();
        String[] strArr = new String[iY2];
        for (int i13 = 0; i13 < iY2; i13++) {
            int iC2 = tVar.c();
            int iX2 = x(tVar.f53154a, iC2);
            strArr[i13] = new String(tVar.f53154a, iC2, iX2 - iC2, "ISO-8859-1");
            tVar.L(iX2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iC + i10;
        while (tVar.c() < i14) {
            Id3Frame id3FrameJ = j(i11, tVar, z10, i12, aVar);
            if (id3FrameJ != null) {
                arrayList.add(id3FrameJ);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z11, z12, strArr, id3FrameArr);
    }

    @Nullable
    public static CommentFrame i(t tVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int iY = tVar.y();
        String strU = u(iY);
        byte[] bArr = new byte[3];
        tVar.h(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        tVar.h(bArr2, 0, i11);
        int iW = w(bArr2, 0, iY);
        String str2 = new String(bArr2, 0, iW, strU);
        int iT = iW + t(iY);
        return new CommentFrame(str, str2, o(bArr2, iT, w(bArr2, iT, iY), strU));
    }

    @Nullable
    public static TextInformationFrame p(t tVar, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iY = tVar.y();
        String strU = u(iY);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        tVar.h(bArr, 0, i11);
        return new TextInformationFrame(str, null, new String(bArr, 0, w(bArr, 0, iY), strU));
    }

    @Nullable
    public static TextInformationFrame q(t tVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iY = tVar.y();
        String strU = u(iY);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        tVar.h(bArr, 0, i11);
        int iW = w(bArr, 0, iY);
        String str = new String(bArr, 0, iW, strU);
        int iT = iW + t(iY);
        return new TextInformationFrame("TXXX", str, o(bArr, iT, w(bArr, iT, iY), strU));
    }

    @Nullable
    public static UrlLinkFrame s(t tVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iY = tVar.y();
        String strU = u(iY);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        tVar.h(bArr, 0, i11);
        int iW = w(bArr, 0, iY);
        String str = new String(bArr, 0, iW, strU);
        int iT = iW + t(iY);
        return new UrlLinkFrame("WXXX", str, o(bArr, iT, x(bArr, iT), "ISO-8859-1"));
    }

    public static int t(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static String u(int i10) {
        if (i10 == 1) {
            return C.UTF16_NAME;
        }
        if (i10 != 2) {
            return i10 != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return "UTF-16BE";
    }

    public static String v(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int x(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static /* synthetic */ boolean y(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    public b(@Nullable a aVar) {
        this.f52832a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[PHI: r3
  0x0079: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:40:0x0086, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean A(t tVar, int i10, int i11, boolean z10) {
        int iB;
        long jB;
        int iE;
        int i12;
        int iC = tVar.c();
        while (true) {
            try {
                boolean z11 = true;
                if (tVar.a() < i11) {
                    tVar.L(iC);
                    return true;
                }
                if (i10 >= 3) {
                    iB = tVar.j();
                    jB = tVar.A();
                    iE = tVar.E();
                } else {
                    iB = tVar.B();
                    jB = tVar.B();
                    iE = 0;
                }
                if (iB == 0 && jB == 0 && iE == 0) {
                    tVar.L(iC);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jB) != 0) {
                        tVar.L(iC);
                        return false;
                    }
                    jB = (((jB >> 24) & 255) << 21) | (jB & 255) | (((jB >> 8) & 255) << 7) | (((jB >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iE & 64) != 0 ? 1 : 0;
                    if ((iE & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iE & 32) != 0 ? 1 : 0;
                    if ((iE & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jB < i12) {
                    tVar.L(iC);
                    return false;
                }
                if (tVar.a() < jB) {
                    tVar.L(iC);
                    return false;
                }
                tVar.M((int) jB);
            } catch (Throwable th2) {
                tVar.L(iC);
                throw th2;
            }
        }
    }

    public static byte[] c(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? k0.f53113f : Arrays.copyOfRange(bArr, i10, i11);
    }

    public static BinaryFrame f(t tVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        tVar.h(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0198  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x01db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ea A[Catch: all -> 0x012e, UnsupportedEncodingException -> 0x0218, Merged into TryCatch #1 {all -> 0x012e, UnsupportedEncodingException -> 0x0218, blocks: (B:91:0x011c, B:159:0x01f4, B:162:0x0218, B:93:0x0124, B:102:0x013d, B:104:0x0145, B:112:0x015f, B:121:0x0177, B:132:0x0192, B:139:0x01a4, B:145:0x01b3, B:150:0x01cb, B:156:0x01e5, B:157:0x01ea), top: B:169:0x0112 }] */
    @Nullable
    public static Id3Frame j(int i10, t tVar, boolean z10, int i11, @Nullable a aVar) {
        int iC;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Id3Frame id3FrameF;
        int iY = tVar.y();
        int iY2 = tVar.y();
        int iY3 = tVar.y();
        int iY4 = i10 >= 3 ? tVar.y() : 0;
        if (i10 == 4) {
            iC = tVar.C();
            if (!z10) {
                iC = (((iC >> 24) & 255) << 21) | (iC & 255) | (((iC >> 8) & 255) << 7) | (((iC >> 16) & 255) << 14);
            }
        } else {
            iC = i10 == 3 ? tVar.C() : tVar.B();
        }
        int iZ = iC;
        int iE = i10 >= 3 ? tVar.E() : 0;
        if (iY == 0 && iY2 == 0 && iY3 == 0 && iY4 == 0 && iZ == 0 && iE == 0) {
            tVar.L(tVar.d());
            return null;
        }
        int iC2 = tVar.c() + iZ;
        if (iC2 > tVar.d()) {
            m.h("Id3Decoder", "Frame size exceeds remaining tag data");
            tVar.L(tVar.d());
            return null;
        }
        if (aVar != null) {
            i12 = iC2;
            if (!aVar.evaluate(i10, iY, iY2, iY3, iY4)) {
                tVar.L(i12);
                return null;
            }
        } else {
            i12 = iC2;
        }
        if (i10 == 3) {
            int i13 = iE;
            z12 = (i13 & 128) != 0;
            z13 = (i13 & 64) != 0;
            z11 = (i13 & 32) != 0;
            z15 = z12;
            z14 = false;
        } else {
            int i14 = iE;
            if (i10 == 4) {
                boolean z16 = (i14 & 64) != 0;
                boolean z17 = (i14 & 8) != 0;
                boolean z18 = (i14 & 4) != 0;
                z14 = (i14 & 2) != 0;
                boolean z19 = (i14 & 1) != 0;
                z11 = z16;
                z12 = z19;
                z15 = z17;
                z13 = z18;
            } else {
                z11 = false;
                z12 = false;
                z13 = false;
                z14 = false;
                z15 = false;
            }
        }
        if (z15 || z13) {
            m.h(r4, "Skipping unsupported compressed or encrypted frame");
            tVar.L(i12);
            return null;
        }
        if (z11) {
            iZ--;
            tVar.M(1);
        }
        if (z12) {
            iZ -= 4;
            tVar.M(4);
        }
        if (z14) {
            iZ = z(tVar, iZ);
        }
        try {
            if (iY == 84 && iY2 == 88 && iY3 == 88 && (i10 == 2 || iY4 == 88)) {
                id3FrameF = q(tVar, iZ);
            } else if (iY == 84) {
                id3FrameF = p(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
            } else if (iY == 87 && iY2 == 88 && iY3 == 88 && (i10 == 2 || iY4 == 88)) {
                id3FrameF = s(tVar, iZ);
            } else if (iY == 87) {
                id3FrameF = r(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
            } else if (iY == 80 && iY2 == 82 && iY3 == 73 && iY4 == 86) {
                id3FrameF = n(tVar, iZ);
            } else if (iY == 71 && iY2 == 69 && iY3 == 79 && (iY4 == 66 || i10 == 2)) {
                id3FrameF = k(tVar, iZ);
            } else if (i10 == 2) {
                if (iY == 80 && iY2 == 73 && iY3 == 67) {
                    id3FrameF = e(tVar, iZ, i10);
                } else if (iY != 67 && iY2 == 79 && iY3 == 77 && (iY4 == 77 || i10 == 2)) {
                    id3FrameF = i(tVar, iZ);
                } else if (iY != 67 && iY2 == 72 && iY3 == 65 && iY4 == 80) {
                    id3FrameF = g(tVar, iZ, i10, z10, i11, aVar);
                } else if (iY != 67 && iY2 == 84 && iY3 == 79 && iY4 == 67) {
                    id3FrameF = h(tVar, iZ, i10, z10, i11, aVar);
                } else if (iY != 77 && iY2 == 76 && iY3 == 76 && iY4 == 84) {
                    id3FrameF = m(tVar, iZ);
                } else {
                    id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                }
            } else if (iY == 65 && iY2 == 80 && iY3 == 73 && iY4 == 67) {
                id3FrameF = e(tVar, iZ, i10);
            } else if (iY != 67) {
                if (iY != 67) {
                    if (iY != 67) {
                        if (iY != 77) {
                            id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                        } else {
                            id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                        }
                    } else if (iY != 77) {
                        id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                    } else {
                        id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                    }
                } else if (iY != 67) {
                    if (iY != 77) {
                        id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                    } else {
                        id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                    }
                } else if (iY != 77) {
                    id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                } else {
                    id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                }
            } else if (iY != 67) {
                if (iY != 67) {
                    if (iY != 77) {
                        id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                    } else {
                        id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                    }
                } else if (iY != 77) {
                    id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                } else {
                    id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                }
            } else if (iY != 67) {
                if (iY != 77) {
                    id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                } else {
                    id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
                }
            } else if (iY != 77) {
                id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
            } else {
                id3FrameF = f(tVar, iZ, v(i10, iY, iY2, iY3, iY4));
            }
            if (id3FrameF == null) {
                m.h("Id3Decoder", "Failed to decode frame: id=" + v(i10, iY, iY2, iY3, iY4) + ", frameSize=" + iZ);
            }
            tVar.L(i12);
            return id3FrameF;
        } catch (UnsupportedEncodingException unused) {
            m.h(r4, "Unsupported character encoding");
            return null;
        } finally {
            tVar.L(i12);
        }
    }

    public static PrivFrame n(t tVar, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        tVar.h(bArr, 0, i10);
        int iX = x(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iX, "ISO-8859-1"), c(bArr, iX + 1, i10));
    }

    public static String o(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    public static UrlLinkFrame r(t tVar, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        tVar.h(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, x(bArr, 0), "ISO-8859-1"));
    }

    public static int z(t tVar, int i10) {
        byte[] bArr = tVar.f53154a;
        int iC = tVar.c();
        int i11 = iC;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iC + i10) {
                return i10;
            }
            if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                System.arraycopy(bArr, i11 + 2, bArr, i12, (i10 - (i11 - iC)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    @Override // c4.a
    @Nullable
    public Metadata a(c cVar) {
        ByteBuffer byteBuffer = (ByteBuffer) g5.a.e(cVar.f64969c);
        return d(byteBuffer.array(), byteBuffer.limit());
    }

    @Nullable
    public Metadata d(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        t tVar = new t(bArr, i10);
        C0469b c0469bL = l(tVar);
        if (c0469bL == null) {
            return null;
        }
        int iC = tVar.c();
        int i11 = c0469bL.f52833a == 2 ? 6 : 10;
        int iZ = c0469bL.f52835c;
        if (c0469bL.f52834b) {
            iZ = z(tVar, c0469bL.f52835c);
        }
        tVar.K(iC + iZ);
        boolean z10 = false;
        if (!A(tVar, c0469bL.f52833a, i11, false)) {
            if (c0469bL.f52833a != 4 || !A(tVar, 4, i11, true)) {
                m.h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + c0469bL.f52833a);
                return null;
            }
            z10 = true;
        }
        while (tVar.a() >= i11) {
            Id3Frame id3FrameJ = j(c0469bL.f52833a, tVar, z10, i11, this.f52832a);
            if (id3FrameJ != null) {
                arrayList.add(id3FrameJ);
            }
        }
        return new Metadata(arrayList);
    }

    public static ApicFrame e(t tVar, int i10, int i11) throws UnsupportedEncodingException {
        int iX;
        String str;
        int iY = tVar.y();
        String strU = u(iY);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        tVar.h(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + k0.K0(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iX = 2;
        } else {
            iX = x(bArr, 0);
            String strK0 = k0.K0(new String(bArr, 0, iX, "ISO-8859-1"));
            if (strK0.indexOf(47) == -1) {
                str = "image/" + strK0;
            } else {
                str = strK0;
            }
        }
        int i13 = bArr[iX + 1] & 255;
        int i14 = iX + 2;
        int iW = w(bArr, i14, iY);
        return new ApicFrame(str, new String(bArr, i14, iW - i14, strU), i13, c(bArr, iW + t(iY), i12));
    }

    public static GeobFrame k(t tVar, int i10) throws UnsupportedEncodingException {
        int iY = tVar.y();
        String strU = u(iY);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        tVar.h(bArr, 0, i11);
        int iX = x(bArr, 0);
        String str = new String(bArr, 0, iX, "ISO-8859-1");
        int i12 = iX + 1;
        int iW = w(bArr, i12, iY);
        String strO = o(bArr, i12, iW, strU);
        int iT = iW + t(iY);
        int iW2 = w(bArr, iT, iY);
        return new GeobFrame(str, strO, o(bArr, iT, iW2, strU), c(bArr, iW2 + t(iY), i11));
    }

    @Nullable
    public static C0469b l(t tVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (tVar.a() < 10) {
            m.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iB = tVar.B();
        boolean z14 = false;
        if (iB != 4801587) {
            m.h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iB)));
            return null;
        }
        int iY = tVar.y();
        tVar.M(1);
        int iY2 = tVar.y();
        int iX = tVar.x();
        if (iY == 2) {
            if ((iY2 & 64) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                m.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iY == 3) {
            if ((iY2 & 64) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                int iJ = tVar.j();
                tVar.M(iJ);
                iX -= iJ + 4;
            }
        } else if (iY == 4) {
            if ((iY2 & 64) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int iX2 = tVar.x();
                tVar.M(iX2 - 4);
                iX -= iX2;
            }
            if ((iY2 & 16) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                iX -= 10;
            }
        } else {
            m.h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iY);
            return null;
        }
        if (iY < 4 && (iY2 & 128) != 0) {
            z14 = true;
        }
        return new C0469b(iY, z14, iX);
    }

    public static MlltFrame m(t tVar, int i10) {
        int iE = tVar.E();
        int iB = tVar.B();
        int iB2 = tVar.B();
        int iY = tVar.y();
        int iY2 = tVar.y();
        s sVar = new s();
        sVar.l(tVar);
        int i11 = ((i10 - 10) * 8) / (iY + iY2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = sVar.h(iY);
            int iH2 = sVar.h(iY2);
            iArr[i12] = iH;
            iArr2[i12] = iH2;
        }
        return new MlltFrame(iE, iB, iB2, iArr, iArr2);
    }

    public static int w(byte[] bArr, int i10, int i11) {
        int iX = x(bArr, i10);
        if (i11 != 0 && i11 != 3) {
            while (iX < bArr.length - 1) {
                if (iX % 2 == 0 && bArr[iX + 1] == 0) {
                    return iX;
                }
                iX = x(bArr, iX + 1);
            }
            return bArr.length;
        }
        return iX;
    }
}
