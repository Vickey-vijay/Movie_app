package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public class zzbio {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbio(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbio zzd(String str, String str2) {
        return new zzbio("gad:dynamite_module:experiment_id", "", 4);
    }

    public static zzbio zza(String str, boolean z10) {
        return new zzbio(str, Boolean.valueOf(z10), 1);
    }

    public static zzbio zzb(String str, long j10) {
        return new zzbio(str, Long.valueOf(j10), 2);
    }

    public static zzbio zzc(String str, double d10) {
        return new zzbio(str, Double.valueOf(d10), 3);
    }

    public final Object zze() {
        zzbju zzbjuVarZza = zzbjw.zza();
        if (zzbjuVarZza == null) {
            if (zzbjw.zzb() != null) {
                zzbjw.zzb().zza();
            }
            return this.zzb;
        }
        int i10 = this.zzc - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return zzbjuVarZza.zzd(this.zza, (String) this.zzb);
                }
                return zzbjuVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zzbjuVarZza.zzb(this.zza, ((Long) this.zzb).longValue());
        }
        return zzbjuVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
