package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqh implements zzdbz {
    private final zzdoh zza;
    private final zzdom zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdqh(zzdoh zzdohVar, zzdom zzdomVar, Executor executor, Executor executor2) {
        this.zza = zzdohVar;
        this.zzb = zzdomVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzcjl zzcjlVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcjlVar.zze("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        if (this.zzb.zzd()) {
            zzdoh zzdohVar = this.zza;
            zzekb zzekbVarZzZ = zzdohVar.zzZ();
            if (zzekbVarZzZ == null && zzdohVar.zzX() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgq)).booleanValue()) {
                q5.i iVarZzX = zzdohVar.zzX();
                zzcen zzcenVarZzY = zzdohVar.zzY();
                if (iVarZzX == null || zzcenVarZzY == null) {
                    return;
                }
                zzgzo.zzr(zzgzo.zzq(iVarZzX, zzcenVarZzY), new zzdqf(this), this.zzd);
                return;
            }
            if (zzekbVarZzZ != null) {
                zzcjl zzcjlVarZzW = zzdohVar.zzW();
                zzcjl zzcjlVarZzT = zzdohVar.zzT();
                if (zzcjlVarZzW == null) {
                    zzcjlVarZzW = zzcjlVarZzT == null ? null : zzcjlVarZzT;
                }
                if (zzcjlVarZzW != null) {
                    zza(zzcjlVarZzW);
                }
            }
        }
    }
}
