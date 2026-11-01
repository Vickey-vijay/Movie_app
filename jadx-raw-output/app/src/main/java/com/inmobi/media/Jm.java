package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes7.dex */
public final class Jm implements MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3028m9 f22965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.c f22967c;

    public Jm(InterfaceC3028m9 interfaceC3028m9, String str, kotlinx.coroutines.c cVar) {
        this.f22965a = interfaceC3028m9;
        this.f22966b = str;
        this.f22967c = cVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        InterfaceC3028m9 interfaceC3028m9 = this.f22965a;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("VideoLoaderHelper", "Video Load Error URL: " + this.f22966b);
        }
        P4.a(this.f22967c, Boolean.FALSE);
        return true;
    }
}
