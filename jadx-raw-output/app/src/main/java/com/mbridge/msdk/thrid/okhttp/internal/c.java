package com.mbridge.msdk.thrid.okhttp.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.ironsource.C3426d4;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.thrid.okio.e;
import com.mbridge.msdk.thrid.okio.f;
import com.mbridge.msdk.thrid.okio.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f37505a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f37507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f37508d;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Method f37522r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f37523s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f37506b = new String[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final f f37509e = f.a("efbbbf");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f37510f = f.a("feff");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f37511g = f.a("fffe");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final f f37512h = f.a("0000ffff");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final f f37513i = f.a("ffff0000");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Charset f37514j = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Charset f37515k = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Charset f37516l = Charset.forName("UTF-16BE");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Charset f37517m = Charset.forName("UTF-16LE");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Charset f37518n = Charset.forName("UTF-32BE");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Charset f37519o = Charset.forName("UTF-32LE");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TimeZone f37520p = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Comparator<String> f37521q = new a();

    /* JADX INFO: compiled from: Util.java */
    public static class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f37524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f37525b;

        public b(String str, boolean z10) {
            this.f37524a = str;
            this.f37525b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f37524a);
            thread.setDaemon(this.f37525b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f37505a = bArr;
        Method declaredMethod = null;
        f37507c = b0.a(null, bArr);
        f37508d = z.a(null, bArr);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f37522r = declaredMethod;
        f37523s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static void a(Throwable th2, Throwable th3) {
        Method method = f37522r;
        if (method != null) {
            try {
                method.invoke(th2, th3);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static boolean b(s sVar, int i10, TimeUnit timeUnit) throws IOException {
        long jNanoTime = System.nanoTime();
        long jC = sVar.b().d() ? sVar.b().c() - jNanoTime : Long.MAX_VALUE;
        sVar.b().a(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
            while (sVar.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                cVar.k();
            }
            if (jC == Long.MAX_VALUE) {
                sVar.b().a();
            } else {
                sVar.b().a(jNanoTime + jC);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                sVar.b().a();
            } else {
                sVar.b().a(jNanoTime + jC);
            }
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                sVar.b().a();
            } else {
                sVar.b().a(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static int c(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static String d(String str, int i10, int i11) {
        int iB = b(str, i10, i11);
        return str.substring(iB, c(str, iB, i11));
    }

    /* JADX INFO: compiled from: Util.java */
    public static class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public static int c(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i10;
            }
        }
        return -1;
    }

    public static void a(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean d(String str) {
        return f37523s.matcher(str).matches();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!a(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                if (!"bio == null".equals(e11.getMessage())) {
                    throw e11;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(s sVar, int i10, TimeUnit timeUnit) {
        try {
            return b(sVar, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory a(String str, boolean z10) {
        return new b(str, z10);
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int b(String str, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    private static boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static r b(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        r.a aVar = new r.a();
        for (com.mbridge.msdk.thrid.okhttp.internal.http2.c cVar : list) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f37503a.a(aVar, cVar.f37663a.m(), cVar.f37664b.m());
        }
        return aVar.a();
    }

    public static String a(com.mbridge.msdk.thrid.okhttp.s sVar, boolean z10) {
        String strG;
        if (sVar.g().contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            strG = C3426d4.j.f28586d + sVar.g() + C3426d4.j.f28588e;
        } else {
            strG = sVar.g();
        }
        if (!z10 && sVar.j() == com.mbridge.msdk.thrid.okhttp.s.a(sVar.m())) {
            return strG;
        }
        return strG + StringUtils.PROCESS_POSTFIX_DELIMITER + sVar.j();
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static String[] a(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    public static int a(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int a(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static String a(String str) {
        InetAddress inetAddressA;
        if (str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            if (str.startsWith(C3426d4.j.f28586d) && str.endsWith(C3426d4.j.f28588e)) {
                inetAddressA = a(str, 1, str.length() - 1);
            } else {
                inetAddressA = a(str, 0, str.length());
            }
            if (inetAddressA == null) {
                return null;
            }
            byte[] address = inetAddressA.getAddress();
            if (address.length == 16) {
                return a(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty() || b(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset a(e eVar, Charset charset) throws IOException {
        f fVar = f37509e;
        if (eVar.a(0L, fVar)) {
            eVar.skip(fVar.j());
            return f37514j;
        }
        f fVar2 = f37510f;
        if (eVar.a(0L, fVar2)) {
            eVar.skip(fVar2.j());
            return f37516l;
        }
        f fVar3 = f37511g;
        if (eVar.a(0L, fVar3)) {
            eVar.skip(fVar3.j());
            return f37517m;
        }
        f fVar4 = f37512h;
        if (eVar.a(0L, fVar4)) {
            eVar.skip(fVar4.j());
            return f37518n;
        }
        f fVar5 = f37513i;
        if (!eVar.a(0L, fVar5)) {
            return charset;
        }
        eVar.skip(fVar5.j());
        return f37519o;
    }

    public static int a(String str, long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException(str + " < 0");
        }
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(j10);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            }
            if (millis != 0 || j10 <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(str + " too small.");
        }
        throw new NullPointerException("unit == null");
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a A[LOOP:1: B:30:0x004d->B:34:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0060 A[EDGE_INSN: B:59:0x0060->B:35:0x0060 BREAK  A[LOOP:1: B:30:0x004d->B:34:0x005a], SYNTHETIC] */
    private static InetAddress a(String str, int i10, int i11) {
        int i12;
        int i13;
        int iA;
        byte[] bArr = new byte[16];
        int i14 = -1;
        int i15 = -1;
        int i16 = 0;
        while (i10 < i11) {
            if (i16 == 16) {
                return null;
            }
            int i17 = i10 + 2;
            if (i17 <= i11 && str.regionMatches(i10, "::", 0, 2)) {
                if (i14 != -1) {
                    return null;
                }
                i16 += 2;
                i14 = i16;
                if (i17 == i11) {
                    break;
                }
                i15 = i17;
                i12 = 0;
                i10 = i15;
                while (i10 < i11) {
                    iA = a(str.charAt(i10));
                    if (iA == -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + iA;
                    i10++;
                }
                i13 = i10 - i15;
                if (i13 != 0) {
                }
                return null;
            }
            if (i16 != 0) {
                if (!str.regionMatches(i10, StringUtils.PROCESS_POSTFIX_DELIMITER, 0, 1)) {
                    if (!str.regionMatches(i10, ".", 0, 1) || !a(str, i15, i11, bArr, i16 - 2)) {
                        return null;
                    }
                    i16 += 2;
                    break;
                }
                i10++;
            }
            i15 = i10;
            i12 = 0;
            i10 = i15;
            while (i10 < i11) {
                iA = a(str.charAt(i10));
                if (iA == -1) {
                    break;
                }
                i12 = (i12 << 4) + iA;
                i10++;
            }
            i13 = i10 - i15;
            if (i13 != 0 || i13 > 4) {
                return null;
            }
            int i18 = i16 + 1;
            bArr[i16] = (byte) ((i12 >>> 8) & 255);
            i16 = i18 + 1;
            bArr[i18] = (byte) (i12 & 255);
        }
        if (i16 != 16) {
            if (i14 == -1) {
                return null;
            }
            int i19 = i16 - i14;
            System.arraycopy(bArr, i14, bArr, 16 - i19, i19);
            Arrays.fill(bArr, i14, (16 - i16) + i14, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    private static boolean a(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    private static String a(byte[] bArr) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i11 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        while (i10 < bArr.length) {
            if (i10 == i11) {
                cVar.writeByte(58);
                i10 += i13;
                if (i10 == 16) {
                    cVar.writeByte(58);
                }
            } else {
                if (i10 > 0) {
                    cVar.writeByte(58);
                }
                cVar.a(((bArr[i10] & 255) << 8) | (bArr[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return cVar.p();
    }

    public static X509TrustManager a() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e10) {
            throw a("No System TLS", (Exception) e10);
        }
    }
}
