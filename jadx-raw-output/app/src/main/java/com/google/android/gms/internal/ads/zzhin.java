package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhin {
    public final zzhim zza;
    public final long[] zzb;

    public zzhin() {
        this(new zzhim(), new long[10]);
    }

    public zzhin(zzhim zzhimVar, long[] jArr) {
        this.zza = zzhimVar;
        this.zzb = jArr;
    }

    public static /* synthetic */ zzhin zza(zzhin zzhinVar, zzhil zzhilVar) {
        zzb(zzhinVar, zzhilVar);
        return zzhinVar;
    }

    public zzhin(zzhil zzhilVar) {
        this();
        zzb(this, zzhilVar);
    }

    private static zzhin zzb(zzhin zzhinVar, zzhil zzhilVar) {
        zzhim zzhimVar = zzhilVar.zza;
        zzhim zzhimVar2 = zzhinVar.zza;
        long[] jArr = zzhimVar2.zza;
        long[] jArr2 = zzhimVar.zza;
        long[] jArr3 = zzhilVar.zzb;
        zzhiv.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhimVar2.zzb;
        long[] jArr5 = zzhimVar.zzb;
        long[] jArr6 = zzhimVar.zzc;
        zzhiv.zze(jArr4, jArr5, jArr6);
        zzhiv.zze(zzhimVar2.zzc, jArr6, jArr3);
        zzhiv.zze(zzhinVar.zzb, jArr2, jArr5);
        return zzhinVar;
    }
}
