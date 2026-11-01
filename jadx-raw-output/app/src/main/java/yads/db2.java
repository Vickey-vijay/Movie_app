package yads;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class db2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    public static ArrayList a(View view) {
        ArrayList arrayList = new ArrayList();
        wl3 wl3Var = kl3.f79470a;
        ViewParent parent = view.getParent();
        ?? r10 = view;
        ?? r11 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        while (r11 != 0) {
            int childCount = r11.getChildCount();
            for (int iIndexOfChild = r11.indexOfChild(r10) + 1; iIndexOfChild < childCount; iIndexOfChild++) {
                arrayList.addAll(b(r11.getChildAt(iIndexOfChild)));
            }
            ViewParent parent2 = r11.getParent();
            ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            r10 = r11;
            r11 = viewGroup;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (view.getZ() <= ((View) obj).getZ()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static List b(View view) {
        List listC = nj.r.c();
        if (!kl3.b(view)) {
            if (!(view instanceof ViewGroup) || kl3.c(view)) {
                listC.add(view);
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                List listC2 = nj.r.c();
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    listC2.addAll(b(viewGroup.getChildAt(i10)));
                }
                listC.addAll(nj.r.a(listC2));
            }
        }
        return nj.r.a(listC);
    }
}
