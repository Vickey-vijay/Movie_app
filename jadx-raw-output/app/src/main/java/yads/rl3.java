package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class rl3 implements de1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f82310b;

    @Override // yads.de1
    public final String a() {
        ck.w wVar = ck.w.f6066a;
        String str = String.format("viewable: %s", Arrays.copyOf(new Object[]{Boolean.valueOf(this.f82310b)}, 1));
        ck.p.i(str, "format(...)");
        return str;
    }

    public rl3(boolean z10) {
        this.f82310b = z10;
    }
}
