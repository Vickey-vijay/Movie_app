package com.google.android.gms.internal.common;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzag extends zzah {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzah zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzr.zzb(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzah
    /* JADX INFO: renamed from: zzi */
    public final zzah subList(int i10, int i11) {
        zzr.zzd(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }

    public zzag(zzah zzahVar, int i10, int i11) {
        Objects.requireNonNull(zzahVar);
        this.zzc = zzahVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
