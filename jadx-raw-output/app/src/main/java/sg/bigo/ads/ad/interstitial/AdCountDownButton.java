package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.timepicker.TimeModel;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public class AdCountDownButton extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f67719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.common.utils.n f67720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f67721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f67723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f67724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f67725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f67726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f67727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f67728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f67729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f67730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @LayoutRes
    private int f67731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f67732n;

    public interface a {
        void a();

        void a(Rect rect);
    }

    public interface b {
        void a();
    }

    public AdCountDownButton(@NonNull Context context) {
        this(context, null);
    }

    public AdCountDownButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdCountDownButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f67721c = true;
        this.f67727i = false;
        this.f67728j = false;
        this.f67729k = false;
        this.f67723e = false;
        this.f67719a = context;
        setClickable(true);
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.AdCountDownButton);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AdCountDownButton_bigo_ad_customLayout, 0);
            typedArrayObtainStyledAttributes.recycle();
            sg.bigo.ads.common.utils.a.a(context, resourceId, this, true);
            this.f67731m = resourceId;
            this.f67724f = findViewById(R.id.bigo_ad_btn_close);
            this.f67725g = findViewById(R.id.inter_view_stroke);
            this.f67726h = (TextView) findViewById(R.id.inter_text_countdown);
        } catch (Throwable th2) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j10) {
        if (j10 > 0 && j10 <= 1000) {
            j10 = 1000;
        }
        TextView textView = this.f67726h;
        if (textView == null) {
            return;
        }
        if (!this.f67729k) {
            StringBuilder sb2 = new StringBuilder(TimeModel.NUMBER_FORMAT);
            sb2.append(this.f67728j ? "s" : "");
            textView.setText(sg.bigo.ads.common.utils.q.a(sb2.toString(), Integer.valueOf(Math.round(j10 / 1000.0f))));
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sg.bigo.ads.common.utils.a.a(this.f67719a, R.string.bigo_ad_splash_skip_after, new Object[0]));
            sb3.append(" %d");
            sb3.append(this.f67728j ? "s" : "");
            this.f67726h.setText(sg.bigo.ads.common.utils.q.a(sb3.toString(), Integer.valueOf(Math.round(j10 / 1000.0f))));
        }
    }

    public static /* synthetic */ boolean b(AdCountDownButton adCountDownButton) {
        adCountDownButton.f67721c = true;
        return true;
    }

    private void h() {
        this.f67724f.setVisibility(0);
        this.f67724f.setAlpha(0.2f);
        this.f67724f.setClickable(false);
    }

    public final void a(@LayoutRes int i10) {
        if (this.f67731m != i10) {
            this.f67731m = i10;
            View view = this.f67724f;
            int visibility = view != null ? view.getVisibility() : 8;
            View view2 = this.f67725g;
            int visibility2 = view2 != null ? view2.getVisibility() : 8;
            TextView textView = this.f67726h;
            int visibility3 = textView != null ? textView.getVisibility() : 8;
            removeAllViews();
            sg.bigo.ads.common.utils.a.a(this.f67719a, i10, this, true);
            this.f67724f = findViewById(R.id.bigo_ad_btn_close);
            this.f67725g = findViewById(R.id.inter_view_stroke);
            this.f67726h = (TextView) findViewById(R.id.inter_text_countdown);
            View view3 = this.f67724f;
            if (view3 != null) {
                view3.setVisibility(visibility);
            }
            View view4 = this.f67725g;
            if (view4 != null) {
                view4.setVisibility(visibility2);
            }
            TextView textView2 = this.f67726h;
            if (textView2 != null) {
                textView2.setVisibility(visibility3);
            }
            setOnCloseListener(this.f67732n);
        }
    }

    public final void a(int i10, @Nullable final b bVar) {
        this.f67726h.setVisibility(0);
        this.f67725g.setVisibility(8);
        this.f67724f.setVisibility(8);
        if (this.f67727i) {
            this.f67725g.setVisibility(0);
            h();
        }
        if (i10 == 0) {
            a(this.f67722d);
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        this.f67721c = false;
        if (i10 < 0) {
            return;
        }
        sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(((long) i10) * 1000) { // from class: sg.bigo.ads.ad.interstitial.AdCountDownButton.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                AdCountDownButton adCountDownButton = AdCountDownButton.this;
                adCountDownButton.a(adCountDownButton.f67722d);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a();
                }
                AdCountDownButton.b(AdCountDownButton.this);
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
                AdCountDownButton.this.f67730l = j10;
                if (AdCountDownButton.this.f67722d) {
                    return;
                }
                AdCountDownButton.this.b(j10);
            }
        };
        this.f67720b = nVar;
        nVar.c();
    }

    public final void a(long j10) {
        if (this.f67722d) {
            b(j10);
        }
    }

    public final void a(boolean z10) {
        View view;
        View view2;
        f();
        int i10 = 0;
        if (!this.f67729k) {
            this.f67726h.setVisibility(z10 ? 0 : 8);
            view = this.f67725g;
            if (!z10) {
                view2 = view;
            }
            view.setVisibility(i10);
        }
        this.f67726h.setVisibility(8);
        view2 = this.f67725g;
        view = view2;
        i10 = 8;
        view.setVisibility(i10);
    }

    public final boolean a() {
        View view = this.f67724f;
        return view != null && view.performClick();
    }

    public final void b() {
        sg.bigo.ads.common.utils.n nVar = this.f67720b;
        if (nVar != null) {
            nVar.d();
        }
    }

    public final void b(int i10, @Nullable b bVar) {
        sg.bigo.ads.common.utils.n nVar = this.f67720b;
        if (nVar != null) {
            nVar.b();
            this.f67720b = null;
            a(i10, bVar);
        }
    }

    public final void b(boolean z10) {
        this.f67729k = z10;
        this.f67725g.setVisibility(z10 ? 8 : 0);
        this.f67724f.setVisibility(z10 ? 8 : 0);
        setShowCloseButtonInCountdown(!z10);
    }

    public final void c() {
        sg.bigo.ads.common.utils.n nVar = this.f67720b;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.f67720b.c();
    }

    public final void d() {
        sg.bigo.ads.common.utils.n nVar = this.f67720b;
        if (nVar != null) {
            nVar.b();
        }
    }

    public final void e() {
        sg.bigo.ads.common.utils.n nVar = this.f67720b;
        if (nVar != null) {
            nVar.b();
        }
        this.f67721c = true;
        a(false);
    }

    public final void f() {
        this.f67724f.setVisibility(0);
        this.f67724f.setClickable(true);
        this.f67724f.setAlpha(1.0f);
    }

    public final void g() {
        this.f67726h.setVisibility(0);
        this.f67725g.setVisibility(0);
        h();
    }

    public View getCloseView() {
        return this.f67724f;
    }

    public long getMillisUntilFinished() {
        return this.f67730l;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f67721c) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBtnClickArea(int i10) {
        CustomTouchImageView customTouchImageView;
        float f10;
        View view = this.f67724f;
        if (view instanceof CustomTouchImageView) {
            if (i10 == 1) {
                customTouchImageView = (CustomTouchImageView) view;
                f10 = 0.5f;
            } else {
                if (i10 != 2) {
                    return;
                }
                customTouchImageView = (CustomTouchImageView) view;
                f10 = 0.25f;
            }
            customTouchImageView.setRegionScale(f10);
        }
    }

    public void setCloseImageResource(@DrawableRes int i10) {
        View view = this.f67724f;
        if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(i10);
        }
    }

    public void setOnCloseListener(@Nullable final a aVar) {
        View view = this.f67724f;
        if (view == null) {
            return;
        }
        this.f67732n = aVar;
        if (aVar == null) {
            view.setOnTouchListener(null);
        } else if (view instanceof CustomTouchImageView) {
            ((CustomTouchImageView) view).setCloseListener(aVar);
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.AdCountDownButton.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    aVar.a();
                }
            });
        }
    }

    public void setShowCloseButtonInCountdown(boolean z10) {
        this.f67727i = z10;
        TextView textView = this.f67726h;
        if (textView == null) {
            return;
        }
        if (z10) {
            textView.setPadding(sg.bigo.ads.common.utils.e.a(getContext(), 2), 0, 0, 0);
        } else {
            textView.setPadding(0, 0, 0, 0);
        }
    }

    public void setTakeoverTickEvent(boolean z10) {
        this.f67722d = z10;
    }

    public void setWithUnit(boolean z10) {
        this.f67728j = z10;
    }
}
