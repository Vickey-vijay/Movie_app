package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C3426d4;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzps {

    @VisibleForTesting
    public static final zzgui zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzps zza = new zzps(zzguf.zzj(zzpr.zza));

    @SuppressLint({"InlinedApi"})
    private static final zzguf zzc = zzguf.zzl(2, 5, 6);

    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[RETURN] */
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzps)) {
            return false;
        }
        zzps zzpsVar = (zzps) obj;
        SparseArray sparseArray = this.zzd;
        SparseArray sparseArray2 = zzpsVar.zzd;
        String str = zzfj.zza;
        if (Build.VERSION.SDK_INT < 31) {
            int size = sparseArray.size();
            if (size == sparseArray2.size()) {
                for (int i10 = 0; i10 < size; i10++) {
                    if (Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                    }
                }
                if (this.zze == zzpsVar.zze) {
                    return true;
                }
            }
        } else if (sparseArray.contentEquals(sparseArray2)) {
            if (this.zze == zzpsVar.zze) {
                return true;
            }
        }
        return false;
    }

    static {
        zzguh zzguhVar = new zzguh();
        zzguhVar.zza(5, 6);
        zzguhVar.zza(17, 6);
        zzguhVar.zza(7, 6);
        zzguhVar.zza(30, 10);
        zzguhVar.zza(18, 6);
        zzguhVar.zza(6, 8);
        zzguhVar.zza(8, 8);
        zzguhVar.zza(14, 8);
        zzb = zzguhVar.zzc();
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static zzps zza(Context context, zzd zzdVar, @Nullable AudioDeviceInfo audioDeviceInfo) {
        return zzb(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzdVar, audioDeviceInfo);
    }

    private static boolean zze() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static zzguf zzf(@Nullable int[] iArr, int i10) {
        int i11 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i12 : iArr) {
            zzgucVar.zzf(new zzpr(i12, i10));
        }
        return zzgucVar.zzi();
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzfj.zza;
        int i10 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzd;
        if (i10 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iKeyAt = 17;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                iKeyAt = (((iKeyAt * 31) + sparseArray.keyAt(i11)) * 31) + Objects.hashCode(sparseArray.valueAt(i11));
            }
            iContentHashCode = iKeyAt;
        }
        return this.zze + (iContentHashCode * 31);
    }

    public final String toString() {
        String string = this.zzd.toString();
        int i10 = this.zze;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 50 + string.length() + 1);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i10);
        sb2.append(", audioProfiles=");
        sb2.append(string);
        sb2.append(C3426d4.j.f28588e);
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a A[PHI: r1
  0x003a: PHI (r1v3 int) = (r1v2 int), (r1v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    @Nullable
    public final Pair zzd(zzv zzvVar, zzd zzdVar) {
        String str = zzvVar.zzo;
        str.getClass();
        int iZzg = zzas.zzg(str, zzvVar.zzk);
        if (!zzb.containsKey(Integer.valueOf(iZzg))) {
            return null;
        }
        int i10 = 6;
        if (iZzg != 18) {
            if (iZzg != 8) {
                if (iZzg == 30 && !zzfj.zza(this.zzd, 30)) {
                    iZzg = 7;
                }
            } else if (zzfj.zza(this.zzd, 8)) {
                iZzg = 8;
                if (iZzg == 30) {
                    iZzg = 7;
                }
            } else {
                iZzg = 7;
            }
        } else if (zzfj.zza(this.zzd, 18)) {
            iZzg = 18;
            if (iZzg != 8) {
                if (iZzg == 30) {
                    iZzg = 7;
                }
            } else if (zzfj.zza(this.zzd, 8)) {
                iZzg = 8;
                if (iZzg == 30) {
                    iZzg = 7;
                }
            } else {
                iZzg = 7;
            }
        } else {
            iZzg = 6;
        }
        SparseArray sparseArray = this.zzd;
        if (!zzfj.zza(sparseArray, iZzg)) {
            return null;
        }
        zzpr zzprVar = (zzpr) sparseArray.get(iZzg);
        zzprVar.getClass();
        int iZzb = zzvVar.zzG;
        if (iZzb == -1 || iZzg == 18) {
            int i11 = zzvVar.zzH;
            if (i11 == -1) {
                i11 = 48000;
            }
            iZzb = zzprVar.zzb(i11, zzdVar);
        } else if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!zzprVar.zza(iZzb)) {
                return null;
            }
        } else if (iZzb > 10) {
            return null;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 > 28) {
            i10 = iZzb;
        } else if (iZzb == 7) {
            i10 = 8;
        } else if (iZzb != 3 && iZzb != 4 && iZzb != 5) {
            i10 = iZzb;
        }
        if (i12 <= 26 && "fugu".equals(Build.DEVICE) && i10 == 1) {
            i10 = 2;
        }
        int iZzB = zzfj.zzB(i10);
        if (iZzB != 0) {
            return Pair.create(Integer.valueOf(iZzg), Integer.valueOf(iZzB));
        }
        return null;
    }

    private zzps(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzpr zzprVar = (zzpr) list.get(i10);
            this.zzd.put(zzprVar.zzb, zzprVar);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.zzd.size(); i11++) {
            iMax = Math.max(iMax, ((zzpr) this.zzd.valueAt(i11)).zzc);
        }
        this.zze = iMax;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @SuppressLint({"InlinedApi"})
    public static zzps zzb(Context context, @Nullable Intent intent, zzd zzdVar, @Nullable AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo[] devices;
        boolean z10;
        AudioManager audioManagerZza = zzcj.zza(context);
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                List<AudioDeviceInfo> audioDevicesForAttributes = audioManagerZza.getAudioDevicesForAttributes(zzdVar.zza());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = audioDevicesForAttributes.get(0);
                } else {
                    audioDeviceInfo = null;
                }
            } else {
                audioDeviceInfo = null;
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && (zzfj.zzM(context) || zzfj.zzN(context))) {
            List<AudioProfile> directProfilesForAttributes = audioManagerZza.getDirectProfilesForAttributes(zzdVar.zza());
            HashMap map = new HashMap();
            map.put(2, new HashSet(zzgxz.zzg(12)));
            for (int i11 = 0; i11 < directProfilesForAttributes.size(); i11++) {
                AudioProfile audioProfile = directProfilesForAttributes.get(i11);
                if (audioProfile.getEncapsulationType() != 1) {
                    int format = audioProfile.getFormat();
                    if (zzfj.zzA(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(zzgxz.zzg(audioProfile.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(zzgxz.zzg(audioProfile.getChannelMasks())));
                        }
                    }
                }
            }
            int i12 = zzguf.zzd;
            zzguc zzgucVar = new zzguc();
            for (Map.Entry entry : map.entrySet()) {
                zzgucVar.zzf(new zzpr(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzps(zzgucVar.zzi());
        }
        if (audioDeviceInfo == null) {
            devices = audioManagerZza.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{audioDeviceInfo};
        }
        zzguo zzguoVar = new zzguo();
        zzguoVar.zzg(8, 7);
        if (i10 >= 31) {
            zzguoVar.zzg(26, 27);
        }
        if (i10 >= 33) {
            zzguoVar.zzf((Object) 30);
        }
        zzgup zzgupVarZzi = zzguoVar.zzi();
        for (AudioDeviceInfo audioDeviceInfo2 : devices) {
            if (zzgupVarZzi.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                return zza;
            }
        }
        zzguo zzguoVar2 = new zzguo();
        zzguoVar2.zzf((Object) 2);
        if (Build.VERSION.SDK_INT >= 29 && (zzfj.zzM(context) || zzfj.zzN(context))) {
            int i13 = zzguf.zzd;
            zzguc zzgucVar2 = new zzguc();
            zzgwt it = zzb.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (Build.VERSION.SDK_INT >= zzfj.zzC(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzdVar.zza())) {
                    zzgucVar2.zzf(Integer.valueOf(iIntValue));
                }
            }
            zzgucVar2.zzf((Object) 2);
            zzguoVar2.zzh(zzgucVar2.zzi());
            return new zzps(zzf(zzgxz.zzf(zzguoVar2.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((z10 || zze()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzguoVar2.zzh(zzc);
        }
        if (intent != null && !z10 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                zzguoVar2.zzh(zzgxz.zzg(intArrayExtra));
            }
            return new zzps(zzf(zzgxz.zzf(zzguoVar2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new zzps(zzf(zzgxz.zzf(zzguoVar2.zzi()), 10));
    }

    @Nullable
    public static Uri zzc() {
        if (zze()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }
}
