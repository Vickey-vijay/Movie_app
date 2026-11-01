package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzrj {
    void zzA();

    void zzB();

    default void zzC() {
    }

    void zza(zzrg zzrgVar);

    default void zzb(@Nullable zzpq zzpqVar) {
    }

    default void zzc(zzdn zzdnVar) {
    }

    boolean zzd(zzv zzvVar);

    int zze(zzv zzvVar);

    default zzpz zzf(zzv zzvVar) {
        throw null;
    }

    long zzg(boolean z10);

    void zzh(zzv zzvVar, int i10, @Nullable int[] iArr) throws zzre;

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j10, int i10) throws zzri, zzrf;

    void zzl() throws zzri;

    boolean zzm();

    boolean zzn();

    void zzo(zzav zzavVar);

    zzav zzp();

    void zzq(boolean z10);

    void zzr(zzd zzdVar);

    void zzs(int i10);

    void zzt(zze zzeVar);

    default void zzu(@Nullable AudioDeviceInfo audioDeviceInfo) {
    }

    default void zzv(int i10) {
    }

    long zzw();

    @RequiresApi(29)
    default void zzx(int i10, int i11) {
    }

    void zzy(float f10);

    void zzz();
}
