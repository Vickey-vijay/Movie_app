package com.google.android.gms.internal.ads;

import com.ironsource.C3537j8;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcfo implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzcfs zzb;

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{C3537j8.f29257k, String.valueOf(this.zza)});
    }

    public zzcfo(zzcfs zzcfsVar, boolean z10) {
        this.zza = z10;
        Objects.requireNonNull(zzcfsVar);
        this.zzb = zzcfsVar;
    }
}
