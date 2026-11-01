package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzeop implements zzdmc {
    private final Context zza;
    private final zzduv zzb;
    private final zzfjk zzc;
    private final VersionInfoParcel zzd;
    private final zzfir zze;
    private final q5.i zzf;
    private final zzcjl zzg;
    private final zzbok zzh;
    private final boolean zzi;
    private final zzejf zzj;
    private final zzdxt zzk;
    private final zzdxz zzl;

    public zzeop(Context context, zzduv zzduvVar, zzfjk zzfjkVar, VersionInfoParcel versionInfoParcel, zzfir zzfirVar, q5.i iVar, zzcjl zzcjlVar, zzbok zzbokVar, boolean z10, zzejf zzejfVar, zzdxt zzdxtVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = zzduvVar;
        this.zzc = zzfjkVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfirVar;
        this.zzf = iVar;
        this.zzg = zzcjlVar;
        this.zzh = zzbokVar;
        this.zzi = z10;
        this.zzj = zzejfVar;
        this.zzk = zzdxtVar;
        this.zzl = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z10, Context context, zzdbs zzdbsVar) {
        zzdua zzduaVar = (zzdua) zzgzo.zzt(this.zzf);
        try {
            zzfir zzfirVar = this.zze;
            final zzcjl zzcjlVarZza = this.zzg;
            if (zzcjlVarZza.zzaB()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbt)).booleanValue()) {
                    zzcjlVarZza = this.zzb.zza(this.zzc.zzf, null, null);
                    zzbpa.zzb(zzcjlVarZza, zzduaVar.zzk());
                    final zzduz zzduzVar = new zzduz();
                    zzduaVar.zzl().zzi(zzcjlVarZza, true, this.zzi ? this.zzh : null, this.zzk.zze());
                    zzcjlVarZza.zzP().zzG(new zzclh(zzduzVar, zzcjlVarZza) { // from class: com.google.android.gms.internal.ads.zzeoo
                        private final /* synthetic */ zzcjl zza;

                        {
                            this.zza = zzcjlVarZza;
                        }

                        @Override // com.google.android.gms.internal.ads.zzclh
                        public final /* synthetic */ void zza(boolean z11, int i10, String str, String str2) {
                            zzcjl zzcjlVar = this.zza;
                            zzcjlVar.zzJ();
                            zzcjlVar.zzP().zzq();
                        }
                    });
                    zzcjlVarZza.zzP().zzH(new zzcli() { // from class: com.google.android.gms.internal.ads.zzeon
                        @Override // com.google.android.gms.internal.ads.zzcli
                        public final /* synthetic */ void zza() {
                            zzcjlVarZza.zzI();
                        }
                    });
                    zzfiw zzfiwVar = zzfirVar.zzs;
                    zzcjlVarZza.zzau(zzfiwVar.zzb, zzfiwVar.zza, null);
                }
            }
            zzcjl zzcjlVar = zzcjlVarZza;
            zzcjlVar.zzag(true);
            boolean z11 = this.zzi;
            boolean zZzc = z11 ? this.zzh.zzc(false) : false;
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zZzN = com.google.android.gms.ads.internal.util.zzs.zzN(this.zza);
            boolean z12 = z11 && this.zzh.zzd();
            float fZze = z11 ? this.zzh.zze() : 0.0f;
            zzfir zzfirVar2 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, zZzN, z12, fZze, -1, z10, zzfirVar2.zzO, zzfirVar2.zzP);
            if (zzdbsVar != null) {
                zzdbsVar.zzb();
            }
            com.google.android.gms.ads.internal.zzt.zzb();
            zzdlr zzdlrVarZzj = zzduaVar.zzj();
            int i10 = zzfirVar2.zzQ;
            VersionInfoParcel versionInfoParcel = this.zzd;
            String str = zzfirVar2.zzB;
            zzfiw zzfiwVar2 = zzfirVar2.zzs;
            String str2 = zzfiwVar2.zzb;
            String str3 = zzfiwVar2.zza;
            zzfjk zzfjkVar = this.zzc;
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdlrVarZzj, null, zzcjlVar, i10, versionInfoParcel, str, zzlVar, str2, str3, zzfjkVar.zzg, zzdbsVar, zzfirVar2.zzb() ? this.zzj : null, zzcjlVar.zzn()), true, this.zzl);
        } catch (zzcka e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }
}
