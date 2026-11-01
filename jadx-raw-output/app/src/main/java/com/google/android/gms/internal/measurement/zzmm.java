package com.google.android.gms.internal.measurement;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzmm {
    private static final zzmm zza = new zzmm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmm(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzmm zzc() {
        return zza;
    }

    public static zzmm zze() {
        return new zzmm(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmm)) {
            return false;
        }
        zzmm zzmmVar = (zzmm) obj;
        int i10 = this.zzb;
        if (i10 == zzmmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmmVar.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zzmmVar.zzd;
            int i12 = this.zzb;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzll.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    private zzmm() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzmm zzd(zzmm zzmmVar, zzmm zzmmVar2) {
        int i10 = zzmmVar.zzb + zzmmVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzmmVar.zzc, i10);
        System.arraycopy(zzmmVar2.zzc, 0, iArrCopyOf, zzmmVar.zzb, zzmmVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzmmVar.zzd, i10);
        System.arraycopy(zzmmVar2.zzd, 0, objArrCopyOf, zzmmVar.zzb, zzmmVar2.zzb);
        return new zzmm(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = (i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzA3 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        zzjb zzjbVar = (zzjb) this.zzd[i11];
                        int iZzA4 = zzjj.zzA(i13 << 3);
                        int iZzd = zzjbVar.zzd();
                        iZzA3 += iZzA4 + zzjj.zzA(iZzd) + iZzd;
                    } else if (i14 == 3) {
                        int iZzz = zzjj.zzz(i13);
                        iZzA = iZzz + iZzz;
                        iZzB = ((zzmm) this.zzd[i11]).zza();
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException(zzkm.zza());
                        }
                        ((Integer) this.zzd[i11]).intValue();
                        iZzA2 = zzjj.zzA(i13 << 3) + 4;
                    }
                } else {
                    ((Long) this.zzd[i11]).longValue();
                    iZzA2 = zzjj.zzA(i13 << 3) + 8;
                }
                iZzA3 += iZzA2;
            } else {
                long jLongValue = ((Long) this.zzd[i11]).longValue();
                iZzA = zzjj.zzA(i13 << 3);
                iZzB = zzjj.zzB(jLongValue);
            }
            iZzA2 = iZzA + iZzB;
            iZzA3 += iZzA2;
        }
        this.zze = iZzA3;
        return iZzA3;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            zzjb zzjbVar = (zzjb) this.zzd[i11];
            int iZzA2 = zzjj.zzA(8);
            int iZzd = zzjbVar.zzd();
            iZzA += iZzA2 + iZzA2 + zzjj.zzA(16) + zzjj.zzA(i12 >>> 3) + zzjj.zzA(24) + zzjj.zzA(iZzd) + iZzd;
        }
        this.zze = iZzA;
        return iZzA;
    }

    public final void zzh(int i10, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.zzb;
        int[] iArr = this.zzc;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.zzc = Arrays.copyOf(iArr, i12);
            this.zzd = Arrays.copyOf(this.zzd, i12);
        }
        int[] iArr2 = this.zzc;
        int i13 = this.zzb;
        iArr2[i13] = i10;
        this.zzd[i13] = obj;
        this.zzb = i13 + 1;
    }

    public final void zzi(zznd zzndVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    zzndVar.zzt(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzndVar.zzm(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzndVar.zzd(i12, (zzjb) obj);
                } else if (i13 == 3) {
                    zzndVar.zzE(i12);
                    ((zzmm) obj).zzi(zzndVar);
                    zzndVar.zzh(i12);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(zzkm.zza());
                    }
                    zzndVar.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }
}
