package p001if;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.EventTracker;
import io.bidmachine.tracking.TrackEventInfo;
import io.bidmachine.tracking.TrackingObject;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: GAMEventTracker.java */
/* JADX INFO: loaded from: classes2.dex */
public interface j extends EventTracker {
    void trackEvent(@NonNull TrackEventType trackEventType, @NonNull AdsFormat adsFormat, @NonNull EventData eventData, @Nullable BMError bMError);

    @Override // io.bidmachine.tracking.EventTracker
    /* synthetic */ void trackEvent(@NonNull TrackingObject trackingObject, @NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo, @Nullable AdsType adsType, @Nullable BMError bMError, @Nullable EventData eventData);
}
