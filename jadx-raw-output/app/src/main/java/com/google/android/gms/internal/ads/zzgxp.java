package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzgxp {
    public static final /* synthetic */ int zza = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean zzb(double d10) {
        if (d10 > 0.0d && zzgxq.zzb(d10)) {
            long jZza = zzgxq.zza(d10);
            if ((jZza & ((-1) + jZza)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public static int zzc(double d10, RoundingMode roundingMode) {
        boolean zZzb;
        boolean z10 = false;
        zzgrc.zzb(d10 > 0.0d && zzgxq.zzb(d10), "x must be positive and finite");
        int exponent = Math.getExponent(d10);
        if (Math.getExponent(d10) < -1022) {
            return zzc(d10 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (zzgxo.zza[roundingMode.ordinal()]) {
            case 1:
                zzgxv.zzb(zzb(d10));
                return exponent;
            case 2:
                return exponent;
            case 3:
                z10 = !zzb(d10);
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z10 = exponent < 0;
                zZzb = zzb(d10);
                z10 &= !zZzb;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z10 = exponent >= 0;
                zZzb = zzb(d10);
                z10 &= !zZzb;
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z10 = true;
                }
                if (z10) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    public static long zza(double d10, RoundingMode roundingMode) {
        double dRint;
        long j10;
        long j11;
        int i10;
        boolean z10;
        if (zzgxq.zzb(d10)) {
            boolean z11 = true;
            switch (zzgxo.zza[roundingMode.ordinal()]) {
                case 1:
                    zzgxv.zzb(zzd(d10));
                    dRint = d10;
                    if ((-9.223372036854776E18d) - dRint < 1.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (dRint >= 9.223372036854776E18d) {
                        z11 = false;
                    }
                    if (z10 & z11) {
                        return (long) dRint;
                    }
                    String strValueOf = String.valueOf(roundingMode);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf.length());
                    sb2.append("rounded value is out of range for input ");
                    sb2.append(d10);
                    sb2.append(" and rounding mode ");
                    sb2.append(strValueOf);
                    throw new ArithmeticException(sb2.toString());
                case 2:
                    if (d10 < 0.0d && !zzd(d10)) {
                        j10 = (long) d10;
                        j11 = -1;
                        dRint = j10 + j11;
                    } else {
                        dRint = d10;
                    }
                    if ((-9.223372036854776E18d) - dRint < 1.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (dRint >= 9.223372036854776E18d) {
                        z11 = false;
                    }
                    if (z10 & z11) {
                        return (long) dRint;
                    }
                    String strValueOf2 = String.valueOf(roundingMode);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf2.length());
                    sb3.append("rounded value is out of range for input ");
                    sb3.append(d10);
                    sb3.append(" and rounding mode ");
                    sb3.append(strValueOf2);
                    throw new ArithmeticException(sb3.toString());
                case 3:
                    if (d10 > 0.0d && !zzd(d10)) {
                        j10 = (long) d10;
                        j11 = 1;
                        dRint = j10 + j11;
                    } else {
                        dRint = d10;
                    }
                    if ((-9.223372036854776E18d) - dRint < 1.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (dRint >= 9.223372036854776E18d) {
                        z11 = false;
                    }
                    if (z10 & z11) {
                        return (long) dRint;
                    }
                    String strValueOf3 = String.valueOf(roundingMode);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf3.length());
                    sb4.append("rounded value is out of range for input ");
                    sb4.append(d10);
                    sb4.append(" and rounding mode ");
                    sb4.append(strValueOf3);
                    throw new ArithmeticException(sb4.toString());
                case 4:
                    dRint = d10;
                    if ((-9.223372036854776E18d) - dRint < 1.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (dRint >= 9.223372036854776E18d) {
                        z11 = false;
                    }
                    if (z10 & z11) {
                        return (long) dRint;
                    }
                    String strValueOf4 = String.valueOf(roundingMode);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf4.length());
                    sb5.append("rounded value is out of range for input ");
                    sb5.append(d10);
                    sb5.append(" and rounding mode ");
                    sb5.append(strValueOf4);
                    throw new ArithmeticException(sb5.toString());
                case 5:
                    if (!zzd(d10)) {
                        j10 = (long) d10;
                        if (d10 > 0.0d) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        j11 = i10;
                        dRint = j10 + j11;
                    } else {
                        dRint = d10;
                    }
                    if ((-9.223372036854776E18d) - dRint < 1.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (dRint >= 9.223372036854776E18d) {
                        z11 = false;
                    }
                    if (z10 & z11) {
                        return (long) dRint;
                    }
                    String strValueOf5 = String.valueOf(roundingMode);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf5.length());
                    sb6.append("rounded value is out of range for input ");
                    sb6.append(d10);
                    sb6.append(" and rounding mode ");
                    sb6.append(strValueOf5);
                    throw new ArithmeticException(sb6.toString());
                case 6:
                    dRint = Math.rint(d10);
                    if ((-9.223372036854776E18d) - dRint < 1.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (dRint >= 9.223372036854776E18d) {
                        z11 = false;
                    }
                    if (z10 & z11) {
                        return (long) dRint;
                    }
                    String strValueOf6 = String.valueOf(roundingMode);
                    StringBuilder sb7 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf6.length());
                    sb7.append("rounded value is out of range for input ");
                    sb7.append(d10);
                    sb7.append(" and rounding mode ");
                    sb7.append(strValueOf6);
                    throw new ArithmeticException(sb7.toString());
                case 7:
                    dRint = Math.rint(d10);
                    if (Math.abs(d10 - dRint) == 0.5d) {
                        dRint = d10 + Math.copySign(0.5d, d10);
                    }
                    if ((-9.223372036854776E18d) - dRint < 1.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (dRint >= 9.223372036854776E18d) {
                        z11 = false;
                    }
                    if (z10 & z11) {
                        return (long) dRint;
                    }
                    String strValueOf7 = String.valueOf(roundingMode);
                    StringBuilder sb8 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf7.length());
                    sb8.append("rounded value is out of range for input ");
                    sb8.append(d10);
                    sb8.append(" and rounding mode ");
                    sb8.append(strValueOf7);
                    throw new ArithmeticException(sb8.toString());
                case 8:
                    dRint = Math.rint(d10);
                    if (Math.abs(d10 - dRint) == 0.5d) {
                        dRint = d10;
                    }
                    if ((-9.223372036854776E18d) - dRint < 1.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (dRint >= 9.223372036854776E18d) {
                        z11 = false;
                    }
                    if (z10 & z11) {
                        return (long) dRint;
                    }
                    String strValueOf8 = String.valueOf(roundingMode);
                    StringBuilder sb9 = new StringBuilder(String.valueOf(d10).length() + 59 + strValueOf8.length());
                    sb9.append("rounded value is out of range for input ");
                    sb9.append(d10);
                    sb9.append(" and rounding mode ");
                    sb9.append(strValueOf8);
                    throw new ArithmeticException(sb9.toString());
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    public static boolean zzd(double d10) {
        if (zzgxq.zzb(d10) && (d10 == 0.0d || 52 - Long.numberOfTrailingZeros(zzgxq.zza(d10)) <= Math.getExponent(d10))) {
            return true;
        }
        return false;
    }
}
