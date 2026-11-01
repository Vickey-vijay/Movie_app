package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzboq implements zzgzl {
    public final /* synthetic */ Map zza;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzbou zzd;

    public zzboq(zzbou zzbouVar, Map map, com.google.android.gms.ads.internal.client.zza zzaVar, String str) {
        this.zza = map;
        this.zzb = zzaVar;
        this.zzc = str;
        Objects.requireNonNull(zzbouVar);
        this.zzd = zzbouVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlz)).booleanValue()) {
            this.zza.put("u", str);
        }
        this.zzd.zzf(str, this.zzb, this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "OpenGmsgHandler.attributionReportingManager");
    }
}
