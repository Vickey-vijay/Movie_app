package rf;

import androidx.annotation.NonNull;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;

/* JADX INFO: compiled from: HeaderBiddingAdObjectParams.java */
/* JADX INFO: loaded from: classes11.dex */
public class b extends AdObjectParams {
    @Override // io.bidmachine.models.AdObjectParams
    public boolean isValid() {
        return true;
    }

    public b(@NonNull Ad ad2, @NonNull HeaderBiddingAd headerBiddingAd) {
        super(ad2);
        getData().putAll(headerBiddingAd.getClientParamsMap());
        getData().putAll(headerBiddingAd.getServerParamsMap());
    }
}
