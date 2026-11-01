package to;

import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: Base64Coder.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f72478a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f72479b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f72480c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f72481d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f72482e = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f72483f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* JADX INFO: renamed from: to.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Base64Coder.java */
    public static class C0755a extends FilterOutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f72484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f72485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f72486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f72487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f72488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f72489g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte[] f72490h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f72491i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f72492j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f72493k;

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) throws IOException {
            if (this.f72491i) {
                ((FilterOutputStream) this).out.write(i10);
                return;
            }
            if (!this.f72484b) {
                byte b10 = this.f72493k[i10 & 127];
                if (b10 <= -5) {
                    if (b10 != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr = this.f72486d;
                int i11 = this.f72485c;
                int i12 = i11 + 1;
                this.f72485c = i12;
                bArr[i11] = (byte) i10;
                if (i12 >= this.f72487e) {
                    ((FilterOutputStream) this).out.write(this.f72490h, 0, a.g(bArr, 0, this.f72490h, 0, this.f72492j));
                    this.f72485c = 0;
                    return;
                }
                return;
            }
            byte[] bArr2 = this.f72486d;
            int i13 = this.f72485c;
            int i14 = i13 + 1;
            this.f72485c = i14;
            bArr2[i13] = (byte) i10;
            int i15 = this.f72487e;
            if (i14 >= i15) {
                ((FilterOutputStream) this).out.write(a.j(this.f72490h, bArr2, i15, this.f72492j));
                int i16 = this.f72488f + 4;
                this.f72488f = i16;
                if (this.f72489g && i16 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f72488f = 0;
                }
                this.f72485c = 0;
            }
        }

        public void d() throws IOException {
            int i10 = this.f72485c;
            if (i10 > 0) {
                if (!this.f72484b) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(a.j(this.f72490h, this.f72486d, i10, this.f72492j));
                this.f72485c = 0;
            }
        }

        public C0755a(OutputStream outputStream, int i10) {
            boolean z10;
            int i11;
            super(outputStream);
            if ((i10 & 8) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f72489g = z10;
            boolean z11 = (i10 & 1) != 0;
            this.f72484b = z11;
            if (z11) {
                i11 = 3;
            } else {
                i11 = 4;
            }
            this.f72487e = i11;
            this.f72486d = new byte[i11];
            this.f72485c = 0;
            this.f72488f = 0;
            this.f72491i = false;
            this.f72490h = new byte[4];
            this.f72492j = i10;
            this.f72493k = a.o(i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            d();
            super.close();
            this.f72486d = null;
            ((FilterOutputStream) this).out = null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            if (this.f72491i) {
                ((FilterOutputStream) this).out.write(bArr, i10, i11);
                return;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                write(bArr[i10 + i12]);
            }
        }
    }

    public static byte[] d(String str) throws IOException {
        return e(str, 0);
    }

    public static byte[] j(byte[] bArr, byte[] bArr2, int i10, int i11) {
        i(bArr2, 0, i10, bArr, 0, i11);
        return bArr;
    }

    public static String k(byte[] bArr) {
        try {
            return l(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static byte[] e(java.lang.String r5, int r6) throws java.io.IOException {
        /*
            if (r5 == 0) goto L8e
            java.lang.String r0 = "US-ASCII"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L9
            goto Ld
        L9:
            byte[] r5 = r5.getBytes()
        Ld:
            int r0 = r5.length
            r1 = 0
            byte[] r5 = f(r5, r1, r0, r6)
            r0 = 4
            r6 = r6 & r0
            r2 = 1
            if (r6 == 0) goto L1a
            r6 = r2
            goto L1b
        L1a:
            r6 = r1
        L1b:
            if (r5 == 0) goto L8d
            int r3 = r5.length
            if (r3 < r0) goto L8d
            if (r6 != 0) goto L8d
            r6 = r5[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r0 = r5[r2]
            int r0 = r0 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            r6 = r6 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r6) goto L8d
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L78
            r2.<init>()     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L78
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6f
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6f
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
        L48:
            int r0 = r4.read(r6)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            if (r0 < 0) goto L52
            r2.write(r6, r1, r0)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            goto L48
        L52:
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r2.close()     // Catch: java.lang.Exception -> L59
        L59:
            r4.close()     // Catch: java.lang.Exception -> L5c
        L5c:
            r3.close()     // Catch: java.lang.Exception -> L8d
            goto L8d
        L60:
            r5 = move-exception
            goto L6d
        L62:
            r6 = move-exception
            goto L72
        L64:
            r5 = move-exception
            r4 = r0
            goto L6d
        L67:
            r6 = move-exception
            r4 = r0
            goto L72
        L6a:
            r5 = move-exception
            r3 = r0
            r4 = r3
        L6d:
            r0 = r2
            goto L83
        L6f:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L72:
            r0 = r2
            goto L7b
        L74:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L83
        L78:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L7b:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L82
            r0.close()     // Catch: java.lang.Exception -> L59
            goto L59
        L82:
            r5 = move-exception
        L83:
            r0.close()     // Catch: java.lang.Exception -> L86
        L86:
            r4.close()     // Catch: java.lang.Exception -> L89
        L89:
            r3.close()     // Catch: java.lang.Exception -> L8c
        L8c:
            throw r5
        L8d:
            return r5
        L8e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Input string was null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: to.a.e(java.lang.String, int):byte[]");
    }

    public static byte[] f(byte[] bArr, int i10, int i11, int i12) throws IOException {
        int i13;
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (i10 < 0 || (i13 = i10 + i11) > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        if (i11 == 0) {
            return new byte[0];
        }
        if (i11 < 4) {
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i11);
        }
        byte[] bArrO = o(i12);
        byte[] bArr2 = new byte[(i11 * 3) / 4];
        byte[] bArr3 = new byte[4];
        int i14 = 0;
        int iG = 0;
        while (i10 < i13) {
            byte b10 = bArr[i10];
            byte b11 = bArrO[b10 & 255];
            if (b11 < -5) {
                throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i10] & 255), Integer.valueOf(i10)));
            }
            if (b11 >= -1) {
                int i15 = i14 + 1;
                bArr3[i14] = b10;
                if (i15 > 3) {
                    iG += g(bArr3, 0, bArr2, iG, i12);
                    if (bArr[i10] == 61) {
                        break;
                    }
                    i14 = 0;
                } else {
                    i14 = i15;
                }
            }
            i10++;
        }
        byte[] bArr4 = new byte[iG];
        System.arraycopy(bArr2, 0, bArr4, 0, iG);
        return bArr4;
    }

    public static int g(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13;
        int i14;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new NullPointerException("Destination array was null.");
        }
        if (i10 < 0 || (i13 = i10 + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10)));
        }
        if (i11 < 0 || (i14 = i11 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i11)));
        }
        byte[] bArrO = o(i12);
        byte b10 = bArr[i10 + 2];
        if (b10 == 61) {
            bArr2[i11] = (byte) ((((bArrO[bArr[i10 + 1]] & 255) << 12) | ((bArrO[bArr[i10]] & 255) << 18)) >>> 16);
            return 1;
        }
        byte b11 = bArr[i13];
        if (b11 == 61) {
            int i15 = ((bArrO[bArr[i10 + 1]] & 255) << 12) | ((bArrO[bArr[i10]] & 255) << 18) | ((bArrO[b10] & 255) << 6);
            bArr2[i11] = (byte) (i15 >>> 16);
            bArr2[i11 + 1] = (byte) (i15 >>> 8);
            return 2;
        }
        int i16 = ((bArrO[bArr[i10 + 1]] & 255) << 12) | ((bArrO[bArr[i10]] & 255) << 18) | ((bArrO[b10] & 255) << 6) | (bArrO[b11] & 255);
        bArr2[i11] = (byte) (i16 >> 16);
        bArr2[i11 + 1] = (byte) (i16 >> 8);
        bArr2[i14] = (byte) i16;
        return 3;
    }

    public static byte[] m(byte[] bArr, int i10, int i11, int i12) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        C0755a c0755a;
        GZIPOutputStream gZIPOutputStream;
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i10);
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i11);
        }
        if (i10 + i11 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr.length)));
        }
        if ((i12 & 2) == 0) {
            boolean z10 = (i12 & 8) != 0;
            int i13 = ((i11 / 3) * 4) + (i11 % 3 > 0 ? 4 : 0);
            if (z10) {
                i13 += i13 / 76;
            }
            int i14 = i13;
            byte[] bArr2 = new byte[i14];
            int i15 = i11 - 2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i16 < i15) {
                int i19 = i16;
                i(bArr, i16 + i10, 3, bArr2, i17, i12);
                int i20 = i18 + 4;
                if (!z10 || i20 < 76) {
                    i18 = i20;
                } else {
                    bArr2[i17 + 4] = 10;
                    i17++;
                    i18 = 0;
                }
                i16 = i19 + 3;
                i17 += 4;
            }
            int i21 = i16;
            if (i21 < i11) {
                i(bArr, i21 + i10, i11 - i21, bArr2, i17, i12);
                i17 += 4;
            }
            int i22 = i17;
            if (i22 > i14 - 1) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i22];
            System.arraycopy(bArr2, 0, bArr3, 0, i22);
            return bArr3;
        }
        GZIPOutputStream gZIPOutputStream2 = null;
        gZIPOutputStream2 = null;
        gZIPOutputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c0755a = new C0755a(byteArrayOutputStream, i12 | 1);
                try {
                    gZIPOutputStream = new GZIPOutputStream(c0755a);
                    try {
                        gZIPOutputStream.write(bArr, i10, i11);
                        gZIPOutputStream.close();
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                        try {
                            c0755a.close();
                        } catch (Exception unused2) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused3) {
                        }
                        return byteArrayOutputStream.toByteArray();
                    } catch (IOException e10) {
                        e = e10;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        try {
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            gZIPOutputStream2 = gZIPOutputStream;
                            try {
                                gZIPOutputStream2.close();
                            } catch (Exception unused4) {
                            }
                            try {
                                c0755a.close();
                            } catch (Exception unused5) {
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (Exception unused6) {
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        gZIPOutputStream2 = gZIPOutputStream;
                        gZIPOutputStream2.close();
                        c0755a.close();
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                    gZIPOutputStream = null;
                }
            } catch (IOException e12) {
                e = e12;
                c0755a = null;
                gZIPOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                c0755a = null;
            }
        } catch (IOException e13) {
            e = e13;
            c0755a = null;
            gZIPOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream = null;
            c0755a = null;
        }
    }

    public static final byte[] n(int i10) {
        if ((i10 & 16) == 16) {
            return f72480c;
        }
        return (i10 & 32) == 32 ? f72482e : f72478a;
    }

    public static final byte[] o(int i10) {
        if ((i10 & 16) == 16) {
            return f72481d;
        }
        return (i10 & 32) == 32 ? f72483f : f72479b;
    }

    public static byte[] h(byte[] bArr) {
        return k(bArr).getBytes();
    }

    public static byte[] i(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        int i14;
        int i15;
        byte[] bArrN = n(i13);
        int i16 = 0;
        if (i11 > 0) {
            i14 = (bArr[i10] << 24) >>> 8;
        } else {
            i14 = 0;
        }
        if (i11 > 1) {
            i15 = (bArr[i10 + 1] << 24) >>> 16;
        } else {
            i15 = 0;
        }
        int i17 = i14 | i15;
        if (i11 > 2) {
            i16 = (bArr[i10 + 2] << 24) >>> 24;
        }
        int i18 = i17 | i16;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return bArr2;
                }
                bArr2[i12] = bArrN[i18 >>> 18];
                bArr2[i12 + 1] = bArrN[(i18 >>> 12) & 63];
                bArr2[i12 + 2] = bArrN[(i18 >>> 6) & 63];
                bArr2[i12 + 3] = bArrN[i18 & 63];
                return bArr2;
            }
            bArr2[i12] = bArrN[i18 >>> 18];
            bArr2[i12 + 1] = bArrN[(i18 >>> 12) & 63];
            bArr2[i12 + 2] = bArrN[(i18 >>> 6) & 63];
            bArr2[i12 + 3] = 61;
            return bArr2;
        }
        bArr2[i12] = bArrN[i18 >>> 18];
        bArr2[i12 + 1] = bArrN[(i18 >>> 12) & 63];
        bArr2[i12 + 2] = 61;
        bArr2[i12 + 3] = 61;
        return bArr2;
    }

    public static String l(byte[] bArr, int i10, int i11, int i12) throws Throwable {
        byte[] bArrM = m(bArr, i10, i11, i12);
        try {
            return new String(bArrM, C.ASCII_NAME);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrM);
        }
    }
}
