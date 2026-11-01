package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes11.dex */
public final class gn3 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jy1 f77872a;

    public /* synthetic */ gn3() {
        this(new jy1());
    }

    @Override // yads.zf0
    public final void c() {
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f77872a.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.warning);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    public gn3(jy1 jy1Var) {
        this.f77872a = jy1Var;
    }
}
