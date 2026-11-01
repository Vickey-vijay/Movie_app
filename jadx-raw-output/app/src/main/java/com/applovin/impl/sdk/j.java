package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.b3;
import com.applovin.impl.c3;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.d3;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.h3;
import com.applovin.impl.h7;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.SdksMapping;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class j implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f9291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinCommunicator f9292b;

    public void a(JSONObject jSONObject, boolean z10) {
        if (b("safedk_init") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle();
            bundle.putString("sdk_key", this.f9291a.i0());
            bundle.putString("applovin_random_token", this.f9291a.h0());
            bundle.putString("compass_random_token", this.f9291a.u());
            bundle.putString(CommonUrlParts.DEVICE_TYPE, AppLovinSdkUtils.isTablet(k.o()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z10));
            bundle.putParcelableArrayList(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, JsonUtils.toBundle(w3.b(this.f9291a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f9291a.w0().e());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f9291a.a(x4.f9980l7)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, com.safedk.android.internal.d.f44800x, true);
                JsonUtils.putJSONObject(jSONObject3, com.safedk.android.internal.d.f44798v, jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f9291a.O();
            if (o.a()) {
                this.f9291a.O().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(String str, String str2) {
        if (b("user_info") && com.applovin.impl.j.c()) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        if (((Boolean) this.f9291a.a(x4.f9971k7)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map2.containsKey("sdk_key")) {
                    map2.put("sdk_key", this.f9291a.i0());
                }
                this.f9291a.f0().e(new com.applovin.impl.sdk.network.d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map2).a(stringMap2).a(((Boolean) this.f9291a.a(x4.f9969k5)).booleanValue()).b(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f9291a.k().addCustomQueryParams(n7.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f9291a.k().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f9291a.X().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f9291a.a(x4.f9958j3)).longValue();
            int i10 = messageData2.getInt("retry_count", ((Integer) this.f9291a.a(x4.f9967k3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f9291a.a(x4.f9976l3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            long j10 = millis2;
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f9291a.A().a((Map) null, false, false))));
                }
                millis = millis;
                i10 = i10;
                map = null;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map mapG = this.f9291a.A().G();
                    Map mapP = this.f9291a.A().p();
                    if (mapP.containsKey("idfv") && mapP.containsKey("idfv_scope")) {
                        String str = (String) mapP.get("idfv");
                        Integer num = (Integer) mapP.get("idfv_scope");
                        num.intValue();
                        mapP.remove("idfv");
                        mapP.remove("idfv_scope");
                        mapG.put("idfv", str);
                        mapG.put("idfv_scope", num);
                    }
                    mapG.put("server_installed_at", this.f9291a.a(x4.f9997o));
                    mapG.put("sdk_key", this.f9291a.i0());
                    map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, mapG);
                    map.put(C3426d4.i.G, mapP);
                } else {
                    millis = millis;
                    i10 = i10;
                }
            }
            this.f9291a.q0().a((i5) new com.applovin.impl.n0(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.f9291a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) millis).a(i10).b((int) j10).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f9291a), d6.b.OTHER);
        }
    }

    public j(k kVar) {
        this.f9291a = kVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(k.o());
        this.f9292b = appLovinCommunicator;
        if (((Boolean) kVar.a(x4.f9971k7)).booleanValue()) {
            appLovinCommunicator.a(kVar);
            appLovinCommunicator.subscribe(this, h7.f7626a);
        }
    }

    public void b(y2 y2Var, String str) {
        if (b("max_ad_events")) {
            Bundle bundleA = a(y2Var);
            bundleA.putString("type", str);
            this.f9291a.O();
            if (o.a()) {
                this.f9291a.O().a("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleA);
            }
            a(bundleA, "max_ad_events");
        }
    }

    public void b(y2 y2Var) {
        if (b("max_revenue_events")) {
            Bundle bundleA = a(y2Var);
            bundleA.putAll(JsonUtils.toBundle(y2Var.P()));
            bundleA.putString("country_code", this.f9291a.v().getCountryCode());
            a(bundleA, "max_revenue_events");
        }
    }

    public void b(List list) {
        if (b("test_mode_networks_updated")) {
            if (list != null && !list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
                a(bundle, "test_mode_networks_updated");
                return;
            }
            a(Bundle.EMPTY, "test_mode_networks_updated");
        }
    }

    public void a(y2 y2Var, String str) {
        if (b("ad_callback_blocked_after_hidden")) {
            Bundle bundleA = a(y2Var);
            bundleA.putString("callback_name", str);
            a(bundleA, "ad_callback_blocked_after_hidden");
        }
    }

    private boolean b(String str) {
        if (((Boolean) this.f9291a.a(x4.f9971k7)).booleanValue()) {
            return this.f9291a.c(x4.f9962j7).contains(str) || this.f9292b.hasSubscriber(str);
        }
        return false;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (b("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (b("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (b("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (b("live_networks_updated")) {
            if (list != null && !list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("live_networks", new ArrayList<>(list));
                a(bundle, "live_networks_updated");
                return;
            }
            a(Bundle.EMPTY, "live_networks_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (b("responses")) {
            String strMaybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String strMaybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString("response", strMaybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i10, Object obj, String str3, boolean z10) {
        if (b("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i10);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z10);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (b(str)) {
            this.f9292b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f9291a.c(x4.f9962j7).contains(str)));
        }
    }

    public boolean a(String str) {
        return h7.f7626a.contains(str);
    }

    private Bundle a(y2 y2Var) {
        Bundle bundle = new Bundle();
        bundle.putString("id", y2Var.Q());
        bundle.putString(BrandSafetyEvent.f44576ad, y2Var.c());
        bundle.putString(BrandSafetyEvent.f44593l, y2Var.getAdUnitId());
        bundle.putString(BrandSafetyEvent.f44592k, y2Var.R());
        bundle.putString("ad_format", y2Var.getFormat().getLabel());
        BundleUtils.putStringIfValid("creative_id", y2Var.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", y2Var.v(), bundle);
        BundleUtils.putStringIfValid("dsp_name", y2Var.getDspName(), bundle);
        if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(y2Var.c())) {
            bundle.putString("custom_sdk_network_name", y2Var.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(y2Var.x()));
        if (y2Var instanceof h3) {
            View viewS0 = null;
            if (y2Var instanceof b3) {
                viewS0 = ((b3) y2Var).y();
            } else if (y2Var instanceof d3) {
                d3 d3Var = (d3) y2Var;
                if (!d3Var.x0()) {
                    viewS0 = d3Var.s0() != null ? d3Var.s0() : d3Var.t0();
                }
            }
            bundle.putString("ad_view", viewS0 != null ? e8.a(viewS0) : "N/A");
        } else if (y2Var instanceof c3) {
            Bundle bundle2 = ((c3) y2Var).q0().getBundle("applovin_ad_view_info");
            bundle.putString("ad_view", BundleUtils.getString("ad_view_address", "N/A", bundle2));
            bundle.putString("video_view", BundleUtils.getString("video_view_address", "N/A", bundle2));
        }
        return bundle;
    }
}
