package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhlm extends RuntimeException {
    public zzhlm(String str) {
        super(str);
    }

    public zzhlm(String str, Throwable th2) {
        super(str, th2);
    }

    public zzhlm(Throwable th2) {
        super(th2);
    }

    public static Object zza(zzhll zzhllVar) {
        try {
            return zzhllVar.zza();
        } catch (Exception e10) {
            throw new zzhlm(e10);
        }
    }
}
