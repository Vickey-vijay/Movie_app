package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzayy implements Runnable {
    public final /* synthetic */ zzayz zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzayz zzayzVar = this.zza;
        synchronized (zzayzVar.zzp()) {
            if (zzayzVar.zzq()) {
                return;
            }
            zzayzVar.zzr(true);
            try {
                zzayzVar.zzn();
            } catch (Exception e10) {
                this.zza.zzo().zzc(2023, -1L, e10);
            }
            zzayz zzayzVar2 = this.zza;
            synchronized (zzayzVar2.zzp()) {
                zzayzVar2.zzr(false);
            }
        }
    }

    public zzayy(zzayz zzayzVar) {
        Objects.requireNonNull(zzayzVar);
        this.zza = zzayzVar;
    }
}
