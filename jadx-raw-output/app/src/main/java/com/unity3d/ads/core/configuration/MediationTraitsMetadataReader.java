package com.unity3d.ads.core.configuration;

import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.unity3d.services.core.misc.JsonStorage;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: MediationTraitsMetadataReader.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class MediationTraitsMetadataReader extends MetadataReader<JSONObject> {
    public static final String BOLD_SDK_ENABLED = "boldSdkEnabled";
    public static final Companion Companion = new Companion(null);
    public static final String MEDIATION_TRAITS = "mediation.traits.value";
    public static final String USE_HTTP_CLIENT = "useHttpClient";

    /* JADX INFO: compiled from: MediationTraitsMetadataReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationTraitsMetadataReader(JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_TRAITS);
        p.j(jsonStorage, "jsonStorage");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public final Boolean getBooleanTrait(String str) throws JSONException {
        p.j(str, C3426d4.i.W);
        Object obj = getJsonStorage().get(getKey());
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
        if (jSONObject == null) {
            return null;
        }
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return Boolean.valueOf(jSONObject.optBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public final String getStringTrait(String str) throws JSONException {
        p.j(str, C3426d4.i.W);
        Object obj = getJsonStorage().get(getKey());
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
        if (jSONObject == null) {
            return null;
        }
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.optString(str);
        }
        return null;
    }
}
