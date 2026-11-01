package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaiw implements zzao {
    public final List zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaiw.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzaiw) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    public zzaiw(List list) {
        this.zza = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j10 = ((zzaiv) list.get(0)).zzb;
            for (int i10 = 1; i10 < list.size(); i10++) {
                if (((zzaiv) list.get(i10)).zza < j10) {
                    z10 = true;
                    break;
                }
                j10 = ((zzaiv) list.get(i10)).zzb;
            }
        }
        zzgrc.zza(!z10);
    }
}
