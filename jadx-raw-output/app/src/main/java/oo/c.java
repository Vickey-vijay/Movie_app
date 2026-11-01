package oo;

import im.f;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import mm.h;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.spi.InitializationException;
import po.j;
import tn.d;

/* JADX INFO: compiled from: StreamClientImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class c extends po.a<oo.b, C0602c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f65473d = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oo.b f65474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final org.eclipse.jetty.client.a f65475c;

    /* JADX INFO: compiled from: StreamClientImpl.java */
    public class a extends en.a {
        @Override // en.a, ym.a
        public void e0() throws Exception {
        }

        public a(ExecutorService executorService) {
            super(executorService);
        }
    }

    /* JADX INFO: compiled from: StreamClientImpl.java */
    public class b implements Callable<org.fourthline.cling.model.message.c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ org.fourthline.cling.model.message.b f65477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C0602c f65478c;

        public b(org.fourthline.cling.model.message.b bVar, C0602c c0602c) {
            this.f65477b = bVar;
            this.f65478c = c0602c;
        }

        @Override // java.util.concurrent.Callable
        public org.fourthline.cling.model.message.c call() throws Exception {
            if (c.f65473d.isLoggable(Level.FINE)) {
                c.f65473d.fine("Sending HTTP request: " + this.f65477b);
            }
            c.this.f65475c.T0(this.f65478c);
            int iD0 = this.f65478c.d0();
            if (iD0 == 7) {
                try {
                    return this.f65478c.l0();
                } catch (Throwable th2) {
                    c.f65473d.log(Level.WARNING, "Error reading response: " + this.f65477b, so.a.a(th2));
                    return null;
                }
            }
            if (iD0 == 11 || iD0 == 9) {
                return null;
            }
            c.f65473d.warning("Unhandled HTTP exchange status: " + iD0);
            return null;
        }
    }

    /* JADX INFO: renamed from: oo.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: StreamClientImpl.java */
    public static class C0602c extends f {
        public final oo.b E;
        public final org.eclipse.jetty.client.a F;
        public final org.fourthline.cling.model.message.b G;

        public C0602c(oo.b bVar, org.eclipse.jetty.client.a aVar, org.fourthline.cling.model.message.b bVar2) {
            super(true);
            this.E = bVar;
            this.F = aVar;
            this.G = bVar2;
            k0();
            j0();
            i0();
        }

        public org.fourthline.cling.model.message.c l0() {
            UpnpResponse upnpResponse = new UpnpResponse(f0(), UpnpResponse.Status.getByStatusCode(f0()).getStatusMsg());
            if (c.f65473d.isLoggable(Level.FINE)) {
                c.f65473d.fine("Received response: " + upnpResponse);
            }
            org.fourthline.cling.model.message.c cVar = new org.fourthline.cling.model.message.c(upnpResponse);
            pn.c cVar2 = new pn.c();
            org.eclipse.jetty.http.a aVarE0 = e0();
            for (String str : aVarE0.u()) {
                Iterator<String> it = aVarE0.A(str).iterator();
                while (it.hasNext()) {
                    cVar2.a(str, it.next());
                }
            }
            cVar.t(cVar2);
            byte[] bArrH0 = h0();
            if (bArrH0 != null && bArrH0.length > 0 && cVar.p()) {
                if (c.f65473d.isLoggable(Level.FINE)) {
                    c.f65473d.fine("Response contains textual entity body, converting then setting string on message");
                }
                try {
                    cVar.s(bArrH0);
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("Unsupported character encoding: " + e10, e10);
                }
            } else if (bArrH0 != null && bArrH0.length > 0) {
                if (c.f65473d.isLoggable(Level.FINE)) {
                    c.f65473d.fine("Response contains binary entity body, setting bytes on message");
                }
                cVar.r(UpnpMessage.BodyType.BYTES, bArrH0);
            } else if (c.f65473d.isLoggable(Level.FINE)) {
                c.f65473d.fine("Response did not contain entity body");
            }
            if (c.f65473d.isLoggable(Level.FINE)) {
                c.f65473d.fine("Response message complete: " + cVar);
            }
            return cVar;
        }

        public oo.b m0() {
            return this.E;
        }

        public org.fourthline.cling.model.message.b n0() {
            return this.G;
        }

        public void i0() {
            so.c cVarB;
            String strH;
            if (n0().n()) {
                if (n0().g() == UpnpMessage.BodyType.STRING) {
                    if (c.f65473d.isLoggable(Level.FINE)) {
                        c.f65473d.fine("Writing textual request body: " + n0());
                    }
                    if (n0().i() != null) {
                        cVarB = n0().i().b();
                    } else {
                        cVarB = d.f72468d;
                    }
                    if (n0().h() != null) {
                        strH = n0().h();
                    } else {
                        strH = "UTF-8";
                    }
                    R(cVarB.toString());
                    try {
                        h hVar = new h(n0().d(), strH);
                        S("Content-Length", String.valueOf(hVar.length()));
                        P(hVar);
                        return;
                    } catch (UnsupportedEncodingException e10) {
                        throw new RuntimeException("Unsupported character encoding: " + strH, e10);
                    }
                }
                if (c.f65473d.isLoggable(Level.FINE)) {
                    c.f65473d.fine("Writing binary request body: " + n0());
                }
                if (n0().i() != null) {
                    R(n0().i().b().toString());
                    h hVar2 = new h(n0().f());
                    S("Content-Length", String.valueOf(hVar2.length()));
                    P(hVar2);
                    return;
                }
                throw new RuntimeException("Missing content type header in request message: " + this.G);
            }
        }

        public void j0() {
            pn.c cVarJ = n0().j();
            if (c.f65473d.isLoggable(Level.FINE)) {
                c.f65473d.fine("Writing headers on HttpContentExchange: " + cVarJ.size());
            }
            UpnpHeader.Type type = UpnpHeader.Type.USER_AGENT;
            if (!cVarJ.p(type)) {
                S(type.getHttpName(), m0().d(n0().l(), n0().m()));
            }
            for (Map.Entry<String, List<String>> entry : cVarJ.entrySet()) {
                for (String str : entry.getValue()) {
                    String key = entry.getKey();
                    if (c.f65473d.isLoggable(Level.FINE)) {
                        c.f65473d.fine("Setting header '" + key + "': " + str);
                    }
                    c(key, str);
                }
            }
        }

        public void k0() {
            UpnpRequest upnpRequestK = n0().k();
            if (c.f65473d.isLoggable(Level.FINE)) {
                c.f65473d.fine("Preparing HTTP request message with method '" + upnpRequestK.c() + "': " + n0());
            }
            b0(upnpRequestK.e().toString());
            O(upnpRequestK.c());
        }

        @Override // im.i
        public void y(Throwable th2) {
            c.f65473d.log(Level.WARNING, "HTTP connection failed: " + this.G, so.a.a(th2));
        }

        @Override // im.i
        public void z(Throwable th2) {
            c.f65473d.log(Level.WARNING, "HTTP request failed: " + this.G, so.a.a(th2));
        }
    }

    @Override // po.a
    public boolean e(Throwable th2) {
        return false;
    }

    @Override // po.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Callable<org.fourthline.cling.model.message.c> c(org.fourthline.cling.model.message.b bVar, C0602c c0602c) {
        return new b(bVar, c0602c);
    }

    @Override // po.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0602c d(org.fourthline.cling.model.message.b bVar) {
        return new C0602c(getConfiguration(), this.f65475c, bVar);
    }

    @Override // po.j
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public oo.b getConfiguration() {
        return this.f65474b;
    }

    @Override // po.j
    public void stop() {
        try {
            this.f65475c.stop();
        } catch (Exception e10) {
            f65473d.info("Error stopping HTTP client: " + e10);
        }
    }

    public c(oo.b bVar) throws InitializationException {
        this.f65474b = bVar;
        f65473d.info("Starting Jetty HttpClient...");
        org.eclipse.jetty.client.a aVar = new org.eclipse.jetty.client.a();
        this.f65475c = aVar;
        aVar.X0(new a(getConfiguration().c()));
        aVar.Y0((bVar.a() + 5) * 1000);
        aVar.V0((bVar.a() + 5) * 1000);
        aVar.W0(bVar.e());
        try {
            aVar.start();
        } catch (Exception e10) {
            throw new InitializationException("Could not start Jetty HTTP client: " + e10, e10);
        }
    }

    @Override // po.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(C0602c c0602c) {
        c0602c.e();
    }
}
