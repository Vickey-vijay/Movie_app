package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$string;

/* JADX INFO: loaded from: classes10.dex */
public final class rb extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk.a f82163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f82164b;

    public final void a() {
        this.f82164b.setText(this.itemView.getContext().getString(R$string.ad_units));
        this.f82164b.setOnClickListener(new View.OnClickListener() { // from class: cp.e9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yads.rb.a(this.f51309b, view);
            }
        });
    }

    public rb(View view, uk3 uk3Var) {
        super(view);
        this.f82163a = uk3Var;
        this.f82164b = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // yads.ea0
    public final /* bridge */ /* synthetic */ void a(ba0 ba0Var) {
        a();
    }

    public static final void a(rb rbVar, View view) {
        rbVar.f82163a.invoke();
    }
}
