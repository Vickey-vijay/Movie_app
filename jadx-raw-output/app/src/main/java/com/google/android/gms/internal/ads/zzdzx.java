package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzx implements zzdzi {
    private final long zza;
    private final zzdzm zzb;
    private final zzfii zzc;

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zzc() {
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzdzm zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzc(zzmVar, new zzdzv(this));
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdzi
    public final void zzb() {
        try {
            zzfii zzfiiVar = this.zzc;
            zzfiiVar.zze(new zzdzw(this));
            zzfiiVar.zzb(ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public zzdzx(long j10, Context context, zzdzm zzdzmVar, zzcma zzcmaVar, String str) {
        this.zza = j10;
        this.zzb = zzdzmVar;
        zzfik zzfikVarZzq = zzcmaVar.zzq();
        zzfikVarZzq.zzc(context);
        zzfikVarZzq.zzb(str);
        this.zzc = zzfikVarZzq.zza().zzb();
    }
}
