package io.bidmachine.tracking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.utils.BMError;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class SessionTrackerImpl implements SessionTracker {

    @NonNull
    private final EventTracker eventTracker;

    @NonNull
    @VisibleForTesting
    public final Map<Object, Map<TrackEventType, TrackEventInfo>> trackEventInfoHolders = new ConcurrentHashMap();

    @Override // io.bidmachine.tracking.SessionTracker
    public void clearTrackingEvents(@NonNull TrackingObject trackingObject) {
        this.trackEventInfoHolders.remove(trackingObject.getTrackingKey());
    }

    @Override // io.bidmachine.tracking.SessionTracker, io.bidmachine.tracking.EventTracker
    public void trackEvent(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo, @Nullable AdsType adsType, @Nullable BMError bMError, @Nullable EventData eventData) {
        this.eventTracker.trackEvent(trackingObject, trackEventType, trackEventInfo, adsType, bMError, eventData);
    }

    public SessionTrackerImpl(@NonNull EventTracker eventTracker) {
        this.eventTracker = eventTracker;
    }

    @Override // io.bidmachine.tracking.SessionTracker
    public void clearTrackingEvent(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType) {
        Map<TrackEventType, TrackEventInfo> map = this.trackEventInfoHolders.get(trackingObject.getTrackingKey());
        if (map != null) {
            map.remove(trackEventType);
        }
    }

    @Override // io.bidmachine.tracking.SessionTracker
    public void trackEventFinish(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable BMError bMError, @Nullable EventData eventData) {
        TrackEventInfo trackEventInfo;
        Map<TrackEventType, TrackEventInfo> map = this.trackEventInfoHolders.get(trackingObject.getTrackingKey());
        if (map != null && map.containsKey(trackEventType)) {
            trackEventInfo = map.get(trackEventType);
            if (trackEventInfo != null) {
                trackEventInfo.setFinishTimeMs(System.currentTimeMillis());
            }
            map.remove(trackEventType);
            if (map.isEmpty()) {
                clearTrackingEvents(trackingObject);
            }
        } else {
            trackEventInfo = null;
        }
        trackEvent(trackingObject, trackEventType, trackEventInfo, adsType, bMError, eventData);
    }

    @Override // io.bidmachine.tracking.SessionTracker
    public void trackEventStart(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo) {
        Object trackingKey = trackingObject.getTrackingKey();
        Map<TrackEventType, TrackEventInfo> enumMap = this.trackEventInfoHolders.get(trackingKey);
        if (enumMap == null) {
            enumMap = new EnumMap<>(TrackEventType.class);
            this.trackEventInfoHolders.put(trackingKey, enumMap);
        }
        if (!enumMap.containsKey(trackEventType)) {
            if (trackEventInfo == null) {
                trackEventInfo = new TrackEventInfo();
            }
            enumMap.put(trackEventType, trackEventInfo);
        }
    }
}
