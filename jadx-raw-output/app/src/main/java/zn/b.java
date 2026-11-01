package zn;

import bo.h;
import bo.i;
import bo.j;
import java.net.URI;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import org.fourthline.cling.model.message.UpnpRequest;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.model.types.NotificationSubtype;
import org.fourthline.cling.protocol.ProtocolCreationException;
import org.fourthline.cling.transport.RouterException;
import yn.p;
import yn.s;

/* JADX INFO: compiled from: ProtocolFactoryImpl.java */
/* JADX INFO: loaded from: classes9.dex */
@ApplicationScoped
public class b implements zn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f86496b = Logger.getLogger(zn.a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fn.b f86497a;

    /* JADX INFO: compiled from: ProtocolFactoryImpl.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86498a;

        static {
            int[] iArr = new int[UpnpRequest.Method.values().length];
            f86498a = iArr;
            try {
                iArr[UpnpRequest.Method.NOTIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86498a[UpnpRequest.Method.MSEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // zn.a
    public bo.f a(nn.d dVar, URL url) {
        return new bo.f(s(), dVar, url);
    }

    @Override // zn.a
    public ao.f b(un.e eVar) {
        return new ao.f(s(), eVar);
    }

    @Override // zn.a
    public bo.g c(on.b bVar) {
        return new bo.g(s(), bVar);
    }

    @Override // zn.a
    public ao.e d(un.e eVar) {
        return new ao.e(s(), eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zn.a
    public c e(pn.b bVar) throws ProtocolCreationException {
        Logger logger = f86496b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Creating protocol for incoming asynchronous: " + bVar);
        }
        if (bVar.k() instanceof UpnpRequest) {
            int i10 = a.f86498a[((UpnpRequest) bVar.k()).d().ordinal()];
            if (i10 == 1) {
                if (t(bVar) || u(bVar)) {
                    return m(bVar);
                }
                return null;
            }
            if (i10 == 2) {
                return o(bVar);
            }
        } else if (bVar.k() instanceof UpnpResponse) {
            if (u(bVar)) {
                return p(bVar);
            }
            return null;
        }
        throw new ProtocolCreationException("Protocol for incoming datagram message not found: " + bVar);
    }

    @Override // zn.a
    public ao.g f(UpnpHeader upnpHeader, int i10) {
        return new ao.g(s(), upnpHeader, i10);
    }

    @Override // zn.a
    public h g(on.c cVar) {
        return new h(s(), cVar);
    }

    @Override // zn.a
    public j h(on.c cVar) {
        return new j(s(), cVar);
    }

    @Override // zn.a
    public d i(org.fourthline.cling.model.message.b bVar) throws ProtocolCreationException {
        Logger logger = f86496b;
        logger.fine("Creating protocol for incoming synchronous: " + bVar);
        if (bVar.k().d().equals(UpnpRequest.Method.GET)) {
            return n(bVar);
        }
        if (s().getConfiguration().getNamespace().m(bVar.v())) {
            if (bVar.k().d().equals(UpnpRequest.Method.POST)) {
                return k(bVar);
            }
        } else if (s().getConfiguration().getNamespace().o(bVar.v())) {
            if (bVar.k().d().equals(UpnpRequest.Method.SUBSCRIBE)) {
                return q(bVar);
            }
            if (bVar.k().d().equals(UpnpRequest.Method.UNSUBSCRIBE)) {
                return r(bVar);
            }
        } else if (s().getConfiguration().getNamespace().n(bVar.v())) {
            if (bVar.k().d().equals(UpnpRequest.Method.NOTIFY)) {
                return l(bVar);
            }
        } else if (bVar.v().getPath().contains("/event/cb")) {
            logger.warning("Fixing trailing garbage in event message path: " + bVar.v().getPath());
            String string = bVar.v().toString();
            bVar.x(URI.create(string.substring(0, string.indexOf("/cb") + 3)));
            if (s().getConfiguration().getNamespace().n(bVar.v()) && bVar.k().d().equals(UpnpRequest.Method.NOTIFY)) {
                return l(bVar);
            }
        }
        throw new ProtocolCreationException("Protocol for message type not found: " + bVar);
    }

    public bo.a k(org.fourthline.cling.model.message.b bVar) {
        return new bo.a(s(), bVar);
    }

    public bo.b l(org.fourthline.cling.model.message.b bVar) {
        return new bo.b(s(), bVar);
    }

    public c m(pn.b<UpnpRequest> bVar) {
        return new ao.a(s(), bVar);
    }

    public bo.c n(org.fourthline.cling.model.message.b bVar) {
        return new bo.c(s(), bVar);
    }

    public c o(pn.b<UpnpRequest> bVar) {
        return new ao.b(s(), bVar);
    }

    public c p(pn.b<UpnpResponse> bVar) {
        return new ao.c(s(), bVar);
    }

    public bo.d q(org.fourthline.cling.model.message.b bVar) {
        return new bo.d(s(), bVar);
    }

    public bo.e r(org.fourthline.cling.model.message.b bVar) {
        return new bo.e(s(), bVar);
    }

    public fn.b s() {
        return this.f86497a;
    }

    public b(fn.b bVar) {
        f86496b.fine("Creating ProtocolFactory: " + getClass().getName());
        this.f86497a = bVar;
    }

    @Override // zn.a
    public i j(on.c cVar) throws ProtocolCreationException {
        try {
            return new i(s(), cVar, s().c().d(cVar.H().d().r().e()));
        } catch (RouterException e10) {
            throw new ProtocolCreationException("Failed to obtain local stream servers (for event callback URL creation) from router", e10);
        }
    }

    public boolean t(pn.b bVar) {
        String strF = bVar.j().f(UpnpHeader.Type.NTS.getHttpName());
        if (strF != null && strF.equals(NotificationSubtype.BYEBYE.getHeaderString())) {
            return true;
        }
        return false;
    }

    public boolean u(pn.b bVar) {
        s[] sVarArrQ = s().getConfiguration().q();
        if (sVarArrQ == null) {
            return false;
        }
        if (sVarArrQ.length == 0) {
            return true;
        }
        String strF = bVar.j().f(UpnpHeader.Type.USN.getHttpName());
        if (strF == null) {
            return false;
        }
        try {
            p pVarC = p.c(strF);
            for (s sVar : sVarArrQ) {
                if (pVarC.a().c(sVar)) {
                    return true;
                }
            }
        } catch (InvalidValueException unused) {
            f86496b.finest("Not a named service type header value: " + strF);
        }
        f86496b.fine("Service advertisement not supported, dropping it: " + strF);
        return false;
    }
}
