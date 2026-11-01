package com.unity3d.ads.core.configuration;

import ck.p;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import org.json.JSONException;
import org.json.JSONObject;
import qk.l;
import qk.v;

/* JADX INFO: compiled from: CommonAlternativeFlowReader.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CommonAlternativeFlowReader implements AlternativeFlowReader {
    private final ConfigurationReader configurationReader;
    private final l<Boolean> isAlternativeFlowEnabled;
    private final l<Boolean> isAlternativeFlowRead;
    private final MediationTraitsMetadataReader mediationMetadataReader;
    private final SessionRepository sessionRepository;

    public CommonAlternativeFlowReader(ConfigurationReader configurationReader, SessionRepository sessionRepository, MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        p.j(configurationReader, "configurationReader");
        p.j(sessionRepository, "sessionRepository");
        p.j(mediationTraitsMetadataReader, "mediationMetadataReader");
        this.configurationReader = configurationReader;
        this.sessionRepository = sessionRepository;
        this.mediationMetadataReader = mediationTraitsMetadataReader;
        this.isAlternativeFlowRead = v.a(Boolean.FALSE);
        this.isAlternativeFlowEnabled = v.a(Boolean.TRUE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    @Override // com.unity3d.ads.core.configuration.AlternativeFlowReader
    public boolean invoke() throws JSONException {
        if (this.isAlternativeFlowRead.getValue().booleanValue()) {
            return this.isAlternativeFlowEnabled.getValue().booleanValue();
        }
        MediationTraitsMetadataReader mediationTraitsMetadataReader = this.mediationMetadataReader;
        Object obj = mediationTraitsMetadataReader.getJsonStorage().get(mediationTraitsMetadataReader.getKey());
        if (obj != null) {
            p.i(obj, "get(key)");
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
        } else {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.has(MediationTraitsMetadataReader.BOLD_SDK_ENABLED) ? jSONObject : null;
            if (jSONObject2 != null) {
                this.isAlternativeFlowEnabled.setValue(Boolean.valueOf(jSONObject2.optBoolean(MediationTraitsMetadataReader.BOLD_SDK_ENABLED)));
                this.isAlternativeFlowRead.setValue(Boolean.TRUE);
            }
        }
        if (!this.isAlternativeFlowRead.getValue().booleanValue()) {
            if (this.configurationReader.getCurrentConfiguration().getExperiments().isBoldSdkNextSessionEnabled()) {
                this.isAlternativeFlowEnabled.setValue(Boolean.valueOf(this.sessionRepository.getNativeConfiguration().getFeatureFlags().getBoldSdkNextSessionEnabled()));
            } else {
                this.isAlternativeFlowEnabled.setValue(Boolean.FALSE);
            }
            this.isAlternativeFlowRead.setValue(Boolean.TRUE);
        }
        return this.isAlternativeFlowEnabled.getValue().booleanValue();
    }
}
