package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import com.safedk.android.internal.partials.InMobiVideoBridge;

/* JADX INFO: loaded from: classes7.dex */
public final class Rd implements Ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sd f23451a;

    public Rd(Sd sd2) {
        this.f23451a = sd2;
    }

    @Override // com.inmobi.media.Ij
    public final void a() {
        Sd sd2 = this.f23451a;
        EnumC3184sg enumC3184sg = sd2.f23509e;
        if (enumC3184sg == EnumC3184sg.STATE_PAUSED || enumC3184sg == EnumC3184sg.STATE_PREPARED) {
            Context context = sd2.f23511g.getContext();
            ck.p.i(context, "getContext(...)");
            if (Rm.a(context, sd2.f23506b.f23411a)) {
                C2729ae c2729ae = sd2.f23513i;
                P4.a(c2729ae.f23993b, new Yd(c2729ae, null));
                sd2.f23514j.b();
                MediaPlayer mediaPlayer = sd2.f23512h;
                ck.p.j(mediaPlayer, "<this>");
                try {
                    InMobiVideoBridge.MediaPlayerStart(mediaPlayer);
                } catch (IllegalStateException unused) {
                }
                P4.a(sd2.f23510f, sd2.f23505a, new C2918hn(sd2.f23512h.getCurrentPosition()));
                sd2.f23509e = EnumC3184sg.STATE_PLAYING;
            }
        }
    }

    @Override // com.inmobi.media.Ij
    public final void b() {
        Sd sd2 = this.f23451a;
        if (sd2.f23509e != EnumC3184sg.STATE_PLAYING) {
            return;
        }
        MediaPlayer mediaPlayer = sd2.f23512h;
        ck.p.j(mediaPlayer, "<this>");
        try {
            mediaPlayer.pause();
        } catch (IllegalStateException unused) {
        }
        sd2.f23514j.c();
        C2729ae c2729ae = sd2.f23513i;
        P4.a(c2729ae.f23993b, new Xd(c2729ae, null));
        P4.a(sd2.f23510f, sd2.f23505a, new Om(sd2.f23512h.getCurrentPosition()));
        sd2.f23509e = EnumC3184sg.STATE_PAUSED;
    }

    @Override // com.inmobi.media.Ij
    public final void c() {
        Sd sd2 = this.f23451a;
        if (sd2.f23509e != EnumC3184sg.STATE_PLAYBACK_COMPLETED) {
            return;
        }
        MediaPlayer mediaPlayer = sd2.f23512h;
        ck.p.j(mediaPlayer, "<this>");
        try {
            mediaPlayer.seekTo(0);
        } catch (IllegalStateException unused) {
        }
    }
}
