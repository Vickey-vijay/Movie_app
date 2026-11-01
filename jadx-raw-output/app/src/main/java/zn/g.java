package zn;

import org.fourthline.cling.model.message.b;
import org.fourthline.cling.model.message.c;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: compiled from: SendingSync.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g<IN extends org.fourthline.cling.model.message.b, OUT extends org.fourthline.cling.model.message.c> extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IN f86512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OUT f86513e;

    public abstract OUT d() throws RouterException;

    public IN e() {
        return this.f86512d;
    }

    public OUT f() {
        return this.f86513e;
    }

    @Override // zn.f
    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }

    public g(fn.b bVar, IN in2) {
        super(bVar);
        this.f86512d = in2;
    }

    @Override // zn.f
    public final void a() throws RouterException {
        this.f86513e = (OUT) d();
    }
}
