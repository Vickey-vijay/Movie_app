package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcfd implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzcfi zzc;

    public zzcfd(zzcfi zzcfiVar, int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
        Objects.requireNonNull(zzcfiVar);
        this.zzc = zzcfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfi zzcfiVar = this.zzc;
        if (zzcfiVar.zzt() != null) {
            zzcfiVar.zzt().zzj(this.zza, this.zzb);
        }
    }
}
