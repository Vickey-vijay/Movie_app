package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzecj {
    private final Context zza;
    private zzaqr zzb;

    public zzecj(Context context) {
        this.zza = context;
    }

    @Nullable
    public final zzaqv zzd() {
        try {
            zzaqr zzaqrVar = this.zzb;
            if (zzaqrVar != null && zzaqrVar.zza()) {
                return zzaqrVar.zzd();
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void zza() {
        this.zzb = zzaqq.zza(this.zza);
    }

    public final void zzb(zzaqu zzaquVar) {
        this.zzb.zzb(zzaquVar);
    }

    public final void zzc() {
        this.zzb.zzc();
    }
}
