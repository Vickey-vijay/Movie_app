package yads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yt1 implements zt1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f85110a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yt1) && ck.p.e(this.f85110a, ((yt1) obj).f85110a);
    }

    public final List a() {
        return this.f85110a;
    }

    public final int hashCode() {
        return this.f85110a.hashCode();
    }

    public final String toString() {
        return "IncorrectIntegration(causes=" + this.f85110a + ")";
    }

    public yt1(List list) {
        this.f85110a = list;
    }
}
