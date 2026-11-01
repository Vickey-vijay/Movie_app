package mn;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Logger;
import org.fourthline.cling.model.ValidationException;
import org.seamless.util.URIUtil;

/* JADX INFO: compiled from: Namespace.java */
/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f64633c = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URI f64634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64635b;

    public g() {
        this("");
    }

    public g(String str) {
        this(URI.create(str));
    }

    public URI a(String str) {
        try {
            return new URI(this.f64634a.getScheme(), null, this.f64634a.getHost(), this.f64634a.getPort(), this.f64635b + str, null, null);
        } catch (URISyntaxException unused) {
            return URI.create(this.f64634a + str);
        }
    }

    public URI b() {
        return this.f64634a;
    }

    public URI c(un.l lVar) {
        return a(l(lVar) + "/action");
    }

    public URI d(un.a aVar) {
        return a(g(aVar.t()) + "/desc");
    }

    public URI e(un.l lVar) {
        return a(l(lVar) + "/desc");
    }

    public String f(un.a aVar) {
        return this.f64635b + g(aVar.t()) + "/desc";
    }

    public URI h(un.l lVar) {
        return a(l(lVar) + "/event/cb");
    }

    public String i(un.l lVar) {
        return this.f64635b + l(lVar) + "/event/cb";
    }

    public URI j(un.l lVar) {
        return a(l(lVar) + "/event");
    }

    public URI k(un.d dVar) {
        return a(g(dVar.d()) + "/" + dVar.g().toString());
    }

    public g(URI uri) {
        this.f64634a = uri;
        this.f64635b = uri.getPath();
    }

    public String g(un.a aVar) {
        if (aVar.r().b() != null) {
            return "/dev/" + URIUtil.d(aVar.r().b().a());
        }
        throw new IllegalStateException("Can't generate local URI prefix without UDN");
    }

    public wn.c[] getResources(un.a aVar) throws ValidationException {
        if (!aVar.A()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        f64633c.fine("Discovering local resources of device graph");
        for (wn.c cVar : aVar.a(this)) {
            Logger logger = f64633c;
            logger.finer("Discovered: " + cVar);
            if (!hashSet.add(cVar)) {
                logger.finer("Local resource already exists, queueing validation error");
                arrayList.add(new k(getClass(), "resources", "Local URI namespace conflict between resources of device: " + cVar));
            }
        }
        if (arrayList.size() <= 0) {
            return (wn.c[]) hashSet.toArray(new wn.c[hashSet.size()]);
        }
        throw new ValidationException("Validation of device graph failed, call getErrors() on exception", arrayList);
    }

    public String l(un.l lVar) {
        if (lVar.f() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(g(lVar.d()));
            sb2.append("/svc/" + lVar.f().b() + "/" + lVar.f().a());
            return sb2.toString();
        }
        throw new IllegalStateException("Can't generate local URI prefix without service ID");
    }

    public boolean m(URI uri) {
        return uri.toString().endsWith("/action");
    }

    public boolean n(URI uri) {
        return uri.toString().endsWith("/cb");
    }

    public boolean o(URI uri) {
        return uri.toString().endsWith("/event");
    }

    public URI p(un.a aVar, URI uri) {
        if (!uri.isAbsolute() && !uri.getPath().startsWith("/")) {
            return a(g(aVar) + "/" + uri);
        }
        return uri;
    }
}
