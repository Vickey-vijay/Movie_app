package wn;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/* JADX INFO: compiled from: Resource.java */
/* JADX INFO: loaded from: classes11.dex */
public class c<M> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URI f74161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M f74162b;

    public void c(List<Runnable> list, mn.d dVar) {
    }

    public void e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && b().equals(((c) obj).b());
    }

    public M a() {
        return this.f74162b;
    }

    public URI b() {
        return this.f74161a;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") URI: " + b();
    }

    public c(URI uri, M m10) {
        try {
            this.f74161a = new URI(null, null, uri.getPath(), uri.getQuery(), null);
            this.f74162b = m10;
            if (m10 != null) {
            } else {
                throw new IllegalArgumentException("Model instance must not be null");
            }
        } catch (URISyntaxException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean d(URI uri) {
        return uri.equals(b());
    }

    public int hashCode() {
        return b().hashCode();
    }
}
