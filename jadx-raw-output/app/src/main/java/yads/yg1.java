package yads;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class yg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wg1 f84950a = new wg1();

    public final String a(Context context) {
        Object objM3458constructorimpl;
        String strA;
        try {
            Result.a aVar = Result.Companion;
            if (Build.VERSION.SDK_INT >= 33) {
                Object systemService = context.getSystemService(CommonUrlParts.LOCALE);
                ck.p.h(systemService, "null cannot be cast to non-null type android.app.LocaleManager");
                LocaleList applicationLocales = ((LocaleManager) systemService).getApplicationLocales();
                if (applicationLocales.isEmpty()) {
                    Locale locale = context.getResources().getConfiguration().locale;
                    this.f84950a.getClass();
                    strA = wg1.a(locale);
                } else {
                    wg1 wg1Var = this.f84950a;
                    Locale locale2 = applicationLocales.get(0);
                    wg1Var.getClass();
                    strA = wg1.a(locale2);
                }
            } else {
                Locale locale3 = context.getResources().getConfiguration().locale;
                this.f84950a.getClass();
                strA = wg1.a(locale3);
            }
            objM3458constructorimpl = Result.m3458constructorimpl(strA);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (String) objM3458constructorimpl;
    }

    public final List b(Context context) {
        try {
            Result.a aVar = Result.Companion;
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            List listC = nj.r.c();
            int size = locales.size();
            for (int i10 = 0; i10 < size; i10++) {
                wg1 wg1Var = this.f84950a;
                Locale locale = locales.get(i10);
                wg1Var.getClass();
                listC.add(wg1.a(locale));
            }
            return nj.r.a(listC);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Object objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                objM3458constructorimpl = null;
            }
            return (List) objM3458constructorimpl;
        }
    }
}
