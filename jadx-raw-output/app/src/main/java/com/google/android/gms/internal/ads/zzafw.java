package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.C3426d4;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafw {
    public final zzafz zza;
    public final zzafz zzb;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafw.class == obj.getClass()) {
            zzafw zzafwVar = (zzafw) obj;
            if (this.zza.equals(zzafwVar.zza) && this.zzb.equals(zzafwVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzafz zzafzVar = this.zza;
        zzafz zzafzVar2 = this.zzb;
        String string = zzafzVar.toString();
        String strConcat = zzafzVar.equals(zzafzVar2) ? "" : ", ".concat(zzafzVar2.toString());
        StringBuilder sb2 = new StringBuilder(string.length() + 1 + strConcat.length() + 1);
        sb2.append(C3426d4.j.f28586d);
        sb2.append(string);
        sb2.append(strConcat);
        sb2.append(C3426d4.j.f28588e);
        return sb2.toString();
    }

    public zzafw(zzafz zzafzVar, zzafz zzafzVar2) {
        this.zza = zzafzVar;
        this.zzb = zzafzVar2;
    }
}
