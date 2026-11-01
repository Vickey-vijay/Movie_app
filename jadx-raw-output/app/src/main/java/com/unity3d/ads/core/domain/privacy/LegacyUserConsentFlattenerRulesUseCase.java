package com.unity3d.ads.core.domain.privacy;

import com.unity3d.services.core.misc.JsonFlattenerRules;
import nj.r;
import nj.s;

/* JADX INFO: compiled from: LegacyUserConsentFlattenerRulesUseCase.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LegacyUserConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(s.q("privacy", "unity", "pipl"), r.e("value"), s.q("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }
}
