package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.core.Logger;
import io.bidmachine.iab.vast.tags.VastTagName;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: ProtoTransformer.java */
/* JADX INFO: loaded from: classes.dex */
public class c5 {

    /* JADX INFO: compiled from: ProtoTransformer.java */
    public interface a<AdResponse> {
        void onFail(@NonNull BMError bMError);

        void onSuccess(@NonNull AdResponse adresponse);
    }

    public static void toAdResponse(@NonNull AdRequestParameters adRequestParameters, @NonNull NetworkAdUnitManager networkAdUnitManager, @Nullable Response response, @NonNull a<u> aVar) {
        if (response == null || response.getSeatbidCount() == 0) {
            aVar.onFail(BMError.notFound("Response"));
            return;
        }
        Response.Seatbid seatbid = response.getSeatbid(0);
        if (seatbid == null || seatbid.getBidCount() == 0) {
            aVar.onFail(BMError.notFound("Seatbid"));
            return;
        }
        Response.Seatbid.Bid bid = seatbid.getBid(0);
        if (bid == null) {
            aVar.onFail(BMError.notFound("Bid"));
            return;
        }
        Any media = bid.getMedia();
        if (media == null) {
            aVar.onFail(BMError.notFound("Media"));
            return;
        }
        if (!media.is(Ad.class)) {
            aVar.onFail(BMError.incorrectContent("Media not valid"));
            return;
        }
        try {
            Ad ad2 = (Ad) media.unpack(Ad.class);
            if (ad2 == null) {
                aVar.onFail(BMError.notFound(VastTagName.AD));
                return;
            }
            NetworkAdapter networkAdapterFindNetworkAdapter = adRequestParameters.getAdsType().findNetworkAdapter(ad2);
            if (networkAdapterFindNetworkAdapter == null) {
                aVar.onFail(BMError.notFound("NetworkAdapter"));
            } else {
                aVar.onSuccess(new u(adRequestParameters, networkAdUnitManager, response, seatbid, bid, ad2, networkAdapterFindNetworkAdapter));
            }
        } catch (Throwable th2) {
            Logger.w(th2);
            aVar.onFail(BMError.throwable("Failed to process response", th2));
        }
    }
}
