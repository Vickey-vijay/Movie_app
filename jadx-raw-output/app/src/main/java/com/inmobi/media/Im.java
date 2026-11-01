package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes7.dex */
public final class Im implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f22872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.c f22874c;

    public Im(InterfaceC3028m9 interfaceC3028m9, String str, kotlinx.coroutines.c cVar) {
        this.f22872a = interfaceC3028m9;
        this.f22873b = str;
        this.f22874c = cVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        InterfaceC3028m9 interfaceC3028m9 = this.f22872a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("VideoLoaderHelper", "Video Load Success for URL: " + this.f22873b);
        }
        P4.a(this.f22874c, Boolean.TRUE);
    }
}
