package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzbfh implements Runnable {
    public final /* synthetic */ zzbfl zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }

    public zzbfh(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }
}
