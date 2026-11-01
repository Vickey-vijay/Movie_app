package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
final class zzeab extends zzbqj {
    public final /* synthetic */ Object zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzfoe zzd;
    public final /* synthetic */ zzcen zze;
    public final /* synthetic */ zzeak zzf;

    public zzeab(zzeak zzeakVar, Object obj, String str, long j10, zzfoe zzfoeVar, zzcen zzcenVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = zzfoeVar;
        this.zze = zzcenVar;
        Objects.requireNonNull(zzeakVar);
        this.zzf = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zze() {
        synchronized (this.zza) {
            zzeak zzeakVar = this.zzf;
            String str = this.zzb;
            zzeakVar.zzm(str, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzeakVar.zzr().zzb(str);
            zzeakVar.zzs().zzb(str);
            zzfor zzforVarZzt = zzeakVar.zzt();
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzd(true);
            zzforVarZzt.zzb(zzfoeVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzf(String str) {
        synchronized (this.zza) {
            zzeak zzeakVar = this.zzf;
            String str2 = this.zzb;
            zzeakVar.zzm(str2, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc));
            zzeakVar.zzr().zzc(str2, "error");
            zzeakVar.zzs().zzc(str2, "error");
            zzfor zzforVarZzt = zzeakVar.zzt();
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzk(str);
            zzfoeVar.zzd(false);
            zzforVarZzt.zzb(zzfoeVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }
}
