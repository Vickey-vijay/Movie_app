package w;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import ck.p;
import co.g;
import com.android.cast.dlna.dmc.DLNACastService;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tn.a0;
import tn.t;
import x.f;
import x.l;
import x.m;
import x.o;
import yn.j;
import yn.s;
import yn.w;
import yn.y;

/* JADX INFO: compiled from: DLNACastManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f73245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f73246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f73247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f73248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f73249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f73250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s f73251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v.b f73252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f73253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static j f73254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static gn.c f73255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Context f73256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ServiceConnection f73257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final List<e> f73258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Map<un.a<?, ?, ?>, l> f73259p;

    /* JADX INFO: renamed from: w.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DLNACastManager.kt */
    public static final class ServiceConnectionC0770a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            p.j(componentName, "componentName");
            v.b bVar = a.f73252i;
            ck.w wVar = ck.w.f6066a;
            String str = String.format("[%s] onBindingDied", Arrays.copyOf(new Object[]{componentName.getShortClassName()}, 1));
            p.i(str, "java.lang.String.format(format, *args)");
            v.b.i(bVar, str, null, 2, null);
            m();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p.j(componentName, "componentName");
            p.j(iBinder, "iBinder");
            gn.c cVar = (gn.c) iBinder;
            if (a.f73255l != cVar) {
                a.f73255l = cVar;
                v.b bVar = a.f73252i;
                ck.w wVar = ck.w.f6066a;
                String str = String.format("onServiceConnected: [%s]", Arrays.copyOf(new Object[]{componentName.getShortClassName()}, 1));
                p.i(str, "java.lang.String.format(format, *args)");
                v.b.f(bVar, str, null, 2, null);
                co.c registry = cVar.getRegistry();
                Collection<g> listeners = registry.getListeners();
                if (listeners == null || !listeners.contains(a.f73253j)) {
                    registry.w(a.f73253j);
                }
                a.r(a.f73245b, null, 1, null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            p.j(componentName, "componentName");
            v.b bVar = a.f73252i;
            ck.w wVar = ck.w.f6066a;
            String str = String.format("[%s] onServiceDisconnected", Arrays.copyOf(new Object[]{componentName.getShortClassName()}, 1));
            p.i(str, "java.lang.String.format(format, *args)");
            v.b.i(bVar, str, null, 2, null);
            m();
        }

        public final void m() {
            co.c registry;
            gn.c cVar = a.f73255l;
            if (cVar != null && (registry = cVar.getRegistry()) != null) {
                registry.a(a.f73253j);
            }
            a.f73255l = null;
        }
    }

    static {
        a aVar = new a();
        f73245b = aVar;
        f73246c = new w("MediaRenderer");
        f73247d = new w("MediaServer");
        f73248e = new y("AVTransport");
        f73249f = new y("RenderingControl");
        f73250g = new y("ContentDirectory");
        f73251h = new y("ConnectionManager");
        f73252i = v.b.f73000b.a("CastManager");
        f73253j = new d(aVar);
        f73257n = new ServiceConnectionC0770a();
        f73258o = new ArrayList();
        f73259p = new LinkedHashMap();
    }

    public static /* synthetic */ void r(a aVar, j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = null;
        }
        aVar.q(jVar);
    }

    @Override // w.e
    public void a(un.a<?, ?, ?> aVar) {
        p.j(aVar, C3426d4.i.G);
        if (h(aVar)) {
            Iterator<T> it = f73258o.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(aVar);
            }
        }
    }

    @Override // w.e
    public void b(un.a<?, ?, ?> aVar) {
        p.j(aVar, C3426d4.i.G);
        if (h(aVar)) {
            Iterator<T> it = f73258o.iterator();
            while (it.hasNext()) {
                ((e) it.next()).b(aVar);
            }
        }
    }

    public final void g(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        f73256m = context.getApplicationContext();
        if ((context instanceof Application) || (context instanceof Activity)) {
            ((ContextWrapper) context).bindService(new Intent(context, (Class<?>) DLNACastService.class), f73257n, 1);
        } else {
            v.b.c(f73252i, "bindCastService only support Application or Activity implementation.", null, 2, null);
        }
    }

    public final boolean h(un.a<?, ?, ?> aVar) {
        j jVar = f73254k;
        return jVar == null || p.e(jVar, aVar.getType());
    }

    public final l i(un.a<?, ?, ?> aVar, o oVar) {
        fn.b bVar;
        p.j(aVar, C3426d4.i.G);
        p.j(oVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        gn.c cVar = f73255l;
        if (cVar == null || (bVar = cVar.get()) == null) {
            return m.f74237a;
        }
        Map<un.a<?, ?, ?>, l> map = f73259p;
        l lVar = map.get(aVar);
        if (lVar != null) {
            return lVar;
        }
        ln.b bVarB = bVar.b();
        p.i(bVarB, "getControlPoint(...)");
        f fVar = new f(bVarB, aVar, oVar);
        map.put(aVar, fVar);
        return fVar;
    }

    public final void j(un.a<?, ?, ?> aVar) {
        p.j(aVar, C3426d4.i.G);
        Map<un.a<?, ?, ?>, l> map = f73259p;
        l lVar = map.get(aVar);
        f fVar = lVar instanceof f ? (f) lVar : null;
        if (fVar != null) {
            fVar.e(true);
        }
        map.put(aVar, null);
    }

    public final s k() {
        return f73251h;
    }

    public final s l() {
        return f73248e;
    }

    public final s m() {
        return f73250g;
    }

    public final s n() {
        return f73249f;
    }

    public final boolean o(un.a<?, ?, ?> aVar) {
        p.j(aVar, C3426d4.i.G);
        return f73259p.get(aVar) != null;
    }

    public final void p(e eVar) {
        Collection<un.a> collectionC;
        if (eVar == null) {
            return;
        }
        gn.c cVar = f73255l;
        if (cVar != null && (collectionC = cVar.getRegistry().c()) != null) {
            Iterator<T> it = collectionC.iterator();
            while (it.hasNext()) {
                un.a<?, ?, ?> aVar = (un.a) it.next();
                p.g(aVar);
                eVar.a(aVar);
            }
        }
        List<e> list = f73258o;
        if (list.contains(eVar)) {
            return;
        }
        list.add(eVar);
    }

    public final void q(j jVar) {
        fn.b bVar;
        gn.c cVar = f73255l;
        if (cVar == null || (bVar = cVar.get()) == null) {
            return;
        }
        f73254k = jVar;
        Collection<un.a> collectionC = bVar.getRegistry().c();
        if (collectionC != null) {
            ArrayList<un.a<?, ?, ?>> arrayList = new ArrayList();
            for (Object obj : collectionC) {
                un.a aVar = (un.a) obj;
                j jVar2 = f73254k;
                if (jVar2 == null || !p.e(jVar2, aVar.getType())) {
                    arrayList.add(obj);
                }
            }
            for (un.a<?, ?, ?> aVar2 : arrayList) {
                for (e eVar : f73258o) {
                    p.g(aVar2);
                    eVar.b(aVar2);
                }
                bVar.getRegistry().B(aVar2.r().b());
            }
        }
        bVar.b().e(jVar != null ? new a0(jVar) : new t());
    }

    public final void s(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        if ((context instanceof Application) || (context instanceof Activity)) {
            ((ContextWrapper) context).unbindService(f73257n);
        } else {
            v.b.c(f73252i, "bindCastService only support Application or Activity implementation.", null, 2, null);
        }
    }
}
