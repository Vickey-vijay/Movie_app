package mn;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: ModelUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f64631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f64632b;

    public static String[] a(String str) {
        return b(str, true);
    }

    public static String g(Object[] objArr) {
        return h(objArr, true, false);
    }

    static {
        boolean z10 = true;
        boolean z11 = false;
        f64631a = Thread.currentThread().getContextClassLoader().loadClass("android.os.Build").getField("ID").get(null) != null;
        try {
            String str = (String) Thread.currentThread().getContextClassLoader().loadClass("android.os.Build").getField("PRODUCT").get(null);
            if (!"google_sdk".equals(str) && !"sdk".equals(str)) {
                z10 = false;
            }
            z11 = z10;
        } catch (Exception unused) {
        }
        f64632b = z11;
    }

    public static String[] b(String str, boolean z10) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (z10) {
            str = str.replaceAll("\\\\,", "XXX1122334455XXX");
        }
        String[] strArrSplit = str.split(StringUtils.COMMA);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String strReplaceAll = strArrSplit[i10].replaceAll("XXX1122334455XXX", StringUtils.COMMA);
            strArrSplit[i10] = strReplaceAll;
            strArrSplit[i10] = strReplaceAll.replaceAll("\\\\\\\\", "\\\\");
        }
        return strArrSplit;
    }

    public static long c(String str) {
        if (str.lastIndexOf(".") != -1) {
            str = str.substring(0, str.lastIndexOf("."));
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length == 3) {
            return (Long.parseLong(strArrSplit[0]) * 3600) + (Long.parseLong(strArrSplit[1]) * 60) + Long.parseLong(strArrSplit[2]);
        }
        throw new IllegalArgumentException("Can't parse time string: " + str);
    }

    public static boolean f(String str) {
        if (f64631a) {
            return (str == null || str.length() == 0) ? false : true;
        }
        return (str == null || str.length() == 0 || str.toLowerCase(Locale.ROOT).startsWith("xml") || !str.matches("[a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*")) ? false : true;
    }

    public static String h(Object[] objArr, boolean z10, boolean z11) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            String strReplaceAll = obj.toString().replaceAll("\\\\", "\\\\\\\\");
            if (z10) {
                strReplaceAll = strReplaceAll.replaceAll(StringUtils.COMMA, "\\\\,");
            }
            if (z11) {
                strReplaceAll = strReplaceAll.replaceAll("\"", "\\\"");
            }
            sb2.append(strReplaceAll);
            sb2.append(StringUtils.COMMA);
        }
        if (sb2.length() > 1) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public static String i(long j10) {
        long j11 = j10 / 3600;
        long j12 = j10 % 3600;
        long j13 = j12 / 60;
        long j14 = j12 % 60;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j11 < 10 ? "0" : "");
        sb2.append(j11);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(j13 < 10 ? "0" : "");
        sb2.append(j13);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(j14 >= 10 ? "" : "0");
        sb2.append(j14);
        return sb2.toString();
    }

    public static InetAddress d(String str) {
        try {
            return InetAddress.getByName(str);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static boolean e(Set<Class> set, Class cls) {
        if (cls.isEnum()) {
            return true;
        }
        Iterator<Class> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }
}
