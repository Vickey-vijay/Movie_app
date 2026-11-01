package yads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.ironsource.Z7;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qo3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f81911a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f81912b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f81913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f81914d;

    /* JADX WARN: Code duplicated, block: B:104:0x022f  */
    public static void a(SpannableStringBuilder spannableStringBuilder, no3 no3Var, String str, List list, List list2) {
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        List list3 = list2;
        int i13 = no3Var.f80719b;
        int length = spannableStringBuilder.length();
        String str2 = no3Var.f80718a;
        str2.getClass();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i13, length, 33);
                break;
            case "c":
                for (String str3 : no3Var.f80721d) {
                    Map map = f81913c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i13, length, 33);
                    } else {
                        Map map2 = f81914d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i13, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i13, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
                break;
            case "ruby":
                ArrayList arrayList2 = new ArrayList();
                for (int i14 = 0; i14 < list2.size(); i14++) {
                    ko3 ko3Var = (ko3) list3.get(i14);
                    int iA = ko3Var.a(str, no3Var.f80718a, no3Var.f80721d, no3Var.f80720c);
                    if (iA > 0) {
                        arrayList2.add(new oo3(iA, ko3Var));
                    }
                }
                Collections.sort(arrayList2);
                for (int i15 = 0; i15 < arrayList2.size() && ((oo3) arrayList2.get(i15)).f81117c.f79516p == -1; i15++) {
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                arrayList3.addAll(list);
                Collections.sort(arrayList3, mo3.f80309c);
                int i16 = no3Var.f80719b;
                int i17 = 0;
                int length2 = 0;
                while (i17 < arrayList3.size()) {
                    if ("rt".equals(((mo3) arrayList3.get(i17)).f80310a.f80718a)) {
                        mo3 mo3Var = (mo3) arrayList3.get(i17);
                        no3 no3Var2 = mo3Var.f80310a;
                        ArrayList arrayList4 = new ArrayList();
                        int i18 = 0;
                        while (i18 < list2.size()) {
                            ko3 ko3Var2 = (ko3) list3.get(i18);
                            ArrayList arrayList5 = arrayList3;
                            int iA2 = ko3Var2.a(str, no3Var2.f80718a, no3Var2.f80721d, no3Var2.f80720c);
                            if (iA2 > 0) {
                                arrayList4.add(new oo3(iA2, ko3Var2));
                            }
                            i18++;
                            list3 = list2;
                            arrayList3 = arrayList5;
                        }
                        arrayList = arrayList3;
                        Collections.sort(arrayList4);
                        for (int i19 = 0; i19 < arrayList4.size() && ((oo3) arrayList4.get(i19)).f81117c.f79516p == -1; i19++) {
                        }
                        int i20 = mo3Var.f80310a.f80719b - length2;
                        int i21 = mo3Var.f80311b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i20, i21);
                        spannableStringBuilder.delete(i20, i21);
                        charSequenceSubSequence.toString();
                        spannableStringBuilder.setSpan(new zr2(), i16, i20, 33);
                        length2 += charSequenceSubSequence.length();
                        i16 = i20;
                    } else {
                        arrayList = arrayList3;
                    }
                    i17++;
                    list3 = list2;
                    arrayList3 = arrayList;
                }
                break;
            default:
                return;
        }
        ArrayList arrayList6 = new ArrayList();
        for (int i22 = 0; i22 < list2.size(); i22++) {
            ko3 ko3Var3 = (ko3) list2.get(i22);
            int iA3 = ko3Var3.a(str, no3Var.f80718a, no3Var.f80721d, no3Var.f80720c);
            if (iA3 > 0) {
                arrayList6.add(new oo3(iA3, ko3Var3));
            }
        }
        Collections.sort(arrayList6);
        for (int i23 = 0; i23 < arrayList6.size(); i23++) {
            ko3 ko3Var4 = ((oo3) arrayList6.get(i23)).f81117c;
            if (ko3Var4 != null) {
                int i24 = ko3Var4.f79512l;
                if (i24 == -1 && ko3Var4.f79513m == -1) {
                    i10 = 1;
                } else if (((i24 == 1 ? (char) 1 : (char) 0) | (ko3Var4.f79513m == 1 ? (char) 2 : (char) 0)) != -1) {
                    int i25 = ko3Var4.f79512l;
                    if (i25 == -1 && ko3Var4.f79513m == -1) {
                        i11 = -1;
                        i10 = 1;
                    } else {
                        i10 = 1;
                        i11 = (i25 == 1 ? 1 : 0) | (ko3Var4.f79513m == 1 ? 2 : 0);
                    }
                    e23.a(spannableStringBuilder, new StyleSpan(i11), i13, length);
                } else {
                    i10 = 1;
                }
                if (ko3Var4.f79510j == i10) {
                    i12 = 33;
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i13, length, 33);
                } else {
                    i12 = 33;
                }
                if (ko3Var4.f79511k == i10) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, i12);
                }
                if (ko3Var4.f79507g) {
                    if (!ko3Var4.f79507g) {
                        throw new IllegalStateException("Font color not defined");
                    }
                    e23.a(spannableStringBuilder, new ForegroundColorSpan(ko3Var4.f79506f), i13, length);
                }
                if (ko3Var4.f79509i) {
                    if (!ko3Var4.f79509i) {
                        throw new IllegalStateException("Background color not defined.");
                    }
                    e23.a(spannableStringBuilder, new BackgroundColorSpan(ko3Var4.f79508h), i13, length);
                }
                if (ko3Var4.f79505e != null) {
                    e23.a(spannableStringBuilder, new TypefaceSpan(ko3Var4.f79505e), i13, length);
                }
                int i26 = ko3Var4.f79514n;
                if (i26 == 1) {
                    e23.a(spannableStringBuilder, new AbsoluteSizeSpan((int) ko3Var4.f79515o, true), i13, length);
                } else if (i26 == 2) {
                    e23.a(spannableStringBuilder, new RelativeSizeSpan(ko3Var4.f79515o), i13, length);
                } else if (i26 == 3) {
                    e23.a(spannableStringBuilder, new RelativeSizeSpan(ko3Var4.f79515o / 100.0f), i13, length);
                }
                if (ko3Var4.f79517q) {
                    spannableStringBuilder.setSpan(new c11(), i13, length, 33);
                }
            }
        }
    }

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
        f81913c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f81914d = Collections.unmodifiableMap(map2);
    }

    public static void b(String str, po3 po3Var) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            int i10 = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    ih1.d("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            po3Var.f81511g = i10;
            str = str.substring(0, iIndexOf);
        }
        if (!str.endsWith("%")) {
            po3Var.f81509e = Integer.parseInt(str);
            po3Var.f81510f = 1;
            return;
        }
        int i11 = so3.f82715a;
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        po3Var.f81509e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        po3Var.f81510f = 0;
    }

    public static lo3 a(String str, Matcher matcher, jb2 jb2Var, ArrayList arrayList) {
        po3 po3Var = new po3();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            po3Var.f81505a = so3.a(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            po3Var.f81506b = so3.a(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            a(strGroup3, po3Var);
            StringBuilder sb2 = new StringBuilder();
            String strC = jb2Var.c();
            while (!TextUtils.isEmpty(strC)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strC.trim());
                strC = jb2Var.c();
            }
            po3Var.f81507c = a(str, sb2.toString(), arrayList);
            return new lo3(po3Var.a().a(), po3Var.f81505a, po3Var.f81506b);
        } catch (NumberFormatException unused) {
            ih1.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SpannedString a(String str, String str2, List list) {
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            String strTrim = "";
            if (i12 < str2.length()) {
                char cCharAt = str2.charAt(i12);
                if (cCharAt == '&') {
                    i12++;
                    int iIndexOf = str2.indexOf(59, i12);
                    int iIndexOf2 = str2.indexOf(32, i12);
                    if (iIndexOf == -1) {
                        iIndexOf = iIndexOf2;
                    } else if (iIndexOf2 != -1) {
                        iIndexOf = Math.min(iIndexOf, iIndexOf2);
                    }
                    if (iIndexOf != -1) {
                        String strSubstring = str2.substring(i12, iIndexOf);
                        strSubstring.getClass();
                        switch (strSubstring) {
                            case "gt":
                                spannableStringBuilder.append('>');
                                break;
                            case "lt":
                                spannableStringBuilder.append('<');
                                break;
                            case "amp":
                                spannableStringBuilder.append('&');
                                break;
                            case "nbsp":
                                spannableStringBuilder.append(' ');
                                break;
                            default:
                                ih1.d("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                                break;
                        }
                        if (iIndexOf == iIndexOf2) {
                            spannableStringBuilder.append((CharSequence) Z7.f27998r);
                        }
                        i12 = iIndexOf + 1;
                    } else {
                        spannableStringBuilder.append(cCharAt);
                    }
                    i11 = 0;
                } else if (cCharAt != '<') {
                    spannableStringBuilder.append(cCharAt);
                    i12++;
                } else {
                    int length = i12 + 1;
                    if (length < str2.length()) {
                        int i13 = str2.charAt(length) == '/' ? 1 : i11;
                        int iIndexOf3 = str2.indexOf(62, length);
                        length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                        int i14 = length - 2;
                        int i15 = str2.charAt(i14) == '/' ? 1 : i11;
                        int i16 = i12 + (i13 != 0 ? 2 : 1);
                        if (i15 == 0) {
                            i14 = length - 1;
                        }
                        String strSubstring2 = str2.substring(i16, i14);
                        if (!strSubstring2.trim().isEmpty()) {
                            String strTrim2 = strSubstring2.trim();
                            if (!strTrim2.isEmpty()) {
                                int i17 = ib3.f78556a;
                                String str3 = strTrim2.split("[ \\.]", 2)[i11];
                                str3.getClass();
                                switch (str3.hashCode()) {
                                    case 98:
                                        if (str3.equals("b")) {
                                            i10 = i11;
                                        } else {
                                            i10 = -1;
                                        }
                                        break;
                                    case 99:
                                        if (str3.equals("c")) {
                                            i10 = 1;
                                        } else {
                                            i10 = -1;
                                        }
                                        break;
                                    case 105:
                                        if (str3.equals("i")) {
                                            i10 = 2;
                                        } else {
                                            i10 = -1;
                                        }
                                        break;
                                    case 117:
                                        if (str3.equals("u")) {
                                            i10 = 3;
                                        } else {
                                            i10 = -1;
                                        }
                                        break;
                                    case 118:
                                        if (str3.equals("v")) {
                                            i10 = 4;
                                        } else {
                                            i10 = -1;
                                        }
                                        break;
                                    case 3650:
                                        if (str3.equals("rt")) {
                                            i10 = 5;
                                        } else {
                                            i10 = -1;
                                        }
                                        break;
                                    case 3314158:
                                        if (str3.equals(Q6.f27460q)) {
                                            i10 = 6;
                                        } else {
                                            i10 = -1;
                                        }
                                        break;
                                    case 3511770:
                                        if (str3.equals("ruby")) {
                                            i10 = 7;
                                        } else {
                                            i10 = -1;
                                        }
                                        break;
                                    default:
                                        i10 = -1;
                                        break;
                                }
                                switch (i10) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        if (i13 == 0) {
                                            if (i15 == 0) {
                                                int length2 = spannableStringBuilder.length();
                                                String strTrim3 = strSubstring2.trim();
                                                if (!strTrim3.isEmpty()) {
                                                    int iIndexOf4 = strTrim3.indexOf(Z7.f27998r);
                                                    if (iIndexOf4 != -1) {
                                                        strTrim = strTrim3.substring(iIndexOf4).trim();
                                                        strTrim3 = strTrim3.substring(i11, iIndexOf4);
                                                    }
                                                    String[] strArrSplit = strTrim3.split("\\.", -1);
                                                    String str4 = strArrSplit[i11];
                                                    HashSet hashSet = new HashSet();
                                                    for (int i18 = 1; i18 < strArrSplit.length; i18++) {
                                                        hashSet.add(strArrSplit[i18]);
                                                    }
                                                    arrayDeque.push(new no3(str4, length2, strTrim, hashSet));
                                                } else {
                                                    throw new IllegalArgumentException();
                                                }
                                            }
                                            break;
                                        } else {
                                            while (!arrayDeque.isEmpty()) {
                                                no3 no3Var = (no3) arrayDeque.pop();
                                                a(spannableStringBuilder, no3Var, str, arrayList, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new mo3(no3Var, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (no3Var.f80718a.equals(str3)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    default:
                                        i12 = length;
                                        break;
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                    i12 = length;
                }
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(spannableStringBuilder, (no3) arrayDeque.pop(), str, arrayList, list);
                }
                a(spannableStringBuilder, new no3("", 0, "", Collections.emptySet()), str, Collections.emptyList(), list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, po3 po3Var) {
        int i10;
        Matcher matcher = f81912b.matcher(str);
        while (matcher.find()) {
            int i11 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    b(strGroup2, po3Var);
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            i11 = 2;
                            break;
                        case "end":
                            i11 = 3;
                            break;
                        case "left":
                            i11 = 4;
                            break;
                        case "right":
                            i11 = 5;
                            break;
                        case "start":
                            break;
                        default:
                            ih1.d("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i11 = 2;
                            break;
                    }
                    po3Var.f81508d = i11;
                } else if (C3426d4.i.L.equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        strSubstring.getClass();
                        switch (strSubstring.hashCode()) {
                            case -1842484672:
                                if (strSubstring.equals("line-left")) {
                                }
                                break;
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                }
                                break;
                            case -1276788989:
                                if (strSubstring.equals("line-right")) {
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                }
                                break;
                        }
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Switch insn not found in header
                            	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                            	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            */
                        /*
                            Method dump skipped, instruction units count: 532
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: yads.qo3.a(java.lang.String, yads.po3):void");
                    }
                }
