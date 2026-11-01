package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzanw {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(map2);
    }

    @Nullable
    public static zzanq zza(zzer zzerVar, List list) {
        String strZzN = zzerVar.zzN(StandardCharsets.UTF_8);
        if (strZzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzerVar, list);
            }
            String strZzN2 = zzerVar.zzN(StandardCharsets.UTF_8);
            if (strZzN2 != null) {
                Matcher matcher2 = pattern.matcher(strZzN2);
                if (matcher2.matches()) {
                    return zzd(strZzN.trim(), matcher2, zzerVar, list);
                }
            }
        }
        return null;
    }

    public static zzcw zzb(String str) {
        zzanv zzanvVar = new zzanv();
        zze(str, zzanvVar);
        return zzanvVar.zza();
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    public static SpannedString zzc(@Nullable String str, String str2, List list) {
        byte b10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        char c10 = 0;
        int i10 = 0;
        while (i10 < str2.length()) {
            int length = i10 + 1;
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, length);
                int iIndexOf2 = str2.indexOf(32, length);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(length, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                            } else if (strSubstring.equals("amp")) {
                                b10 = 3;
                            } else {
                                b10 = -1;
                            }
                        } else if (strSubstring.equals("lt")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                    } else if (strSubstring.equals("gt")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    if (b10 == 0) {
                        spannableStringBuilder.append('<');
                    } else if (b10 == 1) {
                        spannableStringBuilder.append('>');
                    } else if (b10 == 2) {
                        spannableStringBuilder.append(' ');
                    } else if (b10 != 3) {
                        StringBuilder sb2 = new StringBuilder(strSubstring.length() + 33);
                        sb2.append("ignoring unsupported entity: '&");
                        sb2.append(strSubstring);
                        sb2.append(";'");
                        zzee.zzc("WebvttCueParser", sb2.toString());
                    } else {
                        spannableStringBuilder.append('&');
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) Z7.f27998r);
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
                c10 = 0;
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (length < str2.length()) {
                char cCharAt2 = str2.charAt(length);
                int iIndexOf3 = str2.indexOf(62, length);
                length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i11 = length - 2;
                char c11 = str2.charAt(i11) == '/' ? (char) 1 : c10;
                int i12 = i10 + (cCharAt2 == '/' ? 2 : 1);
                if (c11 == 0) {
                    i11 = length - 1;
                }
                String strSubstring2 = str2.substring(i12, i11);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim = strSubstring2.trim();
                    zzgrc.zza(!strTrim.isEmpty());
                    String str3 = zzfj.zza;
                    String str4 = strTrim.split("[ \\.]", 2)[c10];
                    switch (str4) {
                        case "b":
                        case "c":
                        case "i":
                        case "lang":
                        case "ruby":
                        case "rt":
                        case "u":
                        case "v":
                            if (cCharAt2 == '/') {
                                while (!arrayDeque.isEmpty()) {
                                    zzant zzantVar = (zzant) arrayDeque.pop();
                                    zzf(str, zzantVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new zzans(zzantVar, spannableStringBuilder.length(), null));
                                    }
                                    if (zzantVar.zza.equals(str4)) {
                                        break;
                                    }
                                }
                                break;
                            } else {
                                if (c11 == 0) {
                                    arrayDeque.push(zzant.zza(strSubstring2, spannableStringBuilder.length()));
                                }
                                break;
                            }
                            break;
                    }
                }
            }
            i10 = length;
            c10 = 0;
        }
        while (!arrayDeque.isEmpty()) {
            zzf(str, (zzant) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzf(str, zzant.zzb(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    @Nullable
    private static zzanq zzd(@Nullable String str, Matcher matcher, zzer zzerVar, List list) {
        zzanv zzanvVar = new zzanv();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            zzanvVar.zza = zzany.zza(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            zzanvVar.zzb = zzany.zza(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zze(strGroup3, zzanvVar);
            StringBuilder sb2 = new StringBuilder();
            String strZzN = zzerVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzN)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strZzN.trim());
                strZzN = zzerVar.zzN(StandardCharsets.UTF_8);
            }
            zzanvVar.zzc = zzc(str, sb2.toString(), list);
            return new zzanq(zzanvVar.zza().zzr(), zzanvVar.zza, zzanvVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzee.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:96:0x0168  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zze(String str, zzanv zzanvVar) {
        byte b10;
        byte b11;
        byte b12;
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i10 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i11 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    byte b13 = -1;
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    b13 = 1;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    b13 = 2;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    b13 = 3;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    b13 = 0;
                                }
                                break;
                        }
                        if (b13 == 0) {
                            i11 = 0;
                        } else if (b13 == 1 || b13 == 2) {
                            i11 = 1;
                        } else if (b13 != 3) {
                            zzee.zzc("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i11 = Integer.MIN_VALUE;
                        }
                        zzanvVar.zzg = i11;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzanvVar.zze = zzany.zzb(strGroup2);
                        zzanvVar.zzf = 0;
                    } else {
                        zzanvVar.zze = Integer.parseInt(strGroup2);
                        zzanvVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                            b10 = 2;
                            break;
                        case "middle":
                            b10 = 3;
                            break;
                        case "end":
                            b10 = 4;
                            break;
                        case "left":
                            b10 = 1;
                            break;
                        case "right":
                            b10 = 5;
                            break;
                        case "start":
                            b10 = 0;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 != 0) {
                        if (b10 == 1) {
                            i10 = 4;
                        } else if (b10 == 2 || b10 == 3) {
                            i10 = 2;
                        } else if (b10 == 4) {
                            i10 = 3;
                        } else if (b10 != 5) {
                            zzee.zzc("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i10 = 2;
                        } else {
                            i10 = 5;
                        }
                    }
                    zzanvVar.zzd = i10;
                } else if (C3426d4.i.L.equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2) {
                            case "line-left":
                                b12 = 0;
                                break;
                            case "center":
                                b12 = 2;
                                break;
                            case "line-right":
                                b12 = 4;
                                break;
                            case "middle":
                                b12 = 3;
                                break;
                            case "end":
                                b12 = 5;
                                break;
                            case "start":
                                b12 = 1;
                                break;
                            default:
                                b12 = -1;
                                break;
                        }
                        if (b12 == 0 || b12 == 1) {
                            i10 = 0;
                        } else if (b12 != 2 && b12 != 3) {
                            if (b12 == 4 || b12 == 5) {
                                i10 = 2;
                            } else {
                                zzee.zzc("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i10 = Integer.MIN_VALUE;
                            }
                        }
                        zzanvVar.zzi = i10;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzanvVar.zzh = zzany.zzb(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzanvVar.zzj = zzany.zzb(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            b11 = 0;
                        } else {
                            b11 = -1;
                        }
                    } else if (strGroup2.equals("lr")) {
                        b11 = 1;
                    } else {
                        b11 = -1;
                    }
                    if (b11 != 0) {
                        if (b11 != 1) {
                            zzee.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i10 = Integer.MIN_VALUE;
                        } else {
                            i10 = 2;
                        }
                    }
                    zzanvVar.zzk = i10;
                } else {
                    StringBuilder sb2 = new StringBuilder(strGroup.length() + 21 + strGroup2.length());
                    sb2.append("Unknown cue setting ");
                    sb2.append(strGroup);
                    sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    sb2.append(strGroup2);
                    zzee.zzc("WebvttCueParser", sb2.toString());
                }
            } catch (NumberFormatException unused) {
                zzee.zzc("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    private static void zzf(@Nullable String str, zzant zzantVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        byte b10;
        int i10 = zzantVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzantVar.zza;
        int iHashCode = str2.hashCode();
        int i11 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b10 = 5;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b10 = 3;
                                } else {
                                    b10 = -1;
                                }
                            } else if (str2.equals("c")) {
                                b10 = 4;
                            } else {
                                b10 = -1;
                            }
                        } else if (str2.equals("b")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                } else if (str2.equals(Q6.f27460q)) {
                    b10 = 6;
                } else {
                    b10 = -1;
                }
            } else if (str2.equals("i")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str2.equals("")) {
            b10 = 7;
        } else {
            b10 = -1;
        }
        switch (b10) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 2:
                int iZzg = zzg(list2, str, zzantVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, zzans.zza);
                int i12 = i10;
                int i13 = 0;
                int length2 = 0;
                while (i13 < arrayList.size()) {
                    if ("rt".equals(((zzans) arrayList.get(i13)).zzc().zza)) {
                        zzans zzansVar = (zzans) arrayList.get(i13);
                        int iZzg2 = zzg(list2, str, zzansVar.zzc());
                        if (iZzg2 == i11) {
                            iZzg2 = iZzg != i11 ? iZzg : 1;
                        }
                        int i14 = zzansVar.zzc().zzb - length2;
                        int iZzd = zzansVar.zzd() - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i14, iZzd);
                        spannableStringBuilder.delete(i14, iZzd);
                        spannableStringBuilder.setSpan(new zzdc(charSequenceSubSequence.toString(), iZzg2), i12, i14, 33);
                        length2 += charSequenceSubSequence.length();
                        i12 = i14;
                    }
                    i13++;
                    i11 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 4:
                for (String str3 : zzantVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i10, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i10, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzdf(zzantVar.zzc), i10, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List listZzh = zzh(list2, str, zzantVar);
        for (int i15 = 0; i15 < listZzh.size(); i15++) {
            zzanp zzanpVar = ((zzanu) listZzh.get(i15)).zzb;
            if (zzanpVar != null) {
                if (zzanpVar.zzf() != -1) {
                    zzdd.zza(spannableStringBuilder, new StyleSpan(zzanpVar.zzf()), i10, length, 33);
                }
                if (zzanpVar.zzg()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                }
                if (zzanpVar.zzo()) {
                    zzdd.zza(spannableStringBuilder, new ForegroundColorSpan(zzanpVar.zzm()), i10, length, 33);
                }
                if (zzanpVar.zzr()) {
                    zzdd.zza(spannableStringBuilder, new BackgroundColorSpan(zzanpVar.zzp()), i10, length, 33);
                }
                if (zzanpVar.zzk() != null) {
                    zzdd.zza(spannableStringBuilder, new TypefaceSpan(zzanpVar.zzk()), i10, length, 33);
                }
                int iZzu = zzanpVar.zzu();
                if (iZzu == 1) {
                    zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzanpVar.zzv(), true), i10, length, 33);
                } else if (iZzu == 2) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzanpVar.zzv()), i10, length, 33);
                } else if (iZzu == 3) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzanpVar.zzv() / 100.0f), i10, length, 33);
                }
                if (zzanpVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzdb(), i10, length, 33);
                }
            }
        }
    }

    private static List zzh(List list, @Nullable String str, zzant zzantVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzanp zzanpVar = (zzanp) list.get(i10);
            int iZze = zzanpVar.zze(str, zzantVar.zza, zzantVar.zzd, zzantVar.zzc);
            if (iZze > 0) {
                arrayList.add(new zzanu(iZze, zzanpVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static int zzg(List list, @Nullable String str, zzant zzantVar) {
        List listZzh = zzh(list, str, zzantVar);
        for (int i10 = 0; i10 < listZzh.size(); i10++) {
            zzanp zzanpVar = ((zzanu) listZzh.get(i10)).zzb;
            if (zzanpVar.zzx() != -1) {
                return zzanpVar.zzx();
            }
        }
        return -1;
    }
}
