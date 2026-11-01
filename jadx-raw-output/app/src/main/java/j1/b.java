package j1;

import android.annotation.SuppressLint;
import android.util.Log;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f61689a = a();

    /* JADX INFO: compiled from: Platform.java */
    public static class a extends b {
        @Override // j1.b
        public void d(String str) {
            Log.w("XLog", str);
        }

        @Override // j1.b
        public String c() {
            return System.lineSeparator();
        }
    }

    public static b a() {
        try {
            Class.forName("android.os.Build");
            return new a();
        } catch (ClassNotFoundException unused) {
            return new b();
        }
    }

    public static b b() {
        return f61689a;
    }

    public void d(String str) {
        System.out.println(str);
    }

    @SuppressLint({"NewApi"})
    public String c() {
        return System.lineSeparator();
    }
}
