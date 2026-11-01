package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfdc {
    private final zzbzu zza;
    private final int zzb;

    public zzfdc(zzbzu zzbzuVar, int i10) {
        this.zza = zzbzuVar;
        this.zzb = i10;
    }

    public final int zzf() {
        return this.zzb;
    }

    public final String zza() {
        return this.zza.zzd;
    }

    public final String zzb() {
        return zzgrt.zza(this.zza.zza.getString("ms"));
    }

    @Nullable
    public final PackageInfo zzc() {
        return this.zza.zzf;
    }

    public final List zzd() {
        return this.zza.zze;
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final boolean zzg() {
        return this.zza.zzk;
    }

    public final boolean zzh() {
        return this.zza.zzl;
    }

    public final int zzi() {
        Bundle bundle = this.zza.zza.getBundle("extras");
        if (bundle != null && !bundle.isEmpty()) {
            switch (bundle.getString("query_info_type", "")) {
                case "requester_type_0":
                    return 0;
                case "requester_type_1":
                    return 1;
                case "requester_type_2":
                    return 2;
                case "requester_type_3":
                    return 3;
                case "requester_type_4":
                    return 4;
                case "requester_type_5":
                    return 5;
                case "requester_type_6":
                    return 6;
                case "requester_type_7":
                    return 7;
                case "requester_type_8":
                    return 8;
            }
        }
        return -1;
    }

    public final int zzj() {
        return this.zza.zzo;
    }
}
