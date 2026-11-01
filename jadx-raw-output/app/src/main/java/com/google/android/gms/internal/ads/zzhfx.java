package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzhfx extends zzhch {
    private final zzhfw zza;

    private zzhfx(zzhfw zzhfwVar) {
        this.zza = zzhfwVar;
    }

    public static zzhfx zzb(zzhfw zzhfwVar) {
        return new zzhfx(zzhfwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zza != zzhfw.zzc;
    }

    public final zzhfw zzc() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhfx) && ((zzhfx) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhfx.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 40);
        sb2.append("XChaCha20Poly1305 Parameters (variant: ");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }
}
