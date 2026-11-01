package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import yads.mr1;

/* JADX INFO: loaded from: classes8.dex */
public final class mr1 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70 f80324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.l f80325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk.l f80326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public et f80327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f80328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f80329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f80330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f80331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f80332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f80333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f80334k;

    @Override // yads.ea0
    public final void a(final y90 y90Var) {
        Context context = this.itemView.getContext();
        this.f80330g.setText(y90Var.f84854a);
        x80 x80Var = y90Var.f84856c;
        if (x80Var != null) {
            this.f80332i.setVisibility(0);
            this.f80332i.setText(x80Var.f84475a);
            this.f80332i.setTextAppearance(context, x80Var.f84478d);
            this.f80332i.setTextColor(ik.a(this.itemView.getContext(), x80Var.f84476b));
            TextView textView = this.f80332i;
            Integer num = x80Var.f84477c;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        } else {
            this.f80332i.setVisibility(8);
        }
        q50 q50Var = y90Var.f84857d;
        this.f80333j.setText(q50Var.f81709a);
        this.f80333j.setTextAppearance(context, q50Var.f81711c);
        this.f80333j.setTextColor(ik.a(this.itemView.getContext(), q50Var.f81710b));
        LinearLayout linearLayout = this.f80328e;
        String str = y90Var.f84858e;
        linearLayout.setClickable(((str == null || lk.a0.n0(str)) && y90Var.f84860g == null) ? false : true);
        String str2 = y90Var.f84858e;
        if (str2 == null || lk.a0.n0(str2)) {
            this.f80334k.setVisibility(8);
        } else {
            this.f80334k.setVisibility(0);
            this.f80328e.setOnClickListener(new View.OnClickListener() { // from class: cp.n6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mr1.a(this.f51471b, y90Var, view);
                }
            });
        }
        this.f80329f.setImageResource(0);
        et etVar = this.f80327d;
        if (etVar != null) {
            etVar.cancel();
        }
        z70 z70Var = this.f80324a;
        String str3 = y90Var.f84855b;
        if (str3 == null) {
            str3 = "";
        }
        this.f80327d = z70Var.a(str3, this.f80329f);
        if (y90Var.f84860g == null) {
            this.f80331h.setVisibility(8);
        } else {
            this.f80331h.setVisibility(0);
            this.f80328e.setOnClickListener(new View.OnClickListener() { // from class: cp.o6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mr1.b(this.f51492b, y90Var, view);
                }
            });
        }
    }

    public static final void b(mr1 mr1Var, y90 y90Var, View view) {
        mr1Var.f80325b.invoke(y90Var);
    }

    public mr1(View view, z70 z70Var, sk3 sk3Var, tk3 tk3Var) {
        super(view);
        this.f80324a = z70Var;
        this.f80325b = sk3Var;
        this.f80326c = tk3Var;
        this.f80328e = (LinearLayout) view.findViewById(R$id.item_mediation_adapter);
        this.f80329f = (ImageView) view.findViewById(R$id.item_logo);
        this.f80330g = (TextView) view.findViewById(R$id.item_name);
        this.f80331h = (ImageView) view.findViewById(R$id.navigation_icon);
        this.f80332i = (TextView) view.findViewById(R$id.item_info_first);
        this.f80333j = (TextView) view.findViewById(R$id.item_info_second);
        this.f80334k = (ImageView) view.findViewById(R$id.item_warning_button);
    }

    public static final void a(mr1 mr1Var, y90 y90Var, View view) {
        mr1Var.f80326c.invoke(y90Var.f84858e);
    }
}
