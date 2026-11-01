package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import mj.r;
import org.json.JSONObject;
import rj.c;

/* JADX INFO: compiled from: OmInteraction.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface OmInteraction {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String OMID_CREATIVE_TYPE = "creativeType";
    public static final String OMID_CUSTOM_REFERENCE_DATA = "customReferenceData";
    public static final String OMID_IMPRESSION_OWNER = "impressionOwner";
    public static final String OMID_IMPRESSION_TYPE = "impressionType";
    public static final String OMID_ISOLATE_VERIFICATION_SCRIPTS = "isolateVerificationScripts";
    public static final String OMID_MEDIA_EVENTS_OWNER = "mediaEventsOwner";
    public static final String OMID_VIDEO_EVENTS_OWNER = "videoEventsOwner";

    /* JADX INFO: compiled from: OmInteraction.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String OMID_CREATIVE_TYPE = "creativeType";
        public static final String OMID_CUSTOM_REFERENCE_DATA = "customReferenceData";
        public static final String OMID_IMPRESSION_OWNER = "impressionOwner";
        public static final String OMID_IMPRESSION_TYPE = "impressionType";
        public static final String OMID_ISOLATE_VERIFICATION_SCRIPTS = "isolateVerificationScripts";
        public static final String OMID_MEDIA_EVENTS_OWNER = "mediaEventsOwner";
        public static final String OMID_VIDEO_EVENTS_OWNER = "videoEventsOwner";

        private Companion() {
        }
    }

    OmidOptions getOMidOptions(JSONObject jSONObject);

    WebView getWebview(AdObject adObject);

    Object invoke(AdObject adObject, JSONObject jSONObject, c<? super r> cVar);
}
