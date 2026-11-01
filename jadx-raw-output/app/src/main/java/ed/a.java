package ed;

import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: compiled from: BubbleUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Properties f52569a = new Properties();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f52570b;

    public static int a(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static int c(int i10) {
        return (int) TypedValue.applyDimension(2, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static boolean b() throws Throwable {
        Boolean bool = f52570b;
        if (bool != null) {
            return bool.booleanValue();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                if (Build.VERSION.SDK_INT < 26) {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                        try {
                            f52569a.load(fileInputStream2);
                            fileInputStream2.close();
                        } catch (IOException e10) {
                            e = e10;
                            fileInputStream = fileInputStream2;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            f52570b = Boolean.valueOf(f52569a.containsKey("ro.miui.ui.version.name"));
                            return f52570b.booleanValue();
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e11) {
                                    e11.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e12) {
                        e = e12;
                    }
                    f52570b = Boolean.valueOf(f52569a.containsKey("ro.miui.ui.version.name"));
                } else {
                    try {
                        boolean z10 = true;
                        if (TextUtils.isEmpty((String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.miui.ui.version.name"))) {
                            z10 = false;
                        }
                        f52570b = Boolean.valueOf(z10);
                    } catch (Exception unused) {
                        f52570b = Boolean.FALSE;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        }
        return f52570b.booleanValue();
    }
}
