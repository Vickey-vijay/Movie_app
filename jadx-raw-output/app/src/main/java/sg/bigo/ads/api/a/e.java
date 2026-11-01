package sg.bigo.ads.api.a;

import androidx.annotation.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public interface e {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f69308a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f69309b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f69310c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f69311d = "";
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f69312a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f69313b = "";
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f69314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f69315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String[] f69316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f69317d;

        public c(@NonNull JSONObject jSONObject) {
            this.f69314a = "";
            this.f69315b = 0;
            this.f69316c = null;
            this.f69317d = "";
            this.f69314a = jSONObject.optString("title", "");
            this.f69315b = jSONObject.optInt("type", 0);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("options");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                this.f69316c = new String[jSONArrayOptJSONArray.length()];
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f69316c[i10] = jSONArrayOptJSONArray.optString(i10);
                }
            }
            this.f69317d = jSONObject.optString("id", "");
        }
    }

    String a();

    String b();

    long c();

    int d();

    String e();

    int f();

    String g();

    String h();

    f[] i();

    f j();

    f k();

    b l();

    c[] m();

    a n();
}
