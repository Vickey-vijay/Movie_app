package j0;

import android.content.Context;
import l0.e;
import l0.f;
import l0.h;

/* JADX INFO: loaded from: classes5.dex */
public class a implements p0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f61679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f61680b;

    public a(r0.a aVar, n0.a aVar2) {
        r0.b.f66637b.f66638a = aVar;
        n0.b.f64667b.f64668a = aVar2;
    }

    public void destroy() {
        this.f61680b = null;
        this.f61679a.destroy();
    }

    public void authenticate() {
        t0.c.f72105a.execute(new b(this));
    }

    public String getOdt() {
        c cVar = this.f61680b;
        return cVar != null ? cVar.f61682a : "";
    }

    public boolean isAuthenticated() {
        return this.f61679a.h();
    }

    public boolean isConnected() {
        return this.f61679a.a();
    }

    @Override // p0.b
    public void onCredentialsRequestFailed(String str) {
        this.f61679a.onCredentialsRequestFailed(str);
    }

    @Override // p0.b
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f61679a.onCredentialsRequestSuccess(str, str2);
    }

    public a(Context context, r0.a aVar, boolean z10, p0.a aVar2) {
        this(aVar, null);
        this.f61679a = new h(new e(context), false, z10, aVar2, this);
    }
}
