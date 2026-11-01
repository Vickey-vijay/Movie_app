package sg.bigo.ads.controller.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.q;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f70544a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sg.bigo.ads.common.h.a.a f70545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sg.bigo.ads.core.d.a.a f70546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sg.bigo.ads.core.b.a.a f70547g;

    public d(@NonNull Context context) {
        super(context);
        this.f70544a = new q();
        this.f70545e = new sg.bigo.ads.common.h.a.a();
        this.f70546f = new sg.bigo.ads.core.d.a.a();
        this.f70547g = new sg.bigo.ads.core.b.a.a();
    }

    @Override // sg.bigo.ads.common.e
    public final void a(Context context) {
        super.a(context);
        if (!TextUtils.isEmpty(this.f70567w)) {
            try {
                d(new JSONObject(this.f70567w));
            } catch (JSONException unused) {
            }
        }
        if (!TextUtils.isEmpty(this.f70566v)) {
            try {
                a(new JSONObject(this.f70566v));
            } catch (JSONException unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.f70565u)) {
            try {
                b(new JSONObject(this.f70565u));
            } catch (JSONException unused3) {
            }
        }
        if (TextUtils.isEmpty(this.f70568x)) {
            return;
        }
        try {
            c(new JSONObject(this.f70568x));
        } catch (JSONException unused4) {
        }
    }

    @Override // sg.bigo.ads.controller.b.e
    public final void a(JSONObject jSONObject) {
        this.f70544a.a(jSONObject);
    }

    @Override // sg.bigo.ads.common.e
    public final String b() {
        return "GlobalConfigData";
    }

    @Override // sg.bigo.ads.controller.b.e
    public final void b(JSONObject jSONObject) {
        this.f70545e.a(jSONObject);
    }

    @Override // sg.bigo.ads.controller.b.e
    public final void c(JSONObject jSONObject) {
        this.f70546f.a(jSONObject);
    }

    @Override // sg.bigo.ads.controller.b.e
    public final void d(JSONObject jSONObject) {
        this.f70547g.a(jSONObject);
    }

    @Override // sg.bigo.ads.api.a.h
    @NonNull
    public final q m() {
        return this.f70544a;
    }

    @NonNull
    public final String toString() {
        return "GlobalConfigData{huaweiAdIdInfo=" + this.f70552h + ", googleAdIdInfo=" + this.f70553i + ", location=" + this.f70554j + ", state=" + this.f70557m + ", configId=" + this.f70558n + ", interval=" + this.f70559o + ", token='" + this.f70560p + "', antiBan='" + this.f70561q + "', strategy=" + this.f70562r + ", abflags='" + this.f70563s + "', country='" + this.f70564t + "', creatives='" + this.f70565u + "', trackConfig='" + this.f70566v + "', callbackConfig='" + this.f70567w + "', reportConfig='" + this.f70568x + "', appCheckConfig='" + this.f70569y + "', uid='" + this.f70570z + "', maxRequestNum=" + this.A + ", negFeedbackState=" + this.B + ", omUrl='" + this.C + "', globalSwitch=" + this.E.f69408a + ", bannerJsUrl='" + this.D + "', reqCountry='" + this.L + "', appFlag='" + this.N + "'}";
    }
}
