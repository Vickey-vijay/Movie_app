package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgwb extends zzguf {
    public final /* synthetic */ zzgwc zza;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final boolean zzf() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzgwc zzgwcVar = this.zza;
        zzgrc.zzm(i10, zzgwcVar.zzw(), "index");
        int i11 = i10 + i10;
        Object obj = zzgwcVar.zzv()[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzgwcVar.zzv()[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public zzgwb(zzgwc zzgwcVar) {
        Objects.requireNonNull(zzgwcVar);
        this.zza = zzgwcVar;
    }
}
