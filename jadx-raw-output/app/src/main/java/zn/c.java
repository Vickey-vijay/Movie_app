package zn;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: ReceivingAsync.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class c<M extends UpnpMessage> implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f86499d = Logger.getLogger(fn.b.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn.b f86500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public M f86501c;

    public abstract void a() throws RouterException;

    public boolean e() throws InterruptedException {
        return true;
    }

    public M c() {
        return this.f86501c;
    }

    public fn.b d() {
        return this.f86500b;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }

    public c(fn.b bVar, M m10) {
        this.f86500b = bVar;
        this.f86501c = m10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zE;
        try {
            zE = e();
        } catch (InterruptedException unused) {
            f86499d.info("Protocol wait before execution interrupted (on shutdown?): " + getClass().getSimpleName());
            zE = false;
        }
        if (zE) {
            try {
                a();
            } catch (Exception e10) {
                Throwable thA = so.a.a(e10);
                if (thA instanceof InterruptedException) {
                    f86499d.log(Level.INFO, "Interrupted protocol '" + getClass().getSimpleName() + "': " + e10, thA);
                    return;
                }
                throw new RuntimeException("Fatal error while executing protocol '" + getClass().getSimpleName() + "': " + e10, e10);
            }
        }
    }
}
