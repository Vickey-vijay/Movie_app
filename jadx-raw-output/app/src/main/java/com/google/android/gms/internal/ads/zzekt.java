package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzekt implements zzdmc {
    private final VersionInfoParcel zza;
    private final q5.i zzb;
    private final zzfir zzc;
    private final zzcjl zzd;
    private final zzfjk zze;
    private final zzbok zzf;
    private final boolean zzg;
    private final zzejf zzh;
    private final zzdxz zzi;

    public zzekt(VersionInfoParcel versionInfoParcel, q5.i iVar, zzfir zzfirVar, zzcjl zzcjlVar, zzfjk zzfjkVar, boolean z10, zzbok zzbokVar, zzejf zzejfVar, zzdxz zzdxzVar) {
        this.zza = versionInfoParcel;
        this.zzb = iVar;
        this.zzc = zzfirVar;
        this.zzd = zzcjlVar;
        this.zze = zzfjkVar;
        this.zzg = z10;
        this.zzf = zzbokVar;
        this.zzh = zzejfVar;
        this.zzi = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zzc;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z10, Context context, zzdbs zzdbsVar) {
        zzcti zzctiVar = (zzcti) zzgzo.zzt(this.zzb);
        zzcjl zzcjlVar = this.zzd;
        zzcjlVar.zzag(true);
        boolean z11 = this.zzg;
        boolean zZzc = z11 ? this.zzf.zzc(true) : true;
        boolean z12 = z11 && this.zzf.zzd();
        float fZze = z11 ? this.zzf.zze() : 0.0f;
        zzfir zzfirVar = this.zzc;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, true, z12, fZze, -1, z10, zzfirVar.zzO, false);
        if (zzdbsVar != null) {
            zzdbsVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdlr zzdlrVarZzj = zzctiVar.zzj();
        int i10 = zzfirVar.zzQ;
        if (i10 == -1) {
            com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzk;
            if (zzxVar == null) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
            } else {
                int i12 = zzxVar.zza;
                if (i12 == 1) {
                    i10 = 7;
                } else if (i12 == 2) {
                    i10 = 6;
                } else {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
                }
            }
        }
        int i14 = i10;
        VersionInfoParcel versionInfoParcel = this.zza;
        String str = zzfirVar.zzB;
        zzfiw zzfiwVar = zzfirVar.zzs;
        String str2 = zzfiwVar.zzb;
        String str3 = zzfiwVar.zza;
        zzfjk zzfjkVar = this.zze;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdlrVarZzj, null, zzcjlVar, i14, versionInfoParcel, str, zzlVar, str2, str3, zzfjkVar.zzg, zzdbsVar, zzfirVar.zzb() ? this.zzh : null, zzcjlVar.zzn()), true, this.zzi);
    }
}
