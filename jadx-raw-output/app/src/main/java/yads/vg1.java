package yads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vg1 {
    public static final List a(rg1 rg1Var) {
        List listN0;
        String strC = ((tg1) rg1Var).c("SdkConfigurationFallbackHosts");
        if (strC == null || (listN0 = lk.a0.N0(strC, new String[]{StringUtils.COMMA}, false, 0, 6, null)) == null) {
            return null;
        }
        return listN0;
    }

    public static final void a(rg1 rg1Var, String str, List list) {
        String strP0 = null;
        if (list != null) {
            List list2 = list.isEmpty() ^ true ? list : null;
            if (list2 != null) {
                strP0 = nj.b0.p0(list2, StringUtils.COMMA, null, null, 0, null, null, 62, null);
            }
        }
        ((tg1) rg1Var).a(str, strP0);
    }
}
