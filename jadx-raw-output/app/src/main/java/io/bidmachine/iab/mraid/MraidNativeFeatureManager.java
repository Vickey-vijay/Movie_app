package io.bidmachine.iab.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.SystemFeatureAvailability;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MraidNativeFeatureManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f59226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f59227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f59228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f59229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f59230e;

    public MraidNativeFeatureManager(@NonNull Context context, @Nullable List<String> list) {
        SystemFeatureAvailability systemFeatureAvailability = new SystemFeatureAvailability(context);
        this.f59226a = a("sms", list) && systemFeatureAvailability.hasTelephony();
        this.f59227b = a("tel", list) && systemFeatureAvailability.hasTelephony();
        this.f59228c = a(MraidNativeFeature.FEATURE_INLINE_VIDEO, list);
        this.f59229d = a("calendar", list);
        this.f59230e = a("storePicture", list);
    }

    private boolean a(String str, List list) {
        return list != null && list.contains(str);
    }

    public boolean isCalendarFeatureAvailable() {
        return this.f59229d;
    }

    public boolean isInlineVideoFeatureAvailable() {
        return this.f59228c;
    }

    public boolean isSmsFeatureAvailable() {
        return this.f59226a;
    }

    public boolean isStorePictureFeatureAvailable() {
        return this.f59230e;
    }

    public boolean isTelFeatureAvailable() {
        return this.f59227b;
    }

    public MraidNativeFeatureManager(@NonNull Context context, @Nullable String[] strArr) {
        this(context, (List<String>) (strArr != null ? Arrays.asList(strArr) : null));
    }
}
