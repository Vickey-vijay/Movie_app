package com.inmobi.media;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes6.dex */
public final class Lm implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.c f23113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K2 f23114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f23116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f23117e;

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i10) {
        if (i10 == 3) {
            if (this.f23113a.isActive()) {
                int iA = this.f23114b.a(this.f23115c);
                InterfaceC3028m9 interfaceC3028m9 = this.f23116d;
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).a("VideoLoaderHelper", "Media loaded successfully from URL with cache progress: " + iA);
                }
                P4.a(this.f23113a, new C2852f8(iA, this.f23117e.getDuration(), this.f23115c));
            }
            this.f23117e.removeListener(this);
        }
    }

    public Lm(kotlinx.coroutines.c cVar, K2 k10, String str, InterfaceC3028m9 interfaceC3028m9, ExoPlayer exoPlayer) {
        this.f23113a = cVar;
        this.f23114b = k10;
        this.f23115c = str;
        this.f23116d = interfaceC3028m9;
        this.f23117e = exoPlayer;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        ck.p.j(playbackException, "error");
        InterfaceC3028m9 interfaceC3028m9 = this.f23116d;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("VideoLoaderHelper", "Failed to load URL (" + this.f23115c + "): " + playbackException.getMessage());
        }
        if (this.f23113a.isActive()) {
            P4.a(this.f23113a, new C2775c8(Am.NETWORK));
        }
        this.f23117e.removeListener(this);
        this.f23117e.stop();
        this.f23117e.clearMediaItems();
    }
}
