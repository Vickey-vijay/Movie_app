package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
final class zzhl extends zzgtv {
    private final Map zza;

    public zzhl(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgtv
    public final Map zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgtv, com.google.android.gms.internal.ads.zzgtw
    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgtv, java.util.Map
    public final boolean containsKey(@Nullable Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgtv, java.util.Map
    public final Set entrySet() {
        return zzgwp.zzb(this.zza.entrySet(), new zzgrd() { // from class: com.google.android.gms.internal.ads.zzhj
            @Override // com.google.android.gms.internal.ads.zzgrd
            public final /* synthetic */ boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgtv, java.util.Map
    public final boolean equals(@Nullable Object obj) {
        return obj != null && super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgtv, java.util.Map
    @Nullable
    public final /* synthetic */ Object get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgtv, java.util.Map
    public final boolean isEmpty() {
        return this.zza.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // com.google.android.gms.internal.ads.zzgtv, java.util.Map
    public final Set keySet() {
        return zzgwp.zzb(this.zza.keySet(), new zzgrd() { // from class: com.google.android.gms.internal.ads.zzhk
            @Override // com.google.android.gms.internal.ads.zzgrd
            public final /* synthetic */ boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgtv, java.util.Map
    public final boolean containsValue(@Nullable Object obj) {
        return super.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgtv, java.util.Map
    public final int hashCode() {
        return super.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgtv, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
