package com.google.android.gms.internal.ads;

import com.ironsource.C3426d4;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzhad extends zzgyh.zzf implements Runnable {
    private final Runnable zza;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th2) {
            zzb(th2);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 7);
        sb2.append("task=[");
        sb2.append(string);
        sb2.append(C3426d4.j.f28588e);
        return sb2.toString();
    }

    public zzhad(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }
}
