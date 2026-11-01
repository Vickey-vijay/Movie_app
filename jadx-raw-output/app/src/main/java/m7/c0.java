package m7;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import java.io.File;

/* JADX INFO: compiled from: PauseAllMarker.java */
/* JADX INFO: loaded from: classes2.dex */
public class c0 implements Handler.Callback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static File f64196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Long f64197f = 1000L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HandlerThread f64198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f64199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r7.b f64200d;

    public static File c() {
        if (f64196e == null) {
            f64196e = new File(w7.c.a().getCacheDir() + File.separator + ".filedownloader_pause_all_marker.b");
        }
        return f64196e;
    }

    public void d() {
        HandlerThread handlerThread = new HandlerThread("PauseAllChecker");
        this.f64198b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.f64198b.getLooper(), this);
        this.f64199c = handler;
        handler.sendEmptyMessageDelayed(0, f64197f.longValue());
    }

    public void e() {
        this.f64199c.removeMessages(0);
        this.f64198b.quit();
    }

    public c0(r7.b bVar) {
        this.f64200d = bVar;
    }

    public static void a() {
        File fileC = c();
        if (fileC.exists()) {
            w7.d.a(c0.class, "delete marker file " + fileC.delete(), new Object[0]);
        }
    }

    public static boolean b() {
        return c().exists();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            if (b()) {
                try {
                    this.f64200d.s();
                } catch (RemoteException e10) {
                    w7.d.c(this, e10, "pause all failed", new Object[0]);
                }
                a();
            }
            this.f64199c.sendEmptyMessageDelayed(0, f64197f.longValue());
            return true;
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
