package yads;

import android.content.Context;
import com.yandex.div.core.DivConfiguration;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
public final class fi0 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f77407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zh0 f77408c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi0(Context context, zh0 zh0Var) {
        super(0);
        this.f77407b = context;
        this.f77408c = zh0Var;
    }

    @Override // bk.a
    public final Object invoke() {
        nh0 nh0Var = new nh0(this.f77407b);
        zg0 zg0Var = new zg0(new bh0(), new fh0(), new eh0(), new ah0(), new gh0(), new ch0());
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(this.f77407b);
        DivConfiguration.Builder builderTypefaceProvider = new DivConfiguration.Builder(nh0Var).divCustomContainerViewAdapter(zg0Var).typefaceProvider(ck.p.e(nt2VarA != null ? Boolean.valueOf(qt2.a(nt2VarA)) : null, Boolean.TRUE) ? new ti0(this.f77407b) : new vi0(this.f77407b));
        zh0 zh0Var = this.f77408c;
        if (zh0Var != null) {
            builderTypefaceProvider = builderTypefaceProvider.extension(new bi0(zh0Var));
        }
        return builderTypefaceProvider.extension(new ni0()).build();
    }
}
