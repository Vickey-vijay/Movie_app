package yads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class up0 implements r43 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f83566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p51 f83567c;

    @Override // yads.r43
    public final int a() {
        return 1;
    }

    @Override // yads.r43
    public final long a(int i10) {
        if (i10 == 0) {
            return this.f83566b;
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.r43
    public final List b(long j10) {
        if (j10 >= this.f83566b) {
            return this.f83567c;
        }
        m51 m51Var = p51.f81258c;
        return sm2.f82697f;
    }

    public up0(long j10, sm2 sm2Var) {
        this.f83566b = j10;
        this.f83567c = sm2Var;
    }

    @Override // yads.r43
    public final int a(long j10) {
        return this.f83566b > j10 ? 0 : -1;
    }
}
