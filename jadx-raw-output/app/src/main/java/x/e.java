package x;

import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastTagName;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.support.lastchange.LastChangeParser;

/* JADX INFO: compiled from: ServiceExecutor.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.b f74206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final un.l<?, ?> f74207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f74208c;

    /* JADX INFO: compiled from: ServiceExecutor.kt */
    public static final class a extends e implements x.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v.b f74209d;

        /* JADX INFO: renamed from: x.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ServiceExecutor.kt */
        public static final class C0786a extends eo.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f74210e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ p<mj.r> f74211f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0786a(String str, a aVar, p<mj.r> pVar, un.l<?, ?> lVar) {
                super(lVar, str);
                this.f74210e = aVar;
                this.f74211f = pVar;
            }

            @Override // ln.a
            public void d(nn.d<?> dVar, UpnpResponse upnpResponse, String str) {
                a aVar = this.f74210e;
                p<mj.r> pVar = this.f74211f;
                if (str == null) {
                    str = VastTagName.ERROR;
                }
                aVar.l(pVar, str);
            }

            @Override // eo.a, ln.a
            public void h(nn.d<?> dVar) {
                this.f74210e.o(this.f74211f, mj.r.f64562a);
            }
        }

        /* JADX INFO: compiled from: ServiceExecutor.kt */
        public static final class b extends eo.b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f74212e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ p<mj.r> f74213f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2, a aVar, p<mj.r> pVar, un.l<?, ?> lVar) {
                super(lVar, str, str2);
                this.f74212e = aVar;
                this.f74213f = pVar;
            }

            @Override // ln.a
            public void d(nn.d<?> dVar, UpnpResponse upnpResponse, String str) {
                a aVar = this.f74212e;
                p<mj.r> pVar = this.f74213f;
                if (str == null) {
                    str = VastTagName.ERROR;
                }
                aVar.l(pVar, str);
            }

            @Override // eo.b, ln.a
            public void h(nn.d<?> dVar) {
                this.f74212e.o(this.f74213f, mj.r.f64562a);
            }
        }

        /* JADX INFO: compiled from: ServiceExecutor.kt */
        public static final class c extends eo.c {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ p<mj.r> f74215f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(p<mj.r> pVar, un.l<?, ?> lVar) {
                super(lVar);
                this.f74215f = pVar;
            }

            @Override // ln.a
            public void d(nn.d<?> dVar, UpnpResponse upnpResponse, String str) {
                a aVar = a.this;
                p<mj.r> pVar = this.f74215f;
                if (str == null) {
                    str = VastTagName.ERROR;
                }
                aVar.l(pVar, str);
            }

            @Override // eo.c, ln.a
            public void h(nn.d<?> dVar) {
                a.this.o(this.f74215f, mj.r.f64562a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ln.b bVar, un.l<?, ?> lVar) {
            super(bVar, lVar);
            ck.p.j(bVar, "controlPoint");
            this.f74209d = v.b.f73000b.a("AvTransportService");
        }

        @Override // x.e
        public v.b h() {
            return this.f74209d;
        }

        @Override // x.b
        public void a(String str, p<mj.r> pVar) {
            ck.p.j(str, "speed");
            v.b.f(h(), "Play", null, 2, null);
            if (j("Play")) {
                e.m(this, pVar, null, 2, null);
            } else {
                e.g(this, new C0786a(str, this, pVar, i()), false, 2, null);
            }
        }

        @Override // x.b
        public void b(String str, String str2, p<mj.r> pVar) {
            ck.p.j(str, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            ck.p.j(str2, "title");
            v.b.f(h(), "SetAVTransportURI: " + str2 + ", " + str, null, 2, null);
            if (j("SetAVTransportURI")) {
                e.m(this, pVar, null, 2, null);
                return;
            }
            String strB = n.f74238a.b(str, str2);
            v.b.f(h(), "SetAVTransportURI: " + strB, null, 2, null);
            e.g(this, new b(str, strB, this, pVar, i()), false, 2, null);
        }

        @Override // x.b
        public void c(p<mj.r> pVar) {
            v.b.f(h(), "Stop", null, 2, null);
            if (j("Stop")) {
                e.m(this, pVar, null, 2, null);
            } else {
                e.g(this, new c(pVar, i()), false, 2, null);
            }
        }
    }

    /* JADX INFO: compiled from: ServiceExecutor.kt */
    public static final class b extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v.b f74216d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ln.b bVar, un.l<?, ?> lVar) {
            super(bVar, lVar);
            ck.p.j(bVar, "controlPoint");
            this.f74216d = v.b.f73000b.a("ContentService");
        }

        @Override // x.e
        public v.b h() {
            return this.f74216d;
        }
    }

    /* JADX INFO: compiled from: ServiceExecutor.kt */
    public static final class c extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v.b f74217d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ln.b bVar, un.l<?, ?> lVar) {
            super(bVar, lVar);
            ck.p.j(bVar, "controlPoint");
            this.f74217d = v.b.f73000b.a("RendererService");
        }

        @Override // x.e
        public v.b h() {
            return this.f74217d;
        }
    }

    public abstract v.b h();

    public e(ln.b bVar, un.l<?, ?> lVar) {
        ck.p.j(bVar, "controlPoint");
        this.f74206a = bVar;
        this.f74207b = lVar;
        this.f74208c = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void g(e eVar, ln.a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeAction");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        eVar.f(aVar, z10);
    }

    public static /* synthetic */ void m(e eVar, p pVar, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyFailure");
        }
        if ((i10 & 2) != 0) {
            str = "Service not support this action.";
        }
        eVar.l(pVar, str);
    }

    public final void f(ln.a aVar, boolean z10) {
        ck.p.j(aVar, "actionCallback");
        this.f74206a.c(new x.a(aVar, z10));
    }

    public final un.l<?, ?> i() {
        return this.f74207b;
    }

    public final boolean j(String str) {
        ck.p.j(str, C3426d4.i.f28571v0);
        un.l<?, ?> lVar = this.f74207b;
        boolean z10 = (lVar != null ? lVar.a(str) : null) == null;
        if (z10) {
            v.b.i(h(), "[Unsupported]" + str, null, 2, null);
        }
        return z10;
    }

    public final <T> void l(final p<T> pVar, final String str) {
        ck.p.j(str, "exception");
        if (pVar != null) {
            k(new Runnable() { // from class: x.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.n(pVar, str);
                }
            });
        }
    }

    public final <T> void o(final p<T> pVar, final T t10) {
        if (pVar != null) {
            k(new Runnable() { // from class: x.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.p(pVar, t10);
                }
            });
        }
    }

    public static final void n(p pVar, String str) {
        pVar.onFailure(str);
    }

    public static final void p(p pVar, Object obj) {
        pVar.onSuccess(obj);
    }

    public final void k(Runnable runnable) {
        if (!ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
            this.f74208c.post(runnable);
        } else {
            runnable.run();
        }
    }

    public final void q(r rVar, LastChangeParser lastChangeParser) {
        ck.p.j(rVar, "subscriptionCallback");
        ck.p.j(lastChangeParser, "lastChangeParser");
        this.f74206a.d(new k(this.f74207b, 0, lastChangeParser, rVar, 2, null));
    }
}
