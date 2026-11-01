package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdtn extends zzdsy implements zzdjm {
    private zzdjm zza;

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final synchronized void zzdQ() {
        zzdjm zzdjmVar = this.zza;
        if (zzdjmVar != null) {
            zzdjmVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final synchronized void zzdu() {
        zzdjm zzdjmVar = this.zza;
        if (zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    public final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, zzbmx zzbmxVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbmz zzbmzVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzdjm zzdjmVar) {
        super.zzm(zzaVar, zzbmxVar, zzrVar, zzbmzVar, zzadVar);
        this.zza = zzdjmVar;
    }
}
