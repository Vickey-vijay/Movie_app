package com.mbridge.msdk.thrid.okhttp;

import com.google.android.material.badge.BadgeDrawable;
import com.ironsource.G5;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HttpUrl.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final char[] f37913j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<String> f37919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f37920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f37921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f37922i;

    /* JADX INFO: compiled from: HttpUrl.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f37923a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f37926d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<String> f37928f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<String> f37929g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f37930h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f37924b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f37925c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37927e = -1;

        private boolean c(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public a a(int i10) {
            if (i10 > 0 && i10 <= 65535) {
                this.f37927e = i10;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i10);
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strA = a(str, 0, str.length());
            if (strA != null) {
                this.f37926d = strA;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public a d() {
            int size = this.f37928f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f37928f.set(i10, s.a(this.f37928f.get(i10), "[]", true, true, false, true));
            }
            List<String> list = this.f37929g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f37929g.get(i11);
                    if (str != null) {
                        this.f37929g.set(i11, s.a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f37930h;
            if (str2 != null) {
                this.f37930h = s.a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a e(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f37925c = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a f(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f37923a = "http";
            } else {
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.f37923a = "https";
            }
            return this;
        }

        private void c() {
            List<String> list = this.f37928f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f37928f.isEmpty()) {
                this.f37928f.add("");
            } else {
                List<String> list2 = this.f37928f;
                list2.set(list2.size() - 1, "");
            }
        }

        public a g(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f37924b = s.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f37923a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (!this.f37924b.isEmpty() || !this.f37925c.isEmpty()) {
                sb2.append(this.f37924b);
                if (!this.f37925c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f37925c);
                }
                sb2.append('@');
            }
            String str2 = this.f37926d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f37926d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f37926d);
                }
            }
            if (this.f37927e != -1 || this.f37923a != null) {
                int iB = b();
                String str3 = this.f37923a;
                if (str3 == null || iB != s.a(str3)) {
                    sb2.append(':');
                    sb2.append(iB);
                }
            }
            s.b(sb2, this.f37928f);
            if (this.f37929g != null) {
                sb2.append('?');
                s.a(sb2, this.f37929g);
            }
            if (this.f37930h != null) {
                sb2.append('#');
                sb2.append(this.f37930h);
            }
            return sb2.toString();
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f37928f = arrayList;
            arrayList.add("");
        }

        private static int e(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public a a(String str) {
            this.f37929g = str != null ? s.d(s.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public s a() {
            if (this.f37923a != null) {
                if (this.f37926d != null) {
                    return new s(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public int b() {
            int i10 = this.f37927e;
            return i10 != -1 ? i10 : s.a(this.f37923a);
        }

        private static int b(String str, int i10, int i11) {
            try {
                int i12 = Integer.parseInt(s.a(str, i10, i11, "", false, false, false, true, null));
                if (i12 <= 0 || i12 > 65535) {
                    return -1;
                }
                return i12;
            } catch (NumberFormatException unused) {
            }
        }

        private static int c(String str, int i10, int i11) {
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

        private static int f(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public a a(s sVar, String str) {
            int iA;
            int i10;
            int iB = com.mbridge.msdk.thrid.okhttp.internal.c.b(str, 0, str.length());
            int iC = com.mbridge.msdk.thrid.okhttp.internal.c.c(str, iB, str.length());
            int iE = e(str, iB, iC);
            if (iE != -1) {
                if (str.regionMatches(true, iB, "https:", 0, 6)) {
                    this.f37923a = "https";
                    iB += 6;
                } else if (str.regionMatches(true, iB, "http:", 0, 5)) {
                    this.f37923a = "http";
                    iB += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, iE) + "'");
                }
            } else if (sVar != null) {
                this.f37923a = sVar.f37914a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iF = f(str, iB, iC);
            char c10 = '?';
            char c11 = '#';
            if (iF < 2 && sVar != null && sVar.f37914a.equals(this.f37923a)) {
                this.f37924b = sVar.f();
                this.f37925c = sVar.b();
                this.f37926d = sVar.f37917d;
                this.f37927e = sVar.f37918e;
                this.f37928f.clear();
                this.f37928f.addAll(sVar.d());
                if (iB == iC || str.charAt(iB) == '#') {
                    a(sVar.e());
                }
            } else {
                boolean z10 = false;
                boolean z11 = false;
                int i11 = iB + iF;
                while (true) {
                    iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i11, iC, "@/\\?#");
                    byte bCharAt = iA != iC ? str.charAt(iA) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c11 || bCharAt == 47 || bCharAt == 92 || bCharAt == c10) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z10) {
                            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i11, iA, ':');
                            i10 = iA;
                            String strA = s.a(str, i11, iA2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strA = this.f37924b + "%40" + strA;
                            }
                            this.f37924b = strA;
                            if (iA2 != i10) {
                                this.f37925c = s.a(str, iA2 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            }
                            z11 = true;
                        } else {
                            i10 = iA;
                            this.f37925c += "%40" + s.a(str, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i11 = i10 + 1;
                        c10 = '?';
                        c11 = '#';
                    }
                }
                int iC2 = c(str, i11, iA);
                int i12 = iC2 + 1;
                if (i12 < iA) {
                    this.f37926d = a(str, i11, iC2);
                    int iB2 = b(str, i12, iA);
                    this.f37927e = iB2;
                    if (iB2 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i12, iA) + '\"');
                    }
                } else {
                    this.f37926d = a(str, i11, iC2);
                    this.f37927e = s.a(this.f37923a);
                }
                if (this.f37926d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i11, iC2) + '\"');
                }
                iB = iA;
            }
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iB, iC, "?#");
            d(str, iB, iA3);
            if (iA3 < iC && str.charAt(iA3) == '?') {
                int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iA3, iC, '#');
                this.f37929g = s.d(s.a(str, iA3 + 1, iA4, " \"'<>#", true, false, true, true, null));
                iA3 = iA4;
            }
            if (iA3 < iC && str.charAt(iA3) == '#') {
                this.f37930h = s.a(str, 1 + iA3, iC, "", true, false, false, false, null);
            }
            return this;
        }

        private void d(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.f37928f;
                list.set(list.size() - 1, "");
            } else {
                this.f37928f.clear();
                this.f37928f.add("");
                i10++;
            }
            while (true) {
                int i12 = i10;
                while (i12 < i11) {
                    i10 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i12, i11, "/\\");
                    boolean z10 = i10 < i11;
                    a(str, i12, i10, z10, true);
                    if (z10) {
                        i12 = i10 + 1;
                    }
                }
                return;
            }
        }

        private boolean d(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void a(String str, int i10, int i11, boolean z10, boolean z11) {
            String strA = s.a(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (c(strA)) {
                return;
            }
            if (d(strA)) {
                c();
                return;
            }
            List<String> list = this.f37928f;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f37928f;
                list2.set(list2.size() - 1, strA);
            } else {
                this.f37928f.add(strA);
            }
            if (z10) {
                this.f37928f.add("");
            }
        }

        private static String a(String str, int i10, int i11) {
            return com.mbridge.msdk.thrid.okhttp.internal.c.a(s.a(str, i10, i11, false));
        }
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public String b() {
        if (this.f37916c.isEmpty()) {
            return "";
        }
        return this.f37922i.substring(this.f37922i.indexOf(58, this.f37914a.length() + 3) + 1, this.f37922i.indexOf(64));
    }

    public String c() {
        int iIndexOf = this.f37922i.indexOf(47, this.f37914a.length() + 3);
        String str = this.f37922i;
        return this.f37922i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#"));
    }

    public List<String> d() {
        int iIndexOf = this.f37922i.indexOf(47, this.f37914a.length() + 3);
        String str = this.f37922i;
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iA) {
            int i10 = iIndexOf + 1;
            int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37922i, i10, iA, '/');
            arrayList.add(this.f37922i.substring(i10, iA2));
            iIndexOf = iA2;
        }
        return arrayList;
    }

    public String e() {
        if (this.f37920g == null) {
            return null;
        }
        int iIndexOf = this.f37922i.indexOf(63) + 1;
        String str = this.f37922i;
        return this.f37922i.substring(iIndexOf, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, iIndexOf, str.length(), '#'));
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).f37922i.equals(this.f37922i);
    }

    public String f() {
        if (this.f37915b.isEmpty()) {
            return "";
        }
        int length = this.f37914a.length() + 3;
        String str = this.f37922i;
        return this.f37922i.substring(length, com.mbridge.msdk.thrid.okhttp.internal.c.a(str, length, str.length(), ":@"));
    }

    public String g() {
        return this.f37917d;
    }

    public boolean h() {
        return this.f37914a.equals("https");
    }

    public int hashCode() {
        return this.f37922i.hashCode();
    }

    public a i() {
        a aVar = new a();
        aVar.f37923a = this.f37914a;
        aVar.f37924b = f();
        aVar.f37925c = b();
        aVar.f37926d = this.f37917d;
        aVar.f37927e = this.f37918e != a(this.f37914a) ? this.f37918e : -1;
        aVar.f37928f.clear();
        aVar.f37928f.addAll(d());
        aVar.a(e());
        aVar.f37930h = a();
        return aVar;
    }

    public int j() {
        return this.f37918e;
    }

    public String k() {
        if (this.f37920g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        a(sb2, this.f37920g);
        return sb2.toString();
    }

    public String l() {
        return c("/...").g("").e("").a().toString();
    }

    public String m() {
        return this.f37914a;
    }

    public String toString() {
        return this.f37922i;
    }

    public s(a aVar) {
        List<String> listA;
        this.f37914a = aVar.f37923a;
        this.f37915b = a(aVar.f37924b, false);
        this.f37916c = a(aVar.f37925c, false);
        this.f37917d = aVar.f37926d;
        this.f37918e = aVar.b();
        this.f37919f = a(aVar.f37928f, false);
        List<String> list = aVar.f37929g;
        if (list != null) {
            listA = a(list, true);
        } else {
            listA = null;
        }
        this.f37920g = listA;
        String str = aVar.f37930h;
        this.f37921h = str != null ? a(str, false) : null;
        this.f37922i = aVar.toString();
    }

    public static void a(StringBuilder sb2, List<String> list) {
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

    public URI n() {
        String string = i().d().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public a c(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void b(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    public s e(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }

    public static List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static s b(String str) {
        return new a().a(null, str).a();
    }

    public String a() {
        if (this.f37921h == null) {
            return null;
        }
        return this.f37922i.substring(this.f37922i.indexOf(35) + 1);
    }

    public static String a(String str, boolean z10) {
        return a(str, 0, str.length(), z10);
    }

    private List<String> a(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? a(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String a(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                cVar.a(str, i10, i12);
                a(cVar, str, i12, i11, z10);
                return cVar.p();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i10 + 1));
                int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i12));
                if (iA != -1 && iA2 != -1) {
                    cVar.writeByte((iA << 4) + iA2);
                    i10 = i12;
                } else {
                    cVar.f(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z10) {
                cVar.writeByte(32);
            } else {
                cVar.f(iCodePointAt);
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static boolean a(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i10 + 1)) != -1 && com.mbridge.msdk.thrid.okhttp.internal.c.a(str.charAt(i12)) != -1;
    }

    public static String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || !z13)) {
                if (str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || a(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12))) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
            cVar.a(str, i10, iCharCount);
            a(cVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
            return cVar.p();
        }
        return str.substring(i10, i11);
    }

    public static void a(com.mbridge.msdk.thrid.okio.c cVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.mbridge.msdk.thrid.okio.c cVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    cVar.a(z10 ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || a(str, i10, i11)))))) {
                    cVar.f(iCodePointAt);
                } else {
                    if (cVar2 == null) {
                        cVar2 = new com.mbridge.msdk.thrid.okio.c();
                    }
                    if (charset != null && !charset.equals(com.mbridge.msdk.thrid.okhttp.internal.c.f37514j)) {
                        cVar2.a(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        cVar2.f(iCodePointAt);
                    }
                    while (!cVar2.f()) {
                        int i12 = cVar2.readByte() & 255;
                        cVar.writeByte(37);
                        char[] cArr = f37913j;
                        cVar.writeByte((int) cArr[(i12 >> 4) & 15]);
                        cVar.writeByte((int) cArr[i12 & 15]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, charset);
    }

    public static String a(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
