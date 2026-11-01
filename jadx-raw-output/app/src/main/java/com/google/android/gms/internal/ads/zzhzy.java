package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhzy implements zzidk {
    static {
        zzibb zzibbVar = zzibb.zza;
        int i10 = zziaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzidk
    public final /* synthetic */ Object zza(InputStream inputStream, zzibb zzibbVar) throws zzicg {
        zziee zzieeVarZzaU;
        zziaq zziaqVarZzF = zziaq.zzF(inputStream, 4096);
        zzidc zzidcVar = (zzidc) zzb(zziaqVarZzF, zzibbVar);
        try {
            zziaqVarZzF.zzb(0);
            if (zzidcVar == null || zzidcVar.zzbi()) {
                return zzidcVar;
            }
            if (zzidcVar instanceof zzhzw) {
                zzieeVarZzaU = ((zzhzw) zzidcVar).zzaU();
            } else {
                if (zzidcVar instanceof zzhzx) {
                    throw null;
                }
                zzieeVarZzaU = new zziee(zzidcVar);
            }
            throw zzieeVarZzaU.zza();
        } catch (zzicg e10) {
            throw e10;
        }
    }
}
