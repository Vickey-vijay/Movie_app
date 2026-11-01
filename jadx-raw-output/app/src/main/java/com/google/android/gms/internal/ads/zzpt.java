package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzpt extends AudioDeviceCallback {
    public final /* synthetic */ zzpx zza;

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpx zzpxVar = this.zza;
        zzpxVar.zzf(zzps.zza(zzpxVar.zzg(), zzpxVar.zzj(), zzpxVar.zzh()));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = zzfj.zza;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            zzpx zzpxVar = this.zza;
            if (Objects.equals(audioDeviceInfo, zzpxVar.zzh())) {
                zzpxVar.zzi(null);
                break;
            }
        }
        zzpx zzpxVar2 = this.zza;
        zzpxVar2.zzf(zzps.zza(zzpxVar2.zzg(), zzpxVar2.zzj(), zzpxVar2.zzh()));
    }

    public /* synthetic */ zzpt(zzpx zzpxVar, byte[] bArr) {
        Objects.requireNonNull(zzpxVar);
        this.zza = zzpxVar;
    }
}
