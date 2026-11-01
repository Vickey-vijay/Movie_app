package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes10.dex */
public final class pb extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk.l f81334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f81335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f81336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f81337d;

    @Override // yads.ea0
    public final void a(final r90 r90Var) {
        this.f81335b.setText(r90Var.f82146a);
        this.f81336c.setText(r90Var.f82147b);
        this.f81337d.setText(r90Var.f82148c);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cp.b8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yads.pb.a(this.f51247b, r90Var, view);
            }
        });
    }

    public pb(vk3 vk3Var, View view) {
        super(view);
        this.f81334a = vk3Var;
        this.f81335b = (TextView) view.findViewById(R$id.item_name);
        this.f81336c = (TextView) view.findViewById(R$id.item_ad_unit_format);
        this.f81337d = (TextView) view.findViewById(R$id.item_ad_unit_id);
    }

    public static final void a(pb pbVar, r90 r90Var, View view) {
        pbVar.f81334a.invoke(r90Var.f82148c);
    }
}
