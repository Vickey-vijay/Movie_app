package io.bidmachine.tracking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.utils.BMError;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class SessionTrackingObject extends TrackingObjectImpl {

    @NonNull
    private final SessionTracker sessionTracker;

    public SessionTrackingObject(@NonNull SessionTracker sessionTracker) {
        this(UUID.randomUUID(), sessionTracker);
    }

    @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    public /* bridge */ /* synthetic */ void eventStart(@NonNull TrackEventType trackEventType) {
        super.eventStart(trackEventType);
    }

    @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    public void eventStart(@NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo) {
        this.sessionTracker.trackEventStart(this, trackEventType, trackEventInfo);
    }

    public SessionTrackingObject(@NonNull Object obj, @NonNull SessionTracker sessionTracker) {
        super(obj);
        this.sessionTracker = sessionTracker;
    }

    @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    public void clear() {
        this.sessionTracker.clearTrackingEvents(this);
    }

    @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    public void clearEvent(@NonNull TrackEventType trackEventType) {
        this.sessionTracker.clearTrackingEvent(this, trackEventType);
    }

    @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    public void eventFinish(@NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable EventData eventData, @Nullable BMError bMError) {
        this.sessionTracker.trackEventFinish(this, trackEventType, adsType, bMError, eventData);
    }
}
