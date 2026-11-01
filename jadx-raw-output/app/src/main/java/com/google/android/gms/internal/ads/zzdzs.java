package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdzs extends com.google.android.gms.ads.internal.client.zzbj {
    public final /* synthetic */ zzdzm zza;
    public final /* synthetic */ zzdzt zzb;

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzj() {
    }

    public zzdzs(zzdzt zzdztVar, zzdzm zzdzmVar) {
        this.zza = zzdzmVar;
        Objects.requireNonNull(zzdztVar);
        this.zzb = zzdztVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() throws RemoteException {
        this.zza.zzi(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(int i10) throws RemoteException {
        this.zza.zzf(this.zzb.zzd(), i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        this.zza.zzf(this.zzb.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzf() throws RemoteException {
        this.zza.zze(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzg() throws RemoteException {
        this.zza.zzg(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzh() throws RemoteException {
        this.zza.zzh(this.zzb.zzd());
    }
}
