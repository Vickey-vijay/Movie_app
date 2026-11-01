package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzict implements zzidv {
    private static final zzida zzb = new zzicr();
    private final zzida zza;

    public zzict() {
        zzida zzidaVar = zzb;
        int i10 = zziaa.zza;
        zzics zzicsVar = new zzics(zzibk.zza(), zzidaVar);
        Charset charset = zzice.zza;
        this.zza = zzicsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidv
    public final zzidu zza(Class cls) {
        int i10 = zzidw.zza;
        if (!zzibr.class.isAssignableFrom(cls)) {
            int i11 = zziaa.zza;
        }
        zzicz zziczVarZzc = this.zza.zzc(cls);
        if (zziczVarZzc.zza()) {
            int i12 = zziaa.zza;
            return zzidg.zzh(zzidw.zzF(), zzibe.zza(), zziczVarZzc.zzb());
        }
        int i13 = zziaa.zza;
        return zzidf.zzm(cls, zziczVarZzc, zzidj.zza(), zzicp.zza(), zzidw.zzF(), zziczVarZzc.zzc() + (-1) != 1 ? zzibe.zza() : null, zzicy.zza());
    }
}
