package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbap implements Runnable {
    public final /* synthetic */ zzbar zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd();
    }

    public zzbap(zzbar zzbarVar) {
        Objects.requireNonNull(zzbarVar);
        this.zza = zzbarVar;
    }
}
