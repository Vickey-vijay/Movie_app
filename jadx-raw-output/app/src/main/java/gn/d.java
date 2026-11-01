package gn;

import android.os.Build;
import com.ironsource.C3426d4;
import java.util.concurrent.ExecutorService;
import kn.f;
import mn.g;
import mn.i;
import no.m;
import no.n;
import org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl;
import po.h;
import po.j;
import po.l;

/* JADX INFO: compiled from: AndroidUpnpServiceConfiguration.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends fn.a {

    /* JADX INFO: compiled from: AndroidUpnpServiceConfiguration.java */
    public class a extends oo.b {
        public a(ExecutorService executorService) {
            super(executorService);
        }

        @Override // po.b
        public String d(int i10, int i11) {
            i iVar = new i(i10, i11);
            iVar.i(C3426d4.f28386d);
            iVar.j(Build.VERSION.RELEASE);
            return iVar.toString();
        }
    }

    public d() {
        this(0);
    }

    @Override // fn.a, fn.c
    public int a() {
        return 3000;
    }

    public d(int i10) {
        super(i10, false);
        System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
    }

    @Override // fn.a
    public kn.a B() {
        return new kn.b();
    }

    @Override // fn.a
    public po.e C() {
        return new m();
    }

    @Override // fn.a
    public g D() {
        return new g("/upnp");
    }

    @Override // fn.a
    public po.g E(int i10) {
        return new gn.a(i10);
    }

    @Override // fn.a
    public h F() {
        return new n();
    }

    @Override // fn.a
    public kn.c G() {
        return new f();
    }

    @Override // fn.a, fn.c
    public j b() {
        return new oo.c(new a(h()));
    }

    @Override // fn.a, fn.c
    public l j(po.g gVar) {
        return new AsyncServletStreamServerImpl(new no.a(oo.a.f65470c, gVar.e()));
    }
}
