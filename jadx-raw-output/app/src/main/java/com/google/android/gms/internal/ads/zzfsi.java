package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfsi {
    private boolean zza;

    public final boolean zza() {
        return this.zza;
    }

    public final void zzb(Context context) {
        zzfuh.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzftp.zza().zzb(context);
        zzftg.zza().zzd(context);
        zzfuc.zza(context);
        zzfud.zza(context);
        zzfug.zza(context);
        zzftm.zza().zzc(context);
        zzftf.zza().zzc(context);
        zzftr.zza().zzb(context);
    }
}
