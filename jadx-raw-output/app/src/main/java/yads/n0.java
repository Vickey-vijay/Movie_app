package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk.l f80489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f80490b;

    @Override // yads.ea0
    public final void a(final u90 u90Var) {
        TextView textView = this.f80490b;
        u90Var.getClass();
        textView.setText("Enable Test mode");
        this.f80490b.setOnClickListener(new View.OnClickListener() { // from class: cp.s6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yads.n0.a(this.f51577b, u90Var, view);
            }
        });
    }

    public n0(pk3 pk3Var, View view) {
        super(view);
        this.f80489a = pk3Var;
        this.f80490b = (TextView) view.findViewById(R$id.item_button);
    }

    public static final void a(n0 n0Var, u90 u90Var, View view) {
        bk.l lVar = n0Var.f80489a;
        u90Var.getClass();
        lVar.invoke(t90.TEST_MODE);
    }
}
