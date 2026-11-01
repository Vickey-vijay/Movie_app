package com.safedk.android.internal.partials;

import android.media.MediaPlayer;
import android.view.Surface;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;

/* JADX INFO: compiled from: AdMobSourceFile */
/* JADX INFO: loaded from: classes.dex */
public class AdMobVideoBridge {
    public static void MediaPlayerStart(MediaPlayer mp) throws IllegalStateException {
        Logger.d("AdMobVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AdMobVideoBridge;->MediaPlayerStart(Landroid/media/MediaPlayer;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: " + mp + ", isOnUiThread = " + k.c());
                CreativeInfoManager.a(g.f44962h, mp);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: " + e10.getMessage());
            }
        }
        mp.start();
    }

    public static void MediaPlayerStop(MediaPlayer mp) throws IllegalStateException {
        Logger.d("AdMobVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AdMobVideoBridge;->MediaPlayerStop(Landroid/media/MediaPlayer;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStop: " + mp + ", isOnUiThread = " + k.c());
                CreativeInfoManager.onVideoCompleted(g.f44962h, mp);
            } catch (Exception e10) {
                Logger.d("VideoBridge", "exception in MediaPlayerStop: " + e10.getMessage());
            }
        }
        mp.stop();
    }

    public static void MediaPlayerSetSurface(MediaPlayer mp, Surface surface) {
        Logger.d("AdMobVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AdMobVideoBridge;->MediaPlayerSetSurface(Landroid/media/MediaPlayer;Landroid/view/Surface;)V");
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
