package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzna {
    private static final zzmx zza;

    public static String zzd(byte[] bArr, int i10, int i11) throws zzkm {
        int length = bArr.length;
        if ((i10 | i11 | ((length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!zzmw.zzd(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (i10 < i12) {
            int i14 = i10 + 1;
            byte b11 = bArr[i10];
            if (zzmw.zzd(b11)) {
                int i15 = i13 + 1;
                cArr[i13] = (char) b11;
                i10 = i14;
                while (true) {
                    i13 = i15;
                    if (i10 >= i12) {
                        break;
                    }
                    byte b12 = bArr[i10];
                    if (!zzmw.zzd(b12)) {
                        break;
                    }
                    i10++;
                    i15 = i13 + 1;
                    cArr[i13] = (char) b12;
                }
            } else if (b11 < -32) {
                if (i14 >= i12) {
                    throw zzkm.zzc();
                }
                zzmw.zzc(b11, bArr[i14], cArr, i13);
                i10 = i14 + 1;
                i13++;
            } else if (b11 < -16) {
                if (i14 >= i12 - 1) {
                    throw zzkm.zzc();
                }
                int i16 = i14 + 1;
                zzmw.zzb(b11, bArr[i14], bArr[i16], cArr, i13);
                i10 = i16 + 1;
                i13++;
            } else {
                if (i14 >= i12 - 2) {
                    throw zzkm.zzc();
                }
                int i17 = i14 + 1;
                int i18 = i17 + 1;
                zzmw.zza(b11, bArr[i14], bArr[i17], bArr[i18], cArr, i13);
                i13 += 2;
                i10 = i18 + 1;
            }
        }
        return new String(cArr, 0, i13);
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 == 1) {
                byte b11 = bArr[i10];
                if (b10 <= -12 && b11 <= -65) {
                    return b10 ^ (b11 << 8);
                }
            } else {
                if (i12 != 2) {
                    throw new AssertionError();
                }
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
                    return ((b12 << 8) ^ b10) ^ (b13 << 16);
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i10, int i11) {
        return zza.zzb(bArr, i10, i11);
    }

    static {
        if (zzmv.zzx() && zzmv.zzy()) {
            int i10 = zzin.zza;
        }
        zza = new zzmy();
    }

    public static int zzb(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int length = charSequence.length();
        int i15 = i11 + i10;
        int i16 = 0;
        while (i16 < length && (i14 = i16 + i10) < i15 && (cCharAt = charSequence.charAt(i16)) < 128) {
            bArr[i14] = (byte) cCharAt;
            i16++;
        }
        if (i16 == length) {
            return i10 + length;
        }
        int i17 = i10 + i16;
        while (i16 < length) {
            char cCharAt2 = charSequence.charAt(i16);
            if (cCharAt2 < 128 && i17 < i15) {
                i12 = i17 + 1;
                bArr[i17] = (byte) cCharAt2;
            } else {
                if (cCharAt2 < 2048 && i17 <= i15 - 2) {
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                    i17 = i18 + 1;
                    bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                } else if ((cCharAt2 < 55296 || cCharAt2 > 57343) && i17 <= i15 - 3) {
                    int i19 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i20 = i19 + 1;
                    bArr[i19] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i12 = i20 + 1;
                    bArr[i20] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if (i17 <= i15 - 4) {
                        int i21 = i16 + 1;
                        if (i21 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i21);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i22 = i17 + 1;
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                int i23 = i22 + 1;
                                bArr[i22] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i24 = i23 + 1;
                                bArr[i23] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i17 = i24 + 1;
                                bArr[i24] = (byte) ((codePoint & 63) | 128);
                                i16 = i21;
                            } else {
                                i16 = i21;
                            }
                        }
                        throw new zzmz(i16 - 1, length);
                    }
                    if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i13 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i13)))) {
                        throw new zzmz(i16, length);
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                }
                i16++;
            }
            i17 = i12;
            i16++;
        }
        return i17;
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new zzmz(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }
}
