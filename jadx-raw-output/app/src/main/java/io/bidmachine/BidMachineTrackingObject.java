package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.models.AdObject;
import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.SessionTrackingObject;
import io.bidmachine.utils.BMError;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class BidMachineTrackingObject extends SessionTrackingObject {
    public BidMachineTrackingObject() {
        super(j2.get().getSessionTracker());
    }

    public void eventFinish(@NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable u uVar, @Nullable BMError bMError) {
        eventFinish(trackEventType, adsType, uVar, bMError, null);
    }

    @Override // io.bidmachine.tracking.SessionTrackingObject, io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    public /* bridge */ /* synthetic */ void eventStart(@NonNull TrackEventType trackEventType) {
        super.eventStart(trackEventType);
    }

    public BidMachineTrackingObject(@NonNull Object obj) {
        super(obj, j2.get().getSessionTracker());
    }

    public void eventFinish(@NonNull TrackEventType trackEventType, @Nullable AdsType adsType, @Nullable u uVar, @Nullable BMError bMError, @Nullable Map<String, Object> map) {
        EventData price;
        if (uVar != null) {
            price = new EventData().setNetworkName(uVar.getAuctionResult().getNetworkKey()).setPrice(Double.valueOf(uVar.getPrice()));
            if (map != null) {
                price.addCustomParams(map);
            }
            AdObject adObject = uVar.getAdObject();
            if (adObject != null) {
                price.addCustomParams(adObject.getCustomParams());
            }
        } else {
            price = null;
        }
        eventFinish(trackEventType, adsType, price, bMError);
    }
}
