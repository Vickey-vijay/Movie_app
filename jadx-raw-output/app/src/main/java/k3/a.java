package k3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f62051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RunnableC0557a f62052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f62053c;

    /* JADX INFO: renamed from: k3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    public final class RunnableC0557a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f62054b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f62055c;

        public RunnableC0557a(Handler handler, b bVar) {
            this.f62055c = handler;
            this.f62054b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f62053c) {
                this.f62054b.onAudioBecomingNoisy();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f62055c.post(this);
            }
        }
    }

    /* JADX INFO: compiled from: AudioBecomingNoisyManager.java */
    public interface b {
        void onAudioBecomingNoisy();
    }

    public void b(boolean z10) {
        if (z10 && !this.f62053c) {
            this.f62051a.registerReceiver(this.f62052b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f62053c = true;
        } else {
            if (z10 || !this.f62053c) {
                return;
            }
            this.f62051a.unregisterReceiver(this.f62052b);
            this.f62053c = false;
        }
    }

    public a(Context context, Handler handler, b bVar) {
        this.f62051a = context.getApplicationContext();
        this.f62052b = new RunnableC0557a(handler, bVar);
    }
}
