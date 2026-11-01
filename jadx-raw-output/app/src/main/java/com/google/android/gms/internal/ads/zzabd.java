package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzabd implements Runnable {
    private final zzabc zza;

    public zzabd(zzabc zzabcVar) {
        this.zza = zzabcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzo();
    }
}
