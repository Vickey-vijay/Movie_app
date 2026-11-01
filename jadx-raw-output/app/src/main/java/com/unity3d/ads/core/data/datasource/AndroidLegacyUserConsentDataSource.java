package com.unity3d.ads.core.data.datasource;

import ck.p;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import org.json.JSONObject;

/* JADX INFO: compiled from: AndroidLegacyUserConsentDataSource.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidLegacyUserConsentDataSource implements LegacyUserConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage privateStorage;

    public AndroidLegacyUserConsentDataSource(FlattenerRulesUseCase flattenerRulesUseCase, JsonStorage jsonStorage) {
        p.j(flattenerRulesUseCase, "flattenerRulesUseCase");
        p.j(jsonStorage, "privateStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.privateStorage = jsonStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource
    public String getPrivacyData() {
        JSONObject jSONObjectFlattenJson;
        JSONObject data = this.privateStorage.getData();
        if (data == null || (jSONObjectFlattenJson = new JsonFlattener(data).flattenJson(".", this.flattenerRulesUseCase.invoke())) == null) {
            return null;
        }
        return jSONObjectFlattenJson.toString();
    }
}
