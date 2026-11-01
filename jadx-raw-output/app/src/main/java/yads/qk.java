package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes10.dex */
public final class qk extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rk f81873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f81874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk f81875d;

    public qk(sk skVar, Handler handler, wn0 wn0Var) {
        this.f81875d = skVar;
        this.f81874c = handler;
        this.f81873b = wn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f81875d.f82672c) {
            ((wn0) this.f81873b).f84275a.a(-1, 3, false);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f81874c.post(this);
        }
    }
}
