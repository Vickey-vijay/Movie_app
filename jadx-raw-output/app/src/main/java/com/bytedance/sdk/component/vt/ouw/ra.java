package com.bytedance.sdk.component.vt.ouw;

import com.google.android.material.badge.BadgeDrawable;
import com.ironsource.G5;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ra {
    private static final char[] yu = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String bly;
    private final String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final String f11948le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final int f11949lh;
    public final String ouw;
    private final List<String> pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final List<String> f11950ra;
    private final String tlj;
    public final String vt;

    public static final class ouw {

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public final List<String> f11951le;
        public String ouw;
        public String pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public List<String> f11953ra;
        public String yu;
        public String vt = "";

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f11952lh = "";
        public int fkw = -1;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.vt.ouw.ra$ouw$ouw, reason: collision with other inner class name */
        public enum EnumC0102ouw {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        private ouw yu(String str) {
            int i10 = 0;
            do {
                int iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, i10, str.length(), "/\\");
                ouw(str, i10, iOuw, iOuw < str.length());
                i10 = iOuw + 1;
            } while (i10 <= str.length());
            return this;
        }

        public final ouw lh(String str) {
            if (str != null) {
                return yu(str);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public final ouw ouw(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.ouw = "http";
            } else {
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: ".concat(str));
                }
                this.ouw = "https";
            }
            return this;
        }

        public final ouw vt(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strLh = lh(str, 0, str.length());
            if (strLh == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.yu = strLh;
            return this;
        }

        private static boolean fkw(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private static boolean le(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.ouw);
            sb2.append("://");
            if (!this.vt.isEmpty() || !this.f11952lh.isEmpty()) {
                sb2.append(this.vt);
                if (!this.f11952lh.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f11952lh);
                }
                sb2.append('@');
            }
            if (this.yu.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.yu);
                sb2.append(']');
            } else {
                sb2.append(this.yu);
            }
            int iOuw = ouw();
            if (iOuw != ra.ouw(this.ouw)) {
                sb2.append(':');
                sb2.append(iOuw);
            }
            ra.ouw(sb2, this.f11951le);
            if (this.f11953ra != null) {
                sb2.append('?');
                ra.vt(sb2, this.f11953ra);
            }
            if (this.pno != null) {
                sb2.append('#');
                sb2.append(this.pno);
            }
            return sb2.toString();
        }

        public ouw() {
            ArrayList arrayList = new ArrayList();
            this.f11951le = arrayList;
            arrayList.add("");
        }

        private void lh() {
            List<String> list = this.f11951le;
            if (list.remove(list.size() - 1).isEmpty() && !this.f11951le.isEmpty()) {
                List<String> list2 = this.f11951le;
                list2.set(list2.size() - 1, "");
            } else {
                this.f11951le.add("");
            }
        }

        public static int yu(String str, int i10, int i11) {
            try {
                int i12 = Integer.parseInt(ra.ouw(str, i10, i11, "", false, false, true, null));
                if (i12 <= 0 || i12 > 65535) {
                    return -1;
                }
                return i12;
            } catch (NumberFormatException unused) {
            }
        }

        public final ra vt() {
            if (this.ouw != null) {
                if (this.yu != null) {
                    return new ra(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public static String lh(String str, int i10, int i11) {
            return com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(ra.ouw(str, i10, i11, false));
        }

        public final int ouw() {
            int i10 = this.fkw;
            return i10 != -1 ? i10 : ra.ouw(this.ouw);
        }

        public final ouw ouw(String str, String str2) {
            if (str != null) {
                if (this.f11953ra == null) {
                    this.f11953ra = new ArrayList();
                }
                this.f11953ra.add(ra.ouw(str, " \"'<>#&="));
                this.f11953ra.add(str2 != null ? ra.ouw(str2, " \"'<>#&=") : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public static int vt(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 >= i11) {
                            break;
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        public final void ouw(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.f11951le;
                list.set(list.size() - 1, "");
            } else {
                this.f11951le.clear();
                this.f11951le.add("");
                i10++;
            }
            while (i10 < i11) {
                int iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, i10, i11, "/\\");
                boolean z10 = iOuw < i11;
                ouw(str, i10, iOuw, z10);
                if (z10) {
                    iOuw++;
                }
                i10 = iOuw;
            }
        }

        private void ouw(String str, int i10, int i11, boolean z10) {
            String strOuw = ra.ouw(str, i10, i11, " \"<>^`{}|/\\?#", true, false, true, null);
            if (fkw(strOuw)) {
                return;
            }
            if (le(strOuw)) {
                lh();
                return;
            }
            List<String> list = this.f11951le;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f11951le;
                list2.set(list2.size() - 1, strOuw);
            } else {
                this.f11951le.add(strOuw);
            }
            if (z10) {
                this.f11951le.add("");
            }
        }
    }

    public final URL ouw() {
        try {
            return new URL(this.tlj);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final List<String> vt() {
        int iIndexOf = this.tlj.indexOf(47, this.ouw.length() + 3);
        String str = this.tlj;
        int iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iOuw) {
            int i10 = iIndexOf + 1;
            int iOuw2 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(this.tlj, i10, iOuw, '/');
            arrayList.add(this.tlj.substring(i10, iOuw2));
            iIndexOf = iOuw2;
        }
        return arrayList;
    }

    private static List<String> lh(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ra) && ((ra) obj).tlj.equals(this.tlj);
    }

    public final int hashCode() {
        return this.tlj.hashCode();
    }

    public final String toString() {
        return this.tlj;
    }

    public ra(ouw ouwVar) {
        List<String> listOuw;
        this.ouw = ouwVar.ouw;
        this.fkw = ouw(ouwVar.vt, false);
        this.f11948le = ouw(ouwVar.f11952lh, false);
        this.vt = ouwVar.yu;
        this.f11949lh = ouwVar.ouw();
        this.f11950ra = ouw(ouwVar.f11951le, false);
        List<String> list = ouwVar.f11953ra;
        if (list != null) {
            listOuw = ouw(list, true);
        } else {
            listOuw = null;
        }
        this.pno = listOuw;
        String str = ouwVar.pno;
        this.bly = str != null ? ouw(str, false) : null;
        this.tlj = ouwVar.toString();
    }

    public static int ouw(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void ouw(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public static void vt(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append(G5.T);
                sb2.append(str2);
            }
        }
    }

    private static String ouw(String str, boolean z10) {
        return ouw(str, 0, str.length(), z10);
    }

    private static List<String> ouw(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? ouw(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static ra vt(String str) {
        int i10;
        ouw.EnumC0102ouw enumC0102ouw;
        int i11;
        char c10;
        char c11;
        int iOuw;
        int i12;
        char cCharAt;
        char cCharAt2;
        ouw ouwVar = new ouw();
        int iOuw2 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, str.length());
        int iOuw3 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, iOuw2, str.length());
        char c12 = ':';
        if (iOuw3 - iOuw2 >= 2 && (((cCharAt2 = str.charAt(iOuw2)) >= 'a' && cCharAt2 <= 'z') || (cCharAt2 >= 'A' && cCharAt2 <= 'Z'))) {
            i10 = iOuw2 + 1;
            while (true) {
                if (i10 < iOuw3) {
                    char cCharAt3 = str.charAt(i10);
                    if ((cCharAt3 < 'a' || cCharAt3 > 'z') && ((cCharAt3 < 'A' || cCharAt3 > 'Z') && !((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                        if (cCharAt3 == ':') {
                            break;
                        }
                        break;
                    }
                    i10++;
                }
                i10 = -1;
                break;
            }
        } else {
            i10 = -1;
            break;
        }
        if (i10 != -1) {
            if (str.regionMatches(true, iOuw2, "https:", 0, 6)) {
                ouwVar.ouw = "https";
                i11 = iOuw2 + 6;
            } else if (str.regionMatches(true, iOuw2, "http:", 0, 5)) {
                ouwVar.ouw = "http";
                i11 = iOuw2 + 5;
            } else {
                enumC0102ouw = ouw.EnumC0102ouw.UNSUPPORTED_SCHEME;
            }
            int i13 = 0;
            int i14 = i11;
            while (true) {
                c10 = '/';
                c11 = '\\';
                if (i14 >= iOuw3 || !((cCharAt = str.charAt(i14)) == '\\' || cCharAt == '/')) {
                    break;
                }
                i13++;
                i14++;
            }
            boolean z10 = false;
            boolean z11 = false;
            int i15 = i11 + i13;
            while (true) {
                iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, i15, iOuw3, "@/\\?#");
                byte bCharAt = iOuw != iOuw3 ? str.charAt(iOuw) : (byte) -1;
                if (bCharAt == -1 || bCharAt == 35 || bCharAt == c10 || bCharAt == c11 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (!z10) {
                        int iOuw4 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, i15, iOuw, c12);
                        i12 = iOuw;
                        String strOuw = ouw(str, i15, iOuw4, " \"':;<=>@[]^`{}|/\\?#", true, false, true, null);
                        if (z11) {
                            strOuw = ouwVar.vt + "%40" + strOuw;
                        }
                        ouwVar.vt = strOuw;
                        if (iOuw4 != i12) {
                            ouwVar.f11952lh = ouw(str, iOuw4 + 1, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, true, null);
                            z10 = true;
                        }
                        z11 = true;
                    } else {
                        i12 = iOuw;
                        ouwVar.f11952lh += "%40" + ouw(str, i15, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, true, null);
                    }
                    i15 = i12 + 1;
                    c12 = ':';
                    c10 = '/';
                    c11 = '\\';
                }
            }
            int iVt = ouw.vt(str, i15, iOuw);
            int i16 = iVt + 1;
            if (i16 < iOuw) {
                ouwVar.yu = ouw.lh(str, i15, iVt);
                int iYu = ouw.yu(str, i16, iOuw);
                ouwVar.fkw = iYu;
                if (iYu == -1) {
                    enumC0102ouw = ouw.EnumC0102ouw.INVALID_PORT;
                }
            } else {
                ouwVar.yu = ouw.lh(str, i15, iVt);
                ouwVar.fkw = ouw(ouwVar.ouw);
            }
            if (ouwVar.yu == null) {
                enumC0102ouw = ouw.EnumC0102ouw.INVALID_HOST;
            } else {
                int iOuw5 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, iOuw, iOuw3, "?#");
                ouwVar.ouw(str, iOuw, iOuw5);
                if (iOuw5 < iOuw3 && str.charAt(iOuw5) == '?') {
                    int iOuw6 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, iOuw5, iOuw3, '#');
                    ouwVar.f11953ra = lh(ouw(str, iOuw5 + 1, iOuw6, " \"'<>#", true, true, true, null));
                    iOuw5 = iOuw6;
                }
                if (iOuw5 < iOuw3 && str.charAt(iOuw5) == '#') {
                    ouwVar.pno = ouw(str, iOuw5 + 1, iOuw3, "", true, false, false, null);
                }
                enumC0102ouw = ouw.EnumC0102ouw.SUCCESS;
            }
        } else {
            enumC0102ouw = ouw.EnumC0102ouw.MISSING_SCHEME;
        }
        if (enumC0102ouw == ouw.EnumC0102ouw.SUCCESS) {
            return ouwVar.vt();
        }
        return null;
    }

    public static String ouw(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar = new com.bytedance.sdk.component.vt.ouw.vt.ouw();
                ouwVar.ouw(str, i10, i12);
                ouw(ouwVar, str, i12, i11, z10);
                return ouwVar.lh();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    private static void ouw(com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str.charAt(i10 + 1));
                int iOuw2 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str.charAt(i12));
                if (iOuw != -1 && iOuw2 != -1) {
                    ouwVar.vt((iOuw << 4) + iOuw2);
                    i10 = i12;
                } else {
                    ouwVar.ouw(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z10) {
                ouwVar.vt(32);
            } else {
                ouwVar.ouw(iCodePointAt);
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static String ouw(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || !z12)) {
                if (str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || z10) && (iCodePointAt != 43 || !z11))) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar = new com.bytedance.sdk.component.vt.ouw.vt.ouw();
            ouwVar.ouw(str, i10, iCharCount);
            ouw(ouwVar, str, iCharCount, i11, str2, z10, z11, z12, charset);
            return ouwVar.lh();
        }
        return str.substring(i10, i11);
    }

    private static void ouw(com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, Charset charset) {
        com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z11) {
                    ouwVar.ouw(z10 ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z12) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || z10))) {
                    ouwVar.ouw(iCodePointAt);
                } else {
                    if (ouwVar2 == null) {
                        ouwVar2 = new com.bytedance.sdk.component.vt.ouw.vt.ouw();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.vt.ouw.vt.bly.ouw)) {
                        ouwVar2.ouw(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        ouwVar2.ouw(iCodePointAt);
                    }
                    while (!ouwVar2.ouw()) {
                        int iVt = ouwVar2.vt() & 255;
                        ouwVar.vt(37);
                        char[] cArr = yu;
                        ouwVar.vt(cArr[(iVt >> 4) & 15]);
                        ouwVar.vt(cArr[iVt & 15]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static String ouw(String str, String str2) {
        return ouw(str, 0, str.length(), str2, true, true, true, null);
    }
}
