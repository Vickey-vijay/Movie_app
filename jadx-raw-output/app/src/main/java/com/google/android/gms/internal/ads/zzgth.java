package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgth extends AbstractSet {
    public final /* synthetic */ zzgtm zza;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        if (mapZzc != null) {
            return mapZzc.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzi = zzgtmVar.zzi(entry.getKey());
            if (iZzi != -1 && Objects.equals(zzgtmVar.zzp(iZzi), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        return mapZzc != null ? mapZzc.entrySet().iterator() : new zzgtf(zzgtmVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        if (mapZzc != null) {
            return mapZzc.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzgtmVar.zzb()) {
            return false;
        }
        int iZzh = zzgtmVar.zzh();
        int iZze = zzgtn.zze(entry.getKey(), entry.getValue(), iZzh, zzgtmVar.zzk(), zzgtmVar.zzl(), zzgtmVar.zzm(), zzgtmVar.zzn());
        if (iZze == -1) {
            return false;
        }
        zzgtmVar.zze(iZze, iZzh);
        zzgtmVar.zzu(zzgtmVar.zzt() - 1);
        zzgtmVar.zzd();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    public /* synthetic */ zzgth(zzgtm zzgtmVar, byte[] bArr) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
    }
}
