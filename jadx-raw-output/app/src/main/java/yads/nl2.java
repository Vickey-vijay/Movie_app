package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f80704a;

    public final void a(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        this.f80704a.put(str, str2);
    }

    public nl2(Map map) {
        this.f80704a = kotlin.collections.a.B(map);
    }
}
