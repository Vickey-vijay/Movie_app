package io.bidmachine.unified;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.Function;
import io.bidmachine.utils.data.DataRetriever;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface UnifiedMediationParams extends DataRetriever<String> {
    public static final String KEY_AD_LABEL = "adLabel";
    public static final String KEY_CACHE_CONTROL = "cacheControl";
    public static final String KEY_CLICK_URL = "clickUrl";
    public static final String KEY_CLOSE_BUTTON_CONTROL_ASSET = "close_button_control_asset";
    public static final String KEY_COMPANION_SKIP_OFFSET = "companionSkipOffset";
    public static final String KEY_COUNTDOWN_CONTROL_ASSET = "countdown_control_asset";
    public static final String KEY_CREATIVE_ADM = "creativeAdm";
    public static final String KEY_CREATIVE_ID = "creativeId";
    public static final String KEY_CTA = "cta";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_ICON_URL = "iconUrl";
    public static final String KEY_IMAGE_URL = "imageUrl";
    public static final String KEY_OM_SDK_ENABLED = "omsdk_enabled";
    public static final String KEY_PLACEHOLDER_TIMEOUT_SEC = "placeholderTimeoutSec";
    public static final String KEY_PRIVACY_SHEET = "privacySheet";
    public static final String KEY_PROGRESS_CONTROL_ASSET = "progress_control_asset";
    public static final String KEY_PROGRESS_DURATION = "progress_duration";
    public static final String KEY_R1 = "r1";
    public static final String KEY_R2 = "r2";
    public static final String KEY_RATING = "rating";
    public static final String KEY_RENDERING_CONFIGURATION = "rendering_configuration";
    public static final String KEY_SKIP_OFFSET = "skipOffset";
    public static final String KEY_STORE_URL = "store_url";
    public static final String KEY_TITLE = "title";
    public static final String KEY_USE_NATIVE_CLOSE = "useNativeClose";
    public static final String KEY_VIDEO_ADM = "videoAdm";
    public static final String KEY_VIDEO_URL = "videoUrl";
    public static final String KEY_VIEWABILITY_IGNORE_OVERLAP = "viewability_ignore_overlap";
    public static final String KEY_VIEWABILITY_IGNORE_WINDOW_FOCUS = "viewability_ignore_window_focus";
    public static final String KEY_VIEWABILITY_PIXEL_THRESHOLD = "viewability_pixel_threshold";
    public static final String KEY_VIEWABILITY_TIME_THRESHOLD_SEC = "viewability_time_threshold_sec";
    public static final String KEY_WIDTH = "width";

    @Override // io.bidmachine.utils.data.DataRetriever
    /* synthetic */ boolean contains(@NonNull String str);

    @Override // 
    /* bridge */ /* synthetic */ default boolean getBoolean(@NonNull String str) {
        return super.getBoolean(str);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    /* synthetic */ boolean getBoolean(@NonNull String str, boolean z10);

    @Override // 
    @Nullable
    /* bridge */ /* synthetic */ default Boolean getBooleanOrNull(@NonNull String str) {
        return super.getBooleanOrNull(str);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    /* synthetic */ Boolean getBooleanOrNull(@NonNull String str, @Nullable Boolean bool);

    @Override // 
    /* bridge */ /* synthetic */ default double getDouble(@NonNull String str) {
        return super.getDouble(str);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    /* synthetic */ double getDouble(@NonNull String str, double d10);

    @Override // 
    @Nullable
    /* bridge */ /* synthetic */ default Double getDoubleOrNull(@NonNull String str) {
        return super.getDoubleOrNull(str);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    /* synthetic */ Double getDoubleOrNull(@NonNull String str, @Nullable Double d10);

    @Override // 
    /* bridge */ /* synthetic */ default float getFloat(@NonNull String str) {
        return super.getFloat(str);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    /* synthetic */ float getFloat(@NonNull String str, float f10);

    @Override // 
    @Nullable
    /* bridge */ /* synthetic */ default Float getFloatOrNull(@NonNull String str) {
        return super.getFloatOrNull(str);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    /* synthetic */ Float getFloatOrNull(@NonNull String str, @Nullable Float f10);

    @Override // 
    /* bridge */ /* synthetic */ default int getInteger(@NonNull String str) {
        return super.getInteger(str);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    /* synthetic */ int getInteger(@NonNull String str, int i10);

    @Override // 
    @Nullable
    /* bridge */ /* synthetic */ default Integer getIntegerOrNull(@NonNull String str) {
        return super.getIntegerOrNull(str);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    /* synthetic */ Integer getIntegerOrNull(@NonNull String str, @Nullable Integer num);

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    /* synthetic */ List getListOrNull(@NonNull String str);

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    /* synthetic */ Map getMapOrNull(@NonNull String str);

    @Override // 
    @Nullable
    /* bridge */ /* synthetic */ default Object getObjectOrNull(@NonNull String str) {
        return super.getObjectOrNull(str);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    /* synthetic */ Object getObjectOrNull(@NonNull String str, @Nullable Object obj);

    @Override // 
    @Nullable
    /* bridge */ /* synthetic */ default Object getOrNull(@NonNull String str) throws Exception {
        return super.getOrNull(str);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    /* synthetic */ Object getOrNull(@NonNull String str, @Nullable Object obj) throws Exception;

    @Override // 
    @Nullable
    /* bridge */ /* synthetic */ default Object getOrNullSafely(@NonNull String str, @NonNull Function function) {
        return super.getOrNullSafely(str, function);
    }

    @Override // 
    @Nullable
    /* bridge */ /* synthetic */ default Object getOrNullSafely(@NonNull String str, @Nullable Object obj, @NonNull Function function) {
        return super.getOrNullSafely(str, obj, function);
    }

    @Override // 
    @Nullable
    /* bridge */ /* synthetic */ default String getStringOrNull(@NonNull String str) {
        return super.getStringOrNull(str);
    }

    @Override // io.bidmachine.utils.data.DataRetriever
    @Nullable
    /* synthetic */ String getStringOrNull(@NonNull String str, @Nullable String str2);
}
