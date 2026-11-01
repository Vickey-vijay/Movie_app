package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes10.dex */
public final class u01 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f83285a;

    @Override // yads.ea0
    public final void a(ba0 ba0Var) {
        this.f83285a.setText(((w90) ba0Var).f84130a);
    }

    public u01(View view) {
        super(view);
        this.f83285a = (TextView) view.findViewById(R$id.item_text);
    }
}
