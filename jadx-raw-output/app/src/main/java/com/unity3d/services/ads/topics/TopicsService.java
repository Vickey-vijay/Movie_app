package com.unity3d.services.ads.topics;

import android.adservices.AdServicesState;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.ext.SdkExtensions;
import ck.p;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import nk.l1;

/* JADX INFO: compiled from: TopicsService.kt */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"NewApi", "MissingPermission"})
public final class TopicsService {
    private final ISDKDispatchers dispatchers;
    private final IEventSender eventSender;
    private final TopicsManager topicsManager;

    public TopicsService(Context context, ISDKDispatchers iSDKDispatchers, IEventSender iEventSender) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(iSDKDispatchers, "dispatchers");
        p.j(iEventSender, "eventSender");
        this.dispatchers = iSDKDispatchers;
        this.eventSender = iEventSender;
        this.topicsManager = getTopicsManager(context);
    }

    public final void getTopics(String str, boolean z10) {
        p.j(str, "adsSdkName");
        TopicsReceiver topicsReceiver = new TopicsReceiver(this.eventSender);
        GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName(str).setShouldRecordObservation(z10).build();
        p.i(getTopicsRequestBuild, "Builder().setAdsSdkName(…ecordObservation).build()");
        try {
            TopicsManager topicsManager = this.topicsManager;
            if (topicsManager != null) {
                topicsManager.getTopics(getTopicsRequestBuild, l1.a(this.dispatchers.getDefault()), topicsReceiver);
            }
        } catch (Exception e10) {
            this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, e10.toString());
            DeviceLog.debug("Failed to get topics with error: " + e10);
        }
    }

    private final TopicsManager getTopicsManager(Context context) {
        if (Device.getApiLevel() < 33 || SdkExtensions.getExtensionVersion(1000000) < 4) {
            return null;
        }
        return (TopicsManager) context.getSystemService(TopicsManager.class);
    }

    public final TopicsStatus checkAvailability() {
        if (Device.getApiLevel() < 33) {
            return TopicsStatus.ERROR_API_BELOW_33;
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return TopicsStatus.ERROR_EXTENSION_BELOW_4;
        }
        if (this.topicsManager == null) {
            return TopicsStatus.ERROR_TOPICSMANAGER_NULL;
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return TopicsStatus.ERROR_AD_SERVICES_DISABLED;
        }
        return TopicsStatus.TOPICS_AVAILABLE;
    }
}
