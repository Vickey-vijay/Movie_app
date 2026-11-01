package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes11.dex */
public final class rj extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tj f82287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(tj tjVar, Looper looper) {
        super(looper);
        this.f82287a = tjVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f82287a.a(message);
    }
}
