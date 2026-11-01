package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class c4 extends z3 {
    public static int a(byte[] bArr, int i10, long j10, int i11) {
        if (i11 == 0) {
            z3 z3Var = d4.f18169a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return d4.a(i10, x3.f18340c.b(bArr, x3.f18343f + j10));
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        w3 w3Var = x3.f18340c;
        long j11 = x3.f18343f;
        return d4.a(i10, w3Var.b(bArr, j11 + j10), w3Var.b(bArr, j10 + 1 + j11));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String b(ByteBuffer byteBuffer, int i10, int i11) throws n1 {
        long j10;
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        long j11 = x3.f18340c.f18326a.getLong(byteBuffer, x3.f18344g) + ((long) i10);
        long j12 = ((long) i11) + j11;
        char[] cArr = new char[i11];
        int i12 = 0;
        while (true) {
            j10 = 1;
            if (j11 >= j12) {
                break;
            }
            byte bA = x3.f18340c.a(j11);
            if (!y3.a(bA)) {
                break;
            }
            j11++;
            cArr[i12] = (char) bA;
            i12++;
        }
        while (j11 < j12) {
            long j13 = j11 + j10;
            w3 w3Var = x3.f18340c;
            byte bA2 = w3Var.a(j11);
            if (y3.a(bA2)) {
                cArr[i12] = (char) bA2;
                i12++;
                j11 = j13;
                while (j11 < j12) {
                    byte bA3 = x3.f18340c.a(j11);
                    if (!y3.a(bA3)) {
                        break;
                    }
                    j11 += j10;
                    cArr[i12] = (char) bA3;
                    i12++;
                }
            } else if (bA2 < -32) {
                if (j13 >= j12) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                j11 += 2;
                y3.a(bA2, w3Var.a(j13), cArr, i12);
                i12++;
            } else if (bA2 < -16) {
                if (j13 >= j12 - j10) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                long j14 = j11 + 2;
                j11 += 3;
                y3.a(bA2, w3Var.a(j13), w3Var.a(j14), cArr, i12);
                i12++;
            } else {
                if (j13 >= j12 - 2) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                byte bA4 = w3Var.a(j13);
                long j15 = j11 + 3;
                byte bA5 = w3Var.a(j11 + 2);
                j11 += 4;
                y3.a(bA2, bA4, bA5, w3Var.a(j15), cArr, i12);
                i12 += 2;
                j10 = 1;
            }
        }
        return new String(cArr, 0, i12);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int c(byte[] bArr, int i10, int i11) {
        int i12;
        if ((i10 | i11 | (bArr.length - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        long j10 = i10;
        int i13 = (int) (((long) i11) - j10);
        long j11 = 1;
        if (i13 >= 16) {
            i12 = 0;
            long j12 = j10;
            while (true) {
                if (i12 >= i13) {
                    i12 = i13;
                    break;
                }
                long j13 = j12 + 1;
                if (x3.f18340c.b(bArr, j12 + x3.f18343f) < 0) {
                    break;
                }
                i12++;
                j12 = j13;
            }
        } else {
            i12 = 0;
        }
        int i14 = i13 - i12;
        long j14 = j10 + ((long) i12);
        while (true) {
            byte b10 = 0;
            while (i14 > 0) {
                long j15 = j14 + j11;
                byte b11 = x3.f18340c.b(bArr, x3.f18343f + j14);
                if (b11 < 0) {
                    b10 = b11;
                    j14 = j15;
                    break;
                }
                i14--;
                b10 = b11;
                j14 = j15;
            }
            if (i14 == 0) {
                return 0;
            }
            int i15 = i14 - 1;
            if (b10 < -32) {
                if (i15 == 0) {
                    return b10;
                }
                i14 -= 2;
                if (b10 >= -62) {
                    long j16 = j14 + j11;
                    if (x3.f18340c.b(bArr, x3.f18343f + j14) <= -65) {
                        j14 = j16;
                    }
                }
                return -1;
            }
            if (b10 >= -16) {
                if (i15 < 3) {
                    return a(bArr, b10, j14, i15);
                }
                i14 -= 4;
                long j17 = j14 + 1;
                w3 w3Var = x3.f18340c;
                long j18 = x3.f18343f;
                byte b12 = w3Var.b(bArr, j18 + j14);
                if (b12 <= -65 && (((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                    long j19 = 2 + j14;
                    if (w3Var.b(bArr, j18 + j17) <= -65) {
                        j14 += 3;
                        if (w3Var.b(bArr, j18 + j19) > -65) {
                        }
                        j11 = 1;
                    }
                }
                return -1;
            }
            if (i15 < 2) {
                return a(bArr, b10, j14, i15);
            }
            i14 -= 3;
            long j20 = j14 + j11;
            w3 w3Var2 = x3.f18340c;
            long j21 = x3.f18343f;
            byte b13 = w3Var2.b(bArr, j21 + j14);
            if (b13 <= -65 && ((b10 != -32 || b13 >= -96) && (b10 != -19 || b13 < -96))) {
                j14 += 2;
                if (w3Var2.b(bArr, j21 + j20) > -65) {
                }
                j11 = 1;
            }
            return -1;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String a(byte[] bArr, int i10, int i11) throws n1 {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = x3.f18340c.b(bArr, x3.f18343f + ((long) i10));
                if (!y3.a(b10)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                w3 w3Var = x3.f18340c;
                long j10 = x3.f18343f;
                byte b11 = w3Var.b(bArr, ((long) i10) + j10);
                if (y3.a(b11)) {
                    cArr[i14] = (char) b11;
                    i14++;
                    i10 = i15;
                    while (i10 < i12) {
                        byte b12 = x3.f18340c.b(bArr, x3.f18343f + ((long) i10));
                        if (!y3.a(b12)) {
                            break;
                        }
                        i10++;
                        cArr[i14] = (char) b12;
                        i14++;
                    }
                } else if (b11 < -32) {
                    if (i15 < i12) {
                        i10 += 2;
                        y3.a(b11, w3Var.b(bArr, j10 + ((long) i15)), cArr, i14);
                        i14++;
                    } else {
                        throw new n1("Protocol message had invalid UTF-8.");
                    }
                } else if (b11 < -16) {
                    if (i15 < i12 - 1) {
                        int i16 = i10 + 2;
                        i10 += 3;
                        y3.a(b11, w3Var.b(bArr, ((long) i15) + j10), w3Var.b(bArr, j10 + ((long) i16)), cArr, i14);
                        i14++;
                    } else {
                        throw new n1("Protocol message had invalid UTF-8.");
                    }
                } else if (i15 < i12 - 2) {
                    byte b13 = w3Var.b(bArr, ((long) i15) + j10);
                    int i17 = i10 + 3;
                    byte b14 = w3Var.b(bArr, ((long) (i10 + 2)) + j10);
                    i10 += 4;
                    y3.a(b11, b13, b14, w3Var.b(bArr, j10 + ((long) i17)), cArr, i14);
                    i14 += 2;
                } else {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int a(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        long j10;
        char c10;
        String str;
        String str2;
        long j11;
        int i12;
        long j12;
        char cCharAt;
        long j13 = i10;
        long j14 = ((long) i11) + j13;
        int length = charSequence.length();
        String str3 = " at index ";
        String str4 = "Failed writing ";
        if (length > i11 || bArr.length - i11 < i10) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
        }
        int i13 = 0;
        while (true) {
            j10 = 1;
            c10 = 128;
            if (i13 >= length || (cCharAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            x3.f18340c.a((Object) bArr, x3.f18343f + j13, (byte) cCharAt);
            i13++;
            j13 = 1 + j13;
        }
        if (i13 == length) {
            return (int) j13;
        }
        while (i13 < length) {
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt2 >= c10 || j13 >= j14) {
                if (cCharAt2 >= 2048 || j13 > j14 - 2) {
                    str = str3;
                    str2 = str4;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j13 > j14 - 3) {
                        if (j13 <= j14 - 4) {
                            int i14 = i13 + 1;
                            if (i14 != length) {
                                char cCharAt3 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j12 = 1;
                                    w3 w3Var = x3.f18340c;
                                    long j15 = x3.f18343f;
                                    w3Var.a((Object) bArr, j15 + j13, (byte) ((codePoint >>> 18) | 240));
                                    w3Var.a((Object) bArr, j15 + j13 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j16 = j13 + 3;
                                    c10 = 128;
                                    w3Var.a((Object) bArr, j15 + 2 + j13, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j13 += 4;
                                    w3Var.a((Object) bArr, j15 + j16, (byte) ((codePoint & 63) | 128));
                                    i13 = i14;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new b4(i13 - 1, length);
                        }
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                            throw new b4(i13, length);
                        }
                        throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j13);
                    }
                    w3 w3Var2 = x3.f18340c;
                    long j17 = x3.f18343f;
                    w3Var2.a((Object) bArr, j17 + j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    w3Var2.a((Object) bArr, j17 + j13 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    w3Var2.a((Object) bArr, j17 + 2 + j13, (byte) ((cCharAt2 & '?') | 128));
                    j11 = j13 + 3;
                } else {
                    long j18 = j13 + j10;
                    w3 w3Var3 = x3.f18340c;
                    long j19 = x3.f18343f;
                    str = str3;
                    str2 = str4;
                    w3Var3.a((Object) bArr, j19 + j13, (byte) ((cCharAt2 >>> 6) | 960));
                    j13 += 2;
                    w3Var3.a((Object) bArr, j19 + j18, (byte) ((cCharAt2 & '?') | 128));
                    c10 = 128;
                    j12 = 1;
                }
                i13++;
                str3 = str;
                j10 = j12;
                str4 = str2;
            } else {
                j11 = j13 + j10;
                x3.f18340c.a((Object) bArr, x3.f18343f + j13, (byte) cCharAt2);
                str = str3;
                str2 = str4;
            }
            j13 = j11;
            c10 = 128;
            j12 = 1;
            i13++;
            str3 = str;
            j10 = j12;
            str4 = str2;
        }
        return (int) j13;
    }
}
