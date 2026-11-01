package no;

import com.ironsource.Z7;
import java.io.IOException;
import java.net.URI;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kj.t;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;

/* JADX INFO: compiled from: AsyncServletUpnpStream.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class b extends po.m implements kj.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f64881h = Logger.getLogger(po.m.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kj.a f64882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lj.a f64883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public org.fourthline.cling.model.message.c f64884g;

    public abstract pn.a K();

    @Override // kj.c
    public void w(kj.b bVar) throws IOException {
    }

    public void J() {
        try {
            this.f64882e.complete();
        } catch (IllegalStateException e10) {
            f64881h.info("Error calling servlet container's AsyncContext#complete() method: " + e10);
        }
    }

    public lj.a L() {
        return this.f64883f;
    }

    public lj.c M() {
        t response = this.f64882e.getResponse();
        if (response != null) {
            return (lj.c) response;
        }
        throw new IllegalStateException("Couldn't get response from asynchronous context, already timed out");
    }

    public void O(org.fourthline.cling.model.message.c cVar) throws IOException {
        Logger logger = f64881h;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Sending HTTP response status: " + cVar.k().d());
        }
        M().k(cVar.k().d());
        for (Map.Entry<String, List<String>> entry : cVar.j().entrySet()) {
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                M().c(entry.getKey(), it.next());
            }
        }
        M().d("Date", System.currentTimeMillis());
        byte[] bArrF = cVar.n() ? cVar.f() : null;
        int length = bArrF != null ? bArrF.length : -1;
        if (length > 0) {
            M().p(length);
            f64881h.finer("Response message has body, writing bytes to stream...");
            to.c.h(M().e(), bArrF);
        }
    }

    @Override // kj.c
    public void f(kj.b bVar) throws IOException {
        Logger logger = f64881h;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Asynchronous processing of HTTP request error: " + bVar.c());
        }
        H(bVar.c());
    }

    @Override // kj.c
    public void l(kj.b bVar) throws IOException {
        Logger logger = f64881h;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Asynchronous processing of HTTP request timed out: " + bVar.a());
        }
        H(new Exception("Asynchronous request timed out"));
    }

    @Override // kj.c
    public void z(kj.b bVar) throws IOException {
        Logger logger = f64881h;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Completed asynchronous processing of HTTP request: " + bVar.a());
        }
        I(this.f64884g);
    }

    public b(zn.a aVar, kj.a aVar2, lj.a aVar3) {
        super(aVar);
        this.f64882e = aVar2;
        this.f64883f = aVar3;
        aVar2.a(this);
    }

    public org.fourthline.cling.model.message.b N() throws IOException {
        String method = L().getMethod();
        String strV = L().v();
        Logger logger = f64881h;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("Processing HTTP request: " + method + Z7.f27998r + strV);
        }
        try {
            org.fourthline.cling.model.message.b bVar = new org.fourthline.cling.model.message.b(UpnpRequest.Method.getByHttpName(method), URI.create(strV));
            if (!((UpnpRequest) bVar.k()).d().equals(UpnpRequest.Method.UNKNOWN)) {
                bVar.w(K());
                pn.c cVar = new pn.c();
                Enumeration<String> enumerationK = L().k();
                while (enumerationK.hasMoreElements()) {
                    String strNextElement = enumerationK.nextElement();
                    Enumeration<String> enumerationO = L().o(strNextElement);
                    while (enumerationO.hasMoreElements()) {
                        cVar.a(strNextElement, enumerationO.nextElement());
                    }
                }
                bVar.t(cVar);
                kj.m mVarB = null;
                try {
                    mVarB = L().b();
                    byte[] bArrC = to.c.c(mVarB);
                    if (mVarB != null) {
                        mVarB.close();
                    }
                    Logger logger2 = f64881h;
                    Level level = Level.FINER;
                    if (logger2.isLoggable(level)) {
                        logger2.finer("Reading request body bytes: " + bArrC.length);
                    }
                    if (bArrC.length > 0 && bVar.p()) {
                        if (logger2.isLoggable(level)) {
                            logger2.finer("Request contains textual entity body, converting then setting string on message");
                        }
                        bVar.s(bArrC);
                    } else if (bArrC.length > 0) {
                        if (logger2.isLoggable(level)) {
                            logger2.finer("Request contains binary entity body, setting bytes on message");
                        }
                        bVar.r(UpnpMessage.BodyType.BYTES, bArrC);
                    } else if (logger2.isLoggable(level)) {
                        logger2.finer("Request did not contain entity body");
                    }
                    return bVar;
                } catch (Throwable th2) {
                    if (mVarB != null) {
                        mVarB.close();
                    }
                    throw th2;
                }
            }
            throw new RuntimeException("Method not supported: " + method);
        } catch (IllegalArgumentException e10) {
            throw new RuntimeException("Invalid request URI: " + strV, e10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            org.fourthline.cling.model.message.b bVarN = N();
            Logger logger = f64881h;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.finer("Processing new request message: " + bVarN);
            }
            org.fourthline.cling.model.message.c cVarG = G(bVarN);
            this.f64884g = cVarG;
            if (cVarG != null) {
                if (logger.isLoggable(level)) {
                    logger.finer("Preparing HTTP response message: " + this.f64884g);
                }
                O(this.f64884g);
            } else {
                if (logger.isLoggable(level)) {
                    logger.finer("Sending HTTP response status: 404");
                }
                M().k(404);
            }
        } catch (Throwable th2) {
            try {
                Logger logger2 = f64881h;
                logger2.info("Exception occurred during UPnP stream processing: " + th2);
                Level level2 = Level.FINER;
                if (logger2.isLoggable(level2)) {
                    logger2.log(level2, "Cause: " + so.a.a(th2), so.a.a(th2));
                }
                if (!M().a()) {
                    logger2.finer("Response hasn't been committed, returning INTERNAL SERVER ERROR to client");
                    M().k(500);
                } else {
                    logger2.info("Could not return INTERNAL SERVER ERROR to client, response was already committed");
                }
                H(th2);
            } finally {
                J();
            }
        }
    }
}
