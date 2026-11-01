package io.bidmachine.rendering.internal.view.privacy;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ck.p;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.R;
import io.bidmachine.util.UtilsKt;
import kotlin.jvm.internal.Lambda;
import mj.g;
import mj.r;

/* JADX INFO: loaded from: classes.dex */
public final class c extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f60640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f60641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f60642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f60643d;

    public static final class a extends Lambda implements bk.a {
        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayout invoke() {
            return (LinearLayout) c.this.findViewById(R.id.bmPrivacySheetActionButtonsContainer);
        }
    }

    public static final class b extends Lambda implements bk.a {
        public b() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            return c.this.findViewById(R.id.bmPrivacySheetClose);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.view.privacy.c$c, reason: collision with other inner class name */
    public static final class C0540c extends Lambda implements bk.a {
        public C0540c() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) c.this.findViewById(R.id.bmPrivacySheetSubtitle);
        }
    }

    public static final class d extends Lambda implements bk.a {
        public d() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) c.this.findViewById(R.id.bmPrivacySheetTitle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.f60640a = kotlin.b.a(new d());
        this.f60641b = kotlin.b.a(new C0540c());
        this.f60642c = kotlin.b.a(new b());
        this.f60643d = kotlin.b.a(new a());
        View.inflate(context, R.layout.bm_privacy_sheet, this);
        setOrientation(1);
        setBackgroundResource(R.drawable.bm_bg_privacy_sheet);
        int iDpToPx = UtilsKt.dpToPx(context, 16.0f);
        setPadding(iDpToPx, iDpToPx, iDpToPx, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(bk.a aVar, View view) {
        p.j(aVar, "$clickListener");
        aVar.invoke();
    }

    private final LinearLayout getActionButtonsContainer() {
        Object value = this.f60643d.getValue();
        p.i(value, "<get-actionButtonsContainer>(...)");
        return (LinearLayout) value;
    }

    private final View getCloseButton() {
        Object value = this.f60642c.getValue();
        p.i(value, "<get-closeButton>(...)");
        return (View) value;
    }

    private final TextView getSubtitleTextView() {
        Object value = this.f60641b.getValue();
        p.i(value, "<get-subtitleTextView>(...)");
        return (TextView) value;
    }

    private final TextView getTitleTextView() {
        Object value = this.f60640a.getValue();
        p.i(value, "<get-titleTextView>(...)");
        return (TextView) value;
    }

    public final void a(String str, Drawable drawable, final bk.a aVar) {
        p.j(str, "title");
        p.j(aVar, "clickListener");
        LinearLayout actionButtonsContainer = getActionButtonsContainer();
        Context context = getContext();
        p.i(context, GAMConfig.KEY_CONTEXT);
        io.bidmachine.rendering.internal.view.privacy.a aVar2 = new io.bidmachine.rendering.internal.view.privacy.a(context);
        aVar2.setText(str);
        aVar2.setActionIcon(drawable);
        aVar2.setOnClickListener(new View.OnClickListener() { // from class: bi.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io.bidmachine.rendering.internal.view.privacy.c.a(aVar, view);
            }
        });
        actionButtonsContainer.addView(aVar2, -1, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setOnCloseButtonClickListener(final bk.a<r> aVar) {
        p.j(aVar, "clickListener");
        getCloseButton().setOnClickListener(new View.OnClickListener() { // from class: bi.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                io.bidmachine.rendering.internal.view.privacy.c.b(aVar, view);
            }
        });
    }

    public final void setSubtitle(String str) {
        p.j(str, "subtitle");
        getSubtitleTextView().setText(str);
    }

    public final void setTitle(String str) {
        p.j(str, "title");
        getTitleTextView().setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bk.a aVar, View view) {
        p.j(aVar, "$clickListener");
        aVar.invoke();
    }

    public final void a() {
        getActionButtonsContainer().removeAllViews();
    }
}
