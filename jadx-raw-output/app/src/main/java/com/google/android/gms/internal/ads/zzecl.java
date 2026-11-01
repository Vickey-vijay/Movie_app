package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
final class zzecl implements zzaqu {
    public final /* synthetic */ zzecm zza;

    public zzecl(zzecm zzecmVar) {
        Objects.requireNonNull(zzecmVar);
        this.zza = zzecmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final void zza(int i10) {
        zzaqv zzaqvVarZzd;
        try {
            zzfpb zzfpbVarZza = zzfpc.zza();
            int i11 = 3;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            i11 = 7;
                        } else {
                            i11 = 6;
                        }
                    } else {
                        i11 = 5;
                    }
                } else {
                    i11 = 4;
                }
            }
            zzfpbVarZza.zzh(i11);
            if (i10 == 0 && (zzaqvVarZzd = this.zza.zzc().zzd()) != null) {
                zzfpbVarZza.zzb(zzaqvVarZzd.zzb());
                zzfpbVarZza.zzc(zzaqvVarZzd.zzc());
                zzfpbVarZza.zzd(zzaqvVarZzd.zzd());
                zzfpbVarZza.zze(zzaqvVarZzd.zze());
                zzfpbVarZza.zzf(zzaqvVarZzd.zzf());
                if (!TextUtils.isEmpty(zzaqvVarZzd.zza())) {
                    zzfpbVarZza.zza(zzaqvVarZzd.zza());
                }
                if (!TextUtils.isEmpty(zzaqvVarZzd.zzg())) {
                    zzfpbVarZza.zzg(zzaqvVarZzd.zzg());
                }
            }
            zzecm zzecmVar = this.zza;
            zzecmVar.zzc().zzc();
            zzdxz zzdxzVarZzd = zzecmVar.zzd();
            String strEncodeToString = Base64.encodeToString(((zzfpc) zzfpbVarZza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfO)).booleanValue()) {
                zzdxy zzdxyVarZza = zzdxzVarZzd.zza();
                zzdxyVarZza.zzc("action", "irda");
                zzdxyVarZza.zzc("irdd", strEncodeToString);
                zzdxyVarZza.zzf();
            }
            zzecmVar.zze().zzQ(true);
        } catch (Exception e10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfP)).booleanValue()) {
                zzecm zzecmVar2 = this.zza;
                if (zzecmVar2.zzb == null) {
                    zzecmVar2.zzb = zzbyp.zzc(zzecmVar2.zzb());
                }
                zzecmVar2.zzb.zzh(e10, "InstallReferrerUnsampled.onInstallReferrerSetupFinished");
                return;
            }
            zzecm zzecmVar3 = this.zza;
            if (zzecmVar3.zza == null) {
                zzecmVar3.zza = zzbyp.zza(zzecmVar3.zzb());
            }
            zzecmVar3.zza.zzh(e10, "InstallReferrer.onInstallReferrerSetupFinished");
        }
    }
}
