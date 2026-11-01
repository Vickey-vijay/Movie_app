package yads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class x83 implements nv3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x83 f84484g = new x83();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Handler f84485h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Handler f84486i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v83 f84487j = new v83();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final w83 f84488k = new w83();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f84494f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f84489a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f84490b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tv3 f84492d = new tv3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw3 f84491c = new cw3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fw3 f84493e = new fw3(new mw3());

    public final void a(View view, qv3 qv3Var, JSONObject jSONObject, boolean z10) {
        char c10;
        Object obj;
        boolean z11;
        boolean z12;
        boolean z13;
        if (hx3.a(view) == null) {
            tv3 tv3Var = this.f84492d;
            if (tv3Var.f83207d.contains(view)) {
                c10 = 1;
            } else if (tv3Var.f83213j) {
                c10 = 2;
            } else {
                c10 = 3;
            }
            if (c10 == 3) {
                return;
            }
            JSONObject jSONObjectA = qv3Var.a(view);
            lw3.a(jSONObject, jSONObjectA);
            tv3 tv3Var2 = this.f84492d;
            if (tv3Var2.f83204a.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) tv3Var2.f83204a.get(view);
                if (obj2 != null) {
                    tv3Var2.f83204a.remove(view);
                }
                obj = obj2;
            }
            boolean z14 = false;
            if (obj != null) {
                try {
                    jSONObjectA.put("adSessionId", obj);
                } catch (JSONException e10) {
                    tw3.a("Error with setting ad session id", e10);
                }
                tv3 tv3Var3 = this.f84492d;
                if (tv3Var3.f83212i.containsKey(view)) {
                    tv3Var3.f83212i.put(view, Boolean.TRUE);
                } else {
                    z14 = true;
                }
                try {
                    jSONObjectA.put("hasWindowFocus", Boolean.valueOf(z14));
                } catch (JSONException e11) {
                    Log.e("OMIDLIB", "Error with setting has window focus", e11);
                }
                boolean zContains = this.f84492d.f83211h.contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectA.put("isPipActive", objValueOf);
                    } catch (JSONException e12) {
                        Log.e("OMIDLIB", "Error with setting is picture-in-picture active", e12);
                    }
                }
                this.f84492d.f83213j = true;
                return;
            }
            tv3 tv3Var4 = this.f84492d;
            mv3 mv3Var = (mv3) tv3Var4.f83205b.get(view);
            if (mv3Var != null) {
                tv3Var4.f83205b.remove(view);
            }
            if (mv3Var != null) {
                xw3 xw3Var = mv3Var.f80403a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = mv3Var.f80404b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectA.put("friendlyObstructionClass", xw3Var.f84730b);
                    jSONObjectA.put("friendlyObstructionPurpose", xw3Var.f84731c);
                    jSONObjectA.put("friendlyObstructionReason", xw3Var.f84732d);
                } catch (JSONException e13) {
                    Log.e("OMIDLIB", "Error with setting friendly obstruction", e13);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && !z11) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (c10 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            qv3Var.a(view, jSONObjectA, this, z13, z12);
        }
    }
}
