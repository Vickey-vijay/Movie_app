package xm;

import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: QuotedStringTokenizer.java */
/* JADX INFO: loaded from: classes10.dex */
public class m extends StringTokenizer {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char[] f75046k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f75047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f75048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f75050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StringBuffer f75051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f75054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f75055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f75056j;

    public m(String str, String str2, boolean z10, boolean z11) {
        super("");
        this.f75048b = "\t\n\r";
        this.f75049c = false;
        this.f75050d = false;
        this.f75052f = false;
        this.f75053g = 0;
        this.f75054h = 0;
        this.f75055i = true;
        this.f75056j = true;
        this.f75047a = str;
        if (str2 != null) {
            this.f75048b = str2;
        }
        this.f75050d = z10;
        this.f75049c = z11;
        if (this.f75048b.indexOf(39) < 0 && this.f75048b.indexOf(34) < 0) {
            this.f75051e = new StringBuffer(this.f75047a.length() > 1024 ? 512 : this.f75047a.length() / 2);
            return;
        }
        throw new Error("Can't use quotes as delimiters: " + this.f75048b);
    }

    public static boolean a(char c10) {
        return c10 == 'n' || c10 == 'r' || c10 == 't' || c10 == 'f' || c10 == 'b' || c10 == '\\' || c10 == '/' || c10 == '\"' || c10 == 'u';
    }

