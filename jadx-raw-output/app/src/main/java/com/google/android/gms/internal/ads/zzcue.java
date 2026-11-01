package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public class zzcue {
    private final zzcwd zza;
    private final View zzb;
    private final zzfis zzc;

    @Nullable
    private final zzcjl zzd;

    public zzcue(View view, @Nullable zzcjl zzcjlVar, zzcwd zzcwdVar, zzfis zzfisVar) {
        this.zzb = view;
        this.zzd = zzcjlVar;
        this.zza = zzcwdVar;
        this.zzc = zzfisVar;
    }

    @Nullable
    public final zzcjl zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcwd zzc() {
        return this.zza;
    }

    public final zzfis zzd() {
        return this.zzc;
    }

    public zzdcr zze(Set set) {
        return new zzdcr(set);
    }
}
