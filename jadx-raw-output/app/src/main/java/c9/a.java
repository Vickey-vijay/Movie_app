package c9;

import eo.c;
import nn.d;
import org.fourthline.cling.model.message.UpnpResponse;
import un.l;

/* JADX INFO: compiled from: ClingPlayControl.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5702a = 3;

    /* JADX INFO: renamed from: c9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClingPlayControl.java */
    public class C0022a extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d9.a f5703e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0022a(l lVar, d9.a aVar) {
            super(lVar);
            this.f5703e = aVar;
        }

        @Override // ln.a
        public void d(d dVar, UpnpResponse upnpResponse, String str) {
            if (h9.c.a(this.f5703e)) {
                this.f5703e.a(new e9.d(dVar, upnpResponse, str));
            }
        }

        @Override // eo.c, ln.a
        public void h(d dVar) {
            super.h(dVar);
            if (h9.c.a(this.f5703e)) {
                this.f5703e.b(new e9.d(dVar));
            }
        }
    }

    public void a(int i10) {
        if (this.f5702a != i10) {
            this.f5702a = i10;
        }
    }

    public void b(d9.a aVar) {
        l lVarA = h9.a.a(g9.a.f53194c);
        if (h9.c.b(lVarA)) {
            return;
        }
        ln.b bVarB = h9.a.b();
        if (h9.c.b(bVarB)) {
            return;
        }
        bVarB.c(new C0022a(lVarA, aVar));
    }
}
