package yads;

import android.text.Html;
import com.ironsource.Q6;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ir1 f78765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl.a f78766b;

    public /* synthetic */ ip() {
        this(new ir1(), ge1.a());
    }

    public final hp b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        gs1 gs1Var;
        String string;
        try {
            jSONObject2 = jSONObject.getJSONObject("mediation_prefetch_settings");
        } catch (Exception unused) {
            jSONObject2 = null;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("block_id_settings");
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    gb gbVarA = a(jSONArrayOptJSONArray.getJSONObject(i10));
                    if (gbVarA != null) {
                        arrayList.add(gbVarA);
                    }
                }
            }
            if (jSONObject2 == null || (string = jSONObject2.toString()) == null) {
                gs1Var = null;
            } else {
                cl.a aVar = this.f78766b;
                aVar.a();
                gs1Var = (gs1) aVar.b(yk.a.t(gs1.Companion.serializer()), string);
            }
            if (arrayList.isEmpty() && gs1Var == null) {
                return null;
            }
            return new hp(arrayList, gs1Var);
        } catch (JSONException unused2) {
            boolean z10 = ad1.f75480a;
            return null;
        }
    }

    public final gb a(JSONObject jSONObject) {
        String strValueOf;
        try {
            try {
                cl.a aVar = ge1.f77787a;
                String string = jSONObject.getString("ad_unit_id");
                if (string == null || string.length() == 0 || ck.p.e("null", string)) {
                    throw new JSONException("Json value can not be null or empty");
                }
                strValueOf = String.valueOf(Html.fromHtml(string));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Q6.E1);
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        qq1 qq1VarA = this.f78765a.a(jSONArrayOptJSONArray.getJSONObject(i10));
                        if (qq1VarA != null) {
                            arrayList.add(qq1VarA);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new gb(strValueOf, jSONObject.toString(), arrayList);
                    }
                }
                return null;
            } catch (JSONException unused) {
                cl.a aVar2 = ge1.f77787a;
                String string2 = jSONObject.getString("block_id");
                if (string2 == null || string2.length() == 0 || ck.p.e("null", string2)) {
                    throw new JSONException("Json value can not be null or empty");
                }
                strValueOf = String.valueOf(Html.fromHtml(string2));
            }
        } catch (JSONException unused2) {
            boolean z10 = ad1.f75480a;
        }
    }

    public ip(ir1 ir1Var, cl.a aVar) {
        this.f78765a = ir1Var;
        this.f78766b = aVar;
    }
}
