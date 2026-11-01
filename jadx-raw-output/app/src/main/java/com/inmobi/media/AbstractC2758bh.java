package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.inmobi.media.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2758bh {
    public static final void a(AbstractC2732ah abstractC2732ah) {
        ck.p.j(abstractC2732ah, "telemetryType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (abstractC2732ah instanceof Xg) {
            linkedHashMap.put("trigger", ((Xg) abstractC2732ah).f23803a);
            Wj wj2 = Wj.f23753a;
            Wj.b("BillingClientConnectionError", linkedHashMap, EnumC2735ak.SDK);
        } else if (abstractC2732ah instanceof Yg) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(((Yg) abstractC2732ah).f23854a));
            Wj wj3 = Wj.f23753a;
            Wj.b("IAPFetchFailed", linkedHashMap, EnumC2735ak.SDK);
        } else {
            if (!(abstractC2732ah instanceof Zg)) {
                throw new NoWhenBranchMatchedException();
            }
            Wj wj4 = Wj.f23753a;
            Wj.b("IAPFetchSuccess", linkedHashMap, EnumC2735ak.SDK);
        }
    }
}
