package zn;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingAsync.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f86510c = Logger.getLogger(fn.b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn.b f86511b;

    public abstract void a() throws RouterException;

    public fn.b c() {
        return this.f86511b;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }

    public f(fn.b bVar) {
        this.f86511b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (Exception e10) {
            Throwable thA = so.a.a(e10);
            if (thA instanceof InterruptedException) {
                f86510c.log(Level.INFO, "Interrupted protocol '" + getClass().getSimpleName() + "': " + e10, thA);
                return;
            }
            throw new RuntimeException("Fatal error while executing protocol '" + getClass().getSimpleName() + "': " + e10, e10);
        }
    }
}
