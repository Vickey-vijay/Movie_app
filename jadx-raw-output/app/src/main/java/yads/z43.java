package yads;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class z43 implements de1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f85210b;

    @Override // yads.de1
    public final String a() {
        boolean zIsHardwareAccelerated = this.f85210b.isHardwareAccelerated();
        ck.w wVar = ck.w.f6066a;
        String str = String.format("supports: {inlineVideo: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(zIsHardwareAccelerated)}, 1));
        ck.p.i(str, "format(...)");
        return str;
    }

    public z43(hb2 hb2Var) {
        this.f85210b = hb2Var;
    }
}
