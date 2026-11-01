package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzccm extends zzccr {
    public final zzikp zza;
    public final zzikp zzb;
    public final zzikp zzc;
    public final zzikp zzd;
    public final zzikp zze;
    public final zzikp zzf;
    public final zzikp zzg;
    public final zzikp zzh;
    private final Clock zzj;

    @Override // com.google.android.gms.internal.ads.zzccr
    public final zzccj zza() {
        return new zzccj(this.zzj, (zzcch) this.zzf.zzb());
    }

    public zzccm(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzccq zzccqVar) {
        this.zzj = clock;
        zzikg zzikgVarZza = zzikh.zza(context);
        this.zza = zzikgVarZza;
        zzikg zzikgVarZza2 = zzikh.zza(zzgVar);
        this.zzb = zzikgVarZza2;
        this.zzc = zzikf.zza(zzccg.zza(zzikgVarZza, zzikgVarZza2));
        zzikg zzikgVarZza3 = zzikh.zza(clock);
        this.zzd = zzikgVarZza3;
        zzikg zzikgVarZza4 = zzikh.zza(zzccqVar);
        this.zze = zzikgVarZza4;
        zzikp zzikpVarZza = zzikf.zza(zzcci.zza(zzikgVarZza3, zzikgVarZza2, zzikgVarZza4));
        this.zzf = zzikpVarZza;
        zzcck zzcckVarZzc = zzcck.zzc(zzikgVarZza3, zzikpVarZza);
        this.zzg = zzcckVarZzc;
        this.zzh = zzikf.zza(zzccx.zza(zzikgVarZza, zzcckVarZzc));
    }
}
