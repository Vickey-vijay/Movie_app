package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4317ka implements Wb {
    @Override // io.appmetrica.analytics.impl.Wb
    public final C4058a9 a(C4288j7 c4288j7) {
        C4058a9 c4058a9 = null;
        if ((c4288j7 != null ? c4288j7.f56996b : null) != null && c4288j7.f56997c != null) {
            c4058a9 = new C4058a9();
            c4058a9.f56336b = c4288j7.f56996b.doubleValue();
            c4058a9.f56335a = c4288j7.f56997c.doubleValue();
            Integer num = c4288j7.f56998d;
            if (num != null) {
                c4058a9.f56341g = num.intValue();
            }
            Integer num2 = c4288j7.f56999e;
            if (num2 != null) {
                c4058a9.f56339e = num2.intValue();
            }
            Integer num3 = c4288j7.f57000f;
            if (num3 != null) {
                c4058a9.f56338d = num3.intValue();
            }
            Integer num4 = c4288j7.f57001g;
            if (num4 != null) {
                c4058a9.f56340f = num4.intValue();
            }
            Long l10 = c4288j7.f57002h;
            if (l10 != null) {
                c4058a9.f56337c = TimeUnit.MILLISECONDS.toSeconds(l10.longValue());
            }
            String str = c4288j7.f57003i;
            if (str != null) {
                if (ck.p.e(str, "gps")) {
                    c4058a9.f56342h = 1;
                } else if (ck.p.e(str, "network")) {
                    c4058a9.f56342h = 2;
                }
            }
            String str2 = c4288j7.f57004j;
            if (str2 != null) {
                c4058a9.f56343i = str2;
            }
        }
        return c4058a9;
    }
}
