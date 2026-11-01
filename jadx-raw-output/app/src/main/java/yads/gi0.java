package yads;

import com.yandex.div.DivDataTag;
import com.yandex.div2.DivData;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class gi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f77808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f77809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f77810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DivData f77811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DivDataTag f77812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f77813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yf0 f77814h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi0)) {
            return false;
        }
        gi0 gi0Var = (gi0) obj;
        return ck.p.e(this.f77807a, gi0Var.f77807a) && ck.p.e(this.f77808b, gi0Var.f77808b) && ck.p.e(this.f77809c, gi0Var.f77809c) && ck.p.e(this.f77810d, gi0Var.f77810d) && ck.p.e(this.f77811e, gi0Var.f77811e) && ck.p.e(this.f77812f, gi0Var.f77812f) && ck.p.e(this.f77813g, gi0Var.f77813g) && ck.p.e(this.f77814h, gi0Var.f77814h);
    }

    public final int hashCode() {
        int iHashCode = (this.f77808b.hashCode() + (this.f77807a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.f77809c;
        int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        List list = this.f77810d;
        return this.f77814h.hashCode() + ((this.f77813g.hashCode() + ((this.f77812f.hashCode() + ((this.f77811e.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DivKitDesign(target=" + this.f77807a + ", card=" + this.f77808b + ", templates=" + this.f77809c + ", images=" + this.f77810d + ", divData=" + this.f77811e + ", divDataTag=" + this.f77812f + ", divAssets=" + this.f77813g + ", designAnalytics=" + this.f77814h + ")";
    }

    public gi0(String str, JSONObject jSONObject, JSONObject jSONObject2, List list, DivData divData, DivDataTag divDataTag, Set set, yf0 yf0Var) {
        this.f77807a = str;
        this.f77808b = jSONObject;
        this.f77809c = jSONObject2;
        this.f77810d = list;
        this.f77811e = divData;
        this.f77812f = divDataTag;
        this.f77813g = set;
        this.f77814h = yf0Var;
    }
}
