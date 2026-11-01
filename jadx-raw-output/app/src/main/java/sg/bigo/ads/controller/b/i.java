package sg.bigo.ads.controller.b;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.provider.FontsContractCompat;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.k;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes10.dex */
class i implements l, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f70580a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f70581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f70582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f70583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f70584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f70585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f70586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f70587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f70588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f70589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f70590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f70591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f70592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f70593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f70594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<sg.bigo.ads.api.a.a> f70595p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f70596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f70597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m f70598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f70599t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f70600u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f70601v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f70602w;

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f70582c == 4 && !jSONObject.has("interstitial_video_style")) {
                jSONObject = new JSONObject().put("interstitial_video_style", jSONObject);
            }
            this.f70598s = new j(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.api.a.l
    public String a() {
        return this.f70581b;
    }

    public void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f70581b);
        parcel.writeInt(this.f70582c);
        parcel.writeInt(this.f70583d);
        parcel.writeInt(this.f70584e);
        parcel.writeInt(this.f70585f);
        parcel.writeInt(this.f70586g);
        parcel.writeInt(this.f70587h);
        parcel.writeInt(this.f70588i ? 1 : 0);
        parcel.writeInt(this.f70589j ? 1 : 0);
        parcel.writeInt(this.f70590k ? 1 : 0);
        parcel.writeInt(this.f70591l);
        parcel.writeString(this.f70592m);
        parcel.writeInt(this.f70593n ? 1 : 0);
        parcel.writeString(this.f70594o);
        n.a(parcel, this.f70595p);
        parcel.writeInt(this.f70599t);
        parcel.writeString(this.f70597r);
        m mVar = this.f70598s;
        parcel.writeString(mVar == null ? null : mVar.toString());
        parcel.writeInt(this.f70601v ? 1 : 0);
        parcel.writeInt(this.f70600u);
        parcel.writeInt(this.f70602w);
        n.a(parcel, this.f70580a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0140  */
    /* JADX WARN: Code duplicated, block: B:76:0x0145 A[SYNTHETIC] */
    public boolean a(JSONObject jSONObject) {
        boolean z10;
        if (jSONObject == null) {
            sg.bigo.ads.common.t.a.a(0, "Slot", "parseData error, jsonObject is null.");
            return false;
        }
        this.f70583d = jSONObject.optInt("countdown", 5);
        this.f70582c = jSONObject.optInt("ad_type", -1);
        this.f70581b = jSONObject.optString("strategy_id", "");
        this.f70584e = jSONObject.optInt("req_once_load_timeout", 15);
        this.f70585f = jSONObject.optInt("media_strategy", 0);
        this.f70586g = jSONObject.optInt("webview_enforce_duration", 0) * 1000;
        this.f70587h = jSONObject.optInt("video_direction", 0);
        this.f70588i = sg.bigo.ads.api.core.a.d(this.f70582c) || jSONObject.optInt("video_replay", 1) == 1;
        this.f70589j = sg.bigo.ads.api.core.a.d(this.f70582c) || jSONObject.optInt("video_mute", 0) == 0;
        this.f70590k = jSONObject.optInt("banner_auto_refresh", 0) == 1;
        this.f70591l = jSONObject.optInt("banner_refresh_interval", 20);
        this.f70592m = jSONObject.optString("slot", "");
        this.f70593n = jSONObject.optInt("state", 1) == 1;
        this.f70594o = jSONObject.optString(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, "");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("express_list");
        this.f70595p = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                a aVar = new a();
                if (jSONObjectOptJSONObject == null) {
                    sg.bigo.ads.common.t.a.a(0, "AdExpress", "parseData error, jsonObject is null.");
                } else {
                    aVar.f70508a = jSONObjectOptJSONObject.optLong("id", 0L);
                    aVar.f70509b = jSONObjectOptJSONObject.optString("name", "");
                    aVar.f70510c = jSONObjectOptJSONObject.optString("url", "");
                    aVar.f70511d = jSONObjectOptJSONObject.optString("md5", "");
                    aVar.f70512e = jSONObjectOptJSONObject.optString("style", "");
                    aVar.f70513f = jSONObjectOptJSONObject.optString("ad_types", "");
                    aVar.f70514g = jSONObjectOptJSONObject.optString(FontsContractCompat.Columns.FILE_ID, "");
                    if (aVar.f70508a != 0 && !TextUtils.isEmpty(aVar.f70509b) && !TextUtils.isEmpty(aVar.f70510c) && !TextUtils.isEmpty(aVar.f70511d) && !TextUtils.isEmpty(aVar.f70513f) && !TextUtils.isEmpty(aVar.f70514g)) {
                        z10 = true;
                    }
                    if (z10) {
                        this.f70595p.add(aVar);
                    }
                }
                z10 = false;
                if (z10) {
                    this.f70595p.add(aVar);
                }
            }
        }
        this.f70596q = jSONObject.optString("abflags");
        this.f70599t = jSONObject.optInt("playable", 0);
        this.f70597r = jSONObject.optString("style_id");
        a(jSONObject.optString("interstitial_style_config"));
        this.f70601v = jSONObject.optInt("banner_multiple_click", 1) == 1;
        this.f70600u = jSONObject.optInt("companion_render", 0);
        this.f70602w = jSONObject.optInt("auc_mode", 0);
        g gVar = this.f70580a;
        gVar.f70575a = jSONObject.optInt("video_click_mode", 1) == 1;
        gVar.f70576b = jSONObject.optInt("native_ad_view_clickable", 0) == 1;
        gVar.f70577c = jSONObject.optInt("native_ad_click_type", 0);
        if (this.f70593n) {
            return (TextUtils.isEmpty(this.f70592m) || TextUtils.isEmpty(this.f70594o)) ? false : true;
        }
        return true;
    }

    @Override // sg.bigo.ads.api.a.l
    public int b() {
        return this.f70582c;
    }

    public void b(@NonNull Parcel parcel) {
        this.f70581b = parcel.readString();
        this.f70582c = parcel.readInt();
        this.f70583d = parcel.readInt();
        this.f70584e = parcel.readInt();
        this.f70585f = parcel.readInt();
        this.f70586g = parcel.readInt();
        this.f70587h = parcel.readInt();
        this.f70588i = parcel.readInt() != 0;
        this.f70589j = parcel.readInt() != 0;
        this.f70590k = parcel.readInt() != 0;
        this.f70591l = parcel.readInt();
        this.f70592m = parcel.readString();
        this.f70593n = parcel.readInt() != 0;
        this.f70594o = parcel.readString();
        this.f70595p = n.a(parcel, new sg.bigo.ads.common.f.a<sg.bigo.ads.api.a.a>() { // from class: sg.bigo.ads.controller.b.i.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new a();
            }
        });
        this.f70599t = n.a(parcel, 0);
        this.f70597r = n.a(parcel, "");
        a(n.a(parcel, ""));
        this.f70601v = n.b(parcel, true);
        this.f70600u = n.a(parcel, 0);
        this.f70602w = n.a(parcel, 0);
        n.b(parcel, this.f70580a);
    }

    @Override // sg.bigo.ads.api.a.l
    public int c() {
        return this.f70583d;
    }

    @Override // sg.bigo.ads.api.a.l
    public int d() {
        return this.f70584e;
    }

    @Override // sg.bigo.ads.api.a.l
    public int e() {
        return this.f70585f;
    }

    @Override // sg.bigo.ads.api.a.l
    public int f() {
        return this.f70586g;
    }

    @Override // sg.bigo.ads.api.a.l
    public int g() {
        return this.f70587h;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean h() {
        return this.f70588i;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean i() {
        return this.f70589j;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean j() {
        return this.f70590k;
    }

    @Override // sg.bigo.ads.api.a.l
    public int k() {
        return this.f70591l;
    }

    @Override // sg.bigo.ads.api.a.l
    public String l() {
        return this.f70592m;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean m() {
        return this.f70593n;
    }

    @Override // sg.bigo.ads.api.a.l
    public String n() {
        return this.f70594o;
    }

    @Override // sg.bigo.ads.api.a.l
    public String o() {
        return this.f70596q;
    }

    @Override // sg.bigo.ads.api.a.l
    public String p() {
        return this.f70597r;
    }

    @Override // sg.bigo.ads.api.a.l
    @NonNull
    public m q() {
        if (this.f70598s == null) {
            this.f70598s = new j(new JSONObject());
        }
        return this.f70598s;
    }

    @Override // sg.bigo.ads.api.a.l
    public int r() {
        return this.f70599t;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean s() {
        return this.f70599t == 1;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean t() {
        return this.f70600u == 1;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        List<sg.bigo.ads.api.a.a> list = this.f70595p;
        if (list != null) {
            for (sg.bigo.ads.api.a.a aVar : list) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(aVar);
            }
        }
        return "{strategyId=" + this.f70581b + ", adType=" + this.f70582c + ", countdown=" + this.f70583d + ", reqTimeout=" + this.f70584e + ", mediaStrategy=" + this.f70585f + ", webViewEnforceDuration=" + this.f70586g + ", videoDirection=" + this.f70587h + ", videoReplay=" + this.f70588i + ", videoMute=" + this.f70589j + ", bannerAutoRefresh=" + this.f70590k + ", bannerRefreshInterval=" + this.f70591l + ", slotId='" + this.f70592m + "', state=" + this.f70593n + ", placementId='" + this.f70594o + "', express=[" + sb2.toString() + "], styleId=" + this.f70597r + ", playable=" + this.f70599t + ", isCompanionRenderSupport=" + this.f70600u + ", aucMode=" + this.f70602w + ", nativeAdClickConfig=" + this.f70580a + '}';
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean u() {
        return this.f70601v;
    }

    @Override // sg.bigo.ads.api.a.l
    public int v() {
        return this.f70602w;
    }

    @Override // sg.bigo.ads.api.a.l
    public boolean w() {
        return this.f70602w == 3;
    }

    @Override // sg.bigo.ads.api.a.l
    @NonNull
    public k x() {
        return this.f70580a;
    }
}
