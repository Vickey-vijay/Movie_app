package e8;

import android.os.Build;
import android.text.TextUtils;
import com.ironsource.Z7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import o8.s;

/* JADX INFO: compiled from: RomUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f52457a = {"samsung"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Integer f52458b;

    public static String f() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th2;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.miui.ui.version.code").getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                return line;
            } catch (IOException unused) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                throw th2;
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th4) {
            bufferedReader = null;
            th2 = th4;
        }
    }

    public static boolean g() {
        return true;
    }

    public static boolean j(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static String a() {
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static int b() {
        String str = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || !str.contains("Flyme")) {
            return 0;
        }
        return l(str.replaceAll("Flyme", "").replaceAll("OS", "").replaceAll(Z7.f27998r, "").substring(0, 1));
    }

    public static int c() {
        Integer num = f52458b;
        if (num != null) {
            return num.intValue();
        }
        if (i()) {
            Integer num2 = 1;
            f52458b = num2;
            return num2.intValue();
        }
        if (h()) {
            Integer num3 = 2;
            f52458b = num3;
            return num3.intValue();
        }
        if (g()) {
            Integer num4 = 3;
            f52458b = num4;
            return num4.intValue();
        }
        Integer num5 = 4;
        f52458b = num5;
        return num5.intValue();
    }

    public static String e() {
        try {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static int l(String str) {
        if (Pattern.compile("^[-\\+]?[\\d]+$").matcher(str).matches()) {
            return s.c(str);
        }
        return 0;
    }

    public static int d() throws Throwable {
        String strF = f();
        if (!TextUtils.isEmpty(strF)) {
            try {
                return s.c(strF);
            } catch (Exception e10) {
                e10.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public static boolean h() {
        if (b() >= 4) {
            return true;
        }
        return false;
    }

    public static boolean i() throws Throwable {
        String strF = f();
        if (!TextUtils.isEmpty(strF)) {
            try {
                if (s.c(strF) >= 4) {
                    return true;
                }
                return false;
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean k() {
        return j(a(), e(), f52457a);
    }
}
