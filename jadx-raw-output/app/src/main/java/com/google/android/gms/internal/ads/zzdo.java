package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"InlinedApi"})
public final class zzdo {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static String zza(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String zzc(byte[] bArr) {
        int length = bArr.length;
        zzgrc.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b10 = bArr[0];
        zzgrc.zzd(b10 == 1, "Invalid APV CSD version: %s", b10);
        Object[] objArr = {Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7])};
        String str = zzfj.zza;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0196  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    @Nullable
    public static Pair zze(String str, String[] strArr, @Nullable zzi zziVar) {
        int i10;
        Integer num;
        if (strArr.length < 4) {
            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i10 = 1;
        } else if ("2".equals(strGroup)) {
            i10 = (zziVar == null || zziVar.zzd != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                zzee.zzc("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup)));
                return null;
            }
            i10 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "L30":
                    num = 1;
                    break;
                case "L60":
                    num = 4;
                    break;
                case "L63":
                    num = 16;
                    break;
                case "L90":
                    num = 64;
                    break;
                case "L93":
                    num = 256;
                    break;
                case "L120":
                    num = 1024;
                    break;
                case "L123":
                    num = 4096;
                    break;
                case "L150":
                    num = 16384;
                    break;
                case "L153":
                    num = 65536;
                    break;
                case "L156":
                    num = 262144;
                    break;
                case "L180":
                    num = 1048576;
                    break;
                case "L183":
                    num = 4194304;
                    break;
                case "L186":
                    num = 16777216;
                    break;
                case "H30":
                    num = 2;
                    break;
                case "H60":
                    num = 8;
                    break;
                case "H63":
                    num = 32;
                    break;
                case "H90":
                    num = 128;
                    break;
                case "H93":
                    num = 512;
                    break;
                case "H120":
                    num = 2048;
                    break;
                case "H123":
                    num = 8192;
                    break;
                case "H150":
                    num = 32768;
                    break;
                case "H153":
                    num = 131072;
                    break;
                case "H156":
                    num = 524288;
                    break;
                case "H180":
                    num = 2097152;
                    break;
                case "H183":
                    num = 8388608;
                    break;
                case "H186":
                    num = 33554432;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = null;
        }
        if (num != null) {
            return new Pair(Integer.valueOf(i10), num);
        }
        zzee.zzc("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
        return null;
    }

    public static String zzb(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = new Object[5];
        objArr[0] = zzc[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(true != z10 ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i13);
        String str = zzfj.zza;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i14 = 6;
        while (i14 > 0) {
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i16])));
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX WARN: Code duplicated, block: B:182:0x032b  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v99 int, still in use, count: 1, list:
  (r1v99 int) from 0x005f: IF  (r1v99 int) != (1567 int)  -> B:18:0x0061 A[HIDDEN] (LINE:97)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v99 int, still in use, count: 1, list:
  (r1v99 int) from 0x005f: IF  (r1v99 int) != (1567 int)  -> B:18:0x0061 A[HIDDEN] (LINE:97)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static Pair zzd(zzv zzvVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Integer num;
        Integer num2;
        String str = zzvVar.zzk;
        if (str != null) {
            String[] strArrSplit = str.split("\\.");
            int i19 = 16;
            int i20 = 3;
            int i21 = 2;
            if (!"video/dolby-vision".equals(zzvVar.zzo)) {
                int i22 = 0;
                byte b10 = -1;
                switch (strArrSplit[0]) {
                    case "s263":
                        String str2 = zzvVar.zzk;
                        Pair pair = new Pair(1, 1);
                        if (strArrSplit.length < 3) {
                            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str2)));
                            return pair;
                        }
                        try {
                            return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                        } catch (NumberFormatException unused) {
                            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str2)));
                            return pair;
                        }
                    case "avc1":
                    case "avc2":
                        String str3 = zzvVar.zzk;
                        int length = strArrSplit.length;
                        if (length < 2) {
                            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str3)));
                            break;
                        } else {
                            try {
                                if (strArrSplit[1].length() == 6) {
                                    i10 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                                    i11 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                                } else if (length < 3) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 37);
                                    sb2.append("Ignoring malformed AVC codec string: ");
                                    sb2.append(str3);
                                    zzee.zzc("CodecSpecificDataUtil", sb2.toString());
                                } else {
                                    i10 = Integer.parseInt(strArrSplit[1]);
                                    i11 = Integer.parseInt(strArrSplit[2]);
                                }
                                if (i10 == 66) {
                                    i21 = 1;
                                } else if (i10 != 77) {
                                    if (i10 == 88) {
                                        i21 = 4;
                                    } else if (i10 == 100) {
                                        i21 = 8;
                                    } else if (i10 == 110) {
                                        i21 = 16;
                                    } else if (i10 != 122) {
                                        i21 = i10 != 244 ? -1 : 64;
                                    } else {
                                        i21 = 32;
                                    }
                                }
                                if (i21 == -1) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 21);
                                    sb3.append("Unknown AVC profile: ");
                                    sb3.append(i10);
                                    zzee.zzc("CodecSpecificDataUtil", sb3.toString());
                                } else {
                                    switch (i11) {
                                        case 10:
                                            i12 = 1;
                                            break;
                                        case 11:
                                            i12 = 4;
                                            break;
                                        case 12:
                                            i12 = 8;
                                            break;
                                        case 13:
                                            i12 = 16;
                                            break;
                                        default:
                                            switch (i11) {
                                                case 20:
                                                    i12 = 32;
                                                    break;
                                                case 21:
                                                    i12 = 64;
                                                    break;
                                                case 22:
                                                    i12 = 128;
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 30:
                                                            i12 = 256;
                                                            break;
                                                        case 31:
                                                            i12 = 512;
                                                            break;
                                                        case 32:
                                                            i12 = 1024;
                                                            break;
                                                        default:
                                                            switch (i11) {
                                                                case 40:
                                                                    i12 = 2048;
                                                                    break;
                                                                case 41:
                                                                    i12 = 4096;
                                                                    break;
                                                                case 42:
                                                                    i12 = 8192;
                                                                    break;
                                                                default:
                                                                    switch (i11) {
                                                                        case 50:
                                                                            i12 = 16384;
                                                                            break;
                                                                        case 51:
                                                                            i12 = 32768;
                                                                            break;
                                                                        case 52:
                                                                            i12 = 65536;
                                                                            break;
                                                                        default:
                                                                            i12 = -1;
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    if (i12 != -1) {
                                        return new Pair(Integer.valueOf(i21), Integer.valueOf(i12));
                                    }
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 19);
                                    sb4.append("Unknown AVC level: ");
                                    sb4.append(i11);
                                    zzee.zzc("CodecSpecificDataUtil", sb4.toString());
                                }
                            } catch (NumberFormatException unused2) {
                                zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str3)));
                            }
                            break;
                        }
                        break;
                    case "vp09":
                        String str4 = zzvVar.zzk;
                        if (strArrSplit.length < 3) {
                            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str4)));
                            break;
                        } else {
                            try {
                                int i23 = Integer.parseInt(strArrSplit[1]);
                                int i24 = Integer.parseInt(strArrSplit[2]);
                                if (i23 == 0) {
                                    i13 = 1;
                                } else if (i23 == 1) {
                                    i13 = 2;
                                } else if (i23 != 2) {
                                    i13 = i23 != 3 ? -1 : 8;
                                } else {
                                    i13 = 4;
                                }
                                if (i13 == -1) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(i23).length() + 21);
                                    sb5.append("Unknown VP9 profile: ");
                                    sb5.append(i23);
                                    zzee.zzc("CodecSpecificDataUtil", sb5.toString());
                                } else {
                                    if (i24 == 10) {
                                        i21 = 1;
                                    } else if (i24 != 11) {
                                        if (i24 == 20) {
                                            i21 = 4;
                                        } else if (i24 == 21) {
                                            i21 = 8;
                                        } else if (i24 == 30) {
                                            i21 = 16;
                                        } else if (i24 == 31) {
                                            i21 = 32;
                                        } else if (i24 == 40) {
                                            i21 = 64;
                                        } else if (i24 == 41) {
                                            i21 = 128;
                                        } else if (i24 == 50) {
                                            i21 = 256;
                                        } else if (i24 != 51) {
                                            switch (i24) {
                                                case 60:
                                                    i21 = 2048;
                                                    break;
                                                case 61:
                                                    i21 = 4096;
                                                    break;
                                                case 62:
                                                    i21 = 8192;
                                                    break;
                                                default:
                                                    i21 = -1;
                                                    break;
                                            }
                                        } else {
                                            i21 = 512;
                                        }
                                    }
                                    if (i21 != -1) {
                                        return new Pair(Integer.valueOf(i13), Integer.valueOf(i21));
                                    }
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(i24).length() + 19);
                                    sb6.append("Unknown VP9 level: ");
                                    sb6.append(i24);
                                    zzee.zzc("CodecSpecificDataUtil", sb6.toString());
                                }
                            } catch (NumberFormatException unused3) {
                                zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str4)));
                            }
                            break;
                        }
                        break;
                    case "hev1":
                    case "hvc1":
                        return zze(zzvVar.zzk, strArrSplit, zzvVar.zzE);
                    case "av01":
                        String str5 = zzvVar.zzk;
                        zzi zziVar = zzvVar.zzE;
                        if (strArrSplit.length < 4) {
                            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str5)));
                            break;
                        } else {
                            try {
                                int i25 = Integer.parseInt(strArrSplit[1]);
                                int i26 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                                int i27 = Integer.parseInt(strArrSplit[3]);
                                if (i25 != 0) {
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(i25).length() + 21);
                                    sb7.append("Unknown AV1 profile: ");
                                    sb7.append(i25);
                                    zzee.zzc("CodecSpecificDataUtil", sb7.toString());
                                } else {
                                    if (i27 == 8) {
                                        i14 = 1;
                                    } else if (i27 != 10) {
                                        StringBuilder sb8 = new StringBuilder(String.valueOf(i27).length() + 23);
                                        sb8.append("Unknown AV1 bit depth: ");
                                        sb8.append(i27);
                                        zzee.zzc("CodecSpecificDataUtil", sb8.toString());
                                    } else {
                                        i14 = (zziVar == null || !(zziVar.zze != null || (i15 = zziVar.zzd) == 7 || i15 == 6)) ? 2 : 4096;
                                    }
                                    switch (i26) {
                                        case 0:
                                            i21 = 1;
                                            break;
                                        case 1:
                                            break;
                                        case 2:
                                            i21 = 4;
                                            break;
                                        case 3:
                                            i21 = 8;
                                            break;
                                        case 4:
                                            i21 = 16;
                                            break;
                                        case 5:
                                            i21 = 32;
                                            break;
                                        case 6:
                                            i21 = 64;
                                            break;
                                        case 7:
                                            i21 = 128;
                                            break;
                                        case 8:
                                            i21 = 256;
                                            break;
                                        case 9:
                                            i21 = 512;
                                            break;
                                        case 10:
                                            i21 = 1024;
                                            break;
                                        case 11:
                                            i21 = 2048;
                                            break;
                                        case 12:
                                            i21 = 4096;
                                            break;
                                        case 13:
                                            i21 = 8192;
                                            break;
                                        case 14:
                                            i21 = 16384;
                                            break;
                                        case 15:
                                            i21 = 32768;
                                            break;
                                        case 16:
                                            i21 = 65536;
                                            break;
                                        case 17:
                                            i21 = 131072;
                                            break;
                                        case 18:
                                            i21 = 262144;
                                            break;
                                        case 19:
                                            i21 = 524288;
                                            break;
                                        case 20:
                                            i21 = 1048576;
                                            break;
                                        case 21:
                                            i21 = 2097152;
                                            break;
                                        case 22:
                                            i21 = 4194304;
                                            break;
                                        case 23:
                                            i21 = 8388608;
                                            break;
                                        default:
                                            i21 = -1;
                                            break;
                                    }
                                    if (i21 != -1) {
                                        return new Pair(Integer.valueOf(i14), Integer.valueOf(i21));
                                    }
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(i26).length() + 19);
                                    sb9.append("Unknown AV1 level: ");
                                    sb9.append(i26);
                                    zzee.zzc("CodecSpecificDataUtil", sb9.toString());
                                }
                            } catch (NumberFormatException unused4) {
                                zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str5)));
                            }
                            break;
                        }
                        break;
                    case "apv1":
                        String str6 = zzvVar.zzk;
                        if (strArrSplit.length < 4) {
                            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str6)));
                            break;
                        } else {
                            try {
                                int i28 = Integer.parseInt(strArrSplit[1].substring(4));
                                int i29 = Integer.parseInt(strArrSplit[2].substring(4));
                                int i30 = Integer.parseInt(strArrSplit[3].substring(4));
                                if (i28 != 33) {
                                    if (i28 != 44) {
                                        StringBuilder sb10 = new StringBuilder(String.valueOf(i28).length() + 30);
                                        sb10.append("Ignoring invalid APV profile: ");
                                        sb10.append(i28);
                                        zzee.zzc("CodecSpecificDataUtil", sb10.toString());
                                    } else {
                                        i16 = 8192;
                                    }
                                    break;
                                } else {
                                    i16 = 1;
                                }
                                int i31 = i29 / 30;
                                int i32 = i31 + i31;
                                if (i29 % 30 == 0) {
                                    i32--;
                                }
                                return new Pair(Integer.valueOf(i16), Integer.valueOf((1 << i30) | (256 << (i32 - 1))));
                            } catch (NumberFormatException e10) {
                                zzee.zzd("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str6)), e10);
                            }
                            break;
                        }
                        break;
                    case "mp4a":
                        String str7 = zzvVar.zzk;
                        if (strArrSplit.length != 3) {
                            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str7)));
                            break;
                        } else {
                            try {
                                if ("audio/mp4a-latm".equals(zzas.zze(Integer.parseInt(strArrSplit[1], 16)))) {
                                    int i33 = Integer.parseInt(strArrSplit[2]);
                                    if (i33 == 17) {
                                        i20 = 17;
                                    } else if (i33 == 20) {
                                        i20 = 20;
                                    } else if (i33 == 23) {
                                        i20 = 23;
                                    } else if (i33 == 29) {
                                        i20 = 29;
                                    } else if (i33 == 39) {
                                        i20 = 39;
                                    } else if (i33 != 42) {
                                        switch (i33) {
                                            case 1:
                                                i20 = 1;
                                                break;
                                            case 2:
                                                i20 = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i20 = 4;
                                                break;
                                            case 5:
                                                i20 = 5;
                                                break;
                                            case 6:
                                                i20 = 6;
                                                break;
                                            default:
                                                i20 = -1;
                                                break;
                                        }
                                    } else {
                                        i20 = 42;
                                    }
                                    if (i20 != -1) {
                                        return new Pair(Integer.valueOf(i20), 0);
                                    }
                                }
                            } catch (NumberFormatException unused5) {
                                zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str7)));
                            }
                            break;
                        }
                        break;
                    case "ac-4":
                        String str8 = zzvVar.zzk;
                        if (strArrSplit.length != 4) {
                            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str8)));
                            break;
                        } else {
                            try {
                                int i34 = Integer.parseInt(strArrSplit[1]);
                                int i35 = Integer.parseInt(strArrSplit[2]);
                                int i36 = Integer.parseInt(strArrSplit[3]);
                                if (i34 != 0) {
                                    if (i34 != 1) {
                                        if (i34 != 2) {
                                            i22 = i35;
                                            i17 = -1;
                                        } else if (i35 == 1) {
                                            i17 = 1026;
                                            i22 = 1;
                                        } else if (i35 == 2) {
                                            i17 = 1028;
                                            i22 = 2;
                                        } else {
                                            i22 = i35;
                                            i17 = -1;
                                        }
                                    } else if (i35 == 0) {
                                        i17 = 513;
                                    } else if (i35 == 1) {
                                        i17 = EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE;
                                        i22 = 1;
                                    } else {
                                        i22 = i35;
                                        i17 = -1;
                                    }
                                } else if (i35 == 0) {
                                    i17 = 257;
                                } else {
                                    i22 = i35;
                                    i17 = -1;
                                }
                                if (i17 == -1) {
                                    StringBuilder sb11 = new StringBuilder(String.valueOf(i34).length() + 23 + String.valueOf(i22).length());
                                    sb11.append("Unknown AC-4 profile: ");
                                    sb11.append(i34);
                                    sb11.append(".");
                                    sb11.append(i22);
                                    zzee.zzc("CodecSpecificDataUtil", sb11.toString());
                                } else {
                                    if (i36 == 0) {
                                        i19 = 1;
                                    } else if (i36 == 1) {
                                        i19 = 2;
                                    } else if (i36 == 2) {
                                        i19 = 4;
                                    } else if (i36 == 3) {
                                        i19 = 8;
                                    } else if (i36 != 4) {
                                        i19 = -1;
                                    }
                                    if (i19 != -1) {
                                        return new Pair(Integer.valueOf(i17), Integer.valueOf(i19));
                                    }
                                    StringBuilder sb12 = new StringBuilder(String.valueOf(i36).length() + 20);
                                    sb12.append("Unknown AC-4 level: ");
                                    sb12.append(i36);
                                    zzee.zzc("CodecSpecificDataUtil", sb12.toString());
                                }
                            } catch (NumberFormatException unused6) {
                                zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str8)));
                            }
                            break;
                        }
                        break;
                    case "iamf":
                        if (strArrSplit.length < 4) {
                            zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
                            break;
                        } else {
                            try {
                                int i37 = 1 << (Integer.parseInt(strArrSplit[1]) + 16);
                                String str9 = strArrSplit[3];
                                switch (str9.hashCode()) {
                                    case 2464863:
                                        if (str9.equals("Opus")) {
                                            b10 = 0;
                                        }
                                        break;
                                    case 3114792:
                                        if (str9.equals("fLaC")) {
                                            b10 = 2;
                                        }
                                        break;
                                    case 3238865:
                                        if (str9.equals("ipcm")) {
                                            b10 = 3;
                                        }
                                        break;
                                    case 3356560:
                                        if (str9.equals("mp4a")) {
                                            b10 = 1;
                                        }
                                        break;
                                }
                                if (b10 != 0) {
                                    if (b10 == 1) {
                                        i18 = 2;
                                    } else if (b10 == 2) {
                                        i18 = 4;
                                    } else if (b10 != 3) {
                                        zzee.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(str9));
                                    } else {
                                        i18 = 8;
                                    }
                                    break;
                                } else {
                                    i18 = 1;
                                }
                                return new Pair(Integer.valueOf(i37 | 16777216 | i18), 0);
                            } catch (NumberFormatException e11) {
                                zzee.zzd("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(strArrSplit[1])), e11);
                            }
                            break;
                        }
                        break;
                }
            } else if (strArrSplit.length < 3) {
                zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
            } else {
                Matcher matcher = zzd.matcher(strArrSplit[1]);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (strGroup != null) {
                        if (strGroup.hashCode() != 1567) {
                            switch (strGroup) {
                                case "00":
                                    num = 1;
                                    break;
                                case "01":
                                    num = 2;
                                    break;
                                case "02":
                                    num = 4;
                                    break;
                                case "03":
                                    num = 8;
                                    break;
                                case "04":
                                    num = 16;
                                    break;
                                case "05":
                                    num = 32;
                                    break;
                                case "06":
                                    num = 64;
                                    break;
                                case "07":
                                    num = 128;
                                    break;
                                case "08":
                                    num = 256;
                                    break;
                                case "09":
                                    num = 512;
                                    break;
                                default:
                                    num = null;
                                    break;
                            }
                        } else if (strGroup.equals("10")) {
                            num = 1024;
                        } else {
                            num = null;
                        }
                    } else {
                        num = null;
                    }
                    if (num == null) {
                        zzee.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(strGroup)));
                    } else {
                        String str10 = strArrSplit[2];
                        if (str10 != null) {
                            str10.hashCode();
                            switch (str10) {
                                case "01":
                                    num2 = 1;
                                    break;
                                case "02":
                                    num2 = 2;
                                    break;
                                case "03":
                                    num2 = 4;
                                    break;
                                case "04":
                                    num2 = 8;
                                    break;
                                case "05":
                                    num2 = 16;
                                    break;
                                case "06":
                                    num2 = 32;
                                    break;
                                case "07":
                                    num2 = 64;
                                    break;
                                case "08":
                                    num2 = 128;
                                    break;
                                case "09":
                                    num2 = 256;
                                    break;
                                default:
                                    switch (str10) {
                                        case 1567:
                                            if (!str10.equals("10")) {
                                                num2 = null;
                                            } else {
                                                num2 = 512;
                                            }
                                            break;
                                        case 1568:
                                            if (!str10.equals("11")) {
                                                num2 = null;
                                            } else {
                                                num2 = 1024;
                                            }
                                            break;
                                        case 1569:
                                            if (!str10.equals("12")) {
                                                num2 = null;
                                            } else {
                                                num2 = 2048;
                                            }
                                            break;
                                        case 1570:
                                            if (!str10.equals("13")) {
                                                num2 = null;
                                            } else {
                                                num2 = 4096;
                                            }
                                            break;
                                        default:
                                            num2 = null;
                                            break;
                                    }
                            }
                        } else {
                            num2 = null;
                        }
                        if (num2 != null) {
                            return new Pair(num, num2);
                        }
                        zzee.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str10)));
                    }
                } else {
                    zzee.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                }
            }
        }
        return null;
    }

    public static byte[] zzf(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }
}
