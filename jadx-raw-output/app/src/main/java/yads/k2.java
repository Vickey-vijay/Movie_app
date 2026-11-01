package yads;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j2 f79282b = new j2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile k2 f79283c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f79284a = new LinkedHashMap();

    public final synchronized void a(String str, i2 i2Var) {
        if (!this.f79284a.containsKey(str)) {
            this.f79284a.put(str, i2Var);
        }
    }

    public k2() {
        a("window_type_browser", new u1());
        a("window_type_activity_result", new n2());
    }
}
