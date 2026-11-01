package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class E4 implements InterfaceC3172s4 {
    @Override // com.inmobi.media.InterfaceC3172s4
    public final void a(Config config) {
        ck.p.j(config, "config");
        synchronized (this) {
            K4 k10 = K4.f22996a;
            ck.p.i("K4", "access$getTAG$p(...)");
            K4 k11 = K4.f22996a;
            String str = K4.f23001f;
            List<String> skipFields = K4.c().getContextualData().getSkipFields();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(L4.f23049j);
            arrayList.removeAll(skipFields);
            String strP0 = nj.b0.p0(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
            K4.f23001f = strP0;
            if (!ck.p.e(strP0, str)) {
                k11.f();
            }
            K4.a();
            mj.r rVar = mj.r.f64562a;
        }
    }
}
