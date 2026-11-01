package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.Regex;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4615w8 implements InterfaceC4335l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57863a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57864b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57865c = 255;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57866d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57867e = 63;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f57868f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f57869g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f57870h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f57871i = 64;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Regex f57872j = new Regex("^[a-zA-Z0-9'!#$%&*+-/=?^_`{|}~]+$");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Regex f57873k = new Regex("(?:^|\\.)(?:(ya\\.ru)|(?:yandex)\\.(\\w+|com?\\.\\w+))$");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f57874l = nj.s.n("ru", "by", "kz", "az", "kg", "lv", com.ironsource.Q6.f27472u, "tj", "tm", "uz", "ee", "fr", "lt", "com", "co.il", "com.ge", "com.am", "com.tr", "com.ru");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f57875m = "yandex.ru";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f57876n = "gmail.com";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f57877o = "googlemail.com";

    /* JADX WARN: Code duplicated, block: B:103:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e3 A[LOOP:0: B:75:0x0132->B:108:0x01e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[LOOP:2: B:65:0x0109->B:116:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:64:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:72:0x012b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0138  */
    /* JADX WARN: Code duplicated, block: B:81:0x0156  */
    /* JADX WARN: Code duplicated, block: B:83:0x016c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0175  */
    /* JADX WARN: Code duplicated, block: B:91:0x0185  */
    /* JADX WARN: Code duplicated, block: B:92:0x0192  */
    /* JADX WARN: Code duplicated, block: B:94:0x019a  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b5 A[LOOP:1: B:96:0x01ab->B:99:0x01b5, LOOP_END] */
    @Override // io.appmetrica.analytics.impl.InterfaceC4335l2
    public final String a(String str) {
        Character chU1;
        List listN0;
        List listY;
        Iterator it;
        String str2;
        int i10;
        String strN;
        lk.i iVarFind$default;
        int length;
        int i11;
        String str3;
        String str4;
        String lowerCase = new Regex("^\\++").replace(lk.a0.k1(str).toString(), "").toLowerCase(Locale.ROOT);
        int iQ0 = lk.a0.q0(lowerCase, '@', 0, false, 6, null);
        if (iQ0 == -1) {
            return null;
        }
        String strSubstring = lowerCase.substring(0, iQ0);
        String strSubstring2 = lowerCase.substring(iQ0 + 1);
        int length2 = strSubstring.length();
        if (length2 >= this.f57870h && length2 <= this.f57871i) {
            List<String> listM0 = lk.a0.M0(strSubstring, new char[]{'.'}, false, 0, 6, null);
            if (!(listM0 instanceof Collection) || !listM0.isEmpty()) {
                for (String str5 : listM0) {
                    int length3 = str5.length();
                    if (length3 >= this.f57870h) {
                        Character chS1 = lk.c0.s1(str5);
                        if (chS1 != null && chS1.charValue() == '\"' && (chU1 = lk.c0.u1(str5)) != null && chU1.charValue() == '\"' && length3 > 2) {
                            int i12 = 1;
                            while (true) {
                                int i13 = i12 + 2;
                                if (i13 >= str5.length()) {
                                    break;
                                }
                                char cCharAt = str5.charAt(i12);
                                if (cCharAt >= ' ' && cCharAt != '\"' && cCharAt <= '~') {
                                    if (cCharAt == '\\') {
                                        if (i13 != str5.length()) {
                                            i12++;
                                            if (str5.charAt(i12) < ' ') {
                                            }
                                        }
                                    }
                                    i12++;
                                }
                            }
                        } else if (!this.f57872j.matches(str5)) {
                        }
                    }
                }
                if (strSubstring2.length() <= this.f57865c) {
                    listN0 = lk.a0.N0(strSubstring2, new String[]{"."}, false, 0, 6, null);
                    if (listN0.size() >= this.f57866d) {
                        listY = nj.b0.Y(listN0, 1);
                        if ((listY instanceof Collection) || !listY.isEmpty()) {
                            it = listY.iterator();
                            while (it.hasNext()) {
                                if (!b((String) it.next())) {
                                }
                            }
                            str2 = (String) nj.b0.r0(listN0);
                            if (str2.length() >= this.f57869g && b(str2)) {
                                for (i10 = 0; i10 < str2.length(); i10++) {
                                    if (!Character.isDigit(str2.charAt(i10))) {
                                        strN = lk.x.N(strSubstring2, this.f57877o, this.f57876n, false, 4, null);
                                        iVarFind$default = Regex.find$default(this.f57873k, strN, 0, 2, null);
                                        if (iVarFind$default != null) {
                                            List<String> listB = iVarFind$default.b();
                                            String str6 = listB.get(1);
                                            str4 = listB.get(2);
                                            if (str4.length() > 0 ? str6.length() > 0 : this.f57874l.contains(str4)) {
                                            }
                                        }
                                        if (ck.p.e(strN, this.f57875m)) {
                                            strSubstring = lk.x.N(strSubstring, ".", "-", false, 4, null);
                                        } else if (ck.p.e(strN, this.f57876n)) {
                                            strSubstring = lk.x.N(strSubstring, ".", "", false, 4, null);
                                        }
                                        length = strSubstring.length();
                                        for (i11 = 0; i11 < length; i11++) {
                                            if (strSubstring.charAt(i11) != '+') {
                                                strSubstring = strSubstring.substring(0, i11);
                                                break;
                                            }
                                        }
                                        str3 = strSubstring + '@' + strN;
                                        if (str3.length() >= this.f57863a || str3.length() > this.f57864b) {
                                            return null;
                                        }
                                        return str3;
                                    }
                                }
                            }
                        } else {
                            str2 = (String) nj.b0.r0(listN0);
                            if (str2.length() >= this.f57869g) {
                                while (i10 < str2.length()) {
                                    if (!Character.isDigit(str2.charAt(i10))) {
                                        strN = lk.x.N(strSubstring2, this.f57877o, this.f57876n, false, 4, null);
                                        iVarFind$default = Regex.find$default(this.f57873k, strN, 0, 2, null);
                                        if (iVarFind$default != null) {
                                            List<String> listB2 = iVarFind$default.b();
                                            String str7 = listB2.get(1);
                                            str4 = listB2.get(2);
                                            strN = str4.length() > 0 ? this.f57875m : this.f57875m;
                                        }
                                        if (ck.p.e(strN, this.f57875m)) {
                                            strSubstring = lk.x.N(strSubstring, ".", "-", false, 4, null);
                                        } else if (ck.p.e(strN, this.f57876n)) {
                                            strSubstring = lk.x.N(strSubstring, ".", "", false, 4, null);
                                        }
                                        length = strSubstring.length();
                                        while (i11 < length) {
                                            if (strSubstring.charAt(i11) != '+') {
                                                strSubstring = strSubstring.substring(0, i11);
                                                break;
                                            }
                                        }
                                        str3 = strSubstring + '@' + strN;
                                        if (str3.length() >= this.f57863a) {
                                            return null;
                                        }
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (strSubstring2.length() <= this.f57865c) {
                listN0 = lk.a0.N0(strSubstring2, new String[]{"."}, false, 0, 6, null);
                if (listN0.size() >= this.f57866d) {
                    listY = nj.b0.Y(listN0, 1);
                    if (listY instanceof Collection) {
                        it = listY.iterator();
                        while (it.hasNext()) {
                            if (!b((String) it.next())) {
                            }
                        }
                        str2 = (String) nj.b0.r0(listN0);
                        if (str2.length() >= this.f57869g) {
                            while (i10 < str2.length()) {
                                if (!Character.isDigit(str2.charAt(i10))) {
                                    strN = lk.x.N(strSubstring2, this.f57877o, this.f57876n, false, 4, null);
                                    iVarFind$default = Regex.find$default(this.f57873k, strN, 0, 2, null);
                                    if (iVarFind$default != null) {
                                        List<String> listB3 = iVarFind$default.b();
                                        String str8 = listB3.get(1);
                                        str4 = listB3.get(2);
                                        if (str4.length() > 0) {
                                        }
                                    }
                                    if (ck.p.e(strN, this.f57875m)) {
                                        strSubstring = lk.x.N(strSubstring, ".", "-", false, 4, null);
                                    } else if (ck.p.e(strN, this.f57876n)) {
                                        strSubstring = lk.x.N(strSubstring, ".", "", false, 4, null);
                                    }
                                    length = strSubstring.length();
                                    while (i11 < length) {
                                        if (strSubstring.charAt(i11) != '+') {
                                            strSubstring = strSubstring.substring(0, i11);
                                            break;
                                        }
                                    }
                                    str3 = strSubstring + '@' + strN;
                                    if (str3.length() >= this.f57863a) {
                                        return null;
                                    }
                                    return null;
                                }
                            }
                        }
                    } else {
                        it = listY.iterator();
                        while (it.hasNext()) {
                            if (!b((String) it.next())) {
                            }
                        }
                        str2 = (String) nj.b0.r0(listN0);
                        if (str2.length() >= this.f57869g) {
                            while (i10 < str2.length()) {
                                if (!Character.isDigit(str2.charAt(i10))) {
                                    strN = lk.x.N(strSubstring2, this.f57877o, this.f57876n, false, 4, null);
                                    iVarFind$default = Regex.find$default(this.f57873k, strN, 0, 2, null);
                                    if (iVarFind$default != null) {
                                        List<String> listB4 = iVarFind$default.b();
                                        String str9 = listB4.get(1);
                                        str4 = listB4.get(2);
                                        if (str4.length() > 0) {
                                        }
                                    }
                                    if (ck.p.e(strN, this.f57875m)) {
                                        strSubstring = lk.x.N(strSubstring, ".", "-", false, 4, null);
                                    } else if (ck.p.e(strN, this.f57876n)) {
                                        strSubstring = lk.x.N(strSubstring, ".", "", false, 4, null);
                                    }
                                    length = strSubstring.length();
                                    while (i11 < length) {
                                        if (strSubstring.charAt(i11) != '+') {
                                            strSubstring = strSubstring.substring(0, i11);
                                            break;
                                        }
                                    }
                                    str3 = strSubstring + '@' + strN;
                                    if (str3.length() >= this.f57863a) {
                                        return null;
                                    }
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final boolean b(String str) {
        if (str.length() > this.f57867e || str.length() < this.f57868f || !Character.isLetterOrDigit(lk.c0.r1(str)) || !Character.isLetterOrDigit(lk.c0.t1(str))) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '-') {
                return false;
            }
        }
        return true;
    }
}
