package com.unity3d.ads.core.domain.privacy;

import com.inmobi.sdk.InMobiSdk;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import nj.r;
import nj.s;

/* JADX INFO: compiled from: DeveloperConsentFlattenerRulesUseCase.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DeveloperConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(s.q("privacy", InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, "pipl", "user"), r.e("value"), s.q("ts"));
    }
}
