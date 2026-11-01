package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeue implements zzfax {
    private final Executor zza;
    private final zzcdu zzb;

    public zzeue(Executor executor, zzcdu zzcduVar) {
        this.zza = executor;
        this.zzb = zzcduVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdJ)).booleanValue()) {
            return zzgzo.zza(new zzeuf(null));
        }
        zzcdu zzcduVar = this.zzb;
        return zzgzo.zzk(zzcduVar.zzq(), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzeud
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new zzeuf(arrayList);
            }
        }, this.zza);
    }
}
