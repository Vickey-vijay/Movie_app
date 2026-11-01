package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.InMobiBanner;

/* JADX INFO: renamed from: com.inmobi.media.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class HandlerC2795d2 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiBanner f24212a;

    /* JADX WARN: Illegal instructions before constructor call */
    public HandlerC2795d2(InMobiBanner inMobiBanner) {
        ck.p.j(inMobiBanner, "mInmobiBanner");
        Looper mainLooper = Looper.getMainLooper();
        ck.p.i(mainLooper, "getMainLooper(...)");
        ck.p.j(inMobiBanner, "mInmobiBanner");
        ck.p.j(mainLooper, "looper");
        super(mainLooper);
        this.f24212a = inMobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ck.p.j(message, NotificationCompat.CATEGORY_MESSAGE);
        if (message.what == 1) {
            this.f24212a.refreshBanner$media_release();
        } else {
            ck.p.i("d2", "TAG");
        }
    }
}
