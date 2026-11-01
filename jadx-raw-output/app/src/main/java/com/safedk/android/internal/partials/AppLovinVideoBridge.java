package com.safedk.android.internal.partials;

import android.net.Uri;
import android.widget.VideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: AppLovinSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinVideoBridge {
    public static void VideoViewPlay(VideoView vv) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewPlay(Landroid/widget/VideoView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player " + vv + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f44955a, (Object) vv);
                CreativeInfoManager.a(g.f44955a, BrandSafetyUtils.a(vv), false);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: " + e10.getMessage());
            }
        }
        vv.start();
    }

    public static void VideoViewStop(VideoView vv) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewStop(Landroid/widget/VideoView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewStop: player " + vv + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f44955a, BrandSafetyUtils.a(vv), true);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewStop : " + e10.getMessage());
            }
        }
        vv.stopPlayback();
    }

    public static void VideoViewSetVideoUri(VideoView vv, Uri uri) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewSetVideoUri(Landroid/widget/VideoView;Landroid/net/Uri;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewSetVideoUri: player " + vv + ", uri: " + uri + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f44955a, vv, uri);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewSetVideoPath: " + e10.getMessage());
            }
        }
        vv.setVideoURI(uri);
    }

    public static String stringInit(byte[] bytes, String charSet) throws UnsupportedEncodingException {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->stringInit([BLjava/lang/String;)Ljava/lang/String;");
        String str = new String(bytes, charSet);
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "stringInit started , isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f44955a);
                if (str.contains("\"ads\"")) {
                    CreativeInfoManager.a(g.f44955a, "@!1:ad_fetch@!", str, (Map<String, List<String>>) null);
                }
            } catch (Throwable th2) {
            }
        }
        return str;
    }
}
