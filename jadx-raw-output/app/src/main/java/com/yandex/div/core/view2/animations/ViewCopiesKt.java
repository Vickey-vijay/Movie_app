package com.yandex.div.core.view2.animations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.core.view.ViewGroupKt;
import androidx.transition.R;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import bk.a;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import java.util.Iterator;
import mj.r;

/* JADX INFO: compiled from: ViewCopies.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewCopiesKt {
    private static final void invalidatePosition(View view, ViewGroup viewGroup, int[] iArr) {
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        view.offsetLeftAndRight(iArr[0] - iArr2[0]);
        view.offsetTopAndBottom(iArr[1] - iArr2[1]);
    }

    @MainThread
    public static final View createOrGetVisualCopy(final View view, ViewGroup viewGroup, Transition transition, int[] iArr) {
        int i10 = R.id.save_overlay_view;
        Object tag = view.getTag(i10);
        View view2 = tag instanceof View ? (View) tag : null;
        if (view2 != null) {
            return view2;
        }
        final ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        setScreenshotFromView(imageView, view);
        imageView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        imageView.layout(0, 0, view.getWidth(), view.getHeight());
        invalidatePosition(imageView, viewGroup, iArr);
        view.setTag(i10, imageView);
        replace(view, imageView, transition, viewGroup);
        setHierarchyImageChangeCallback(view, new a<r>() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt.createOrGetVisualCopy.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ViewCopiesKt.setScreenshotFromView(imageView, view);
            }
        });
        if (imageView.isAttachedToWindow()) {
            imageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$createOrGetVisualCopy$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view3) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view3) {
                    imageView.removeOnAttachStateChangeListener(this);
                    ViewCopiesKt.setHierarchyImageChangeCallback(view, null);
                }
            });
        } else {
            setHierarchyImageChangeCallback(view, null);
        }
        return imageView;
    }

    public static final void setHierarchyImageChangeCallback(View view, a<r> aVar) {
        if (view instanceof DivImageView) {
            ((DivImageView) view).setImageChangeCallback(aVar);
        } else if (view instanceof ViewGroup) {
            Iterator<View> it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                setHierarchyImageChangeCallback(it.next(), aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setScreenshotFromView(final ImageView imageView, final View view) {
        Bitmap bitmap;
        if (!(view instanceof DivBorderSupports)) {
            ImageView imageView2 = view instanceof ImageView ? (ImageView) view : null;
            Drawable drawable = imageView2 != null ? imageView2.getDrawable() : null;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                imageView.setImageBitmap(bitmap);
                return;
            }
        }
        if (ViewsKt.isActuallyLaidOut(view)) {
            drawAndSet(imageView, view);
        } else if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$setScreenshotFromView$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view2.removeOnLayoutChangeListener(this);
                    ViewCopiesKt.drawAndSet(imageView, view);
                }
            });
        } else {
            drawAndSet(imageView, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void drawAndSet(ImageView imageView, View view) {
        DivBorderSupports divBorderSupports;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            imageView.setImageBitmap(bitmapCreateBitmap);
            if (view instanceof DivBorderSupports) {
                divBorderSupports = (DivBorderSupports) view;
            } else {
                divBorderSupports = null;
            }
            if (divBorderSupports != null && divBorderSupports.getDivBorderDrawer() != null) {
                imageView.setClipToOutline(view.getClipToOutline());
                imageView.setOutlineProvider(view.getOutlineProvider());
            }
        }
    }

    private static final void replace(final View view, final View view2, Transition transition, ViewGroup viewGroup) {
        final ViewGroupOverlay overlay = viewGroup.getOverlay();
        view.setVisibility(4);
        overlay.add(view2);
        transition.addListener(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt.replace.1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                view.setTag(R.id.save_overlay_view, null);
                view.setVisibility(0);
                overlay.remove(view2);
                transition2.removeListener(this);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                overlay.remove(view2);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                if (view2.getParent() == null) {
                    overlay.add(view2);
                }
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                view.setVisibility(4);
            }
        });
    }
}
