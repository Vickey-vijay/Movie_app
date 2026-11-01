package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzakp implements zzagc {
    public static final zzakp zza = new zzakp(true);
    public static final zzakp zzb = new zzakp(false);
    public final boolean zzc;

    private zzakp(boolean z10) {
        this.zzc = z10;
    }

    public final String toString() {
        boolean z10 = !this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 33);
        sb2.append("IncorrectFragmentation{expected=");
        sb2.append(z10);
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
        return sb2.toString();
    }
}
