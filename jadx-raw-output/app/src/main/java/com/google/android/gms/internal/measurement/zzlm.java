package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i10, int i11, zzlj zzljVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = z10;
        boolean z12 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i10))));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm = zzip.zzm(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzioVar.zzb));
                unsafe.putInt(obj, j11, i13);
                return iZzm;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj = zzip.zzj(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzioVar.zza));
                unsafe.putInt(obj, j11, i13);
                return iZzj;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(zzip.zzn(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 8;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(zzip.zzb(bArr, i10)));
                unsafe.putInt(obj, j11, i13);
                return i10 + 4;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm2 = zzip.zzm(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(zzioVar.zzb != 0));
                unsafe.putInt(obj, j11, i13);
                return iZzm2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iZzj2 = zzip.zzj(bArr, i10, zzioVar);
                int i18 = zzioVar.zza;
                if (i18 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !zzna.zzf(bArr, iZzj2, iZzj2 + i18)) {
                        throw zzkm.zzc();
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iZzj2, i18, zzkk.zzb));
                    iZzj2 += i18;
                }
                unsafe.putInt(obj, j11, i13);
                return iZzj2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                int iZzd = zzip.zzd(zzE(i17), bArr, i10, i11, zzioVar);
                Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object == null) {
                    unsafe.putObject(obj, j10, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j10, zzkk.zzg(object, zzioVar.zzc));
                }
                unsafe.putInt(obj, j11, i13);
                return iZzd;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iZza = zzip.zza(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, zzioVar.zzc);
                unsafe.putInt(obj, j11, i13);
                return iZza;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj3 = zzip.zzj(bArr, i10, zzioVar);
                int i19 = zzioVar.zza;
                zzkg zzkgVarZzD = zzD(i17);
                if (zzkgVarZzD == null || zzkgVarZzD.zza(i19)) {
                    unsafe.putObject(obj, j10, Integer.valueOf(i19));
                    unsafe.putInt(obj, j11, i13);
                } else {
                    zzd(obj).zzh(i12, Long.valueOf(i19));
                }
                return iZzj3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iZzj4 = zzip.zzj(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                unsafe.putInt(obj, j11, i13);
                return iZzj4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iZzm3 = zzip.zzm(bArr, i10, zzioVar);
                unsafe.putObject(obj, j10, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                unsafe.putInt(obj, j11, i13);
                return iZzm3;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                int iZzc = zzip.zzc(zzE(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzioVar);
                Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                if (object2 == null) {
                    unsafe.putObject(obj, j10, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j10, zzkk.zzg(object2, zzioVar.zzc));
                }
                unsafe.putInt(obj, j11, i13);
                return iZzc;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02db A[PHI: r0 r19 r26 r27 r28
  0x02db: PHI (r0v20 int) = (r0v15 int), (r0v18 int), (r0v22 int) binds: [B:114:0x0345, B:109:0x0322, B:101:0x02d9] A[DONT_GENERATE, DONT_INLINE]
  0x02db: PHI (r19v6 int) = (r19v4 int), (r19v4 int), (r19v8 int) binds: [B:114:0x0345, B:109:0x0322, B:101:0x02d9] A[DONT_GENERATE, DONT_INLINE]
  0x02db: PHI (r26v3 int) = (r26v1 int), (r26v1 int), (r26v4 int) binds: [B:114:0x0345, B:109:0x0322, B:101:0x02d9] A[DONT_GENERATE, DONT_INLINE]
  0x02db: PHI (r27v2 int) = (r27v0 int), (r27v0 int), (r27v3 int) binds: [B:114:0x0345, B:109:0x0322, B:101:0x02d9] A[DONT_GENERATE, DONT_INLINE]
  0x02db: PHI (r28v6 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:114:0x0345, B:109:0x0322, B:101:0x02d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x02f1 A[PHI: r0 r19 r26 r27 r28
  0x02f1: PHI (r0v19 int) = (r0v15 int), (r0v18 int), (r0v22 int) binds: [B:114:0x0345, B:109:0x0322, B:101:0x02d9] A[DONT_GENERATE, DONT_INLINE]
  0x02f1: PHI (r19v5 int) = (r19v4 int), (r19v4 int), (r19v8 int) binds: [B:114:0x0345, B:109:0x0322, B:101:0x02d9] A[DONT_GENERATE, DONT_INLINE]
  0x02f1: PHI (r26v2 int) = (r26v1 int), (r26v1 int), (r26v4 int) binds: [B:114:0x0345, B:109:0x0322, B:101:0x02d9] A[DONT_GENERATE, DONT_INLINE]
  0x02f1: PHI (r27v1 int) = (r27v0 int), (r27v0 int), (r27v3 int) binds: [B:114:0x0345, B:109:0x0322, B:101:0x02d9] A[DONT_GENERATE, DONT_INLINE]
  0x02f1: PHI (r28v5 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:114:0x0345, B:109:0x0322, B:101:0x02d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x008f. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i10, int i11, zzio zzioVar) throws IOException {
        int i12;
        int iZzk;
        int i13;
        int i14;
        Unsafe unsafe;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Unsafe unsafe2;
        int i21;
        int i22;
        Unsafe unsafe3;
        int i23;
        Unsafe unsafe4;
        this = this;
        obj = obj;
        bArr = bArr;
        i11 = i11;
        zzioVar = zzioVar;
        Unsafe unsafe5 = zzb;
        int i24 = -1;
        int i25 = 1048575;
        int iZzi = i10;
        int i26 = 1048575;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        while (iZzi < i11) {
            int i30 = iZzi + 1;
            byte b10 = bArr[iZzi];
            if (b10 < 0) {
                iZzk = zzip.zzk(b10, bArr, i30, zzioVar);
                i12 = zzioVar.zza;
            } else {
                i12 = b10;
                iZzk = i30;
            }
            int i31 = i12 >>> 3;
            int i32 = i12 & 7;
            int iZzx = i31 > i27 ? this.zzx(i31, i28 / 3) : this.zzw(i31);
            if (iZzx == i24) {
                i13 = iZzk;
                i14 = i31;
                unsafe = unsafe5;
                i15 = i24;
                i16 = 0;
            } else {
                int[] iArr = this.zzc;
                int i33 = iArr[iZzx + 1];
                int iZzA = zzA(i33);
                Unsafe unsafe6 = unsafe5;
                long j10 = i33 & i25;
                if (iZzA <= 17) {
                    int i34 = iArr[iZzx + 2];
                    int i35 = 1 << (i34 >>> 20);
                    int i36 = i34 & 1048575;
                    if (i36 != i26) {
                        if (i26 != 1048575) {
                            long j11 = i26;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(obj, j11, i29);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i36 != 1048575) {
                            i29 = unsafe4.getInt(obj, i36);
                        }
                        unsafe2 = unsafe4;
                        i26 = i36;
                    } else {
                        unsafe2 = unsafe6;
                    }
                    switch (iZzA) {
                        case 0:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            i23 = iZzk;
                            if (i32 != 1) {
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                zzmv.zzo(obj, j10, Double.longBitsToDouble(zzip.zzn(bArr, i23)));
                                iZzi = i23 + 8;
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 1:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            i23 = iZzk;
                            if (i32 != 5) {
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                zzmv.zzp(obj, j10, Float.intBitsToFloat(zzip.zzb(bArr, i23)));
                                iZzi = i23 + 4;
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            i23 = iZzk;
                            if (i32 != 0) {
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                int iZzm = zzip.zzm(bArr, i23, zzioVar);
                                unsafe3.putLong(obj, j10, zzioVar.zzb);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                iZzi = iZzm;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            i23 = iZzk;
                            if (i32 != 0) {
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = zzip.zzj(bArr, i23, zzioVar);
                                unsafe3.putInt(obj, j10, zzioVar.zza);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 1) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                unsafe3.putLong(obj, j10, zzip.zzn(bArr, iZzk));
                                iZzi = iZzk + 8;
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 5) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                unsafe3.putInt(obj, j10, zzip.zzb(bArr, iZzk));
                                iZzi = iZzk + 4;
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 7:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 0) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = zzip.zzm(bArr, iZzk, zzioVar);
                                zzmv.zzm(obj, j10, zzioVar.zzb != 0);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 8:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 2) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = (i33 & 536870912) == 0 ? zzip.zzg(bArr, iZzk, zzioVar) : zzip.zzh(bArr, iZzk, zzioVar);
                                unsafe3.putObject(obj, j10, zzioVar.zzc);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 9:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 2) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = zzip.zzd(this.zzE(i22), bArr, iZzk, i11, zzioVar);
                                Object object = unsafe3.getObject(obj, j10);
                                if (object == null) {
                                    unsafe3.putObject(obj, j10, zzioVar.zzc);
                                } else {
                                    unsafe3.putObject(obj, j10, zzkk.zzg(object, zzioVar.zzc));
                                }
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 10:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 2) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = zzip.zza(bArr, iZzk, zzioVar);
                                unsafe3.putObject(obj, j10, zzioVar.zzc);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 12:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 0) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = zzip.zzj(bArr, iZzk, zzioVar);
                                unsafe3.putInt(obj, j10, zzioVar.zza);
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 15:
                            i17 = 1048575;
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            if (i32 != 0) {
                                i23 = iZzk;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                iZzi = zzip.zzj(bArr, iZzk, zzioVar);
                                unsafe3.putInt(obj, j10, zzjf.zzb(zzioVar.zza));
                                i29 |= i35;
                                unsafe5 = unsafe3;
                                i28 = i22;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        case 16:
                            if (i32 != 0) {
                                i21 = i26;
                                i14 = i31;
                                unsafe3 = unsafe2;
                                i23 = iZzk;
                                i22 = iZzx;
                                i13 = i23;
                                unsafe = unsafe3;
                                i16 = i22;
                                i26 = i21;
                                i15 = -1;
                            } else {
                                int iZzm2 = zzip.zzm(bArr, iZzk, zzioVar);
                                i21 = i26;
                                i14 = i31;
                                i17 = 1048575;
                                unsafe2.putLong(obj, j10, zzjf.zzc(zzioVar.zzb));
                                i29 |= i35;
                                unsafe5 = unsafe2;
                                i28 = iZzx;
                                iZzi = iZzm2;
                                i26 = i21;
                                i27 = i14;
                                i25 = i17;
                                i24 = -1;
                            }
                            break;
                        default:
                            i21 = i26;
                            i22 = iZzx;
                            i14 = i31;
                            unsafe3 = unsafe2;
                            i23 = iZzk;
                            i13 = i23;
                            unsafe = unsafe3;
                            i16 = i22;
                            i26 = i21;
                            i15 = -1;
                            break;
                    }
                } else {
                    i14 = i31;
                    int i37 = iZzk;
                    i17 = 1048575;
                    int i38 = i26;
                    if (iZzA != 27) {
                        i16 = iZzx;
                        if (iZzA <= 49) {
                            i19 = i29;
                            i20 = i38;
                            unsafe = unsafe6;
                            i15 = -1;
                            iZzi = zzv(obj, bArr, i37, i11, i12, i14, i32, i16, i33, iZzA, j10, zzioVar);
                            if (iZzi != i37) {
                                i24 = i15;
                                i27 = i14;
                                i28 = i16;
                                i29 = i19;
                                i26 = i20;
                            } else {
                                i13 = iZzi;
                                i29 = i19;
                                i26 = i20;
                            }
                        } else {
                            i18 = i37;
                            i19 = i29;
                            unsafe = unsafe6;
                            i20 = i38;
                            i15 = -1;
                            if (iZzA == 50) {
                                if (i32 == 2) {
                                    iZzi = zzs(obj, bArr, i18, i11, i16, j10, zzioVar);
                                    if (iZzi != i18) {
                                        i24 = i15;
                                        i27 = i14;
                                        i28 = i16;
                                        i29 = i19;
                                        i26 = i20;
                                    } else {
                                        i13 = iZzi;
                                    }
                                }
                                i29 = i19;
                                i26 = i20;
                            } else {
                                iZzi = zzt(obj, bArr, i18, i11, i12, i14, i32, i33, iZzA, j10, i16, zzioVar);
                                if (iZzi != i18) {
                                    i24 = i15;
                                    i27 = i14;
                                    i28 = i16;
                                    i29 = i19;
                                    i26 = i20;
                                } else {
                                    i13 = iZzi;
                                    i29 = i19;
                                    i26 = i20;
                                }
                            }
                        }
                        unsafe5 = unsafe;
                        i25 = 1048575;
                    } else if (i32 == 2) {
                        zzkj zzkjVarZzd = (zzkj) unsafe6.getObject(obj, j10);
                        if (!zzkjVarZzd.zzc()) {
                            int size = zzkjVarZzd.size();
                            zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj, j10, zzkjVarZzd);
                        }
                        iZzi = zzip.zze(this.zzE(iZzx), i12, bArr, i37, i11, zzkjVarZzd, zzioVar);
                        unsafe5 = unsafe6;
                        i29 = i29;
                        i26 = i38;
                        i27 = i14;
                        i28 = iZzx;
                        i25 = i17;
                        i24 = -1;
                    } else {
                        i16 = iZzx;
                        i18 = i37;
                        i19 = i29;
                        unsafe = unsafe6;
                        i20 = i38;
                        i15 = -1;
                    }
                    i13 = i18;
                    i29 = i19;
                    i26 = i20;
                }
            }
            iZzi = zzip.zzi(i12, bArr, i13, i11, zzd(obj), zzioVar);
            i24 = i15;
            i27 = i14;
            i28 = i16;
            unsafe5 = unsafe;
            i25 = 1048575;
        }
        int i39 = i29;
        Unsafe unsafe7 = unsafe5;
        if (i26 != i25) {
            unsafe7.putInt(obj, i26, i39);
        }
        if (iZzi == i11) {
            return iZzi;
        }
        throw zzkm.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, zzio zzioVar) throws IOException {
        int i17;
        int i18;
        int i19;
        int i20;
        int iZzj;
        int iZzj2 = i10;
        Unsafe unsafe = zzb;
        zzkj zzkjVarZzd = (zzkj) unsafe.getObject(obj, j11);
        if (!zzkjVarZzd.zzc()) {
            int size = zzkjVarZzd.size();
            zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, zzkjVarZzd);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVarZzd;
                    int iZzj3 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i21 = zzioVar.zza + iZzj3;
                    while (iZzj3 < i21) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i21) {
                        return iZzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVarZzd;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i10)));
                    while (true) {
                        i17 = iZzj2 + 8;
                        if (i17 < i11) {
                            iZzj2 = zzip.zzj(bArr, i17, zzioVar);
                            if (i12 == zzioVar.zza) {
                                zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj2)));
                            }
                        }
                    }
                    return i17;
                }
                return iZzj2;
            case 19:
            case 36:
                if (i14 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVarZzd;
                    int iZzj4 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i22 = zzioVar.zza + iZzj4;
                    while (iZzj4 < i22) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i22) {
                        return iZzj4;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVarZzd;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i10)));
                    while (true) {
                        i18 = iZzj2 + 4;
                        if (i18 < i11) {
                            iZzj2 = zzip.zzj(bArr, i18, zzioVar);
                            if (i12 == zzioVar.zza) {
                                zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj2)));
                            }
                        }
                    }
                    return i18;
                }
                return iZzj2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    zzky zzkyVar = (zzky) zzkjVarZzd;
                    int iZzj5 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i23 = zzioVar.zza + iZzj5;
                    while (iZzj5 < i23) {
                        iZzj5 = zzip.zzm(bArr, iZzj5, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (iZzj5 == i23) {
                        return iZzj5;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVarZzd;
                    int iZzm = zzip.zzm(bArr, iZzj2, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (iZzm < i11) {
                        int iZzj6 = zzip.zzj(bArr, iZzm, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzip.zzm(bArr, iZzj6, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return zzip.zzf(bArr, iZzj2, zzkjVarZzd, zzioVar);
                }
                if (i14 == 0) {
                    return zzip.zzl(i12, bArr, i10, i11, zzkjVarZzd, zzioVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVarZzd;
                    int iZzj7 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i24 = zzioVar.zza + iZzj7;
                    while (iZzj7 < i24) {
                        zzkyVar3.zzg(zzip.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i24) {
                        return iZzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVarZzd;
                    zzkyVar4.zzg(zzip.zzn(bArr, i10));
                    while (true) {
                        i19 = iZzj2 + 8;
                        if (i19 < i11) {
                            iZzj2 = zzip.zzj(bArr, i19, zzioVar);
                            if (i12 == zzioVar.zza) {
                                zzkyVar4.zzg(zzip.zzn(bArr, iZzj2));
                            }
                        }
                    }
                    return i19;
                }
                return iZzj2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    zzkd zzkdVar = (zzkd) zzkjVarZzd;
                    int iZzj8 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i25 = zzioVar.zza + iZzj8;
                    while (iZzj8 < i25) {
                        zzkdVar.zzh(zzip.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i25) {
                        return iZzj8;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVarZzd;
                    zzkdVar2.zzh(zzip.zzb(bArr, i10));
                    while (true) {
                        i20 = iZzj2 + 4;
                        if (i20 < i11) {
                            iZzj2 = zzip.zzj(bArr, i20, zzioVar);
                            if (i12 == zzioVar.zza) {
                                zzkdVar2.zzh(zzip.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i20;
                }
                return iZzj2;
            case 25:
            case 42:
                if (i14 == 2) {
                    zziq zziqVar = (zziq) zzkjVarZzd;
                    iZzj = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i26 = zzioVar.zza + iZzj;
                    while (iZzj < i26) {
                        iZzj = zzip.zzm(bArr, iZzj, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (iZzj != i26) {
                        throw zzkm.zzf();
                    }
                    return iZzj;
                }
                if (i14 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVarZzd;
                    int iZzm2 = zzip.zzm(bArr, iZzj2, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (iZzm2 < i11) {
                        int iZzj9 = zzip.zzj(bArr, iZzm2, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzip.zzm(bArr, iZzj9, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int iZzj10 = zzip.zzj(bArr, iZzj2, zzioVar);
                        int i27 = zzioVar.zza;
                        if (i27 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i27 == 0) {
                            zzkjVarZzd.add("");
                        } else {
                            zzkjVarZzd.add(new String(bArr, iZzj10, i27, zzkk.zzb));
                            iZzj10 += i27;
                        }
                        while (iZzj10 < i11) {
                            int iZzj11 = zzip.zzj(bArr, iZzj10, zzioVar);
                            if (i12 != zzioVar.zza) {
                                return iZzj10;
                            }
                            iZzj10 = zzip.zzj(bArr, iZzj11, zzioVar);
                            int i28 = zzioVar.zza;
                            if (i28 < 0) {
                                throw zzkm.zzd();
                            }
                            if (i28 == 0) {
                                zzkjVarZzd.add("");
                            } else {
                                zzkjVarZzd.add(new String(bArr, iZzj10, i28, zzkk.zzb));
                                iZzj10 += i28;
                            }
                        }
                        return iZzj10;
                    }
                    int iZzj12 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i29 = zzioVar.zza;
                    if (i29 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i29 == 0) {
                        zzkjVarZzd.add("");
                    } else {
                        int i30 = iZzj12 + i29;
                        if (!zzna.zzf(bArr, iZzj12, i30)) {
                            throw zzkm.zzc();
                        }
                        zzkjVarZzd.add(new String(bArr, iZzj12, i29, zzkk.zzb));
                        iZzj12 = i30;
                    }
                    while (iZzj12 < i11) {
                        int iZzj13 = zzip.zzj(bArr, iZzj12, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzip.zzj(bArr, iZzj13, zzioVar);
                        int i31 = zzioVar.zza;
                        if (i31 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i31 == 0) {
                            zzkjVarZzd.add("");
                        } else {
                            int i32 = iZzj12 + i31;
                            if (!zzna.zzf(bArr, iZzj12, i32)) {
                                throw zzkm.zzc();
                            }
                            zzkjVarZzd.add(new String(bArr, iZzj12, i31, zzkk.zzb));
                            iZzj12 = i32;
                        }
                    }
                    return iZzj12;
                }
                return iZzj2;
            case 27:
                if (i14 == 2) {
                    return zzip.zze(zzE(i15), i12, bArr, i10, i11, zzkjVarZzd, zzioVar);
                }
                return iZzj2;
            case 28:
                if (i14 == 2) {
                    int iZzj14 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i33 = zzioVar.zza;
                    if (i33 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i33 > bArr.length - iZzj14) {
                        throw zzkm.zzf();
                    }
                    if (i33 == 0) {
                        zzkjVarZzd.add(zzjb.zzb);
                    } else {
                        zzkjVarZzd.add(zzjb.zzl(bArr, iZzj14, i33));
                        iZzj14 += i33;
                    }
                    while (iZzj14 < i11) {
                        int iZzj15 = zzip.zzj(bArr, iZzj14, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzj14;
                        }
                        iZzj14 = zzip.zzj(bArr, iZzj15, zzioVar);
                        int i34 = zzioVar.zza;
                        if (i34 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i34 > bArr.length - iZzj14) {
                            throw zzkm.zzf();
                        }
                        if (i34 == 0) {
                            zzkjVarZzd.add(zzjb.zzb);
                        } else {
                            zzkjVarZzd.add(zzjb.zzl(bArr, iZzj14, i34));
                            iZzj14 += i34;
                        }
                    }
                    return iZzj14;
                }
                return iZzj2;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iZzj = zzip.zzl(i12, bArr, i10, i11, zzkjVarZzd, zzioVar);
                    }
                    return iZzj2;
                }
                iZzj = zzip.zzf(bArr, iZzj2, zzkjVarZzd, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object objZzC = zzlw.zzC(i13, zzkjVarZzd, zzD(i15), zzmmVar, this.zzn);
                if (objZzC != null) {
                    zzkcVar.zzc = (zzmm) objZzC;
                    return iZzj;
                }
                return iZzj;
            case 33:
            case 47:
                if (i14 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVarZzd;
                    int iZzj16 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i35 = zzioVar.zza + iZzj16;
                    while (iZzj16 < i35) {
                        iZzj16 = zzip.zzj(bArr, iZzj16, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (iZzj16 == i35) {
                        return iZzj16;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVarZzd;
                    int iZzj17 = zzip.zzj(bArr, iZzj2, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (iZzj17 < i11) {
                        int iZzj18 = zzip.zzj(bArr, iZzj17, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzip.zzj(bArr, iZzj18, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return iZzj17;
                }
                return iZzj2;
            case 34:
            case 48:
                if (i14 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVarZzd;
                    int iZzj19 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i36 = zzioVar.zza + iZzj19;
                    while (iZzj19 < i36) {
                        iZzj19 = zzip.zzm(bArr, iZzj19, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (iZzj19 == i36) {
                        return iZzj19;
                    }
                    throw zzkm.zzf();
                }
                if (i14 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVarZzd;
                    int iZzm3 = zzip.zzm(bArr, iZzj2, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (iZzm3 < i11) {
                        int iZzj20 = zzip.zzj(bArr, iZzm3, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzip.zzm(bArr, iZzj20, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i14 == 3) {
                    zzlu zzluVarZzE = zzE(i15);
                    int i37 = (i12 & (-8)) | 4;
                    int iZzc = zzip.zzc(zzluVarZzE, bArr, i10, i11, i37, zzioVar);
                    zzkjVarZzd.add(zzioVar.zzc);
                    while (iZzc < i11) {
                        int iZzj21 = zzip.zzj(bArr, iZzc, zzioVar);
                        if (i12 != zzioVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzip.zzc(zzluVarZzE, bArr, iZzj21, i11, i37, zzioVar);
                        zzkjVarZzd.add(zzioVar.zzc);
                    }
                    return iZzc;
                }
                return iZzj2;
        }
    }

    public final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zzio zzioVar) throws IOException {
        Unsafe unsafe;
        Object obj2;
        zzlm<T> zzlmVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zzio zzioVar2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        zzlm<T> zzlmVar2 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i27 = i11;
        i12 = i12;
        zzio zzioVar3 = zzioVar;
        Unsafe unsafe2 = zzb;
        int iZzi = i10;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = -1;
        int i32 = 1048575;
        while (true) {
            if (iZzi < i27) {
                int i33 = iZzi + 1;
                byte b10 = bArr2[iZzi];
                if (b10 < 0) {
                    int iZzk = zzip.zzk(b10, bArr2, i33, zzioVar3);
                    i13 = zzioVar3.zza;
                    i33 = iZzk;
                } else {
                    i13 = b10;
                }
                int i34 = i13 >>> 3;
                int i35 = i13 & 7;
                int iZzx = i34 > i31 ? zzlmVar2.zzx(i34, i29 / 3) : zzlmVar2.zzw(i34);
                if (iZzx == -1) {
                    i14 = i34;
                    i15 = i33;
                    i16 = i13;
                    i17 = i30;
                    unsafe = unsafe2;
                    i12 = i12;
                    i18 = 0;
                } else {
                    int[] iArr = zzlmVar2.zzc;
                    int i36 = iArr[iZzx + 1];
                    int iZzA = zzA(i36);
                    int i37 = i33;
                    long j10 = i36 & 1048575;
                    if (iZzA <= 17) {
                        int i38 = iArr[iZzx + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = i38 & 1048575;
                        if (i40 != i32) {
                            if (i32 != 1048575) {
                                unsafe2.putInt(obj3, i32, i30);
                            }
                            i30 = unsafe2.getInt(obj3, i40);
                            i32 = i40;
                        } else {
                            i32 = i32;
                        }
                        int i41 = i30;
                        switch (iZzA) {
                            case 0:
                                i19 = iZzx;
                                i14 = i34;
                                i20 = i37;
                                if (i35 == 1) {
                                    zzmv.zzo(obj3, j10, Double.longBitsToDouble(zzip.zzn(bArr2, i20)));
                                    iZzi = i20 + 8;
                                    i30 = i41 | i39;
                                    i31 = i14;
                                    i29 = i19;
                                    i28 = i13;
                                    i32 = i32;
                                    i27 = i11;
                                } else {
                                    i37 = i20;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 1:
                                i19 = iZzx;
                                i14 = i34;
                                i20 = i37;
                                if (i35 == 5) {
                                    zzmv.zzp(obj3, j10, Float.intBitsToFloat(zzip.zzb(bArr2, i20)));
                                    iZzi = i20 + 4;
                                    i30 = i41 | i39;
                                    i31 = i14;
                                    i29 = i19;
                                    i28 = i13;
                                    i32 = i32;
                                    i27 = i11;
                                } else {
                                    i37 = i20;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 2:
                            case 3:
                                i19 = iZzx;
                                i14 = i34;
                                i20 = i37;
                                if (i35 == 0) {
                                    int iZzm = zzip.zzm(bArr2, i20, zzioVar3);
                                    unsafe2.putLong(obj, j10, zzioVar3.zzb);
                                    i30 = i41 | i39;
                                    i31 = i14;
                                    iZzi = iZzm;
                                    i29 = i19;
                                    i28 = i13;
                                    i32 = i32;
                                    i27 = i11;
                                } else {
                                    i37 = i20;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 4:
                            case 11:
                                i19 = iZzx;
                                i14 = i34;
                                i20 = i37;
                                if (i35 == 0) {
                                    iZzi = zzip.zzj(bArr2, i20, zzioVar3);
                                    unsafe2.putInt(obj3, j10, zzioVar3.zza);
                                    i30 = i41 | i39;
                                    i31 = i14;
                                    i29 = i19;
                                    i28 = i13;
                                    i32 = i32;
                                    i27 = i11;
                                } else {
                                    i37 = i20;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 5:
                            case 14:
                                int i42 = i13;
                                i14 = i34;
                                if (i35 == 1) {
                                    i19 = iZzx;
                                    i13 = i42;
                                    i20 = i37;
                                    unsafe2.putLong(obj, j10, zzip.zzn(bArr2, i37));
                                    iZzi = i20 + 8;
                                    i30 = i41 | i39;
                                    i31 = i14;
                                    i29 = i19;
                                    i28 = i13;
                                    i32 = i32;
                                    i27 = i11;
                                } else {
                                    i19 = iZzx;
                                    i13 = i42;
                                    i37 = i37;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 6:
                            case 13:
                                i21 = i13;
                                i14 = i34;
                                i22 = i37;
                                if (i35 == 5) {
                                    unsafe2.putInt(obj3, j10, zzip.zzb(bArr2, i22));
                                    iZzi = i22 + 4;
                                    i30 = i41 | i39;
                                    i29 = iZzx;
                                    i28 = i21;
                                    i31 = i14;
                                    i12 = i12;
                                } else {
                                    i19 = iZzx;
                                    i37 = i22;
                                    i13 = i21;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 7:
                                i21 = i13;
                                i14 = i34;
                                i22 = i37;
                                if (i35 == 0) {
                                    iZzi = zzip.zzm(bArr2, i22, zzioVar3);
                                    zzmv.zzm(obj3, j10, zzioVar3.zzb != 0);
                                    i30 = i41 | i39;
                                    i29 = iZzx;
                                    i28 = i21;
                                    i31 = i14;
                                    i12 = i12;
                                } else {
                                    i19 = iZzx;
                                    i37 = i22;
                                    i13 = i21;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 8:
                                i21 = i13;
                                i14 = i34;
                                i22 = i37;
                                if (i35 == 2) {
                                    iZzi = (536870912 & i36) == 0 ? zzip.zzg(bArr2, i22, zzioVar3) : zzip.zzh(bArr2, i22, zzioVar3);
                                    unsafe2.putObject(obj3, j10, zzioVar3.zzc);
                                    i30 = i41 | i39;
                                    i29 = iZzx;
                                    i28 = i21;
                                    i31 = i14;
                                    i12 = i12;
                                } else {
                                    i19 = iZzx;
                                    i37 = i22;
                                    i13 = i21;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 9:
                                i23 = iZzx;
                                i21 = i13;
                                i14 = i34;
                                i24 = i37;
                                if (i35 == 2) {
                                    iZzi = zzip.zzd(zzlmVar2.zzE(i23), bArr2, i24, i27, zzioVar3);
                                    if ((i41 & i39) == 0) {
                                        unsafe2.putObject(obj3, j10, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j10, zzkk.zzg(unsafe2.getObject(obj3, j10), zzioVar3.zzc));
                                    }
                                    i30 = i41 | i39;
                                    i31 = i14;
                                    i29 = i23;
                                    i28 = i21;
                                    i12 = i12;
                                } else {
                                    i37 = i24;
                                    i19 = i23;
                                    i13 = i21;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 10:
                                i23 = iZzx;
                                i21 = i13;
                                i14 = i34;
                                i24 = i37;
                                if (i35 == 2) {
                                    iZzi = zzip.zza(bArr2, i24, zzioVar3);
                                    unsafe2.putObject(obj3, j10, zzioVar3.zzc);
                                    i30 = i41 | i39;
                                    i31 = i14;
                                    i29 = i23;
                                    i28 = i21;
                                    i12 = i12;
                                } else {
                                    i37 = i24;
                                    i19 = i23;
                                    i13 = i21;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 12:
                                i23 = iZzx;
                                i21 = i13;
                                i14 = i34;
                                i24 = i37;
                                if (i35 == 0) {
                                    iZzi = zzip.zzj(bArr2, i24, zzioVar3);
                                    int i43 = zzioVar3.zza;
                                    zzkg zzkgVarZzD = zzlmVar2.zzD(i23);
                                    if (zzkgVarZzD == null || zzkgVarZzD.zza(i43)) {
                                        unsafe2.putInt(obj3, j10, i43);
                                        i30 = i41 | i39;
                                        i31 = i14;
                                    } else {
                                        zzd(obj).zzh(i21, Long.valueOf(i43));
                                        i31 = i14;
                                        i30 = i41;
                                    }
                                    i29 = i23;
                                    i28 = i21;
                                    i12 = i12;
                                } else {
                                    i37 = i24;
                                    i19 = i23;
                                    i13 = i21;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 15:
                                i23 = iZzx;
                                i21 = i13;
                                i14 = i34;
                                i24 = i37;
                                if (i35 == 0) {
                                    iZzi = zzip.zzj(bArr2, i24, zzioVar3);
                                    unsafe2.putInt(obj3, j10, zzjf.zzb(zzioVar3.zza));
                                    i30 = i41 | i39;
                                    i31 = i14;
                                    i29 = i23;
                                    i28 = i21;
                                    i12 = i12;
                                } else {
                                    i37 = i24;
                                    i19 = i23;
                                    i13 = i21;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            case 16:
                                if (i35 == 0) {
                                    int iZzm2 = zzip.zzm(bArr2, i37, zzioVar3);
                                    i23 = iZzx;
                                    i21 = i13;
                                    unsafe2.putLong(obj, j10, zzjf.zzc(zzioVar3.zzb));
                                    i30 = i41 | i39;
                                    i31 = i34;
                                    iZzi = iZzm2;
                                    i29 = i23;
                                    i28 = i21;
                                    i12 = i12;
                                } else {
                                    i14 = i34;
                                    i19 = iZzx;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                            default:
                                i19 = iZzx;
                                i14 = i34;
                                i20 = i37;
                                if (i35 == 3) {
                                    iZzi = zzip.zzc(zzlmVar2.zzE(i19), bArr, i20, i11, (i14 << 3) | 4, zzioVar);
                                    if ((i41 & i39) == 0) {
                                        unsafe2.putObject(obj3, j10, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j10, zzkk.zzg(unsafe2.getObject(obj3, j10), zzioVar3.zzc));
                                    }
                                    i30 = i41 | i39;
                                    bArr2 = bArr;
                                    i31 = i14;
                                    i29 = i19;
                                    i28 = i13;
                                    i32 = i32;
                                    i27 = i11;
                                } else {
                                    i37 = i20;
                                    i12 = i12;
                                    i17 = i41;
                                    unsafe = unsafe2;
                                    i16 = i13;
                                    i15 = i37;
                                    i32 = i32;
                                    i18 = i19;
                                }
                                break;
                        }
                    } else {
                        int i44 = iZzx;
                        int i45 = i13;
                        if (iZzA != 27) {
                            i17 = i30;
                            i25 = i32;
                            if (iZzA <= 49) {
                                i14 = i34;
                                unsafe = unsafe2;
                                i18 = i44;
                                iZzi = zzv(obj, bArr, i37, i11, i45, i14, i35, i44, i36, iZzA, j10, zzioVar);
                                if (iZzi != i37) {
                                    zzlmVar2 = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    i31 = i14;
                                    i27 = i11;
                                    i12 = i12;
                                    zzioVar3 = zzioVar;
                                    i28 = i45;
                                    i29 = i18;
                                    i30 = i17;
                                    i32 = i25;
                                    unsafe2 = unsafe;
                                } else {
                                    i15 = iZzi;
                                    i16 = i45;
                                    i32 = i25;
                                }
                            } else {
                                i14 = i34;
                                unsafe = unsafe2;
                                i26 = i37;
                                i18 = i44;
                                if (iZzA != 50) {
                                    iZzi = zzt(obj, bArr, i26, i11, i45, i14, i35, i36, iZzA, j10, i18, zzioVar);
                                    if (iZzi != i26) {
                                        zzlmVar2 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i31 = i14;
                                        i27 = i11;
                                        i12 = i12;
                                        zzioVar3 = zzioVar;
                                        i28 = i45;
                                        i29 = i18;
                                        i30 = i17;
                                        i32 = i25;
                                        unsafe2 = unsafe;
                                    } else {
                                        i15 = iZzi;
                                        i16 = i45;
                                        i32 = i25;
                                    }
                                } else if (i35 == 2) {
                                    iZzi = zzs(obj, bArr, i26, i11, i18, j10, zzioVar);
                                    if (iZzi != i26) {
                                        zzlmVar2 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i31 = i14;
                                        i27 = i11;
                                        i12 = i12;
                                        zzioVar3 = zzioVar;
                                        i28 = i45;
                                        i29 = i18;
                                        i30 = i17;
                                        i32 = i25;
                                        unsafe2 = unsafe;
                                    } else {
                                        i15 = iZzi;
                                        i16 = i45;
                                        i32 = i25;
                                    }
                                }
                            }
                        } else if (i35 == 2) {
                            zzkj zzkjVarZzd = (zzkj) unsafe2.getObject(obj3, j10);
                            if (!zzkjVarZzd.zzc()) {
                                int size = zzkjVarZzd.size();
                                zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j10, zzkjVarZzd);
                            }
                            i28 = i45;
                            i32 = i32;
                            iZzi = zzip.zze(zzlmVar2.zzE(i44), i28, bArr, i37, i11, zzkjVarZzd, zzioVar);
                            bArr2 = bArr;
                            i12 = i12;
                            i31 = i34;
                            i29 = i44;
                            i30 = i30;
                            i32 = i32;
                            i27 = i11;
                        } else {
                            i17 = i30;
                            i25 = i32;
                            i14 = i34;
                            unsafe = unsafe2;
                            i26 = i37;
                            i18 = i44;
                        }
                        i15 = i26;
                        i16 = i45;
                        i32 = i25;
                    }
                }
                if (i16 != i12 || i12 == 0) {
                    if (this.zzh) {
                        zzioVar2 = zzioVar;
                        if (zzioVar2.zzd != zzjo.zza()) {
                            i14 = i14;
                            if (zzioVar2.zzd.zzc(this.zzg, i14) != null) {
                                throw null;
                            }
                            iZzi = zzip.zzi(i16, bArr, i15, i11, zzd(obj), zzioVar);
                            obj = obj;
                        }
                        i27 = i11;
                        i28 = i16;
                        zzlmVar2 = this;
                        zzioVar3 = zzioVar2;
                        i31 = i14;
                        obj3 = obj;
                        i29 = i18;
                        i30 = i17;
                        unsafe2 = unsafe;
                        bArr2 = bArr;
                        i12 = i12;
                    } else {
                        zzioVar2 = zzioVar;
                    }
                    iZzi = zzip.zzi(i16, bArr, i15, i11, zzd(obj), zzioVar);
                    i27 = i11;
                    i28 = i16;
                    zzlmVar2 = this;
                    zzioVar3 = zzioVar2;
                    i31 = i14;
                    obj3 = obj;
                    i29 = i18;
                    i30 = i17;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i12 = i12;
                } else {
                    zzlmVar = this;
                    obj2 = obj;
                    iZzi = i15;
                    i28 = i16;
                    i30 = i17;
                }
            } else {
                unsafe = unsafe2;
                i12 = i12;
                obj2 = obj3;
                zzlmVar = zzlmVar2;
            }
        }
        if (i32 != 1048575) {
            unsafe.putInt(obj2, i32, i30);
        }
        for (int i46 = zzlmVar.zzk; i46 < zzlmVar.zzl; i46++) {
            int i47 = zzlmVar.zzj[i46];
            int i48 = zzlmVar.zzc[i47];
            Object objZzf = zzmv.zzf(obj2, zzlmVar.zzB(i47) & 1048575);
            if (objZzf != null && zzlmVar.zzD(i47) != null) {
                throw null;
            }
        }
        if (i12 == 0) {
            if (iZzi != i11) {
                throw zzkm.zze();
            }
        } else if (iZzi > i11 || i28 != i12) {
            throw zzkm.zze();
        }
        return iZzi;
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 1];
    }

    private final zzkg zzD(int i10) {
        int i11 = i10 / 3;
        return (zzkg) this.zzd[i11 + i11 + 1];
    }

    private final zzlu zzE(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzlu zzluVar = (zzlu) this.zzd[i12];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzluVarZzb = zzlr.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzluVarZzb;
        return zzluVarZzb;
    }

    private final Object zzF(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznd zzndVar) throws IOException {
        int i10;
        boolean z10;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iZzB = zzB(i13);
            int[] iArr = this.zzc;
            int i15 = iArr[i13];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iZzB & i11;
            switch (iZzA) {
                case 0:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzf(i15, zzmv.zza(obj, j10));
                    }
                    break;
                case 1:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzo(i15, zzmv.zzb(obj, j10));
                    }
                    break;
                case 2:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzt(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzJ(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzr(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzm(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzk(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzb(i15, zzmv.zzw(obj, j10));
                    }
                    break;
                case 8:
                    if ((i14 & i10) != 0) {
                        zzT(i15, unsafe.getObject(obj, j10), zzndVar);
                    }
                    break;
                case 9:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 10:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzd(i15, (zzjb) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzH(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzi(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzw(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzy(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzA(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 16:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzC(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 17:
                    if ((i14 & i10) != 0) {
                        zzndVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 18:
                    zzlw.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, zzE(i13));
                    break;
                case 28:
                    zzlw.zzI(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar);
                    break;
                case 29:
                    z10 = false;
                    zzlw.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 30:
                    z10 = false;
                    zzlw.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 31:
                    z10 = false;
                    zzlw.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 32:
                    z10 = false;
                    zzlw.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 33:
                    z10 = false;
                    zzlw.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 34:
                    z10 = false;
                    zzlw.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(this.zzc[i13], (List) unsafe.getObject(obj, j10), zzndVar, zzE(i13));
                    break;
                case 50:
                    zzM(zzndVar, i15, unsafe.getObject(obj, j10), i13);
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzf(i15, zzn(obj, j10));
                    }
                    break;
                case 52:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzo(i15, zzo(obj, j10));
                    }
                    break;
                case 53:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzt(i15, zzC(obj, j10));
                    }
                    break;
                case 54:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzJ(i15, zzC(obj, j10));
                    }
                    break;
                case 55:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzr(i15, zzr(obj, j10));
                    }
                    break;
                case 56:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzm(i15, zzC(obj, j10));
                    }
                    break;
                case 57:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzk(i15, zzr(obj, j10));
                    }
                    break;
                case 58:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzb(i15, zzS(obj, j10));
                    }
                    break;
                case 59:
                    if (zzR(obj, i15, i13)) {
                        zzT(i15, unsafe.getObject(obj, j10), zzndVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                case 61:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzd(i15, (zzjb) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzH(i15, zzr(obj, j10));
                    }
                    break;
                case 63:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzi(i15, zzr(obj, j10));
                    }
                    break;
                case 64:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzw(i15, zzr(obj, j10));
                    }
                    break;
                case 65:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzy(i15, zzC(obj, j10));
                    }
                    break;
                case 66:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzA(i15, zzr(obj, j10));
                    }
                    break;
                case 67:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzC(i15, zzC(obj, j10));
                    }
                    break;
                case 68:
                    if (zzR(obj, i15, i13)) {
                        zzndVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i13));
                    }
                    break;
                default:
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    private final void zzM(zznd zzndVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzT(int i10, Object obj, zznd zzndVar) throws IOException {
        if (obj instanceof String) {
            zzndVar.zzF(i10, (String) obj);
        } else {
            zzndVar.zzd(i10, (zzjb) obj);
        }
    }

    public static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar != zzmm.zzc()) {
            return zzmmVar;
        }
        zzmm zzmmVarZze = zzmm.zze();
        zzkcVar.zzc = zzmmVarZze;
        return zzmmVarZze;
    }

    public static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i10;
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int i11;
        int iZzu;
        boolean z10;
        int iZzd2;
        int iZzi;
        int iZzz;
        int iZzA8;
        int iZzA9;
        int iZzA10;
        int iZzA11;
        int iZzA12;
        int iZzB2;
        int iZzA13;
        int iZzd3;
        int iZzA14;
        int i12;
        Unsafe unsafe = zzb;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int iZzA15 = 0;
        int i16 = 0;
        while (i15 < this.zzc.length) {
            int iZzB3 = zzB(i15);
            int[] iArr = this.zzc;
            int i17 = iArr[i15];
            int iZzA16 = zzA(iZzB3);
            if (iZzA16 <= 17) {
                int i18 = iArr[i15 + 2];
                int i19 = i18 & i13;
                i10 = 1 << (i18 >>> 20);
                if (i19 != i14) {
                    i16 = unsafe.getInt(obj, i19);
                    i14 = i19;
                }
            } else {
                i10 = 0;
            }
            long j10 = iZzB3 & i13;
            switch (iZzA16) {
                case 0:
                    if ((i16 & i10) != 0) {
                        iZzA = zzjj.zzA(i17 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 1:
                    if ((i16 & i10) != 0) {
                        iZzA2 = zzjj.zzA(i17 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 2:
                    if ((i16 & i10) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzA3 = zzjj.zzA(i17 << 3);
                        iZzB = zzjj.zzB(j11);
                        iZzA15 += iZzA3 + iZzB;
                    }
                    break;
                case 3:
                    if ((i16 & i10) != 0) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzA3 = zzjj.zzA(i17 << 3);
                        iZzB = zzjj.zzB(j12);
                        iZzA15 += iZzA3 + iZzB;
                    }
                    break;
                case 4:
                    if ((i16 & i10) != 0) {
                        int i20 = unsafe.getInt(obj, j10);
                        iZzA4 = zzjj.zzA(i17 << 3);
                        iZzv = zzjj.zzv(i20);
                        i11 = iZzA4 + iZzv;
                        iZzA15 += i11;
                    }
                    break;
                case 5:
                    if ((i16 & i10) != 0) {
                        iZzA = zzjj.zzA(i17 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 6:
                    if ((i16 & i10) != 0) {
                        iZzA2 = zzjj.zzA(i17 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 7:
                    if ((i16 & i10) != 0) {
                        iZzA5 = zzjj.zzA(i17 << 3) + 1;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 8:
                    if ((i16 & i10) != 0) {
                        Object object = unsafe.getObject(obj, j10);
                        if (!(object instanceof zzjb)) {
                            iZzA4 = zzjj.zzA(i17 << 3);
                            iZzv = zzjj.zzy((String) object);
                            i11 = iZzA4 + iZzv;
                            iZzA15 += i11;
                        } else {
                            iZzA6 = zzjj.zzA(i17 << 3);
                            iZzd = ((zzjb) object).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i11 = iZzA6 + iZzA7 + iZzd;
                            iZzA15 += i11;
                        }
                    }
                    break;
                case 9:
                    if ((i16 & i10) != 0) {
                        iZzA5 = zzlw.zzo(i17, unsafe.getObject(obj, j10), zzE(i15));
                        iZzA15 += iZzA5;
                    }
                    break;
                case 10:
                    if ((i16 & i10) != 0) {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j10);
                        iZzA6 = zzjj.zzA(i17 << 3);
                        iZzd = zzjbVar.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i11 = iZzA6 + iZzA7 + iZzd;
                        iZzA15 += i11;
                    }
                    break;
                case 11:
                    if ((i16 & i10) != 0) {
                        int i21 = unsafe.getInt(obj, j10);
                        iZzA4 = zzjj.zzA(i17 << 3);
                        iZzv = zzjj.zzA(i21);
                        i11 = iZzA4 + iZzv;
                        iZzA15 += i11;
                    }
                    break;
                case 12:
                    if ((i16 & i10) != 0) {
                        int i22 = unsafe.getInt(obj, j10);
                        iZzA4 = zzjj.zzA(i17 << 3);
                        iZzv = zzjj.zzv(i22);
                        i11 = iZzA4 + iZzv;
                        iZzA15 += i11;
                    }
                    break;
                case 13:
                    if ((i16 & i10) != 0) {
                        iZzA2 = zzjj.zzA(i17 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 14:
                    if ((i16 & i10) != 0) {
                        iZzA = zzjj.zzA(i17 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                    }
                    break;
                case 15:
                    if ((i16 & i10) != 0) {
                        int i23 = unsafe.getInt(obj, j10);
                        iZzA4 = zzjj.zzA(i17 << 3);
                        iZzv = zzjj.zzA((i23 >> 31) ^ (i23 + i23));
                        i11 = iZzA4 + iZzv;
                        iZzA15 += i11;
                    }
                    break;
                case 16:
                    if ((i10 & i16) != 0) {
                        long j13 = unsafe.getLong(obj, j10);
                        iZzA15 += zzjj.zzA(i17 << 3) + zzjj.zzB((j13 >> 63) ^ (j13 + j13));
                    }
                    break;
                case 17:
                    if ((i16 & i10) != 0) {
                        iZzA5 = zzjj.zzu(i17, (zzlj) unsafe.getObject(obj, j10), zzE(i15));
                        iZzA15 += iZzA5;
                    }
                    break;
                case 18:
                    iZzA5 = zzlw.zzh(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 19:
                    iZzA5 = zzlw.zzf(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 20:
                    iZzA5 = zzlw.zzm(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 21:
                    iZzA5 = zzlw.zzx(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 22:
                    iZzA5 = zzlw.zzk(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 23:
                    iZzA5 = zzlw.zzh(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 24:
                    iZzA5 = zzlw.zzf(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 25:
                    iZzA5 = zzlw.zza(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzA5;
                    break;
                case 26:
                    iZzu = zzlw.zzu(i17, (List) unsafe.getObject(obj, j10));
                    iZzA15 += iZzu;
                    break;
                case 27:
                    iZzu = zzlw.zzp(i17, (List) unsafe.getObject(obj, j10), zzE(i15));
                    iZzA15 += iZzu;
                    break;
                case 28:
                    iZzu = zzlw.zzc(i17, (List) unsafe.getObject(obj, j10));
                    iZzA15 += iZzu;
                    break;
                case 29:
                    iZzu = zzlw.zzv(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzu;
                    break;
                case 30:
                    z10 = false;
                    iZzd2 = zzlw.zzd(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzd2;
                    break;
                case 31:
                    z10 = false;
                    iZzd2 = zzlw.zzf(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzd2;
                    break;
                case 32:
                    z10 = false;
                    iZzd2 = zzlw.zzh(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzd2;
                    break;
                case 33:
                    z10 = false;
                    iZzd2 = zzlw.zzq(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzd2;
                    break;
                case 34:
                    z10 = false;
                    iZzd2 = zzlw.zzs(i17, (List) unsafe.getObject(obj, j10), false);
                    iZzA15 += iZzd2;
                    break;
                case 35:
                    iZzi = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 36:
                    iZzi = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 37:
                    iZzi = zzlw.zzn((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 38:
                    iZzi = zzlw.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 39:
                    iZzi = zzlw.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 40:
                    iZzi = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 41:
                    iZzi = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 42:
                    iZzi = zzlw.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 43:
                    iZzi = zzlw.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 44:
                    iZzi = zzlw.zze((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 45:
                    iZzi = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 46:
                    iZzi = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 47:
                    iZzi = zzlw.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 48:
                    iZzi = zzlw.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i17);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 49:
                    iZzu = zzlw.zzj(i17, (List) unsafe.getObject(obj, j10), zzE(i15));
                    iZzA15 += iZzu;
                    break;
                case 50:
                    zzle.zza(i17, unsafe.getObject(obj, j10), zzF(i15));
                    break;
                case 51:
                    if (zzR(obj, i17, i15)) {
                        iZzA10 = zzjj.zzA(i17 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case 52:
                    if (zzR(obj, i17, i15)) {
                        iZzA11 = zzjj.zzA(i17 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 53:
                    if (zzR(obj, i17, i15)) {
                        long jZzC = zzC(obj, j10);
                        iZzA12 = zzjj.zzA(i17 << 3);
                        iZzB2 = zzjj.zzB(jZzC);
                        iZzA15 += iZzA12 + iZzB2;
                    }
                    break;
                case 54:
                    if (zzR(obj, i17, i15)) {
                        long jZzC2 = zzC(obj, j10);
                        iZzA12 = zzjj.zzA(i17 << 3);
                        iZzB2 = zzjj.zzB(jZzC2);
                        iZzA15 += iZzA12 + iZzB2;
                    }
                    break;
                case 55:
                    if (zzR(obj, i17, i15)) {
                        int iZzr = zzr(obj, j10);
                        iZzA9 = zzjj.zzA(i17 << 3);
                        iZzi = zzjj.zzv(iZzr);
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 56:
                    if (zzR(obj, i17, i15)) {
                        iZzA10 = zzjj.zzA(i17 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case 57:
                    if (zzR(obj, i17, i15)) {
                        iZzA11 = zzjj.zzA(i17 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 58:
                    if (zzR(obj, i17, i15)) {
                        iZzu = zzjj.zzA(i17 << 3) + 1;
                        iZzA15 += iZzu;
                    }
                    break;
                case 59:
                    if (zzR(obj, i17, i15)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzjb) {
                            iZzA13 = zzjj.zzA(i17 << 3);
                            iZzd3 = ((zzjb) object2).zzd();
                            iZzA14 = zzjj.zzA(iZzd3);
                            i12 = iZzA13 + iZzA14 + iZzd3;
                            iZzA15 += i12;
                        } else {
                            iZzA9 = zzjj.zzA(i17 << 3);
                            iZzi = zzjj.zzy((String) object2);
                            i12 = iZzA9 + iZzi;
                            iZzA15 += i12;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i17, i15)) {
                        iZzu = zzlw.zzo(i17, unsafe.getObject(obj, j10), zzE(i15));
                        iZzA15 += iZzu;
                    }
                    break;
                case 61:
                    if (zzR(obj, i17, i15)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j10);
                        iZzA13 = zzjj.zzA(i17 << 3);
                        iZzd3 = zzjbVar2.zzd();
                        iZzA14 = zzjj.zzA(iZzd3);
                        i12 = iZzA13 + iZzA14 + iZzd3;
                        iZzA15 += i12;
                    }
                    break;
                case 62:
                    if (zzR(obj, i17, i15)) {
                        int iZzr2 = zzr(obj, j10);
                        iZzA9 = zzjj.zzA(i17 << 3);
                        iZzi = zzjj.zzA(iZzr2);
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 63:
                    if (zzR(obj, i17, i15)) {
                        int iZzr3 = zzr(obj, j10);
                        iZzA9 = zzjj.zzA(i17 << 3);
                        iZzi = zzjj.zzv(iZzr3);
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 64:
                    if (zzR(obj, i17, i15)) {
                        iZzA11 = zzjj.zzA(i17 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 65:
                    if (zzR(obj, i17, i15)) {
                        iZzA10 = zzjj.zzA(i17 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case 66:
                    if (zzR(obj, i17, i15)) {
                        int iZzr4 = zzr(obj, j10);
                        iZzA9 = zzjj.zzA(i17 << 3);
                        iZzi = zzjj.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i12 = iZzA9 + iZzi;
                        iZzA15 += i12;
                    }
                    break;
                case 67:
                    if (zzR(obj, i17, i15)) {
                        long jZzC3 = zzC(obj, j10);
                        iZzA15 += zzjj.zzA(i17 << 3) + zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                    }
                    break;
                case 68:
                    if (zzR(obj, i17, i15)) {
                        iZzu = zzjj.zzu(i17, (zzlj) unsafe.getObject(obj, j10), zzE(i15));
                        iZzA15 += iZzu;
                    }
                    break;
                default:
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        int iZza = iZzA15 + zzmlVar.zza(zzmlVar.zzc(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iZzo;
        int iZzz;
        int iZzA8;
        int i10;
        Unsafe unsafe = zzb;
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzc.length; i12 += 3) {
            int iZzB2 = zzB(i12);
            int iZzA9 = zzA(iZzB2);
            int i13 = this.zzc[i12];
            long j10 = iZzB2 & 1048575;
            if (iZzA9 >= zzju.zzJ.zza() && iZzA9 <= zzju.zzW.zza()) {
                int i14 = this.zzc[i12 + 2];
            }
            switch (iZzA9) {
                case 0:
                    if (zzO(obj, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                    }
                    break;
                case 1:
                    if (zzO(obj, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                    }
                    break;
                case 2:
                    if (zzO(obj, i12)) {
                        long jZzd = zzmv.zzd(obj, j10);
                        iZzA3 = zzjj.zzA(i13 << 3);
                        iZzB = zzjj.zzB(jZzd);
                        i11 += iZzA3 + iZzB;
                    }
                    break;
                case 3:
                    if (zzO(obj, i12)) {
                        long jZzd2 = zzmv.zzd(obj, j10);
                        iZzA3 = zzjj.zzA(i13 << 3);
                        iZzB = zzjj.zzB(jZzd2);
                        i11 += iZzA3 + iZzB;
                    }
                    break;
                case 4:
                    if (zzO(obj, i12)) {
                        int iZzc = zzmv.zzc(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzv(iZzc);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 5:
                    if (zzO(obj, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                    }
                    break;
                case 6:
                    if (zzO(obj, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                    }
                    break;
                case 7:
                    if (zzO(obj, i12)) {
                        iZzA5 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA5 + 1;
                        i11 += iZzo;
                    }
                    break;
                case 8:
                    if (zzO(obj, i12)) {
                        Object objZzf = zzmv.zzf(obj, j10);
                        if (objZzf instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i13 << 3);
                            iZzd = ((zzjb) objZzf).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i10 = iZzA6 + iZzA7 + iZzd;
                            i11 += i10;
                        } else {
                            iZzA4 = zzjj.zzA(i13 << 3);
                            iZzv = zzjj.zzy((String) objZzf);
                            i10 = iZzA4 + iZzv;
                            i11 += i10;
                        }
                    }
                    break;
                case 9:
                    if (zzO(obj, i12)) {
                        iZzo = zzlw.zzo(i13, zzmv.zzf(obj, j10), zzE(i12));
                        i11 += iZzo;
                    }
                    break;
                case 10:
                    if (zzO(obj, i12)) {
                        zzjb zzjbVar = (zzjb) zzmv.zzf(obj, j10);
                        iZzA6 = zzjj.zzA(i13 << 3);
                        iZzd = zzjbVar.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i10 = iZzA6 + iZzA7 + iZzd;
                        i11 += i10;
                    }
                    break;
                case 11:
                    if (zzO(obj, i12)) {
                        int iZzc2 = zzmv.zzc(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzA(iZzc2);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 12:
                    if (zzO(obj, i12)) {
                        int iZzc3 = zzmv.zzc(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzv(iZzc3);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 13:
                    if (zzO(obj, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                    }
                    break;
                case 14:
                    if (zzO(obj, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                    }
                    break;
                case 15:
                    if (zzO(obj, i12)) {
                        int iZzc4 = zzmv.zzc(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzA((iZzc4 >> 31) ^ (iZzc4 + iZzc4));
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 16:
                    if (zzO(obj, i12)) {
                        long jZzd3 = zzmv.zzd(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 17:
                    if (zzO(obj, i12)) {
                        iZzo = zzjj.zzu(i13, (zzlj) zzmv.zzf(obj, j10), zzE(i12));
                        i11 += iZzo;
                    }
                    break;
                case 18:
                    iZzo = zzlw.zzh(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 19:
                    iZzo = zzlw.zzf(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 20:
                    iZzo = zzlw.zzm(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 21:
                    iZzo = zzlw.zzx(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 22:
                    iZzo = zzlw.zzk(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 23:
                    iZzo = zzlw.zzh(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 24:
                    iZzo = zzlw.zzf(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 25:
                    iZzo = zzlw.zza(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 26:
                    iZzo = zzlw.zzu(i13, (List) zzmv.zzf(obj, j10));
                    i11 += iZzo;
                    break;
                case 27:
                    iZzo = zzlw.zzp(i13, (List) zzmv.zzf(obj, j10), zzE(i12));
                    i11 += iZzo;
                    break;
                case 28:
                    iZzo = zzlw.zzc(i13, (List) zzmv.zzf(obj, j10));
                    i11 += iZzo;
                    break;
                case 29:
                    iZzo = zzlw.zzv(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 30:
                    iZzo = zzlw.zzd(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 31:
                    iZzo = zzlw.zzf(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 32:
                    iZzo = zzlw.zzh(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 33:
                    iZzo = zzlw.zzq(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 34:
                    iZzo = zzlw.zzs(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += iZzo;
                    break;
                case 35:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 36:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 37:
                    iZzv = zzlw.zzn((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 38:
                    iZzv = zzlw.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 39:
                    iZzv = zzlw.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 40:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 41:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 42:
                    iZzv = zzlw.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 43:
                    iZzv = zzlw.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 44:
                    iZzv = zzlw.zze((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 45:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 46:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 47:
                    iZzv = zzlw.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 48:
                    iZzv = zzlw.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i13);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 49:
                    iZzo = zzlw.zzj(i13, (List) zzmv.zzf(obj, j10), zzE(i12));
                    i11 += iZzo;
                    break;
                case 50:
                    zzle.zza(i13, zzmv.zzf(obj, j10), zzF(i12));
                    break;
                case 51:
                    if (zzR(obj, i13, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                    }
                    break;
                case 52:
                    if (zzR(obj, i13, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                    }
                    break;
                case 53:
                    if (zzR(obj, i13, i12)) {
                        long jZzC = zzC(obj, j10);
                        iZzA3 = zzjj.zzA(i13 << 3);
                        iZzB = zzjj.zzB(jZzC);
                        i11 += iZzA3 + iZzB;
                    }
                    break;
                case 54:
                    if (zzR(obj, i13, i12)) {
                        long jZzC2 = zzC(obj, j10);
                        iZzA3 = zzjj.zzA(i13 << 3);
                        iZzB = zzjj.zzB(jZzC2);
                        i11 += iZzA3 + iZzB;
                    }
                    break;
                case 55:
                    if (zzR(obj, i13, i12)) {
                        int iZzr = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzv(iZzr);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 56:
                    if (zzR(obj, i13, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                    }
                    break;
                case 57:
                    if (zzR(obj, i13, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                    }
                    break;
                case 58:
                    if (zzR(obj, i13, i12)) {
                        iZzA5 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA5 + 1;
                        i11 += iZzo;
                    }
                    break;
                case 59:
                    if (zzR(obj, i13, i12)) {
                        Object objZzf2 = zzmv.zzf(obj, j10);
                        if (objZzf2 instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i13 << 3);
                            iZzd = ((zzjb) objZzf2).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i10 = iZzA6 + iZzA7 + iZzd;
                            i11 += i10;
                        } else {
                            iZzA4 = zzjj.zzA(i13 << 3);
                            iZzv = zzjj.zzy((String) objZzf2);
                            i10 = iZzA4 + iZzv;
                            i11 += i10;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i13, i12)) {
                        iZzo = zzlw.zzo(i13, zzmv.zzf(obj, j10), zzE(i12));
                        i11 += iZzo;
                    }
                    break;
                case 61:
                    if (zzR(obj, i13, i12)) {
                        zzjb zzjbVar2 = (zzjb) zzmv.zzf(obj, j10);
                        iZzA6 = zzjj.zzA(i13 << 3);
                        iZzd = zzjbVar2.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i10 = iZzA6 + iZzA7 + iZzd;
                        i11 += i10;
                    }
                    break;
                case 62:
                    if (zzR(obj, i13, i12)) {
                        int iZzr2 = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzA(iZzr2);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 63:
                    if (zzR(obj, i13, i12)) {
                        int iZzr3 = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzv(iZzr3);
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 64:
                    if (zzR(obj, i13, i12)) {
                        iZzA2 = zzjj.zzA(i13 << 3);
                        iZzo = iZzA2 + 4;
                        i11 += iZzo;
                    }
                    break;
                case 65:
                    if (zzR(obj, i13, i12)) {
                        iZzA = zzjj.zzA(i13 << 3);
                        iZzo = iZzA + 8;
                        i11 += iZzo;
                    }
                    break;
                case 66:
                    if (zzR(obj, i13, i12)) {
                        int iZzr4 = zzr(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 67:
                    if (zzR(obj, i13, i12)) {
                        long jZzC3 = zzC(obj, j10);
                        iZzA4 = zzjj.zzA(i13 << 3);
                        iZzv = zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        i10 = iZzA4 + iZzv;
                        i11 += i10;
                    }
                    break;
                case 68:
                    if (zzR(obj, i13, i12)) {
                        iZzo = zzjj.zzu(i13, (zzlj) zzmv.zzf(obj, j10), zzE(i12));
                        i11 += iZzo;
                    }
                    break;
            }
        }
        zzml zzmlVar = this.zzn;
        return i11 + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzld) object).zze()) {
            zzld zzldVarZzb = zzld.zza().zzb();
            zzle.zzb(zzldVarZzb, object);
            unsafe.putObject(obj, j10, zzldVarZzb);
        }
        throw null;
    }

    private final int zzw(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, 0);
    }

    private final int zzx(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, i11);
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzz(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i10;
        int iZzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iZzB = zzB(i12);
            int i13 = this.zzc[i12];
            long j10 = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j10)));
                    i11 = i10 + iZzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iZzc = Float.floatToIntBits(zzmv.zzb(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iZzc = zzkk.zza(zzmv.zzw(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iZzc = ((String) zzmv.zzf(obj, j10)).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 9:
                    Object objZzf = zzmv.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzf(obj, j10).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzc(obj, j10);
                    i11 = i10 + iZzc;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzmv.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzf(obj, j10).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iZzc = zzmv.zzf(obj, j10).hashCode();
                    i11 = i10 + iZzc;
                    break;
                case 51:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j10)));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 52:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 53:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 54:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 55:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 57:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zza(zzS(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 59:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = ((String) zzmv.zzf(obj, j10)).hashCode();
                        i11 = i10 + iZzc;
                    }
                    break;
                case 60:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzmv.zzf(obj, j10).hashCode();
                        i11 = i10 + iZzc;
                    }
                    break;
                case 61:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzmv.zzf(obj, j10).hashCode();
                        i11 = i10 + iZzc;
                    }
                    break;
                case 62:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 63:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 64:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 65:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 66:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzr(obj, j10);
                        i11 = i10 + iZzc;
                    }
                    break;
                case 67:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iZzc = zzmv.zzf(obj, j10).hashCode();
                        i11 = i10 + iZzc;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.zzn.zzc(obj).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i10;
        int i11 = this.zzk;
        while (true) {
            i10 = this.zzl;
            if (i11 >= i10) {
                break;
            }
            long jZzB = zzB(this.zzj[i11]) & 1048575;
            Object objZzf = zzmv.zzf(obj, jZzB);
            if (objZzf != null) {
                ((zzld) objZzf).zzc();
                zzmv.zzs(obj, jZzB, objZzf);
            }
            i11++;
        }
        int length = this.zzj.length;
        while (i10 < length) {
            this.zzm.zza(obj, this.zzj[i10]);
            i10++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzio zzioVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i10, i11, zzioVar);
        } else {
            zzc(obj, bArr, i10, i11, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zzndVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj, i10)) {
                        zzndVar.zzf(i11, zzmv.zza(obj, iZzB & 1048575));
                    }
                    break;
                case 1:
                    if (zzO(obj, i10)) {
                        zzndVar.zzo(i11, zzmv.zzb(obj, iZzB & 1048575));
                    }
                    break;
                case 2:
                    if (zzO(obj, i10)) {
                        zzndVar.zzt(i11, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 3:
                    if (zzO(obj, i10)) {
                        zzndVar.zzJ(i11, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 4:
                    if (zzO(obj, i10)) {
                        zzndVar.zzr(i11, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 5:
                    if (zzO(obj, i10)) {
                        zzndVar.zzm(i11, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 6:
                    if (zzO(obj, i10)) {
                        zzndVar.zzk(i11, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 7:
                    if (zzO(obj, i10)) {
                        zzndVar.zzb(i11, zzmv.zzw(obj, iZzB & 1048575));
                    }
                    break;
                case 8:
                    if (zzO(obj, i10)) {
                        zzT(i11, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    }
                    break;
                case 9:
                    if (zzO(obj, i10)) {
                        zzndVar.zzv(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 10:
                    if (zzO(obj, i10)) {
                        zzndVar.zzd(i11, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 11:
                    if (zzO(obj, i10)) {
                        zzndVar.zzH(i11, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 12:
                    if (zzO(obj, i10)) {
                        zzndVar.zzi(i11, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 13:
                    if (zzO(obj, i10)) {
                        zzndVar.zzw(i11, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 14:
                    if (zzO(obj, i10)) {
                        zzndVar.zzy(i11, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 15:
                    if (zzO(obj, i10)) {
                        zzndVar.zzA(i11, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 16:
                    if (zzO(obj, i10)) {
                        zzndVar.zzC(i11, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 17:
                    if (zzO(obj, i10)) {
                        zzndVar.zzq(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 18:
                    zzlw.zzJ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i10));
                    break;
                case 28:
                    zzlw.zzI(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 29:
                    zzlw.zzX(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 30:
                    zzlw.zzK(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 31:
                    zzlw.zzS(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(i11, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i10));
                    break;
                case 50:
                    zzM(zzndVar, i11, zzmv.zzf(obj, iZzB & 1048575), i10);
                    break;
                case 51:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzf(i11, zzn(obj, iZzB & 1048575));
                    }
                    break;
                case 52:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzo(i11, zzo(obj, iZzB & 1048575));
                    }
                    break;
                case 53:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzt(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 54:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzJ(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 55:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzr(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 56:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzm(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 57:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzk(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 58:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzb(i11, zzS(obj, iZzB & 1048575));
                    }
                    break;
                case 59:
                    if (zzR(obj, i11, i10)) {
                        zzT(i11, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzv(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
                case 61:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzd(i11, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 62:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzH(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 63:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzi(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 64:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzw(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 65:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzy(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 66:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzA(i11, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 67:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzC(i11, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 68:
                    if (zzR(obj, i11, i10)) {
                        zzndVar.zzq(i11, zzmv.zzf(obj, iZzB & 1048575), zzE(i10));
                    }
                    break;
            }
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzZ;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzB = zzB(i10);
            long j10 = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzN(obj, obj2, i10) || Double.doubleToLongBits(zzmv.zza(obj, j10)) != Double.doubleToLongBits(zzmv.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzN(obj, obj2, i10) || Float.floatToIntBits(zzmv.zzb(obj, j10)) != Float.floatToIntBits(zzmv.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzN(obj, obj2, i10) || zzmv.zzw(obj, j10) != zzmv.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzN(obj, obj2, i10) || zzmv.zzc(obj, j10) != zzmv.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzN(obj, obj2, i10) || zzmv.zzd(obj, j10) != zzmv.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzN(obj, obj2, i10) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10));
                    break;
                case 50:
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzy = zzy(i10) & 1048575;
                    if (zzmv.zzc(obj, jZzy) != zzmv.zzc(obj2, jZzy) || !zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzZ) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3 A[LOOP:1: B:45:0x00b2->B:50:0x00c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        List list;
        zzlu zzluVarZzE;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < this.zzk) {
            int i16 = this.zzj[i15];
            int i17 = this.zzc[i16];
            int iZzB = zzB(i16);
            int i18 = this.zzc[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i14 = zzb.getInt(obj, i19);
                }
                i11 = i14;
                i10 = i19;
            } else {
                i10 = i13;
                i11 = i14;
            }
            if ((268435456 & iZzB) != 0 && !zzP(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iZzA = zzA(iZzB);
            if (iZzA == 9 || iZzA == 17) {
                if (zzP(obj, i16, i10, i11, i20) && !zzQ(obj, iZzB, zzE(i16))) {
                    return false;
                }
            } else if (iZzA == 27) {
                list = (List) zzmv.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzluVarZzE = zzE(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzluVarZzE.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzA == 60 || iZzA == 68) {
                if (zzR(obj, i17, i16) && !zzQ(obj, iZzB, zzE(i16))) {
                    return false;
                }
            } else if (iZzA == 49) {
                list = (List) zzmv.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    zzluVarZzE = zzE(i16);
                    while (i12 < list.size()) {
                        if (!zzluVarZzE.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzA == 50 && !((zzld) zzmv.zzf(obj, iZzB & 1048575)).isEmpty()) {
                throw null;
            }
            i15++;
            i13 = i10;
            i14 = i11;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private static long zzC(Object obj, long j10) {
        return ((Long) zzmv.zzf(obj, j10)).longValue();
    }

    private static Field zzG(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzH(Object obj, Object obj2, int i10) {
        long jZzB = zzB(i10) & 1048575;
        if (!zzO(obj2, i10)) {
            return;
        }
        Object objZzf = zzmv.zzf(obj, jZzB);
        Object objZzf2 = zzmv.zzf(obj2, jZzB);
        if (objZzf != null && objZzf2 != null) {
            zzmv.zzs(obj, jZzB, zzkk.zzg(objZzf, objZzf2));
            zzJ(obj, i10);
        } else if (objZzf2 != null) {
            zzmv.zzs(obj, jZzB, objZzf2);
            zzJ(obj, i10);
        }
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        Object objZzf;
        int iZzB = zzB(i10);
        int i11 = this.zzc[i10];
        long j10 = iZzB & 1048575;
        if (!zzR(obj2, i11, i10)) {
            return;
        }
        if (zzR(obj, i11, i10)) {
            objZzf = zzmv.zzf(obj, j10);
        } else {
            objZzf = null;
        }
        Object objZzf2 = zzmv.zzf(obj2, j10);
        if (objZzf != null && objZzf2 != null) {
            zzmv.zzs(obj, j10, zzkk.zzg(objZzf, objZzf2));
            zzK(obj, i11, i10);
        } else if (objZzf2 != null) {
            zzmv.zzs(obj, j10, objZzf2);
            zzK(obj, i11, i10);
        }
    }

    private final void zzJ(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = 1048575 & iZzy;
        if (j10 == 1048575) {
            return;
        }
        zzmv.zzq(obj, j10, (1 << (iZzy >>> 20)) | zzmv.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzmv.zzq(obj, zzy(i11) & 1048575, i10);
    }

    private final boolean zzN(Object obj, Object obj2, int i10) {
        if (zzO(obj, i10) == zzO(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean zzO(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = iZzy & 1048575;
        if (j10 == 1048575) {
            int iZzB = zzB(i10);
            long j11 = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzmv.zza(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzmv.zzb(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzmv.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzmv.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzmv.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzmv.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzmv.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzmv.zzw(obj, j11);
                case 8:
                    Object objZzf = zzmv.zzf(obj, j11);
                    if (objZzf instanceof String) {
                        if (((String) objZzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (objZzf instanceof zzjb) {
                        if (zzjb.zzb.equals(objZzf)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzmv.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzjb.zzb.equals(zzmv.zzf(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzmv.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzmv.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzmv.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzmv.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzmv.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzmv.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzmv.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzmv.zzc(obj, j10) & (1 << (iZzy >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzP(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzO(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzQ(Object obj, int i10, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i10 & 1048575));
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        if (zzmv.zzc(obj, zzy(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzmv.zzf(obj, j10)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0261  */
    /* JADX WARN: Code duplicated, block: B:127:0x0279  */
    /* JADX WARN: Code duplicated, block: B:128:0x027c  */
    /* JADX WARN: Code duplicated, block: B:162:0x032c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0379  */
    /* JADX WARN: Code duplicated, block: B:180:0x0385  */
    public static zzlm zzm(zzlt zzltVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        boolean z10;
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int i16;
        char cCharAt2;
        int i17;
        char cCharAt3;
        int i18;
        char cCharAt4;
        int i19;
        char cCharAt5;
        int i20;
        char cCharAt6;
        int i21;
        char cCharAt7;
        int i22;
        char cCharAt8;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        Field fieldZzG;
        char cCharAt9;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldZzG2;
        int i36;
        Object obj2;
        Field fieldZzG3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        if (zzltVar.zzc() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        String strZzd = zzltVar.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i10 = i41 + 1;
                if (strZzd.charAt(i41) < 55296) {
                    break;
                }
                i41 = i10;
            }
        } else {
            i10 = 1;
        }
        int i42 = i10 + 1;
        int iCharAt4 = strZzd.charAt(i10);
        if (iCharAt4 >= 55296) {
            int i43 = iCharAt4 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                cCharAt13 = strZzd.charAt(i42);
                if (cCharAt13 < 55296) {
                    break;
                }
                i43 |= (cCharAt13 & 8191) << i44;
                i44 += 13;
                i42 = i40;
            }
            iCharAt4 = i43 | (cCharAt13 << i44);
            i42 = i40;
        }
        if (iCharAt4 == 0) {
            iCharAt = 0;
            i14 = 0;
            iCharAt2 = 0;
            i13 = 0;
            iCharAt3 = 0;
            i11 = 0;
            iArr = zza;
            i12 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt5 = strZzd.charAt(i42);
            if (iCharAt5 >= 55296) {
                int i46 = iCharAt5 & 8191;
                int i47 = 13;
                while (true) {
                    i22 = i45 + 1;
                    cCharAt8 = strZzd.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i22;
                }
                iCharAt5 = i46 | (cCharAt8 << i47);
                i45 = i22;
            }
            int i48 = i45 + 1;
            int iCharAt6 = strZzd.charAt(i45);
            if (iCharAt6 >= 55296) {
                int i49 = iCharAt6 & 8191;
                int i50 = 13;
                while (true) {
                    i21 = i48 + 1;
                    cCharAt7 = strZzd.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i21;
                }
                iCharAt6 = i49 | (cCharAt7 << i50);
                i48 = i21;
            }
            int i51 = i48 + 1;
            iCharAt = strZzd.charAt(i48);
            if (iCharAt >= 55296) {
                int i52 = iCharAt & 8191;
                int i53 = 13;
                while (true) {
                    i20 = i51 + 1;
                    cCharAt6 = strZzd.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i20;
                }
                iCharAt = i52 | (cCharAt6 << i53);
                i51 = i20;
            }
            int i54 = i51 + 1;
            int iCharAt7 = strZzd.charAt(i51);
            if (iCharAt7 >= 55296) {
                int i55 = iCharAt7 & 8191;
                int i56 = 13;
                while (true) {
                    i19 = i54 + 1;
                    cCharAt5 = strZzd.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i19;
                }
                iCharAt7 = i55 | (cCharAt5 << i56);
                i54 = i19;
            }
            int i57 = i54 + 1;
            iCharAt2 = strZzd.charAt(i54);
            if (iCharAt2 >= 55296) {
                int i58 = iCharAt2 & 8191;
                int i59 = 13;
                while (true) {
                    i18 = i57 + 1;
                    cCharAt4 = strZzd.charAt(i57);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i18;
                }
                iCharAt2 = i58 | (cCharAt4 << i59);
                i57 = i18;
            }
            int i60 = i57 + 1;
            int iCharAt8 = strZzd.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i17 = i60 + 1;
                    cCharAt3 = strZzd.charAt(i60);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i17;
                }
                iCharAt8 = i61 | (cCharAt3 << i62);
                i60 = i17;
            }
            int i63 = i60 + 1;
            int iCharAt9 = strZzd.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = 13;
                while (true) {
                    i16 = i63 + 1;
                    cCharAt2 = strZzd.charAt(i63);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i16;
                }
                iCharAt9 = i64 | (cCharAt2 << i65);
                i63 = i16;
            }
            int i66 = i63 + 1;
            iCharAt3 = strZzd.charAt(i63);
            if (iCharAt3 >= 55296) {
                int i67 = iCharAt3 & 8191;
                int i68 = 13;
                while (true) {
                    i15 = i66 + 1;
                    cCharAt = strZzd.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i68;
                    i68 += 13;
                    i66 = i15;
                }
                iCharAt3 = i67 | (cCharAt << i68);
                i66 = i15;
            }
            iArr = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i11 = iCharAt5 + iCharAt5 + iCharAt6;
            i12 = iCharAt5;
            i42 = i66;
            int i69 = iCharAt8;
            i13 = iCharAt7;
            i14 = i69;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzltVar.zze();
        Class<?> cls = zzltVar.zza().getClass();
        int[] iArr2 = new int[iCharAt2 * 3];
        Object[] objArr = new Object[iCharAt2 + iCharAt2];
        int i70 = iCharAt3 + i14;
        int i71 = iCharAt3;
        int i72 = i70;
        int i73 = 0;
        int i74 = 0;
        while (i42 < length) {
            int i75 = i42 + 1;
            int iCharAt10 = strZzd.charAt(i42);
            if (iCharAt10 >= c10) {
                int i76 = iCharAt10 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i39 = i77 + 1;
                    cCharAt12 = strZzd.charAt(i77);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i76 |= (cCharAt12 & 8191) << i78;
                    i78 += 13;
                    i77 = i39;
                }
                iCharAt10 = i76 | (cCharAt12 << i78);
                i23 = i39;
            } else {
                i23 = i75;
            }
            int i79 = i23 + 1;
            int iCharAt11 = strZzd.charAt(i23);
            if (iCharAt11 >= c10) {
                int i80 = iCharAt11 & 8191;
                int i81 = i79;
                int i82 = 13;
                while (true) {
                    i38 = i81 + 1;
                    cCharAt11 = strZzd.charAt(i81);
                    i24 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i80 |= (cCharAt11 & 8191) << i82;
                    i82 += 13;
                    i81 = i38;
                    length = i24;
                }
                iCharAt11 = i80 | (cCharAt11 << i82);
                i25 = i38;
            } else {
                i24 = length;
                i25 = i79;
            }
            int i83 = iCharAt11 & 255;
            int i84 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i74] = i73;
                i74++;
            }
            if (i83 >= 51) {
                int i85 = i25 + 1;
                int iCharAt12 = strZzd.charAt(i25);
                if (iCharAt12 >= 55296) {
                    int i86 = iCharAt12 & 8191;
                    int i87 = i85;
                    int i88 = 13;
                    while (true) {
                        i37 = i87 + 1;
                        cCharAt10 = strZzd.charAt(i87);
                        i26 = i13;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i88;
                        i88 += 13;
                        i87 = i37;
                        i13 = i26;
                    }
                    iCharAt12 = i86 | (cCharAt10 << i88);
                    i33 = i37;
                } else {
                    i26 = i13;
                    i33 = i85;
                }
                int i89 = i83 - 51;
                i28 = i33;
                if (i89 != 9 && i89 != 17) {
                    if (i89 == 12 && !z10) {
                        int i90 = i73 / 3;
                        i34 = i11 + 1;
                        objArr[i90 + i90 + 1] = objArrZze[i11];
                    }
                    i35 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i35];
                    if (obj instanceof Field) {
                        fieldZzG2 = (Field) obj;
                    } else {
                        fieldZzG2 = zzG(cls, (String) obj);
                        objArrZze[i35] = fieldZzG2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzG2);
                    i36 = i35 + 1;
                    obj2 = objArrZze[i36];
                    if (obj2 instanceof Field) {
                        fieldZzG3 = (Field) obj2;
                    } else {
                        fieldZzG3 = zzG(cls, (String) obj2);
                        objArrZze[i36] = fieldZzG3;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzG3);
                    strZzd = strZzd;
                    cls = cls;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i29 = 0;
                } else {
                    int i91 = i73 / 3;
                    i34 = i11 + 1;
                    objArr[i91 + i91 + 1] = objArrZze[i11];
                }
                i11 = i34;
                i35 = iCharAt12 + iCharAt12;
                obj = objArrZze[i35];
                if (obj instanceof Field) {
                    fieldZzG2 = (Field) obj;
                } else {
                    fieldZzG2 = zzG(cls, (String) obj);
                    objArrZze[i35] = fieldZzG2;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldZzG2);
                i36 = i35 + 1;
                obj2 = objArrZze[i36];
                if (obj2 instanceof Field) {
                    fieldZzG3 = (Field) obj2;
                } else {
                    fieldZzG3 = zzG(cls, (String) obj2);
                    objArrZze[i36] = fieldZzG3;
                }
                int iObjectFieldOffset6 = (int) unsafe.objectFieldOffset(fieldZzG3);
                strZzd = strZzd;
                cls = cls;
                iObjectFieldOffset2 = iObjectFieldOffset6;
                iObjectFieldOffset = iObjectFieldOffset5;
                i29 = 0;
            } else {
                i26 = i13;
                int i92 = i11 + 1;
                Field fieldZzG4 = zzG(cls, (String) objArrZze[i11]);
                if (i83 != 9 && i83 != 17) {
                    if (i83 != 27 && i83 != 49) {
                        if (i83 != 12 && i83 != 30 && i83 != 44) {
                            if (i83 == 50) {
                                int i93 = i71 + 1;
                                iArr[i71] = i73;
                                int i94 = i73 / 3;
                                int i95 = i94 + i94;
                                int i96 = i92 + 1;
                                objArr[i95] = objArrZze[i92];
                                if ((iCharAt11 & 2048) != 0) {
                                    i92 = i96 + 1;
                                    objArr[i95 + 1] = objArrZze[i96];
                                    i71 = i93;
                                } else {
                                    i71 = i93;
                                    i27 = i96;
                                }
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                                if ((iCharAt11 & 4096) != 4096 && i83 <= 17) {
                                    int i97 = i25 + 1;
                                    int iCharAt13 = strZzd.charAt(i25);
                                    if (iCharAt13 >= 55296) {
                                        int i98 = iCharAt13 & 8191;
                                        int i99 = 13;
                                        while (true) {
                                            i28 = i97 + 1;
                                            cCharAt9 = strZzd.charAt(i97);
                                            if (cCharAt9 < 55296) {
                                                break;
                                            }
                                            i98 |= (cCharAt9 & 8191) << i99;
                                            i99 += 13;
                                            i97 = i28;
                                        }
                                        iCharAt13 = i98 | (cCharAt9 << i99);
                                    } else {
                                        i28 = i97;
                                    }
                                    int i100 = i12 + i12 + (iCharAt13 / 32);
                                    Object obj3 = objArrZze[i100];
                                    if (obj3 instanceof Field) {
                                        fieldZzG = (Field) obj3;
                                    } else {
                                        fieldZzG = zzG(cls, (String) obj3);
                                        objArrZze[i100] = fieldZzG;
                                    }
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG);
                                    i29 = iCharAt13 % 32;
                                } else {
                                    iObjectFieldOffset2 = 1048575;
                                    i28 = i25;
                                    i29 = 0;
                                }
                                if (i83 >= 18 && i83 <= 49) {
                                    iArr[i72] = iObjectFieldOffset;
                                    i72++;
                                }
                                i11 = i27;
                            }
                        } else if (!z10) {
                            int i101 = i73 / 3;
                            i30 = i92 + 1;
                            objArr[i101 + i101 + 1] = objArrZze[i92];
                        }
                    } else {
                        int i102 = i73 / 3;
                        i30 = i92 + 1;
                        objArr[i102 + i102 + 1] = objArrZze[i92];
                    }
                    i27 = i30;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                    if ((iCharAt11 & 4096) != 4096) {
                        iObjectFieldOffset2 = 1048575;
                        i28 = i25;
                        i29 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i28 = i25;
                        i29 = 0;
                    }
                    if (i83 >= 18) {
                        iArr[i72] = iObjectFieldOffset;
                        i72++;
                    }
                    i11 = i27;
                } else {
                    int i103 = i73 / 3;
                    objArr[i103 + i103 + 1] = fieldZzG4.getType();
                }
                i27 = i92;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                if ((iCharAt11 & 4096) != 4096) {
                    iObjectFieldOffset2 = 1048575;
                    i28 = i25;
                    i29 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i28 = i25;
                    i29 = 0;
                }
                if (i83 >= 18) {
                    iArr[i72] = iObjectFieldOffset;
                    i72++;
                }
                i11 = i27;
            }
            int i104 = i73 + 1;
            iArr2[i73] = iCharAt10;
            int i105 = i104 + 1;
            if ((iCharAt11 & 512) != 0) {
                i31 = 536870912;
            } else {
                i31 = 0;
            }
            if ((iCharAt11 & 256) != 0) {
                i32 = 268435456;
            } else {
                i32 = 0;
            }
            iArr2[i104] = i32 | i31 | (i83 << 20) | iObjectFieldOffset;
            i73 = i105 + 1;
            iArr2[i105] = iObjectFieldOffset2 | (i29 << 20);
            cls = cls;
            iCharAt = iCharAt;
            iCharAt3 = i84;
            i42 = i28;
            length = i24;
            objArr = objArr;
            strZzd = strZzd;
            iArr2 = iArr2;
            i13 = i26;
            c10 = 55296;
        }
        return new zzlm(iArr2, objArr, iCharAt, i13, zzltVar.zza(), z10, false, iArr, iCharAt3, i70, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar, null);
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzmv.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzmv.zzf(obj, j10)).floatValue();
    }

    private static int zzr(Object obj, long j10) {
        return ((Integer) zzmv.zzf(obj, j10)).intValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzB = zzB(i10);
            long j10 = 1048575 & iZzB;
            int i11 = this.zzc[i10];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj2, i10)) {
                        zzmv.zzo(obj, j10, zzmv.zza(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 1:
                    if (zzO(obj2, i10)) {
                        zzmv.zzp(obj, j10, zzmv.zzb(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 2:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 3:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 4:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 5:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 6:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 7:
                    if (zzO(obj2, i10)) {
                        zzmv.zzm(obj, j10, zzmv.zzw(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 8:
                    if (zzO(obj2, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 9:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (zzO(obj2, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 11:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 12:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 13:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 14:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 15:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 16:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                    }
                    break;
                case 17:
                    zzH(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzb(obj, obj2, j10);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i11, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                    }
                    break;
                case 60:
                    zzI(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i11, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                    }
                    break;
                case 68:
                    zzI(obj, obj2, i10);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }
}
