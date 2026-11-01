package com.safedk.android.internal.partials;

import android.text.TextUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.f;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PangleSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class PangleVideoBridge {
    public static JSONObject jsonObjectInit(String message) throws JSONException {
        Logger.d("PangleVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/PangleVideoBridge;->jsonObjectInit(Ljava/lang/String;)Lorg/json/JSONObject;");
        try {
            if (message.startsWith("{\"adMarkup\"")) {
                int iHashCode = message.hashCode();
                if (f.a(iHashCode)) {
                    CreativeInfoManager.a(message, iHashCode);
                }
                return new JSONObject(message);
            }
            if (message.startsWith("{\"creatives\"") || message.startsWith("{\"interaction_type\"")) {
                k.b("VideoBridge", "message is: " + message);
                CreativeInfoManager.a(g.f44975u, "@!1:ad_fetch@!", message, (Map<String, List<String>>) null);
            } else if (message.contains("{\"app_log_url\"")) {
                k.b("VideoBridge", "message is: " + message);
                SafeDK safeDK = SafeDK.getInstance();
                boolean z10 = false;
                if (message.contains("\"tag\":\"fullscreen_interstitial_ad\"") || message.contains("\"tag\":\"rewarded_video\"")) {
                    if (message.contains("\"label\":\"feed_over\"") || message.contains("\"label\":\"skip\"") || (message.contains("\"label\":\"endcard_page_info\"") && message.contains("\"track_name\\\":\\\"endcard_pageview\\\""))) {
                        CreativeInfoManager.onVideoCompleted(g.f44975u, null);
                        z10 = true;
                    }
                } else if (message.contains("\"tag\":\"landingpage_direct\",\"label\":\"load_finish\"") || (message.contains("\"tag\":\"landingpage_direct\"") && message.contains("\"event\":\"progress_load_finish\""))) {
                    CreativeInfoManager.onVideoCompleted(g.f44975u, null);
                    if (safeDK != null && safeDK.y() != null) {
                        safeDK.y().g(g.f44975u, "landingpage_direct");
                    }
                    z10 = true;
                }
                if (z10 && safeDK != null && safeDK.y() != null) {
                    safeDK.y().l(g.f44975u);
                }
            } else if (k.v(message)) {
                JSONObject jSONObject = new JSONObject(message);
                String strOptString = jSONObject.optString("track_name");
                if (!TextUtils.isEmpty(strOptString) && strOptString.equals("endcard_pageview")) {
                    Logger.d("VideoBridge", "json object init - found endcard for sdk: ");
                    CreativeInfoManager.f(g.f44975u);
                } else if (!TextUtils.isEmpty(jSONObject.optString("video_url")) && !TextUtils.isEmpty(jSONObject.optString("total_duration"))) {
                    Logger.d("VideoBridge", "json object init - video ended for sdk: ");
                    CreativeInfoManager.onVideoCompleted(g.f44975u, null);
                }
            }
            return new JSONObject(message);
        } catch (Throwable th2) {
        }
    }
}
