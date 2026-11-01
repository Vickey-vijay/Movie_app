package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcff implements Runnable {
    public final /* synthetic */ zzcfi zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcfi zzcfiVar = this.zza;
        if (zzcfiVar.zzt() != null) {
            if (!zzcfiVar.zzu()) {
                zzcfiVar.zzt().zzk();
                zzcfiVar.zzv(true);
            }
            zzcfiVar.zzt().zzc();
        }
    }

    public zzcff(zzcfi zzcfiVar) {
        Objects.requireNonNull(zzcfiVar);
        this.zza = zzcfiVar;
    }
}
