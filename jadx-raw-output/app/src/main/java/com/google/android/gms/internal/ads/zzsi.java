package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsi implements zzqm {

    @Nullable
    private final Context zza;

    @Nullable
    private final zzsh zzb;
    private zzed zzc;
    private zzdn zzd;
    private zzps zze;
    private zzpx zzf;

    @Nullable
    private Looper zzg;

    @Nullable
    private Context zzh;
    private final zzsm zzi;

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void zzd(zzdn zzdnVar) {
        this.zzd = zzdnVar;
    }

    public final /* synthetic */ void zzh(zzps zzpsVar) {
        this.zze = zzpsVar;
    }

    public final /* synthetic */ zzpx zzi() {
        return this.zzf;
    }

    private final void zzk() {
        if (this.zza == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zzg;
        boolean z10 = looper == null || looper == looperMyLooper;
        String strZzl = zzl(looper);
        String strZzl2 = zzl(looperMyLooper);
        if (!z10) {
            throw new IllegalStateException(zzgrt.zzd("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", strZzl, strZzl2));
        }
        this.zzg = looperMyLooper;
    }

    private static String zzl(@Nullable Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void zze() {
        zzed zzedVar = this.zzc;
        if (zzedVar != null) {
            zzedVar.zzf();
        }
        zzpx zzpxVar = this.zzf;
        if (zzpxVar != null) {
            zzpxVar.zze();
        }
    }

    public final zzsd zzf(zzql zzqlVar) throws zzqi {
        Context context;
        try {
            int i10 = zzqlVar.zzg;
            int i11 = zzqlVar.zzh;
            Context context2 = null;
            if (i11 != -1 && (context = this.zza) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.zzh;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.zzh = context.createDeviceContext(i11);
                }
                context2 = this.zzh;
                i10 = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzqlVar.zzf.zza()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zzqlVar.zzb).setChannelMask(zzqlVar.zzc).setEncoding(zzqlVar.zza).build()).setTransferMode(1).setBufferSizeInBytes(zzqlVar.zze).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i12 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new zzsd(audioTrackBuild, zzqlVar, this.zzb, this.zzd);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzqi();
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new zzqi(e10);
        }
    }

    public /* synthetic */ zzsi(zzsg zzsgVar, byte[] bArr) {
        this.zza = zzsgVar.zzd();
        zzsm zzsmVarZzg = zzsgVar.zzg();
        zzsmVarZzg.getClass();
        this.zzi = zzsmVarZzg;
        this.zze = zzsgVar.zze();
        this.zzb = zzsgVar.zzd() != null ? new zzsh(this, null) : null;
        this.zzd = zzdn.zza;
    }

    private final void zzj(zzqf zzqfVar) {
        Context context;
        zzk();
        zzpx zzpxVar = this.zzf;
        if (zzpxVar == null && (context = this.zza) != null) {
            zzpx zzpxVar2 = new zzpx(context, new zzpw() { // from class: com.google.android.gms.internal.ads.zzsf
                @Override // com.google.android.gms.internal.ads.zzpw
                public final /* synthetic */ void zza(zzps zzpsVar) {
                    this.zza.zzg(zzpsVar);
                }
            }, zzqfVar.zzb, zzqfVar.zzc);
            this.zzf = zzpxVar2;
            this.zze = zzpxVar2.zzd();
        } else if (zzpxVar != null) {
            AudioDeviceInfo audioDeviceInfo = zzqfVar.zzc;
            if (audioDeviceInfo != null) {
                zzpxVar.zzc(audioDeviceInfo);
            }
            this.zzf.zzb(zzqfVar.zzb);
        }
        this.zze.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzqh zza(zzqf zzqfVar) {
        zzj(zzqfVar);
        zzsm zzsmVar = this.zzi;
        zzv zzvVar = zzqfVar.zza;
        zzd zzdVar = zzqfVar.zzb;
        zzpz zzpzVarZza = zzsmVar.zza(zzvVar, zzdVar);
        zzqg zzqgVar = new zzqg();
        int i10 = 0;
        if (Objects.equals(zzvVar.zzo, "audio/raw")) {
            int i11 = zzvVar.zzI;
            if (!zzfj.zzA(i11)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 22);
                sb2.append("Invalid PCM encoding: ");
                sb2.append(i11);
                zzee.zzc("ATAudioOutputProvider", sb2.toString());
            } else if (i11 != 2) {
                i10 = 1;
            } else {
                i10 = 2;
            }
        } else if (this.zze.zzd(zzvVar, zzdVar) != null) {
            i10 = 2;
        }
        zzqgVar.zzd(i10);
        zzqgVar.zza(zzpzVarZza.zzb);
        zzqgVar.zzb(zzpzVarZza.zzc);
        zzqgVar.zzc(zzpzVarZza.zzd);
        return zzqgVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final zzql zzb(zzqf zzqfVar) throws zzqd {
        int i10;
        int iIntValue;
        int i11;
        int iZzD;
        int i12;
        boolean z10;
        zzj(zzqfVar);
        zzv zzvVar = zzqfVar.zza;
        String str = zzvVar.zzo;
        if (Objects.equals(str, "audio/raw")) {
            i12 = zzvVar.zzI;
            zzgrc.zza(zzfj.zzA(i12));
            i10 = zzvVar.zzH;
            int i13 = zzvVar.zzG;
            iIntValue = zzfj.zzB(i13);
            iZzD = zzfj.zzD(i12) * i13;
            i11 = 0;
        } else {
            i10 = zzvVar.zzH;
            zzpz zzpzVar = zzpz.zza;
            Pair pairZzd = this.zze.zzd(zzvVar, zzqfVar.zzb);
            if (pairZzd != null) {
                int iIntValue2 = ((Integer) pairZzd.first).intValue();
                iIntValue = ((Integer) pairZzd.second).intValue();
                i11 = 2;
                iZzD = -1;
                i12 = iIntValue2;
            } else {
                throw new zzqd("Unable to configure passthrough for: ".concat(String.valueOf(zzvVar)));
            }
        }
        int i14 = zzvVar.zzj;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i14 == -1) {
            i14 = 768000;
        }
        int i15 = i14;
        int iMax = zzqfVar.zzf;
        if (iMax == -1) {
            int minBufferSize = AudioTrack.getMinBufferSize(i10, iIntValue, i12);
            int i16 = 1;
            if (minBufferSize != -2) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzgrc.zzi(z10);
            if (iZzD != -1) {
                i16 = iZzD;
            }
            iMax = (((Math.max(minBufferSize, zzsy.zzb(minBufferSize, i12, i11, i16, i10, i15)) + i16) - 1) / i16) * i16;
        }
        zzqk zzqkVar = new zzqk();
        zzqkVar.zzb(i10);
        zzqkVar.zzc(iIntValue);
        zzqkVar.zza(i12);
        zzqkVar.zze(iMax);
        zzqkVar.zzg(zzqfVar.zzd);
        zzqkVar.zzf(zzqfVar.zzb);
        zzqkVar.zzd(false);
        zzqkVar.zzh(zzqfVar.zze);
        return new zzql(zzqkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void zzc(zzqj zzqjVar) {
        zzk();
        if (this.zzc == null) {
            zzed zzedVar = new zzed(Thread.currentThread());
            this.zzc = zzedVar;
            zzedVar.zzg(false);
        }
        this.zzc.zzb(zzqjVar);
    }

    public final void zzg(zzps zzpsVar) {
        zzk();
        zzps zzpsVar2 = this.zze;
        if (zzpsVar2 != null && !zzpsVar.equals(zzpsVar2)) {
            this.zze = zzpsVar;
            zzed zzedVar = this.zzc;
            if (zzedVar != null) {
                zzedVar.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzse
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj) {
                        ((zzqj) obj).zza();
                    }
                });
                zzedVar.zze();
            }
        }
    }
}
