package yads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class p43 extends fz2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f81252o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f81253p = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StringBuilder f81254m = new StringBuilder();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f81255n = new ArrayList();

    public static long a(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = (Long.parseLong(strGroup2) * 60000) + j10;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = (Long.parseLong(strGroup3) * 1000) + j11;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:101:0x01db  */
    /* JADX WARN: Code duplicated, block: B:103:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:123:0x0209  */
    /* JADX WARN: Code duplicated, block: B:126:0x0211  */
    /* JADX WARN: Code duplicated, block: B:128:0x0214 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0216  */
    /* JADX WARN: Code duplicated, block: B:132:0x0220  */
    /* JADX WARN: Code duplicated, block: B:133:0x0222  */
    /* JADX WARN: Code duplicated, block: B:135:0x0226  */
    /* JADX WARN: Code duplicated, block: B:136:0x0228 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x022a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0236  */
    /* JADX WARN: Code duplicated, block: B:154:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:35:0x0121  */
    /* JADX WARN: Code duplicated, block: B:38:0x0140  */
    /* JADX WARN: Code duplicated, block: B:40:0x0146  */
    /* JADX WARN: Code duplicated, block: B:41:0x0148  */
    /* JADX WARN: Code duplicated, block: B:43:0x014e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0151  */
    /* JADX WARN: Code duplicated, block: B:46:0x0157  */
    /* JADX WARN: Code duplicated, block: B:47:0x0159  */
    /* JADX WARN: Code duplicated, block: B:49:0x015f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0161  */
    /* JADX WARN: Code duplicated, block: B:52:0x0167  */
    /* JADX WARN: Code duplicated, block: B:53:0x0169  */
    /* JADX WARN: Code duplicated, block: B:55:0x016f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x0177  */
    /* JADX WARN: Code duplicated, block: B:59:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0181  */
    /* JADX WARN: Code duplicated, block: B:64:0x0187  */
    /* JADX WARN: Code duplicated, block: B:65:0x0189  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d3  */
    @Override // yads.fz2
    public final r43 a(byte[] bArr, int i10, boolean z10) {
        byte b10;
        int i11;
        byte b11;
        int i12;
        float f10;
        int i13;
        float f11;
        float f12;
        o20 o20Var;
        this = this;
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        kh1 kh1Var = new kh1(0);
        jb2 jb2Var = new jb2(i10, bArr);
        while (true) {
            String strC = jb2Var.c();
            if (strC != null) {
                if (strC.length() != 0) {
                    try {
                        Integer.parseInt(strC);
                        String strC2 = jb2Var.c();
                        if (strC2 == null) {
                            ih1.d("SubripDecoder", "Unexpected end");
                        } else {
                            Matcher matcher = f81252o.matcher(strC2);
                            if (matcher.matches()) {
                                kh1Var.a(a(matcher, 1));
                                kh1Var.a(a(matcher, 6));
                                this.f81254m.setLength(i14);
                                this.f81255n.clear();
                                for (String strC3 = jb2Var.c(); !TextUtils.isEmpty(strC3); strC3 = jb2Var.c()) {
                                    if (this.f81254m.length() > 0) {
                                        this.f81254m.append("<br>");
                                    }
                                    StringBuilder sb2 = this.f81254m;
                                    ArrayList arrayList2 = this.f81255n;
                                    String strTrim = strC3.trim();
                                    StringBuilder sb3 = new StringBuilder(strTrim);
                                    Matcher matcher2 = f81253p.matcher(strTrim);
                                    int i15 = i14;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i15;
                                        int length = strGroup.length();
                                        sb3.replace(iStart, iStart + length, "");
                                        i15 += length;
                                    }
                                    sb2.append(sb3.toString());
                                }
                                Spanned spannedFromHtml = Html.fromHtml(this.f81254m.toString());
                                String str = null;
                                for (int i16 = i14; i16 < this.f81255n.size(); i16++) {
                                    String str2 = (String) this.f81255n.get(i16);
                                    if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                        str = str2;
                                        if (str == null) {
                                            o20Var = new o20(spannedFromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
                                        } else {
                                            switch (str) {
                                                case "{\an1}":
                                                    b10 = 0;
                                                    break;
                                                case "{\an2}":
                                                    b10 = 6;
                                                    break;
                                                case "{\an3}":
                                                    b10 = 3;
                                                    break;
                                                case "{\an4}":
                                                    b10 = 1;
                                                    break;
                                                case "{\an5}":
                                                    b10 = 7;
                                                    break;
                                                case "{\an6}":
                                                    b10 = 4;
                                                    break;
                                                case "{\an7}":
                                                    b10 = 2;
                                                    break;
                                                case "{\an8}":
                                                    b10 = 8;
                                                    break;
                                                case "{\an9}":
                                                    b10 = 5;
                                                    break;
                                                default:
                                                    b10 = -1;
                                                    break;
                                            }
                                            if (b10 != 0 || b10 == 1 || b10 == 2) {
                                                i11 = 0;
                                            } else {
                                                i11 = (b10 == 3 || b10 == 4 || b10 == 5) ? 2 : 1;
                                            }
                                            switch (str) {
                                                case "{\an1}":
                                                    b11 = 0;
                                                    break;
                                                case "{\an2}":
                                                    b11 = 1;
                                                    break;
                                                case "{\an3}":
                                                    b11 = 2;
                                                    break;
                                                case "{\an4}":
                                                    b11 = 6;
                                                    break;
                                                case "{\an5}":
                                                    b11 = 7;
                                                    break;
                                                case "{\an6}":
                                                    b11 = 8;
                                                    break;
                                                case "{\an7}":
                                                    b11 = 3;
                                                    break;
                                                case "{\an8}":
                                                    b11 = 4;
                                                    break;
                                                case "{\an9}":
                                                    b11 = 5;
                                                    break;
                                                default:
                                                    b11 = -1;
                                                    break;
                                            }
                                            if (b11 != 0 || b11 == 1 || b11 == 2) {
                                                i12 = 2;
                                            } else {
                                                i12 = (b11 == 3 || b11 == 4 || b11 == 5) ? 0 : 1;
                                            }
                                            f10 = 0.5f;
                                            if (i11 != 0) {
                                                i13 = 1;
                                                if (i11 != 1) {
                                                    f11 = 0.5f;
                                                } else {
                                                    if (i11 == 2) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    f11 = 0.92f;
                                                }
                                            } else {
                                                i13 = 1;
                                                f11 = 0.08f;
                                            }
                                            if (i12 != 0) {
                                                if (i12 != i13) {
                                                    if (i12 == 2) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    f10 = 0.92f;
                                                }
                                                f12 = f10;
                                            } else {
                                                f12 = 0.08f;
                                            }
                                            o20Var = new o20(spannedFromHtml, null, null, null, f12, 0, i12, f11, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
                                        }
                                        arrayList.add(o20Var);
                                        arrayList.add(o20.f80902s);
                                        jb2Var = jb2Var;
                                        kh1Var = kh1Var;
                                    }
                                }
                                if (str == null) {
                                    o20Var = new o20(spannedFromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
                                } else {
                                    switch (str) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                b10 = 0;
                                            }
                                            break;
                                        case -685620679:
                                            if (!str.equals("{\\an2}")) {
                                                b10 = 6;
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                b10 = 3;
                                            }
                                            break;
                                        case -685620617:
                                            if (!str.equals("{\\an4}")) {
                                                b10 = 1;
                                            }
                                            break;
                                        case -685620586:
                                            if (!str.equals("{\\an5}")) {
                                                b10 = 7;
                                            }
                                            break;
                                        case -685620555:
                                            if (!str.equals("{\\an6}")) {
                                                b10 = 4;
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                b10 = 2;
                                            }
                                            break;
                                        case -685620493:
                                            if (!str.equals("{\\an8}")) {
                                                b10 = 8;
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                b10 = 5;
                                            }
                                            break;
                                        default:
                                            b10 = -1;
                                            break;
                                    }
                                    if (b10 != 0) {
                                        i11 = 0;
                                    } else {
                                        i11 = 0;
                                    }
                                    switch (str) {
                                        case -685620710:
                                            if (!str.equals("{\\an1}")) {
                                                b11 = 0;
                                            }
                                            break;
                                        case -685620679:
                                            if (!str.equals("{\\an2}")) {
                                                b11 = 1;
                                            }
                                            break;
                                        case -685620648:
                                            if (!str.equals("{\\an3}")) {
                                                b11 = 2;
                                            }
                                            break;
                                        case -685620617:
                                            if (!str.equals("{\\an4}")) {
                                                b11 = 6;
                                            }
                                            break;
                                        case -685620586:
                                            if (!str.equals("{\\an5}")) {
                                                b11 = 7;
                                            }
                                            break;
                                        case -685620555:
                                            if (!str.equals("{\\an6}")) {
                                                b11 = 8;
                                            }
                                            break;
                                        case -685620524:
                                            if (!str.equals("{\\an7}")) {
                                                b11 = 3;
                                            }
                                            break;
                                        case -685620493:
                                            if (!str.equals("{\\an8}")) {
                                                b11 = 4;
                                            }
                                            break;
                                        case -685620462:
                                            if (!str.equals("{\\an9}")) {
                                                b11 = 5;
                                            }
                                            break;
                                        default:
                                            b11 = -1;
                                            break;
                                    }
                                    if (b11 != 0) {
                                        i12 = 2;
                                    } else {
                                        i12 = 2;
                                    }
                                    f10 = 0.5f;
                                    if (i11 != 0) {
                                        i13 = 1;
                                        if (i11 != 1) {
                                            f11 = 0.5f;
                                        } else {
                                            if (i11 == 2) {
                                                throw new IllegalArgumentException();
                                            }
                                            f11 = 0.92f;
                                        }
                                    } else {
                                        i13 = 1;
                                        f11 = 0.08f;
                                    }
                                    if (i12 != 0) {
                                        if (i12 != i13) {
                                            if (i12 == 2) {
                                                throw new IllegalArgumentException();
                                            }
                                            f10 = 0.92f;
                                        }
                                        f12 = f10;
                                    } else {
                                        f12 = 0.08f;
                                    }
                                    o20Var = new o20(spannedFromHtml, null, null, null, f12, 0, i12, f11, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
                                }
                                arrayList.add(o20Var);
                                arrayList.add(o20.f80902s);
                                jb2Var = jb2Var;
                                kh1Var = kh1Var;
                            } else {
                                ih1.d("SubripDecoder", "Skipping invalid timing: ".concat(strC2));
                            }
                            i14 = 0;
                        }
                    } catch (NumberFormatException unused) {
                        kh1Var = kh1Var;
                        jb2Var = jb2Var;
                        ih1.d("SubripDecoder", "Skipping invalid index: ".concat(strC));
                    }
                }
            }
        }
        return new q43((o20[]) arrayList.toArray(new o20[i14]), kh1Var.a());
    }
}
