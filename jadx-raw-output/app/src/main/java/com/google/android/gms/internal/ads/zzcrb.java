package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzcrb implements zzcql {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzt.zzh().zzo();

    public zzcrb(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcql
    public final void zza(Map map) {
        String str;
        if (!map.isEmpty() && (str = (String) map.get("gad_idless")) != null) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
            boolean z10 = Boolean.parseBoolean(str);
            zzgVar.zzw(z10);
            if (z10) {
                com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
            }
        }
    }
}
