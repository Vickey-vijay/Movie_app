package yads;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class ro3 extends fz2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jb2 f82368m = new jb2();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jo3 f82369n = new jo3();

    /* JADX WARN: Code duplicated, block: B:125:0x0241  */
    /* JADX WARN: Code duplicated, block: B:127:0x024c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0255  */
    /* JADX WARN: Code duplicated, block: B:130:0x025e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0266  */
    /* JADX WARN: Code duplicated, block: B:134:0x026e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0271  */
    /* JADX WARN: Code duplicated, block: B:137:0x0279  */
    /* JADX WARN: Code duplicated, block: B:138:0x0280  */
    /* JADX WARN: Code duplicated, block: B:140:0x0288  */
    /* JADX WARN: Code duplicated, block: B:146:0x029b  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:155:0x02be  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:161:0x02db  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:170:0x0308  */
    /* JADX WARN: Code duplicated, block: B:171:0x0321  */
    /* JADX WARN: Code duplicated, block: B:174:0x0332  */
    /* JADX WARN: Code duplicated, block: B:177:0x033b  */
    /* JADX WARN: Code duplicated, block: B:178:0x033d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0346  */
    /* JADX WARN: Code duplicated, block: B:182:0x0348  */
    /* JADX WARN: Code duplicated, block: B:185:0x0351  */
    /* JADX WARN: Code duplicated, block: B:189:0x035b  */
    /* JADX WARN: Code duplicated, block: B:190:0x0360  */
    /* JADX WARN: Code duplicated, block: B:191:0x0365  */
    /* JADX WARN: Code duplicated, block: B:193:0x0378  */
    /* JADX WARN: Code duplicated, block: B:194:0x037b  */
    /* JADX WARN: Code duplicated, block: B:219:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:234:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:170:0x0308, please report this as an issue */
    @Override // yads.fz2
    public final r43 a(byte[] bArr, int i10, boolean z10) throws t43 {
        lo3 lo3Var;
        lo3 lo3VarA;
        String strSubstring;
        int i11;
        String string;
        int i12;
        Matcher matcher;
        String strGroup;
        byte b10;
        boolean z11;
        jb2 jb2Var = this.f82368m;
        jb2Var.f78966a = bArr;
        jb2Var.f78968c = i10;
        int i13 = 0;
        jb2Var.f78967b = 0;
        ArrayList arrayList = new ArrayList();
        try {
            so3.a(this.f82368m);
            while (!TextUtils.isEmpty(this.f82368m.c())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                jb2 jb2Var2 = this.f82368m;
                int i14 = -1;
                int i15 = 1;
                int i16 = i13;
                int i17 = -1;
                while (i17 == -1) {
                    i16 = jb2Var2.f78967b;
                    String strC = jb2Var2.c();
                    if (strC == null) {
                        i17 = i13;
                    } else if ("STYLE".equals(strC)) {
                        i17 = 2;
                    } else {
                        i17 = strC.startsWith("NOTE") ? 1 : 3;
                    }
                }
                jb2Var2.e(i16);
                if (i17 == 0) {
                    return new to3(arrayList2);
                }
                if (i17 == 1) {
                    while (!TextUtils.isEmpty(this.f82368m.c())) {
                    }
                } else {
                    if (i17 == 2) {
                        if (!arrayList2.isEmpty()) {
                            throw new t43("A style block was found after the first cue.");
                        }
                        this.f82368m.c();
                        jo3 jo3Var = this.f82369n;
                        jb2 jb2Var3 = this.f82368m;
                        jo3Var.f79140b.setLength(i13);
                        int i18 = jb2Var3.f78967b;
                        while (!TextUtils.isEmpty(jb2Var3.c())) {
                        }
                        jb2 jb2Var4 = jo3Var.f79139a;
                        byte[] bArr2 = jb2Var3.f78966a;
                        int i19 = jb2Var3.f78967b;
                        jb2Var4.f78966a = bArr2;
                        jb2Var4.f78968c = i19;
                        jb2Var4.f78967b = i13;
                        jb2Var4.e(i18);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            jb2 jb2Var5 = jo3Var.f79139a;
                            StringBuilder sb2 = jo3Var.f79140b;
                            jo3.a(jb2Var5);
                            if (jb2Var5.f78968c - jb2Var5.f78967b >= 5 && "::cue".equals(jb2Var5.a(5, bu.f75964c))) {
                                int i20 = jb2Var5.f78967b;
                                String strB = jo3.b(jb2Var5, sb2);
                                if (strB == null) {
                                    strSubstring = null;
                                } else if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d.equals(strB)) {
                                    jb2Var5.e(i20);
                                    strSubstring = "";
                                } else {
                                    if ("(".equals(strB)) {
                                        int i21 = jb2Var5.f78967b;
                                        int i22 = jb2Var5.f78968c;
                                        while (true) {
                                            int i23 = i13;
                                            while (true) {
                                                if (i21 < i22 && i23 == 0) {
                                                    int i24 = i21 + 1;
                                                    if (((char) jb2Var5.f78966a[i21]) == ')') {
                                                        i21 = i24;
                                                        i23 = i15;
                                                    } else {
                                                        i21 = i24;
                                                    }
                                                }
                                            }
                                        }
                                        strSubstring = jb2Var5.a((i21 - 1) - jb2Var5.f78967b, bu.f75964c).trim();
                                    } else {
                                        strSubstring = null;
                                    }
                                    if (!")".equals(jo3.b(jb2Var5, sb2))) {
                                        strSubstring = null;
                                    }
                                }
                            } else {
                                strSubstring = null;
                            }
                            if (strSubstring != null && com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d.equals(jo3.b(jo3Var.f79139a, jo3Var.f79140b))) {
                                ko3 ko3Var = new ko3();
                                if (!"".equals(strSubstring)) {
                                    int iIndexOf = strSubstring.indexOf(91);
                                    if (iIndexOf != i14) {
                                        Matcher matcher2 = jo3.f79137c.matcher(strSubstring.substring(iIndexOf));
                                        if (matcher2.matches()) {
                                            String strGroup2 = matcher2.group(i15);
                                            strGroup2.getClass();
                                            ko3Var.f79504d = strGroup2;
                                        }
                                        strSubstring = strSubstring.substring(i13, iIndexOf);
                                    }
                                    int i25 = ib3.f78556a;
                                    String[] strArrSplit = strSubstring.split("\\.", i14);
                                    String str = strArrSplit[i13];
                                    int iIndexOf2 = str.indexOf(35);
                                    if (iIndexOf2 != i14) {
                                        ko3Var.f79502b = str.substring(i13, iIndexOf2);
                                        ko3Var.f79501a = str.substring(iIndexOf2 + 1);
                                    } else {
                                        ko3Var.f79502b = str;
                                    }
                                    if (strArrSplit.length > i15) {
                                        ko3Var.f79503c = new HashSet(Arrays.asList((String[]) ib3.a(strArrSplit, strArrSplit.length)));
                                    }
                                }
                                int i26 = i13;
                                String str2 = null;
                                while (i26 == 0) {
                                    jb2 jb2Var6 = jo3Var.f79139a;
                                    int i27 = jb2Var6.f78967b;
                                    String strB2 = jo3.b(jb2Var6, jo3Var.f79140b);
                                    int i28 = (strB2 == null || com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e.equals(strB2)) ? i15 : i13;
                                    if (i28 == 0) {
                                        jo3Var.f79139a.e(i27);
                                        jb2 jb2Var7 = jo3Var.f79139a;
                                        StringBuilder sb3 = jo3Var.f79140b;
                                        jo3.a(jb2Var7);
                                        String strA = jo3.a(jb2Var7, sb3);
                                        if ("".equals(strA)) {
                                            strB2 = strB2;
                                            i11 = i15;
                                        } else if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(jo3.b(jb2Var7, sb3))) {
                                            jo3.a(jb2Var7);
                                            StringBuilder sb4 = new StringBuilder();
                                            boolean z12 = false;
                                            while (true) {
                                                if (z12) {
                                                    strB2 = strB2;
                                                    string = sb4.toString();
                                                } else {
                                                    strB2 = strB2;
                                                    int i29 = jb2Var7.f78967b;
                                                    boolean z13 = z12;
                                                    String strB3 = jo3.b(jb2Var7, sb3);
                                                    if (strB3 == null) {
                                                        string = null;
                                                    } else if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e.equals(strB3) || ";".equals(strB3)) {
                                                        jb2Var7.e(i29);
                                                        z12 = true;
                                                    } else {
                                                        sb4.append(strB3);
                                                        z12 = z13;
                                                    }
                                                }
                                            }
                                            if (string == null || "".equals(string)) {
                                                i11 = 1;
                                            } else {
                                                int i30 = jb2Var7.f78967b;
                                                String strB4 = jo3.b(jb2Var7, sb3);
                                                if (";".equals(strB4)) {
                                                    if ("color".equals(strA)) {
                                                        i12 = 1;
                                                        ko3Var.f79506f = nx.a(string, true);
                                                        ko3Var.f79507g = true;
                                                    } else {
                                                        i12 = 1;
                                                        if ("background-color".equals(strA)) {
                                                            ko3Var.f79508h = nx.a(string, true);
                                                            ko3Var.f79509i = true;
                                                        } else if ("ruby-position".equals(strA)) {
                                                            if ("text-combine-upright".equals(strA)) {
                                                                if ("all".equals(string)) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = true;
                                                                }
                                                                ko3Var.f79517q = z11;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if ("underline".equals(string)) {
                                                                    ko3Var.f79511k = 1;
                                                                    i11 = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                ko3Var.f79505e = ki.a(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                i12 = 1;
                                                                if ("font-style".equals(strA)) {
                                                                    if ("italic".equals(string)) {
                                                                        ko3Var.f79513m = 1;
                                                                    }
                                                                } else if ("font-size".equals(strA)) {
                                                                    matcher = jo3.f79138d.matcher(ki.a(string));
                                                                    if (matcher.matches()) {
                                                                        strGroup = matcher.group(2);
                                                                        strGroup.getClass();
                                                                        switch (strGroup.hashCode()) {
                                                                            case 37:
                                                                                if (!strGroup.equals("%")) {
                                                                                    b10 = 0;
                                                                                }
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup3 = matcher.group(i11);
                                                                                strGroup3.getClass();
                                                                                ko3Var.f79515o = Float.parseFloat(strGroup3);
                                                                                break;
                                                                            case 3240:
                                                                                if (!strGroup.equals("em")) {
                                                                                    b10 = 1;
                                                                                }
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup4 = matcher.group(i11);
                                                                                strGroup4.getClass();
                                                                                ko3Var.f79515o = Float.parseFloat(strGroup4);
                                                                                break;
                                                                            case 3592:
                                                                                if (!strGroup.equals("px")) {
                                                                                    b10 = 2;
                                                                                }
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup5 = matcher.group(i11);
                                                                                strGroup5.getClass();
                                                                                ko3Var.f79515o = Float.parseFloat(strGroup5);
                                                                                break;
                                                                        }
                                                                        b10 = -1;
                                                                        switch (b10) {
                                                                            case 0:
                                                                                i11 = 1;
                                                                                ko3Var.f79514n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i11 = 1;
                                                                                ko3Var.f79514n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i11 = 1;
                                                                                ko3Var.f79514n = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String strGroup6 = matcher.group(i11);
                                                                        strGroup6.getClass();
                                                                        ko3Var.f79515o = Float.parseFloat(strGroup6);
                                                                    } else {
                                                                        ih1.d("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                    }
                                                                }
                                                            } else if ("bold".equals(string)) {
                                                                i12 = 1;
                                                                ko3Var.f79512l = 1;
                                                            }
                                                            i11 = 1;
                                                        } else if ("over".equals(string)) {
                                                            ko3Var.f79516p = 1;
                                                        } else if ("under".equals(string)) {
                                                            ko3Var.f79516p = 2;
                                                            i11 = 1;
                                                        } else {
                                                            i11 = 1;
                                                        }
                                                    }
                                                    i11 = i12;
                                                } else if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e.equals(strB4)) {
                                                    jb2Var7.e(i30);
                                                    if ("color".equals(strA)) {
                                                        i12 = 1;
                                                        ko3Var.f79506f = nx.a(string, true);
                                                        ko3Var.f79507g = true;
                                                    } else {
                                                        i12 = 1;
                                                        if ("background-color".equals(strA)) {
                                                            ko3Var.f79508h = nx.a(string, true);
                                                            ko3Var.f79509i = true;
                                                        } else if ("ruby-position".equals(strA)) {
                                                            if ("text-combine-upright".equals(strA)) {
                                                                if ("all".equals(string) || string.startsWith("digits")) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = false;
                                                                }
                                                                ko3Var.f79517q = z11;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if ("underline".equals(string)) {
                                                                    ko3Var.f79511k = 1;
                                                                    i11 = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                ko3Var.f79505e = ki.a(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                i12 = 1;
                                                                if ("font-style".equals(strA)) {
                                                                    if ("italic".equals(string)) {
                                                                        ko3Var.f79513m = 1;
                                                                    }
                                                                } else if ("font-size".equals(strA)) {
                                                                    matcher = jo3.f79138d.matcher(ki.a(string));
                                                                    if (matcher.matches()) {
                                                                        ih1.d("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                    } else {
                                                                        strGroup = matcher.group(2);
                                                                        strGroup.getClass();
                                                                        switch (strGroup.hashCode()) {
                                                                            case 37:
                                                                                if (!strGroup.equals("%")) {
                                                                                    b10 = 0;
                                                                                }
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup7 = matcher.group(i11);
                                                                                strGroup7.getClass();
                                                                                ko3Var.f79515o = Float.parseFloat(strGroup7);
                                                                                break;
                                                                            case 3240:
                                                                                if (!strGroup.equals("em")) {
                                                                                    b10 = 1;
                                                                                }
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup8 = matcher.group(i11);
                                                                                strGroup8.getClass();
                                                                                ko3Var.f79515o = Float.parseFloat(strGroup8);
                                                                                break;
                                                                            case 3592:
                                                                                if (!strGroup.equals("px")) {
                                                                                    b10 = 2;
                                                                                }
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i11 = 1;
                                                                                        ko3Var.f79514n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup9 = matcher.group(i11);
                                                                                strGroup9.getClass();
                                                                                ko3Var.f79515o = Float.parseFloat(strGroup9);
                                                                                break;
                                                                        }
                                                                        b10 = -1;
                                                                        switch (b10) {
                                                                            case 0:
                                                                                i11 = 1;
                                                                                ko3Var.f79514n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i11 = 1;
                                                                                ko3Var.f79514n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i11 = 1;
                                                                                ko3Var.f79514n = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String strGroup10 = matcher.group(i11);
                                                                        strGroup10.getClass();
                                                                        ko3Var.f79515o = Float.parseFloat(strGroup10);
                                                                    }
                                                                }
                                                            } else if ("bold".equals(string)) {
                                                                i12 = 1;
                                                                ko3Var.f79512l = 1;
                                                            }
                                                            i11 = 1;
                                                        } else if ("over".equals(string)) {
                                                            ko3Var.f79516p = 1;
                                                        } else if ("under".equals(string)) {
                                                            ko3Var.f79516p = 2;
                                                            i11 = 1;
                                                        } else {
                                                            i11 = 1;
                                                        }
                                                    }
                                                    i11 = i12;
                                                } else {
                                                    i11 = 1;
                                                }
                                            }
                                        } else {
                                            strB2 = strB2;
                                            i11 = i15;
                                        }
                                    } else {
                                        strB2 = strB2;
                                        i11 = i15;
                                    }
                                    i15 = i11;
                                    i26 = i28;
                                    str2 = strB2;
                                    i13 = 0;
                                }
                                int i31 = i15;
                                if (com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e.equals(str2)) {
                                    arrayList3.add(ko3Var);
                                }
                                i15 = i31;
                                i13 = 0;
                                i14 = -1;
                            }
                        }
                        arrayList.addAll(arrayList3);
                    } else if (i17 == 3) {
                        jb2 jb2Var8 = this.f82368m;
                        Pattern pattern = qo3.f81911a;
                        String strC2 = jb2Var8.c();
                        if (strC2 == null) {
                            lo3Var = null;
                        } else {
                            Pattern pattern2 = qo3.f81911a;
                            Matcher matcher3 = pattern2.matcher(strC2);
                            if (matcher3.matches()) {
                                lo3VarA = qo3.a(null, matcher3, jb2Var8, arrayList);
                            } else {
                                lo3Var = null;
                                String strC3 = jb2Var8.c();
                                if (strC3 != null) {
                                    Matcher matcher4 = pattern2.matcher(strC3);
                                    if (matcher4.matches()) {
                                        lo3VarA = qo3.a(strC2.trim(), matcher4, jb2Var8, arrayList);
                                    }
                                }
                            }
                            if (lo3VarA != null) {
                                arrayList2.add(lo3VarA);
                            }
                        }
                        lo3VarA = lo3Var;
                        if (lo3VarA != null) {
                            arrayList2.add(lo3VarA);
                        }
                    }
                    i13 = 0;
                }
            }
        } catch (ob2 e10) {
            throw new t43(e10);
        }
    }
}
