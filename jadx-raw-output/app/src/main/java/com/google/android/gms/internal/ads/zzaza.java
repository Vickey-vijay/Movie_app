package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzaza implements Runnable {
    public final /* synthetic */ zzazb zza;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzazb zzazbVar = this.zza;
        if (zzazbVar.zzb != null) {
            return;
        }
        synchronized (zzazb.zzd) {
            if (zzazbVar.zzb != null) {
                return;
            }
            boolean z10 = false;
            try {
                zBooleanValue = ((Boolean) zzbhe.zzdl.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzazb.zza = zzfxd.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z10 = zBooleanValue;
            this.zza.zzb = Boolean.valueOf(z10);
            zzazb.zzd.open();
        }
    }

    public zzaza(zzazb zzazbVar) {
        Objects.requireNonNull(zzazbVar);
        this.zza = zzazbVar;
    }
}
