package com.unity3d.services.core.configuration;

import com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class Experiments extends ExperimentsBase {
    private static final Set<String> NEXT_SESSION_FLAGS = new HashSet(Collections.singletonList(ExperimentsBase.TSI_TAG_NATIVE_TOKEN_AWAIT_PRIVACY));
    private final JSONObject _experimentData;

    public Experiments() {
        this(null);
    }

    public Experiments(JSONObject jSONObject) {
        if (jSONObject == null) {
            this._experimentData = new JSONObject();
        } else {
            this._experimentData = jSONObject;
        }
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getCurrentSessionExperiments() {
        if (this._experimentData == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = this._experimentData.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!NEXT_SESSION_FLAGS.contains(next)) {
                map.put(next, String.valueOf(this._experimentData.optBoolean(next)));
            }
        }
        return new JSONObject(map);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public Map<String, String> getExperimentTags() {
        HashMap map = new HashMap();
        Iterator<String> itKeys = this._experimentData.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, String.valueOf(this._experimentData.opt(next)));
        }
        return map;
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getExperimentsAsJson() {
        return this._experimentData;
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getNextSessionExperiments() {
        if (this._experimentData == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = this._experimentData.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (NEXT_SESSION_FLAGS.contains(next)) {
                map.put(next, String.valueOf(this._experimentData.optBoolean(next)));
            }
        }
        return new JSONObject(map);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public String getScarBiddingManager() {
        return this._experimentData.optString(ExperimentsBase.EXP_TAG_SCAR_BIDDING_MANAGER, ScarBiddingManagerType.DISABLED.getName());
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isBoldSdkNextSessionEnabled() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_IS_BOLD_NEXT_SESSION, true);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isCaptureHDRCapabilitiesEnabled() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_HDR_CAPABILITIES, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isJetpackLifecycle() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_JETPACK_LIFECYCLE, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeLoadTimeoutDisabled() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_LOAD_TIMEOUT_DISABLED, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeShowTimeoutDisabled() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_SHOW_TIMEOUT_DISABLED, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isOkHttpEnabled() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_OK_HTTP, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isPCCheckEnabled() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_IS_PC_CHECK_ENABLED, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isScarBannerHbEnabled() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_SCAR_HB_BN, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isScarInitEnabled() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_SCAR_INIT, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebAssetAdCaching() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_WEB_AD_ASSET_CACHING, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebGestureNotRequired() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_WEB_GESTURE_NOT_REQUIRED, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebMessageEnabled() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_WEB_MESSAGE, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebViewAsyncDownloadEnabled() {
        return this._experimentData.optBoolean(ExperimentsBase.EXP_TAG_WEBVIEW_ASYNC_DOWNLOAD, false);
    }

    @Override // com.unity3d.services.core.configuration.IExperiments
    public boolean shouldNativeTokenAwaitPrivacy() {
        return this._experimentData.optBoolean(ExperimentsBase.TSI_TAG_NATIVE_TOKEN_AWAIT_PRIVACY, false);
    }
}
