package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaiq extends zzain {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaiq.class == obj.getClass()) {
            zzaiq zzaiqVar = (zzaiq) obj;
            if (this.zza == zzaiqVar.zza && this.zzb == zzaiqVar.zzb && this.zzc == zzaiqVar.zzc && Arrays.equals(this.zzd, zzaiqVar.zzd) && Arrays.equals(this.zze, zzaiqVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public zzaiq(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final int hashCode() {
        return ((((((((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }
}
