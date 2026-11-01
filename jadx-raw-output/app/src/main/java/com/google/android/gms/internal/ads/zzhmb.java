package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhmb extends zzhmm {
    private final zzhmk zza;
    private final zzhyg zzb;
    private final zzhye zzc;
    private final Integer zzd;

    public /* synthetic */ zzhmb(zzhmk zzhmkVar, zzhyg zzhygVar, zzhye zzhyeVar, Integer num, byte[] bArr) {
        this.zza = zzhmkVar;
        this.zzb = zzhygVar;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhma zzc() {
        return new zzhma(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhmm, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzhyg zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhmm
    public final zzhye zze() {
        return this.zzc;
    }

    public final zzhmk zzf() {
        return this.zza;
    }
}
