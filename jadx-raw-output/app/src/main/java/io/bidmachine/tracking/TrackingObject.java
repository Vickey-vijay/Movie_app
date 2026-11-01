package io.bidmachine.tracking;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsType;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.utils.BMError;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface TrackingObject {
    void clear();

    void clearEvent(@NonNull TrackEventType trackEventType);

    void eventFinish(@NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable EventData eventData, @Nullable BMError bMError);

    default void eventStart(@NonNull TrackEventType trackEventType) {
        eventStart(trackEventType, null);
    }

    void eventStart(@NonNull TrackEventType trackEventType, @Nullable TrackEventInfo trackEventInfo);

    @Nullable
    AdExtension.EventConfiguration getEventConfiguration();

    @NonNull
    Object getTrackingKey();

    @Nullable
    List<String> getTrackingUrls(@NonNull TrackEventType trackEventType);
}
