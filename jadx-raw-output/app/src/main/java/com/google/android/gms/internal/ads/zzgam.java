package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgam extends zzgak {
    private static zzgam zzd;

    private zzgam(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzgam zzh(Context context) {
        zzgam zzgamVar;
        synchronized (zzgam.class) {
            if (zzd == null) {
                zzd = new zzgam(context);
            }
            zzgamVar = zzd;
        }
        return zzgamVar;
    }

    public final zzgah zzi(long j10, boolean z10) throws IOException {
        synchronized (zzgam.class) {
            if (this.zzc.zzc()) {
                return zza(null, null, j10, z10);
            }
            return new zzgah();
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzgam.class) {
            if (zzg(false)) {
                zzc(false);
            }
        }
    }
}
