package yads;

import com.yandex.mobile.ads.common.AdTheme;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class ip2 {
    public static gp2 a(AdTheme adTheme) {
        int i10 = hp2.f78296a[adTheme.ordinal()];
        if (i10 == 1) {
            return gp2.f77902d;
        }
        if (i10 == 2) {
            return gp2.f77901c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
