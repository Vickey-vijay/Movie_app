package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgst extends zzgsr implements ListIterator {
    public final /* synthetic */ zzgsu zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgst(zzgsu zzgsuVar) {
        super(zzgsuVar);
        Objects.requireNonNull(zzgsuVar);
        this.zzd = zzgsuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgst(zzgsu zzgsuVar, int i10) {
        super(zzgsuVar, ((List) zzgsuVar.zzb).listIterator(i10));
        Objects.requireNonNull(zzgsuVar);
        this.zzd = zzgsuVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzgsu zzgsuVar = this.zzd;
        boolean zIsEmpty = zzgsuVar.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzgsv zzgsvVar = zzgsuVar.zzf;
        zzgsvVar.zzq(zzgsvVar.zzp() + 1);
        if (zIsEmpty) {
            zzgsuVar.zzc();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }
}
