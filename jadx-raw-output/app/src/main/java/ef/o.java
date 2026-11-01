package ef;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ads.networks.gam.GAMConfig;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: GAMParams.java */
/* JADX INFO: loaded from: classes6.dex */
public class o extends UnifiedParams {

    @Nullable
    public final String adUnitId;

    @Nullable
    public final String price;

    @Nullable
    public final String score;

    @Override // io.bidmachine.unified.UnifiedParams
    public boolean isValid(@NonNull UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.adUnitId)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("ad_unit_id"));
            return false;
        }
        if (TextUtils.isEmpty(this.score)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(GAMConfig.KEY_SCORE));
            return false;
        }
        if (!TextUtils.isEmpty(this.price)) {
            return true;
        }
        unifiedAdCallback.onAdLoadFailed(BMError.notFound("price"));
        return false;
    }

    public o(@NonNull UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.adUnitId = unifiedMediationParams.getStringOrNull("ad_unit_id");
        this.score = unifiedMediationParams.getStringOrNull(GAMConfig.KEY_SCORE);
        this.price = unifiedMediationParams.getStringOrNull("price");
    }
}
