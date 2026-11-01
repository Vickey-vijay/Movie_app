package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzanb {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgup zze = zzgup.zzj("auto", "none");
    private static final zzgup zzf = zzgup.zzk("dot", "sesame", "circle");
    private static final zzgup zzg = zzgup.zzj("filled", "open");
    private static final zzgup zzh = zzgup.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzanb(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    @Nullable
    public static zzanb zza(@Nullable String str) {
        byte b10;
        int i10;
        if (str == null) {
            return null;
        }
        String strZza = zzgql.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzgup zzgupVarZzp = zzgup.zzp(TextUtils.split(strZza, zzd));
        String str2 = (String) zzgut.zzb(zzgwp.zza(zzh, zzgupVarZzp), "outside");
        int iHashCode = str2.hashCode();
        int i11 = -1;
        int i12 = 0;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
        } else if (str2.equals("outside")) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            i10 = b10 != 1 ? 1 : -2;
        } else {
            i10 = 2;
        }
        zzgwo zzgwoVarZza = zzgwp.zza(zze, zzgupVarZzp);
        if (zzgwoVarZza.isEmpty()) {
            zzgwo zzgwoVarZza2 = zzgwp.zza(zzg, zzgupVarZzp);
            zzgwo zzgwoVarZza3 = zzgwp.zza(zzf, zzgupVarZzp);
            if (!zzgwoVarZza2.isEmpty() || !zzgwoVarZza3.isEmpty()) {
                String str3 = (String) zzgut.zzb(zzgwoVarZza2, "filled");
                int i13 = ((str3.hashCode() == 3417674 && str3.equals("open")) ? (byte) 0 : (byte) -1) != 0 ? 1 : 2;
                String str4 = (String) zzgut.zzb(zzgwoVarZza3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i11 = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i11 = 1;
                }
                if (i11 == 0) {
                    i11 = 2;
                } else if (i11 != 1) {
                    i12 = i13;
                    i11 = 1;
                } else {
                    i11 = 3;
                }
                i12 = i13;
            }
        } else {
            String str5 = (String) zzgwoVarZza.iterator().next();
            if (((str5.hashCode() == 3387192 && str5.equals("none")) ? (byte) 0 : (byte) -1) == 0) {
                i11 = 0;
            }
        }
        return new zzanb(i11, i12, i10);
    }
}
