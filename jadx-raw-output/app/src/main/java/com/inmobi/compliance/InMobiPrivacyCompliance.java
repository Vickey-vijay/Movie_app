package com.inmobi.compliance;

import ck.p;
import com.inmobi.media.X3;
import com.ironsource.mediationsdk.metadata.a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class InMobiPrivacyCompliance {
    public static final InMobiPrivacyCompliance INSTANCE = new InMobiPrivacyCompliance();

    public static final void setDoNotSell(boolean z10) {
        X3.f23778a.put(a.f29879a, z10 ? "1" : "0");
    }

    public static final void setUSPrivacyString(String str) {
        p.j(str, "privacyString");
        HashMap map = X3.f23778a;
        p.j(str, "privacyString");
        X3.f23778a.put("us_privacy", str);
    }
}
