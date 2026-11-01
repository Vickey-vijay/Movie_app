package com.inmobi.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.inmobi.ads.R;
import com.inmobi.media.C2949j5;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2949j5 extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f24586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3028m9 f24587b;

    public static Integer a(byte b10) {
        if (b10 == 0) {
            return Integer.valueOf(R.drawable.im_close_button);
        }
        if (b10 == 1) {
            return Integer.valueOf(R.drawable.im_close_transparent);
        }
        if (b10 == 2) {
            return Integer.valueOf(R.drawable.im_close_icon);
        }
        if (b10 == 3) {
            return Integer.valueOf(R.drawable.im_refresh);
        }
        if (b10 == 4) {
            return Integer.valueOf(R.drawable.im_back);
        }
        if (b10 == 5) {
            return Integer.valueOf(R.drawable.im_forward_active);
        }
        if (b10 == 6) {
            return Integer.valueOf(R.drawable.im_forward_inactive);
        }
        if (b10 == 9) {
            return Integer.valueOf(R.drawable.im_mute);
        }
        if (b10 == 10) {
            return Integer.valueOf(R.drawable.im_unmute);
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44963i, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2949j5(Context context, byte b10, InterfaceC3028m9 interfaceC3028m9) {
        super(context);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f24586a = b10;
        this.f24587b = interfaceC3028m9;
        int i10 = b10 == 0 ? 15 : (b10 == 2 || b10 == 3 || b10 == 4 || b10 == 5 || b10 == 6) ? 30 : 0;
        try {
            Integer numA = a(b10);
            if (numA == null) {
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).b("CustomView", "null drawable id while creating button - " + ((int) b10));
                    return;
                }
                return;
            }
            a(numA.intValue(), i10, i10, i10, i10);
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).c("CustomView", "new customView - " + ((int) b10) + " created");
            }
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24587b;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).a("CustomView", "exception while building customView", e10);
            }
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }

    public final void a(int i10, final int i11, final int i12, final int i13, final int i14) {
        C3298x5.f25687a.getClass();
        if (!C3298x5.w()) {
            nk.j.d(A9.f22352d, null, null, new C2925i5(this, i10, i11, i12, i13, i14, null), 3, null);
        } else {
            Icon.createWithResource(getContext(), i10).loadDrawableAsync(getContext(), new Icon.OnDrawableLoadedListener() { // from class: b7.c8
                @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                public final void onDrawableLoaded(Drawable drawable) {
                    C2949j5.a(this.f4875a, i11, i12, i13, i14, drawable);
                }
            }, ((Wb) AbstractC3075o6.f24960e.getValue()).f23740a);
        }
    }

    public static final void a(C2949j5 c2949j5, int i10, int i11, int i12, int i13, Drawable drawable) {
        if (drawable == null) {
            InterfaceC3028m9 interfaceC3028m9 = c2949j5.f24587b;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("CustomView", "drawable for " + ((int) c2949j5.f24586a) + " is null");
                return;
            }
            return;
        }
        c2949j5.setImageDrawable(drawable);
        c2949j5.setPadding(i10, i11, i12, i13);
    }

    public final void a(final Drawable drawable, final int i10, final int i11, final int i12, final int i13) {
        post(new Runnable() { // from class: b7.d8
            @Override // java.lang.Runnable
            public final void run() {
                C2949j5.a(this.f4890b, drawable, i10, i11, i12, i13);
            }
        });
    }

    public static final void a(C2949j5 c2949j5, Drawable drawable, int i10, int i11, int i12, int i13) {
        c2949j5.setImageDrawable(drawable);
        c2949j5.setPadding(i10, i11, i12, i13);
    }
}
