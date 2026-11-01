package sg.bigo.ads.ad.b;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAdView;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.adview.h;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"ClickableViewAccessibility"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f67353a = 1662622472;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f67354b = 5;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0651a {
        boolean a();
    }

    public static List<sg.bigo.ads.core.c.a> a(List<sg.bigo.ads.api.core.b.c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (sg.bigo.ads.api.core.b.c cVar : list) {
                if (cVar != null) {
                    sg.bigo.ads.core.c.a aVar = new sg.bigo.ads.core.c.a();
                    aVar.f71194b = cVar.b();
                    aVar.f71193a = cVar.a();
                    aVar.f71195c = cVar.c();
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static b a(@NonNull sg.bigo.ads.api.core.f fVar) {
        int iA;
        int iP = fVar.f69376a.P();
        int iW = fVar.f69376a.w();
        int iX = fVar.f69376a.x();
        m mVarE = fVar.f69376a.e();
        if (mVarE != null && 2 == iP) {
            boolean z10 = false;
            boolean z11 = iX == 3 || iX == 4;
            boolean z12 = iW == 1 || iW == 2;
            if (z11 && z12) {
                z10 = true;
            }
            if (z10 && (3 == (iA = mVarE.a("multi_ads.multi_ads_type")) || 2 == iA)) {
                return new sg.bigo.ads.ad.b.a.a.b(fVar, iA);
            }
        }
        if (iX != 1) {
            if (iX == 2) {
                if (iW == 1) {
                    return new sg.bigo.ads.ad.b.a.a(fVar);
                }
                if (iW == 2) {
                    return new sg.bigo.ads.ad.b.a.b(fVar);
                }
                return null;
            }
            if (iX != 3 && iX != 4 && iX != 12 && iX != 20) {
                switch (iX) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        if (iW == 5) {
                            return new sg.bigo.ads.ad.b.a.c(fVar);
                        }
                        return null;
                    default:
                        if (iW == 1) {
                            return new b(fVar);
                        }
                        if (iW == 2) {
                            return new c(fVar);
                        }
                        if (iW != 5) {
                            return null;
                        }
                        return new sg.bigo.ads.ad.b.a.c(fVar);
                }
            }
        }
        if (iW == 1) {
            return new sg.bigo.ads.ad.b.a.d(fVar);
        }
        if (iW == 2) {
            return new sg.bigo.ads.ad.b.a.e(fVar);
        }
        return null;
    }

    @NonNull
    public static p a(b bVar) {
        p pVar;
        String str;
        sg.bigo.ads.api.core.m mVarAV = ((sg.bigo.ads.core.a.a) bVar.f()).aV();
        if (mVarAV != null) {
            p pVar2 = new p(mVarAV.f69409a, mVarAV.f69410b);
            if (pVar2.a()) {
                sg.bigo.ads.common.t.a.a(0, 3, "nativeRation", "real size");
                return pVar2;
            }
        }
        if (!(bVar instanceof c)) {
            n.a[] aVarArrAx = ((sg.bigo.ads.core.a.a) bVar.f()).ax();
            if (!k.a(aVarArrAx)) {
                pVar = new p(aVarArrAx[0].a(), aVarArrAx[0].b());
                str = "image first size";
                sg.bigo.ads.common.t.a.a(0, 3, "nativeRation", str);
                return pVar;
            }
            return new p(-1, -1);
        }
        sg.bigo.ads.core.f.a.p pVar3 = ((c) bVar).J;
        if (pVar3 != null) {
            pVar = new p(pVar3.f71483x, pVar3.f71482w);
            if (pVar.a()) {
                str = "video vast size";
                sg.bigo.ads.common.t.a.a(0, 3, "nativeRation", str);
                return pVar;
            }
        }
        return new p(-1, -1);
    }

    public static void a(@NonNull final View view, @NonNull final View view2, final int i10, @Nullable final h hVar, int i11) {
        View.OnTouchListener onTouchListener;
        if (hVar == null) {
            view2.setOnTouchListener(null);
            return;
        }
        if (i11 == 2) {
            final int[] iArr = {0, 0};
            onTouchListener = new View.OnTouchListener() { // from class: sg.bigo.ads.ad.b.a.3
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    int x10 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        if (view3 instanceof MediaView) {
                            ((MediaView) view3).a(x10, y10);
                            int unused = a.f67354b = ((Integer) view3.getTag()).intValue();
                        }
                        int[] iArr2 = iArr;
                        iArr2[0] = x10;
                        iArr2[1] = y10;
                    }
                    if (actionMasked == 1) {
                        if (a.a(view3, x10, y10)) {
                            return false;
                        }
                        if (view3 instanceof MediaView) {
                            view3.setTag(Integer.valueOf(a.f67354b));
                        }
                        sg.bigo.ads.common.t.a.a(0, 4, "NativeAdHelper", "target.getTag: " + view2.getTag());
                        View view4 = view;
                        View view5 = view2;
                        int[] iArr3 = iArr;
                        a.b(view4, view3, view5, x10, y10, iArr3[0], iArr3[1], i10, hVar, null);
                    }
                    return true;
                }
            };
        } else if (i11 == 3) {
            b(view, view2, i10, hVar, null);
            return;
        } else {
            final int[] iArr2 = {0, 0};
            onTouchListener = new View.OnTouchListener() { // from class: sg.bigo.ads.ad.b.a.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    int x10 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        if (view3 instanceof MediaView) {
                            ((MediaView) view3).a(x10, y10);
                            int unused = a.f67354b = ((Integer) view3.getTag()).intValue();
                        }
                        int[] iArr3 = iArr2;
                        iArr3[0] = x10;
                        iArr3[1] = y10;
                    }
                    if (actionMasked == 1) {
                        if (view3 instanceof sg.bigo.ads.api.a) {
                            if (!((sg.bigo.ads.api.a) view3).a(x10, y10)) {
                                return false;
                            }
                        } else if (view3 == view || view3.getTag() == 1) {
                            if (!u.a(view3, x10, y10)) {
                                return false;
                            }
                        } else if ("internal_ad_component_view".equals(view3.getTag(a.f67353a)) && !u.a(view3, x10, y10)) {
                            return false;
                        }
                        if (view3 instanceof MediaView) {
                            view3.setTag(Integer.valueOf(a.f67354b));
                        }
                        sg.bigo.ads.common.t.a.a(0, 4, "NativeAdHelper", "target.getTag: " + view2.getTag());
                        View view4 = view;
                        View view5 = view2;
                        int[] iArr4 = iArr2;
                        a.b(view4, view3, view5, x10, y10, iArr4[0], iArr4[1], i10, hVar, null);
                    }
                    return true;
                }
            };
        }
        a(view, view2, onTouchListener);
    }

    public static void a(@NonNull View view, @NonNull View view2, int i10, @Nullable h hVar, InterfaceC0651a interfaceC0651a) {
        b(view, view2, i10, hVar, interfaceC0651a);
    }

    private static void a(final View view, final View view2, final View.OnTouchListener onTouchListener) {
        view2.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.b.a.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                if (motionEvent.getActionMasked() == 0 && view != null) {
                    Object parent = view2.getParent();
                    if ((parent instanceof View) && u.b(((View) parent).findViewWithTag(4), rawX, rawY)) {
                        return false;
                    }
                }
                return onTouchListener.onTouch(view3, motionEvent);
            }
        });
    }

    public static void a(View view, Object obj) {
        if (view != null) {
            view.setTag(obj);
            view.setTag(f67353a, "internal_ad_component_view");
        }
    }

    public static /* synthetic */ boolean a(View view, int i10, int i11) {
        if (view instanceof MediaView) {
            return !((MediaView) view).a(i10, i11);
        }
        return !u.a(view, i10, i11);
    }

    public static /* synthetic */ boolean a(View view, int i10, int i11, int i12) {
        int i13 = -i12;
        return i10 >= i13 && i11 >= i13 && i10 < (view.getRight() - view.getLeft()) + i12 && i11 < (view.getBottom() - view.getTop()) + i12;
    }

    @NonNull
    public static List<View> b(@Nullable List<View> list) {
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (View view : list) {
            if (view != null) {
                Object tag = view.getTag();
                if ((tag instanceof Integer) && ((iIntValue = ((Integer) tag).intValue()) == 7 || iIntValue == 2 || iIntValue == 6 || iIntValue == 10 || iIntValue == 26 || iIntValue == 8 || iIntValue == 5 || iIntValue == 9)) {
                    arrayList.add(view);
                }
            }
        }
        return arrayList;
    }

    private static void b(final View view, final View view2, final int i10, final h hVar, @Nullable final InterfaceC0651a interfaceC0651a) {
        final int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        final int[] iArr = {0, 0};
        final boolean[] zArr = {true};
        a(view, view2, new View.OnTouchListener() { // from class: sg.bigo.ads.ad.b.a.4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view3, MotionEvent motionEvent) {
                boolean z10;
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    int[] iArr2 = iArr;
                    iArr2[0] = x10;
                    iArr2[1] = y10;
                    zArr[0] = true;
                    if (view3 instanceof MediaView) {
                        ((MediaView) view3).a(x10, y10);
                        int unused = a.f67354b = ((Integer) view3.getTag()).intValue();
                    }
                } else if (actionMasked == 2) {
                    if (!a.a(view2, x10, y10, scaledTouchSlop)) {
                        zArr[0] = false;
                    }
                } else if (actionMasked == 1) {
                    if (zArr[0]) {
                        if (Math.abs(x10 - iArr[0]) >= scaledTouchSlop || Math.abs(y10 - iArr[1]) >= scaledTouchSlop) {
                            InterfaceC0651a interfaceC0651a2 = interfaceC0651a;
                            z10 = interfaceC0651a2 != null && interfaceC0651a2.a();
                            if (z10) {
                            }
                        } else {
                            z10 = false;
                        }
                        if (a.a(view3, x10, y10)) {
                            return false;
                        }
                        if (view3 instanceof MediaView) {
                            view3.setTag(Integer.valueOf(a.f67354b));
                        }
                        Object tag = (!z10 || interfaceC0651a == null) ? view2.getTag() : 30;
                        sg.bigo.ads.common.t.a.a(0, 4, "NativeAdHelper", "target.getTag: ".concat(String.valueOf(tag)));
                        View view4 = view;
                        View view5 = view2;
                        int[] iArr3 = iArr;
                        a.b(view4, view3, view5, x10, y10, iArr3[0], iArr3[1], i10, hVar, tag);
                    }
                } else if (actionMasked == 3) {
                    zArr[0] = false;
                }
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, View view2, View view3, int i10, int i11, int i12, int i13, int i14, h hVar, Object obj) {
        Object tag = obj;
        int left = i10;
        int top2 = i11;
        int left2 = i12;
        int top3 = i13;
        for (View view4 = view2; (view4.getParent() instanceof ViewGroup) && view4 != view && !(view4 instanceof NativeAdView); view4 = (View) view4.getParent()) {
            left += view4.getLeft();
            left2 += view4.getLeft();
            top2 += view4.getTop();
            top3 += view4.getTop();
        }
        if (tag == null || !(tag instanceof Integer)) {
            tag = view3.getTag();
        }
        hVar.a(left, top2, left2, top3, i14, tag instanceof Integer ? ((Integer) tag).intValue() : 0);
    }
}
