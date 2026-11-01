package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzs {
    private final SparseBooleanArray zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            return this.zza.equals(((zzs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final boolean zza(int i10) {
        return this.zza.get(i10);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i10) {
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzgrc.zzm(i10, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i10);
    }
}
