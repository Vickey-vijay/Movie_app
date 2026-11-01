package o8;

/* JADX INFO: compiled from: ValueOf.java */
/* JADX INFO: loaded from: classes6.dex */
public class s {
    public static double a(Object obj) {
        return b(obj, 0);
    }

    public static int c(Object obj) {
        return d(obj, 0);
    }

    public static double b(Object obj, int i10) {
        if (obj == null) {
            return i10;
        }
        try {
            return Double.parseDouble(obj.toString().trim());
        } catch (Exception unused) {
            return i10;
        }
    }

    public static int d(Object obj, int i10) {
        if (obj == null) {
            return i10;
        }
        try {
            String strTrim = obj.toString().trim();
            return strTrim.contains(".") ? Integer.parseInt(strTrim.substring(0, strTrim.lastIndexOf("."))) : Integer.parseInt(strTrim);
        } catch (Exception unused) {
            return i10;
        }
    }

    public static long e(Object obj) {
        return f(obj, 0L);
    }

    public static long f(Object obj, long j10) {
        if (obj == null) {
            return j10;
        }
        try {
            String strTrim = obj.toString().trim();
            return strTrim.contains(".") ? Long.parseLong(strTrim.substring(0, strTrim.lastIndexOf("."))) : Long.parseLong(strTrim);
        } catch (Exception unused) {
            return j10;
        }
    }

    public static String g(Object obj) {
        try {
            return obj.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
