package no;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.logging.Logger;
import sun.net.www.protocol.http.Handler;

/* JADX INFO: compiled from: FixedSunURLStreamHandler.java */
/* JADX INFO: loaded from: classes11.dex */
public class f implements URLStreamHandlerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f64894a = Logger.getLogger(f.class.getName());

    /* JADX INFO: compiled from: FixedSunURLStreamHandler.java */
    public class a extends Handler {
        public a() {
        }
    }

    @Override // java.net.URLStreamHandlerFactory
    public URLStreamHandler createURLStreamHandler(String str) {
        f64894a.fine("Creating new URLStreamHandler for protocol: " + str);
        if ("http".equals(str)) {
            return new a();
        }
        return null;
    }
}
