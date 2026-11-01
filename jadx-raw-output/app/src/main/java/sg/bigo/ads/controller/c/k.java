package sg.bigo.ads.controller.c;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C3426d4;
import com.ironsource.Ne;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements sg.bigo.ads.api.core.b.InterfaceC0698b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f70664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f70665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f70666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONArray f70667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f70668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f70669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f70670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f70671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f70672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<String, String> f70673j = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f70674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f70675l;

    public k(@NonNull JSONObject jSONObject) {
        this.f70664a = jSONObject.optString("land_url", "");
        this.f70665b = jSONObject.optString("deeplink_url", "");
        this.f70666c = jSONObject.optInt("web_ad_model", 0);
        this.f70668e = jSONObject.optString("return_tracker_url", "");
        this.f70669f = jSONObject.optInt("land_preload_type", 0);
        this.f70670g = jSONObject.optString("click_open_pkg", "");
        this.f70671h = jSONObject.optInt("probe_interval", 0);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Ne.f27116a1);
        if (jSONObjectOptJSONObject != null) {
            this.f70672i = jSONObjectOptJSONObject.optString("host", "");
            String strOptString = jSONObjectOptJSONObject.optString("value", "");
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) strOptString)) {
                b(strOptString);
            }
        } else {
            this.f70672i = "";
        }
        this.f70674k = jSONObject.optString("pre_landing_url", "");
        this.f70675l = jSONObject.optInt("pre_landing_scene", 0);
        this.f70667d = jSONObject.optJSONArray("webview_bundle");
    }

    private void b(String str) {
        this.f70673j.clear();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(C3426d4.j.f28584c)) {
            if (str2.indexOf("=") >= 0) {
                String strSubstring = str2.substring(0, str2.indexOf("="));
                if (!TextUtils.isEmpty(strSubstring)) {
                    String str3 = this.f70673j.get(strSubstring);
                    if (sg.bigo.ads.common.utils.q.b((CharSequence) str3)) {
                        str2 = str3 + C3426d4.j.f28584c + str2;
                    }
                    this.f70673j.put(strSubstring, str2);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC0698b
    public final String a() {
        return this.f70664a;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC0698b
    public final void a(@NonNull String str) {
        this.f70664a = str;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC0698b
    public final String b() {
        return this.f70665b;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC0698b
    public final int c() {
        return this.f70666c;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC0698b
    public final JSONArray d() {
        return this.f70667d;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC0698b
    public final String e() {
        return this.f70668e;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC0698b
    public final int f() {
        return this.f70669f;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC0698b
    public final String g() {
        return this.f70670g;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC0698b
    public final String h() {
        return this.f70672i;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC0698b
    public final Map<String, String> i() {
        return this.f70673j;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC0698b
    public final String j() {
        return this.f70674k;
    }

    @Override // sg.bigo.ads.api.core.b.InterfaceC0698b
    public final int k() {
        return this.f70675l;
    }
}
