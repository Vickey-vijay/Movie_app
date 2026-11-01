package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C3444e4;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Yl implements IParamsAppender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4244he f56257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4446pd f56258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ib f56259c = new Ib();

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C4123cm c4123cm) {
        String str;
        C4424og c4424og;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.DEVICE_ID), c4123cm.getDeviceId());
        a(builder, C4418oa.I.h(), this.f56259c);
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.APP_SET_ID), c4123cm.getAppSetId());
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.APP_SET_ID_SCOPE), c4123cm.getAppSetIdScope());
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.APP_PLATFORM), c4123cm.getAppPlatform());
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.PROTOCOL_VERSION), c4123cm.getProtocolVersion());
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c4123cm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f56257a.a("model"), c4123cm.getModel());
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.MANUFACTURER), c4123cm.getManufacturer());
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.OS_VERSION), c4123cm.getOsVersion());
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c4123cm.getScreenWidth()));
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c4123cm.getScreenHeight()));
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c4123cm.getScreenDpi()));
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c4123cm.getScaleFactor()));
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.LOCALE), c4123cm.getLocale());
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.DEVICE_TYPE), c4123cm.getDeviceType());
        builder.appendQueryParameter(this.f56257a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f56257a.a("query_hosts"), String.valueOf(2));
        String strA = this.f56257a.a("features");
        List<String> listH = ((C4677yk) this.f56258b).h();
        String[] strArr = {this.f56257a.a("permissions_collecting"), this.f56257a.a("features_collecting"), this.f56257a.a("google_aid"), this.f56257a.a("huawei_oaid"), this.f56257a.a("sim_info"), this.f56257a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(listH);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(strA, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f56257a.a("app_id"), c4123cm.getPackageName());
        builder.appendQueryParameter(this.f56257a.a("app_debuggable"), ((O5) c4123cm).f55669a);
        if (c4123cm.f56540l) {
            String str2 = c4123cm.f56541m;
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f56257a.a("country_init"), str2);
            }
        } else {
            builder.appendQueryParameter(this.f56257a.a("detect_locale"), String.valueOf(1));
        }
        C4510s3 c4510s3 = c4123cm.f56537i;
        if (!mo.a(c4510s3.f57645a)) {
            builder.appendQueryParameter(this.f56257a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f56257a.a("clids_set"), Gm.a(c4510s3.f57645a));
            int iOrdinal = c4510s3.f57646b.ordinal();
            if (iOrdinal == 1) {
                str = "api";
            } else if (iOrdinal != 2) {
                str = iOrdinal != 3 ? "" : "retail";
            } else {
                str = "satellite";
            }
            builder.appendQueryParameter(this.f56257a.a("clids_set_source"), str);
            String str3 = c4123cm.f56534f;
            String str4 = c4123cm.f56535g;
            if (TextUtils.isEmpty(str3) && (c4424og = c4123cm.f56543o.f57282b) != null) {
                str3 = c4424og.f57445a;
                str4 = c4424og.f57448d.f57353a;
            }
            if (!TextUtils.isEmpty(str3)) {
                builder.appendQueryParameter(this.f56257a.a("install_referrer"), str3);
                if (str4 == null) {
                    str4 = "null";
                }
                builder.appendQueryParameter(this.f56257a.a("install_referrer_source"), str4);
            }
        }
        String uuid = c4123cm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f56257a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f56257a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f56257a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f56257a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f56257a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f56257a.a("app_system_flag"), ((O5) c4123cm).f55670b);
        builder.appendQueryParameter(this.f56257a.a(C3444e4.f28728c), String.valueOf(1));
        builder.appendQueryParameter(this.f56257a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f56257a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> mapD = ((C4677yk) this.f56258b).d();
        for (String str5 : mapD.keySet()) {
            builder.appendQueryParameter(str5, String.valueOf(mapD.get(str5)));
        }
    }

    public Yl(@NonNull C4244he c4244he, @NonNull InterfaceC4446pd interfaceC4446pd) {
        this.f56257a = c4244he;
        this.f56258b = interfaceC4446pd;
    }

    public final void a(@NonNull Uri.Builder builder, @NonNull DataSendingRestrictionController dataSendingRestrictionController, @NonNull Ib ib2) {
        ib2.getClass();
        AdvertisingIdsHolder identifiers = C4418oa.I.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f56257a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
