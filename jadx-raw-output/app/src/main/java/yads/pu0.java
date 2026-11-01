package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class pu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f81594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f81595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f81596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l12 f81597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz1 f81598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ou0 f81599f;

    public final void a(Context context, gu0 gu0Var) {
        View viewA = this.f81597d.f79682c.a("feedback");
        ImageView imageView = viewA instanceof ImageView ? (ImageView) viewA : null;
        if (imageView == null) {
            return;
        }
        List list = gu0Var.f77939b;
        if (!list.isEmpty()) {
            try {
                za zaVar = new za(context, this.f81595b, this.f81594a);
                this.f81599f.getClass();
                PopupMenu popupMenuA = ou0.a(context, imageView, list);
                popupMenuA.setOnMenuItemClickListener(new dg2(zaVar, list, this.f81596c, this.f81598e));
                popupMenuA.show();
            } catch (Exception e10) {
                boolean z10 = ad1.f75480a;
                ((iu3) this.f81595b).a().reportError("Failed to render feedback", e10);
            }
        }
    }

    public pu0(d4 d4Var, lu2 lu2Var, lv lvVar, l12 l12Var, uz1 uz1Var, ou0 ou0Var) {
        this.f81594a = d4Var;
        this.f81595b = lu2Var;
        this.f81596c = lvVar;
        this.f81597d = l12Var;
        this.f81598e = uz1Var;
        this.f81599f = ou0Var;
    }
}
