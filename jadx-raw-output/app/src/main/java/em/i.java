package em;

import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: compiled from: OSUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class i {

    /* JADX INFO: compiled from: OSUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Properties f52674a;

        public static a c() throws IOException {
            return new a();
        }

        public boolean a(Object obj) {
            return this.f52674a.containsKey(obj);
        }

        public String b(String str) {
            return this.f52674a.getProperty(str);
        }

        public a() throws IOException {
            Properties properties = new Properties();
            this.f52674a = properties;
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
        }
    }

    public static boolean c(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            try {
                a aVarC = a.c();
                for (String str : strArr) {
                    if (aVarC.b(str) != null) {
                        return true;
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static boolean a() {
        if (c("persist.sys.use.flyme.icon", "ro.meizu.setupwizard.flyme", "ro.flyme.published")) {
            return true;
        }
        try {
            a aVarC = a.c();
            if (!aVarC.a("ro.build.display.id")) {
                return false;
            }
            String strB = aVarC.b("ro.build.display.id");
            return !TextUtils.isEmpty(strB) && strB.contains("Flyme");
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean b() {
        return c("ro.miui.ui.version.code", "ro.miui.ui.version.name", "ro.miui.internal.storage");
    }
}
