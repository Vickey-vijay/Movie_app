package rm;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* JADX INFO: compiled from: HttpWriter.java */
/* JADX INFO: loaded from: classes2.dex */
public class m extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f66900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm.a f66901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66903e = 0;

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        while (i11 > 512) {
            write(str, i10, 512);
            i10 += 512;
            i11 -= 512;
        }
        l lVar = this.f66900b;
        if (lVar.f66898i == null) {
            lVar.f66898i = new char[512];
        }
        char[] cArr = lVar.f66898i;
        str.getChars(i10, i10 + i11, cArr, 0);
        write(cArr, 0, i11);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f66900b.close();
    }

    public final Writer d() throws IOException {
        l lVar = this.f66900b;
        if (lVar.f66897h == null) {
            l lVar2 = this.f66900b;
            lVar.f66897h = new OutputStreamWriter(lVar2.f66899j, lVar2.f66896g);
        }
        return this.f66900b.f66897h;
    }

    public void e(String str) {
        if (str == null || "ISO-8859-1".equalsIgnoreCase(str)) {
            this.f66902d = 1;
        } else if ("UTF-8".equalsIgnoreCase(str)) {
            this.f66902d = 2;
        } else {
            this.f66902d = 0;
            String str2 = this.f66900b.f66896g;
            if (str2 == null || !str2.equalsIgnoreCase(str)) {
                this.f66900b.f66897h = null;
            }
        }
        l lVar = this.f66900b;
        lVar.f66896g = str;
        if (lVar.f66899j == null) {
            lVar.f66899j = new xm.g(512);
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f66900b.flush();
    }

    public m(l lVar) {
        this.f66900b = lVar;
        this.f66901c = lVar.f66893d;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0175 A[SYNTHETIC] */
    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        int codePoint;
        int i12;
        l lVar = this.f66900b;
        while (i11 > 0) {
            lVar.f66899j.reset();
            int length = i11 <= 512 ? i11 : 512;
            int i13 = this.f66902d;
            if (i13 != 0) {
                int i14 = 0;
                if (i13 == 1) {
                    byte[] bArrD = lVar.f66899j.d();
                    int count = lVar.f66899j.getCount();
                    if (length > bArrD.length - count) {
                        length = bArrD.length - count;
                    }
                    while (i14 < length) {
                        char c10 = cArr[i10 + i14];
                        int i15 = count + 1;
                        if (c10 >= 256) {
                            c10 = '?';
                        }
                        bArrD[count] = (byte) c10;
                        i14++;
                        count = i15;
                    }
                    if (count >= 0) {
                        lVar.f66899j.e(count);
                    }
                } else if (i13 == 2) {
                    byte[] bArrD2 = lVar.f66899j.d();
                    int count2 = lVar.f66899j.getCount();
                    if (count2 + length > bArrD2.length) {
                        length = bArrD2.length - count2;
                    }
                    int i16 = 0;
                    while (i16 < length) {
                        char c11 = cArr[i10 + i16];
                        if (this.f66903e == 0) {
                            if (Character.isHighSurrogate(c11)) {
                                codePoint = c11;
                                this.f66903e = c11;
                            }
                            i16++;
                        } else {
                            char c12 = c11;
                            if (Character.isLowSurrogate(c12)) {
                                codePoint = Character.toCodePoint((char) this.f66903e, c12);
                            } else {
                                int i17 = this.f66903e;
                                this.f66903e = 0;
                                i16--;
                                codePoint = i17;
                            }
                        }
                        codePoint = c11;
                        if ((codePoint & (-128)) != 0) {
                            if ((codePoint & (-2048)) == 0) {
                                if (count2 + 2 <= bArrD2.length) {
                                    int i18 = count2 + 1;
                                    bArrD2[count2] = (byte) ((codePoint >> 6) | 192);
                                    count2 = i18 + 1;
                                    bArrD2[i18] = (byte) ((codePoint & 63) | 128);
                                    this.f66903e = 0;
                                    if (count2 == bArrD2.length) {
                                        i16++;
                                    } else {
                                        i16++;
                                    }
                                }
                            } else if (((-65536) & codePoint) == 0) {
                                if (count2 + 3 <= bArrD2.length) {
                                    int i19 = count2 + 1;
                                    bArrD2[count2] = (byte) ((codePoint >> 12) | 224);
                                    int i20 = i19 + 1;
                                    bArrD2[i19] = (byte) (((codePoint >> 6) & 63) | 128);
                                    i12 = i20 + 1;
                                    bArrD2[i20] = (byte) ((codePoint & 63) | 128);
                                    count2 = i12;
                                    this.f66903e = 0;
                                    if (count2 == bArrD2.length) {
                                        i16++;
                                    } else {
                                        i16++;
                                    }
                                }
                            } else if (((-14680064) & codePoint) == 0) {
                                if (count2 + 4 <= bArrD2.length) {
                                    int i21 = count2 + 1;
                                    bArrD2[count2] = (byte) ((codePoint >> 18) | 240);
                                    int i22 = i21 + 1;
                                    bArrD2[i21] = (byte) (((codePoint >> 12) & 63) | 128);
                                    int i23 = i22 + 1;
                                    bArrD2[i22] = (byte) (((codePoint >> 6) & 63) | 128);
                                    count2 = i23 + 1;
                                    bArrD2[i23] = (byte) ((codePoint & 63) | 128);
                                    this.f66903e = 0;
                                    if (count2 == bArrD2.length) {
                                        i16++;
                                    } else {
                                        i16++;
                                    }
                                }
                            } else if (((-201326592) & codePoint) == 0) {
                                if (count2 + 5 <= bArrD2.length) {
                                    int i24 = count2 + 1;
                                    bArrD2[count2] = (byte) ((codePoint >> 24) | 248);
                                    int i25 = i24 + 1;
                                    bArrD2[i24] = (byte) (((codePoint >> 18) & 63) | 128);
                                    int i26 = i25 + 1;
                                    bArrD2[i25] = (byte) (((codePoint >> 12) & 63) | 128);
                                    int i27 = i26 + 1;
                                    bArrD2[i26] = (byte) (((codePoint >> 6) & 63) | 128);
                                    i12 = i27 + 1;
                                    bArrD2[i27] = (byte) ((codePoint & 63) | 128);
                                    count2 = i12;
                                    this.f66903e = 0;
                                    if (count2 == bArrD2.length) {
                                        i16++;
                                    } else {
                                        i16++;
                                    }
                                }
                            } else {
                                if ((Integer.MIN_VALUE & codePoint) == 0) {
                                    if (count2 + 6 <= bArrD2.length) {
                                        int i28 = count2 + 1;
                                        bArrD2[count2] = (byte) ((codePoint >> 30) | 252);
                                        int i29 = i28 + 1;
                                        bArrD2[i28] = (byte) (((codePoint >> 24) & 63) | 128);
                                        int i30 = i29 + 1;
                                        bArrD2[i29] = (byte) (((codePoint >> 18) & 63) | 128);
                                        int i31 = i30 + 1;
                                        bArrD2[i30] = (byte) (((codePoint >> 12) & 63) | 128);
                                        int i32 = i31 + 1;
                                        bArrD2[i31] = (byte) (((codePoint >> 6) & 63) | 128);
                                        count2 = i32 + 1;
                                        bArrD2[i32] = (byte) ((codePoint & 63) | 128);
                                    }
                                } else {
                                    bArrD2[count2] = 63;
                                    count2++;
                                }
                                this.f66903e = 0;
                                if (count2 == bArrD2.length) {
                                    i16++;
                                } else {
                                    i16++;
                                }
                            }
                            length = i16;
                            break;
                        }
                        if (count2 >= bArrD2.length) {
                            length = i16;
                            break;
                        } else {
                            bArrD2[count2] = (byte) codePoint;
                            count2++;
                            i16++;
                        }
                    }
                    lVar.f66899j.e(count2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                Writer writerD = d();
                writerD.write(cArr, i10, length);
                writerD.flush();
            }
            lVar.f66899j.writeTo(lVar);
            i11 -= length;
            i10 += length;
        }
    }
}
