package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.EventTracker;
import io.bidmachine.tracking.SessionTrackerImpl;
import io.bidmachine.tracking.TrackEventInfo;
import io.bidmachine.tracking.TrackingObject;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: BidMachineSessionTracker.java */
/* JADX INFO: loaded from: classes3.dex */
public class k2 extends SessionTrackerImpl {

    @NonNull
    private final a2 bidMachineEventTracker;

    public k2(@NonNull EventTracker eventTracker) {
        super(eventTracker);
        this.bidMachineEventTracker = new a2();
    }

    @Override // io.bidmachine.tracking.SessionTrackerImpl, io.bidmachine.tracking.SessionTracker, io.bidmachine.tracking.EventTracker
    public void trackEvent(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo, @Nullable AdsType adsType, @Nullable BMError bMError, @Nullable EventData eventData) {
        super.trackEvent(trackingObject, trackEventType, trackEventInfo, adsType, bMError, eventData);
        this.bidMachineEventTracker.trackEvent(trackingObject, trackEventType, trackEventInfo, adsType, bMError, eventData);
    }
}
