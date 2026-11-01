package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzfua implements Runnable {
    public final /* synthetic */ zzfub zza;
    private final WebView zzb;

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }

    public zzfua(zzfub zzfubVar) {
        Objects.requireNonNull(zzfubVar);
        this.zza = zzfubVar;
        this.zzb = zzfubVar.zzq();
    }
}
