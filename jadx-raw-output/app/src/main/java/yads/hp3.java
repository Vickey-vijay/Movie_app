package yads;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp3 f78297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f78298b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public to2 f78299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78300d;

    public final void a(Context context, List list, to2 to2Var, Object obj) {
        if (list.isEmpty()) {
            to2Var.onSuccess(this.f78298b);
            return;
        }
        this.f78299c = to2Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ud3 ud3Var = (ud3) it.next();
            this.f78300d++;
            cp3 cp3Var = this.f78297a;
            gp3 gp3Var = new gp3(this);
            cp3Var.getClass();
            dp3 dp3Var = new dp3(gp3Var, new ep3(context, ud3Var));
            pe3 pe3Var = cp3Var.f76397e;
            lu2 lu2Var = cp3Var.f76394b;
            d4 d4Var = cp3Var.f76393a;
            rc3 rc3Var = cp3Var.f76395c;
            fg3 fg3Var = cp3Var.f76396d;
            pe3Var.getClass();
            zc3 zc3Var = new zc3();
            String str = ud3Var.f83429i;
            if (str == null) {
                str = "";
            }
            Uri uri = Uri.parse(str);
            String string = nj.b0.U((List) z91.f85255a.getValue(), uri.getHost()) ? ml2.a(uri, new yc3(zc3Var, rc3Var, d4Var, context)).toString() : str;
            mp3 mp3Var = new mp3(fg3Var);
            qm3 qm3Var = new qm3(dp3Var);
            at1 at1VarA = ((iu3) lu2Var).a();
            ey2.f77227a.getClass();
            ey2 ey2VarA = dy2.a(context);
            dd3 dd3Var = new dd3(context, d4Var, at1VarA, string, qm3Var, ud3Var, mp3Var, ey2VarA, new ay2(ey2VarA), new ic3(context, at1VarA));
            dd3Var.f81503q = obj;
            pe3Var.f81392a.a(dd3Var);
        }
    }

    public hp3(cp3 cp3Var) {
        this.f78297a = cp3Var;
    }
}
