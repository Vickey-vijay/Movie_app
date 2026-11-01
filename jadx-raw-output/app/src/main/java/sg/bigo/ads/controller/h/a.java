package sg.bigo.ads.controller.h;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f70928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f70929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, Object> f70930d;

    public a(String str) {
        a(str);
    }

    private void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f70929c = jSONObject.optString("data");
            this.f70927a = jSONObject.optInt("code");
            this.f70928b = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
            r.a(jSONObject.optInt("timestamp", 0));
            this.f70930d = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.equals("data", next) && !TextUtils.equals("code", next) && !TextUtils.equals(NotificationCompat.CATEGORY_MESSAGE, next)) {
                    this.f70930d.put(next, jSONObject.opt(next));
                }
            }
        } catch (JSONException unused) {
            this.f70929c = "";
            this.f70927a = 1005;
            this.f70928b = "Invalid response.";
        }
    }

    public final boolean a() {
        return this.f70927a == 1;
    }

    public final boolean b() {
        return this.f70927a == -14;
    }
}
