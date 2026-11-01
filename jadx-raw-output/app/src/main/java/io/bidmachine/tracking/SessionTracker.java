package io.bidmachine.tracking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes2.dex */
public interface SessionTracker extends EventTracker {
    void clearTrackingEvent(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType);

    void clearTrackingEvents(@NonNull TrackingObject trackingObject);

    @Override // io.bidmachine.tracking.EventTracker
    /* synthetic */ void trackEvent(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo, @Nullable AdsType adsType, @Nullable BMError bMError, @Nullable EventData eventData);

    void trackEventFinish(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable BMError bMError, @Nullable EventData eventData);

    void trackEventStart(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo);
}
