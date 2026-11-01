package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzcdh;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzay {
    private final String zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final zzcdh zzc;

    public /* synthetic */ zzay(zzax zzaxVar, byte[] bArr) {
        this.zza = zzaxVar.zzd();
        this.zzb = zzaxVar.zze();
        this.zzc = zzaxVar.zzf();
    }

    @Nullable
    public final String zzd() {
        return this.zzb;
    }

    @Nullable
    public final zzcdh zze() {
        return this.zzc;
    }

    public final Set zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public final zzbgj.zza.EnumC0190zza zzc() {
        byte b10;
        switch (this.zza) {
            case "NATIVE":
                b10 = 2;
                break;
            case "INTERSTITIAL":
                b10 = 1;
                break;
            case "REWARDED":
                b10 = 3;
                break;
            case "BANNER":
                b10 = 0;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            return zzbgj.zza.EnumC0190zza.BANNER;
        }
        if (b10 == 1) {
            return zzbgj.zza.EnumC0190zza.INTERSTITIAL;
        }
        if (b10 != 2) {
            return b10 != 3 ? zzbgj.zza.EnumC0190zza.AD_INITIATER_UNSPECIFIED : zzbgj.zza.EnumC0190zza.REWARD_BASED_VIDEO_AD;
        }
        return zzbgj.zza.EnumC0190zza.AD_LOADER;
    }
}
