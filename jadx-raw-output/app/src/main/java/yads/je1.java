package yads;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes10.dex */
public final class je1 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f79010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f79011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f79012c;

    @Override // yads.ea0
    public final void a(ba0 ba0Var) {
        x90 x90Var = (x90) ba0Var;
        String str = x90Var.f84496a;
        x80 x80Var = x90Var.f84497b;
        q50 q50Var = x90Var.f84498c;
        Context context = this.itemView.getContext();
        if (str != null) {
            this.f79010a.setVisibility(0);
            this.f79010a.setText(str);
        } else {
            this.f79010a.setVisibility(8);
        }
        if (x80Var == null || !(!lk.a0.n0(x80Var.f84475a))) {
            this.f79011b.setVisibility(8);
        } else {
            this.f79011b.setVisibility(0);
            this.f79011b.setText(x80Var.f84475a);
            this.f79011b.setTextColor(ik.a(context, x80Var.f84476b));
            Integer num = x80Var.f84477c;
            this.f79011b.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        }
        if (q50Var == null || !(!lk.a0.n0(q50Var.f81709a))) {
            this.f79012c.setVisibility(8);
            return;
        }
        this.f79012c.setVisibility(0);
        this.f79012c.setText(q50Var.f81709a);
        this.f79012c.setTextColor(ik.a(context, q50Var.f81710b));
    }

    public je1(View view) {
        super(view);
        this.f79010a = (TextView) view.findViewById(R$id.item_title);
        this.f79011b = (TextView) view.findViewById(R$id.item_subtitle);
        this.f79012c = (TextView) view.findViewById(R$id.item_text);
    }
}
