package l0;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f63378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0.a f63379c;

    @Override // l0.a
    public boolean a() {
        return this.f63378b.a();
    }

    @Override // l0.a
    public void b() {
        this.f63378b.b();
    }

    @Override // l0.a
    public boolean c() {
        return this.f63378b.c();
    }

    @Override // l0.a
    public String d() {
        return null;
    }

    @Override // l0.a
    public void destroy() {
        this.f63379c = null;
        this.f63378b.destroy();
    }

    @Override // l0.a
    public final String e() {
        return this.f63378b.e();
    }

    @Override // l0.a
    public boolean f() {
        return this.f63378b.f();
    }

    @Override // l0.a
    public Context g() {
        return this.f63378b.g();
    }

    @Override // l0.a
    public String i() {
        return null;
    }

    @Override // l0.a
    public boolean j() {
        return false;
    }

    @Override // l0.a
    public void a(String str) {
        p0.a aVar = this.f63379c;
        if (aVar != null) {
            aVar.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // l0.a
    public void b(String str) {
        p0.a aVar = this.f63379c;
        if (aVar != null) {
            aVar.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // l0.a
    public void c(String str) {
        p0.a aVar = this.f63379c;
        if (aVar != null) {
            aVar.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // l0.a
    public final void e(a aVar) {
        this.f63378b.e(aVar);
    }

    @Override // l0.a
    public final void f(a aVar) {
        this.f63378b.f(aVar);
    }

    @Override // l0.a
    public void g(ComponentName componentName, IBinder iBinder) {
        p0.a aVar = this.f63379c;
        if (aVar != null) {
            aVar.onIgniteServiceConnected(componentName, iBinder);
        }
    }

    @Override // l0.a
    public boolean h() {
        return this.f63378b.h();
    }

    @Override // l0.a
    public IIgniteServiceAPI k() {
        return this.f63378b.k();
    }

    @Override // l0.a
    public void l() {
        this.f63378b.l();
    }

    @Override // p0.b
    public void onCredentialsRequestFailed(String str) {
        this.f63378b.onCredentialsRequestFailed(str);
    }

    @Override // p0.b
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f63378b.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f63378b.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f63378b.onServiceDisconnected(componentName);
    }

    public f(a aVar, p0.a aVar2) {
        this.f63378b = aVar;
        this.f63379c = aVar2;
        aVar.e(this);
        aVar.f(this);
    }
}
