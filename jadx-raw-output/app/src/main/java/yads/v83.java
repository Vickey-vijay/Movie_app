package yads;

import android.util.Log;
import android.view.View;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class v83 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        x83 x83Var = x83.f84484g;
        x83Var.getClass();
        x83Var.f84490b.clear();
        Iterator it = Collections.unmodifiableCollection(nw3.f80846c.f80848b).iterator();
        while (it.hasNext()) {
            ((wv3) it.next()).getClass();
        }
        x83Var.f84494f = System.nanoTime();
        x83Var.f84492d.a();
        long jNanoTime = System.nanoTime();
        kw3 kw3Var = x83Var.f84491c.f76453b;
        if (x83Var.f84492d.f83209f.size() > 0) {
            for (String str : x83Var.f84492d.f83209f) {
                JSONObject jSONObjectA = kw3Var.a(null);
                View view = (View) x83Var.f84492d.f83206c.get(str);
                sw3 sw3Var = x83Var.f84491c.f76452a;
                String str2 = (String) x83Var.f84492d.f83210g.get(str);
                if (str2 != null) {
                    JSONObject jSONObjectA2 = sw3Var.a(view);
                    try {
                        jSONObjectA2.put("adSessionId", str);
                    } catch (JSONException e10) {
                        tw3.a("Error with setting ad session id", e10);
                    }
                    try {
                        jSONObjectA2.put("notVisibleReason", str2);
                    } catch (JSONException e11) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e11);
                    }
                    lw3.a(jSONObjectA, jSONObjectA2);
                }
                lw3.a(jSONObjectA);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                fw3 fw3Var = x83Var.f84493e;
                fw3Var.f77532b.a(new zw3(fw3Var, hashSet, jSONObjectA, jNanoTime));
            }
        }
        if (x83Var.f84492d.f83208e.size() > 0) {
            JSONObject jSONObjectA3 = kw3Var.a(null);
            kw3Var.a(null, jSONObjectA3, x83Var, true, false);
            lw3.a(jSONObjectA3);
            fw3 fw3Var2 = x83Var.f84493e;
            fw3Var2.f77532b.a(new cx3(fw3Var2, x83Var.f84492d.f83208e, jSONObjectA3, jNanoTime));
        } else {
            fw3 fw3Var3 = x83Var.f84493e;
            fw3Var3.f77532b.a(new uw3(fw3Var3));
        }
        tv3 tv3Var = x83Var.f84492d;
        tv3Var.f83204a.clear();
        tv3Var.f83205b.clear();
        tv3Var.f83206c.clear();
        tv3Var.f83207d.clear();
        tv3Var.f83208e.clear();
        tv3Var.f83209f.clear();
        tv3Var.f83210g.clear();
        tv3Var.f83213j = false;
        tv3Var.f83211h.clear();
        long jNanoTime2 = System.nanoTime() - x83Var.f84494f;
        if (x83Var.f84489a.size() > 0) {
            Iterator it2 = x83Var.f84489a.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                throw null;
            }
        }
        lx3.f79987d.a();
    }
}
