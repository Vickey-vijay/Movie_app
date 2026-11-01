package yads;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes10.dex */
public final class wl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bb2 f84261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yl3 f84262b;

    public wl3(bb2 bb2Var, yl3 yl3Var) {
        this.f84261a = bb2Var;
        this.f84262b = yl3Var;
    }

    public static String b(View view) {
        String str;
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility != 4) {
                if (visibility != 8) {
                    str = "UNKNOWN";
                } else {
                    str = "GONE";
                }
            } else {
                str = "INVISIBLE";
            }
        } else {
            str = "VISIBLE";
        }
        return "view is not shown: visibility=" + str + ", attached=" + view.isAttachedToWindow();
    }

    public static String c(View view) {
        String str;
        if (!view.isAttachedToWindow()) {
            str = "not attached";
        } else if (view.getWidth() > 0 && view.getHeight() > 0) {
            str = "scrolled off";
        } else {
            str = "zero size";
        }
        return "view rect is null: " + str;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    public final xl3 a(View view) {
        int i10 = 0;
        if (!view.isShown()) {
            return new xl3(0, b(view));
        }
        if (view.getAlpha() == 0.0f) {
            return new xl3(0, "view is transparent");
        }
        yl3 yl3Var = this.f84262b;
        yl3Var.getClass();
        Rect rect = new Rect();
        String str = null;
        if (view.getGlobalVisibleRect(rect)) {
            Context context = view.getContext();
            Object obj = dw2.f76819j;
            nt2 nt2VarA = cw2.a().a(context);
            if (nt2VarA != null && nt2VarA.f80781n) {
                yl3Var.f85044a.getClass();
                Rect rectA = wo3.a(view);
                Rect rect2 = new Rect(rect);
                if (rect2.intersect(rectA)) {
                    rect = rect2;
                } else {
                    rect = null;
                }
            }
        } else {
            rect = null;
        }
        if (rect == null) {
            return new xl3(0, c(view));
        }
        int iHeight = rect.height() * rect.width();
        bb2 bb2Var = this.f84261a;
        bb2Var.getClass();
        Object obj2 = dw2.f76819j;
        nt2 nt2VarA2 = cw2.a().a(view.getContext());
        if (nt2VarA2 != null && nt2VarA2.f80779m) {
            bb2Var.f75776a.getClass();
            ArrayList<View> arrayListA = db2.a(view);
            bb2Var.f75777b.getClass();
            ArrayList<Rect> arrayList = new ArrayList();
            for (View view2 : arrayListA) {
                Rect rect3 = new Rect();
                if (view2.getGlobalVisibleRect(rect3)) {
                    arrayList.add(rect3);
                }
            }
            for (Rect rect4 : arrayList) {
                rect4.left = ik.k.g(ik.k.d(rect4.left, rect.left), rect.right);
                rect4.top = ik.k.g(ik.k.d(rect4.top, rect.top), rect.bottom);
                rect4.right = ik.k.g(ik.k.d(rect4.right, rect.left), rect.right);
                rect4.bottom = ik.k.g(ik.k.d(rect4.bottom, rect.top), rect.bottom);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                Rect rect5 = (Rect) obj3;
                if (rect5.width() > 0 && rect5.height() > 0) {
                    arrayList2.add(obj3);
                }
            }
            int size = arrayList2.size();
            List<Rect> listSubList = arrayList2;
            if (size > 100) {
                listSubList = arrayList2.subList(0, 100);
            }
            bb2Var.f75778c.getClass();
            TreeSet treeSet = new TreeSet();
            treeSet.add(Integer.valueOf(rect.left));
            treeSet.add(Integer.valueOf(rect.right));
            for (Rect rect6 : listSubList) {
                treeSet.add(Integer.valueOf(rect6.left));
                treeSet.add(Integer.valueOf(rect6.right));
            }
            ArrayList arrayList3 = new ArrayList(treeSet);
            TreeSet treeSet2 = new TreeSet();
            treeSet2.add(Integer.valueOf(rect.top));
            treeSet2.add(Integer.valueOf(rect.bottom));
            for (Rect rect7 : listSubList) {
                treeSet2.add(Integer.valueOf(rect7.top));
                treeSet2.add(Integer.valueOf(rect7.bottom));
            }
            ArrayList arrayList4 = new ArrayList(treeSet2);
            rect.left = Collections.binarySearch(arrayList3, Integer.valueOf(rect.left));
            rect.top = Collections.binarySearch(arrayList4, Integer.valueOf(rect.top));
            rect.right = Collections.binarySearch(arrayList3, Integer.valueOf(rect.right));
            rect.bottom = Collections.binarySearch(arrayList4, Integer.valueOf(rect.bottom));
            for (Rect rect8 : listSubList) {
                rect8.left = Collections.binarySearch(arrayList3, Integer.valueOf(rect8.left));
                rect8.top = Collections.binarySearch(arrayList4, Integer.valueOf(rect8.top));
                rect8.right = Collections.binarySearch(arrayList3, Integer.valueOf(rect8.right));
                rect8.bottom = Collections.binarySearch(arrayList4, Integer.valueOf(rect8.bottom));
            }
            int size2 = arrayList3.size() - 1;
            byte[][] bArr = new byte[size2][];
            for (int i11 = 0; i11 < size2; i11++) {
                bArr[i11] = new byte[arrayList4.size() - 1];
            }
            for (Rect rect9 : listSubList) {
                int i12 = rect9.right;
                for (int i13 = rect9.left; i13 < i12; i13++) {
                    int i14 = rect9.bottom;
                    for (int i15 = rect9.top; i15 < i14; i15++) {
                        bArr[i13][i15] = 1;
                    }
                }
            }
            int size3 = arrayList3.size() - 1;
            int iIntValue = 0;
            for (int i16 = 0; i16 < size3; i16++) {
                int size4 = arrayList4.size() - 1;
                for (int i17 = 0; i17 < size4; i17++) {
                    if (bArr[i16][i17] == 1) {
                        iIntValue = ((((Number) arrayList4.get(i17 + 1)).intValue() - ((Number) arrayList4.get(i17)).intValue()) * (((Number) arrayList3.get(i16 + 1)).intValue() - ((Number) arrayList3.get(i16)).intValue())) + iIntValue;
                    }
                }
            }
            i10 = iIntValue;
        }
        int i18 = iHeight - i10;
        if (i18 <= 0) {
            str = "no visible area";
        }
        return new xl3(i18, str);
    }
}
