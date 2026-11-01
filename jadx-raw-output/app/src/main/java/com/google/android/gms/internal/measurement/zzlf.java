package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzlf {
    private static final zzle zza;
    private static final zzle zzb;

    public static zzle zza() {
        return zza;
    }

    public static zzle zzb() {
        return zzb;
    }

    static {
        zzle zzleVar;
        try {
            zzleVar = (zzle) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzleVar = null;
        }
        zza = zzleVar;
        zzb = new zzle();
    }
}
