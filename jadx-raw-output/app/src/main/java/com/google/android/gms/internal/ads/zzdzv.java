package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdzv extends zzcbf {
    public final /* synthetic */ zzdzx zza;

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zze() throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzk(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(int i10) throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzl(zzdzxVar.zzd(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzl(zzdzxVar.zzd(), zzeVar.zza);
    }

    public zzdzv(zzdzx zzdzxVar) {
        Objects.requireNonNull(zzdzxVar);
        this.zza = zzdzxVar;
    }
}
