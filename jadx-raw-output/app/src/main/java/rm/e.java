package rm;

import java.io.IOException;
import org.eclipse.jetty.http.HttpException;

/* JADX INFO: compiled from: BlockingHttpConnection.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends b {
    public static final zm.c E = zm.b.a(e.class);

    @Override // mm.j
    public mm.j e() throws IOException {
        mm.k kVar;
        mm.j jVar;
        mm.j jVar2;
        try {
            b.Q(this);
            mm.j jVar3 = this;
            while (this.f64595c.isOpen() && jVar3 == this) {
                try {
                    try {
                        if (!this.f66830i.isComplete() && !this.f64595c.x()) {
                            this.f66830i.a();
                        }
                        if (this.f66834m.a() && !this.f66834m.isComplete() && !this.f64595c.s()) {
                            this.f66834m.z();
                        }
                        this.f64595c.flush();
                        if (this.f66830i.isComplete() && this.f66834m.isComplete()) {
                            P();
                            if (this.f66836o.w() == 101 && (jVar2 = (mm.j) this.f66832k.getAttribute("org.eclipse.jetty.io.Connection")) != null) {
                                jVar3 = jVar2;
                            }
                            if (!this.f66834m.s() && !this.f64595c.s()) {
                                E.g("Safety net oshut!!! Please open a bugzilla", new Object[0]);
                                this.f64595c.l();
                            }
                        }
                        if (this.f64595c.x() && this.f66834m.p() && !this.f66832k.y().t()) {
                            kVar = this.f64595c;
                            kVar.close();
                        }
                    } catch (HttpException e10) {
                        zm.c cVar = E;
                        if (cVar.f()) {
                            cVar.i("uri=" + this.f66829h, new Object[0]);
                            cVar.i("fields=" + this.f66831j, new Object[0]);
                            cVar.a(e10);
                        }
                        this.f66834m.B(e10.getStatus(), e10.getReason(), null, true);
                        this.f66830i.reset();
                        this.f64595c.l();
                        if (this.f66830i.isComplete() && this.f66834m.isComplete()) {
                            P();
                            if (this.f66836o.w() == 101 && (jVar = (mm.j) this.f66832k.getAttribute("org.eclipse.jetty.io.Connection")) != null) {
                                jVar3 = jVar;
                            }
                            if (!this.f66834m.s() && !this.f64595c.s()) {
                                cVar.g("Safety net oshut!!! Please open a bugzilla", new Object[0]);
                                this.f64595c.l();
                            }
                        }
                        if (this.f64595c.x() && this.f66834m.p() && !this.f66832k.y().t()) {
                            kVar = this.f64595c;
                        }
                    }
                } catch (Throwable th2) {
                    if (this.f66830i.isComplete() && this.f66834m.isComplete()) {
                        P();
                        if (this.f66836o.w() == 101) {
                        }
                        if (!this.f66834m.s() && !this.f64595c.s()) {
                            E.g("Safety net oshut!!! Please open a bugzilla", new Object[0]);
                            this.f64595c.l();
                        }
                    }
                    if (this.f64595c.x() && this.f66834m.p() && !this.f66832k.y().t()) {
                        this.f64595c.close();
                    }
                    throw th2;
                }
            }
            b.Q(null);
            this.f66830i.q();
            this.f66834m.q();
            return jVar3;
        } catch (Throwable th3) {
            b.Q(null);
            this.f66830i.q();
            this.f66834m.q();
            throw th3;
        }
    }

    public e(f fVar, mm.k kVar, p pVar) {
        super(fVar, kVar, pVar);
    }

    @Override // rm.b
    public void E() throws Throwable {
        super.E();
    }
}
