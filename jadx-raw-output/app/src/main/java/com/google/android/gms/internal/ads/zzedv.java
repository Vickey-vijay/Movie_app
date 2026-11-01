package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzedv implements zzgzl {
    public final /* synthetic */ zzedy zza;

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue()) {
            Matcher matcher = zzedy.zzh.matcher(th2.getMessage());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                zzedy zzedyVar = this.zza;
                zzedyVar.zzc().zzc(Integer.parseInt(strGroup));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue()) {
            zzedy zzedyVar = this.zza;
            zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
            zzedyVar.zzc().zzc(zzfiuVar.zzf);
            zzedyVar.zzc().zze(zzfiuVar.zzg);
        }
    }

    public zzedv(zzedy zzedyVar) {
        Objects.requireNonNull(zzedyVar);
        this.zza = zzedyVar;
    }
}
