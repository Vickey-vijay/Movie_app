package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public interface zzml extends zzmg {
    String zzS();

    default boolean zzU(long j10) {
        return false;
    }

    default void zzV(float f10, float f11) throws zziw {
    }

    default void zzW() {
    }

    void zzX(long j10, long j11) throws zziw;

    boolean zzY();

    boolean zzZ();

    int zza();

    zzmn zzb();

    void zzc(int i10, zzpq zzpqVar, zzdn zzdnVar);

    void zzcT() throws zziw;

    void zzcU(zzv[] zzvVarArr, zzyc zzycVar, long j10, long j11, zzwk zzwkVar) throws zziw;

    @Nullable
    zzyc zzcV();

    boolean zzcW();

    @Nullable
    zzlm zzd();

    int zze();

    void zzf(zzmo zzmoVar, zzv[] zzvVarArr, zzyc zzycVar, long j10, boolean z10, boolean z11, long j11, long j12, zzwk zzwkVar) throws zziw;

    long zzk();

    void zzl();

    boolean zzm();

    void zzn() throws IOException;

    void zzo(zzbf zzbfVar);

    void zzp(long j10, boolean z10) throws zziw;

    void zzq();

    void zzr();

    void zzs();

    default void zzt() {
    }

    default long zzT(long j10, long j11) {
        if (zze() == 1 && (zzY() || zzZ())) {
            return 1000000L;
        }
        return 10000L;
    }
}
