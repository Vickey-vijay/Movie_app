package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1280Gs {
    public static String[] A04 = {"xqK2Lo9z9A1fq6AmzHgSANRckQSbvLg7", "r87Jk1TDX4QDRIaoZWvBkBULXd6iRGy1", "O8Rd55zCWOMZlt38o2yZqibVFCpM9qBW", "4N74z6RiBgc3GZHRgJ9RjrwcKA2Sbu4k", "rTO2Tuhk28L6aGO7sMrwgJqOHaARqGQ4", "wV6nIrgfSj92E7JYn8Dcxr40UnK38ksI", "xhpcFCDiO5Y2wtHgWJ12k6gPj7fKn5Nf", "gVHczwThIZ3ivnhVZg4GXcBO3FodCEeQ"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C1280Gs(byte[] bArr, int i10, int i11) {
        A08(bArr, i10, i11);
    }

    private int A00() {
        int i10 = 0;
        while (!A0A()) {
            i10++;
        }
        int i11 = (1 << i10) - 1;
        int leadingZeros = i10 > 0 ? A05(i10) : 0;
        return i11 + leadingZeros;
    }

    private void A01() {
        C3M.A08(this.A02 >= 0 && (this.A02 < this.A01 || (this.A02 == this.A01 && this.A00 == 0)));
        String[] strArr = A04;
        if (strArr[5].charAt(17) == strArr[0].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "rbUb6Xt6pPTA8n7h1lny7mpNeejrLbnq";
        strArr2[1] = "r9GQrTTZLq4j6OnUyTd1FCUw4PnbqYK4";
    }

    private boolean A02(int i10) {
        if (2 <= i10 && i10 < this.A01 && this.A03[i10] == 3 && this.A03[i10 - 2] == 0) {
            byte[] bArr = this.A03;
            String[] strArr = A04;
            if (strArr[3].charAt(14) != strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[3] = "mTSOM4VXL5Qz6aHfzfUvwcrlrHOw2Zy6";
            strArr2[6] = "LbZWpLfoz4TupHHNd8RSjDzMBM5OqJ05";
            if (bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final int A03() {
        int iA00 = A00();
        int codeNum = iA00 % 2;
        int i10 = codeNum == 0 ? -1 : 1;
        int codeNum2 = iA00 + 1;
        return i10 * (codeNum2 / 2);
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i10) {
        int i11 = 0;
        int returnValue = this.A00;
        this.A00 = returnValue + i10;
        while (true) {
            int returnValue2 = this.A00;
            int i12 = 2;
            if (returnValue2 <= 8) {
                break;
            }
            int returnValue3 = this.A00;
            this.A00 = returnValue3 - 8;
            byte[] bArr = this.A03;
            int returnValue4 = this.A02;
            int i13 = bArr[returnValue4] & 255;
            int returnValue5 = this.A00;
            i11 |= i13 << returnValue5;
            int i14 = this.A02;
            int returnValue6 = this.A02;
            if (!A02(returnValue6 + 1)) {
                i12 = 1;
            }
            this.A02 = i14 + i12;
        }
        byte[] bArr2 = this.A03;
        int returnValue7 = this.A02;
        int i15 = bArr2[returnValue7] & 255;
        int returnValue8 = this.A00;
        int i16 = i11 | (i15 >> (8 - returnValue8));
        int i17 = 32 - i10;
        String[] strArr = A04;
        String str = strArr[5];
        String str2 = strArr[0];
        int iCharAt = str.charAt(17);
        int returnValue9 = str2.charAt(17);
        if (iCharAt == returnValue9) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[2] = "RXY6xLJuKIcEz3kUylWDYr6tsmitvphK";
        strArr2[7] = "WXiq34WZkyW8ugzR2g0a8ipZBHhkiRcU";
        int returnValue10 = (-1) >>> i17;
        int i18 = i16 & returnValue10;
        int returnValue11 = this.A00;
        if (returnValue11 == 8) {
            this.A00 = 0;
            int i19 = this.A02;
            int returnValue12 = this.A02;
            int i20 = i19 + (A02(returnValue12 + 1) ? 2 : 1);
            String[] strArr3 = A04;
            String str3 = strArr3[4];
            String str4 = strArr3[1];
            int iCharAt2 = str3.charAt(0);
            int returnValue13 = str4.charAt(0);
            if (iCharAt2 != returnValue13) {
                String[] strArr4 = A04;
                strArr4[4] = "rds4vupX8r7j5bNz4Ka4tPduGPmVtsGV";
                strArr4[1] = "rRPYe8lZfiAZtF0hvmlKmZn0YXaVPkJ6";
                this.A02 = i20;
            } else {
                String[] strArr5 = A04;
                strArr5[3] = "oP8krBIP0DDB0MHyD3CqohM2a51fTyLT";
                strArr5[6] = "8dOgzrP5xxQxSwHCAu2NrFg9fwsPMfLi";
                this.A02 = i20;
            }
        }
        A01();
        return i18;
    }

    public final void A06() {
        int i10 = this.A00 + 1;
        this.A00 = i10;
        if (i10 == 8) {
            this.A00 = 0;
            this.A02 += A02(this.A02 + 1) ? 2 : 1;
        }
        A01();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:21:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[SYNTHETIC] */
    public final void A07(int i10) {
        int oldByteOffset;
        boolean zA02;
        int numBytes;
        int oldByteOffset2;
        int i11 = this.A02;
        int i12 = i10 / 8;
        int oldByteOffset3 = this.A02;
        this.A02 = oldByteOffset3 + i12;
        int numBytes2 = this.A00;
        int oldByteOffset4 = i12 * 8;
        this.A00 = numBytes2 + (i10 - oldByteOffset4);
        int numBytes3 = this.A00;
        if (numBytes3 > 7) {
            int oldByteOffset5 = this.A02;
            this.A02 = oldByteOffset5 + 1;
            String[] strArr = A04;
            String str = strArr[3];
            String str2 = strArr[6];
            int numBytes4 = str.charAt(14);
            int oldByteOffset6 = str2.charAt(14);
            if (numBytes4 == oldByteOffset6) {
                String[] strArr2 = A04;
                strArr2[5] = "JMOXq6hG4yZwGcrVKWuSo4mZKx3jwnv0";
                strArr2[0] = "8hcVzozxp8VhJG7sJROCpbfriQIXRjxB";
                int oldByteOffset7 = this.A00;
                this.A00 = oldByteOffset7 - 8;
                while (true) {
                    i11++;
                    oldByteOffset = this.A02;
                    if (i11 <= oldByteOffset) {
                        zA02 = A02(i11);
                        String[] strArr3 = A04;
                        String str3 = strArr3[4];
                        String str4 = strArr3[1];
                        numBytes = str3.charAt(0);
                        oldByteOffset2 = str4.charAt(0);
                        if (numBytes != oldByteOffset2) {
                            String[] strArr4 = A04;
                            strArr4[3] = "ItBao4LZOiviF1HOEk7WTyNzP7shwqmG";
                            strArr4[6] = "at4dJT6xDps7byHlzjkGtuWM4RrUB1u7";
                            if (zA02) {
                                int oldByteOffset8 = this.A02;
                                this.A02 = oldByteOffset8 + 1;
                                i11 += 2;
                            }
                        }
                    } else {
                        A01();
                        return;
                    }
                }
            }
        } else {
            while (true) {
                i11++;
                oldByteOffset = this.A02;
                if (i11 <= oldByteOffset) {
                    zA02 = A02(i11);
                    String[] strArr5 = A04;
                    String str5 = strArr5[4];
                    String str6 = strArr5[1];
                    numBytes = str5.charAt(0);
                    oldByteOffset2 = str6.charAt(0);
                    if (numBytes != oldByteOffset2) {
                        String[] strArr6 = A04;
                        strArr6[3] = "ItBao4LZOiviF1HOEk7WTyNzP7shwqmG";
                        strArr6[6] = "at4dJT6xDps7byHlzjkGtuWM4RrUB1u7";
                        if (zA02) {
                            int oldByteOffset9 = this.A02;
                            this.A02 = oldByteOffset9 + 1;
                            i11 += 2;
                        }
                    }
                } else {
                    A01();
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    public final void A08(byte[] bArr, int i10, int i11) {
        this.A03 = bArr;
        this.A02 = i10;
        this.A01 = i11;
        this.A00 = 0;
        A01();
    }

    public final boolean A09() {
        int i10 = this.A02;
        int i11 = this.A00;
        int i12 = 0;
        while (initialBitOffset < initialByteOffset && !A0A()) {
            i12++;
        }
        int i13 = this.A02;
        int initialByteOffset = this.A01;
        int initialByteOffset2 = i13 == initialByteOffset ? 1 : 0;
        this.A02 = i10;
        this.A00 = i11;
        if (initialByteOffset2 != 0) {
            return false;
        }
        int initialByteOffset3 = i12 * 2;
        return A0B(initialByteOffset3 + 1);
    }

    public final boolean A0A() {
        boolean returnValue = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return returnValue;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006e A[EDGE_INSN: B:29:0x006e->B:20:0x006e BREAK  A[LOOP:0: B:10:0x003b->B:19:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c A[SYNTHETIC] */
    public final boolean A0B(int i10) {
        int i11;
        int i12;
        String str;
        int numBytes;
        int i13 = this.A02;
        int oldByteOffset = i10 / 8;
        int i14 = this.A02 + oldByteOffset;
        int newBitOffset = (this.A00 + i10) - (oldByteOffset * 8);
        if (newBitOffset > 7) {
            i14++;
            String[] strArr = A04;
            String str2 = strArr[4];
            String str3 = strArr[1];
            int numBytes2 = str2.charAt(0);
            if (numBytes2 == str3.charAt(0)) {
                String[] strArr2 = A04;
                strArr2[2] = "4R3sKytGl1afrKMjnsBwna0p74CJayfl";
                strArr2[7] = "DtV04uWRet80XDEpYPrFh03isGofLap7";
                newBitOffset -= 8;
                i11 = i13 + 1;
                while (i11 <= i14) {
                    i12 = this.A01;
                    String[] strArr3 = A04;
                    String str4 = strArr3[5];
                    str = strArr3[0];
                    numBytes = str4.charAt(17);
                    if (numBytes != str.charAt(17)) {
                        String[] strArr4 = A04;
                        strArr4[4] = "ru8g1XQo0WAy59nUdKAzfoQ85z62h8So";
                        strArr4[1] = "rlk5s9hHQFi3gmvg8c7PRJF1MfkgSAIS";
                        if (i14 < i12) {
                            break;
                        }
                        if (A02(i11)) {
                            i14++;
                            i11 += 2;
                        }
                        i11++;
                    }
                }
                if (i14 >= this.A01) {
                    return i14 != this.A01 && newBitOffset == 0;
                }
                return true;
            }
        } else {
            i11 = i13 + 1;
            while (i11 <= i14) {
                i12 = this.A01;
                String[] strArr5 = A04;
                String str5 = strArr5[5];
                str = strArr5[0];
                numBytes = str5.charAt(17);
                if (numBytes != str.charAt(17)) {
                    String[] strArr6 = A04;
                    strArr6[4] = "ru8g1XQo0WAy59nUdKAzfoQ85z62h8So";
                    strArr6[1] = "rlk5s9hHQFi3gmvg8c7PRJF1MfkgSAIS";
                    if (i14 < i12) {
                        break;
                        break;
                    }
                    if (A02(i11)) {
                        i14++;
                        i11 += 2;
                    }
                    i11++;
                }
            }
            if (i14 >= this.A01) {
                if (i14 != this.A01) {
                }
            }
            return true;
        }
        throw new RuntimeException();
    }
}
