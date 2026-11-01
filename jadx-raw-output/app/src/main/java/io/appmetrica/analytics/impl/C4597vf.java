package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4597vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4497rf f57820a;

    public C4597vf(PreloadInfo preloadInfo, PublicLogger publicLogger, boolean z10) {
        if (preloadInfo != null) {
            if (TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new Object[0]);
            } else {
                this.f57820a = new C4497rf(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z10, T7.f55911c);
            }
        }
    }
}
