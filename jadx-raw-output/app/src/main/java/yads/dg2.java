package yads;

import android.view.MenuItem;
import android.widget.PopupMenu;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dg2 implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f76668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f76669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f76670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz1 f76671d;

    public dg2(za zaVar, List list, lv lvVar, uz1 uz1Var) {
        this.f76668a = zaVar;
        this.f76669b = list;
        this.f76670c = lvVar;
        this.f76671d = uz1Var;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId < this.f76669b.size()) {
            za.a(this.f76668a, ((fu0) this.f76669b.get(itemId)).f77495b, k83.f79331c);
            lv lvVar = this.f76670c;
            co2 co2Var = co2.f76371v;
            lvVar.getClass();
            lvVar.f79937d.a(lvVar.a(co2Var, new HashMap()));
            this.f76671d.f83701a.a();
            return true;
        }
        return true;
    }
}
