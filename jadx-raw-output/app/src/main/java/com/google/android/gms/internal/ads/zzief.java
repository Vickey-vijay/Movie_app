package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzief {
    private static volatile int zza = 100;

    public abstract void zza(Object obj, int i10, long j10);

    public abstract void zzb(Object obj, int i10, int i11);

    public abstract void zzc(Object obj, int i10, long j10);

    public abstract void zzd(Object obj, int i10, zzian zzianVar);

    public abstract void zze(Object obj, int i10, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract Object zzh(Object obj);

    public abstract void zzi(Object obj, Object obj2);

    public abstract void zzj(Object obj);

    public final boolean zzk(Object obj, zzidp zzidpVar, int i10) throws IOException {
        int iZzc = zzidpVar.zzc();
        int i11 = iZzc >>> 3;
        int i12 = iZzc & 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                zzb(obj, i11, zzidpVar.zzk());
                                return true;
                            }
                            throw new zzicf("Protocol message tag had invalid wire type.");
                        }
                        if (i10 != 0) {
                            return false;
                        }
                        throw new zzicg("Protocol message end-group tag did not match expected tag.");
                    }
                    Object objZzf = zzf();
                    int i13 = i11 << 3;
                    int i14 = i10 + 1;
                    if (i14 < zza) {
                        while (zzidpVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzidpVar, i14)) {
                        }
                        if ((i13 | 4) == zzidpVar.zzc()) {
                            zze(obj, i11, zzg(objZzf));
                            return true;
                        }
                        throw new zzicg("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new zzicg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                zzd(obj, i11, zzidpVar.zzq());
                return true;
            }
            zzc(obj, i11, zzidpVar.zzj());
            return true;
        }
        zza(obj, i11, zzidpVar.zzh());
        return true;
    }
}
