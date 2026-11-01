package io.bidmachine.tracking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes11.dex */
public class SimpleTrackingObject extends TrackingObjectImpl {
    public SimpleTrackingObject() {
    }

    @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    public void clear() {
    }

    @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    public void clearEvent(@NonNull TrackEventType trackEventType) {
    }

    @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    public void eventFinish(@NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable EventData eventData, @Nullable BMError bMError) {
    }

    @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    public /* bridge */ /* synthetic */ void eventStart(@NonNull TrackEventType trackEventType) {
        super.eventStart(trackEventType);
    }

    @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    public void eventStart(@NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo) {
    }

    public SimpleTrackingObject(@NonNull Object obj) {
        super(obj);
    }
}
