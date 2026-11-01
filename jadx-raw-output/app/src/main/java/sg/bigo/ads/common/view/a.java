package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f70213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f70214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractRunnableC0719a f70215c;

    /* JADX INFO: renamed from: sg.bigo.ads.common.view.a$a, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC0719a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f70217b;

        private AbstractRunnableC0719a() {
        }

        public /* synthetic */ AbstractRunnableC0719a(byte b10) {
            this();
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            if (this.f70217b) {
                return;
            }
            a();
        }
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f70213a = 3000;
        this.f70214b = false;
    }

    private synchronized void a(boolean z10) {
        AbstractRunnableC0719a abstractRunnableC0719a = this.f70215c;
        if (abstractRunnableC0719a != null) {
            abstractRunnableC0719a.f70217b = true;
            this.f70215c = null;
        }
        if (z10) {
            AbstractRunnableC0719a abstractRunnableC0719a2 = new AbstractRunnableC0719a() { // from class: sg.bigo.ads.common.view.a.1
                @Override // sg.bigo.ads.common.view.a.AbstractRunnableC0719a
                public final void a() {
                    if (a.this.f70214b && a.this.b() && u.c(a.this) && sg.bigo.ads.common.ab.a.a(a.this, new Rect())) {
                        a.this.a();
                    }
                    a aVar = a.this;
                    aVar.postDelayed(this, aVar.f70213a);
                }
            };
            this.f70215c = abstractRunnableC0719a2;
            postDelayed(abstractRunnableC0719a2, this.f70213a);
        }
    }

    public abstract void a();

    public abstract boolean b();

    public final void c() {
        if (this.f70214b) {
            return;
        }
        this.f70214b = true;
        a(true);
    }

    public final void d() {
        this.f70214b = false;
        a(false);
    }

    public int getFlipInterval() {
        return this.f70213a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    public void setFlipInterval(@IntRange(from = 0) int i10) {
        this.f70213a = i10;
    }
}
