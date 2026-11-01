package g9;

import androidx.annotation.Nullable;
import com.mgs.carparking.androidupnp.service.ClingUpnpService;
import e9.e;
import e9.f;
import yn.j;
import yn.s;
import yn.w;
import yn.y;

/* JADX INFO: compiled from: ClingManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f53194c = new y("AVTransport");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f53195d = new y("RenderingControl");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f53196e = new w("MediaRenderer");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f53197f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ClingUpnpService f53198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f53199b;

    public static a c() {
        if (h9.c.b(f53197f)) {
            f53197f = new a();
        }
        return f53197f;
    }

    public void a() {
        this.f53198a.onDestroy();
        this.f53199b.destroy();
    }

    @Nullable
    public e b() {
        if (h9.c.b(this.f53198a)) {
            return null;
        }
        e9.a.c().d(this.f53198a.c());
        return e9.a.c();
    }

    public co.c d() {
        return this.f53198a.d();
    }

    public f e() {
        if (h9.c.b(this.f53199b)) {
            return null;
        }
        return this.f53199b.a();
    }

    public ClingUpnpService f() {
        return this.f53198a;
    }

    public void g() {
        if (h9.c.b(this.f53198a)) {
            return;
        }
        this.f53198a.c().b();
    }

    public void h(c cVar) {
        this.f53199b = cVar;
    }

    public void i(ClingUpnpService clingUpnpService) {
        this.f53198a = clingUpnpService;
    }
}
