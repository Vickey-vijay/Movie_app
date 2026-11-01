package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbjt {
    public static final zzbio zza = zzbio.zza("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbio zzb;

    static {
        zzbio.zza("gads:invalidate_token_at_refresh_start", true);
        zzbio.zza("gms:expose_token_for_gma:enabled", true);
        zzbio.zza("gads:referesh_rate_limit", false);
        zzb = zzbio.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbio.zza("gads:token_anonymization:enabled", true);
        zzbio.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
