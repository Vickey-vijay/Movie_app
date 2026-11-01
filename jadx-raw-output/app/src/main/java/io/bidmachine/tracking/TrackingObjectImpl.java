package io.bidmachine.tracking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.utils.BMError;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public abstract class TrackingObjectImpl implements TrackingObject {

    @NonNull
    private final Object trackingKey;

    public TrackingObjectImpl() {
        this(UUID.randomUUID());
    }

    @Override // io.bidmachine.tracking.TrackingObject
    public abstract /* synthetic */ void clear();

    @Override // io.bidmachine.tracking.TrackingObject
    public abstract /* synthetic */ void clearEvent(@NonNull TrackEventType trackEventType);

    @Override // io.bidmachine.tracking.TrackingObject
    public abstract /* synthetic */ void eventFinish(@NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable EventData eventData, @Nullable BMError bMError);

    @Override // io.bidmachine.tracking.TrackingObject
    public /* bridge */ /* synthetic */ void eventStart(@NonNull TrackEventType trackEventType) {
        super.eventStart(trackEventType);
    }

    @Override // io.bidmachine.tracking.TrackingObject
    public abstract /* synthetic */ void eventStart(@NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo);

    @Override // io.bidmachine.tracking.TrackingObject
    @Nullable
    public AdExtension.EventConfiguration getEventConfiguration() {
        return null;
    }

    @Override // io.bidmachine.tracking.TrackingObject
    @Nullable
    public List<String> getTrackingUrls(@NonNull TrackEventType trackEventType) {
        return null;
    }

    public TrackingObjectImpl(@NonNull Object obj) {
        this.trackingKey = obj;
    }

    @Override // io.bidmachine.tracking.TrackingObject
    @NonNull
    public Object getTrackingKey() {
        return this.trackingKey;
    }
}
