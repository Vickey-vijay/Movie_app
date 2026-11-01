package yads;

import android.webkit.WebView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class yn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cj2 f85075a;

    public final void a() {
        String strA = this.f85075a.a();
        String strU0 = strA != null ? lk.a0.U0(strA, StringUtils.PROCESS_POSTFIX_DELIMITER, "") : null;
        if (strU0 == null || strU0.length() <= 0) {
            return;
        }
        try {
            WebView.setDataDirectorySuffix(strU0);
        } catch (Throwable unused) {
        }
    }

    public yn3(cj2 cj2Var) {
        this.f85075a = cj2Var;
    }
}
