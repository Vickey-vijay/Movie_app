package io.bidmachine.iab.mraid;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import tf.f;

/* JADX INFO: loaded from: classes6.dex */
public final class MraidNativeFeatureUrlParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f59232a = new f();

    @Nullable
    public MraidCalendarEvent parseCalendarEvent(@NonNull Uri uri) {
        try {
            return this.f59232a.a(Uri.decode(uri.getQueryParameter("eventJson")));
        } catch (Exception e10) {
            MraidLog.e("MraidNativeFeatureUrlParser", e10);
            return null;
        }
    }

    @Nullable
    public Uri parseStorePictureUri(@NonNull Uri uri) {
        try {
            return Uri.parse(Uri.decode(uri.getQueryParameter("url")));
        } catch (Exception e10) {
            MraidLog.e("MraidNativeFeatureUrlParser", e10);
            return null;
        }
    }

    @Nullable
    public MraidCalendarEvent parseCalendarEvent(@NonNull String str) {
        try {
            return parseCalendarEvent(Uri.parse(str));
        } catch (Exception e10) {
            MraidLog.e("MraidNativeFeatureUrlParser", e10);
            return null;
        }
    }

    @Nullable
    public Uri parseStorePictureUri(@NonNull String str) {
        try {
            return parseStorePictureUri(Uri.parse(str));
        } catch (Exception e10) {
            MraidLog.e("MraidNativeFeatureUrlParser", e10);
            return null;
        }
    }
}
