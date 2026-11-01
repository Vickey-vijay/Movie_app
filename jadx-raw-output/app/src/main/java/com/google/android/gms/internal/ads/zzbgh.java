package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbgh {
    public final /* synthetic */ zzbgi zza;
    private final byte[] zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        try {
            zzbgi zzbgiVar = this.zza;
            if (zzbgiVar.zzb) {
                zzbgiVar.zza.zzh(this.zzb);
                zzbgiVar.zza.zzi(0);
                zzbgiVar.zza.zzj(this.zzc);
                zzbgiVar.zza.zzg(null);
                zzbgiVar.zza.zzf();
                return;
            }
            return;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Clearcut log failed", e10);
            return;
        }
        throw th;
    }

    public final synchronized void zza() {
        this.zza.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbgg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final zzbgh zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public /* synthetic */ zzbgh(zzbgi zzbgiVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzbgiVar);
        this.zza = zzbgiVar;
        this.zzb = bArr;
    }
}
