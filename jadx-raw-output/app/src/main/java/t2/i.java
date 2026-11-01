package t2;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MobileAds;
import com.inmobi.compliance.InMobiPrivacyCompliance;
import io.bidmachine.z3;
import java.util.HashMap;

/* JADX INFO: compiled from: InMobiExtrasBuilder.java */
/* JADX INFO: loaded from: classes10.dex */
public class i {
    @NonNull
    public static h a(@NonNull Context context, @Nullable Bundle bundle, @NonNull String str) {
        HashMap map = new HashMap();
        if (bundle != null && bundle.keySet() != null) {
            for (String str2 : bundle.keySet()) {
                if (!str2.contains(z3.IAB_US_PRIVACY_STRING)) {
                    map.put(str2, bundle.getString(str2));
                }
            }
        }
        String string = context.getSharedPreferences("NonNullPackage", 0).getString(z3.IAB_US_PRIVACY_STRING, null);
        if (string != null) {
            InMobiPrivacyCompliance.setUSPrivacyString(string);
        }
        map.put("tp", str);
        map.put("tp-ver", MobileAds.getVersion().toString());
        if (MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment() == 1) {
            map.put("coppa", "1");
        } else {
            map.put("coppa", "0");
        }
        return new h(map, "");
    }
}
