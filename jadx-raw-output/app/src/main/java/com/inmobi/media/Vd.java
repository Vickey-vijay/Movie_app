package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes7.dex */
public final class Vd implements P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2729ae f23699a;

    public Vd(C2729ae c2729ae) {
        this.f23699a = c2729ae;
    }

    @Override // com.inmobi.media.P1
    public final void a() {
        this.f23699a.a();
    }

    @Override // com.inmobi.media.P1
    public final void b() {
        C2729ae c2729ae = this.f23699a;
        MediaPlayer mediaPlayer = c2729ae.f23994c;
        ck.p.j(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(1.0f, 1.0f);
        } catch (IllegalStateException unused) {
        }
        c2729ae.a(c2729ae.f24002k, c2729ae.f24001j);
        P4.a(c2729ae.f23996e, c2729ae.f23993b, new S1(1.0f, false));
        c2729ae.f24000i = false;
    }
}
