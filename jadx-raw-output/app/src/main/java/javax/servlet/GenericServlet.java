package javax.servlet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.ResourceBundle;
import kj.i;
import kj.j;
import kj.k;
import kj.p;
import kj.t;

/* JADX INFO: loaded from: classes8.dex */
public abstract class GenericServlet implements i, j, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ResourceBundle f61727c = ResourceBundle.getBundle("javax.servlet.LocalStrings");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient j f61728b;

    @Override // kj.i
    public void destroy() {
    }

    public String getServletInfo() {
        return "";
    }

    public void init() throws ServletException {
    }

    public void log(String str) {
        getServletContext().h(getServletName() + ": " + str);
    }

    @Override // kj.i
    public abstract void service(p pVar, t tVar) throws ServletException, IOException;

    public j getServletConfig() {
        return this.f61728b;
    }

    @Override // kj.i
    public void init(j jVar) throws ServletException {
        this.f61728b = jVar;
        init();
    }

    public void log(String str, Throwable th2) {
        getServletContext().g(getServletName() + ": " + str, th2);
    }

    @Override // kj.j
    public String getInitParameter(String str) {
        j servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getInitParameter(str);
        }
        throw new IllegalStateException(f61727c.getString("err.servlet_config_not_initialized"));
    }

    @Override // kj.j
    public Enumeration<String> getInitParameterNames() {
        j servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getInitParameterNames();
        }
        throw new IllegalStateException(f61727c.getString("err.servlet_config_not_initialized"));
    }

    @Override // kj.j
    public k getServletContext() {
        j servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getServletContext();
        }
        throw new IllegalStateException(f61727c.getString("err.servlet_config_not_initialized"));
    }

    @Override // kj.j
    public String getServletName() {
        j servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getServletName();
        }
        throw new IllegalStateException(f61727c.getString("err.servlet_config_not_initialized"));
    }
}
