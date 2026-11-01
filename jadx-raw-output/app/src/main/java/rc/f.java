package rc;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SignalsResult.java */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, String> f66751a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f66752b = null;

    public void a(String str, String str2) {
        this.f66751a.put(str, str2);
    }

    public String b() {
        return this.f66752b;
    }

    public Map<String, String> c() {
        return this.f66751a;
    }

    public void d(String str) {
        this.f66752b = str;
    }
}
