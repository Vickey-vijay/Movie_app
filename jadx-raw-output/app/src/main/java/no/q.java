package no;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLStreamHandlerFactory;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.spi.InitializationException;
import org.seamless.util.URIUtil;

/* JADX INFO: compiled from: StreamClientImpl.java */
/* JADX INFO: loaded from: classes10.dex */
public class q implements po.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f64922b = Logger.getLogger(po.j.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f64923a;

    public void d(HttpURLConnection httpURLConnection, org.fourthline.cling.model.message.b bVar) {
        httpURLConnection.setInstanceFollowRedirects(false);
        pn.c cVarJ = bVar.j();
        UpnpHeader.Type type = UpnpHeader.Type.USER_AGENT;
        if (!cVarJ.p(type)) {
            httpURLConnection.setRequestProperty(type.getHttpName(), f().d(bVar.l(), bVar.m()));
        }
        b(httpURLConnection, bVar.j());
    }

    @Override // po.j
    public void stop() {
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r7v0, types: [no.q] */
    @Override // po.j
    public org.fourthline.cling.model.message.c a(org.fourthline.cling.model.message.b bVar) throws Throwable {
        UpnpRequest upnpRequestK = bVar.k();
        Logger logger = f64922b;
        logger.fine("Preparing HTTP request message with method '" + upnpRequestK.c() + "': " + bVar);
        ?? E = URIUtil.e(upnpRequestK.e());
        ?? r10 = 0;
        try {
            try {
                E = (HttpURLConnection) E.openConnection();
                try {
                    E.setRequestMethod(upnpRequestK.c());
                    E.setReadTimeout(this.f64923a.a() * 1000);
                    E.setConnectTimeout(this.f64923a.a() * 1000);
                    d(E, bVar);
                    c(E, bVar);
                    logger.fine("Sending HTTP request: " + bVar);
                    org.fourthline.cling.model.message.c cVarE = e(E, E.getInputStream());
                    E.disconnect();
                    return cVarE;
                } catch (ProtocolException e10) {
                    e = e10;
                    f64922b.log(Level.WARNING, "HTTP request failed: " + bVar, so.a.a(e));
                    if (E != 0) {
                        E.disconnect();
                    }
                    return null;
                } catch (IOException e11) {
                    e = e11;
                    if (E == 0) {
                        f64922b.log(Level.WARNING, "HTTP request failed: " + bVar, so.a.a(e));
                        if (E != 0) {
                            E.disconnect();
                        }
                        return null;
                    }
                    if (e instanceof SocketTimeoutException) {
                        f64922b.info("Timeout of " + f().a() + " seconds while waiting for HTTP request to complete, aborting: " + bVar);
                        E.disconnect();
                        return null;
                    }
                    Logger logger2 = f64922b;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine("Exception occurred, trying to read the error stream: " + so.a.a(e));
                    }
                    try {
                        org.fourthline.cling.model.message.c cVarE2 = e(E, E.getErrorStream());
                        E.disconnect();
                        return cVarE2;
                    } catch (Exception e12) {
                        Logger logger3 = f64922b;
                        if (logger3.isLoggable(Level.FINE)) {
                            logger3.fine("Could not read error stream: " + e12);
                        }
                        E.disconnect();
                        return null;
                    }
                } catch (Exception e13) {
                    e = e13;
                    f64922b.log(Level.WARNING, "HTTP request failed: " + bVar, so.a.a(e));
                    if (E != 0) {
                        E.disconnect();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = E;
                if (r10 != 0) {
                    r10.disconnect();
                }
                throw th;
            }
        } catch (ProtocolException e14) {
            e = e14;
            E = 0;
        } catch (IOException e15) {
            e = e15;
            E = 0;
        } catch (Exception e16) {
            e = e16;
            E = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r10 != 0) {
                r10.disconnect();
            }
            throw th;
        }
    }

    public void b(HttpURLConnection httpURLConnection, ro.a aVar) {
        f64922b.fine("Writing headers on HttpURLConnection: " + aVar.size());
        for (Map.Entry<String, List<String>> entry : aVar.entrySet()) {
            for (String str : entry.getValue()) {
                String key = entry.getKey();
                f64922b.fine("Setting header '" + key + "': " + str);
                httpURLConnection.setRequestProperty(key, str);
            }
        }
    }

    public p f() {
        return this.f64923a;
    }

    public q(p pVar) throws InitializationException {
        this.f64923a = pVar;
        if (!mn.f.f64632b && !mn.f.f64631a) {
            Logger logger = f64922b;
            logger.fine("Using persistent HTTP stream client connections: " + pVar.e());
            System.setProperty("http.keepAlive", Boolean.toString(pVar.e()));
            if (System.getProperty("hackStreamHandlerProperty") == null) {
                logger.fine("Setting custom static URLStreamHandlerFactory to work around bad JDK defaults");
                try {
                    URL.setURLStreamHandlerFactory((URLStreamHandlerFactory) Class.forName("no.f").newInstance());
                    System.setProperty("hackStreamHandlerProperty", "alreadyWorkedAroundTheEvilJDK");
                    return;
                } catch (Throwable unused) {
                    throw new InitializationException("Failed to set modified URLStreamHandlerFactory in this environment. Can't use bundled default client based on HTTPURLConnection, see manual.");
                }
            }
            return;
        }
        throw new InitializationException("This client does not work on Android. The design of HttpURLConnection is broken, we can not add additional 'permitted' HTTP methods. Read the Cling manual.");
    }

    public void c(HttpURLConnection httpURLConnection, org.fourthline.cling.model.message.b bVar) throws IOException {
        if (bVar.n()) {
            httpURLConnection.setDoOutput(true);
            if (bVar.g().equals(UpnpMessage.BodyType.STRING)) {
                to.c.i(httpURLConnection.getOutputStream(), bVar.d());
            } else if (bVar.g().equals(UpnpMessage.BodyType.BYTES)) {
                to.c.h(httpURLConnection.getOutputStream(), bVar.f());
            }
            httpURLConnection.getOutputStream().flush();
            return;
        }
        httpURLConnection.setDoOutput(false);
    }

    public org.fourthline.cling.model.message.c e(HttpURLConnection httpURLConnection, InputStream inputStream) throws Exception {
        byte[] bArrC = null;
        if (httpURLConnection.getResponseCode() == -1) {
            Logger logger = f64922b;
            logger.warning("Received an invalid HTTP response: " + httpURLConnection.getURL());
            logger.warning("Is your Cling-based server sending connection heartbeats with RemoteClientInfo#isRequestCancelled? This client can't handle heartbeats, read the manual.");
            return null;
        }
        UpnpResponse upnpResponse = new UpnpResponse(httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
        Logger logger2 = f64922b;
        logger2.fine("Received response: " + upnpResponse);
        org.fourthline.cling.model.message.c cVar = new org.fourthline.cling.model.message.c(upnpResponse);
        cVar.t(new pn.c(httpURLConnection.getHeaderFields()));
        if (inputStream != null) {
            try {
                bArrC = to.c.c(inputStream);
            } catch (Throwable th2) {
                inputStream.close();
                throw th2;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
        if (bArrC != null && bArrC.length > 0 && cVar.p()) {
            logger2.fine("Response contains textual entity body, converting then setting string on message");
            cVar.s(bArrC);
        } else if (bArrC != null && bArrC.length > 0) {
            logger2.fine("Response contains binary entity body, setting bytes on message");
            cVar.r(UpnpMessage.BodyType.BYTES, bArrC);
        } else {
            logger2.fine("Response did not contain entity body");
        }
        logger2.fine("Response message complete: " + cVar);
        return cVar;
    }
}
