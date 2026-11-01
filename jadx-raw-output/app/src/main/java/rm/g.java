package rm;

import java.util.Locale;
import javax.servlet.http.Cookie;
import org.eclipse.jetty.util.LazyList;

/* JADX INFO: compiled from: CookieCutter.java */
/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zm.c f66873e = zm.b.a(g.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cookie[] f66874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Cookie[] f66875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f66876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66877d;

    public void d() {
        this.f66874a = null;
        this.f66877d = 0;
    }

    public void a(String str) {
        if (str == null) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return;
        }
        int size = LazyList.size(this.f66876c);
        int i10 = this.f66877d;
        if (size > i10) {
            if (!strTrim.equals(LazyList.get(this.f66876c, i10))) {
                while (true) {
                    int size2 = LazyList.size(this.f66876c);
                    int i11 = this.f66877d;
                    if (size2 <= i11) {
                        break;
                    } else {
                        this.f66876c = LazyList.remove(this.f66876c, i11);
                    }
                }
            } else {
                this.f66877d++;
                return;
            }
        }
        this.f66874a = null;
        this.f66875b = null;
        Object obj = this.f66876c;
        int i12 = this.f66877d;
        this.f66877d = i12 + 1;
        this.f66876c = LazyList.add(obj, i12, strTrim);
    }

    public Cookie[] b() {
        Object obj;
        Cookie[] cookieArr = this.f66874a;
        if (cookieArr != null) {
            return cookieArr;
        }
        if (this.f66875b == null || (obj = this.f66876c) == null || this.f66877d != LazyList.size(obj)) {
            c();
        } else {
            this.f66874a = this.f66875b;
        }
        Cookie[] cookieArr2 = this.f66874a;
        this.f66875b = cookieArr2;
        return cookieArr2;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0180  */
    /* JADX WARN: Code duplicated, block: B:104:0x0185 A[PHI: r0 r14
  0x0185: PHI (r0v12 boolean) = (r0v9 boolean), (r0v7 boolean), (r0v13 boolean), (r0v7 boolean) binds: [B:70:0x00ee, B:59:0x00c6, B:45:0x00a6, B:37:0x0088] A[DONT_GENERATE, DONT_INLINE]
  0x0185: PHI (r14v9 int) = (r14v2 int), (r14v6 int), (r14v10 int), (r14v13 int) binds: [B:70:0x00ee, B:59:0x00c6, B:45:0x00a6, B:37:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v30 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v28 */
    /* JADX WARN: Type inference failed for: r17v29 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    public void c() {
        ?? Substring;
        String strSubstring;
        ?? r17;
        ?? Substring2;
        ?? Substring3;
        ?? r16;
        String strSubstring2;
        ?? Substring4;
        ?? r18;
        ?? Substring5;
        Cookie cookie = null;
        this.f66875b = null;
        this.f66874a = null;
        while (true) {
            int size = LazyList.size(this.f66876c);
            int i10 = this.f66877d;
            if (size <= i10) {
                break;
            } else {
                this.f66876c = LazyList.remove(this.f66876c, i10);
            }
        }
        Object obj = null;
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.f66877d) {
            String str = (String) LazyList.get(this.f66876c, i11);
            int length = str.length();
            int i13 = length - 1;
            Cookie cookie2 = cookie;
            ?? r19 = cookie2;
            int i14 = i12;
            int i15 = 0;
            boolean z10 = false;
            boolean z11 = false;
            int i16 = -1;
            i15 = -1;
            Object objAdd = obj;
            boolean z12 = false;
            while (i15 < length) {
                char cCharAt = str.charAt(i15);
                if (z12) {
                    if (z11) {
                        z11 = false;
                    } else if (cCharAt == '\"') {
                        if (i15 != i13) {
                            Substring5 = Substring;
                            r18 = Substring4;
                        } else if (z10) {
                            Substring4 = str.substring(i16, i15 + 1);
                            Substring5 = Substring;
                            r18 = Substring4;
                        } else {
                            r18 = "";
                            Substring5 = str.substring(i16, i15 + 1);
                        }
                        z12 = false;
                        Substring = Substring5;
                        r19 = r18;
                        if (r19 != 0 || Substring == 0) {
                            z12 = z12;
                        } else {
                            String strG = xm.m.g(Substring);
                            String strG2 = xm.m.g(r19);
                            boolean z13 = z12;
                            try {
                                if (strG.startsWith("$")) {
                                    String lowerCase = strG.toLowerCase(Locale.ENGLISH);
                                    if ("$path".equals(lowerCase)) {
                                        if (cookie != null) {
                                            cookie.setPath(strG2);
                                        }
                                    } else if ("$domain".equals(lowerCase)) {
                                        if (cookie != null) {
                                            cookie.setDomain(strG2);
                                        }
                                    } else if ("$port".equals(lowerCase)) {
                                        if (cookie != null) {
                                            cookie.setComment("$port=" + strG2);
                                        }
                                    } else if ("$version".equals(lowerCase)) {
                                        i14 = Integer.parseInt(strG2);
                                    }
                                } else {
                                    Cookie cookie3 = new Cookie(strG, strG2);
                                    if (i14 > 0) {
                                        try {
                                            cookie3.setVersion(i14);
                                        } catch (Exception e10) {
                                            e = e10;
                                            cookie = cookie3;
                                            f66873e.a(e);
                                        }
                                    }
                                    objAdd = LazyList.add(objAdd, cookie3);
                                    cookie = cookie3;
                                }
                            } catch (Exception e11) {
                                e = e11;
                            }
                            z12 = z13;
                            Substring = 0;
                            r19 = 0;
                        }
                    } else if (cCharAt == '\\') {
                        z11 = true;
                    }
                } else if (z10) {
                    if (cCharAt != '\t' && cCharAt != ' ') {
                        if (cCharAt == '\"') {
                            if (i16 < 0) {
                                i16 = i15;
                                z12 = true;
                            }
                            if (i15 == i13) {
                                strSubstring2 = str.substring(i16, i15 + 1);
                                z12 = z12;
                                i15 = i15;
                                Substring = Substring;
                                r19 = strSubstring2;
                                if (r19 != 0) {
                                    z12 = z12;
                                } else {
                                    z12 = z12;
                                }
                            } else {
                                i15 = i15;
                            }
                        } else if (cCharAt != ';') {
                            if (i16 < 0) {
                                i16 = i15;
                            }
                            if (i15 == i13) {
                                strSubstring2 = str.substring(i16, i15 + 1);
                                z12 = z12;
                                i15 = i15;
                                Substring = Substring;
                                r19 = strSubstring2;
                                if (r19 != 0) {
                                    z12 = z12;
                                } else {
                                    z12 = z12;
                                }
                            } else {
                                i15 = i15;
                            }
                        } else {
                            z10 = false;
                            r16 = Substring;
                            Substring3 = i16 >= 0 ? str.substring(i16, i15 + 1) : "";
                            i16 = -1;
                            Substring = r16;
                            r19 = Substring3;
                            if (r19 != 0) {
                                z12 = z12;
                            } else {
                                z12 = z12;
                            }
                        }
                    }
                } else if (cCharAt != '\t' && cCharAt != ' ') {
                    if (cCharAt == '\"') {
                        if (i16 < 0) {
                            i16 = i15;
                            z12 = true;
                        }
                        if (i15 == i13) {
                            strSubstring = str.substring(i16, i15 + 1);
                            z12 = z12;
                            i15 = i15;
                            r19 = "";
                            Substring = strSubstring;
                            if (r19 != 0) {
                                z12 = z12;
                            } else {
                                z12 = z12;
                            }
                        } else {
                            i15 = i15;
                        }
                    } else if (cCharAt == ';') {
                        if (i16 >= 0) {
                            r17 = "";
                            Substring2 = str.substring(i16, i15 + 1);
                        }
                        r16 = Substring2;
                        Substring3 = r17;
                        i16 = -1;
                        Substring = r16;
                        r19 = Substring3;
                        if (r19 != 0) {
                            z12 = z12;
                        } else {
                            z12 = z12;
                        }
                    } else if (cCharAt != '=') {
                        if (i16 < 0) {
                            i16 = i15;
                        }
                        if (i15 == i13) {
                            strSubstring = str.substring(i16, i15 + 1);
                            z12 = z12;
                            i15 = i15;
                            r19 = "";
                            Substring = strSubstring;
                            if (r19 != 0) {
                                z12 = z12;
                            } else {
                                z12 = z12;
                            }
                        } else {
                            i15 = i15;
                        }
                    } else {
                        if (i16 >= 0) {
                            Substring = str.substring(i16, i15 + 1);
                        }
                        z10 = true;
                        i16 = -1;
                    }
                }
                i15++;
                Substring = Substring;
                r19 = r19;
            }
            Substring = cookie2;
            i11++;
            obj = objAdd;
            i12 = i14;
            cookie = null;
        }
        Cookie[] cookieArr = (Cookie[]) LazyList.toArray(obj, Cookie.class);
        this.f66874a = cookieArr;
        this.f66875b = cookieArr;
    }
}
