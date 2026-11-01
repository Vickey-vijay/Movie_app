package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgus<K, V> extends zzgun<K, V> {
    private final transient zzgup<V> emptySet;
    private transient zzgup zza;

    public final zzgup zza() {
        zzgup zzgupVar = this.zza;
        if (zzgupVar != null) {
            return zzgupVar;
        }
        zzgur zzgurVar = new zzgur(this);
        this.zza = zzgurVar;
        return zzgurVar;
    }

    public zzgus(zzgui zzguiVar, int i10, Comparator comparator) {
        super(zzguiVar, i10);
        this.emptySet = zzgwg.zza;
    }
}
