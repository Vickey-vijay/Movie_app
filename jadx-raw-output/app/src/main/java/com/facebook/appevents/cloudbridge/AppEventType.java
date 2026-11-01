package com.facebook.appevents.cloudbridge;

import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventType;", "", "<init>", "(Ljava/lang/String;I)V", VastTagName.COMPANION, "a", "MOBILE_APP_INSTALL", "CUSTOM", NativeAdContent.ViewTag.OTHER, "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public enum AppEventType {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventType$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AppEventsConversionsAPITransformer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventType$a;", "", "", "rawValue", "Lcom/facebook/appevents/cloudbridge/AppEventType;", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final AppEventType a(String rawValue) {
            p.j(rawValue, "rawValue");
            if (p.e(rawValue, "MOBILE_APP_INSTALL")) {
                return AppEventType.MOBILE_APP_INSTALL;
            }
            return p.e(rawValue, "CUSTOM_APP_EVENTS") ? AppEventType.CUSTOM : AppEventType.OTHER;
        }
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static AppEventType[] valuesCustom() {
        AppEventType[] appEventTypeArrValuesCustom = values();
        return (AppEventType[]) Arrays.copyOf(appEventTypeArrValuesCustom, appEventTypeArrValuesCustom.length);
    }
}
