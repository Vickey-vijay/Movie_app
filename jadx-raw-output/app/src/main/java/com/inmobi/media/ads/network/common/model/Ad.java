package com.inmobi.media.ads.network.common.model;

import androidx.annotation.Keep;
import ck.p;
import com.inmobi.media.A8;
import com.inmobi.media.Gg;
import com.inmobi.media.Hg;
import com.inmobi.media.O0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Keep
public final class Ad {

    @A8
    private O0 _features;

    @A8
    private Gg _pubContent;
    private final AdQualityControl adQualityControl;
    private final boolean allowAutoRedirection;
    private final String baseEventUrl;
    private final String bidBundle;
    private final ContextData contextData;

    @A8
    private long expiryTimestampInMillis;
    private final MetaInfo metaInfo;

    /* JADX INFO: renamed from: sf, reason: collision with root package name */
    private final String f23991sf;

    @A8
    private long insertionTimestampInMillis = System.currentTimeMillis();
    private String markupType = "unknown";
    private final String tracking = "unknown";
    private Long expiry = -1L;
    private final String creativeId = "";
    private final String impressionId = "";
    private final String telemetryMetadataBlob = "";
    private final List<Viewability> viewability = new ArrayList();
    private final JSONObject transaction = new JSONObject();
    private final Map<String, String> rewards = new HashMap();
    private String webVast = "";
    private final List<Trackers> trackers = new ArrayList();
    private final List<TrackingInfo> trackingInfo = new ArrayList();
    private final String pubContent = "";

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getTracking$annotations() {
    }

    public final AdQualityControl getAdQualityControl() {
        return this.adQualityControl;
    }

    public final boolean getAllowAutoRedirection() {
        return this.allowAutoRedirection;
    }

    public final String getBaseEventUrl() {
        return this.baseEventUrl;
    }

    public final String getBidBundle() {
        return this.bidBundle;
    }

    public final ContextData getContextData() {
        return this.contextData;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final Long getExpiry() {
        return this.expiry;
    }

    public final long getExpiryTimestampInMillis() {
        return this.expiryTimestampInMillis;
    }

    public final O0 getFeatures() {
        O0 o10 = this._features;
        if (o10 != null) {
            return o10;
        }
        String str = this.f23991sf;
        if (str == null) {
            return null;
        }
        O0 o11 = new O0(str);
        this._features = o11;
        return o11;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final long getInsertionTimestampInMillis() {
        return this.insertionTimestampInMillis;
    }

    public final String getMarkupType() {
        return this.markupType;
    }

    public final MetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    public final Gg getPubContent() throws IllegalStateException {
        Gg gg2 = this._pubContent;
        if (gg2 != null) {
            return gg2;
        }
        Gg ggA = Hg.a(this.pubContent, this.markupType);
        this._pubContent = ggA;
        return ggA;
    }

    public final Map<String, String> getRewards() {
        return this.rewards;
    }

    public final String getTelemetryMetadataBlob() {
        return this.telemetryMetadataBlob;
    }

    public final List<Trackers> getTrackers$media_release() {
        return this.trackers;
    }

    public final String getTracking() {
        return this.tracking;
    }

    public final List<TrackingInfo> getTrackingInfo$media_release() {
        return this.trackingInfo;
    }

    public final JSONObject getTransaction() {
        return this.transaction;
    }

    public final List<Viewability> getViewability() {
        return this.viewability;
    }

    public final String getWebVast() {
        return this.webVast;
    }

    public final void setExpiryTimestampInMillis(long j10) {
        this.expiryTimestampInMillis = j10;
    }

    public final void setInsertionTimestampInMillis(long j10) {
        this.insertionTimestampInMillis = j10;
    }

    public final void setWebVast(String str) {
        p.j(str, "<set-?>");
        this.webVast = str;
    }
}
