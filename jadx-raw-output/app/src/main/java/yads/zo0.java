package yads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug0 f85550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xy2 f85551b;

    public /* synthetic */ zo0() {
        this(new ug0(), new xy2());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public final vy2 a(Context context) {
        long j10;
        this.f85550a.getClass();
        File fileA = ug0.a(context, "mobileads-video-cache");
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null) {
            j10 = nt2VarA.f80759c;
            if (j10 == 0) {
                j10 = 52428800;
            }
        } else {
            j10 = 52428800;
        }
        bf1 bf1Var = new bf1(is1.a(context, 41943040L, j10));
        jn0 jn0Var = new jn0(context);
        this.f85551b.getClass();
        return new vy2(fileA, bf1Var, jn0Var);
    }

    public zo0(ug0 ug0Var, xy2 xy2Var) {
        this.f85550a = ug0Var;
        this.f85551b = xy2Var;
    }
}
