package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzfuo implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (zzfur.zzc != null) {
            zzfur.zzc.post(zzfur.zzk);
            zzfur.zzc.postDelayed(zzfur.zzl, 200L);
        }
    }
}
