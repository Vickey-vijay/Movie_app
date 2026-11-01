package yads;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f75535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jf1 f75536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f75537c;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final oi a(JSONObject jSONObject, kn knVar) throws z02 {
        bj j92Var;
        if (!b42.a(jSONObject, "name", "type", "clickable", VastAttributes.REQUIRED)) {
            throw new z02("Native Ad json has not required attributes");
        }
        String strOptString = jSONObject.optString("type");
        if (strOptString == null || strOptString.length() == 0 || ck.p.e(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        String strOptString2 = jSONObject.optString("name");
        if (strOptString2 == null || strOptString2.length() == 0 || ck.p.e(strOptString2, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("link");
        if1 if1VarA = jSONObjectOptJSONObject == null ? null : this.f75536b.a(jSONObjectOptJSONObject, knVar);
        Context context = this.f75537c;
        io2 io2Var = this.f75535a;
        if (ck.p.e(strOptString2, "close_button")) {
            j92Var = new hw();
        } else {
            if (!ck.p.e(strOptString2, "feedback")) {
                switch (strOptString.hashCode()) {
                    case -1034364087:
                        if (strOptString.equals("number")) {
                            j92Var = new j92(new lq2());
                        }
                        break;
                    case -951532658:
                        if (strOptString.equals("qrcode")) {
                            j92Var = new kv(new sa3());
                        }
                        break;
                    case -891985903:
                        if (strOptString.equals(TypedValues.Custom.S_STRING)) {
                            j92Var = new j43();
                        }
                        break;
                    case -410956671:
                        if (strOptString.equals("container")) {
                            j92Var = new yl0();
                        }
                        break;
                    case 100313435:
                        if (strOptString.equals("image")) {
                            j92Var = new x41();
                        }
                        break;
                    case 103772132:
                        if (strOptString.equals(C3426d4.i.I0)) {
                            j92Var = new pn1(new nm1(vb3.a(knVar.f79480a)), new bi3(context, io2Var, knVar), new l41(), new a51());
                        }
                        break;
                }
                boolean z10 = ad1.f75480a;
                throw new z02("Native Ad json has not required attributes");
            }
            j92Var = new su0(new x41());
        }
        return new oi(strOptString2, strOptString, j92Var.a(jSONObject), if1VarA, jSONObject.getBoolean("clickable"), jSONObject.getBoolean(VastAttributes.REQUIRED));
    }

    public aj(Context context, io2 io2Var, jf1 jf1Var) {
        this.f75535a = io2Var;
        this.f75536b = jf1Var;
        this.f75537c = context.getApplicationContext();
    }
}
