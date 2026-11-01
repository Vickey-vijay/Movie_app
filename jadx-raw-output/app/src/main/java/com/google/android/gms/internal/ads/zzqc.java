package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public interface zzqc {
    void zza();

    void zzb();

    boolean zzc(ByteBuffer byteBuffer, int i10, long j10) throws zzqb;

    void zzd();

    void zze();

    void zzf(float f10);

    boolean zzg();

    int zzh();

    int zzi();

    long zzj();

    long zzk();

    boolean zzl();

    void zzm(zzqa zzqaVar);

    default void zzn(zzpq zzpqVar) {
    }

    void zzo(@Nullable AudioDeviceInfo audioDeviceInfo);
}
