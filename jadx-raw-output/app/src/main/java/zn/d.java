package zn;

import java.util.logging.Logger;
import org.fourthline.cling.model.message.b;
import org.fourthline.cling.model.message.c;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: ReceivingSync.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d<IN extends org.fourthline.cling.model.message.b, OUT extends org.fourthline.cling.model.message.c> extends c<IN> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f86502g = Logger.getLogger(fn.b.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vn.c f86503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OUT f86504f;

    public abstract OUT f() throws RouterException;

    public void i(Throwable th2) {
    }

    public void j(org.fourthline.cling.model.message.c cVar) {
    }

    public OUT g() {
        return this.f86504f;
    }

    public vn.c h() {
        return this.f86503e;
    }

    @Override // zn.c
    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }

    public d(fn.b bVar, IN in2) {
        super(bVar, in2);
        this.f86503e = new vn.c(in2);
    }

    @Override // zn.c
    public final void a() throws RouterException {
        OUT out = (OUT) f();
        this.f86504f = out;
        if (out != null && h().d().size() > 0) {
            f86502g.fine("Setting extra headers on response message: " + h().d().size());
            this.f86504f.j().putAll(h().d());
        }
    }
}
