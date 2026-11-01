package yads;

import android.content.Context;
import java.util.ArrayList;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class bi3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kn f75837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ub3 f75838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne3 f75839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ed3 f75840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nj3 f75841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l41 f75842f;

    public /* synthetic */ bi3(Context context, io2 io2Var, kn knVar) {
        this(knVar, vb3.a(knVar.a()), new ne3(context, new o62()), new ed3(context, io2Var), new nj3(), new l41());
    }

    public final Object a(JSONObject jSONObject) throws z02 {
        zb3 zb3VarA;
        mj3 mj3Var;
        Object objM3458constructorimpl;
        try {
            zb3VarA = this.f75840d.a(this.f75838b.a("vast", jSONObject), this.f75837a);
        } catch (Exception unused) {
            zb3VarA = null;
        }
        if (zb3VarA == null || zb3VarA.f85310b.isEmpty()) {
            throw new z02("Invalid VAST in response");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            this.f75841e.getClass();
            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("volumeControlVisible", true);
            boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("isProgressBarHidden", false);
            boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean("alternativeFormatFallback", false);
            try {
                Result.a aVar = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(Double.valueOf(jSONObjectOptJSONObject.getDouble("initialVolume")));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                objM3458constructorimpl = null;
            }
            mj3Var = new mj3(zOptBoolean, zOptBoolean2, zOptBoolean3, (Double) objM3458constructorimpl);
        } else {
            mj3Var = null;
        }
        ArrayList arrayListA = this.f75839c.a(zb3VarA.f85310b, mj3Var);
        if (arrayListA.isEmpty()) {
            throw new z02("Invalid VAST in response");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("preview");
        return new sd3(arrayListA, mj3Var, jSONObjectOptJSONObject2 != null ? this.f75842f.a(jSONObjectOptJSONObject2) : null);
    }

    public bi3(kn knVar, ub3 ub3Var, ne3 ne3Var, ed3 ed3Var, nj3 nj3Var, l41 l41Var) {
        this.f75837a = knVar;
        this.f75838b = ub3Var;
        this.f75839c = ne3Var;
        this.f75840d = ed3Var;
        this.f75841e = nj3Var;
        this.f75842f = l41Var;
    }
}
