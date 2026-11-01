package sg.bigo.ads.core.mraid.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Drawable f71580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f71581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private b f71582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private EnumC0740a f71583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f71584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f71585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f71586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f71587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f71588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f71589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f71590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Rect f71591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f71592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private c f71593n;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.a.a$a, reason: collision with other inner class name */
    public enum EnumC0740a {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f71602h;

        EnumC0740a(int i10) {
            this.f71602h = i10;
        }
    }

    public interface b {
        void a();
    }

    public final class c implements Runnable {
        private c() {
        }

        public /* synthetic */ c(a aVar, byte b10) {
            this();
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.setClosePressed(false);
        }
    }

    public a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    private a(@NonNull Context context, byte b10) {
        super(context, null, 0);
        this.f71588i = new Rect();
        this.f71589j = new Rect();
        this.f71590k = new Rect();
        this.f71591l = new Rect();
        Drawable drawableA = sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close);
        this.f71580a = drawableA;
        this.f71583d = EnumC0740a.TOP_RIGHT;
        drawableA.setState(FrameLayout.EMPTY_STATE_SET);
        drawableA.setCallback(this);
        this.f71581b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f71584e = e.a(context, 50);
        this.f71585f = e.a(context, 30);
        this.f71586g = e.a(context, 8);
        setWillNotDraw(false);
        this.f71592m = true;
    }

    private static void a(EnumC0740a enumC0740a, int i10, Rect rect, Rect rect2) {
        Gravity.apply(enumC0740a.f71602h, i10, i10, rect, rect2);
    }

    @VisibleForTesting
    private boolean a() {
        return this.f71580a.getState() == FrameLayout.SELECTED_STATE_SET;
    }

    @VisibleForTesting
    private boolean a(int i10, int i11, int i12) {
        Rect rect = this.f71589j;
        return i10 >= rect.left - i12 && i11 >= rect.top - i12 && i10 < rect.right + i12 && i11 < rect.bottom + i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosePressed(boolean z10) {
        if (z10 == a()) {
            return;
        }
        this.f71580a.setState(z10 ? FrameLayout.SELECTED_STATE_SET : FrameLayout.EMPTY_STATE_SET);
        invalidate(this.f71589j);
    }

    public final void a(EnumC0740a enumC0740a, Rect rect, Rect rect2) {
        a(enumC0740a, this.f71584e, rect, rect2);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f71587h) {
            this.f71587h = false;
            this.f71588i.set(0, 0, getWidth(), getHeight());
            a(this.f71583d, this.f71588i, this.f71589j);
            this.f71591l.set(this.f71589j);
            Rect rect = this.f71591l;
            int i10 = this.f71586g;
            rect.inset(i10, i10);
            a(this.f71583d, this.f71585f, this.f71591l, this.f71590k);
            this.f71580a.setBounds(this.f71590k);
        }
        if (this.f71580a.isVisible()) {
            this.f71580a.draw(canvas);
        }
    }

    @VisibleForTesting
    public final Rect getCloseBounds() {
        return this.f71589j;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f71587h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        byte b10 = 0;
        if (a((int) motionEvent.getX(), (int) motionEvent.getY(), this.f71581b)) {
            if (this.f71592m || this.f71580a.isVisible()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setClosePressed(true);
                } else if (action != 1) {
                    if (action == 3) {
                        setClosePressed(false);
                    }
                } else if (a()) {
                    if (this.f71593n == null) {
                        this.f71593n = new c(this, b10);
                    }
                    postDelayed(this.f71593n, ViewConfiguration.getPressedStateDuration());
                    playSoundEffect(0);
                    b bVar = this.f71582c;
                    if (bVar != null) {
                        bVar.a();
                    }
                }
                return true;
            }
        }
        setClosePressed(false);
        super.onTouchEvent(motionEvent);
        return false;
    }

    public final void setCloseAlwaysInteractable(boolean z10) {
        this.f71592m = z10;
    }

    @VisibleForTesting
    public final void setCloseBoundChanged(boolean z10) {
        this.f71587h = z10;
    }

    @VisibleForTesting
    public final void setCloseBounds(Rect rect) {
        this.f71589j.set(rect);
    }

    public final void setClosePosition(@NonNull EnumC0740a enumC0740a) {
        this.f71583d = enumC0740a;
        this.f71587h = true;
        invalidate();
    }

    public final void setCloseVisible(boolean z10) {
        if (this.f71580a.setVisible(z10, false)) {
            invalidate(this.f71589j);
        }
    }

    public final void setOnCloseListener(@Nullable b bVar) {
        this.f71582c = bVar;
    }
}
