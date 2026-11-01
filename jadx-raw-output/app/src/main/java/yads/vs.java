package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes11.dex */
public final class vs implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jy1 f83999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final us f84000b;

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        this.f83999a.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.call_to_action);
        if (textView != null) {
            us usVar = this.f84000b;
            usVar.f83589a.postDelayed(new l33(textView, usVar.f83590b), 2000L);
        }
    }

    @Override // yads.zf0
    public final void c() {
        us usVar = this.f84000b;
        usVar.f83589a.removeCallbacksAndMessages(null);
        usVar.f83590b.cancel();
    }

    public vs(jy1 jy1Var, us usVar) {
        this.f83999a = jy1Var;
        this.f84000b = usVar;
    }
}
