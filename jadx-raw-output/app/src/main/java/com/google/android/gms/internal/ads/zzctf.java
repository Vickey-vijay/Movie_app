package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzctf {
    private final zzdxz zza;
    private final zzfjc zzb;

    public zzctf(zzdxz zzdxzVar, zzfjc zzfjcVar) {
        this.zza = zzdxzVar;
        this.zzb = zzfjcVar;
    }

    public final void zza(long j10, int i10) {
        String str;
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zza(this.zzb.zzb.zzb);
        zzdxyVarZza.zzc("action", "ad_closed");
        zzdxyVarZza.zzc("show_time", String.valueOf(j10));
        zzdxyVarZza.zzc("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        if (i11 == 0) {
            str = "h";
        } else if (i11 == 1) {
            str = "bb";
        } else if (i11 == 2) {
            str = "cc";
        } else if (i11 != 3) {
            str = i11 != 4 ? "u" : CampaignEx.KEY_ACTIVITY_PATH_AND_NAME;
        } else {
            str = "cb";
        }
        zzdxyVarZza.zzc("acr", str);
        zzdxyVarZza.zzd();
    }
}
