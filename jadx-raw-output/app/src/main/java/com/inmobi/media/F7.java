package com.inmobi.media;

import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import com.google.common.collect.ImmutableList;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class F7 implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f22623a;

    public F7(N7 n10) {
        this.f22623a = n10;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        ck.p.j(playbackException, "error");
        InterfaceC3028m9 interfaceC3028m9 = this.f22623a.f23197b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("HtmlMediaPlayer", "Playback error: " + playbackException.getErrorCodeName(), playbackException);
        }
        this.f22623a.f23207l.set(EnumC3184sg.STATE_ERROR);
        N7 n10 = this.f22623a;
        int i10 = playbackException.errorCode;
        String errorCodeName = playbackException.getErrorCodeName();
        ck.p.i(errorCodeName, "getErrorCodeName(...)");
        n10.a(new C2928i8(errorCodeName));
        this.f22623a.f();
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        Tracks.Group next;
        ck.p.j(tracks, "tracks");
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        ck.p.i(groups, "getGroups(...)");
        Iterator<Tracks.Group> it = groups.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getType() != 2);
        Tracks.Group group = next;
        if (group != null) {
            N7 n10 = this.f22623a;
            int i10 = group.getMediaTrackGroup().length;
            for (int i11 = 0; i11 < i10; i11++) {
                Format format = group.getMediaTrackGroup().getFormat(i11);
                ck.p.i(format, "getFormat(...)");
                InterfaceC3028m9 interfaceC3028m9 = n10.f23197b;
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).b("HtmlMediaPlayer", "Metadata loaded: " + format.width + VastAttributes.HORIZONTAL_POSITION + format.height + ", " + format.sampleMimeType);
                }
                n10.a(C2903h8.f24487a);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        ck.p.j(videoSize, "videoSize");
        InterfaceC3028m9 interfaceC3028m9 = this.f22623a.f23197b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("HtmlMediaPlayer", "onVideoSizeChanged: width=" + videoSize.width + ", height=" + videoSize.height + ", ratio=" + videoSize.pixelWidthHeightRatio);
        }
        this.f22623a.f23204i = (int) (videoSize.width * videoSize.pixelWidthHeightRatio);
        this.f22623a.f23205j = videoSize.height;
        N7 n10 = this.f22623a;
        G1 g10 = n10.f23209n;
        int i10 = n10.f23204i;
        int i11 = this.f22623a.f23205j;
        g10.getClass();
        if (i10 > 0 && i11 > 0) {
            g10.f22709a = i10 / i11;
            g10.requestLayout();
        }
        this.f22623a.f23221z.f24966d.a(videoSize.width, videoSize.height);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(boolean z10) {
        super.onIsLoadingChanged(z10);
        if (!z10) {
            this.f22623a.f23210o.setVisibility(8);
        } else {
            this.f22623a.f23210o.setVisibility(0);
        }
        if (this.f22623a.f23211p.getPlaybackState() == 3 && this.f22623a.f23211p.getBufferedPercentage() == 100) {
            this.f22623a.a(W7.f23729a);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i10) {
        super.onPlaybackStateChanged(i10);
        if (i10 == 4) {
            InterfaceC3028m9 interfaceC3028m9 = this.f22623a.f23197b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("HtmlMediaPlayer", "Playback ended");
            }
            C3224u6 c3224u6 = this.f22623a.f23219x;
            if (c3224u6.f25438g != 2) {
                c3224u6.f25438g = 2;
                nk.j.d(c3224u6.f25433b, nk.w0.c().n(), null, new C3125q6(c3224u6, c3224u6.f25432a.getDuration(), null), 2, null);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(float f10) {
        super.onVolumeChanged(f10);
        if (f10 == 0.0f || f10 == 1.0f) {
            return;
        }
        N7 n10 = this.f22623a;
        boolean z10 = n10.f23220y.f23493e;
        n10.a(new Vn());
    }
}
