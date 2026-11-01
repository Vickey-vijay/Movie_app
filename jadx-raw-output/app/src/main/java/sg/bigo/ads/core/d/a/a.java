package sg.bigo.ads.core.d.a;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71220a = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f71221b = 900000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, C0734a> f71222c;

    /* JADX INFO: renamed from: sg.bigo.ads.core.d.a.a$a, reason: collision with other inner class name */
    public static class C0734a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f71223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f71224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f71225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f71226d;

        public static C0734a a(String str) {
            C0734a c0734a = new C0734a();
            c0734a.f71223a = str;
            c0734a.f71224b = true;
            c0734a.f71225c = true;
            c0734a.f71226d = BrandSafetyUtils.f43544g;
            return c0734a;
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject == null) {
                sg.bigo.ads.common.t.a.a(0, "Stats", "eventConfig is null.");
                return;
            }
            this.f71223a = jSONObject.optString("event_id");
            this.f71224b = jSONObject.optInt("status") == 1;
            this.f71225c = jSONObject.optInt("delay") == 1;
            int iOptInt = jSONObject.optInt("expired") * 1000;
            this.f71226d = iOptInt;
            if (iOptInt == 0) {
                this.f71226d = BrandSafetyUtils.f43544g;
            }
        }
    }

    public a() {
        HashMap<String, C0734a> map = new HashMap<>();
        this.f71222c = map;
        b();
        map.put("06002002", C0734a.a("06002002"));
        map.put("06002007", C0734a.a("06002007"));
    }

    private void b() {
        this.f71220a = 10;
        this.f71221b = 900000;
        this.f71222c.clear();
    }

    public final int a() {
        return Math.round(this.f71220a * 0.8f);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            b();
            return;
        }
        this.f71220a = jSONObject.optInt("delay_num", 10);
        int iOptInt = jSONObject.optInt("delay_interval") * 1000;
        this.f71221b = iOptInt;
        if (iOptInt == 0) {
            this.f71221b = 900000;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("event_config");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            C0734a c0734a = new C0734a();
            c0734a.a(jSONArrayOptJSONArray.optJSONObject(i10));
            if (q.b((CharSequence) c0734a.f71223a)) {
                this.f71222c.put(c0734a.f71223a, c0734a);
            }
        }
    }

    public final boolean a(String str) {
        C0734a c0734a = this.f71222c.get(str);
        if (c0734a == null) {
            return false;
        }
        return c0734a.f71224b;
    }
}
