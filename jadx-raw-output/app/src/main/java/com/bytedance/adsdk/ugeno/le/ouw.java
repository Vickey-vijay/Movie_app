package com.bytedance.adsdk.ugeno.le;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ouw<T> extends FrameLayout implements com.bytedance.adsdk.ugeno.pno.lh.yu {
    private static final Interpolator jae = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.le.ouw.1
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    public com.bytedance.adsdk.ugeno.le.ouw.ouw bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private final Runnable f10876cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f10877cf;
    private C0069ouw ex;
    public boolean fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f10878jg;
    private FrameLayout jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private int f10879ko;
    private Scroller ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f10880le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public float f10881lh;
    private int mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private final Runnable f10882od;
    public List<T> ouw;
    public int pno;
    private int qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.pno.lh f10883ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private String f10884rn;
    private int ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.le.lh f10885tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private boolean f10886th;
    public Context tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private boolean f10887vm;
    private int vpp;
    public int vt;
    public boolean yu;
    private boolean zih;
    private int zin;

    public class lh extends com.bytedance.adsdk.ugeno.pno.lh {
        public lh(Context context) {
            super(context);
        }

        @Override // com.bytedance.adsdk.ugeno.pno.lh, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!ouw.this.fkw) {
                return false;
            }
            try {
                if (ouw.this.pno != 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(ouw(motionEvent));
                ouw(motionEvent);
                return zOnInterceptTouchEvent;
            } catch (IllegalArgumentException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.pno.lh, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (!ouw.this.fkw) {
                return false;
            }
            try {
                return ouw.this.pno == 1 ? super.onTouchEvent(ouw(motionEvent)) : super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        private MotionEvent ouw(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.le.ouw$ouw, reason: collision with other inner class name */
    public class C0069ouw extends com.bytedance.adsdk.ugeno.pno.vt {
        @Override // com.bytedance.adsdk.ugeno.pno.vt
        public final int lh() {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.pno.vt
        public final int ouw() {
            if (ouw.this.f10887vm) {
                return 1024;
            }
            return ouw.this.ouw.size();
        }

        @Override // com.bytedance.adsdk.ugeno.pno.vt
        public final boolean ouw(View view, Object obj) {
            return view == obj;
        }

        public C0069ouw() {
        }

        @Override // com.bytedance.adsdk.ugeno.pno.vt
        public final Object ouw(ViewGroup viewGroup, int i10) {
            View viewOuw = ouw.this.ouw(i10, yu.ouw(ouw.this.f10887vm, i10, ouw.this.ouw.size()));
            viewGroup.addView(viewOuw);
            return viewOuw;
        }

        @Override // com.bytedance.adsdk.ugeno.pno.vt
        public final float vt() {
            if (ouw.this.f10881lh <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / ouw.this.f10881lh;
        }

        @Override // com.bytedance.adsdk.ugeno.pno.vt
        public final void ouw(ViewGroup viewGroup, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    public class vt extends Scroller {
        @Override // android.widget.Scroller
        public final void startScroll(int i10, int i11, int i12, int i13, int i14) {
            super.startScroll(i10, i11, i12, i13, ouw.this.ryl);
        }

        public vt(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public final void startScroll(int i10, int i11, int i12, int i13) {
            super.startScroll(i10, i11, i12, i13, ouw.this.ryl);
        }
    }

    public abstract View pno(int i10);

    @Override // com.bytedance.adsdk.ugeno.pno.lh.yu
    public final void tlj(int i10) {
        if (i10 == 1 && this.f10880le) {
            yu();
        }
        com.bytedance.adsdk.ugeno.le.lh lhVar = this.f10885tc;
        if (lhVar != null) {
            lhVar.ouw(this.f10887vm, i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pno.lh.yu
    public final void bly(int i10) {
        if (this.f10885tc != null) {
            int iOuw = yu.ouw(this.f10887vm, i10, this.ouw.size());
            this.f10885tc.ouw(this.f10887vm, iOuw, i10, iOuw == 0, iOuw == this.ouw.size() - 1);
        }
        if (this.yu) {
            this.bly.ouw(i10);
        }
    }

    public final void cf(int i10) {
        ouw(this.f10884rn, this.mwh, this.f10878jg, this.f10879ko);
        if (this.ex == null) {
            this.ex = new C0069ouw();
            this.f10883ra.ouw((com.bytedance.adsdk.ugeno.pno.lh.yu) this);
            this.f10883ra.setAdapter(this.ex);
        }
        if (this.f10887vm) {
            if (i10 >= 1024) {
                this.f10883ra.ouw(512, false);
                return;
            } else {
                this.f10883ra.ouw(i10, true);
                return;
            }
        }
        if (i10 < 0 || i10 >= this.ouw.size()) {
            return;
        }
        this.f10883ra.ouw(i10, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.zih) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.f10880le) {
                    lh();
                }
            } else if (action == 0) {
                yu();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final ouw fkw(int i10) {
        this.mwh = i10;
        ouw(this.f10884rn, i10, this.f10878jg, this.f10879ko);
        return this;
    }

    public com.bytedance.adsdk.ugeno.pno.vt getAdapter() {
        return this.f10883ra.getAdapter();
    }

    public int getCurrentItem() {
        return this.f10883ra.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.pno.lh getViewPager() {
        return this.f10883ra;
    }

    public final ouw<T> le(int i10) {
        this.f10878jg = i10;
        ouw(this.f10884rn, this.mwh, i10, this.f10879ko);
        return this;
    }

    public final ouw lh(int i10) {
        this.bly.setSelectedColor(i10);
        return this;
    }

    public final ouw ouw(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.bly = new com.bytedance.adsdk.ugeno.le.ouw.lh(this.tlj);
        } else {
            this.bly = new com.bytedance.adsdk.ugeno.le.ouw.vt(this.tlj);
        }
        addView(this.bly, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public final ouw ra(int i10) {
        this.f10879ko = i10;
        ouw(this.f10884rn, this.mwh, this.f10878jg, i10);
        return this;
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.le.lh lhVar) {
        this.f10885tc = lhVar;
    }

    public void setTwoItems(boolean z10) {
        this.f10886th = z10;
    }

    public final ouw vt(int i10) {
        this.f10877cf = i10;
        lh();
        return this;
    }

    public final ouw yu(int i10) {
        this.bly.setUnSelectedColor(i10);
        return this;
    }

    public ouw(Context context) {
        super(context);
        this.ouw = new CopyOnWriteArrayList();
        this.f10877cf = 2000;
        this.vt = 500;
        this.ryl = 500;
        this.mwh = 0;
        this.f10878jg = -1;
        this.f10879ko = -1;
        this.f10884rn = "normal";
        this.f10881lh = 1.0f;
        this.yu = true;
        this.zih = true;
        this.f10887vm = true;
        this.fkw = true;
        this.qbp = 0;
        this.zin = 0;
        this.vpp = 0;
        this.pno = 0;
        this.f10882od = new Runnable() { // from class: com.bytedance.adsdk.ugeno.le.ouw.2
            @Override // java.lang.Runnable
            public final void run() {
                int currentItem = ouw.this.f10883ra.getCurrentItem() + 1;
                if (ouw.this.f10887vm) {
                    if (currentItem >= 1024) {
                        ouw.this.f10883ra.ouw(512, false);
                        return;
                    } else {
                        ouw.this.f10883ra.ouw(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.pno.vt adapter = ouw.this.f10883ra.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.ouw()) {
                        ouw.this.f10883ra.ouw(0, false);
                    } else {
                        ouw.this.f10883ra.ouw(currentItem, true);
                    }
                }
            }
        };
        this.f10876cd = new Runnable() { // from class: com.bytedance.adsdk.ugeno.le.ouw.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ouw.this.zih) {
                    int currentItem = ouw.this.f10883ra.getCurrentItem() + 1;
                    if (ouw.this.f10887vm) {
                        if (currentItem >= 1024) {
                            ouw.this.f10883ra.ouw(512, false);
                        } else {
                            ouw.this.f10883ra.ouw(currentItem, true);
                        }
                        ouw ouwVar = ouw.this;
                        ouwVar.postDelayed(ouwVar.f10876cd, ouw.this.f10877cf);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.pno.vt adapter = ouw.this.f10883ra.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.ouw()) {
                            ouw.this.f10883ra.ouw(0, false);
                            ouw ouwVar2 = ouw.this;
                            ouwVar2.postDelayed(ouwVar2.f10876cd, ouw.this.f10877cf);
                        } else {
                            ouw.this.f10883ra.ouw(currentItem, true);
                            ouw ouwVar3 = ouw.this;
                            ouwVar3.postDelayed(ouwVar3.f10876cd, ouw.this.f10877cf);
                        }
                    }
                }
            }
        };
        this.tlj = context;
        this.jqy = new FrameLayout(context);
        this.f10883ra = new lh(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.jqy.addView(this.f10883ra, layoutParams);
        addView(this.jqy);
    }

    public final void lh() {
        removeCallbacks(this.f10876cd);
        postDelayed(this.f10876cd, this.f10877cf);
    }

    public final void yu() {
        removeCallbacks(this.f10876cd);
    }

    private boolean fkw() {
        return this.ouw.size() <= 2 && this.f10887vm;
    }

    public final ouw vt(boolean z10) {
        this.bly.setLoop(z10);
        if (this.f10887vm != z10) {
            int iOuw = yu.ouw(z10, this.f10883ra.getCurrentItem(), this.ouw.size());
            this.f10887vm = z10;
            C0069ouw c0069ouw = this.ex;
            if (c0069ouw != null) {
                c0069ouw.fkw();
                this.f10883ra.setCurrentItem(iOuw);
            }
        }
        return this;
    }

    public final ouw ouw(boolean z10) {
        this.zih = z10;
        lh();
        return this;
    }

    public final ouw ouw(int i10) {
        this.ryl = i10;
        if (this.ksc == null) {
            this.ksc = new vt(this.tlj, jae);
        }
        this.f10883ra.setScroller(this.ksc);
        return this;
    }

    public final ouw vt(String str) {
        this.f10884rn = str;
        ouw(str, this.mwh, this.f10878jg, this.f10879ko);
        return this;
    }

    private void ouw(String str, int i10, int i11, int i12) {
        C0069ouw c0069ouw = this.ex;
        if (c0069ouw != null) {
            c0069ouw.fkw();
        }
        this.f10883ra.setPageMargin(i10);
        if (i11 > 0 || i12 > 0) {
            if (this.pno == 1) {
                this.f10883ra.setPadding(0, i11 + i10, 0, i12 + i10);
            } else {
                this.f10883ra.setPadding(i11 + i10, 0, i12 + i10, 0);
            }
            this.jqy.setClipChildren(false);
            this.f10883ra.setClipChildren(false);
            this.f10883ra.setClipToPadding(false);
        }
        if (this.pno == 1) {
            com.bytedance.adsdk.ugeno.le.vt.yu yuVar = new com.bytedance.adsdk.ugeno.le.vt.yu();
            yuVar.ouw = str;
            this.f10883ra.ouw(true, (com.bytedance.adsdk.ugeno.pno.lh.fkw) yuVar);
            this.f10883ra.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.f10883ra.ouw(false, (com.bytedance.adsdk.ugeno.pno.lh.fkw) new com.bytedance.adsdk.ugeno.le.vt.lh());
        } else if (TextUtils.equals(str, "cube")) {
            this.f10883ra.ouw(false, (com.bytedance.adsdk.ugeno.pno.lh.fkw) new com.bytedance.adsdk.ugeno.le.vt.ouw());
        } else if (TextUtils.equals(str, "fade")) {
            this.f10883ra.ouw(false, (com.bytedance.adsdk.ugeno.pno.lh.fkw) new com.bytedance.adsdk.ugeno.le.vt.vt());
        } else {
            this.f10883ra.ouw(false, (com.bytedance.adsdk.ugeno.pno.lh.fkw) null);
        }
        this.f10883ra.setOffscreenPageLimit((int) this.f10881lh);
    }

    public final void vt() {
        yu();
        if (this.ex != null) {
            List<com.bytedance.adsdk.ugeno.pno.lh.yu> list = this.f10883ra.fkw;
            if (list != null) {
                list.remove(this);
            }
            this.f10883ra.setAdapter(null);
            this.ex = null;
            this.f10883ra.removeAllViews();
            this.ouw.clear();
            com.bytedance.adsdk.ugeno.le.ouw.ouw ouwVar = this.bly;
            ouwVar.ouw.clear();
            ouwVar.removeAllViews();
        }
    }

    public final void ouw() {
        int i10;
        ouw(this.f10884rn, this.mwh, this.f10878jg, this.f10879ko);
        if (this.ex == null) {
            this.ex = new C0069ouw();
            this.f10883ra.ouw((com.bytedance.adsdk.ugeno.pno.lh.yu) this);
            this.f10883ra.setAdapter(this.ex);
        }
        int i11 = this.qbp;
        if (i11 < 0 || i11 >= this.ouw.size()) {
            this.qbp = 0;
        }
        if (this.f10887vm) {
            i10 = this.qbp + 512;
        } else {
            i10 = this.qbp;
        }
        this.f10883ra.ouw(i10, true);
        if (!this.f10887vm) {
            bly(i10);
        }
        if (this.zih) {
            lh();
        }
    }

    public final View ouw(int i10, int i11) {
        if (this.ouw.size() == 0) {
            return new View(getContext());
        }
        View viewPno = pno(i11);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewPno instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (fkw()) {
            viewPno.setTag("two_items_tag");
        }
        if (viewPno.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewPno.getParent()).removeView(viewPno);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewPno, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (fkw()) {
            frameLayout.setTag(Integer.valueOf(i10));
        }
        return frameLayout;
    }

    public final ouw<T> ouw(T t10) {
        if (t10 != null) {
            this.ouw.add(t10);
            if (this.yu) {
                this.bly.ouw();
            }
        }
        C0069ouw c0069ouw = this.ex;
        if (c0069ouw != null) {
            c0069ouw.fkw();
            com.bytedance.adsdk.ugeno.le.ouw.ouw ouwVar = this.bly;
            int i10 = this.qbp;
            int currentItem = this.f10883ra.getCurrentItem();
            Iterator<View> it = ouwVar.ouw.iterator();
            while (it.hasNext()) {
                it.next().setBackground(ouwVar.vt(ouwVar.f10890lh));
            }
            if (i10 < 0 || i10 >= ouwVar.ouw.size()) {
                i10 = 0;
            }
            if (ouwVar.ouw.size() > 0) {
                ouwVar.ouw.get(i10).setBackground(ouwVar.vt(ouwVar.vt));
                ouwVar.f10891ra = currentItem;
            }
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.pno.lh.yu
    public final void ouw(int i10, float f10, int i11) {
        com.bytedance.adsdk.ugeno.le.lh lhVar = this.f10885tc;
        if (lhVar != null) {
            boolean z10 = this.f10887vm;
            lhVar.ouw(z10, yu.ouw(z10, i10, this.ouw.size()), f10, i11);
        }
        if (fkw()) {
            ouw(i10, findViewWithTag(Integer.valueOf(i10)));
            if (f10 > 0.0f) {
                int i12 = i10 + 1;
                ouw(i12, findViewWithTag(Integer.valueOf(i12)));
            }
        }
    }

    private void ouw(int i10, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t10 = this.ouw.get(yu.ouw(true, i10, this.ouw.size()));
            if (t10 == null) {
                return;
            }
            if (t10 instanceof com.bytedance.adsdk.ugeno.vt.lh) {
                viewFindViewWithTag = ((com.bytedance.adsdk.ugeno.vt.lh) t10).fkw;
            } else if (t10 instanceof View) {
                viewFindViewWithTag = (T) t10;
            }
            if (viewFindViewWithTag == null) {
                return;
            }
            if (viewFindViewWithTag.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewFindViewWithTag.getParent()).removeView(viewFindViewWithTag);
            }
            ((ViewGroup) view).addView(viewFindViewWithTag);
        }
    }
}
