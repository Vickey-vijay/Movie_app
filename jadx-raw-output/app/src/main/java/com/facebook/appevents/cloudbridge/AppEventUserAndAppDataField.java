package com.facebook.appevents.cloudbridge;

import ck.i;
import ck.p;
import com.applovin.sdk.AppLovinEventParameters;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;", "", "", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", VastTagName.COMPANION, "a", "ANON_ID", "APP_USER_ID", "ADVERTISER_ID", "PAGE_ID", "PAGE_SCOPED_USER_ID", "USER_DATA", "ADV_TE", "APP_TE", "CONSIDER_VIEWS", "DEVICE_TOKEN", "EXT_INFO", "INCLUDE_DWELL_DATA", "INCLUDE_VIDEO_DATA", "INSTALL_REFERRER", "INSTALLER_PACKAGE", "RECEIPT_DATA", "URL_SCHEMES", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public enum AppEventUserAndAppDataField {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA(AppLovinEventParameters.IN_APP_PURCHASE_DATA),
    URL_SCHEMES("url_schemes");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String rawValue;

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField$a;", "", "", "rawValue", "Lcom/facebook/appevents/cloudbridge/AppEventUserAndAppDataField;", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final AppEventUserAndAppDataField a(String rawValue) {
            p.j(rawValue, "rawValue");
            for (AppEventUserAndAppDataField appEventUserAndAppDataField : AppEventUserAndAppDataField.valuesCustom()) {
                if (p.e(appEventUserAndAppDataField.getRawValue(), rawValue)) {
                    return appEventUserAndAppDataField;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static AppEventUserAndAppDataField[] valuesCustom() {
        AppEventUserAndAppDataField[] appEventUserAndAppDataFieldArrValuesCustom = values();
        return (AppEventUserAndAppDataField[]) Arrays.copyOf(appEventUserAndAppDataFieldArrValuesCustom, appEventUserAndAppDataFieldArrValuesCustom.length);
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    AppEventUserAndAppDataField(String str) {
        this.rawValue = str;
    }
}
