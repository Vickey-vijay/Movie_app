package yads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class qt implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f81965b;

    @Override // yads.r43
    public final int a() {
        return 1;
    }

    @Override // yads.r43
    public final int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final List b(long j10) {
        return j10 >= 0 ? this.f81965b : Collections.emptyList();
    }

    public qt(List list) {
        this.f81965b = list;
    }
}
