package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhil {
    public final zzhim zza;
    public final long[] zzb;

    public zzhil() {
        this(new zzhim(), new long[10]);
    }

    public zzhil(zzhim zzhimVar, long[] jArr) {
        this.zza = zzhimVar;
        this.zzb = jArr;
    }

    public zzhil(zzhil zzhilVar) {
        this.zza = new zzhim(zzhilVar.zza);
        this.zzb = Arrays.copyOf(zzhilVar.zzb, 10);
    }
}
