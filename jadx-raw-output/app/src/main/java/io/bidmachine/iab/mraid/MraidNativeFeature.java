package io.bidmachine.iab.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class MraidNativeFeature {

    @NonNull
    public static final String FEATURE_CALENDAR = "calendar";

    @NonNull
    public static final String FEATURE_SMS = "sms";

    @NonNull
    public static final String FEATURE_STORE_PICTURE = "storePicture";

    @NonNull
    public static final String FEATURE_TEL = "tel";

    @NonNull
    public static final String FEATURE_INLINE_VIDEO = "inlineVideo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f59225a = {"sms", "tel", FEATURE_INLINE_VIDEO, "calendar", "storePicture"};

    private MraidNativeFeature() {
    }

    private static ArrayList a(MraidNativeFeatureManager mraidNativeFeatureManager) {
        ArrayList arrayList = new ArrayList();
        if (mraidNativeFeatureManager.isTelFeatureAvailable()) {
            arrayList.add("tel");
        }
        if (mraidNativeFeatureManager.isSmsFeatureAvailable()) {
            arrayList.add("sms");
        }
        if (mraidNativeFeatureManager.isInlineVideoFeatureAvailable()) {
            arrayList.add(FEATURE_INLINE_VIDEO);
        }
        if (mraidNativeFeatureManager.isCalendarFeatureAvailable()) {
            arrayList.add("calendar");
        }
        if (mraidNativeFeatureManager.isStorePictureFeatureAvailable()) {
            arrayList.add("storePicture");
        }
        return arrayList;
    }

    @NonNull
    public static String[] getSupportedFeatures(@NonNull Context context) {
        return (String[]) a(new MraidNativeFeatureManager(context, f59225a)).toArray(new String[0]);
    }
}
