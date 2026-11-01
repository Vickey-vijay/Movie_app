package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgai {
    private static zzgai zzb;
    public final zzgaj zza;

    public static final zzgai zza(Context context) {
        zzgai zzgaiVar;
        synchronized (zzgai.class) {
            if (zzb == null) {
                zzb = new zzgai(context);
            }
            zzgaiVar = zzb;
        }
        return zzgaiVar;
    }

    public final void zzb(boolean z10) throws IOException {
        synchronized (zzgai.class) {
            zzgaj zzgajVar = this.zza;
            zzgajVar.zzb("paidv2_publisher_option", Boolean.valueOf(z10));
            if (!z10) {
                zzgajVar.zzf("paidv2_creation_time");
                zzgajVar.zzf("paidv2_id");
                zzgajVar.zzf("vendor_scoped_gpid_v2_id");
                zzgajVar.zzf("vendor_scoped_gpid_v2_creation_time");
            }
        }
    }

    public final boolean zzc() {
        boolean zZze;
        synchronized (zzgai.class) {
            zZze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zZze;
    }

    public final void zzd(boolean z10) throws IOException {
        synchronized (zzgai.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z10));
        }
    }

    public final boolean zze() {
        boolean zZze;
        synchronized (zzgai.class) {
            zZze = this.zza.zze("paidv2_user_option", true);
        }
        return zZze;
    }

    private zzgai(Context context) {
        this.zza = zzgaj.zza(context);
    }
}
