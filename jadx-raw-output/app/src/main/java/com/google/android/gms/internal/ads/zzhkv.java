package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhkv {
    private final Map zza;
    private final Map zzb;

    private zzhkv() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final /* synthetic */ Map zzd() {
        return this.zza;
    }

    public final /* synthetic */ Map zze() {
        return this.zzb;
    }

    public final zzhkv zza(zzhku zzhkuVar) throws GeneralSecurityException {
        if (zzhkuVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzhkw zzhkwVar = new zzhkw(zzhkuVar.zzb(), zzhkuVar.zzc(), null);
        Map map = this.zza;
        if (map.containsKey(zzhkwVar)) {
            zzhku zzhkuVar2 = (zzhku) map.get(zzhkwVar);
            if (!zzhkuVar2.equals(zzhkuVar) || !zzhkuVar.equals(zzhkuVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzhkwVar.toString()));
            }
        } else {
            map.put(zzhkwVar, zzhkuVar);
        }
        return this;
    }

    public final zzhkv zzb(zzhla zzhlaVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZza = zzhlaVar.zza();
        if (map.containsKey(clsZza)) {
            zzhla zzhlaVar2 = (zzhla) map.get(clsZza);
            if (!zzhlaVar2.equals(zzhlaVar) || !zzhlaVar.equals(zzhlaVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
            }
        } else {
            map.put(clsZza, zzhlaVar);
        }
        return this;
    }

    public final zzhky zzc() {
        return new zzhky(this, null);
    }

    public /* synthetic */ zzhkv(zzhky zzhkyVar, byte[] bArr) {
        this.zza = new HashMap(zzhkyVar.zzd());
        this.zzb = new HashMap(zzhkyVar.zze());
    }

    public /* synthetic */ zzhkv(byte[] bArr) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }
}
