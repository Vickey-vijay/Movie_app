package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgvd extends zzgws {
    public final /* synthetic */ zzgve zza;

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvd(zzgve zzgveVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgveVar);
        this.zza = zzgveVar;
    }
}
