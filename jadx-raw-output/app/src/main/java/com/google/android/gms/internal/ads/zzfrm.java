package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzfrm {
    private final String zza;

    @Nullable
    private final AdFormat zzb;

    @Nullable
    private final String zzc;

    public /* synthetic */ zzfrm(zzfrl zzfrlVar, byte[] bArr) {
        this.zza = zzfrlVar.zzb();
        this.zzb = zzfrlVar.zzc();
        this.zzc = zzfrlVar.zzd();
    }

    public final String zza() {
        return this.zza;
    }

    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    public final boolean equals(@Nullable Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof zzfrm) {
            zzfrm zzfrmVar = (zzfrm) obj;
            if (this.zza.equals(zzfrmVar.zza) && (adFormat = this.zzb) != null && (adFormat2 = zzfrmVar.zzb) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String zzb() {
        AdFormat adFormat = this.zzb;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(Locale.ENGLISH);
    }
}
