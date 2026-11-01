package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class z52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mj0 f85224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f85225b = new ConcurrentHashMap();

    public final void a(String str, zg3 zg3Var, String str2) {
        if (this.f85224a == null) {
            zg3Var.b();
            a();
            return;
        }
        Uri uri = Uri.parse(str);
        m51 m51Var = p51.f81258c;
        pj0 pj0Var = new pj0(str2, uri, null, sm2.f82697f, null, null, null);
        this.f85225b.put(str2, zg3Var);
        rn3 rn3Var = new rn3(str2, zg3Var);
        mj0 mj0Var = this.f85224a;
        mj0Var.getClass();
        mj0Var.f80188b.add(rn3Var);
        mj0 mj0Var2 = this.f85224a;
        mj0Var2.f80189c++;
        mj0Var2.f80187a.obtainMessage(6, 0, 0, pj0Var).sendToTarget();
        mj0 mj0Var3 = this.f85224a;
        if (mj0Var3.f80190d) {
            mj0Var3.f80190d = false;
            mj0Var3.f80189c++;
            mj0Var3.f80187a.obtainMessage(1, 0, 0).sendToTarget();
            boolean zA = mj0Var3.a();
            Iterator it = mj0Var3.f80188b.iterator();
            while (it.hasNext()) {
                ((kj0) it.next()).getClass();
            }
            if (zA) {
                Iterator it2 = mj0Var3.f80188b.iterator();
                while (it2.hasNext()) {
                    ((kj0) it2.next()).getClass();
                }
            }
        }
    }

    public z52(Context context) {
        this.f85224a = ih3.b(context.getApplicationContext());
    }

    public final void a() {
        Iterator it = this.f85225b.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            mj0 mj0Var = this.f85224a;
            if (mj0Var != null) {
                mj0Var.f80189c++;
                mj0Var.f80187a.obtainMessage(7, str).sendToTarget();
            }
        }
        this.f85225b.clear();
    }
}
