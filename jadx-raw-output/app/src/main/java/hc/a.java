package hc;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.viewpager.widget.ViewPager;
import cc.e;
import com.scwang.smart.refresh.layout.kernel.R$id;
import ec.i;
import java.util.LinkedList;

/* JADX INFO: compiled from: RefreshContentWrapper.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements cc.b, ec.a, ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f53835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f53836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f53837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f53838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f53839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53840g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f53841h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f53842i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public fc.a f53843j = new fc.a();

    @Override // cc.b
    public void e(int i10, int i11, int i12) {
        boolean z10;
        View viewFindViewById;
        View viewFindViewById2;
        boolean z11 = true;
        if (i11 == -1 || (viewFindViewById2 = this.f53836c.findViewById(i11)) == null) {
            z10 = false;
        } else if (i10 > 0) {
            viewFindViewById2.setTranslationY(i10);
            z10 = true;
        } else {
            if (viewFindViewById2.getTranslationY() > 0.0f) {
                viewFindViewById2.setTranslationY(0.0f);
            }
            z10 = false;
        }
        if (i12 == -1 || (viewFindViewById = this.f53836c.findViewById(i12)) == null) {
            z11 = z10;
        } else if (i10 < 0) {
            viewFindViewById.setTranslationY(i10);
        } else {
            if (viewFindViewById.getTranslationY() < 0.0f) {
                viewFindViewById.setTranslationY(0.0f);
            }
            z11 = z10;
        }
        if (z11) {
            this.f53836c.setTranslationY(0.0f);
        } else {
            this.f53836c.setTranslationY(i10);
        }
        View view = this.f53838e;
        if (view != null) {
            view.setTranslationY(Math.max(0, i10));
        }
        View view2 = this.f53839f;
        if (view2 != null) {
            view2.setTranslationY(Math.min(0, i10));
        }
    }

    @Override // cc.b
    public void a(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.f53835b.getLeft(), -this.f53835b.getTop());
        View view = this.f53837d;
        View view2 = this.f53835b;
        if (view != view2) {
            this.f53837d = l(view2, pointF, view);
        }
        if (this.f53837d == this.f53835b) {
            this.f53843j.f52936a = null;
        } else {
            this.f53843j.f52936a = pointF;
        }
    }

    @Override // cc.b
    public void b(boolean z10) {
        this.f53843j.f52938c = z10;
    }

    @Override // cc.b
    public ValueAnimator.AnimatorUpdateListener c(int i10) {
        View view = this.f53837d;
        if (view == null || i10 == 0) {
            return null;
        }
        if ((i10 >= 0 || !view.canScrollVertically(1)) && (i10 <= 0 || !this.f53837d.canScrollVertically(-1))) {
            return null;
        }
        this.f53840g = i10;
        return this;
    }

    @Override // cc.b
    public void d(e eVar, View view, View view2) {
        k(this.f53835b, eVar);
        if (view == null && view2 == null) {
            return;
        }
        this.f53838e = view;
        this.f53839f = view2;
        FrameLayout frameLayout = new FrameLayout(this.f53835b.getContext());
        int iIndexOfChild = eVar.c().getLayout().indexOfChild(this.f53835b);
        eVar.c().getLayout().removeView(this.f53835b);
        frameLayout.addView(this.f53835b, 0, new ViewGroup.LayoutParams(-1, -1));
        eVar.c().getLayout().addView(frameLayout, iIndexOfChild, this.f53835b.getLayoutParams());
        this.f53835b = frameLayout;
        if (view != null) {
            view.setTag(R$id.srl_tag, "fixed-top");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild2 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            layoutParams.height = gc.b.h(view);
            viewGroup.addView(new Space(this.f53835b.getContext()), iIndexOfChild2, layoutParams);
            frameLayout.addView(view, 1, layoutParams);
        }
        if (view2 != null) {
            view2.setTag(R$id.srl_tag, "fixed-bottom");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
            int iIndexOfChild3 = viewGroup2.indexOfChild(view2);
            viewGroup2.removeView(view2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
            layoutParams2.height = gc.b.h(view2);
            viewGroup2.addView(new Space(this.f53835b.getContext()), iIndexOfChild3, layoutParams2);
            layoutParams3.gravity = 80;
            frameLayout.addView(view2, 1, layoutParams3);
        }
    }

    @Override // cc.b
    public boolean f() {
        return this.f53842i && this.f53843j.a(this.f53835b);
    }

    @Override // cc.b
    @NonNull
    public View g() {
        return this.f53837d;
    }

    @Override // cc.b
    @NonNull
    public View getView() {
        return this.f53835b;
    }

    @Override // cc.b
    public void h(i iVar) {
        if (iVar instanceof fc.a) {
            this.f53843j = (fc.a) iVar;
        } else {
            this.f53843j.f52937b = iVar;
        }
    }

    @Override // cc.b
    public boolean i() {
        return this.f53841h && this.f53843j.b(this.f53835b);
    }

    @Override // ec.a
    public void j(boolean z10, boolean z11) {
        this.f53841h = z10;
        this.f53842i = z11;
    }

    public void k(View view, e eVar) {
        boolean zIsInEditMode = this.f53835b.isInEditMode();
        View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof NestedScrollingParent) || (view2 instanceof NestedScrollingChild))) {
                break;
            }
            view = m(view, view2 == null);
            if (view == view2) {
                break;
            }
            if (!zIsInEditMode) {
                gc.a.a(view, eVar, this);
            }
            view2 = view;
        }
        if (view2 != null) {
            this.f53837d = view2;
        }
    }

    public View l(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (gc.b.g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && gc.b.e(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    View viewL = l(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return viewL;
                }
            }
        }
        return view2;
    }

    public View m(View view, boolean z10) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        View view2 = null;
        while (linkedList.size() > 0 && view2 == null) {
            View view3 = (View) linkedList.poll();
            if (view3 != null) {
                if ((z10 || view3 != view) && gc.b.e(view3)) {
                    view2 = view3;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        linkedList.add(viewGroup.getChildAt(i10));
                    }
                }
            }
        }
        return view2 == null ? view : view2;
    }

    public a(@NonNull View view) {
        this.f53837d = view;
        this.f53836c = view;
        this.f53835b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (iIntValue - this.f53840g) * this.f53837d.getScaleY();
            View view = this.f53837d;
            if (view instanceof AbsListView) {
                gc.b.j((AbsListView) view, (int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.f53840g = iIntValue;
    }
}
