package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgta extends zzgvz implements Serializable {
    public final zzgqt zza;
    public final zzgvz zzb;

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgta) {
            zzgta zzgtaVar = (zzgta) obj;
            if (this.zza.equals(zzgtaVar.zza) && this.zzb.equals(zzgtaVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgvz, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzgqt zzgqtVar = this.zza;
        return this.zzb.compare(zzgqtVar.apply(obj), zzgqtVar.apply(obj2));
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        int length = string.length();
        String string2 = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(length + 12 + string2.length() + 1);
        sb2.append(string);
        sb2.append(".onResultOf(");
        sb2.append(string2);
        sb2.append(")");
        return sb2.toString();
    }

    public zzgta(zzgqt zzgqtVar, zzgvz zzgvzVar) {
        this.zza = zzgqtVar;
        this.zzb = zzgvzVar;
    }
}
