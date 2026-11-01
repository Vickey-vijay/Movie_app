package yads;

import android.location.Location;
import android.net.Uri;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.G5;
import com.ironsource.Q6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class yu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9 f85113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tm0 f85114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kk.i f85115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kk.i f85116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mj.g f85117e;

    public final void a(Map map, uu0 uu0Var) {
        if (!uu0Var.f83627g || uu0Var.f83625f) {
            a(map, CommonUrlParts.UUID, uu0Var.f83655u);
        }
        if (uu0Var.f83627g) {
            return;
        }
        a(map, "age", uu0Var.f83664y0);
        a(map, InneractiveMediationDefs.KEY_GENDER, uu0Var.f83666z0);
        a(map, "context_query", uu0Var.U);
        a(map, "context_taglist", uu0Var.V);
        a(map, "google_aid", uu0Var.P);
        a(map, CommonUrlParts.APP_SET_ID, uu0Var.f83637l);
        a(map, "huawei_oaid", uu0Var.R);
        a(map, "mauid", uu0Var.f83639m);
        a(map, this.f85113a.a(), uu0Var.f83648q0);
        a(map, "mcc", uu0Var.F);
        a(map, "mnc", uu0Var.G);
        a(map, "cellid", uu0Var.K);
        a(map, "lac", uu0Var.L);
        a(map, "wifi", uu0Var.M);
        a(map, "battery_charge", uu0Var.S);
        a(map, "server_side_client_ip", uu0Var.L0);
        a(map, "ipv6", uu0Var.M0);
    }

    public final void b(Map map, uu0 uu0Var) {
        Location location;
        if (uu0Var.f83615a) {
            return;
        }
        g9 g9Var = uu0Var.J;
        if (g9Var == null || (location = g9Var.f77701f) == null) {
            location = uu0Var.B;
        }
        if (location != null) {
            Object obj = dw2.f76819j;
            if (cw2.a().a()) {
                a(map, Q6.f27466s, String.valueOf(location.getLatitude()));
                a(map, "lon", String.valueOf(location.getLongitude()));
                a(map, "location_timestamp", String.valueOf(location.getTime()));
                a(map, "precision", String.valueOf((int) location.getAccuracy()));
            }
        }
    }

    public final String toString() {
        return (String) this.f85117e.getValue();
    }

    public yu0(uu0 uu0Var) {
        String strP0;
        k9 k9Var = new k9();
        this.f85113a = k9Var;
        this.f85114b = new tm0();
        Map mapD = nj.l0.d();
        a(mapD, "ad_unit_id", uu0Var.c());
        a(mapD, "width", uu0Var.o0());
        a(mapD, "height", uu0Var.B());
        a(mapD, "ad_size_type", uu0Var.a());
        a(mapD, "orientation", uu0Var.K());
        a(mapD, "ads_count", uu0Var.f());
        a(mapD, CommonUrlParts.SCREEN_WIDTH, uu0Var.a0());
        a(mapD, CommonUrlParts.SCREEN_HEIGHT, uu0Var.Z());
        a(mapD, CommonUrlParts.SCALE_FACTOR, uu0Var.X());
        a(mapD, "ad_type", uu0Var.b());
        a(mapD, "network_type", uu0Var.H());
        a(mapD, Q6.Q0, uu0Var.m());
        a(mapD, "dnt", uu0Var.z());
        a(mapD, "gaid_reset", uu0Var.v());
        a(mapD, "huawei_dnt", uu0Var.C());
        a(mapD, "image_sizes", uu0Var.D());
        a(mapD, "response_ad_format", uu0Var.S());
        a(mapD, "debug_uid", uu0Var.s());
        a(mapD, "open_bidding_data", uu0Var.I());
        a(mapD, "session_random", uu0Var.e0());
        a(mapD, G5.M, uu0Var.n());
        a(mapD, k9Var.b(), uu0Var.u());
        a(mapD, k9Var.f(), uu0Var.L());
        a(mapD, k9Var.g(), uu0Var.M());
        a(mapD, k9Var.d(), uu0Var.F());
        a(mapD, k9Var.e(), uu0Var.G());
        a(mapD, k9Var.c(), uu0Var.p0());
        a(mapD, CommonUrlParts.LOCALE, uu0Var.E());
        a(mapD, "content_language", uu0Var.i());
        List listO = uu0Var.O();
        if (listO != null) {
            strP0 = nj.b0.p0(listO, StringUtils.PROCESS_POSTFIX_DELIMITER, null, null, 0, null, null, 62, null);
        } else {
            strP0 = null;
        }
        a(mapD, "device_languages", strP0);
        a(mapD, "app_id", uu0Var.h());
        a(mapD, "app_version_code", uu0Var.k());
        a(mapD, CommonUrlParts.APP_VERSION, uu0Var.l());
        a(mapD, "appmetrica_version", uu0Var.j());
        a(mapD, CommonUrlParts.SCREEN_DPI, Integer.valueOf(uu0Var.Y()));
        a(mapD, "safe_area_inset_left", Float.valueOf(uu0Var.U()));
        a(mapD, "safe_area_inset_top", Float.valueOf(uu0Var.W()));
        a(mapD, "safe_area_inset_right", Float.valueOf(uu0Var.V()));
        a(mapD, "safe_area_inset_bottom", Float.valueOf(uu0Var.T()));
        a(mapD, "cutout_safe_area_inset_top", Float.valueOf(uu0Var.r()));
        a(mapD, "cutout_safe_area_inset_bottom", Float.valueOf(uu0Var.q()));
        a(mapD, "user_consent", uu0Var.j0());
        a(mapD, InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, uu0Var.w());
        a(mapD, InMobiSdk.IM_GDPR_CONSENT_IAB, uu0Var.x());
        a(mapD, "cmp_present", Boolean.valueOf(uu0Var.o()));
        a(mapD, "parsed_purpose_consents", uu0Var.R());
        a(mapD, "parsed_vendor_consents", uu0Var.k0());
        a(mapD, "addtl_consent", uu0Var.d());
        a(mapD, "bidding_data", uu0Var.A());
        a(mapD, "prefetched_mediation_data", uu0Var.Q());
        a(mapD, "connected_network_ids", uu0Var.p());
        a(mapD, "sdk_version", uu0Var.b0());
        a(mapD, "sdk_version_name", uu0Var.c0());
        a(mapD, "sdk_vendor", "yandex");
        a(mapD, "preferred_theme", uu0Var.P());
        a(mapD, "device_theme", uu0Var.t());
        a(mapD, "age_restricted_user", uu0Var.g());
        a(mapD, "view_size_info", uu0Var.l0());
        a(mapD, "web_view_available", uu0Var.n0());
        a(mapD, "startup_version", uu0Var.g0());
        a(mapD, "session-data", uu0Var.d0());
        a(mapD, "user-agent", uu0Var.i0());
        a(mapD, "stub_reason", uu0Var.h0());
        a(mapD, "gms_available", uu0Var.y());
        a(mapD, "opt_out", uu0Var.J());
        a(mapD, "vpn_enabled", uu0Var.m0());
        a(mapD, uu0Var.f0());
        a(mapD, uu0Var.N());
        a(mapD, uu0Var);
        b(mapD, uu0Var);
        this.f85115c = nj.n0.C(nj.l0.c(mapD));
        Map mapD2 = nj.l0.d();
        for (Map.Entry entry : uu0Var.e().entrySet()) {
            a(mapD2, (String) entry.getKey(), entry.getValue());
        }
        this.f85116d = nj.n0.C(nj.l0.c(mapD2));
        this.f85117e = kotlin.b.a(new xu0(this));
    }

    public final void a(Map map, String str, Boolean bool) {
        if (bool != null) {
            a(map, str, Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
    }

    public final void a(Map map, String str, Object obj) {
        String strEncode;
        if (obj != null) {
            String strEncode2 = Uri.encode(str);
            if (!this.f85114b.f83085a.contains(str)) {
                strEncode = Uri.encode(obj.toString());
            } else {
                strEncode = Uri.encode(obj.toString(), StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            map.put(strEncode2, strEncode);
        }
    }

    public final void a(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            a(map, (String) entry.getKey(), (String) entry.getValue());
        }
    }
}