    public static boolean d(Appendable appendable, String str, String str2) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (str2.indexOf(str.charAt(i10)) >= 0) {
                b(appendable, str);
                return true;
            }
        }
        try {
            appendable.append(str);
            return false;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String e(String str) {
        return f(str, false);
    }

    public static String g(String str) {
        return h(str, false);
    }

    @Override // java.util.StringTokenizer
    public int countTokens() {
        return -1;
    }

    @Override // java.util.StringTokenizer
    public String nextToken() throws NoSuchElementException {
        StringBuffer stringBuffer;
        if (!hasMoreTokens() || (stringBuffer = this.f75051e) == null) {
            throw new NoSuchElementException();
        }
        String string = stringBuffer.toString();
        this.f75051e.setLength(0);
        this.f75052f = false;
        return string;
    }

    static {
        char[] cArr = new char[32];
        f75046k = cArr;
        Arrays.fill(cArr, (char) 65535);
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[12] = 'f';
        cArr[13] = 'r';
    }

    public static void b(Appendable appendable, String str) {
        try {
            appendable.append('\"');
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt >= ' ') {
                    if (cCharAt == '\"' || cCharAt == '\\') {
                        appendable.append('\\');
                    }
                    appendable.append(cCharAt);
                } else {
                    char c10 = f75046k[cCharAt];
                    if (c10 == 65535) {
                        appendable.append('\\').append('u').append('0').append('0');
                        if (cCharAt < 16) {
                            appendable.append('0');
                        }
                        appendable.append(Integer.toString(cCharAt, 16));
                    } else {
                        appendable.append('\\').append(c10);
                    }
                }
            }
            appendable.append('\"');
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String c(String str, String str2) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "\"\"";
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\\' || cCharAt == '\"' || cCharAt == '\'' || Character.isWhitespace(cCharAt) || str2.indexOf(cCharAt) >= 0) {
                StringBuffer stringBuffer = new StringBuffer(str.length() + 8);
                b(stringBuffer, str);
                return stringBuffer.toString();
            }
        }
        return str;
    }

    public static String f(String str, boolean z10) {
        char cCharAt;
        if (str == null) {
            return null;
        }
        if (str.length() < 2 || (cCharAt = str.charAt(0)) != str.charAt(str.length() - 1)) {
            return str;
        }
        if (cCharAt != '\"' && cCharAt != '\'') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() - 2);
        boolean z11 = false;
        int i10 = 1;
        while (i10 < str.length() - 1) {
            char cCharAt2 = str.charAt(i10);
            if (z11) {
                if (cCharAt2 == '\"') {
                    sb2.append('\"');
                } else if (cCharAt2 == '/') {
                    sb2.append('/');
                } else if (cCharAt2 == '\\') {
                    sb2.append('\\');
                } else if (cCharAt2 == 'b') {
                    sb2.append('\b');
                } else if (cCharAt2 == 'f') {
                    sb2.append('\f');
                } else if (cCharAt2 == 'n') {
                    sb2.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb2.append('\r');
                } else if (cCharAt2 == 't') {
                    sb2.append('\t');
                } else if (cCharAt2 != 'u') {
                    if (z10 && !a(cCharAt2)) {
                        sb2.append('\\');
                    }
                    sb2.append(cCharAt2);
                } else {
                    int i11 = i10 + 1;
                    int i12 = i11 + 1;
                    int iB = (p.b((byte) str.charAt(i10)) << 24) + (p.b((byte) str.charAt(i11)) << 16);
                    int i13 = i12 + 1;
                    int iB2 = iB + (p.b((byte) str.charAt(i12)) << 8);
                    int i14 = i13 + 1;
                    sb2.append((char) (iB2 + p.b((byte) str.charAt(i13))));
                    z11 = false;
                    i10 = i14;
                }
                z11 = false;
            } else if (cCharAt2 == '\\') {
                z11 = true;
            } else {
                sb2.append(cCharAt2);
            }
            i10++;
        }
        return sb2.toString();
    }

    public static String h(String str, boolean z10) {
        char cCharAt;
        if (str == null) {
            return null;
        }
        if (str.length() < 2 || (cCharAt = str.charAt(0)) != str.charAt(str.length() - 1)) {
            return str;
        }
        if (cCharAt != '\"' && cCharAt != '\'') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() - 2);
        boolean z11 = false;
        for (int i10 = 1; i10 < str.length() - 1; i10++) {
            char cCharAt2 = str.charAt(i10);
            if (z11) {
                if (z10 && !a(cCharAt2)) {
                    sb2.append('\\');
                }
                sb2.append(cCharAt2);
                z11 = false;
            } else if (cCharAt2 == '\\') {
                z11 = true;
            } else {
                sb2.append(cCharAt2);
            }
        }
        return sb2.toString();
    }

    @Override // java.util.StringTokenizer
    public boolean hasMoreTokens() {
        if (this.f75052f) {
            return true;
        }
        this.f75054h = this.f75053g;
        char c10 = 0;
        boolean z10 = false;
        while (this.f75053g < this.f75047a.length()) {
            String str = this.f75047a;
            int i10 = this.f75053g;
            this.f75053g = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (c10 != 0) {
                if (c10 == 1) {
                    this.f75052f = true;
                    if (this.f75048b.indexOf(cCharAt) >= 0) {
                        if (this.f75050d) {
                            this.f75053g--;
                        }
                        return this.f75052f;
                    }
                    if (cCharAt == '\'' && this.f75056j) {
                        if (this.f75049c) {
                            this.f75051e.append(cCharAt);
                        }
                        c10 = 2;
                    } else if (cCharAt == '\"' && this.f75055i) {
                        if (this.f75049c) {
                            this.f75051e.append(cCharAt);
                        }
                        c10 = 3;
                    } else {
                        this.f75051e.append(cCharAt);
                    }
                } else if (c10 == 2) {
                    this.f75052f = true;
                    if (z10) {
                        this.f75051e.append(cCharAt);
                        z10 = false;
                    } else if (cCharAt == '\'') {
                        if (this.f75049c) {
                            this.f75051e.append(cCharAt);
                        }
                        c10 = 1;
                    } else if (cCharAt == '\\') {
                        if (this.f75049c) {
                            this.f75051e.append(cCharAt);
                        }
                        z10 = true;
                    } else {
                        this.f75051e.append(cCharAt);
                    }
                } else if (c10 == 3) {
                    this.f75052f = true;
                    if (z10) {
                        this.f75051e.append(cCharAt);
                        z10 = false;
                    } else if (cCharAt == '\"') {
                        if (this.f75049c) {
                            this.f75051e.append(cCharAt);
                        }
                        c10 = 1;
                    } else if (cCharAt == '\\') {
                        if (this.f75049c) {
                            this.f75051e.append(cCharAt);
                        }
                        z10 = true;
                    } else {
                        this.f75051e.append(cCharAt);
                    }
                }
            } else if (this.f75048b.indexOf(cCharAt) >= 0) {
                if (this.f75050d) {
                    this.f75051e.append(cCharAt);
                    this.f75052f = true;
                    return true;
                }
            } else if (cCharAt == '\'' && this.f75056j) {
                if (this.f75049c) {
                    this.f75051e.append(cCharAt);
                }
                c10 = 2;
            } else if (cCharAt == '\"' && this.f75055i) {
                if (this.f75049c) {
                    this.f75051e.append(cCharAt);
                }
                c10 = 3;
            } else {
                this.f75051e.append(cCharAt);
                this.f75052f = true;
                c10 = 1;
            }
        }
        return this.f75052f;
    }

    @Override // java.util.StringTokenizer, java.util.Enumeration
    public boolean hasMoreElements() {
        return hasMoreTokens();
    }

    @Override // java.util.StringTokenizer, java.util.Enumeration
    public Object nextElement() throws NoSuchElementException {
        return nextToken();
    }

    @Override // java.util.StringTokenizer
    public String nextToken(String str) throws NoSuchElementException {
        this.f75048b = str;
        this.f75053g = this.f75054h;
        this.f75051e.setLength(0);
        this.f75052f = false;
        return nextToken();
    }

    public m(String str, String str2) {
        this(str, str2, false, false);
    }
}
