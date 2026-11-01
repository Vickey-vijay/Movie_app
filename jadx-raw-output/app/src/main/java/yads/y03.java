package yads;

import android.content.Context;
import com.yandex.div.core.DivConfiguration;

/* JADX INFO: loaded from: classes10.dex */
public final class y03 {
    public static DivConfiguration a(Context context, x03 x03Var, zh0 zh0Var) {
        nh0 nh0Var = new nh0(context);
        zg0 zg0Var = new zg0(new bh0(), new fh0(), new eh0(), new ah0(), new gh0(), new ch0());
        bi0 bi0Var = new bi0(zh0Var);
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        return new DivConfiguration.Builder(nh0Var).divCustomContainerViewAdapter(zg0Var).typefaceProvider(ck.p.e(nt2VarA != null ? Boolean.valueOf(qt2.a(nt2VarA)) : null, Boolean.TRUE) ? new ti0(context) : new vi0(context)).extension(x03Var).extension(bi0Var).build();
    }
}
