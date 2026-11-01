package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzcro implements zzgzl {
    public final /* synthetic */ zzfqk zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    public final /* synthetic */ zzcrv zzd;

    public zzcro(zzcrv zzcrvVar, zzfqk zzfqkVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfqkVar;
        this.zzb = str;
        this.zzc = zzvVar;
        Objects.requireNonNull(zzcrvVar);
        this.zzd = zzcrvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(final Throwable th2) {
        final zzfqk zzfqkVar = this.zza;
        final String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlM)).booleanValue();
                Throwable th3 = th2;
                zzcro zzcroVar = this.zza;
                if (zBooleanValue) {
                    zzcrv zzcrvVar = zzcroVar.zzd;
                    zzbyr zzbyrVarZzc = zzbyp.zzc(zzcrvVar.zzi());
                    zzcrvVar.zzb = zzbyrVarZzc;
                    zzbyrVarZzc.zzh(th3, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcrv zzcrvVar2 = zzcroVar.zzd;
                    zzbyr zzbyrVarZza = zzbyp.zza(zzcrvVar2.zzi());
                    zzcrvVar2.zza = zzbyrVarZza;
                    zzbyrVarZza.zzh(th3, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfqkVar.zzb(str, zzvVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfqk zzfqkVar = this.zza;
        final String str = (String) obj;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfqkVar.zzb(str, zzvVar, null, null);
            }
        });
    }
}
