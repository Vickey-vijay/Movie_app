package sg.bigo.ads.api.core;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements sg.bigo.ads.api.a.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sg.bigo.ads.api.a.f[] f69392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.api.a.f f69393f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f69388a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f69389b = "en";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f69390c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f69391d = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f69394g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f69395h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f69396i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f69397j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.api.a.e.b f69399l = new sg.bigo.ads.api.a.e.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.api.a.e.a f69400m = new sg.bigo.ads.api.a.e.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.api.a.e.c[] f69398k = new sg.bigo.ads.api.a.e.c[0];

    private void a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new j(jSONObjectOptJSONObject));
                }
            }
            j[] jVarArr = new j[arrayList.size()];
            this.f69392e = jVarArr;
            this.f69392e = (sg.bigo.ads.api.a.f[]) arrayList.toArray(jVarArr);
        }
    }

    @Override // sg.bigo.ads.api.a.e
    public final String a() {
        return this.f69390c;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f69388a = jSONObject.optLong("form_id", 0L);
            this.f69390c = jSONObject.optString("title", "");
            this.f69389b = jSONObject.optString("ad_lang", "en");
            this.f69391d = jSONObject.optString(UnifiedMediationParams.KEY_DESCRIPTION, "");
            this.f69394g = jSONObject.optString("purpose", "");
            this.f69396i = jSONObject.optInt("color", 0);
            this.f69397j = jSONObject.optInt("form_style_id", 0);
            this.f69395h = jSONObject.optString("extra", "");
            a(jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("icon");
            if (jSONObjectOptJSONObject != null) {
                this.f69393f = new j(jSONObjectOptJSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("questions");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject2 != null) {
                        arrayList.add(new sg.bigo.ads.api.a.e.c(jSONObjectOptJSONObject2));
                    }
                }
                sg.bigo.ads.api.a.e.c[] cVarArr = new sg.bigo.ads.api.a.e.c[arrayList.size()];
                this.f69398k = cVarArr;
                this.f69398k = (sg.bigo.ads.api.a.e.c[]) arrayList.toArray(cVarArr);
            }
            sg.bigo.ads.api.a.e.b bVar = this.f69399l;
            String strOptString = jSONObject.optString("privacy", "");
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    bVar.f69312a = jSONObject2.optString("name", "");
                    bVar.f69313b = jSONObject2.optString("url", "");
                } catch (JSONException unused) {
                }
            }
            sg.bigo.ads.api.a.e.a aVar = this.f69400m;
            String strOptString2 = jSONObject.optString("feedback", "");
            if (TextUtils.isEmpty(strOptString2)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString2);
            aVar.f69308a = jSONObject3.optString("title", "");
            aVar.f69309b = jSONObject3.optString(UnifiedMediationParams.KEY_DESCRIPTION, "");
            aVar.f69310c = jSONObject3.optString("cta", "");
            aVar.f69311d = jSONObject3.optString("land_url", "");
        } catch (JSONException unused2) {
        }
    }

    @Override // sg.bigo.ads.api.a.e
    public final String b() {
        return this.f69391d;
    }

    @Override // sg.bigo.ads.api.a.e
    public final long c() {
        return this.f69388a;
    }

    @Override // sg.bigo.ads.api.a.e
    public final int d() {
        return this.f69396i;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String e() {
        return this.f69389b;
    }

    @Override // sg.bigo.ads.api.a.e
    public final int f() {
        return this.f69397j;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String g() {
        return this.f69395h;
    }

    @Override // sg.bigo.ads.api.a.e
    public final String h() {
        return this.f69394g;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f[] i() {
        return this.f69392e;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f j() {
        sg.bigo.ads.api.a.f[] fVarArr = this.f69392e;
        if (fVarArr == null || fVarArr.length <= 0) {
            return null;
        }
        return fVarArr[0];
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.f k() {
        return this.f69393f;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.e.b l() {
        return this.f69399l;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.e.c[] m() {
        return this.f69398k;
    }

    @Override // sg.bigo.ads.api.a.e
    public final sg.bigo.ads.api.a.e.a n() {
        return this.f69400m;
    }
}
