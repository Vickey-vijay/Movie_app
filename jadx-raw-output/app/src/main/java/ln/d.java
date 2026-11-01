package ln;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.protocol.ProtocolCreationException;
import un.f;
import un.k;
import un.l;

/* JADX INFO: compiled from: SubscriptionCallback.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class d implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Logger f63897f = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f63898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f63899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ln.b f63900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public on.a f63901e;

    /* JADX INFO: compiled from: SubscriptionCallback.java */
    public class a extends on.b {
        public a(f fVar, Integer num, List list) {
            super(fVar, num, list);
        }

        @Override // on.b
        public void M(CancelReason cancelReason) {
            synchronized (d.this) {
                d.this.o(null);
                d.this.c(this, cancelReason, null);
            }
        }

        @Override // on.a
        public void b() {
            synchronized (d.this) {
                d.this.o(this);
                d.this.f(this);
            }
        }

        @Override // on.a
        public void h() {
            synchronized (d.this) {
                d.f63897f.fine("Local service state updated, notifying callback, sequence is: " + A());
                d.this.g(this);
                P();
            }
        }
    }

    /* JADX INFO: compiled from: SubscriptionCallback.java */
    public class b extends on.c {
        public b(k kVar, int i10) {
            super(kVar, i10);
        }

        @Override // on.c
        public void M(CancelReason cancelReason, UpnpResponse upnpResponse) {
            synchronized (d.this) {
                d.this.o(null);
                d.this.c(this, cancelReason, upnpResponse);
            }
        }

        @Override // on.c
        public void O(int i10) {
            synchronized (d.this) {
                d.this.h(this, i10);
            }
        }

        @Override // on.c
        public void Q(UpnpResponse upnpResponse) {
            synchronized (d.this) {
                d.this.o(null);
                d.this.i(this, upnpResponse, null);
            }
        }

        @Override // on.c
        public void T(UnsupportedDataException unsupportedDataException) {
            synchronized (d.this) {
                d.this.m(this, unsupportedDataException);
            }
        }

        @Override // on.a
        public void b() {
            synchronized (d.this) {
                d.this.o(this);
                d.this.f(this);
            }
        }

        @Override // on.a
        public void h() {
            synchronized (d.this) {
                d.this.g(this);
            }
        }
    }

    public abstract void c(on.a aVar, CancelReason cancelReason, UpnpResponse upnpResponse);

    public abstract void f(on.a aVar);

    public abstract void g(on.a aVar);

    public abstract void h(on.a aVar, int i10);

    public abstract void j(on.a aVar, UpnpResponse upnpResponse, Exception exc, String str);

    public synchronized ln.b k() {
        return this.f63900d;
    }

    public synchronized void n(ln.b bVar) {
        this.f63900d = bVar;
    }

    public synchronized void o(on.a aVar) {
        this.f63901e = aVar;
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        if (k() == null) {
            throw new IllegalStateException("Callback must be executed through ControlPoint");
        }
        if (l() instanceof f) {
            d((f) this.f63898b);
        } else if (l() instanceof k) {
            e((k) this.f63898b);
        }
    }

    public static String a(UpnpResponse upnpResponse, Exception exc) {
        if (upnpResponse != null) {
            return "Subscription failed:  HTTP response was: " + upnpResponse.c();
        }
        if (exc == null) {
            return "Subscription failed:  No response received.";
        }
        return "Subscription failed:  Exception occured: " + exc;
    }

    public final void e(k kVar) {
        try {
            k().a().j(new b(kVar, this.f63899c.intValue())).run();
        } catch (ProtocolCreationException e10) {
            i(this.f63901e, null, e10);
        }
    }

    public l l() {
        return this.f63898b;
    }

    public void m(on.c cVar, UnsupportedDataException unsupportedDataException) {
        f63897f.info("Invalid event message received, causing: " + unsupportedDataException);
        if (f63897f.isLoggable(Level.FINE)) {
            f63897f.fine("------------------------------------------------------------------------------");
            f63897f.fine(unsupportedDataException.getData() != null ? unsupportedDataException.getData().toString() : "null");
            f63897f.fine("------------------------------------------------------------------------------");
        }
    }

    public String toString() {
        return "(SubscriptionCallback) " + l();
    }

    public d(l lVar, int i10) {
        this.f63898b = lVar;
        this.f63899c = Integer.valueOf(i10);
    }

    public final void d(f fVar) {
        on.b aVar;
        if (k().getRegistry().o(fVar.d().r().b(), false) == null) {
            f63897f.fine("Local device service is currently not registered, failing subscription immediately");
            i(null, null, new IllegalStateException("Local device is not registered"));
            return;
        }
        try {
            aVar = new a(fVar, Integer.MAX_VALUE, Collections.EMPTY_LIST);
            try {
                f63897f.fine("Local device service is currently registered, also registering subscription");
                k().getRegistry().x(aVar);
                f63897f.fine("Notifying subscription callback of local subscription availablity");
                aVar.N();
                f63897f.fine("Simulating first initial event for local subscription callback, sequence: " + aVar.A());
                g(aVar);
                aVar.P();
                f63897f.fine("Starting to monitor state changes of local service");
                aVar.R();
            } catch (Exception e10) {
                e = e10;
                f63897f.fine("Local callback creation failed: " + e.toString());
                f63897f.log(Level.FINE, "Exception root cause: ", so.a.a(e));
                if (aVar != null) {
                    k().getRegistry().g(aVar);
                }
                i(aVar, null, e);
            }
        } catch (Exception e11) {
            e = e11;
            aVar = null;
        }
    }

    public void i(on.a aVar, UpnpResponse upnpResponse, Exception exc) {
        j(aVar, upnpResponse, exc, a(upnpResponse, exc));
    }
}
