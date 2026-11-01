package c3;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PangleRequestHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    public static void a(PAGRequest pAGRequest, String str, MediationAdConfiguration mediationAdConfiguration) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String watermark = mediationAdConfiguration.getWatermark();
        if (TextUtils.isEmpty(watermark)) {
            return;
        }
        Map<String, Object> extraInfo = pAGRequest.getExtraInfo();
        if (extraInfo == null) {
            extraInfo = new HashMap<>();
        }
        extraInfo.put("admob_watermark", watermark);
        pAGRequest.setExtraInfo(extraInfo);
    }
}
