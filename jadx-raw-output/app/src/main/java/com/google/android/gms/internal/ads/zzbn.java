package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbn {
    public static final zzbn zza = new zzbn(zzguf.zzi());
    private final zzguf zzb;

    public final zzguf zza() {
        return this.zzb;
    }

    public final boolean zzb(int i10) {
        int i11 = 0;
        while (true) {
            zzguf zzgufVar = this.zzb;
            if (i11 >= zzgufVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgufVar.get(i11);
            if (zzbmVar.zzb() && zzbmVar.zzd() == i10) {
                return true;
            }
            i11++;
        }
    }

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbn.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbn) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public zzbn(List list) {
        this.zzb = zzguf.zzq(list);
    }
}
