package yads;

import android.content.Context;
import com.ironsource.C3754ve;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class hr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg1 f78306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fr0 f78307b;

    public hr0(Context context) {
        this(ug1.a(context, "FalseClickDataStorage"));
    }

    public final void a(long j10) {
        ((tg1) this.f78306a).d(String.valueOf(j10));
    }

    public /* synthetic */ hr0(rg1 rg1Var) {
        this(rg1Var, new fr0());
    }

    public final void a(er0 er0Var) throws JSONException {
        String string;
        String strValueOf = String.valueOf(er0Var.f77181b);
        fr0 fr0Var = this.f78307b;
        fr0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ad_type", er0Var.f77180a.f76868b);
        jSONObject.put("start_time", er0Var.f77181b);
        jSONObject.put("type", er0Var.f77182c.f78011b);
        ir0 ir0Var = fr0Var.f77486a;
        dr0 dr0Var = er0Var.f77183d;
        ir0Var.getClass();
        String string2 = null;
        if (dr0Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("interval", dr0Var.f76779c);
            jSONObject2.put("url", dr0Var.f76778b);
            string = jSONObject2.toString();
        } else {
            string = null;
        }
        jSONObject.put("false_click", string);
        jSONObject.put("report_data", new JSONObject(er0Var.f77184e));
        d dVar = fr0Var.f77487b;
        c cVar = er0Var.f77185f;
        dVar.getClass();
        if (cVar != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C3754ve.f31473d, cVar.f76071a);
            jSONObject3.put("test_ids", cVar.f76072b);
            string2 = jSONObject3.toString();
        }
        jSONObject.put("ab_experiments", string2);
        ((tg1) this.f78306a).a(strValueOf, jSONObject.toString());
    }

    public hr0(rg1 rg1Var, fr0 fr0Var) {
        this.f78306a = rg1Var;
        this.f78307b = fr0Var;
    }
}
