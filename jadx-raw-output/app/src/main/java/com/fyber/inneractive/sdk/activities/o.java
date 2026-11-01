package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f14865a;

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/o;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.g.f44970p, mediaPlayer);
        safedk_o_onCompletion_d45807838ff482b5c22e3c37b6822b00(mediaPlayer);
    }

    public o(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f14865a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    public void safedk_o_onCompletion_d45807838ff482b5c22e3c37b6822b00(MediaPlayer p10) {
        this.f14865a.finish();
    }
}
