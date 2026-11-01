package ln;

import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.message.UpnpResponse;
import qn.e;
import un.f;
import un.k;
import un.l;

/* JADX INFO: compiled from: ActionCallback.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nn.d f63891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f63892c;

    public abstract void d(nn.d dVar, UpnpResponse upnpResponse, String str);

    public synchronized b f() {
        return this.f63892c;
    }

    public synchronized a g(b bVar) {
        this.f63892c = bVar;
        return this;
    }

    public abstract void h(nn.d dVar);

    public nn.d e() {
        return this.f63891b;
    }

    @Override // java.lang.Runnable
    public void run() {
        l lVarG = this.f63891b.a().g();
        if (lVarG instanceof f) {
            ((f) lVarG).p(this.f63891b.a()).a(this.f63891b);
            if (this.f63891b.c() != null) {
                c(this.f63891b, null);
                return;
            } else {
                h(this.f63891b);
                return;
            }
        }
        if (lVarG instanceof k) {
            if (f() == null) {
                throw new IllegalStateException("Callback must be executed through ControlPoint");
            }
            k kVar = (k) lVarG;
            try {
                bo.f fVarA = f().a().a(this.f63891b, kVar.d().O(kVar.n()));
                fVarA.run();
                e eVarF = fVarA.f();
                if (eVarF == null) {
                    c(this.f63891b, null);
                } else if (eVarF.k().f()) {
                    c(this.f63891b, eVarF.k());
                } else {
                    h(this.f63891b);
                }
            } catch (IllegalArgumentException unused) {
                d(this.f63891b, null, "bad control URL: " + kVar.n());
            }
        }
    }

    public String toString() {
        return "(ActionCallback) " + this.f63891b;
    }

    public a(nn.d dVar) {
        this.f63891b = dVar;
    }

    public String a(nn.d dVar, UpnpResponse upnpResponse) {
        ActionException actionExceptionC = dVar.c();
        String str = "Error: ";
        if (actionExceptionC != null) {
            str = "Error: " + actionExceptionC.getMessage();
        }
        if (upnpResponse != null) {
            return str + " (HTTP response was: " + upnpResponse.c() + ")";
        }
        return str;
    }

    public void c(nn.d dVar, UpnpResponse upnpResponse) {
        d(dVar, upnpResponse, a(dVar, upnpResponse));
    }
}
