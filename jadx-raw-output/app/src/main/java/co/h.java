package co;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: RegistryMaintainer.java */
/* JADX INFO: loaded from: classes5.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Logger f6183e = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f6184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f6186d = false;

    @Override // java.lang.Runnable
    public void run() {
        this.f6186d = false;
        if (f6183e.isLoggable(Level.FINE)) {
            f6183e.fine("Running registry maintenance loop every milliseconds: " + this.f6185c);
        }
        while (!this.f6186d) {
            try {
                this.f6184b.L();
                Thread.sleep(this.f6185c);
            } catch (InterruptedException unused) {
                this.f6186d = true;
            }
        }
        f6183e.fine("Stopped status on thread received, ending maintenance loop");
    }

    public void stop() {
        if (f6183e.isLoggable(Level.FINE)) {
            f6183e.fine("Setting stopped status on thread");
        }
        this.f6186d = true;
    }

    public h(d dVar, int i10) {
        this.f6184b = dVar;
        this.f6185c = i10;
    }
}
