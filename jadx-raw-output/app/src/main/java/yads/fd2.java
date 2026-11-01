package yads;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes9.dex */
public final class fd2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f77355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gy1 f77356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jy1 f77357c;

    public /* synthetic */ fd2(y00 y00Var) {
        this(y00Var, new gy1(), new jy1());
    }

    @Override // yads.zf0
    public final void c() {
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f77356b.getClass();
        ImageView imageView = (ImageView) viewGroup.findViewById(R$id.icon_placeholder);
        y00 y00Var = this.f77355a;
        a10 a10Var = y00Var.f84768c;
        a10 a10Var2 = y00Var.f84767b;
        if (imageView != null && a10Var == null && a10Var2 == null) {
            this.f77357c.getClass();
            yk3 yk3Var = new yk3((TextView) viewGroup.findViewById(R$id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(yk3Var);
        }
    }

    public fd2(y00 y00Var, gy1 gy1Var, jy1 jy1Var) {
        this.f77355a = y00Var;
        this.f77356b = gy1Var;
        this.f77357c = jy1Var;
    }
}
