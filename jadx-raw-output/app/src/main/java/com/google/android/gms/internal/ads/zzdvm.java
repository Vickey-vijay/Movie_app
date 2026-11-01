package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvm {
    private final Map zza = new HashMap();

    public final synchronized void zza(String str, zzfki zzfkiVar) {
        zzbwh zzbwhVarZzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbwh zzbwhVarZzC = null;
        if (zzfkiVar == null) {
            zzbwhVarZzB = null;
        } else {
            try {
                zzbwhVarZzB = zzfkiVar.zzB();
            } catch (zzfjr unused) {
                zzbwhVarZzB = null;
            }
        }
        if (zzfkiVar != null) {
            try {
                zzbwhVarZzC = zzfkiVar.zzC();
            } catch (zzfjr unused2) {
            }
        }
        boolean z10 = false;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkN)).booleanValue()) {
            z10 = true;
        } else if (zzfkiVar != null) {
            try {
                zzfkiVar.zzn();
                z10 = true;
            } catch (zzfjr unused3) {
            }
        }
        this.zza.put(str, new zzdvl(str, zzbwhVarZzB, zzbwhVarZzC, z10));
    }

    public final synchronized void zzb(String str, zzbvs zzbvsVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdvl(str, zzbvsVar.zzf(), zzbvsVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    public final synchronized zzdvl zzc(String str) {
        return (zzdvl) this.zza.get(str);
    }

    public final String zzd(String str) {
        zzbwh zzbwhVar;
        zzdvl zzdvlVarZzc = zzc(str);
        if (zzdvlVarZzc != null && (zzbwhVar = zzdvlVarZzc.zzb) != null) {
            return zzbwhVar.toString();
        }
        return "";
    }
}
