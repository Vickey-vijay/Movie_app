package tf;

import android.net.Uri;
import io.bidmachine.iab.mraid.MraidLog;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public String a(String str) {
        try {
            return new Uri.Builder().scheme("calendar").authority("mraid").appendQueryParameter("eventJson", str).build().toString();
        } catch (Exception e10) {
            MraidLog.e("MraidNativeFeatureUrlFactory", e10);
            return null;
        }
    }

    public String b(String str) {
        try {
            return new Uri.Builder().scheme("storePicture").authority("mraid").appendQueryParameter("url", str).build().toString();
        } catch (Exception e10) {
            MraidLog.e("MraidNativeFeatureUrlFactory", e10);
            return null;
        }
    }
}
