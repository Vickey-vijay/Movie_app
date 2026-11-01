package yads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class dg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a51 f76665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bf f76666b;

    public /* synthetic */ dg0() {
        this(new a51(), new bf());
    }

    public final xf0 a(JSONObject jSONObject) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString(TypedValues.AttributesType.S_TARGET);
        String strOptString3 = jSONObject.optString("layout");
        if (strOptString == null || strOptString.length() == 0 || strOptString2 == null || strOptString2.length() == 0 || strOptString3 == null || strOptString3.length() == 0) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            a51 a51Var = this.f76665a;
            a51Var.getClass();
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList2.add(a51Var.f75403a.a(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("analyticsParameters");
        if (jSONObjectOptJSONObject != null) {
            this.f76666b.getClass();
            kk.i iVarG = kk.r.g(jSONObjectOptJSONObject.keys());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj : iVarG) {
                linkedHashMap2.put(obj, jSONObjectOptJSONObject.get((String) obj));
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        return new xf0(strOptString, strOptString2, strOptString3, arrayList, linkedHashMap);
    }

    public dg0(a51 a51Var, bf bfVar) {
        this.f76665a = a51Var;
        this.f76666b = bfVar;
    }
}
