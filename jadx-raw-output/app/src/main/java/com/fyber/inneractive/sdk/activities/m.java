package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeVideoBridge;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f14863a;

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.a("onPrepared", new Object[0]);
        InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore = this.f14863a;
        inneractiveRichMediaVideoPlayerActivityCore.f14845a.seekTo(inneractiveRichMediaVideoPlayerActivityCore.f14846b);
        DTExchangeVideoBridge.VideoViewPlay(this.f14863a.f14845a);
    }

    public m(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f14863a = inneractiveRichMediaVideoPlayerActivityCore;
    }
}
