package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzaca {
    private final Context zza;
    private boolean zzb;
    private zzuw zzc = zzuw.zzb;
    private final zzui zzd;

    @Nullable
    private Handler zze;

    @Nullable
    private zzadm zzf;

    public zzaca(Context context) {
        this.zza = context;
        this.zzd = new zzuc(context, null, null);
    }

    public final zzaca zza(zzuw zzuwVar) {
        this.zzc = zzuwVar;
        return this;
    }

    public final zzaca zzb(@Nullable Handler handler) {
        this.zze = handler;
        return this;
    }

    public final zzaca zzc(@Nullable zzadm zzadmVar) {
        this.zzf = zzadmVar;
        return this;
    }

    public final /* synthetic */ Context zze() {
        return this.zza;
    }

    public final /* synthetic */ zzuw zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzui zzg() {
        return this.zzd;
    }

    public final /* synthetic */ Handler zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzadm zzi() {
        return this.zzf;
    }

    public final zzacc zzd() {
        zzgrc.zzi(!this.zzb);
        Handler handler = this.zze;
        boolean z10 = false;
        if ((handler == null && this.zzf == null) || (handler != null && this.zzf != null)) {
            z10 = true;
        }
        zzgrc.zzi(z10);
        this.zzb = true;
        return new zzacc(this);
    }
}
