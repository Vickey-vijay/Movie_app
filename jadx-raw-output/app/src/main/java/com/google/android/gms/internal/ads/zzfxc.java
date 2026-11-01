package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfxc {
    public final /* synthetic */ zzfxd zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public final synchronized void zza() {
        try {
            zzfxd zzfxdVar = this.zza;
            if (zzfxdVar.zzb) {
                zzfxg zzfxgVar = zzfxdVar.zza;
                zzfxgVar.zzg(this.zzb);
                zzfxgVar.zzh(this.zzc);
                zzfxgVar.zzi(this.zzd);
                zzfxgVar.zzf(null);
                zzfxgVar.zze();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }

    public final zzfxc zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzfxc zzc(int i10) {
        this.zzd = i10;
        return this;
    }

    public /* synthetic */ zzfxc(zzfxd zzfxdVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzfxdVar);
        this.zza = zzfxdVar;
        this.zzb = bArr;
    }
}
