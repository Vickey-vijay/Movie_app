package a8;

import android.text.TextUtils;

/* JADX INFO: compiled from: PictureMimeType.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static String p() {
        return "image/bmp";
    }

    public static String q() {
        return "image/gif";
    }

    public static String r() {
        return "image/jpeg";
    }

    public static String s() {
        return "image/webp";
    }

    public static String t() {
        return "image/vnd.wap.wbmp";
    }

    public static String u() {
        return "image/x-ms-bmp";
    }

    public static String b(String str) {
        try {
            int iLastIndexOf = str.lastIndexOf("/");
            return iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1) : "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static boolean d(String str) {
        return str != null && str.startsWith("audio");
    }

    public static boolean f(String str) {
        return str != null && (str.equals("image/gif") || str.equals("image/GIF"));
    }

    public static boolean h(String str) {
        return str != null && str.startsWith("image");
    }

    public static boolean i(String str) {
        return str != null && str.startsWith("video");
    }

    public static boolean j(String str) {
        return str != null && str.equalsIgnoreCase("image/webp");
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        if (str.startsWith("video")) {
            return 2;
        }
        if (!str.startsWith("audio")) {
            return 1;
        }
        return 3;
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("content://");
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith(p()) && !str.startsWith(u()) && !str.startsWith(t())) {
            return false;
        }
        return true;
    }

    public static boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith("http") && !str.startsWith("https")) {
            return false;
        }
        return true;
    }

    public static boolean k(String str, String str2) {
        if (TextUtils.isEmpty(str) || a(str) == a(str2)) {
            return true;
        }
        return false;
    }

    public static boolean l(String str) {
        if (!str.toLowerCase().endsWith(".amr") && !str.toLowerCase().endsWith(".mp3")) {
            return false;
        }
        return true;
    }

    public static boolean m(String str) {
        return str.toLowerCase().endsWith(".gif");
    }

    public static boolean n(String str) {
        if (!str.toLowerCase().endsWith(".jpg") && !str.toLowerCase().endsWith(".jpeg") && !str.toLowerCase().endsWith(".png") && !str.toLowerCase().endsWith(".heic")) {
            return false;
        }
        return true;
    }

    public static boolean o(String str) {
        return str.toLowerCase().endsWith(".mp4");
    }
}
