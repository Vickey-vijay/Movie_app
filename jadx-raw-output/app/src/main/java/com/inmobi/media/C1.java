package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes6.dex */
public final class C1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22444a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(Looper looper) {
        super(looper);
        ck.p.j(looper, "looper");
        this.f22444a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ck.p.j(message, NotificationCompat.CATEGORY_MESSAGE);
        int i10 = message.what;
        if (i10 == 1001 && this.f22444a) {
            this.f22444a = false;
            E1.a(false);
            ck.p.i("E1", "access$getTAG$p(...)");
        } else {
            if (i10 != 1002 || this.f22444a) {
                return;
            }
            this.f22444a = true;
            E1.a(true);
            ck.p.i("E1", "access$getTAG$p(...)");
        }
    }
}
