package org.eclipse.jetty.security.authentication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import lj.e;
import lj.f;
import lj.h;
import pm.g;
import pm.k;
import rm.d;
import rm.v;
import zm.b;
import zm.c;

/* JADX INFO: loaded from: classes3.dex */
public class SessionAuthentication implements d.h, Serializable, f, h {
    public static final String __J_AUTHENTICATED = "org.eclipse.jetty.security.UserIdentity";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f65674d = b.a(SessionAuthentication.class);
    private static final long serialVersionUID = -4643200685888258706L;
    private final Object _credentials;
    private final String _method;
    private final String _name;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient v f65675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient e f65676c;

    @Override // lj.f
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
    }

    @Override // rm.d.h
    public String getAuthMethod() {
        return this._method;
    }

    @Override // rm.d.h
    public v getUserIdentity() {
        return this.f65675b;
    }

    public boolean isUserInRole(v.a aVar, String str) {
        return this.f65675b.a(str, aVar);
    }

    public void logout() {
        e eVar = this.f65676c;
        if (eVar != null && eVar.getAttribute(__J_AUTHENTICATED) != null) {
            this.f65676c.removeAttribute(__J_AUTHENTICATED);
        }
        A();
    }

    @Override // lj.f
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        if (this.f65676c == null) {
            this.f65676c = httpSessionEvent.getSession();
        }
    }

    public String toString() {
        return "Session" + super.toString();
    }

    @Override // lj.h
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        if (this.f65676c == null) {
            this.f65676c = httpSessionBindingEvent.getSession();
        }
    }

    public SessionAuthentication(String str, v vVar, Object obj) {
        this._method = str;
        this.f65675b = vVar;
        this._name = vVar.b().getName();
        this._credentials = obj;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        k kVarI0 = k.I0();
        if (kVarI0 != null) {
            g gVarU = kVarI0.U();
            if (gVarU != null) {
                this.f65675b = gVarU.c(this._name, this._credentials);
                f65674d.i("Deserialized and relogged in {}", this);
                return;
            }
            throw new IllegalStateException("!LoginService");
        }
        throw new IllegalStateException("!SecurityHandler");
    }

    public final void A() {
        k kVarI0 = k.I0();
        if (kVarI0 != null) {
            kVarI0.L0(this);
        }
        e eVar = this.f65676c;
        if (eVar != null) {
            eVar.removeAttribute("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated");
        }
    }

    @Override // lj.h
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        A();
    }
}
