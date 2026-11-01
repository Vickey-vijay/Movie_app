package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzbnu implements zzboh {
    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        if (map.containsKey("start")) {
            zzcjlVar.zzP().zzr();
        } else if (map.containsKey("stop")) {
            zzcjlVar.zzP().zzs();
        } else if (map.containsKey("cancel")) {
            zzcjlVar.zzP().zzt();
        }
    }
}
