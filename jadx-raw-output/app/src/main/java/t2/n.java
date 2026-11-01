package t2;

import android.content.Context;
import androidx.annotation.NonNull;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: InMobiSdkWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public class n {
    public String a(Map<String, String> map, String str) {
        return InMobiSdk.getToken(map, str);
    }

    @NonNull
    public String b() {
        return InMobiSdk.getVersion();
    }

    public void c(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        InMobiSdk.init(context, str, jSONObject, sdkInitializationListener);
    }

    public boolean d() {
        return InMobiSdk.isSDKInitialized();
    }

    public void e(Boolean bool) {
        InMobiSdk.setIsAgeRestricted(bool.booleanValue());
    }
}
