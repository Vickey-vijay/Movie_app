package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtk extends zzgsw {
    public final /* synthetic */ zzgtm zza;
    private final Object zzb;
    private int zzc;

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    private final void zza() {
        int i10 = this.zzc;
        if (i10 != -1) {
            zzgtm zzgtmVar = this.zza;
            if (i10 < zzgtmVar.size() && Objects.equals(this.zzb, zzgtmVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object getValue() {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzgtmVar.zzp(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            zzgtmVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgtmVar.zzp(i10);
        zzgtmVar.zzq(this.zzc, obj);
        return objZzp;
    }

    public zzgtk(zzgtm zzgtmVar, int i10) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
        this.zzb = zzgtmVar.zzo(i10);
        this.zzc = i10;
    }
}
