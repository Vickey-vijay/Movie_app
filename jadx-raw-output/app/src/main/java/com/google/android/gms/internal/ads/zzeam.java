package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzeam implements zzdin {
    private final Bundle zza = new Bundle();

    @Override // com.google.android.gms.internal.ads.zzdin
    public final synchronized void zza(String str) {
        this.zza.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final synchronized void zzb(String str) {
        this.zza.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final synchronized void zzc(String str, String str2) {
        this.zza.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzf() {
    }

    public final synchronized Bundle zzg() {
        return new Bundle(this.zza);
    }

    @VisibleForTesting
    public zzeam() {
    }
}
