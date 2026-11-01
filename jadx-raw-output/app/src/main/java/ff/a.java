package ff;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    @NonNull
    public static AdManagerAdRequest a(@NonNull GAMLoader gAMLoader, @NonNull GAMUnitData gAMUnitData) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        String requestAgent = gAMLoader.getRequestAgent();
        if (!TextUtils.isEmpty(requestAgent)) {
            builder.setRequestAgent(requestAgent);
        }
        for (Map.Entry<String, String> entry : gAMUnitData.getCustomTargeting().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                builder.addCustomTargeting(key, value);
            }
        }
        return builder.build();
    }
}
