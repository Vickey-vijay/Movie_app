package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgue extends zzguf {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzguf zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final boolean zzf() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzgrc.zzm(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    /* JADX INFO: renamed from: zzh */
    public final zzguf subList(int i10, int i11) {
        zzgrc.zzo(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }

    public zzgue(zzguf zzgufVar, int i10, int i11) {
        Objects.requireNonNull(zzgufVar);
        this.zzc = zzgufVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzguf, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
