package yads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.ViewCompat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class b33 extends fz2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f75712r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f75713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c33 f75714n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinkedHashMap f75715o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f75716p = -3.4028235E38f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f75717q = -3.4028235E38f;

    public static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public b33(List list) {
        if (list != null && !list.isEmpty()) {
            this.f75713m = true;
            String strA = ib3.a((byte[]) list.get(0));
            ni.a(strA.startsWith("Format:"));
            this.f75714n = (c33) ni.a(c33.a(strA));
            a(new jb2((byte[]) list.get(1)));
            return;
        }
        this.f75713m = false;
        this.f75714n = null;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00fe. Please report as an issue. */
    @Override // yads.fz2
    public final r43 a(byte[] bArr, int i10, boolean z10) {
        jb2 jb2Var;
        c33 c33Var;
        int i11;
        float f10;
        int i12;
        int i13;
        Layout.Alignment alignment;
        int i14;
        float f11;
        float f12;
        float f13;
        float f14;
        int i15;
        float f15;
        int i16;
        c33 c33Var2;
        Matcher matcher;
        int i17;
        int i18;
        int i19;
        b33 b33Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jb2 jb2Var2 = new jb2(i10, bArr);
        if (!b33Var.f75713m) {
            b33Var.a(jb2Var2);
        }
        c33 c33VarA = b33Var.f75713m ? b33Var.f75714n : null;
        while (true) {
            String strC = jb2Var2.c();
            if (strC != null) {
                if (strC.startsWith("Format:")) {
                    c33VarA = c33.a(strC);
                } else {
                    if (strC.startsWith("Dialogue:")) {
                        if (c33VarA == null) {
                            ih1.d("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strC));
                        } else if (strC.startsWith("Dialogue:")) {
                            String[] strArrSplit = strC.substring(9).split(StringUtils.COMMA, c33VarA.f76151e);
                            if (strArrSplit.length != c33VarA.f76151e) {
                                ih1.d("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(strC));
                            } else {
                                long jA = a(strArrSplit[c33VarA.f76147a]);
                                if (jA == -9223372036854775807L) {
                                    ih1.d("SsaDecoder", "Skipping invalid timing: ".concat(strC));
                                } else {
                                    long jA2 = a(strArrSplit[c33VarA.f76148b]);
                                    if (jA2 == -9223372036854775807L) {
                                        ih1.d("SsaDecoder", "Skipping invalid timing: ".concat(strC));
                                    } else {
                                        LinkedHashMap linkedHashMap = b33Var.f75715o;
                                        f33 f33Var = (linkedHashMap == null || (i19 = c33VarA.f76149c) == -1) ? null : (f33) linkedHashMap.get(strArrSplit[i19].trim());
                                        String str = strArrSplit[c33VarA.f76150d];
                                        Matcher matcher2 = e33.f76903a.matcher(str);
                                        int i20 = -1;
                                        PointF pointF = null;
                                        while (matcher2.find()) {
                                            jb2Var2 = jb2Var2;
                                            String strGroup = matcher2.group(1);
                                            strGroup.getClass();
                                            try {
                                                PointF pointFA = e33.a(strGroup);
                                                if (pointFA != null) {
                                                    pointF = pointFA;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher3 = e33.f76906d.matcher(strGroup);
                                                if (matcher3.find()) {
                                                    String strGroup2 = matcher3.group(1);
                                                    strGroup2.getClass();
                                                    try {
                                                        i18 = Integer.parseInt(strGroup2.trim());
                                                        switch (i18) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                c33Var2 = c33VarA;
                                                                matcher = matcher2;
                                                                i17 = -1;
                                                                if (i18 != i17) {
                                                                    i20 = i18;
                                                                    c33VarA = c33Var2;
                                                                    matcher2 = matcher;
                                                                } else {
                                                                    c33VarA = c33Var2;
                                                                    matcher2 = matcher;
                                                                }
                                                                break;
                                                            default:
                                                                c33Var2 = c33VarA;
                                                                try {
                                                                    matcher = matcher2;
                                                                    try {
                                                                        ih1.d("SsaStyle", "Ignoring unknown alignment: " + strGroup2);
                                                                    } catch (RuntimeException unused2) {
                                                                    }
                                                                } catch (RuntimeException unused3) {
                                                                    matcher = matcher2;
                                                                }
                                                                break;
                                                        }
                                                    } catch (NumberFormatException unused4) {
                                                    }
                                                } else {
                                                    c33Var2 = c33VarA;
                                                    matcher = matcher2;
                                                }
                                                i17 = -1;
                                                i18 = -1;
                                                if (i18 != i17) {
                                                    i20 = i18;
                                                    c33VarA = c33Var2;
                                                    matcher2 = matcher;
                                                } else {
                                                    c33VarA = c33Var2;
                                                    matcher2 = matcher;
                                                }
                                            } catch (RuntimeException unused5) {
                                                c33Var2 = c33VarA;
                                            }
                                        }
                                        jb2Var = jb2Var2;
                                        c33Var = c33VarA;
                                        String strReplace = e33.f76903a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f16 = b33Var.f75716p;
                                        float f17 = b33Var.f75717q;
                                        SpannableString spannableString = new SpannableString(strReplace);
                                        if (f33Var != null) {
                                            if (f33Var.f77286c != null) {
                                                spannableString.setSpan(new ForegroundColorSpan(f33Var.f77286c.intValue()), 0, spannableString.length(), 33);
                                            }
                                            if (f33Var.f77293j == 3 && f33Var.f77287d != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(f33Var.f77287d.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f18 = f33Var.f77288e;
                                            if (f18 == -3.4028235E38f || f17 == -3.4028235E38f) {
                                                f14 = -3.4028235E38f;
                                                i15 = Integer.MIN_VALUE;
                                            } else {
                                                f14 = f18 / f17;
                                                i15 = 1;
                                            }
                                            boolean z11 = f33Var.f77289f;
                                            if (z11 && f33Var.f77290g) {
                                                f15 = f14;
                                                i11 = 0;
                                                i16 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                f15 = f14;
                                                i11 = 0;
                                                i16 = 33;
                                                if (z11) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (f33Var.f77290g) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (f33Var.f77291h) {
                                                spannableString.setSpan(new UnderlineSpan(), i11, spannableString.length(), i16);
                                            }
                                            if (f33Var.f77292i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i11, spannableString.length(), i16);
                                            }
                                            i13 = i15;
                                            f10 = f15;
                                            i12 = -1;
                                        } else {
                                            jA2 = jA2;
                                            i11 = 0;
                                            f10 = -3.4028235E38f;
                                            i12 = -1;
                                            i13 = Integer.MIN_VALUE;
                                        }
                                        if (i20 != i12) {
                                            i12 = i20;
                                        } else if (f33Var != null) {
                                            i12 = f33Var.f77285b;
                                        }
                                        switch (i12) {
                                            case 0:
                                            default:
                                                kf1.a("Unknown alignment: ", i12, "SsaDecoder");
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        switch (i12) {
                                            case 0:
                                            default:
                                                kf1.a("Unknown alignment: ", i12, "SsaDecoder");
                                            case -1:
                                                i14 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i14 = i11;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i14 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i14 = 2;
                                                break;
                                        }
                                        switch (i12) {
                                            case 0:
                                            default:
                                                kf1.a("Unknown alignment: ", i12, "SsaDecoder");
                                            case -1:
                                                i11 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i11 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i11 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                break;
                                        }
                                        if (pointF == null || f17 == -3.4028235E38f || f16 == -3.4028235E38f) {
                                            if (i14 == 0) {
                                                f11 = 0.05f;
                                            } else if (i14 != 1) {
                                                f11 = i14 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                f11 = 0.5f;
                                            }
                                            if (i11 == 0) {
                                                f12 = 0.05f;
                                            } else if (i11 == 1) {
                                                f12 = 0.5f;
                                            } else if (i11 != 2) {
                                                f13 = f11;
                                                f12 = -3.4028235E38f;
                                            } else {
                                                f12 = 0.95f;
                                            }
                                            f13 = f11;
                                        } else {
                                            f13 = pointF.x / f16;
                                            f12 = pointF.y / f17;
                                        }
                                        o20 o20Var = new o20(spannableString, alignment, null, null, f12, 0, i11, f13, i14, i13, f10, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
                                        int iA = a(jA2, arrayList2, arrayList);
                                        for (int iA2 = a(jA, arrayList2, arrayList); iA2 < iA; iA2++) {
                                            ((List) arrayList.get(iA2)).add(o20Var);
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        jb2Var = jb2Var2;
                        c33Var = c33VarA;
                    } else {
                        jb2Var = jb2Var2;
                        c33Var = c33VarA;
                    }
                    b33Var = this;
                    jb2Var2 = jb2Var;
                    c33VarA = c33Var;
                }
            } else {
                return new g33(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x030b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(jb2 jb2Var) {
        int i10;
        f33 f33Var;
        int i11;
        float f10;
        int i12;
        while (true) {
            String strC = jb2Var.c();
            if (strC == null) {
                return;
            }
            char c10 = '[';
            int i13 = 2;
            int i14 = 0;
            if ("[Script Info]".equalsIgnoreCase(strC)) {
                while (true) {
                    String strC2 = jb2Var.c();
                    if (strC2 == null) {
                        break;
                    }
                    int i15 = jb2Var.f78968c;
                    int i16 = jb2Var.f78967b;
                    if (i15 - i16 != 0 && (jb2Var.f78966a[i16] & 255) == 91) {
                        break;
                    }
                    String[] strArrSplit = strC2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    if (strArrSplit.length == 2) {
                        String strA = ki.a(strArrSplit[0].trim());
                        strA.getClass();
                        if (strA.equals("playresx")) {
                            this.f75716p = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strA.equals("playresy")) {
                            try {
                                this.f75717q = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strC)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    d33 d33Var = null;
                    while (true) {
                        String strC3 = jb2Var.c();
                        if (strC3 != null) {
                            int i17 = jb2Var.f78968c;
                            int i18 = jb2Var.f78967b;
                            if (i17 - i18 == 0 || (jb2Var.f78966a[i18] & 255) != c10) {
                                if (strC3.startsWith("Format:")) {
                                    String[] strArrSplit2 = TextUtils.split(strC3.substring(7), StringUtils.COMMA);
                                    int i19 = -1;
                                    int i20 = -1;
                                    int i21 = -1;
                                    int i22 = -1;
                                    int i23 = -1;
                                    int i24 = -1;
                                    int i25 = -1;
                                    int i26 = -1;
                                    int i27 = -1;
                                    int i28 = -1;
                                    for (int i29 = i14; i29 < strArrSplit2.length; i29++) {
                                        String strA2 = ki.a(strArrSplit2[i29].trim());
                                        strA2.getClass();
                                        switch (strA2.hashCode()) {
                                            case -1178781136:
                                                i10 = strA2.equals("italic") ? i14 : -1;
                                                break;
                                            case -1026963764:
                                                i10 = strA2.equals("underline") ? 1 : -1;
                                                break;
                                            case -192095652:
                                                i10 = strA2.equals("strikeout") ? i13 : -1;
                                                break;
                                            case -70925746:
                                                i10 = strA2.equals("primarycolour") ? 3 : -1;
                                                break;
                                            case 3029637:
                                                i10 = strA2.equals("bold") ? 4 : -1;
                                                break;
                                            case 3373707:
                                                i10 = strA2.equals("name") ? 5 : -1;
                                                break;
                                            case 366554320:
                                                i10 = strA2.equals(VastAttributes.FONT_SIZE) ? 6 : -1;
                                                break;
                                            case 767321349:
                                                i10 = strA2.equals("borderstyle") ? 7 : -1;
                                                break;
                                            case 1767875043:
                                                i10 = strA2.equals("alignment") ? 8 : -1;
                                                break;
                                            case 1988365454:
                                                i10 = strA2.equals("outlinecolour") ? 9 : -1;
                                                break;
                                            default:
                                                i10 = -1;
                                                break;
                                        }
                                        switch (i10) {
                                            case 0:
                                                i25 = i29;
                                                break;
                                            case 1:
                                                i26 = i29;
                                                break;
                                            case 2:
                                                i27 = i29;
                                                break;
                                            case 3:
                                                i21 = i29;
                                                break;
                                            case 4:
                                                i24 = i29;
                                                break;
                                            case 5:
                                                i19 = i29;
                                                break;
                                            case 6:
                                                i23 = i29;
                                                break;
                                            case 7:
                                                i28 = i29;
                                                break;
                                            case 8:
                                                i20 = i29;
                                                break;
                                            case 9:
                                                i22 = i29;
                                                break;
                                        }
                                    }
                                    if (i19 != -1) {
                                        d33Var = new d33(i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, strArrSplit2.length);
                                        c10 = '[';
                                    } else {
                                        c10 = '[';
                                    }
                                } else {
                                    if (strC3.startsWith("Style:")) {
                                        if (d33Var == null) {
                                            ih1.d("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(strC3));
                                        } else if (strC3.startsWith("Style:")) {
                                            String[] strArrSplit3 = TextUtils.split(strC3.substring(6), StringUtils.COMMA);
                                            int length = strArrSplit3.length;
                                            int i30 = d33Var.f76558k;
                                            if (length != i30) {
                                                int length2 = strArrSplit3.length;
                                                int i31 = ib3.f78556a;
                                                Locale locale = Locale.US;
                                                ih1.d("SsaStyle", "Skipping malformed 'Style:' line (expected " + i30 + " values, found " + length2 + "): '" + strC3 + "'");
                                            } else {
                                                try {
                                                    String strTrim = strArrSplit3[d33Var.f76548a].trim();
                                                    int i32 = d33Var.f76549b;
                                                    if (i32 != -1) {
                                                        String strTrim2 = strArrSplit3[i32].trim();
                                                        try {
                                                            int i33 = Integer.parseInt(strTrim2.trim());
                                                            switch (i33) {
                                                                case 1:
                                                                case 2:
                                                                case 3:
                                                                case 4:
                                                                case 5:
                                                                case 6:
                                                                case 7:
                                                                case 8:
                                                                case 9:
                                                                    i11 = i33;
                                                                    break;
                                                                default:
                                                                    ih1.d("SsaStyle", "Ignoring unknown alignment: " + strTrim2);
                                                                    i11 = -1;
                                                                    break;
                                                            }
                                                        } catch (NumberFormatException unused2) {
                                                        }
                                                    } else {
                                                        i11 = -1;
                                                    }
                                                    int i34 = d33Var.f76550c;
                                                    Integer numB = i34 != -1 ? f33.b(strArrSplit3[i34].trim()) : null;
                                                    int i35 = d33Var.f76551d;
                                                    Integer numB2 = i35 != -1 ? f33.b(strArrSplit3[i35].trim()) : null;
                                                    int i36 = d33Var.f76552e;
                                                    if (i36 != -1) {
                                                        String strTrim3 = strArrSplit3[i36].trim();
                                                        try {
                                                            f10 = Float.parseFloat(strTrim3);
                                                        } catch (NumberFormatException e10) {
                                                            ih1.d("SsaStyle", ih1.a("Failed to parse font size: '" + strTrim3 + "'", e10));
                                                            f10 = -3.4028235E38f;
                                                        }
                                                    } else {
                                                        f10 = -3.4028235E38f;
                                                    }
                                                    float f11 = f10;
                                                    int i37 = d33Var.f76553f;
                                                    boolean z10 = i37 != -1 && f33.a(strArrSplit3[i37].trim());
                                                    int i38 = d33Var.f76554g;
                                                    boolean z11 = i38 != -1 && f33.a(strArrSplit3[i38].trim());
                                                    int i39 = d33Var.f76555h;
                                                    boolean z12 = i39 != -1 && f33.a(strArrSplit3[i39].trim());
                                                    int i40 = d33Var.f76556i;
                                                    boolean z13 = i40 != -1 && f33.a(strArrSplit3[i40].trim());
                                                    int i41 = d33Var.f76557j;
                                                    if (i41 != -1) {
                                                        String strTrim4 = strArrSplit3[i41].trim();
                                                        try {
                                                            int i42 = Integer.parseInt(strTrim4.trim());
                                                            if (i42 == 1 || i42 == 3) {
                                                                i12 = i42;
                                                            } else {
                                                                ih1.d("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim4);
                                                                i12 = -1;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                        }
                                                    } else {
                                                        i12 = -1;
                                                    }
                                                    f33Var = new f33(strTrim, i11, numB, numB2, f11, z10, z11, z12, z13, i12);
                                                } catch (RuntimeException e11) {
                                                    ih1.d("SsaStyle", ih1.a("Skipping malformed 'Style:' line: '" + strC3 + "'", e11));
                                                    f33Var = null;
                                                }
                                                if (f33Var != null) {
                                                    linkedHashMap.put(f33Var.f77284a, f33Var);
                                                }
                                            }
                                            f33Var = null;
                                            if (f33Var != null) {
                                                linkedHashMap.put(f33Var.f77284a, f33Var);
                                            }
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                    c10 = '[';
                                    i13 = 2;
                                    i14 = 0;
                                }
                            }
                        }
                    }
                }
                this.f75715o = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strC)) {
                ih1.c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strC)) {
                return;
            }
        }
    }

    public static long a(String str) {
        Matcher matcher = f75712r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i10 = ib3.f78556a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }
}
