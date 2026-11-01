package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzff {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzff() {
        throw null;
    }

    public zzff(int i10) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }

    public final synchronized void zza(long j10, Object obj) {
        int i10 = this.zzd;
        if (i10 > 0) {
            if (j10 <= this.zza[((this.zzc + i10) - 1) % this.zzb.length]) {
                zzb();
            }
        }
        int length = this.zzb.length;
        if (this.zzd >= length) {
            int i11 = length + length;
            long[] jArr = new long[i11];
            Object[] objArr = new Object[i11];
            int i12 = this.zzc;
            int i13 = length - i12;
            System.arraycopy(this.zza, i12, jArr, 0, i13);
            System.arraycopy(this.zzb, this.zzc, objArr, 0, i13);
            int i14 = this.zzc;
            if (i14 > 0) {
                System.arraycopy(this.zza, 0, jArr, i13, i14);
                System.arraycopy(this.zzb, 0, objArr, i13, this.zzc);
            }
            this.zza = jArr;
            this.zzb = objArr;
            this.zzc = 0;
        }
        int i15 = this.zzc;
        int i16 = this.zzd;
        Object[] objArr2 = this.zzb;
        int length2 = (i15 + i16) % objArr2.length;
        this.zza[length2] = j10;
        objArr2[length2] = obj;
        this.zzd = i16 + 1;
    }

    public final synchronized void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        Arrays.fill(this.zzb, (Object) null);
    }

    public final synchronized int zzc() {
        return this.zzd;
    }

    @Nullable
    public final synchronized Object zzd() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    @Nullable
    public final synchronized Object zze(long j10) {
        Object objZzf;
        objZzf = null;
        while (this.zzd > 0 && j10 - this.zza[this.zzc] >= 0) {
            objZzf = zzf();
        }
        return objZzf;
    }

    @Nullable
    private final Object zzf() {
        zzgrc.zzi(this.zzd > 0);
        Object[] objArr = this.zzb;
        int i10 = this.zzc;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.zzc = (i10 + 1) % objArr.length;
        this.zzd--;
        return obj;
    }
}
