package yads;

import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.PopupMenu;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ou0 {
    public static PopupMenu a(Context context, ImageView imageView, List list) {
        PopupMenu popupMenu = new PopupMenu(context, imageView, 5);
        Menu menu = popupMenu.getMenu();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            menu.add(0, i10, 0, ((fu0) it.next()).f77494a);
            i10++;
        }
        return popupMenu;
    }
}
