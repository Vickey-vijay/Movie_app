package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfet extends zzfeb {
    @Override // com.google.android.gms.internal.ads.zzfeb
    public final /* bridge */ /* synthetic */ zzdal zzc(zzctu zzctuVar, zzdao zzdaoVar, zzdhf zzdhfVar) {
        zzctk zzctkVarZzk = this.zza.zzk();
        zzctkVarZzk.zzd(zzdaoVar);
        zzctkVarZzk.zze(zzdhfVar);
        return zzctkVarZzk;
    }

    public zzfet(Context context, Executor executor, zzcma zzcmaVar, zzfgj zzfgjVar, zzfer zzferVar, zzfjj zzfjjVar, VersionInfoParcel versionInfoParcel) {
        super(context, executor, zzcmaVar, zzfgjVar, zzferVar, zzfjjVar, versionInfoParcel);
    }
}
