package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public interface zzagh {
    default void zzN(long j10) {
    }

    default int zza(zzj zzjVar, int i10, boolean z10) throws IOException {
        return zzb(zzjVar, i10, z10, 0);
    }

    int zzb(zzj zzjVar, int i10, boolean z10, int i11) throws IOException;

    default void zzc(zzer zzerVar, int i10) {
        zzd(zzerVar, i10, 0);
    }

    void zzd(zzer zzerVar, int i10, int i11);

    void zze(long j10, int i10, int i11, int i12, @Nullable zzagg zzaggVar);

    void zzz(zzv zzvVar);
}
