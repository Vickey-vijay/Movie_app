package io.bidmachine.rendering.internal.view.privacy;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.widget.FrameLayout;
import ck.p;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.util.UtilsKt;
import kotlin.jvm.internal.Lambda;
import mj.g;
import mj.r;

/* JADX INFO: loaded from: classes.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f60635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bk.a f60636b;

    public static final class a extends Lambda implements bk.a {
        public a() {
            super(0);
        }

        public final void a() {
            b.this.getOnCloseClickListener().invoke();
        }

        @Override // bk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.view.privacy.b$b, reason: collision with other inner class name */
    public static final class C0539b extends Lambda implements bk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0539b f60638a = new C0539b();

        public C0539b() {
            super(0);
        }

        public final void a() {
        }

        @Override // bk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return r.f64562a;
        }
    }

    public static final class c extends Lambda implements bk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f60639a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.f60639a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View view) {
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final io.bidmachine.rendering.internal.view.privacy.c invoke() {
            io.bidmachine.rendering.internal.view.privacy.c cVar = new io.bidmachine.rendering.internal.view.privacy.c(this.f60639a);
            cVar.setOnClickListener(new View.OnClickListener() { // from class: io.bidmachine.rendering.internal.view.privacy.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.c.a(view);
                }
            });
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.f60635a = kotlin.b.a(new c(context));
        this.f60636b = C0539b.f60638a;
        setOnClickListener(new View.OnClickListener() { // from class: bi.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io.bidmachine.rendering.internal.view.privacy.b.a(this.f5355b, view);
            }
        });
        io.bidmachine.rendering.internal.view.privacy.c privacySheetView = getPrivacySheetView();
        privacySheetView.setOnCloseButtonClickListener(new a());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        r rVar = r.f64562a;
        addView(privacySheetView, layoutParams);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(b bVar, View view) {
        p.j(bVar, "this$0");
        bVar.f60636b.invoke();
    }

    private final void b() {
        final int paddingBottom = getPrivacySheetView().getPaddingBottom();
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: bi.a
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return io.bidmachine.rendering.internal.view.privacy.b.a(this.f5353a, paddingBottom, view, windowInsets);
            }
        });
    }

    private final io.bidmachine.rendering.internal.view.privacy.c getPrivacySheetView() {
        return (io.bidmachine.rendering.internal.view.privacy.c) this.f60635a.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final bk.a<r> getOnCloseClickListener() {
        return this.f60636b;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        p.j(view, "child");
        int size = View.MeasureSpec.getSize(i10);
        Context context = getContext();
        p.i(context, GAMConfig.KEY_CONTEXT);
        int iDpToPx = UtilsKt.dpToPx(context, 600.0f);
        Context context2 = getContext();
        p.i(context2, GAMConfig.KEY_CONTEXT);
        if (size >= UtilsKt.dpToPx(context2, 32.0f) + iDpToPx) {
            i10 = View.MeasureSpec.makeMeasureSpec(iDpToPx, 1073741824);
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setOnCloseClickListener(bk.a<r> aVar) {
        p.j(aVar, "<set-?>");
        this.f60636b = aVar;
    }

    public final void setSubtitle(String str) {
        p.j(str, "subtitle");
        getPrivacySheetView().setSubtitle(str);
    }

    public final void setTitle(String str) {
        p.j(str, "title");
        getPrivacySheetView().setTitle(str);
    }

    public final void a(String str, Drawable drawable, bk.a aVar) {
        p.j(str, "title");
        p.j(aVar, "clickListener");
        getPrivacySheetView().a(str, drawable, aVar);
    }

    public final void a() {
        getPrivacySheetView().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets a(b bVar, int i10, View view, WindowInsets windowInsets) {
        Rect rect;
        p.j(bVar, "this$0");
        p.j(view, "<anonymous parameter 0>");
        p.j(windowInsets, "insets");
        if (Build.VERSION.SDK_INT >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets$Type.systemBars());
            rect = new Rect(insets.left, insets.top, insets.right, insets.bottom);
        } else {
            rect = new Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        bVar.getPrivacySheetView().setPadding(bVar.getPrivacySheetView().getPaddingLeft(), bVar.getPrivacySheetView().getPaddingTop(), bVar.getPrivacySheetView().getPaddingRight(), i10 + rect.bottom);
        bVar.setPadding(0, rect.top, 0, 0);
        return windowInsets;
    }
}
