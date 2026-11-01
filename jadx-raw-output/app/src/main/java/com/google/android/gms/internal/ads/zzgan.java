package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgan {
    private static zzgan zzb;
    public final zzgaj zza;

    public static final zzgan zza(Context context) {
        zzgan zzganVar;
        synchronized (zzgan.class) {
            if (zzb == null) {
                zzb = new zzgan(context);
            }
            zzganVar = zzb;
        }
        return zzganVar;
    }

    public final void zzb(@Nullable zzgah zzgahVar) throws IOException {
        synchronized (zzgan.class) {
            zzgaj zzgajVar = this.zza;
            zzgajVar.zzf("vendor_scoped_gpid_v2_id");
            zzgajVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }

    private zzgan(Context context) {
        this.zza = zzgaj.zza(context);
        zzgai.zza(context);
    }
}
