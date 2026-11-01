package com.facebook.appevents.cloudbridge;

import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/cloudbridge/CustomEventField;", "", "", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", VastTagName.COMPANION, "a", "EVENT_TIME", "EVENT_NAME", "VALUE_TO_SUM", "CONTENT_IDS", "CONTENTS", "CONTENT_TYPE", NativeAdContent.ViewTag.AD_DESCRIPTION, "LEVEL", "MAX_RATING_VALUE", "NUM_ITEMS", "PAYMENT_INFO_AVAILABLE", "REGISTRATION_METHOD", "SEARCH_STRING", "SUCCESS", "ORDER_ID", "AD_TYPE", "CURRENCY", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public enum CustomEventField {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("fb_currency");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String rawValue;

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.CustomEventField$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/cloudbridge/CustomEventField$a;", "", "", "rawValue", "Lcom/facebook/appevents/cloudbridge/CustomEventField;", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final CustomEventField a(String rawValue) {
            p.j(rawValue, "rawValue");
            for (CustomEventField customEventField : CustomEventField.valuesCustom()) {
                if (p.e(customEventField.getRawValue(), rawValue)) {
                    return customEventField;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static CustomEventField[] valuesCustom() {
        CustomEventField[] customEventFieldArrValuesCustom = values();
        return (CustomEventField[]) Arrays.copyOf(customEventFieldArrValuesCustom, customEventFieldArrValuesCustom.length);
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    CustomEventField(String str) {
        this.rawValue = str;
    }
}
