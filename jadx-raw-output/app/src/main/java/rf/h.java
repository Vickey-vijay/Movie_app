package rf;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedMediationParams;

/* JADX INFO: compiled from: IabAdObjectParams.java */
/* JADX INFO: loaded from: classes11.dex */
public class h extends AdObjectParams {
    public h(@NonNull Ad ad2) {
        super(ad2);
        getData().put("creativeId", ad2.getId());
    }

    @Override // io.bidmachine.models.AdObjectParams
    public boolean isValid() {
        Object obj = getData().get(UnifiedMediationParams.KEY_CREATIVE_ADM);
        if ((obj instanceof CharSequence) && !TextUtils.isEmpty((CharSequence) obj)) {
            return true;
        }
        return false;
    }

    public void setCreativeAdm(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getData().put(UnifiedMediationParams.KEY_CREATIVE_ADM, str);
    }
}
