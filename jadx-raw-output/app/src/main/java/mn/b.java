package mn;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: DefaultServiceManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class b<T> implements j<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Logger f64615f = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final un.f<T> f64616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<T> f64617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f64618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f64619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PropertyChangeSupport f64620e;

    /* JADX INFO: compiled from: DefaultServiceManager.java */
    public class a implements PropertyChangeListener {
        public a() {
        }

        @Override // java.beans.PropertyChangeListener
        public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
            b.f64615f.finer("Property change event on local service: " + propertyChangeEvent.getPropertyName());
            if (propertyChangeEvent.getPropertyName().equals("_EventedStateVariables")) {
                return;
            }
            String[] strArrA = f.a(propertyChangeEvent.getPropertyName());
            b.f64615f.fine("Changed variable names: " + Arrays.toString(strArrA));
            try {
                Collection<xn.d> collectionG = b.this.g(strArrA);
                if (!collectionG.isEmpty()) {
                    b.this.a().firePropertyChange("_EventedStateVariables", (Object) null, collectionG);
                }
            } catch (Exception e10) {
                b.f64615f.log(Level.SEVERE, "Error reading state of service after state variable update event: " + so.a.a(e10), (Throwable) e10);
            }
        }
    }

    public b(un.f<T> fVar) {
        this(fVar, null);
    }

    public int h() {
        return 500;
    }

    public Collection<xn.d> l() throws Exception {
        return null;
    }

    public b(un.f<T> fVar, Class<T> cls) {
        this.f64618c = new ReentrantLock(true);
        this.f64616a = fVar;
        this.f64617b = cls;
    }

    public PropertyChangeListener d(T t10) throws Exception {
        return new a();
    }

    public T f() throws Exception {
        Class<T> cls = this.f64617b;
        if (cls == null) {
            throw new IllegalStateException("Subclass has to provide service class or override createServiceInstance()");
        }
        try {
            return cls.getConstructor(un.f.class).newInstance(i());
        } catch (NoSuchMethodException unused) {
            f64615f.fine("Creating new service implementation instance with no-arg constructor: " + this.f64617b.getName());
            return this.f64617b.newInstance();
        }
    }

    public un.f<T> i() {
        return this.f64616a;
    }

    public void j() {
        f64615f.fine("No service implementation instance available, initializing...");
        try {
            T tF = f();
            this.f64619d = tF;
            PropertyChangeSupport propertyChangeSupportE = e(tF);
            this.f64620e = propertyChangeSupportE;
            propertyChangeSupportE.addPropertyChangeListener(d(this.f64619d));
        } catch (Exception e10) {
            throw new RuntimeException("Could not initialize implementation: " + e10, e10);
        }
    }

    public void k() {
        try {
            if (this.f64618c.tryLock(h(), TimeUnit.MILLISECONDS)) {
                if (f64615f.isLoggable(Level.FINEST)) {
                    f64615f.finest("Acquired lock");
                }
            } else {
                throw new RuntimeException("Failed to acquire lock in milliseconds: " + h());
            }
        } catch (InterruptedException e10) {
            throw new RuntimeException("Failed to acquire lock:" + e10);
        }
    }

    public void m() {
        if (f64615f.isLoggable(Level.FINEST)) {
            f64615f.finest("Releasing lock");
        }
        this.f64618c.unlock();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") Implementation: " + this.f64619d;
    }

    @Override // mn.j
    public PropertyChangeSupport a() {
        k();
        try {
            if (this.f64620e == null) {
                j();
            }
            return this.f64620e;
        } finally {
            m();
        }
    }

    @Override // mn.j
    public void b(mn.a<T> aVar) throws Exception {
        k();
        try {
            aVar.a(this);
        } finally {
            m();
        }
    }

    public PropertyChangeSupport e(T t10) throws Exception {
        Method methodF = so.d.f(t10.getClass(), "propertyChangeSupport");
        if (methodF != null && PropertyChangeSupport.class.isAssignableFrom(methodF.getReturnType())) {
            f64615f.fine("Service implementation instance offers PropertyChangeSupport, using that: " + t10.getClass().getName());
            return (PropertyChangeSupport) methodF.invoke(t10, new Object[0]);
        }
        f64615f.fine("Creating new PropertyChangeSupport for service implementation: " + t10.getClass().getName());
        return new PropertyChangeSupport(t10);
    }

    public Collection<xn.d> g(String[] strArr) throws Exception {
        k();
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                String strTrim = str.trim();
                un.m<un.f> mVarH = i().h(strTrim);
                if (mVarH != null && mVarH.a().c()) {
                    xn.c cVarO = i().o(mVarH);
                    if (cVarO == null) {
                        f64615f.warning("Ignoring evented state variable without accessor: " + strTrim);
                    } else {
                        arrayList.add(cVarO.c(mVarH, getImplementation()));
                    }
                } else {
                    f64615f.fine("Ignoring unknown or non-evented state variable: " + strTrim);
                }
            }
            return arrayList;
        } finally {
            m();
        }
    }

    @Override // mn.j
    public Collection<xn.d> getCurrentState() throws Exception {
        k();
        try {
            Collection<xn.d> collectionL = l();
            if (collectionL != null) {
                f64615f.fine("Obtained initial state variable values for event, skipping individual state variable accessors");
                m();
                return collectionL;
            }
            ArrayList arrayList = new ArrayList();
            for (un.m<un.f> mVar : i().i()) {
                if (mVar.a().c()) {
                    xn.c cVarO = i().o(mVar);
                    if (cVarO != null) {
                        arrayList.add(cVarO.c(mVar, getImplementation()));
                    } else {
                        throw new IllegalStateException("No accessor for evented state variable");
                    }
                }
            }
            m();
            return arrayList;
        } catch (Throwable th2) {
            m();
            throw th2;
        }
    }

    @Override // mn.j
    public T getImplementation() {
        k();
        try {
            if (this.f64619d == null) {
                j();
            }
            return this.f64619d;
        } finally {
            m();
        }
    }
}
