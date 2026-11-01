package com.mbridge.msdk.thrid.okhttp;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Headers.java */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f37911a;

    public String a(int i10) {
        return this.f37911a[i10 * 2];
    }

    public String b(String str) {
        return a(this.f37911a, str);
    }

    /* JADX INFO: compiled from: Headers.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f37912a = new ArrayList(20);

        public a a(String str) {
            int iIndexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER, 1);
            if (iIndexOf != -1) {
                return b(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
            }
            return str.startsWith(StringUtils.PROCESS_POSTFIX_DELIMITER) ? b("", str.substring(1)) : b("", str);
        }

        public a b(String str, String str2) {
            this.f37912a.add(str);
            this.f37912a.add(str2.trim());
            return this;
        }

        public a b(String str) {
            int i10 = 0;
            while (i10 < this.f37912a.size()) {
                if (str.equalsIgnoreCase(this.f37912a.get(i10))) {
                    this.f37912a.remove(i10);
                    this.f37912a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public a c(String str, String str2) {
            r.a(str);
            r.a(str2, str);
            b(str);
            b(str, str2);
            return this;
        }

        public a a(String str, String str2) {
            r.a(str);
            r.a(str2, str);
            return b(str, str2);
        }

        public r a() {
            return new r(this);
        }
    }

    public a a() {
        a aVar = new a();
        Collections.addAll(aVar.f37912a, this.f37911a);
        return aVar;
    }

    public int b() {
        return this.f37911a.length / 2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && Arrays.equals(((r) obj).f37911a, this.f37911a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f37911a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int iB = b();
        for (int i10 = 0; i10 < iB; i10++) {
            sb2.append(a(i10));
            sb2.append(": ");
            sb2.append(b(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public r(a aVar) {
        List<String> list = aVar.f37912a;
        this.f37911a = (String[]) list.toArray(new String[list.size()]);
    }

    public String b(int i10) {
        return this.f37911a[(i10 * 2) + 1];
    }

    public List<String> c(String str) {
        int iB = b();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < iB; i10++) {
            if (str.equalsIgnoreCase(a(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i10));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static void a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt <= ' ' || cCharAt >= 127) {
                        throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    public static void a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }
}
