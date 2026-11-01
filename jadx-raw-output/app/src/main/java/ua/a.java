package ua;

import java.util.Map;

/* JADX INFO: compiled from: FloatWindow.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, b> f72795a;

    public static void a() {
        b("default_float_window_tag");
    }

    public static void b(String str) {
        Map<String, b> map = f72795a;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        f72795a.get(str).a();
        f72795a.remove(str);
    }
}
