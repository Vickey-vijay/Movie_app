package yads;

import android.content.Context;
import com.ironsource.Q6;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class cm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f76318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jn f76319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib f76320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z82 f76321d;

    public final String a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Q6.E1, jSONArray);
                jn jnVar = this.f76319b;
                String string = jSONObject.toString();
                jnVar.getClass();
                return jn.a(string);
            } catch (JSONException unused) {
                boolean z10 = ad1.f75480a;
            }
        }
        return null;
    }

    public cm0(d4 d4Var, jn jnVar, ib ibVar, z82 z82Var) {
        this.f76318a = d4Var;
        this.f76319b = jnVar;
        this.f76320c = ibVar;
        this.f76321d = z82Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, rj.c cVar) throws Throwable {
        bm0 bm0Var;
        Object next;
        cm0 cm0Var;
        cm0 cm0Var2;
        if (cVar instanceof bm0) {
            bm0Var = (bm0) cVar;
            int i10 = bm0Var.f75892e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bm0Var.f75892e = i10 - Integer.MIN_VALUE;
            } else {
                bm0Var = new bm0(this, cVar);
            }
        } else {
            bm0Var = new bm0(this, cVar);
        }
        Object objG = bm0Var.f75890c;
        Object objF = sj.a.f();
        int i11 = bm0Var.f75892e;
        if (i11 != 0) {
            if (i11 == 1) {
                cm0Var2 = bm0Var.f75889b;
                kotlin.c.b(objG);
                return cm0Var2.a((JSONArray) objG);
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cm0Var = bm0Var.f75889b;
            kotlin.c.b(objG);
            return cm0Var.a((JSONArray) objG);
        }
        kotlin.c.b(objG);
        String str = this.f76318a.f76561c.f78158a;
        Iterator it = this.f76320c.f78544a.f78294b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ck.p.e(((gb) next).f77717b, str));
        gb gbVar = (gb) next;
        if (gbVar == null) {
            return null;
        }
        List list = gbVar.f77718c;
        d4 d4Var = this.f76318a;
        if (d4Var.f76559a == e00.f76859d) {
            a03 a03Var = d4Var.f76562d.f75685a;
            if (a03Var != null) {
                z82 z82Var = this.f76321d;
                bm0Var.f75889b = this;
                bm0Var.f75892e = 1;
                z82Var.getClass();
                objG = nk.h.g(nk.w0.c().n(), new x82(z82Var, context, a03Var, list, null), bm0Var);
                if (objG == objF) {
                    return objF;
                }
                cm0Var2 = this;
                return cm0Var2.a((JSONArray) objG);
            }
            boolean z10 = ad1.f75480a;
            return null;
        }
        z82 z82Var2 = this.f76321d;
        bm0Var.f75889b = this;
        bm0Var.f75892e = 2;
        z82Var2.getClass();
        objG = nk.h.g(nk.w0.c().n(), new x82(z82Var2, context, null, list, null), bm0Var);
        if (objG == objF) {
            return objF;
        }
        cm0Var = this;
        return cm0Var.a((JSONArray) objG);
    }
}
