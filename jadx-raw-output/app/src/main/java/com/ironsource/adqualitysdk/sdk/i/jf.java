package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jf {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2778 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2779 = 44872;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2780 = 35226;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2781 = 2534;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2782 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2783 = 9474;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static jf f2784;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private jl f2785;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<RelativeLayout, Object> f2787 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ii f2786 = new ii(-1, -1, -1, -1);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ View.OnLayoutChangeListener m2646(jf jfVar, ViewGroup viewGroup) {
        int i10 = f2778 + 45;
        f2782 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return jfVar.m2655(viewGroup);
        }
        jfVar.m2655(viewGroup);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ViewGroup m2653(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i10 = f2782 + 49;
        f2778 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 23 : 'S') != 'S') {
            m2647(viewGroup, viewGroup2);
            throw null;
        }
        ViewGroup viewGroupM2647 = m2647(viewGroup, viewGroup2);
        int i11 = f2782 + 83;
        f2778 = i11 % 128;
        if ((i11 % 2 == 0 ? ']' : 'X') == 'X') {
            return viewGroupM2647;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m2658(jf jfVar, MotionEvent motionEvent) {
        int i10 = f2782 + 17;
        f2778 = i10 % 128;
        int i11 = i10 % 2;
        jfVar.m2649(motionEvent);
        int i12 = f2778 + 77;
        f2782 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2661(jf jfVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i10 = f2782 + 41;
        f2778 = i10 % 128;
        int i11 = i10 % 2;
        jfVar.m2659(viewGroup, onLayoutChangeListener);
        int i12 = f2782 + 81;
        f2778 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 24 : '$') != 24) {
            return;
        }
        int i13 = 26 / 0;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2662() {
        int i10 = f2778 + 87;
        f2782 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f2785 == null) {
            this.f2785 = new jl() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.2
                @Override // com.ironsource.adqualitysdk.sdk.i.jl
                /* JADX INFO: renamed from: ﻐ */
                public final void mo285(View view) {
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.jl
                /* JADX INFO: renamed from: ﻛ */
                public final void mo289(View view) {
                    if (!s.m2951().m2978()) {
                        if (view instanceof ViewGroup) {
                            ViewGroup viewGroupM2653 = (ViewGroup) view;
                            if (viewGroupM2653.getContext() instanceof Activity) {
                                viewGroupM2653 = jf.m2653(viewGroupM2653, (ViewGroup) ((Activity) viewGroupM2653.getContext()).findViewById(R.id.content));
                            }
                            jf jfVar = jf.this;
                            jf.m2661(jfVar, viewGroupM2653, jf.m2646(jfVar, viewGroupM2653));
                            return;
                        }
                        return;
                    }
                    jf.this.m2664();
                }
            };
            ji.m2667().m2674(this.f2785);
            int i11 = f2782 + 31;
            f2778 = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2650(View view, hh.c cVar) {
        int i10 = f2778 + 27;
        f2782 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m2654(view, cVar);
        if (z10) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized jf m2656() {
        int i10 = f2778 + 73;
        f2782 = i10 % 128;
        int i11 = i10 % 2;
        if (f2784 == null) {
            f2784 = new jf();
        }
        jf jfVar = f2784;
        int i12 = f2778 + 97;
        f2782 = i12 % 128;
        if (i12 % 2 == 0) {
            return jfVar;
        }
        int i13 = 86 / 0;
        return jfVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized ii m2663() {
        ii iiVar;
        int i10 = f2782 + 59;
        int i11 = i10 % 128;
        f2778 = i11;
        if ((i10 % 2 == 0 ? 'T' : '(') != 'T') {
            iiVar = this.f2786;
        } else {
            iiVar = this.f2786;
            int i12 = 6 / 0;
        }
        int i13 = i11 + 9;
        f2782 = i13 % 128;
        if ((i13 % 2 != 0 ? ')' : (char) 28) == ')') {
            throw null;
        }
        return iiVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2664() {
        if ((this.f2785 != null ? '*' : (char) 20) == '*') {
            int i10 = f2778 + 9;
            f2782 = i10 % 128;
            if ((i10 % 2 != 0 ? (char) 21 : ' ') == 21) {
                this.f2787.keySet().iterator();
                throw null;
            }
            for (RelativeLayout relativeLayout : this.f2787.keySet()) {
                int i11 = f2782 + 29;
                f2778 = i11 % 128;
                int i12 = i11 % 2;
                ViewParent parent = relativeLayout.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(relativeLayout);
                }
            }
            this.f2787.clear();
            ji.m2667().m2675(this.f2785);
            this.f2785 = null;
        }
    }

    private jf() {
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2651(jf jfVar, ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i10 = f2782 + 17;
        f2778 = i10 % 128;
        int i11 = i10 % 2;
        jfVar.m2657(viewGroup, onLayoutChangeListener);
        int i12 = f2782 + 7;
        f2778 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2654(View view, hh.c cVar) {
        int i10 = f2778 + 9;
        f2782 = i10 % 128;
        char c10 = i10 % 2 != 0 ? 'I' : '#';
        ju.m2745(view, cVar);
        if (c10 != '#') {
            int i11 = 20 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2652(jf jfVar, ii iiVar) {
        int i10 = f2782 + 65;
        f2778 = i10 % 128;
        int i11 = i10 % 2;
        jfVar.m2660(iiVar);
        int i12 = f2782 + 83;
        f2778 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        if ((r7 == null ? '%' : 29) != '%') goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r7 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        r0 = r0 + 111;
        com.ironsource.adqualitysdk.sdk.i.jf.f2782 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r7 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        r1 = r7.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r1 != r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        r4 = com.ironsource.G5.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        r4 = '\\';
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        if (r4 == '\\') goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0039, code lost:
    
        r6 = com.ironsource.adqualitysdk.sdk.i.jf.f2782 + 117;
        com.ironsource.adqualitysdk.sdk.i.jf.f2778 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if ((r6 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        if (r0 != r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        if ((r1 instanceof android.view.ViewGroup) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0056, code lost:
    
        r0 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        r0 = '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005a, code lost:
    
        if (r0 == '@') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005c, code lost:
    
        r0 = r7;
        r7 = (android.view.ViewGroup) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        return r7;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.view.ViewGroup m2647(android.view.ViewGroup r6, android.view.ViewGroup r7) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.jf.f2778
            int r1 = r0 + 95
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.jf.f2782 = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L1d
            r1 = 38
            int r1 = r1 / r2
            r1 = 37
            if (r7 != 0) goto L16
            r3 = r1
            goto L18
        L16:
            r3 = 29
        L18:
            if (r3 == r1) goto L1f
            goto L28
        L1b:
            r6 = move-exception
            throw r6
        L1d:
            if (r7 != 0) goto L28
        L1f:
            int r0 = r0 + 111
            int r7 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jf.f2782 = r7
            int r0 = r0 % 2
            return r6
        L28:
            r0 = r7
        L29:
            if (r7 == 0) goto L63
            android.view.ViewParent r1 = r7.getParent()
            r3 = 92
            if (r1 != r6) goto L36
            r4 = 61
            goto L37
        L36:
            r4 = r3
        L37:
            if (r4 == r3) goto L50
            int r6 = com.ironsource.adqualitysdk.sdk.i.jf.f2782
            int r6 = r6 + 117
            int r1 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.jf.f2778 = r1
            int r6 = r6 % 2
            if (r6 == 0) goto L4c
            if (r0 != r7) goto L48
            r2 = 1
        L48:
            if (r2 == 0) goto L4b
            return r7
        L4b:
            return r0
        L4c:
            r6 = 0
            throw r6     // Catch: java.lang.Throwable -> L4e
        L4e:
            r6 = move-exception
            throw r6
        L50:
            boolean r0 = r1 instanceof android.view.ViewGroup
            r3 = 64
            if (r0 == 0) goto L59
            r0 = 17
            goto L5a
        L59:
            r0 = r3
        L5a:
            if (r0 == r3) goto L63
            r0 = r1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5 = r0
            r0 = r7
            r7 = r5
            goto L29
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jf.m2647(android.view.ViewGroup, android.view.ViewGroup):android.view.ViewGroup");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private View.OnLayoutChangeListener m2655(final ViewGroup viewGroup) {
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.3

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2798 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f2799 = 181;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f2800 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m2666(String str, int i10, boolean z10, int i11, int i12) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (b.f706) {
                    char[] cArr2 = new char[i10];
                    b.f704 = 0;
                    while (true) {
                        int i13 = b.f704;
                        if (i13 >= i10) {
                            break;
                        }
                        b.f705 = cArr[i13];
                        cArr2[b.f704] = (char) (b.f705 + i12);
                        int i14 = b.f704;
                        cArr2[i14] = (char) (cArr2[i14] - f2799);
                        b.f704 = i14 + 1;
                    }
                    if (i11 > 0) {
                        b.f707 = i11;
                        char[] cArr3 = new char[i10];
                        System.arraycopy(cArr2, 0, cArr3, 0, i10);
                        int i15 = b.f707;
                        System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                        int i16 = b.f707;
                        System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i10];
                        b.f704 = 0;
                        while (true) {
                            int i17 = b.f704;
                            if (i17 >= i10) {
                                break;
                            }
                            cArr4[i17] = cArr2[(i10 - i17) - 1];
                            b.f704 = i17 + 1;
                        }
                        cArr2 = cArr4;
                    }
                    str2 = new String(cArr2);
                }
                return str2;
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                int i18 = f2798 + 121;
                f2800 = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 64 / 0;
                    if ((!s.m2951().m2978() ? 'N' : 'c') != 'c') {
                        try {
                            jf.m2661(jf.this, viewGroup, this);
                            return;
                        } catch (Throwable th2) {
                            kd.m2872(m2666("\r\u0003￦\u0002�\u000f\t￮\u0006\ufffb￼\t\u0006￡\uffff�\u0003\u0010\f\uffff￭\f\uffff\b\uffff\u000e", 26 - (ViewConfiguration.getScrollBarSize() >> 8), true, 14 - (Process.myTid() >> 22), 283 - (Process.myPid() >> 22)).intern(), m2666("￢\u0007\u0000\r\u0006\u0004￤\u0011\u0011\u000e\u0011\uffbf\b\r\uffbf\u000e\r￫\u0000\u0018\u000e\u0014\u0013", KeyEvent.getDeadChar(0, 0) + 23, false, TextUtils.getOffsetAfter("", 0) + 6, 277 - ExpandableListView.getPackedPositionChild(0L)).intern(), th2, false);
                        }
                    }
                } else {
                    if (!s.m2951().m2978()) {
                        jf.m2661(jf.this, viewGroup, this);
                        return;
                    }
                }
                int i20 = f2798 + 9;
                f2800 = i20 % 128;
                int i21 = i20 % 2;
            }
        };
        int i10 = f2778 + 87;
        f2782 = i10 % 128;
        int i11 = i10 % 2;
        return onLayoutChangeListener;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2657(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final hh.c cVar = new hh.c() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.4
            @Override // com.ironsource.adqualitysdk.sdk.i.hh.c
            /* JADX INFO: renamed from: ｋ */
            public final boolean mo1833(hh hhVar, View view, MotionEvent motionEvent) {
                jf.m2658(jf.this, motionEvent);
                return true;
            }
        };
        new Handler(Looper.getMainLooper()).post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.9
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                jf.m2650(viewGroup, cVar);
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof ViewGroup) {
                        jf.m2651(jf.this, (ViewGroup) childAt, onLayoutChangeListener);
                    } else {
                        jf.m2650(childAt, cVar);
                    }
                }
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
        int i10 = f2778 + 1;
        f2782 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2644(final ViewGroup viewGroup, final View.OnLayoutChangeListener onLayoutChangeListener) {
        final RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext()) { // from class: com.ironsource.adqualitysdk.sdk.i.jf.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent me2) {
                DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44960f, this, me2);
                return super.dispatchTouchEvent(me2);
            }

            @Override // android.widget.RelativeLayout, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                }
            }

            @Override // android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                jf.m2658(jf.this, motionEvent);
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        relativeLayout.setAlpha(0.0f);
        synchronized (this) {
            this.f2787.put(relativeLayout, new Object());
        }
        relativeLayout.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                viewGroup.addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
            }
        });
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2649(MotionEvent motionEvent) {
        try {
            final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jf.10

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f2789 = 1;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f2790 = 0;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static char f2791 = 37975;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static char f2792 = 32856;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static char f2793 = 59102;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static char f2794 = 59002;

                /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
                
                    if (com.ironsource.adqualitysdk.sdk.i.jw.m2774(r0, r1) != false) goto L10;
                 */
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void mo276() {
                    /*
                        Method dump skipped, instruction units count: 253
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jf.AnonymousClass10.mo276():void");
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m2665(String str, int i10) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (n.f2992) {
                        char[] cArr2 = new char[cArr.length];
                        n.f2991 = 0;
                        char[] cArr3 = new char[2];
                        while (true) {
                            int i11 = n.f2991;
                            if (i11 < cArr.length) {
                                cArr3[0] = cArr[i11];
                                cArr3[1] = cArr[i11 + 1];
                                int i12 = 58224;
                                for (int i13 = 0; i13 < 16; i13++) {
                                    char c10 = cArr3[1];
                                    char c11 = cArr3[0];
                                    char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2792)) ^ ((c11 >>> 5) + f2791)));
                                    cArr3[1] = c12;
                                    cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2793) ^ ((c12 + i12) ^ ((c12 << 4) + f2794))));
                                    i12 -= 40503;
                                }
                                int i14 = n.f2991;
                                cArr2[i14] = cArr3[0];
                                cArr2[i14 + 1] = cArr3[1];
                                n.f2991 = i14 + 2;
                            } else {
                                str2 = new String(cArr2, 0, i10);
                            }
                        }
                    }
                    return str2;
                }
            });
            int i10 = f2778 + 109;
            f2782 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            kd.m2872(m2648("恷朗ꍦẗ倄\udc58庯룉ᙥ뀒\udf1e䉗閥۔춖䗉뀺ʱᅮ蜎䷺㻸麄汈䑟\udf11", View.MeasureSpec.makeMeasureSpec(0, 0) + 26).intern(), m2648("䃂\uefbe駀쉁齴푿ᘺẢ앲⨠㎒鞡閏䇶\uda53\ue27fᙥ뀒㫡懾\uf8aeᙧ⪋\uf822ꀰ肔齴푿\uf8aeᙧꨐ㗵", 32 - TextUtils.indexOf("", "", 0, 0)).intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized void m2660(ii iiVar) {
        int i10 = f2782;
        int i11 = i10 + 63;
        f2778 = i11 % 128;
        int i12 = i11 % 2;
        this.f2786 = iiVar;
        int i13 = i10 + 69;
        f2778 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2659(ViewGroup viewGroup, View.OnLayoutChangeListener onLayoutChangeListener) {
        int i10 = f2778 + 107;
        f2782 = i10 % 128;
        int i11 = i10 % 2;
        if (viewGroup == null || m2645(viewGroup)) {
            return;
        }
        Activity activityM2890 = ke.m2890(viewGroup);
        if (!(jn.m2688().m2694(activityM2890))) {
            if (!(jn.m2688().m2695(activityM2890))) {
                return;
            }
            m2657(viewGroup, onLayoutChangeListener);
            return;
        }
        if (!(viewGroup.findViewById(160766228) == null)) {
            return;
        }
        int i12 = f2778 + 21;
        f2782 = i12 % 128;
        if (i12 % 2 != 0) {
            m2644(viewGroup, onLayoutChangeListener);
            int i13 = 83 / 0;
        } else {
            m2644(viewGroup, onLayoutChangeListener);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2645(ViewGroup viewGroup) {
        int i10 = f2778 + 37;
        f2782 = i10 % 128;
        int i11 = i10 % 2;
        try {
            if ((viewGroup.getChildCount() == 0 ? '=' : (char) 14) == '=') {
                return false;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= viewGroup.getChildCount()) {
                    return true;
                }
                if (!(viewGroup.getChildAt(i12) instanceof TextView)) {
                    int i13 = f2782 + 83;
                    int i14 = i13 % 128;
                    f2778 = i14;
                    int i15 = i13 % 2;
                    int i16 = i14 + 81;
                    f2782 = i16 % 128;
                    int i17 = i16 % 2;
                    return false;
                }
                i12++;
            }
        } catch (Throwable th2) {
            k.m2830(m2648("恷朗ꍦẗ倄\udc58庯룉ᙥ뀒\udf1e䉗閥۔춖䗉뀺ʱᅮ蜎䷺㻸麄汈䑟\udf11", View.MeasureSpec.getSize(0) + 26).intern(), m2648("䃂\uefbe駀쉁齴푿⊣䏵妨觊ڏ\ue83a\ueae3뼡했⪟섌៣䤑툣\u0ef8⽪佴辴\uf481ࠞ䓊솲\uef79䎩ཱུେ䡚宵Ⴛಧꀰ肔Ϡ霅繓\uf1ae\ue835鰾\ue926\ue310䤑툣\u0ef8⽪뉹嫨", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 52).intern(), th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2648(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f2992) {
            char[] cArr2 = new char[cArr.length];
            n.f2991 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f2991;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2781)) ^ ((c11 >>> 5) + f2780)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2779) ^ ((c12 + i12) ^ ((c12 << 4) + f2783))));
                        i12 -= 40503;
                    }
                    int i14 = n.f2991;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f2991 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }
}
