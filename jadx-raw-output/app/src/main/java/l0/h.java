package l0;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j0.d f63380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j0.a f63381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0.a f63382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0.b f63383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0.c f63384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o0.a f63385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f63386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f63387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f63388l;

    @Override // l0.f, l0.a
    public final void destroy() {
        this.f63381e = null;
        j0.d dVar = this.f63380d;
        if (dVar != null) {
            com.digitalturbine.ignite.authenticator.receiver.a aVar = dVar.f61684a;
            if (aVar != null && aVar.f14004b) {
                dVar.f61685b.unregisterReceiver(aVar);
                dVar.f61684a.f14004b = false;
            }
            com.digitalturbine.ignite.authenticator.receiver.a aVar2 = dVar.f61684a;
            if (aVar2 != null) {
                aVar2.f14003a = null;
                dVar.f61684a = null;
            }
            dVar.f61686c = null;
            dVar.f61685b = null;
            dVar.f61687d = null;
            this.f63380d = null;
        }
        o0.a aVar3 = this.f63385i;
        if (aVar3 != null) {
            k0.b bVar = aVar3.f64944b;
            if (bVar != null) {
                bVar.f62046c.clear();
                aVar3.f64944b = null;
            }
            aVar3.f64945c = null;
            aVar3.f64943a = null;
            this.f63385i = null;
        }
        this.f63379c = null;
        this.f63378b.destroy();
    }

    @Override // l0.f, l0.a
    public final void b() {
        if (this.f63384h == null) {
            Object[] objArr = {"OneDTAuthenticator"};
            r0.a aVar = r0.b.f66637b.f66638a;
            if (aVar != null) {
                aVar.i("%s : initializing new Ignite authentication session", objArr);
            }
            x0.a aVar2 = this.f63382f;
            aVar2.getClass();
            try {
                aVar2.f74242b.c();
            } catch (IOException e10) {
                e = e10;
                n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, u0.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidAlgorithmParameterException e11) {
                e = e11;
                n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, u0.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidKeyException e12) {
                e = e12;
                n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, u0.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (KeyStoreException e13) {
                e = e13;
                n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, u0.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchAlgorithmException e14) {
                e = e14;
                n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, u0.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchProviderException e15) {
                e = e15;
                n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, u0.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (UnrecoverableEntryException e16) {
                e = e16;
                n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, u0.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (CertificateException e17) {
                e = e17;
                n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, u0.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchPaddingException e18) {
                e = e18;
                n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, u0.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (Exception e19) {
                n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, u0.a.a(e19, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            }
            String strA = this.f63382f.a();
            this.f63383g.getClass();
            j0.c cVarA = s0.b.a(strA);
            this.f63384h = cVarA;
            if (cVarA.f61683b > TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                r0.b.a("%s : One DT resolved from cache", "OneDTAuthenticator");
                j0.c cVar = this.f63384h;
                j0.a aVar3 = this.f63381e;
                if (aVar3 != null) {
                    r0.b.a("%s : setting one dt entity", "IgniteManager");
                    aVar3.f61680b = cVar;
                }
            } else {
                this.f63388l.set(true);
            }
        }
        if (this.f63387k && this.f63380d == null) {
            r0.b.b("%s : unable to authenticate: authenticator destroyed", "OneDTAuthenticator");
            a("Unable to authenticate: authenticator destroyed");
            return;
        }
        if (!this.f63386j && !this.f63388l.get()) {
            if (this.f63387k) {
                this.f63380d.a();
            }
        } else {
            Object[] objArr2 = {"OneDTAuthenticator"};
            r0.a aVar4 = r0.b.f66637b.f66638a;
            if (aVar4 != null) {
                aVar4.i("%s : will try to authenticate with Ignite if didn't done yet", objArr2);
            }
            this.f63378b.b();
        }
    }

    @Override // l0.f, l0.a
    public final String d() {
        a aVar = this.f63378b;
        if (aVar instanceof f) {
            return aVar.d();
        }
        return null;
    }

    @Override // l0.f, l0.a
    public final void g(ComponentName componentName, IBinder iBinder) {
        p0.a aVar;
        boolean zJ = this.f63378b.j();
        if (!zJ && (aVar = this.f63379c) != null) {
            aVar.onOdtUnsupported();
        }
        if (this.f63380d != null && this.f63378b.j() && this.f63387k) {
            this.f63380d.a();
        }
        if (zJ || this.f63386j) {
            super.g(componentName, iBinder);
        }
    }

    @Override // l0.f, l0.a
    public final String i() {
        a aVar = this.f63378b;
        if (aVar instanceof f) {
            return aVar.i();
        }
        return null;
    }

    @Override // l0.f, l0.a
    public final boolean j() {
        return this.f63378b.j();
    }

    public final void m() {
        IIgniteServiceAPI iIgniteServiceAPIK = this.f63378b.k();
        if (iIgniteServiceAPIK == null) {
            r0.b.b("%s : service is unavailable", "OneDTAuthenticator");
            n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR, "error_code", com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_UNAVAILABLE.a());
            return;
        }
        if (this.f63385i == null) {
            this.f63385i = new o0.a(iIgniteServiceAPIK, this);
        }
        if (TextUtils.isEmpty(this.f63378b.e())) {
            n0.b.b(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR, "error_code", com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_INVALID_SESSION.a());
            r0.b.b("%s : service session is unavailable", "OneDTAuthenticator");
            return;
        }
        o0.a aVar = this.f63385i;
        String strE = this.f63378b.e();
        aVar.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("clientToken", strE);
            aVar.f64945c.getProperty("onedtid", bundle, new Bundle(), aVar.f64944b);
        } catch (RemoteException e10) {
            n0.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR, e10);
            r0.b.b("%s : request failed : %s", "OneDTPropertyHandler", e10.toString());
        }
    }

    public h(a aVar, boolean z10, boolean z11, p0.a aVar2, j0.a aVar3) {
        super(aVar, aVar2);
        this.f63386j = false;
        this.f63387k = false;
        this.f63388l = new AtomicBoolean(false);
        this.f63381e = aVar3;
        this.f63386j = z10;
        this.f63383g = new s0.b();
        this.f63382f = new x0.a(aVar.g());
        this.f63387k = z11;
        if (z11) {
            this.f63380d = new j0.d(aVar.g(), this, this);
        }
    }

    @Override // l0.f, l0.a
    public final void c(String str) {
        super.c(str);
        if (this.f63378b.h() && this.f63388l.get() && this.f63378b.j()) {
            this.f63388l.set(false);
            m();
        }
    }

    @Override // l0.f, l0.a
    public final void l() {
        b();
    }
}
