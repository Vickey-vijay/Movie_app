package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class t11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f82860a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f82861b;

    public final synchronized Map a() {
        if (this.f82861b == null) {
            this.f82861b = Collections.unmodifiableMap(new HashMap(this.f82860a));
        }
        return this.f82861b;
    }
}
