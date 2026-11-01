package yads;

import android.content.Context;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aj f79804a;

    public /* synthetic */ lj(Context context, io2 io2Var, jf1 jf1Var, int i10) {
        this(new aj(context, io2Var, (i10 & 4) != 0 ? new jf1(context, io2Var) : jf1Var));
    }

    public final ArrayList a(JSONObject jSONObject, kn knVar) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("assets");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            boolean z10 = jSONObject2.getBoolean(VastAttributes.REQUIRED);
            try {
                arrayList.add(this.f79804a.a(jSONObject2, knVar));
            } catch (Throwable th2) {
                if (z10) {
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    public lj(aj ajVar) {
        this.f79804a = ajVar;
    }
}
