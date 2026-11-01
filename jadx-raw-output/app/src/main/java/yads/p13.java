package yads;

import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class p13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n13 f81203a = new n13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final em f81204b = new em();

    public final o13 a(JSONObject jSONObject) {
        g13 g13Var;
        dm dmVarA;
        ArrayList arrayList;
        p13 p13Var = this;
        Object objOpt = jSONObject.opt("ColorWizButton");
        String str = objOpt instanceof String ? (String) objOpt : null;
        Object objOpt2 = jSONObject.opt("ColorWizButtonText");
        String str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
        Object objOpt3 = jSONObject.opt("ColorWizBack");
        String str3 = objOpt3 instanceof String ? (String) objOpt3 : null;
        Object objOpt4 = jSONObject.opt("ColorWizBackRight");
        String str4 = objOpt4 instanceof String ? (String) objOpt4 : null;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("backgroundColors");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("smart-center");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("smart-centers");
        if (jSONObjectOptJSONObject2 != null) {
            p13Var.f81203a.getClass();
            g13Var = new g13(jSONObjectOptJSONObject2.getInt(VastAttributes.HORIZONTAL_POSITION), jSONObjectOptJSONObject2.getInt(VastAttributes.VERTICAL_POSITION), jSONObjectOptJSONObject2.getInt("w"), jSONObjectOptJSONObject2.getInt("h"));
        } else {
            g13Var = null;
        }
        if (jSONObjectOptJSONObject != null) {
            p13Var.f81204b.getClass();
            dmVarA = em.a(jSONObjectOptJSONObject);
        } else {
            dmVarA = null;
        }
        if (jSONArrayOptJSONArray != null) {
            ik.i iVarQ = ik.k.q(0, jSONArrayOptJSONArray.length());
            ArrayList arrayList2 = new ArrayList(nj.t.v(iVarQ, 10));
            for (Iterator<Integer> it = iVarQ.iterator(); it.hasNext(); it = it) {
                int iNextInt = ((nj.g0) it).nextInt();
                n13 n13Var = p13Var.f81203a;
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(iNextInt);
                n13Var.getClass();
                arrayList2.add(new g13(jSONObjectOptJSONObject3.getInt(VastAttributes.HORIZONTAL_POSITION), jSONObjectOptJSONObject3.getInt(VastAttributes.VERTICAL_POSITION), jSONObjectOptJSONObject3.getInt("w"), jSONObjectOptJSONObject3.getInt("h")));
                p13Var = this;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new o13(str, str2, str3, str4, dmVarA, g13Var, arrayList);
    }
}
