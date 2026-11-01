package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bv1 f79749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f79750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f79751c;

    public static String a(String str) {
        return "[Integration] " + str;
    }

    static {
        bv1 bv1Var = bv1.f75973b;
        f79749a = av1.a();
        f79750b = "YandexAds";
        f79751c = true;
    }

    public static final void a(String str, Object... objArr) {
        boolean z10;
        if (!f79751c) {
            synchronized (eu1.f77192a) {
                z10 = eu1.f77193b;
            }
            if (!z10) {
                return;
            }
        }
        ck.w wVar = ck.w.f6066a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        ck.p.i(str2, "format(...)");
        String strA = a(str2);
        if (f79751c) {
            Log.e(f79750b, strA);
        }
        if (eu1.f77193b) {
            f79749a.a(du1.f76798d, f79750b, strA);
        }
    }

    public static final void b(String str, Object... objArr) {
        boolean z10;
        if (!f79751c) {
            synchronized (eu1.f77192a) {
                z10 = eu1.f77193b;
            }
            if (!z10) {
                return;
            }
        }
        ck.w wVar = ck.w.f6066a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        ck.p.i(str2, "format(...)");
        String strA = a(str2);
        if (f79751c) {
            Log.i(f79750b, strA);
        }
        if (eu1.f77193b) {
            f79749a.a(du1.f76796b, f79750b, strA);
        }
    }

    public static final void c(String str, Object... objArr) {
        boolean z10;
        if (!f79751c) {
            synchronized (eu1.f77192a) {
                z10 = eu1.f77193b;
            }
            if (!z10) {
                return;
            }
        }
        ck.w wVar = ck.w.f6066a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        ck.p.i(str2, "format(...)");
        String strA = a(str2);
        if (f79751c) {
            Log.w(f79750b, strA);
        }
        if (eu1.f77193b) {
            f79749a.a(du1.f76797c, f79750b, strA);
        }
    }
}
