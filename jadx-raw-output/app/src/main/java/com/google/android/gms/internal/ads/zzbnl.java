package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzbnl implements zzgzl {
    public final /* synthetic */ zzcjl zza;

    public zzbnl(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcjl zzcjlVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbt(zzcjlVar.getContext(), zzcjlVar.zzs().afmaVersion, str, null, zzcjlVar.zzC() != null ? zzcjlVar.zzC().zzax : null).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "DefaultGmsgHandlers.attributionReportingManager");
    }
}
