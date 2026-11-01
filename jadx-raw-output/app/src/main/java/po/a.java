package po;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import po.k;

/* JADX INFO: compiled from: AbstractStreamClient.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a<C extends k, REQUEST> implements j<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f66243a = Logger.getLogger(j.class.getName());

    public abstract void b(REQUEST request);

    public abstract Callable<org.fourthline.cling.model.message.c> c(org.fourthline.cling.model.message.b bVar, REQUEST request);

    public abstract REQUEST d(org.fourthline.cling.model.message.b bVar);

    public abstract boolean e(Throwable th2);

    public void f(REQUEST request) {
    }

    @Override // po.j
    public org.fourthline.cling.model.message.c a(org.fourthline.cling.model.message.b bVar) throws InterruptedException {
        Logger logger = f66243a;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            logger.fine("Preparing HTTP request: " + bVar);
        }
        REQUEST requestD = d(bVar);
        if (requestD == null) {
            return null;
        }
        Callable<org.fourthline.cling.model.message.c> callableC = c(bVar, requestD);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Future futureSubmit = getConfiguration().c().submit(callableC);
        try {
            try {
                try {
                    if (logger.isLoggable(level)) {
                        logger.fine("Waiting " + getConfiguration().a() + " seconds for HTTP request to complete: " + bVar);
                    }
                    org.fourthline.cling.model.message.c cVar = (org.fourthline.cling.model.message.c) futureSubmit.get(getConfiguration().a(), TimeUnit.SECONDS);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (logger.isLoggable(Level.FINEST)) {
                        logger.finest("Got HTTP response in " + jCurrentTimeMillis2 + "ms: " + bVar);
                    }
                    if (getConfiguration().b() > 0 && jCurrentTimeMillis2 > getConfiguration().b() * 1000) {
                        logger.warning("HTTP request took a long time (" + jCurrentTimeMillis2 + "ms): " + bVar);
                    }
                    f(requestD);
                    return cVar;
                } catch (TimeoutException unused) {
                    f66243a.info("Timeout of " + getConfiguration().a() + " seconds while waiting for HTTP request to complete, aborting: " + bVar);
                    b(requestD);
                    f(requestD);
                    return null;
                }
            } catch (InterruptedException unused2) {
                Logger logger2 = f66243a;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine("Interruption, aborting request: " + bVar);
                }
                b(requestD);
                throw new InterruptedException("HTTP request interrupted and aborted");
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (!e(cause)) {
                    f66243a.log(Level.WARNING, "HTTP request failed: " + bVar, so.a.a(cause));
                }
                f(requestD);
                return null;
            }
        } catch (Throwable th2) {
            f(requestD);
            throw th2;
        }
    }
}
