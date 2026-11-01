package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.d6;
import com.applovin.impl.h6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b extends i5 implements a.InterfaceC0047a, AppLovinAdLoadListener {
    private final List A;
    private final List B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f9409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f9410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f9411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f9412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f9413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f9414l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Double f9415m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f9416n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Uri f9417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f9418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private o7 f9419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Uri f9420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Uri f9421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Uri f9422t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Uri f9423u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List f9424v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f9425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f9426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f9427y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f9428z;

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f9422t = Uri.parse(string);
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Processed click destination URL: " + this.f9422t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f9423u = Uri.parse(string2);
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Processed click destination backup URL: " + this.f9423u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.f9409g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f7705a.a(x4.O2)).booleanValue()) {
                try {
                    this.f9424v.addAll(JsonUtils.toList(jSONArray));
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Processed click tracking URLs: " + this.f9424v);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Failed to render click tracking URLs", th2);
                        return;
                    }
                    return;
                }
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f9426x.add(new com.applovin.impl.sdk.network.e.a(this.f7705a).b(str).b(false).a(false).h(f()).a());
                    }
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Processed click tracking requests: " + this.f9426x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f9411i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Failed to prepare native ad view components", th2);
            }
            b(th2.getMessage());
            this.f7705a.D().a(this.f7706b, "prepareNativeComponents", th2);
        }
    }

    private void e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f9409g), JsonUtils.shallowCopy(this.f9410h), this.f7705a).setTitle(this.f9412j).setAdvertiser(this.f9413k).setBody(this.f9414l).setCallToAction(this.f9416n).setStarRating(this.f9415m).setIconUri(this.f9417o).setMainImageUri(this.f9418p).setPrivacyIconUri(this.f9420r).setVastAd(this.f9419q).setPrivacyDestinationUri(this.f9421s).setClickDestinationUri(this.f9422t).setClickDestinationBackupUri(this.f9423u).setClickTrackingUrls(this.f9424v).setJsTrackers(this.f9425w).setClickTrackingRequests(this.f9426x).setImpressionRequests(this.f9427y).setViewableMRC50Requests(this.f9428z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f7705a.q0().a((i5) new a(appLovinNativeAdImplBuild, this.f7705a, this), d6.b.CORE);
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r10 = 0;
        String string = JsonUtils.getString(this.f9409g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f9420r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f9409g, CampaignEx.JSON_KEY_PRIVACY_URL, null);
        if (URLUtil.isValidUrl(string2)) {
            this.f9421s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f9409g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "No oRtb response provided: " + this.f9409g);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Unable to retrieve assets - failing ad load: " + this.f9409g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) r10);
            if (jSONObject4.has("title")) {
                this.f9412j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) r10), "text", r10);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.a(this.f7706b, "Processed title: " + this.f9412j);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r10));
            } else if (jSONObject4.has(ImpressionLog.f43644t)) {
                int i11 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, ImpressionLog.f43644t, (JSONObject) r10);
                int i12 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", r10);
                if (i12 == 1 || 3 == i11) {
                    this.f9417o = Uri.parse(string4);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Processed icon URL: " + this.f9417o);
                    }
                } else if (i12 == 3 || 2 == i11) {
                    this.f9418p = Uri.parse(string4);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Processed main image URL: " + this.f9418p);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.k(this.f7706b, "Unrecognized image: " + jSONObject4);
                    }
                    int i13 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i14 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i13 <= 0 || i14 <= 0) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f7707c.k(this.f7706b, "Skipping...");
                        }
                    } else if (i13 / i14 > 1.0d) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f7707c.a(this.f7706b, "Inferring main image from " + i13 + VastAttributes.HORIZONTAL_POSITION + i14 + "...");
                        }
                        this.f9418p = Uri.parse(string4);
                    } else {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f7707c.a(this.f7706b, "Inferring icon image from " + i13 + VastAttributes.HORIZONTAL_POSITION + i14 + "...");
                        }
                        this.f9417o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Processed VAST video");
                    }
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.k(this.f7706b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i15 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i16 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", null);
                if (i16 == 1 || i15 == 8) {
                    this.f9413k = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Processed advertiser: " + this.f9413k);
                    }
                } else if (i16 == 2 || i15 == 4) {
                    this.f9414l = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Processed body: " + this.f9414l);
                    }
                } else if (i16 == 12 || i15 == 5) {
                    this.f9416n = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Processed cta: " + this.f9416n);
                    }
                } else if (i16 == 3 || i15 == 6) {
                    double dA = n7.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.f9415m = Double.valueOf(dA);
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f7707c.a(this.f7706b, "Processed star rating: " + this.f9415m);
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Received invalid star rating: " + string6);
                    }
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.k(this.f7706b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Unsupported asset object: " + jSONObject4);
            }
            i10++;
            r10 = 0;
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.f9425w.add(string7);
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Processed jstracker: " + string7);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            int i17 = 0;
            while (i17 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i17, obj);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f9427y.add(new com.applovin.impl.sdk.network.e.a(this.f7705a).b(str2).b(false).a(false).h(f()).a());
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f7707c.a(this.f7706b, "Processed imptracker URL: " + str2);
                        }
                    }
                }
                i17++;
                obj = null;
            }
        }
        ?? r11 = 0;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i18 = 0;
            while (i18 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i18, (JSONObject) r11);
                int i19 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i20 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r11);
                if (!TextUtils.isEmpty(string8)) {
                    if (i20 == 1 || i20 == 2) {
                        if (i20 == 2 && string8.startsWith("<script")) {
                            this.f9425w.add(string8);
                        } else {
                            com.applovin.impl.sdk.network.e eVarA = new com.applovin.impl.sdk.network.e.a(this.f7705a).b(string8).b(false).a(false).h(f() || i20 == 2).a();
                            if (i19 == 1) {
                                this.f9427y.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f7707c.a(this.f7706b, "Processed impression URL: " + string8);
                                }
                            } else if (i19 == 2) {
                                this.f9428z.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f7707c.a(this.f7706b, "Processed viewable MRC50 URL: " + string8);
                                }
                            } else if (i19 == 3) {
                                this.A.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f7707c.a(this.f7706b, "Processed viewable MRC100 URL: " + string8);
                                }
                            } else if (i19 == 4) {
                                this.B.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f7707c.a(this.f7706b, "Processed viewable video 50 URL: " + string8);
                                }
                            } else if (i19 == 555) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f7707c.a(this.f7706b, "Ignoring processing of OMID URL: " + string8);
                                }
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.f7707c.b(this.f7706b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.b(this.f7706b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i18++;
                r11 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Processing VAST video...");
        }
        this.f7705a.q0().a(h6.a(str, JsonUtils.shallowCopy(this.f9409g), JsonUtils.shallowCopy(this.f9410h), this, this.f7705a));
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.f9412j = "";
        this.f9413k = "";
        this.f9414l = "";
        this.f9415m = null;
        this.f9416n = "";
        this.f9417o = null;
        this.f9418p = null;
        this.f9420r = null;
        this.f9421s = null;
        this.f9422t = null;
        this.f9423u = null;
        this.f9424v = new ArrayList();
        this.f9425w = new ArrayList();
        this.f9426x = new ArrayList();
        this.f9427y = new ArrayList();
        this.f9428z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f9409g = jSONObject;
        this.f9410h = jSONObject2;
        this.f9411i = appLovinNativeAdLoadListener;
    }

    private void c(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f9442b.b(appLovinNativeAdImpl);
            }
        });
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.f9409g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f7705a.a(x4.N2)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "VAST ad rendered successfully");
        }
        this.f9419q = (o7) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.b(this.f7706b, "VAST ad failed to render");
        }
        e();
    }

    private void b(String str) {
        this.f9411i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0047a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
