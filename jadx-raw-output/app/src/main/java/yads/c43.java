package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes10.dex */
public final class c43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f76159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a43 f76160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioManager f76161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b43 f76162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HandlerThread f76163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f76164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f76165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f76166i;

    public static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            ih1.d("StreamVolumeManager", ih1.a("Could not retrieve stream volume for stream type " + i10, e10));
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public final void a(int i10) {
        if (this.f76164g == i10) {
            return;
        }
        this.f76164g = i10;
        int iB = b(this.f76161d, i10);
        boolean zA = a(this.f76161d, this.f76164g);
        if (this.f76165h != iB || this.f76166i != zA) {
            this.f76165h = iB;
            this.f76166i = zA;
            ((wn0) this.f76160c).a(zA, iB);
        }
        ((wn0) this.f76160c).a();
    }

    public c43(Context context, Handler handler, wn0 wn0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f76158a = applicationContext;
        this.f76159b = handler;
        this.f76160c = wn0Var;
        AudioManager audioManager = (AudioManager) ni.a((AudioManager) applicationContext.getSystemService("audio"));
        this.f76161d = audioManager;
        this.f76164g = 3;
        this.f76165h = b(audioManager, 3);
        this.f76166i = a(audioManager, this.f76164g);
        b43 b43Var = new b43(this);
        IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            HandlerThread handlerThread = new HandlerThread("StreamVolumeReceiver");
            this.f76163f = handlerThread;
            handlerThread.start();
            applicationContext.registerReceiver(b43Var, intentFilter, null, new Handler(this.f76163f.getLooper()));
            this.f76162e = b43Var;
        } catch (RuntimeException e10) {
            ih1.a(e10);
            HandlerThread handlerThread2 = this.f76163f;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
                this.f76163f = null;
            }
        }
    }

    public final void b() {
        b43 b43Var = this.f76162e;
        if (b43Var != null) {
            try {
                this.f76158a.unregisterReceiver(b43Var);
            } catch (RuntimeException e10) {
                ih1.d("StreamVolumeManager", ih1.a("Error unregistering stream volume receiver", e10));
            }
            this.f76162e = null;
        }
        HandlerThread handlerThread = this.f76163f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f76163f = null;
        }
    }

    public final int a() {
        if (ib3.f78556a >= 28) {
            return this.f76161d.getStreamMinVolume(this.f76164g);
        }
        return 0;
    }

    public static boolean a(AudioManager audioManager, int i10) {
        if (ib3.f78556a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return b(audioManager, i10) == 0;
    }
}
