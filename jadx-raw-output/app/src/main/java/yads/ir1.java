package yads;

import android.text.Html;
import com.ironsource.Q6;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class ir1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq1 f78776a;

    public /* synthetic */ ir1() {
        this(new kq1());
    }

    public final qq1 a(JSONObject jSONObject) {
        j5 j5Var;
        try {
            cl.a aVar = ge1.f77787a;
            String string = jSONObject.getString(Q6.G1);
            if (string == null || string.length() == 0 || ck.p.e("null", string)) {
                throw new JSONException("Json value can not be null or empty");
            }
            String strValueOf = String.valueOf(Html.fromHtml(string));
            JSONObject jSONObject2 = jSONObject.getJSONObject("network_data");
            Map mapD = nj.l0.d();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                mapD.put(next, jSONObject2.getString(next));
            }
            Map mapC = nj.l0.c(mapD);
            if (mapC.isEmpty()) {
                return null;
            }
            List listB = ge1.b("click_tracking_urls", jSONObject);
            List listB2 = ge1.b("impression_tracking_urls", jSONObject);
            List listB3 = ge1.b("ad_response_tracking_urls", jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("bidding_info");
            Map mapA = jSONObjectOptJSONObject != null ? ge1.a(jSONObjectOptJSONObject) : null;
            if (jSONObject.has("impression_data")) {
                this.f78776a.getClass();
                try {
                    String string2 = jSONObject.getString("impression_data");
                    if (string2.length() == 0 || ck.p.e("null", string2)) {
                        throw new JSONException("Json has not required attributes");
                    }
                    j5Var = new j5(string2);
                } catch (Exception unused) {
                    boolean z10 = ad1.f75480a;
                    j5Var = null;
                }
            } else {
                j5Var = null;
            }
            return new qq1(strValueOf, mapC, listB2, listB, listB3, j5Var, mapA);
        } catch (JSONException unused2) {
            boolean z11 = ad1.f75480a;
            return null;
        }
    }

    public ir1(kq1 kq1Var) {
        this.f78776a = kq1Var;
    }
}
