package of;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.IabUtils;

/* JADX INFO: compiled from: VastParams.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends UnifiedParams {

    @NonNull
    public final CacheControl cacheControl;
    public final int companionSkipOffset;

    @Nullable
    public final String creativeAdm;
    public final boolean omsdkEnabled;
    public final float placeholderTimeoutSec;
    public final int skipOffset;
    public final boolean useNativeClose;

    @Override // io.bidmachine.unified.UnifiedParams
    public boolean isValid(@NonNull UnifiedAdCallback unifiedAdCallback) {
        if (!TextUtils.isEmpty(this.creativeAdm)) {
            return true;
        }
        unifiedAdCallback.onAdLoadFailed(BMError.notFound(UnifiedMediationParams.KEY_CREATIVE_ADM));
        return false;
    }

    public e(@NonNull UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.creativeAdm = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_CREATIVE_ADM);
        this.cacheControl = IabUtils.toCacheControl(unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_CACHE_CONTROL));
        this.placeholderTimeoutSec = unifiedMediationParams.getFloat(UnifiedMediationParams.KEY_PLACEHOLDER_TIMEOUT_SEC);
        this.skipOffset = unifiedMediationParams.getInteger(UnifiedMediationParams.KEY_SKIP_OFFSET);
        this.companionSkipOffset = unifiedMediationParams.getInteger(UnifiedMediationParams.KEY_COMPANION_SKIP_OFFSET);
        this.useNativeClose = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_USE_NATIVE_CLOSE);
        this.omsdkEnabled = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_OM_SDK_ENABLED, true);
    }
}
