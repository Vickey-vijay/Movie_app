package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public abstract class fl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bv1 f77435a;

    static {
        bv1 bv1Var = bv1.f75973b;
        f77435a = av1.a();
    }

    public static void a(String str, Object... objArr) {
        boolean z10;
        if (!ad1.f75480a) {
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
        if (ad1.f75480a) {
            Log.w("Yandex Mobile Ads", str2);
        }
        if (eu1.f77193b) {
            f77435a.a(du1.f76797c, "Yandex Mobile Ads", str2);
        }
    }
}
