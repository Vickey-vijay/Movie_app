package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zziaf extends zziag {
    public final /* synthetic */ zzian zza;
    private int zzb;
    private final int zzc;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziai
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }

    public zziaf(zzian zzianVar) {
        Objects.requireNonNull(zzianVar);
        this.zza = zzianVar;
        this.zzb = 0;
        this.zzc = zzianVar.zzc();
    }
}
