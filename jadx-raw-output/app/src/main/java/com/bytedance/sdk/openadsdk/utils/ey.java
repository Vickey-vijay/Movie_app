package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ey {

    public class ouw implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final /* synthetic */ boolean f13385lh;
        public View ouw = null;
        public final /* synthetic */ ViewGroup vt;

        public ouw(ViewGroup viewGroup, boolean z10) {
            this.vt = viewGroup;
            this.f13385lh = z10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            try {
                vt vtVar = (vt) this.vt.getTag(520093765);
                if (this.ouw != null) {
                    Rect rect = new Rect();
                    this.ouw.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    this.vt.getGlobalVisibleRect(rect2);
                    if (rect.contains(rect2)) {
                        if (vtVar != null) {
                            vtVar.ouw(this.vt, false);
                        }
                        this.vt.setTag(520093763, Boolean.FALSE);
                        return;
                    } else {
                        if (vtVar != null) {
                            vtVar.ouw(this.vt, true);
                        }
                        this.vt.setTag(520093763, Boolean.TRUE);
                        return;
                    }
                }
                ViewGroup viewGroup = this.vt;
                ey.ouw(viewGroup, vtVar, (Integer) viewGroup.getTag(520093766), this.f13385lh);
            } catch (Exception e10) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.vt.getTag(520093765), "ViewUtils", e10);
            }
        }
    }

    public interface vt {
        void ouw();

        void ouw(View view, boolean z10);

        void ouw(boolean z10);

        void vt();
    }

    public static void ouw(final ViewGroup viewGroup, boolean z10, int i10, final boolean z11, vt vtVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, vtVar);
        viewGroup.setTag(520093766, Integer.valueOf(i10));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final ouw ouwVar = new ouw(viewGroup, z11);
        if (list != null && list.size() > 0) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.get(i11).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ey.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public final void onChildViewAdded(View view, View view2) {
                        ouwVar.ouw = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public final void onChildViewRemoved(View view, View view2) {
                        ouwVar.ouw = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(ouwVar);
        if (z10) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.ey.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    try {
                        vt vtVar2 = (vt) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        ey.ouw(viewGroup2, vtVar2, (Integer) viewGroup2.getTag(520093766), z11);
                    } catch (Exception e10) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ey.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z12) {
                try {
                    vt vtVar2 = (vt) viewGroup.getTag(520093765);
                    if (vtVar2 != null) {
                        vtVar2.ouw(z12);
                        ViewGroup viewGroup2 = viewGroup;
                        ey.ouw(viewGroup2, vtVar2, (Integer) viewGroup2.getTag(520093766), z11);
                    }
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ey.4
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                vt vtVar2 = (vt) viewGroup.getTag(520093765);
                if (vtVar2 != null) {
                    vtVar2.ouw();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                vt vtVar2 = (vt) viewGroup.getTag(520093765);
                if (vtVar2 != null) {
                    vtVar2.vt();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    public static ArrayList<View> ouw(View view, int i10) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i10 > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < viewGroup.getChildCount(); iIndexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(iIndexOfChild));
                }
            }
            if (i10 > 1 && parent != null) {
                arrayList.addAll(ouw((View) parent, i10 - 1));
            }
        }
        return arrayList;
    }

    public static View ouw(View view, Class<? extends View> cls) {
        Object parent;
        while (view != null && (parent = view.getParent()) != null) {
            if (cls.isInstance(parent)) {
                return (View) parent;
            }
            view = (View) parent;
        }
        return null;
    }

    public static /* synthetic */ void ouw(View view, vt vtVar, Integer num, boolean z10) {
        if (vtVar != null) {
            if (num == null) {
                num = 0;
            }
            vtVar.ouw(view, com.bytedance.sdk.openadsdk.core.fak.ouw(view, 20, num.intValue(), z10));
        }
    }
}
