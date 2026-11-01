package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhjx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhjb zzc = new zzhjb() { // from class: com.google.android.gms.internal.ads.zzhjw
        @Override // com.google.android.gms.internal.ads.zzhjb
        public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
            int i10 = zzhjx.zza;
            zzhqf zzhqfVarZzc = ((zzhjp) zzhbpVar).zzb().zzc();
            zzhba zzhbaVarZzd = zzhjc.zza().zzd(zzhqfVarZzc.zza());
            if (!zzhjc.zza().zze(zzhqfVarZzc.zza())) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            zzhqc zzhqcVarZzd = zzhbaVarZzd.zzd(zzhqfVarZzc.zzb());
            return new zzhjo(zzhlb.zza(zzhqcVarZzd.zza(), zzhqcVarZzd.zzb(), zzhqcVarZzd.zzc(), zzhqfVarZzc.zzc(), num), zzhax.zza());
        }
    };
    private static final zzhjx zzd = zzd();
    private final Map zzb = new HashMap();

    public static zzhjx zza() {
        return zzd;
    }

    private final synchronized zzhaz zze(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
        zzhjb zzhjbVar;
        zzhjbVar = (zzhjb) this.zzb.get(zzhbpVar.getClass());
        if (zzhjbVar == null) {
            String string = zzhbpVar.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 86);
            sb2.append("Cannot create a new key for parameters ");
            sb2.append(string);
            sb2.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb2.toString());
        }
        return zzhjbVar.zza(zzhbpVar, num);
    }

    public final synchronized void zzb(zzhjb zzhjbVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        zzhjb zzhjbVar2 = (zzhjb) map.get(cls);
        if (zzhjbVar2 != null && !zzhjbVar2.equals(zzhjbVar)) {
            String string = cls.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 60);
            sb2.append("Different key creator for parameters class ");
            sb2.append(string);
            sb2.append(" already inserted");
            throw new GeneralSecurityException(sb2.toString());
        }
        map.put(cls, zzhjbVar);
    }

    private static zzhjx zzd() {
        zzhjx zzhjxVar = new zzhjx();
        try {
            zzhjxVar.zzb(zzc, zzhjp.class);
            return zzhjxVar;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    public final zzhaz zzc(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
        return zze(zzhbpVar, num);
    }
}
