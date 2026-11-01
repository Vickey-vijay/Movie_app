package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e51 implements f51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f76921a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e51) && ck.p.e(this.f76921a, ((e51) obj).f76921a);
    }

    public final int hashCode() {
        return this.f76921a.hashCode();
    }

    public final String toString() {
        return "Success(images=" + this.f76921a + ")";
    }

    public e51(Map map) {
        this.f76921a = map;
    }
}
