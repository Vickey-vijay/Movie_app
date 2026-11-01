package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrl implements Iterable {
    public final /* synthetic */ CharSequence zza;
    public final /* synthetic */ zzgrr zzb;

    public zzgrl(zzgrr zzgrrVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzgrrVar);
        this.zzb = zzgrrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzgqw.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
