package sa;

import java.util.ArrayList;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: compiled from: CacheDataUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class g {
    public static <T> List<T> d(String str, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        try {
            String strD = za.h.d(BaseApplication.getInstance());
            return !em.o.b(strD) ? ya.a.e(BaseApplication.getInstance()).c(strD).b(str, cls) : arrayList;
        } catch (Exception unused) {
            return arrayList;
        }
    }

    public static boolean a(String str) {
        if (l0.a(str, l0.c()) > 600000) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        if (l0.a(str, l0.c()) > 21600000) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        return o0.c0();
    }

    public static void e() {
        o0.v0(l0.c());
    }

    public static <T> void f(String str, List<T> list) {
        try {
            String strD = za.h.d(BaseApplication.getInstance());
            if (!em.o.b(strD)) {
                ya.a.e(BaseApplication.getInstance()).c(strD).d(str, list);
            }
        } catch (Exception unused) {
        }
    }

    public static void g() {
        o0.G0(l0.c());
    }

    public static void h(boolean z10) {
        o0.H0(z10);
    }
}
