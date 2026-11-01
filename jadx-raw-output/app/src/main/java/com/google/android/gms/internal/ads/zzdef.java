package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdef implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdeg zzdegVar = (zzdeg) this.zza.get();
        if (zzdegVar != null) {
            zzdegVar.zzs(new zzdhc() { // from class: com.google.android.gms.internal.ads.zzdec
                @Override // com.google.android.gms.internal.ads.zzdhc
                public final /* synthetic */ void zza(Object obj) throws ExecutionException, InterruptedException {
                    ((zzdeb) obj).zzL();
                }
            });
        }
    }
}
