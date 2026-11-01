package com.inmobi.unifiedId;

import androidx.annotation.UiThread;
import com.inmobi.media.E9;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface InMobiUnifiedIdInterface {
    public static final E9 Companion = E9.f22575a;
    public static final String NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT = "Fetching the unifiedIds from ID Service has failed and there are no unified ids present in cache";
    public static final String NO_LOCAL_DATA_PRESENT = "No local data present";
    public static final String PUSH_NEEDS_TO_BE_CALLED_FIRST = "Push api needs to called prior to fetch";
    public static final String UNIFIED_SERVICE_IS_NOT_ENABLED = "UnifiedId Service not enabled, please connect with your respective partner manager";
    public static final String USER_HAS_AGE_RESTRICTION = "User has age restriction";
    public static final String USER_HAS_OPTED_OUT = "User has opted out for tracking";

    @UiThread
    void onFetchCompleted(JSONObject jSONObject, Error error);
}
