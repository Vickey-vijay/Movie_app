package k0;

import android.text.TextUtils;
import com.digitalturbine.ignite.authenticator.events.c;
import com.digitalturbine.ignite.authenticator.events.d;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import java.util.ArrayList;
import java.util.Iterator;
import l0.h;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends IIgniteServiceCallback.Stub {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f62046c;

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        r0.b.a("%s : unable to retrieve property: %s", "IgnitePropertyCallback", str);
        Iterator it = this.f62046c.iterator();
        while (it.hasNext()) {
            h hVar = ((o0.a) it.next()).f64943a;
            if (hVar != null) {
                r0.b.a("%s : on one dt error", "OneDTAuthenticator");
                hVar.f63388l.set(true);
                if (hVar.f63381e != null) {
                    r0.b.b("%s : on one dt error : %s", "IgniteManager", str);
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        r0.b.a("%s : property retrieved", "IgnitePropertyCallback");
        Iterator it = this.f62046c.iterator();
        while (it.hasNext()) {
            h hVar = ((o0.a) it.next()).f64943a;
            if (hVar != null) {
                if (TextUtils.isEmpty(str)) {
                    r0.b.a("%s : on one dt error", "OneDTAuthenticator");
                    hVar.f63388l.set(true);
                    if (hVar.f63381e != null) {
                        r0.b.b("%s : on one dt error : %s", "IgniteManager", "One DT is empty");
                    }
                    n0.b.b(d.RAW_ONE_DT_ERROR, "error_code", c.ONE_DT_EMPTY_ENTITY.a());
                } else {
                    hVar.f63382f.b(str);
                    hVar.f63383g.getClass();
                    j0.c cVarA = s0.b.a(str);
                    hVar.f63384h = cVarA;
                    j0.a aVar = hVar.f63381e;
                    if (aVar != null) {
                        r0.b.a("%s : setting one dt entity", "IgniteManager");
                        aVar.f61680b = cVarA;
                    }
                }
            }
        }
    }

    public b(o0.a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f62046c = arrayList;
        arrayList.add(aVar);
    }
}
