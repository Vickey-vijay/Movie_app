package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzii extends zzbf {
    private final int zzb;
    private final zzyf zzc;

    private final int zzw(int i10, boolean z10) {
        if (z10) {
            return this.zzc.zzb(i10);
        }
        if (i10 >= this.zzb - 1) {
            return -1;
        }
        return i10 + 1;
    }

    private final int zzx(int i10, boolean z10) {
        if (z10) {
            return this.zzc.zzc(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd zzo(Object obj, zzbd zzbdVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzr = zzr(obj2);
        int iZzu = zzu(iZzr);
        zzs(iZzr).zzo(obj3, zzbdVar);
        zzbdVar.zzc += iZzu;
        zzbdVar.zzb = obj;
        return zzbdVar;
    }

    public abstract int zzp(int i10);

    public abstract int zzq(int i10);

    public abstract int zzr(Object obj);

    public abstract zzbf zzs(int i10);

    public abstract int zzt(int i10);

    public abstract int zzu(int i10);

    public abstract Object zzv(int i10);

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        int iZze;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iZzr = zzr(obj2);
            if (iZzr != -1 && (iZze = zzs(iZzr).zze(obj3)) != -1) {
                return zzt(iZzr) + iZze;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzj(boolean z10) {
        int i10 = this.zzb;
        if (i10 != 0) {
            int iZzd = z10 ? this.zzc.zzd() : i10 - 1;
            while (zzs(iZzd).zzg()) {
                iZzd = zzx(iZzd, z10);
                if (iZzd == -1) {
                }
            }
            return zzu(iZzd) + zzs(iZzd).zzj(z10);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzk(boolean z10) {
        if (this.zzb != 0) {
            int iZze = z10 ? this.zzc.zze() : 0;
            while (zzs(iZze).zzg()) {
                iZze = zzw(iZze, z10);
                if (iZze == -1) {
                }
            }
            return zzu(iZze) + zzs(iZze).zzk(z10);
        }
        return -1;
    }

    public zzii(boolean z10, zzyf zzyfVar) {
        this.zzc = zzyfVar;
        this.zzb = zzyfVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i10, zzbe zzbeVar, long j10) {
        int iZzq = zzq(i10);
        int iZzu = zzu(iZzq);
        int iZzt = zzt(iZzq);
        zzs(iZzq).zzb(i10 - iZzu, zzbeVar, j10);
        Object objZzv = zzv(iZzq);
        if (!zzbe.zza.equals(zzbeVar.zzb)) {
            objZzv = Pair.create(objZzv, zzbeVar.zzb);
        }
        zzbeVar.zzb = objZzv;
        zzbeVar.zzn += iZzt;
        zzbeVar.zzo += iZzt;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        int iZzp = zzp(i10);
        int iZzu = zzu(iZzp);
        zzs(iZzp).zzd(i10 - zzt(iZzp), zzbdVar, z10);
        zzbdVar.zzc += iZzu;
        if (z10) {
            Object objZzv = zzv(iZzp);
            Object obj = zzbdVar.zzb;
            obj.getClass();
            zzbdVar.zzb = Pair.create(objZzv, obj);
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i10) {
        int iZzp = zzp(i10);
        return Pair.create(zzv(iZzp), zzs(iZzp).zzf(i10 - zzt(iZzp)));
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzh(int i10, int i11, boolean z10) {
        int i12;
        int iZzq = zzq(i10);
        int iZzu = zzu(iZzq);
        zzbf zzbfVarZzs = zzs(iZzq);
        int i13 = i10 - iZzu;
        if (i11 == 2) {
            i12 = 0;
        } else {
            i12 = i11;
        }
        int iZzh = zzbfVarZzs.zzh(i13, i12, z10);
        if (iZzh != -1) {
            return iZzu + iZzh;
        }
        int iZzw = zzw(iZzq, z10);
        while (iZzw != -1 && zzs(iZzw).zzg()) {
            iZzw = zzw(iZzw, z10);
        }
        if (iZzw != -1) {
            return zzu(iZzw) + zzs(iZzw).zzk(z10);
        }
        if (i11 != 2) {
            return -1;
        }
        return zzk(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzi(int i10, int i11, boolean z10) {
        int iZzq = zzq(i10);
        int iZzu = zzu(iZzq);
        int iZzi = zzs(iZzq).zzi(i10 - iZzu, 0, false);
        if (iZzi != -1) {
            return iZzu + iZzi;
        }
        int iZzx = zzx(iZzq, false);
        while (iZzx != -1 && zzs(iZzx).zzg()) {
            iZzx = zzx(iZzx, false);
        }
        if (iZzx == -1) {
            return -1;
        }
        return zzu(iZzx) + zzs(iZzx).zzj(false);
    }
}
