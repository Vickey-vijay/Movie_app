package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.inmobi.media.Nh;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes6.dex */
public final class Nh extends Kh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC2785ci f23250b;

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void a() {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f23250b;
        if (gestureDetectorOnGestureListenerC2785ci.R == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = gestureDetectorOnGestureListenerC2785ci.S;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = this.f23250b;
        gestureDetectorOnGestureListenerC2785ci2.S = null;
        View view = gestureDetectorOnGestureListenerC2785ci2.R;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.f23250b.R;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f23250b.R);
            }
            this.f23250b.R = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nh(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        super(gestureDetectorOnGestureListenerC2785ci);
        this.f23250b = gestureDetectorOnGestureListenerC2785ci;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(customViewCallback, "callback");
        if (this.f23250b.f24186u.get() != null) {
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = this.f23250b;
            gestureDetectorOnGestureListenerC2785ci.R = view;
            gestureDetectorOnGestureListenerC2785ci.S = customViewCallback;
            if (view != null) {
                view.setOnTouchListener(new View.OnTouchListener() { // from class: b7.p3
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        return Nh.a(view2, motionEvent);
                    }
                });
            }
            Activity activity = (Activity) this.f23250b.f24186u.get();
            FrameLayout frameLayout = activity != null ? (FrameLayout) activity.findViewById(R.id.content) : null;
            View view2 = this.f23250b.R;
            if (view2 != null) {
                view2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f23250b.R, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.f23250b.R;
            if (view3 != null) {
                view3.requestFocus();
            }
            final GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci2 = this.f23250b;
            View view4 = gestureDetectorOnGestureListenerC2785ci2.R;
            View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: b7.q3
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view5, int i10, KeyEvent keyEvent) {
                    return Nh.a(gestureDetectorOnGestureListenerC2785ci2, this, view5, i10, keyEvent);
                }
            };
            if (view4 != null) {
                view4.setOnKeyListener(onKeyListener);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    public static final boolean a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, Nh nh2, View view, int i10, KeyEvent keyEvent) {
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        InterfaceC3028m9 interfaceC3028m9 = gestureDetectorOnGestureListenerC2785ci.f24162i;
        if (interfaceC3028m9 != null) {
            String str = GestureDetectorOnGestureListenerC2785ci.f24141g1;
            ck.p.i(str, "access$getTAG$cp(...)");
            ((C3053n9) interfaceC3028m9).a(str, "Back pressed when HTML5 video is playing.");
        }
        nh2.a();
        return true;
    }
}
