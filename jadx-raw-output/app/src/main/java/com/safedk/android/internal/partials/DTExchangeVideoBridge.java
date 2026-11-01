package com.safedk.android.internal.partials;

import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.VideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.io.IOException;

/* JADX INFO: compiled from: DTExchangeSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class DTExchangeVideoBridge {
    public static void VideoViewPlay(VideoView vv) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->VideoViewPlay(Landroid/widget/VideoView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player " + vv + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f44970p, (Object) vv);
                CreativeInfoManager.a(g.f44970p, BrandSafetyUtils.a(vv), false);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: " + e10.getMessage());
            }
        }
        vv.start();
    }

    public static void VideoViewSetVideoPath(VideoView vv, String url) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->VideoViewSetVideoPath(Landroid/widget/VideoView;Ljava/lang/String;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "VideoViewSetVideoPath: player " + vv + ", path: " + url + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f44970p, vv, url);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in VideoViewSetVideoPath: " + e10.getMessage());
            }
        }
        vv.setVideoPath(url);
    }

    public static void MediaPlayerStart(MediaPlayer mp) throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerStart(Landroid/media/MediaPlayer;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: " + mp + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f44970p, mp);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: " + e10.getMessage());
            }
        }
        mp.start();
    }

    public static void MediaPlayerStop(MediaPlayer mp) throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerStop(Landroid/media/MediaPlayer;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStop: " + mp + ", isOnUiThread = " + k.c());
                CreativeInfoManager.onVideoCompleted(g.f44970p, mp);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in MediaPlayerStop: " + e10.getMessage());
            }
        }
        mp.stop();
    }

    public static void MediaPlayerSetDataSource(MediaPlayer mp, String path) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerSetDataSource(Landroid/media/MediaPlayer;Ljava/lang/String;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetDataSource: player " + mp + ", path " + path + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f44970p, mp, path);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetDataSource: " + e10.getMessage());
            }
        }
        mp.setDataSource(path);
    }

    public static void MediaPlayerSetSurface(MediaPlayer mp, Surface surface) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerSetSurface(Landroid/media/MediaPlayer;Landroid/view/Surface;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetSurface: player " + mp + ", surface " + surface + ", isOnUiThread = " + k.c());
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetSurface: " + e10.getMessage());
            }
        }
        mp.setSurface(surface);
    }
}
