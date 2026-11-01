package com.facebook.ads.redexgen.core;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.safedk.android.internal.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PH extends ViewGroup {
    public static byte[] A0s;
    public static String[] A0t = {"e0WzfCgg5XcVfGi", "ISw7K0NC0JjGKw3aqLZnEeCyQmnJarTP", "Hy7VicQaJFFlWaz3OdTjA4ZWS7Vff8v7", "WcFZxi67WO2ZtzqmgJX02c4dryVYoE5T", "rF0iooiSTOADQgiXw4j324HAbDkNAAle", "vgT88YiEWUZNicvmty9GpsXkAZSLF8rx", "LdGmA2eGd1B3SK0OmViQAh3pNWcZcixS", "9ZqOeGgvX4TfhHbWbTIbZxI4Pt81j06N"};
    public static final int[] A0u;
    public static final Interpolator A0v;
    public static final PG A0w;
    public static final Comparator<P9> A0x;
    public int A00;
    public AbstractC1480Oo A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public PC A0Y;
    public PE A0Z;
    public ClassLoader A0a;
    public ArrayList<View> A0b;
    public List<ViewPager.OnAdapterChangeListener> A0c;
    public List<PC> A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public final Rect A0o;
    public final P9 A0p;
    public final Runnable A0q;
    public final ArrayList<P9> A0r;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private P9 A03() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f10 = clientWidth > 0 ? this.A0M / clientWidth : 0.0f;
        int i10 = -1;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z10 = true;
        P9 p10 = null;
        int i11 = 0;
        while (i11 < this.A0r.size()) {
            P9 p11 = this.A0r.get(i11);
            if (!z10 && p11.A02 != i10 + 1) {
                p11 = this.A0p;
                p11.A00 = f11 + f12 + f10;
                p11.A02 = i10 + 1;
                p11.A01 = this.A01.A00(p11.A02);
                i11--;
            }
            f11 = p11.A00;
            float f13 = p11.A01 + f11;
            String[] strArr = A0t;
            if (strArr[4].charAt(21) != strArr[2].charAt(21)) {
                throw new RuntimeException();
            }
            A0t[0] = "anv8UthCgv3bxkb";
            float f14 = f13 + f10;
            if (!z10 && scrollX < f11) {
                return p10;
            }
            if (scrollX < f14 || i11 == this.A0r.size() - 1) {
                return p11;
            }
            z10 = false;
            i10 = p11.A02;
            f12 = p11.A01;
            p10 = p11;
            i11++;
        }
        return p10;
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0s, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0s = new byte[]{-32, -3, -2, -32, -6, ExifInterface.START_CODE, 59, 65, 63, 76, -6, 61, 70, 59, 77, 77, 20, -6, -88, -40, -23, -17, -19, -6, -88, -15, -20, -62, -88, 11, 59, 93, 90, 77, 87, 80, 88, 76, 95, 84, 78, 11, 76, 79, 76, 91, 95, 80, 93, 37, 11, -66, 18, 13, 13, -66, 17, 11, -1, 10, 10, ExifInterface.MARKER_EOI, -66, 2, 3, 4, -1, 19, 10, 18, 7, 12, 5, -66, 18, 13, -66, 16, 4, 74, 83, 89, 82, 72, 30, 4, -49, -19, -6, -6, -5, 0, -84, -19, -16, -16, -84, -4, -19, -13, -15, -2, -84, -16, -15, -17, -5, -2, -84, 2, -11, -15, 3, -84, -16, 1, -2, -11, -6, -13, -84, -8, -19, 5, -5, 1, 0, 61, 80, 92, 96, 80, 94, 95, 80, 79, 11, 90, 81, 81, 94, 78, 93, 80, 80, 89, 11, 91, 76, 82, 80, 11, 87, 84, 88, 84, 95, 11, -57, -37, -40, -109, -44, -29, -29, -33, -36, -42, -44, -25, -36, -30, ExifInterface.MARKER_APP1, -102, -26, -109, -61, -44, -38, -40, -27, -76, -41, -44, -29, -25, -40, -27, -109, -42, -37, -44, ExifInterface.MARKER_APP1, -38, -40, -41, -109, -25, -37, -40, -109, -44, -41, -44, -29, -25, -40, -27, -102, -26, -109, -42, -30, ExifInterface.MARKER_APP1, -25, -40, ExifInterface.MARKER_APP1, -25, -26, -109, -22, -36, -25, -37, -30, -24, -25, -109, -42, -44, -33, -33, -36, ExifInterface.MARKER_APP1, -38, -109, -61, -44, -38, -40, -27, -76, -41, -44, -29, -25, -40, -27, -106, ExifInterface.MARKER_APP1, -30, -25, -36, ExifInterface.MARKER_EOI, -20, -73, -44, -25, -44, -58, -40, -25, -74, -37, -44, ExifInterface.MARKER_APP1, -38, -40, -41, -108, -109, -72, -21, -29, -40, -42, -25, -40, -41, -109, -44, -41, -44, -29, -25, -40, -27, -109, -36, -25, -40, -32, -109, -42, -30, -24, ExifInterface.MARKER_APP1, -25, -83, -109, 16, 35, 31, 49, 10, 27, 33, 31, 44, -3, 14, 14, 11, 19, -17, -1, 14, 11, 8, 8, -68, 16, 14, 5, 1, 0, -68, 16, 11, -68, 2, 5, 10, 0, -68, 2, 11, -1, 17, 15, -68, -2, -3, 15, 1, 0, -68, 11, 10, -68, 10, 11, 10, -55, -1, 4, 5, 8, 0, -68, -1, 17, 14, 14, 1, 10, 16, -68, 2, 11, -1, 17, 15, 1, 0, -68, 18, 5, 1, 19, -68, 67, 66, 21, 56, 53, 68, 72, 57, 70, 23, 60, 53, 66, 59, 57, 56, 1, 0, -30, -13, -7, -9, -27, -11, 4, 1, -2, -2, -9, -10, -78, -10, -5, -10, -78, 0, 1, 6, -78, -11, -13, -2, -2, -78, 5, 7, 2, -9, 4, -11, -2, -13, 5, 5, -78, -5, -1, 2, -2, -9, -1, -9, 0, 6, -13, 6, -5, 1, 0, 96, 94, 77, 90, 95, 82, 91, 94, 89, 60, 77, 83, 81};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A0J(int i10, int i11, int i12) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if ((this.A0X == null || this.A0X.isFinished()) ? false : true) {
            scrollX = this.A0j ? this.A0X.getCurrX() : this.A0X.getStartX();
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i13 = i10 - scrollX;
        if (A0t[6].charAt(18) == '5') {
            throw new RuntimeException();
        }
        String[] strArr = A0t;
        strArr[4] = "Z0LZClJ0au8nSBm1r5wZo4UlFxtb531d";
        strArr[2] = "ZltNMTIOlLDzNXpQzZy3241df7YiJdYF";
        int i14 = i11 - scrollY;
        if (i13 == 0 && i14 == 0) {
            A0R(false);
            A0f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i15 = clientWidth / 2;
        float fA00 = i15 + (i15 * A00(Math.min(1.0f, (Math.abs(i13) * 1.0f) / clientWidth)));
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fA00 / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) ((1.0f + (Math.abs(i13) / (this.A0M + (clientWidth * this.A01.A00(this.A00))))) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.A0j = false;
        this.A0X.startScroll(scrollX, scrollY, i13, i14, iMin);
        P3.A07(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        P9 p9A07;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (p9A07 = A07(childAt)) != null && p9A07.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        PA pa2;
        PA pa3;
        boolean z10;
        int i12;
        int i13;
        setMeasuredDimension(getDefaultSize(0, i10), getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.A0I = Math.min(measuredWidth / 10, this.A0E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8 && (pa3 = (PA) childAt.getLayoutParams()) != null && pa3.A05) {
                int i15 = pa3.A04 & 7;
                int i16 = pa3.A04 & 112;
                int i17 = Integer.MIN_VALUE;
                int i18 = Integer.MIN_VALUE;
                boolean z11 = i16 == 48 || i16 == 80;
                if (i15 == 3) {
                    z10 = true;
                } else {
                    if (A0t[0].length() != 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0t;
                    strArr[1] = "9a0FyoC52B3yBXBi2GxtutV5LsdNQe1M";
                    strArr[7] = "xl5cJkQWQfSP6Zwlt45arSi0METJpEUG";
                    if (i15 == 5) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (z11) {
                    i17 = 1073741824;
                } else if (z10) {
                    i18 = 1073741824;
                }
                if (pa3.width != -2) {
                    i17 = 1073741824;
                    i12 = pa3.width != -1 ? pa3.width : paddingLeft;
                } else {
                    i12 = paddingLeft;
                }
                if (pa3.height != -2) {
                    i18 = 1073741824;
                    i13 = pa3.height != -1 ? pa3.height : measuredHeight;
                } else {
                    i13 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, i17), View.MeasureSpec.makeMeasureSpec(i13, i18));
                if (z11) {
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (A0t[0].length() != 15) {
                        measuredHeight -= measuredHeight2;
                    } else {
                        A0t[6] = "EqasZ8zwVhCwMRvet1jUrx6TZdyGyQkK";
                        measuredHeight -= measuredHeight2;
                    }
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
        }
        this.A0B = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.A0A = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.A0h = true;
        A0f();
        this.A0h = false;
        int childCount2 = getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8 && ((pa2 = (PA) childAt2.getLayoutParams()) == null || !pa2.A05)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * pa2.A00), 1073741824), this.A0A);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:45:0x0164 A[PHI: r1 r2 r5
  0x0164: PHI (r1v14 float) = (r1v13 float), (r1v25 float) binds: [B:56:0x01c3, B:44:0x0162] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r2v11 float) = (r2v10 float), (r2v16 float) binds: [B:56:0x01c3, B:44:0x0162] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r5v4 float) = (r5v3 float), (r5v5 float) binds: [B:56:0x01c3, B:44:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0168  */
    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    /* JADX WARN: Code duplicated, block: B:54:0x0199  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x01de  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f6  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float fAbs;
        float y10;
        float fAbs2;
        float f10;
        String[] strArr;
        ViewParent parent;
        if (this.A0f) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        AbstractC1480Oo abstractC1480Oo = this.A01;
        String[] strArr2 = A0t;
        if (strArr2[1].charAt(20) != strArr2[7].charAt(20)) {
            A0t[0] = "LvXhlgkzmvNssd6";
            if (abstractC1480Oo == null || this.A01.A01() == 0) {
                return false;
            }
            if (this.A0U == null) {
                this.A0U = VelocityTracker.obtain();
            }
            this.A0U.addMovement(motionEvent);
            boolean zA0U = false;
            switch (motionEvent.getAction() & 255) {
                case 0:
                    this.A0X.abortAnimation();
                    this.A0m = false;
                    A0f();
                    float x10 = motionEvent.getX();
                    this.A03 = x10;
                    this.A05 = x10;
                    float y11 = motionEvent.getY();
                    this.A04 = y11;
                    this.A06 = y11;
                    this.A08 = motionEvent.getPointerId(0);
                    if (zA0U) {
                        P3.A07(this);
                    }
                    return true;
                case 1:
                    if (this.A0i) {
                        VelocityTracker velocityTracker = this.A0U;
                        velocityTracker.computeCurrentVelocity(1000, this.A0J);
                        int xVelocity = (int) velocityTracker.getXVelocity(this.A08);
                        this.A0m = true;
                        int clientWidth = getClientWidth();
                        int scrollX = getScrollX();
                        P9 p9A03 = A03();
                        A0O(A01(p9A03.A02, ((scrollX / clientWidth) - p9A03.A00) / (p9A03.A01 + (this.A0M / clientWidth)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.A08)) - this.A03)), true, true, xVelocity);
                        zA0U = A0U();
                    }
                    if (zA0U) {
                        P3.A07(this);
                    }
                    return true;
                case 2:
                    if (!this.A0i) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.A08);
                        if (iFindPointerIndex == -1) {
                            zA0U = A0U();
                        } else {
                            float x11 = motionEvent.getX(iFindPointerIndex);
                            float f11 = this.A05;
                            if (A0t[6].charAt(18) != '5') {
                                A0t[6] = "4VLsr63NxXDsBxSO9qPsxtMfhqSOrFpj";
                                fAbs = Math.abs(x11 - f11);
                                y10 = motionEvent.getY(iFindPointerIndex);
                                fAbs2 = Math.abs(y10 - this.A06);
                                if (fAbs > this.A0R) {
                                    if (fAbs > fAbs2) {
                                        this.A0i = true;
                                        A0T(true);
                                        if (x11 - this.A03 > 0.0f) {
                                            f10 = this.A03 + this.A0R;
                                        } else {
                                            f10 = this.A03 - this.A0R;
                                        }
                                        this.A05 = f10;
                                        this.A06 = y10;
                                        strArr = A0t;
                                        if (strArr[4].charAt(21) == strArr[2].charAt(21)) {
                                            String[] strArr3 = A0t;
                                            strArr3[5] = "e7fI1kGLNvpqtNm7aDmxtkJeXMvTP5FY";
                                            strArr3[3] = "XvYFrHQXjTrYZxGmpAYONm66bvHDiRqC";
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                            } else {
                                String[] strArr4 = A0t;
                                strArr4[4] = "ontN6EF9kNoPk4JOa0rpD46Vxb17myeK";
                                strArr4[2] = "q3u6R9yrNwStVG1gWFMVX4nkPMMF7Bi5";
                                fAbs = Math.abs(x11 - f11);
                                y10 = motionEvent.getY(iFindPointerIndex);
                                fAbs2 = Math.abs(y10 - this.A06);
                                if (fAbs > this.A0R) {
                                    if (fAbs > fAbs2) {
                                        this.A0i = true;
                                        A0T(true);
                                        if (x11 - this.A03 > 0.0f) {
                                            f10 = this.A03 + this.A0R;
                                        } else {
                                            f10 = this.A03 - this.A0R;
                                        }
                                        this.A05 = f10;
                                        this.A06 = y10;
                                        strArr = A0t;
                                        if (strArr[4].charAt(21) == strArr[2].charAt(21)) {
                                            String[] strArr5 = A0t;
                                            strArr5[5] = "e7fI1kGLNvpqtNm7aDmxtkJeXMvTP5FY";
                                            strArr5[3] = "XvYFrHQXjTrYZxGmpAYONm66bvHDiRqC";
                                            setScrollState(1);
                                            setScrollingCacheEnabled(true);
                                            parent = getParent();
                                            if (parent != null) {
                                                parent.requestDisallowInterceptTouchEvent(true);
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.A0i) {
                                zA0U = false | A0X(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                            }
                        }
                    } else if (this.A0i) {
                        zA0U = false | A0X(motionEvent.getX(motionEvent.findPointerIndex(this.A08)));
                    }
                    if (zA0U) {
                        P3.A07(this);
                    }
                    return true;
                case 3:
                    if (this.A0i) {
                        A0M(this.A00, true, 0, false);
                        String[] strArr6 = A0t;
                        if (strArr6[1].charAt(20) == strArr6[7].charAt(20)) {
                            throw new RuntimeException();
                        }
                        A0t[0] = "8Tm9By8OJxOMqui";
                        zA0U = A0U();
                    }
                    if (zA0U) {
                        P3.A07(this);
                    }
                    return true;
                case 4:
                default:
                    if (zA0U) {
                        P3.A07(this);
                    }
                    return true;
                case 5:
                    int actionIndex = motionEvent.getActionIndex();
                    this.A05 = motionEvent.getX(actionIndex);
                    this.A08 = motionEvent.getPointerId(actionIndex);
                    if (zA0U) {
                        P3.A07(this);
                    }
                    return true;
                case 6:
                    A0P(motionEvent);
                    this.A05 = motionEvent.getX(motionEvent.findPointerIndex(this.A08));
                    if (zA0U) {
                        P3.A07(this);
                    }
                    return true;
            }
        }
        throw new RuntimeException();
    }

    static {
        A0C();
        A0u = new int[]{R.attr.layout_gravity};
        A0x = new P5();
        A0v = new P6();
        A0w = new PG();
    }

    public PH(Context context) {
        super(context);
        this.A0r = new ArrayList<>();
        this.A0p = new P9();
        this.A0o = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0a = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0g = true;
        this.A0l = false;
        this.A0q = new P7(this);
        this.A0P = 0;
        A0D();
    }

    private final float A00(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private int A01(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) > this.A0H && Math.abs(i11) > this.A0K) {
            if (i11 <= 0) {
                i10++;
            }
        } else {
            int targetPage = this.A00;
            float truncator = i10 >= targetPage ? 0.4f : 0.6f;
            i10 = ((int) (f10 + truncator)) + i10;
        }
        int targetPage2 = this.A0r.size();
        if (targetPage2 > 0) {
            P9 lastItem = this.A0r.get(0);
            ArrayList<P9> arrayList = this.A0r;
            int targetPage3 = this.A0r.size();
            P9 p10 = arrayList.get(targetPage3 - 1);
            int i13 = lastItem.A02;
            int targetPage4 = p10.A02;
            return Math.max(i13, Math.min(i10, targetPage4));
        }
        return i10;
    }

    private Rect A02(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            int i10 = rect.bottom;
            String[] strArr = A0t;
            if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[5] = "TxsWzRbkVVm53KJb0hYxYLTaFP4RvuCR";
            strArr2[3] = "7IWTmTKlEE0GT3GusYYvAPWFxogbhPhf";
            rect.bottom = i10 + viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private final P9 A04(int i10) {
        for (int i11 = 0; i11 < i; i11++) {
            P9 p10 = this.A0r.get(i11);
            int i12 = p10.A02;
            if (A0t[6].charAt(18) == '5') {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[5] = "FTW8lMLV1WF1uT7A98mx1WW44JTpX4mD";
            strArr[3] = "8smTuGxWqqiqky02WbAruJcj0nAU8eAT";
            if (i12 == i10) {
                return p10;
            }
        }
        return null;
    }

    private final P9 A05(int i10, int i11) {
        P9 p10 = new P9();
        p10.A02 = i10;
        p10.A03 = this.A01.A04(this, i10);
        p10.A01 = this.A01.A00(i10);
        if (i11 < 0 || i11 >= this.A0r.size()) {
            this.A0r.add(p10);
        } else {
            this.A0r.add(i11, p10);
        }
        return p10;
    }

    private final P9 A06(View view) {
        while (true) {
            Object parent = view.getParent();
            if (A0t[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[4] = "Cp8HLsoEDfOeEYMqWHrr049HoHROoinV";
            strArr[2] = "T0VfZL8wtEwZV1iGxV5Hd4QPubsH4Hu8";
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return A07(view);
            }
        }
    }

    private final P9 A07(View view) {
        for (int i10 = 0; i10 < i; i10++) {
            P9 p10 = this.A0r.get(i10);
            if (this.A01.A08(view, p10.A03)) {
                return p10;
            }
        }
        return null;
    }

    private void A09() {
        this.A0i = false;
        this.A0k = false;
        if (this.A0U != null) {
            this.A0U.recycle();
            this.A0U = null;
        }
    }

    private void A0A() {
        int i10 = 0;
        while (i10 < i) {
            if (!((PA) getChildAt(i10).getLayoutParams()).A05) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void A0B() {
        if (this.A0F != 0) {
            if (this.A0b == null) {
                this.A0b = new ArrayList<>();
            } else {
                this.A0b.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.A0b.add(getChildAt(i10));
            }
            Collections.sort(this.A0b, A0w);
        }
    }

    private final void A0D() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0v);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f10);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f10);
        this.A0C = (int) (2.0f * f10);
        this.A0E = (int) (16.0f * f10);
        P3.A0B(this, new C2169gV(this));
        if (P3.A00(this) == 0) {
            P3.A09(this, 1);
        }
        P3.A0C(this, new C2170gW(this));
    }

    private void A0E(int i10) {
        List<PC> list = this.A0d;
        String[] strArr = A0t;
        if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0t;
        strArr2[1] = "BVTy00cMA02UZPGNllJjIH3AYkDj1BkJ";
        strArr2[7] = "OotLKoFjxgYdGdzuGdwdV1ikaCSVhdo5";
        if (list != null) {
            int z10 = this.A0d.size();
            for (int i11 = 0; i11 < z10; i11++) {
                this.A0d.get(i11);
            }
        }
    }

    private void A0F(int i10) {
        if (this.A0d != null) {
            int z10 = this.A0d.size();
            for (int i11 = 0; i11 < z10; i11++) {
                this.A0d.get(i11);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0229  */
    /* JADX WARN: Code duplicated, block: B:121:0x0244  */
    /* JADX WARN: Code duplicated, block: B:123:0x0255  */
    /* JADX WARN: Code duplicated, block: B:124:0x025e  */
    /* JADX WARN: Code duplicated, block: B:130:0x027d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0283  */
    /* JADX WARN: Code duplicated, block: B:134:0x0289  */
    /* JADX WARN: Code duplicated, block: B:139:0x0296  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ad A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:147:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:158:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0188  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01af  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b9  */
    private final void A0G(int i10) {
        String hexString;
        int childCount;
        int i11;
        View viewFindFocus;
        P9 p9A06;
        int i12;
        int curIndex;
        P9 p9A07;
        int i13;
        int curIndex2;
        int i14;
        int curIndex3;
        PA pa2;
        P9 p9A08;
        P9 p10;
        float f10;
        P9 ii2;
        float leftWidthNeeded;
        int size;
        float f11;
        int iCharAt;
        int curIndex4;
        P9 p9A04 = null;
        if (this.A00 != i10) {
            p9A04 = A04(this.A00);
            this.A00 = i10;
        }
        if (this.A01 == null) {
            A0B();
            return;
        }
        if (this.A0m) {
            A0B();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i15 = this.A0L;
        int pos = Math.max(0, this.A00 - i15);
        int N = this.A01.A01();
        int startPos = Math.min(N - 1, this.A00 + i15);
        if (N == this.A0G) {
            P9 ii3 = null;
            int i16 = 0;
            while (i16 < curIndex) {
                P9 p11 = this.A0r.get(i16);
                int i17 = p11.A02;
                int curIndex5 = this.A00;
                if (i17 >= curIndex5) {
                    int i18 = p11.A02;
                    int curIndex6 = this.A00;
                    if (i18 != curIndex6) {
                        break;
                    }
                    ii3 = p11;
                    break;
                }
                i16++;
            }
            if (ii3 == null && N > 0) {
                int curIndex7 = this.A00;
                ii3 = A05(curIndex7, i16);
            }
            if (ii3 != null) {
                float f12 = 0.0f;
                int i19 = i16 - 1;
                if (i19 >= 0) {
                    p10 = this.A0r.get(i19);
                } else {
                    p10 = null;
                }
                int clientWidth = getClientWidth();
                if (clientWidth <= 0) {
                    f10 = 0.0f;
                } else {
                    float f13 = 2.0f - ii3.A01;
                    int curIndex8 = getPaddingLeft();
                    f10 = f13 + (curIndex8 / clientWidth);
                }
                int curIndex9 = this.A00;
                for (int i20 = curIndex9 - 1; i20 >= 0; i20--) {
                    if (f12 >= f10 && i20 < pos) {
                        if (p10 == null) {
                            break;
                        }
                        int curIndex10 = p10.A02;
                        if (i20 == curIndex10 && !p10.A04) {
                            this.A0r.remove(i19);
                            this.A01.A07(this, i20, p10.A03);
                            i19--;
                            i16--;
                            p10 = i19 >= 0 ? this.A0r.get(i19) : null;
                        }
                    } else if (p10 != null) {
                        int curIndex11 = p10.A02;
                        if (i20 == curIndex11) {
                            f12 += p10.A01;
                            i19--;
                            p10 = i19 >= 0 ? this.A0r.get(i19) : null;
                        } else {
                            int curIndex12 = i19 + 1;
                            f11 = A05(i20, curIndex12).A01;
                            String[] strArr = A0t;
                            String str = strArr[5];
                            String str2 = strArr[3];
                            iCharAt = str.charAt(3);
                            curIndex4 = str2.charAt(3);
                            if (iCharAt != curIndex4) {
                                String[] strArr2 = A0t;
                                strArr2[4] = "dloXpWDXOKz7FwqtlWspO43tyknOTTlF";
                                strArr2[2] = "sCPq7B1Nle5jSSIhAv3Hb4nKNO5mS7KT";
                                f12 += f11;
                                i16++;
                                if (i19 >= 0) {
                                    p10 = this.A0r.get(i19);
                                } else {
                                    p10 = null;
                                }
                            }
                        }
                    } else {
                        int curIndex13 = i19 + 1;
                        f11 = A05(i20, curIndex13).A01;
                        String[] strArr3 = A0t;
                        String str3 = strArr3[5];
                        String str4 = strArr3[3];
                        iCharAt = str3.charAt(3);
                        curIndex4 = str4.charAt(3);
                        if (iCharAt != curIndex4) {
                            String[] strArr4 = A0t;
                            strArr4[4] = "dloXpWDXOKz7FwqtlWspO43tyknOTTlF";
                            strArr4[2] = "sCPq7B1Nle5jSSIhAv3Hb4nKNO5mS7KT";
                            f12 += f11;
                            i16++;
                            if (i19 >= 0) {
                                p10 = this.A0r.get(i19);
                            } else {
                                p10 = null;
                            }
                        }
                    }
                }
                float extraWidthLeft = ii3.A01;
                int itemIndex = i16 + 1;
                if (extraWidthLeft < 2.0f) {
                    int curIndex14 = this.A0r.size();
                    if (itemIndex < curIndex14) {
                        ii2 = this.A0r.get(itemIndex);
                    } else {
                        ii2 = null;
                    }
                    if (clientWidth <= 0) {
                        leftWidthNeeded = 0.0f;
                    } else {
                        int curIndex15 = getPaddingRight();
                        float f14 = curIndex15;
                        float rightWidthNeeded = clientWidth;
                        if (A0t[0].length() != 15) {
                            throw new RuntimeException();
                        }
                        String[] strArr5 = A0t;
                        strArr5[5] = "yjiSNpko5C4HRuH1DqNZIljIP1AyIB8Y";
                        strArr5[3] = "4BabcLoEiYQllUHdwQ0JBCE7juXq8SlJ";
                        leftWidthNeeded = (f14 / rightWidthNeeded) + 2.0f;
                    }
                    int curIndex16 = this.A00;
                    for (int i21 = curIndex16 + 1; i21 < N; i21++) {
                        if (extraWidthLeft >= leftWidthNeeded && i21 > startPos) {
                            if (ii2 == null) {
                                break;
                            }
                            int curIndex17 = ii2.A02;
                            if (i21 == curIndex17 && !ii2.A04) {
                                this.A0r.remove(itemIndex);
                                this.A01.A07(this, i21, ii2.A03);
                                int curIndex18 = this.A0r.size();
                                ii2 = itemIndex < curIndex18 ? this.A0r.get(itemIndex) : null;
                            }
                        } else if (ii2 != null) {
                            int curIndex19 = ii2.A02;
                            if (i21 == curIndex19) {
                                extraWidthLeft += ii2.A01;
                                itemIndex++;
                                int curIndex20 = this.A0r.size();
                                if (itemIndex < curIndex20) {
                                    P9 ii4 = this.A0r.get(itemIndex);
                                    String[] strArr6 = A0t;
                                    String str5 = strArr6[5];
                                    String str6 = strArr6[3];
                                    int iCharAt2 = str5.charAt(3);
                                    int curIndex21 = str6.charAt(3);
                                    if (iCharAt2 != curIndex21) {
                                        String[] strArr7 = A0t;
                                        strArr7[4] = "IsA4bkdSyqEuCzjIc9UrR46Q3omYxVKd";
                                        strArr7[2] = "uQMdRRPHCTPdIeSYH7tJM435sOxxqF9X";
                                        ii2 = ii4;
                                    } else {
                                        A0t[0] = "Vvaq8MYPG9MCZuQ";
                                        ii2 = ii4;
                                    }
                                } else {
                                    ii2 = null;
                                }
                            } else {
                                P9 p9A05 = A05(i21, itemIndex);
                                itemIndex++;
                                extraWidthLeft += p9A05.A01;
                                size = this.A0r.size();
                                if (A0t[0].length() != 15) {
                                    A0t[0] = "BbpcE6tkf1K6OjJ";
                                    if (itemIndex < size) {
                                        ii2 = this.A0r.get(itemIndex);
                                    } else {
                                        ii2 = null;
                                    }
                                } else if (itemIndex < size) {
                                    ii2 = this.A0r.get(itemIndex);
                                } else {
                                    ii2 = null;
                                }
                            }
                        } else {
                            P9 p9A09 = A05(i21, itemIndex);
                            itemIndex++;
                            extraWidthLeft += p9A09.A01;
                            size = this.A0r.size();
                            if (A0t[0].length() != 15) {
                                A0t[0] = "BbpcE6tkf1K6OjJ";
                                if (itemIndex < size) {
                                    ii2 = this.A0r.get(itemIndex);
                                } else {
                                    ii2 = null;
                                }
                            } else if (itemIndex < size) {
                                ii2 = this.A0r.get(itemIndex);
                            } else {
                                ii2 = null;
                            }
                        }
                    }
                }
                A0Q(ii3, i16, p9A04);
                childCount = getChildCount();
                for (i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    pa2 = (PA) childAt.getLayoutParams();
                    pa2.A01 = i11;
                    if (pa2.A05 && pa2.A00 == 0.0f && (p9A08 = A07(childAt)) != null) {
                        pa2.A00 = p9A08.A01;
                        String[] strArr8 = A0t;
                        String str7 = strArr8[4];
                        String str8 = strArr8[2];
                        int iCharAt3 = str7.charAt(21);
                        int curIndex22 = str8.charAt(21);
                        if (iCharAt3 == curIndex22) {
                            String[] strArr9 = A0t;
                            strArr9[5] = "EyT6xwfDNG2S3e9LtZYytN0s3Xm8cKUy";
                            strArr9[3] = "L43v13w7qHrePnOf1vJtqhkFr9Wez5bL";
                            int curIndex23 = p9A08.A02;
                            pa2.A02 = curIndex23;
                        }
                    }
                }
                A0B();
                if (hasFocus()) {
                    viewFindFocus = findFocus();
                    if (viewFindFocus != null) {
                        p9A06 = A06(viewFindFocus);
                    } else {
                        p9A06 = null;
                    }
                    if (p9A06 != null) {
                        i14 = p9A06.A02;
                        curIndex3 = this.A00;
                        if (i14 == curIndex3) {
                            return;
                        }
                    }
                    for (i12 = 0; i12 < curIndex; i12++) {
                        View childAt2 = getChildAt(i12);
                        p9A07 = A07(childAt2);
                        if (p9A07 != null) {
                            i13 = p9A07.A02;
                            curIndex2 = this.A00;
                            if (i13 == curIndex2 && childAt2.requestFocus(2)) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            childCount = getChildCount();
            while (i11 < childCount) {
                View childAt3 = getChildAt(i11);
                pa2 = (PA) childAt3.getLayoutParams();
                pa2.A01 = i11;
                if (pa2.A05) {
                }
            }
            A0B();
            if (hasFocus()) {
                viewFindFocus = findFocus();
                if (viewFindFocus != null) {
                    p9A06 = A06(viewFindFocus);
                } else {
                    p9A06 = null;
                }
                if (p9A06 != null) {
                    i14 = p9A06.A02;
                    curIndex3 = this.A00;
                    if (i14 == curIndex3) {
                        return;
                    }
                }
                while (i12 < curIndex) {
                    View childAt4 = getChildAt(i12);
                    p9A07 = A07(childAt4);
                    if (p9A07 != null) {
                        i13 = p9A07.A02;
                        curIndex2 = this.A00;
                        if (i13 == curIndex2) {
                            continue;
                        }
                    }
                }
                return;
            }
            return;
            throw new RuntimeException();
        }
        try {
            Resources resources = getResources();
            int curIndex24 = getId();
            hexString = resources.getResourceName(curIndex24);
        } catch (Resources.NotFoundException unused) {
            int curIndex25 = getId();
            hexString = Integer.toHexString(curIndex25);
        }
        StringBuilder sb2 = new StringBuilder();
        String resName = A08(158, 142, 2);
        StringBuilder sbAppend = sb2.append(resName).append(this.A0G);
        String resName2 = A08(77, 9, 115);
        StringBuilder sbAppend2 = sbAppend.append(resName2).append(N);
        String resName3 = A08(18, 11, 23);
        StringBuilder sbAppend3 = sbAppend2.append(resName3).append(hexString);
        String resName4 = A08(4, 14, 105);
        StringBuilder sbAppend4 = sbAppend3.append(resName4).append(getClass());
        String resName5 = A08(29, 22, 122);
        throw new IllegalStateException(sbAppend4.append(resName5).append(this.A01.getClass()).toString());
    }

    private void A0H(int i10, float f10, int i11) {
        if (this.A0d != null) {
            int z10 = this.A0d.size();
            for (int i12 = 0; i12 < z10; i12++) {
                this.A0d.get(i12);
            }
        }
    }

    private final void A0I(int i10, float f10, int i11) {
        int iMax;
        if (this.A0D > 0) {
            int childLeft = getScrollX();
            int paddingLeft = getPaddingLeft();
            int childLeft2 = getPaddingRight();
            int hgrav = getWidth();
            int i12 = getChildCount();
            for (int childCount = 0; childCount < i12; childCount++) {
                View childAt = getChildAt(childCount);
                PA lp = (PA) childAt.getLayoutParams();
                int paddingLeft2 = A0t[6].charAt(18);
                if (paddingLeft2 != 53) {
                    A0t[0] = "eLb4kWjiyFzQgYZ";
                    if (lp.A05) {
                        int scrollX = lp.A04;
                        switch (scrollX & 7) {
                            case 1:
                                int scrollX2 = childAt.getMeasuredWidth();
                                iMax = Math.max((hgrav - scrollX2) / 2, paddingLeft);
                                break;
                            case 2:
                            case 4:
                            default:
                                iMax = paddingLeft;
                                break;
                            case 3:
                                iMax = paddingLeft;
                                int scrollX3 = childAt.getWidth();
                                paddingLeft += scrollX3;
                                break;
                            case 5:
                                int scrollX4 = childAt.getMeasuredWidth();
                                iMax = (hgrav - childLeft2) - scrollX4;
                                int scrollX5 = childAt.getMeasuredWidth();
                                childLeft2 += scrollX5;
                                break;
                        }
                        int scrollX6 = childAt.getLeft();
                        int i13 = (iMax + childLeft) - scrollX6;
                        String[] strArr = A0t;
                        String str = strArr[4];
                        String str2 = strArr[2];
                        int paddingLeft3 = str.charAt(21);
                        int scrollX7 = str2.charAt(21);
                        if (paddingLeft3 == scrollX7) {
                            String[] strArr2 = A0t;
                            strArr2[5] = "8dfGriTrd9bOdESwE5mGPvbaI7ots8HA";
                            strArr2[3] = "OX1hZuxAiPsPngs8SIDO4tRfQKy4SqJm";
                            if (i13 != 0) {
                                childAt.offsetLeftAndRight(i13);
                            }
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        A0H(i10, f10, i11);
        if (0 != 0) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
                String[] strArr3 = A0t;
                String str3 = strArr3[5];
                String str4 = strArr3[3];
                int childCount3 = str3.charAt(3);
                int scrollX8 = str4.charAt(3);
                if (childCount3 == scrollX8) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0t;
                strArr4[4] = "xqiTxeHFqkAvCvaAoyIYw4ze8LixE8Bg";
                strArr4[2] = "dxU2iatDRuS97WdbX1MSD4wOgw4tArLe";
                if (!((PA) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw new NullPointerException(A08(450, 13, 123));
                }
            }
        }
        this.A0e = true;
    }

    private void A0K(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.A0r.isEmpty()) {
            if (!this.A0X.isFinished()) {
                this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            int paddingLeft = ((i10 - getPaddingLeft()) - getPaddingRight()) + i12;
            int widthWithMargin = getPaddingLeft();
            int i14 = i11 - widthWithMargin;
            int widthWithMargin2 = getPaddingRight();
            int i15 = (i14 - widthWithMargin2) + i13;
            int widthWithMargin3 = getScrollX();
            int oldWidthWithMargin = (int) (paddingLeft * (widthWithMargin3 / i15));
            int widthWithMargin4 = getScrollY();
            scrollTo(oldWidthWithMargin, widthWithMargin4);
            return;
        }
        int i16 = this.A00;
        String[] strArr = A0t;
        if (strArr[4].charAt(21) != strArr[2].charAt(21)) {
            throw new RuntimeException();
        }
        A0t[6] = "zbIyuU4nFdtSfTRFogYOf2jKfKMbfeaA";
        P9 ii2 = A04(i16);
        float scrollOffset = ii2 != null ? Math.min(ii2.A00, this.A07) : 0.0f;
        int paddingLeft2 = (int) (((i10 - getPaddingLeft()) - getPaddingRight()) * scrollOffset);
        if (paddingLeft2 == getScrollX()) {
            return;
        }
        A0R(false);
        scrollTo(paddingLeft2, getScrollY());
    }

    private final void A0L(int i10, boolean z10) {
        this.A0m = false;
        A0N(i10, z10, false);
    }

    private void A0M(int i10, boolean z10, int i11, boolean z11) {
        P9 p9A04 = A04(i10);
        int destX = 0;
        if (p9A04 != null) {
            destX = (int) (getClientWidth() * Math.max(this.A02, Math.min(p9A04.A00, this.A07)));
        }
        if (z10) {
            A0J(destX, 0, i11);
            if (z11) {
                A0E(i10);
                return;
            }
            return;
        }
        if (z11) {
            A0E(i10);
        }
        A0R(false);
        scrollTo(destX, 0);
        A0Z(destX);
    }

    private final void A0N(int i10, boolean z10, boolean z11) {
        A0O(i10, z10, z11, 0);
    }

    private final void A0O(int i10, boolean z10, boolean z11, int i11) {
        if (this.A01 == null || this.A01.A01() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.A00 == i10) {
            int size = this.A0r.size();
            String[] strArr = A0t;
            if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
                throw new RuntimeException();
            }
            A0t[0] = "caHeuZPLB8pjODm";
            if (size != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.A01.A01()) {
            i10 = this.A01.A01() - 1;
        }
        int i12 = this.A0L;
        if (i10 > this.A00 + i12 || i10 < this.A00 - i12) {
            for (int i13 = 0; i13 < this.A0r.size(); i13++) {
                this.A0r.get(i13).A04 = true;
            }
        }
        boolean z12 = this.A00 != i10;
        boolean dispatchSelected = this.A0g;
        if (dispatchSelected) {
            this.A00 = i10;
            if (z12) {
                A0E(i10);
            }
            requestLayout();
            return;
        }
        A0G(i10);
        A0M(i10, z10, i11, z12);
    }

    private void A0P(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int pointerIndex = this.A08;
        if (pointerId != pointerIndex) {
            return;
        }
        int pointerId2 = actionIndex == 0 ? 1 : 0;
        this.A05 = motionEvent.getX(pointerId2);
        int pointerIndex2 = motionEvent.getPointerId(pointerId2);
        this.A08 = pointerIndex2;
        if (this.A0U != null) {
            VelocityTracker velocityTracker = this.A0U;
            int pointerId3 = A0t[6].charAt(18);
            if (pointerId3 == 53) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[4] = "bDxXC3oviTuOT7HziZkEX4OVFsay8yQk";
            strArr[2] = "Td40sAmtginQL7DIEYzsL4IjnbfuGR0u";
            velocityTracker.clear();
        }
    }

    private void A0Q(P9 p10, int i10, P9 p11) {
        float f10;
        float f11;
        int pos;
        P9 p12;
        P9 p13;
        int iA01 = this.A01.A01();
        int width = getClientWidth();
        if (width > 0) {
            int N = this.A0M;
            f10 = N / width;
        } else {
            f10 = 0.0f;
        }
        if (p11 != null) {
            int width2 = p11.A02;
            int N2 = p10.A02;
            if (width2 < N2) {
                int itemIndex = 0;
                float fA00 = p11.A00 + p11.A01 + f10;
                int i11 = width2 + 1;
                while (i11 <= N) {
                    int N3 = this.A0r.size();
                    if (itemIndex >= N3) {
                        break;
                    }
                    P9 p14 = this.A0r.get(itemIndex);
                    while (true) {
                        p13 = p14;
                        int i12 = p13.A02;
                        String[] strArr = A0t;
                        String str = strArr[4];
                        String str2 = strArr[2];
                        int width3 = str.charAt(21);
                        int N4 = str2.charAt(21);
                        if (width3 == N4) {
                            A0t[0] = "mMCGHDWlxFgMsjt";
                            if (i11 <= i12) {
                                break;
                            }
                            int N5 = this.A0r.size();
                            if (itemIndex >= N5 - 1) {
                                break;
                            }
                            itemIndex++;
                            p14 = this.A0r.get(itemIndex);
                            String[] strArr2 = A0t;
                            String str3 = strArr2[1];
                            String str4 = strArr2[7];
                            int width4 = str3.charAt(20);
                            int N6 = str4.charAt(20);
                            if (width4 == N6) {
                                throw new RuntimeException();
                            }
                            String[] strArr3 = A0t;
                            strArr3[4] = "0GRoiU6ng6hdQPVw3EwHp4l2hIIYcNtn";
                            strArr3[2] = "8Y3rzgV9nzp3iIaIDQEcr4upuD8fyeiC";
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    while (i11 < N) {
                        fA00 += this.A01.A00(i11) + f10;
                        i11++;
                    }
                    p13.A00 = fA00;
                    fA00 += p13.A01 + f10;
                    i11++;
                }
            } else {
                int N7 = p10.A02;
                if (width2 > N7) {
                    int N8 = this.A0r.size();
                    int i13 = N8 - 1;
                    float fA01 = p11.A00;
                    int itemIndex2 = width2 - 1;
                    while (itemIndex2 >= N && i13 >= 0) {
                        P9 p15 = this.A0r.get(i13);
                        String[] strArr4 = A0t;
                        String str5 = strArr4[1];
                        String str6 = strArr4[7];
                        int width5 = str5.charAt(20);
                        int N9 = str6.charAt(20);
                        if (width5 != N9) {
                            String[] strArr5 = A0t;
                            strArr5[4] = "sG2D1AU9vQNSSAZRjoe3z4C00Dqdfrqj";
                            strArr5[2] = "Rdd7cBladgYGVcjrx8uRB4qQBDUzOR2E";
                        }
                        while (true) {
                            p12 = p15;
                            int N10 = p12.A02;
                            if (itemIndex2 >= N10 || i13 <= 0) {
                                break;
                            }
                            i13--;
                            p15 = this.A0r.get(i13);
                        }
                        while (itemIndex2 > N) {
                            fA01 -= this.A01.A00(itemIndex2) + f10;
                            itemIndex2--;
                        }
                        fA01 -= p12.A01 + f10;
                        p12.A00 = fA01;
                        itemIndex2--;
                    }
                }
            }
        }
        int size = this.A0r.size();
        float offset = p10.A00;
        int N11 = p10.A02;
        int itemCount = N11 - 1;
        int N12 = p10.A02;
        this.A02 = N12 == 0 ? p10.A00 : -3.4028235E38f;
        int N13 = iA01 - 1;
        if (p10.A02 == N13) {
            float f12 = p10.A00;
            if (A0t[6].charAt(18) != 53) {
                String[] strArr6 = A0t;
                strArr6[5] = "UG1gT2jUNjrId2t7MfTS74a15LtMOaPg";
                strArr6[3] = "2ozfqeZF2OaiC2JUfBmasK4DPIGaXMZO";
                f11 = (f12 + p10.A01) - 1.0f;
            } else {
                f11 = (f12 + p10.A01) - 1.0f;
            }
        } else {
            f11 = Float.MAX_VALUE;
        }
        this.A07 = f11;
        String[] strArr7 = A0t;
        String str7 = strArr7[5];
        String str8 = strArr7[3];
        int width6 = str7.charAt(3);
        int N14 = str8.charAt(3);
        if (width6 != N14) {
            String[] strArr8 = A0t;
            strArr8[5] = "icTatsUiht4AjRSLPfh6XPjJPbhUZ0sF";
            strArr8[3] = "b2D116l90T5me9fMxsyBUu50CZtZWawR";
            pos = i10 - 1;
        } else {
            A0t[0] = "QtgdpK39IRmx84t";
            pos = i10 - 1;
        }
        while (pos >= 0) {
            P9 p16 = this.A0r.get(pos);
            while (itemCount > N) {
                offset -= this.A01.A00(itemCount) + f10;
                itemCount--;
            }
            float f13 = p16.A01 + f10;
            String[] strArr9 = A0t;
            String str9 = strArr9[4];
            String str10 = strArr9[2];
            int width7 = str9.charAt(21);
            int N15 = str10.charAt(21);
            if (width7 != N15) {
                throw new RuntimeException();
            }
            String[] strArr10 = A0t;
            strArr10[5] = "SgZGqUZOfUbRscKwt61ZJH2C2qxkKaaL";
            strArr10[3] = "iEhLnshzYOduKlFOAhFClgc41xkECprr";
            offset -= f13;
            p16.A00 = offset;
            int N16 = p16.A02;
            if (N16 == 0) {
                this.A02 = offset;
            }
            pos--;
            itemCount--;
        }
        float fA02 = p10.A00 + p10.A01 + f10;
        int N17 = p10.A02;
        int i14 = N17 + 1;
        int pos2 = i10 + 1;
        while (pos2 < size) {
            P9 p17 = this.A0r.get(pos2);
            while (i14 < N) {
                fA02 += this.A01.A00(i14) + f10;
                i14++;
            }
            int N18 = iA01 - 1;
            if (p17.A02 == N18) {
                this.A07 = (p17.A01 + fA02) - 1.0f;
            }
            p17.A00 = fA02;
            fA02 += p17.A01 + f10;
            pos2++;
            i14++;
        }
        this.A0l = false;
    }

    private void A0R(boolean z10) {
        boolean z11 = this.A0P == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            boolean needPopulate = this.A0X.isFinished();
            if (!needPopulate) {
                this.A0X.abortAnimation();
                int scrollX = getScrollX();
                int oldX = getScrollY();
                int currX = this.A0X.getCurrX();
                int currY = this.A0X.getCurrY();
                if (scrollX != currX || oldX != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0Z(currX);
                    }
                }
            }
        }
        this.A0m = false;
        for (int i10 = 0; i10 < this.A0r.size(); i10++) {
            P9 p10 = this.A0r.get(i10);
            boolean needPopulate2 = p10.A04;
            if (needPopulate2) {
                z11 = true;
                p10.A04 = false;
            }
        }
        if (z11) {
            if (z10) {
                P3.A0D(this, this.A0q);
            } else {
                this.A0q.run();
            }
        }
    }

    private void A0S(boolean z10) {
        int layerType;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (z10) {
                layerType = this.A0N;
            } else {
                layerType = 0;
            }
            getChildAt(i10).setLayerType(layerType, null);
        }
    }

    private void A0T(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean A0U() {
        this.A08 = -1;
        A09();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0V() {
        if (this.A00 > 0) {
            A0L(this.A00 - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0W() {
        if (this.A01 != null && this.A00 < this.A01.A01() - 1) {
            A0L(this.A00 + 1, true);
            return true;
        }
        return false;
    }

    private boolean A0X(float f10) {
        boolean z10 = false;
        float f11 = this.A05 - f10;
        this.A05 = f10;
        float scrollX = getScrollX() + f11;
        int clientWidth = getClientWidth();
        float f12 = clientWidth * this.A02;
        float leftBound = clientWidth;
        float leftBound2 = leftBound * this.A07;
        boolean rightAbsolute = true;
        boolean leftAbsolute = true;
        P9 p10 = this.A0r.get(0);
        P9 p11 = this.A0r.get(this.A0r.size() - 1);
        if (p10.A02 != 0) {
            rightAbsolute = false;
            f12 = p10.A00 * clientWidth;
        }
        if (p11.A02 != this.A01.A01() - 1) {
            leftAbsolute = false;
            float leftBound3 = p11.A00;
            leftBound2 = leftBound3 * clientWidth;
        }
        if (scrollX < f12) {
            if (rightAbsolute) {
                float scrollX2 = f12 - scrollX;
                if (A0t[6].charAt(18) == '5') {
                    throw new RuntimeException();
                }
                A0t[6] = "BqGUV6FWN85Kb3W2SyX26JGUB7qlw7kS";
                this.A0V.onPull(Math.abs(scrollX2) / clientWidth);
                z10 = true;
            }
            scrollX = f12;
        } else if (scrollX > leftBound2) {
            if (leftAbsolute) {
                EdgeEffect edgeEffect = this.A0W;
                float over = Math.abs(scrollX - leftBound2);
                edgeEffect.onPull(over / clientWidth);
                z10 = true;
            }
            scrollX = leftBound2;
        }
        this.A05 += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        A0Z((int) scrollX);
        return z10;
    }

    private final boolean A0Y(float f10, float f11) {
        return (f10 < ((float) this.A0I) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.A0I)) && f11 < 0.0f);
    }

    private boolean A0Z(int i10) {
        int size = this.A0r.size();
        String strA08 = A08(397, 53, 33);
        if (size == 0) {
            if (this.A0g) {
                return false;
            }
            this.A0e = false;
            A0I(0, 0.0f, 0);
            if (this.A0e) {
                return false;
            }
            throw new IllegalStateException(strA08);
        }
        P9 p9A03 = A03();
        int currentPage = getClientWidth();
        int widthWithMargin = this.A0M + currentPage;
        float f10 = this.A0M / currentPage;
        int i11 = p9A03.A02;
        float f11 = ((i10 / currentPage) - p9A03.A00) / (p9A03.A01 + f10);
        this.A0e = false;
        A0I(i11, f11, (int) (widthWithMargin * f11));
        if (this.A0e) {
            return true;
        }
        throw new IllegalStateException(strA08);
    }

    private final boolean A0a(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            boolean z10 = false;
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(A08(0, 4, 79)).append(parent2.getClass().getSimpleName());
                }
                Log.e(A08(d.f44769a, 9, 73), A08(309, 72, 43) + sb2.toString());
                viewFindFocus = null;
            }
        }
        boolean zA0V = false;
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (nextFocused != null && nextFocused != viewFindFocus) {
            if (i10 == 17) {
                zA0V = (viewFindFocus == null || A02(this.A0o, nextFocused).left < A02(this.A0o, viewFindFocus).left) ? nextFocused.requestFocus() : A0V();
            } else if (i10 == 66) {
                zA0V = (viewFindFocus == null || A02(this.A0o, nextFocused).left > A02(this.A0o, viewFindFocus).left) ? nextFocused.requestFocus() : A0W();
            }
        } else if (i10 == 17 || i10 == 1) {
            zA0V = A0V();
        } else if (i10 == 66 || i10 == 2) {
            zA0V = A0W();
        }
        if (zA0V) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zA0V;
    }

    private final boolean A0b(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                boolean handled = keyEvent.hasModifiers(2);
                if (handled) {
                    return A0V();
                }
                return A0a(17);
            case 22:
                boolean handled2 = keyEvent.hasModifiers(2);
                if (handled2) {
                    return A0W();
                }
                return A0a(66);
            case 61:
                boolean handled3 = keyEvent.hasNoModifiers();
                if (handled3) {
                    return A0a(2);
                }
                boolean handled4 = keyEvent.hasModifiers(1);
                if (!handled4) {
                    return false;
                }
                return A0a(1);
            default:
                return false;
        }
    }

    public static boolean A0c(View view) {
        return view.getClass().getAnnotation(ViewPager$DecorView.class) != null;
    }

    private final boolean A0d(View view, boolean z10, int i10, int i11, int i12) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int count = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i11 + count >= childAt.getLeft() && i11 + count < childAt.getRight() && i12 + scrollY >= childAt.getTop() && i12 + scrollY < childAt.getBottom() && A0d(childAt, true, i10, (i11 + count) - childAt.getLeft(), (i12 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0030  */
    public final void A0e() {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        int adapterCount;
        int childCount;
        int newCurrItem;
        PA pa2;
        P9 p10;
        int newPos;
        int i12;
        int iCharAt;
        int adapterCount2;
        int i13;
        int adapterCount3;
        int iCharAt2;
        int adapterCount4;
        int i14;
        int adapterCount5;
        int iA01 = this.A01.A01();
        this.A0G = iA01;
        int size = this.A0r.size();
        int adapterCount6 = this.A0L;
        if (size < (adapterCount6 * 2) + 1) {
            int size2 = this.A0r.size();
            if (A0t[0].length() == 15) {
                String[] strArr = A0t;
                strArr[1] = "NUxzbYKB38C8830aSHSoc7rOuvQ6KKjw";
                strArr[7] = "E23nb8MxwjqpvKiqrD17l4bR7FdWFUoL";
                if (size2 < iA01) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i10 = this.A00;
                z11 = false;
                i11 = 0;
                while (i11 < adapterCount) {
                    p10 = this.A0r.get(i11);
                    newPos = this.A01.A02(p10.A03);
                    if (newPos != -1) {
                        if (newPos == -2) {
                            this.A0r.remove(i11);
                            i11--;
                            if (!z11) {
                                z11 = true;
                            }
                            this.A01.A07(this, p10.A02, p10.A03);
                            z10 = true;
                            i14 = this.A00;
                            adapterCount5 = p10.A02;
                            if (i14 == adapterCount5) {
                                int adapterCount7 = iA01 - 1;
                                i10 = Math.max(0, Math.min(this.A00, adapterCount7));
                                z10 = true;
                            }
                        } else {
                            i12 = p10.A02;
                            String[] strArr2 = A0t;
                            String str = strArr2[1];
                            String str2 = strArr2[7];
                            iCharAt = str.charAt(20);
                            adapterCount2 = str2.charAt(20);
                            if (iCharAt != adapterCount2) {
                                A0t[6] = "CXZhbfMOsfHqdudS8oUHBRPLwe0MhJzA";
                                if (i12 != newPos) {
                                    i13 = p10.A02;
                                    adapterCount3 = this.A00;
                                    if (i13 == adapterCount3) {
                                        i10 = newPos;
                                    }
                                    p10.A02 = newPos;
                                    String[] strArr3 = A0t;
                                    String str3 = strArr3[5];
                                    String str4 = strArr3[3];
                                    iCharAt2 = str3.charAt(3);
                                    adapterCount4 = str4.charAt(3);
                                    if (iCharAt2 != adapterCount4) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr4 = A0t;
                                    strArr4[5] = "nuby1bZs8jKJK7rkqs9ajCRBcIxNm0YN";
                                    strArr4[3] = "0Rmx2JLm7aBulgdoCmfHMSHVIg2nPwRL";
                                    z10 = true;
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    i11++;
                }
                Collections.sort(this.A0r, A0x);
                if (z10) {
                    childCount = getChildCount();
                    for (newCurrItem = 0; newCurrItem < childCount; newCurrItem++) {
                        pa2 = (PA) getChildAt(newCurrItem).getLayoutParams();
                        if (!pa2.A05) {
                            pa2.A00 = 0.0f;
                        }
                    }
                    A0N(i10, false, true);
                    requestLayout();
                    return;
                }
                return;
            }
        } else {
            z10 = false;
            i10 = this.A00;
            z11 = false;
            i11 = 0;
            while (i11 < adapterCount) {
                p10 = this.A0r.get(i11);
                newPos = this.A01.A02(p10.A03);
                if (newPos != -1) {
                    if (newPos == -2) {
                        this.A0r.remove(i11);
                        i11--;
                        if (!z11) {
                            z11 = true;
                        }
                        this.A01.A07(this, p10.A02, p10.A03);
                        z10 = true;
                        i14 = this.A00;
                        adapterCount5 = p10.A02;
                        if (i14 == adapterCount5) {
                            int adapterCount8 = iA01 - 1;
                            i10 = Math.max(0, Math.min(this.A00, adapterCount8));
                            z10 = true;
                        }
                    } else {
                        i12 = p10.A02;
                        String[] strArr5 = A0t;
                        String str5 = strArr5[1];
                        String str6 = strArr5[7];
                        iCharAt = str5.charAt(20);
                        adapterCount2 = str6.charAt(20);
                        if (iCharAt != adapterCount2) {
                            A0t[6] = "CXZhbfMOsfHqdudS8oUHBRPLwe0MhJzA";
                            if (i12 != newPos) {
                                i13 = p10.A02;
                                adapterCount3 = this.A00;
                                if (i13 == adapterCount3) {
                                    i10 = newPos;
                                }
                                p10.A02 = newPos;
                                String[] strArr6 = A0t;
                                String str7 = strArr6[5];
                                String str8 = strArr6[3];
                                iCharAt2 = str7.charAt(3);
                                adapterCount4 = str8.charAt(3);
                                if (iCharAt2 != adapterCount4) {
                                    throw new RuntimeException();
                                }
                                String[] strArr7 = A0t;
                                strArr7[5] = "nuby1bZs8jKJK7rkqs9ajCRBcIxNm0YN";
                                strArr7[3] = "0Rmx2JLm7aBulgdoCmfHMSHVIg2nPwRL";
                                z10 = true;
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i11++;
            }
            Collections.sort(this.A0r, A0x);
            if (z10) {
                childCount = getChildCount();
                while (newCurrItem < childCount) {
                    pa2 = (PA) getChildAt(newCurrItem).getLayoutParams();
                    if (!pa2.A05) {
                        pa2.A00 = 0.0f;
                    }
                }
                A0N(i10, false, true);
                requestLayout();
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    public final void A0f() {
        A0G(this.A00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> views, int i10, int i11) {
        P9 p9A07;
        int size = views.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            int i12 = 0;
            while (true) {
                int childCount = getChildCount();
                int descendantFocusability2 = A0t[6].charAt(18);
                if (descendantFocusability2 == 53) {
                    throw new RuntimeException();
                }
                A0t[0] = "IpvXuWuZmfdtaN6";
                if (i12 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i12);
                int focusableCount = childAt.getVisibility();
                if (focusableCount == 0 && (p9A07 = A07(childAt)) != null) {
                    int descendantFocusability3 = p9A07.A02;
                    int focusableCount2 = this.A00;
                    if (descendantFocusability3 == focusableCount2) {
                        childAt.addFocusables(views, i10, i11);
                    }
                }
                i12++;
            }
        }
        if (descendantFocusability == 262144) {
            int focusableCount3 = views.size();
            if (size != focusableCount3) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        int descendantFocusability4 = i11 & 1;
        if ((descendantFocusability4 != 1 || !isInTouchMode() || isFocusableInTouchMode()) && views != null) {
            views.add(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        PA pa2 = (PA) layoutParams;
        boolean z10 = pa2.A05;
        String[] strArr = A0t;
        if (strArr[4].charAt(21) != strArr[2].charAt(21)) {
            throw new RuntimeException();
        }
        A0t[6] = "0hKurRTmjdCHvNVYXWivI507L49T3Iz9";
        pa2.A05 = z10 | A0c(view);
        if (this.A0h) {
            if (pa2 == null || !pa2.A05) {
                pa2.A03 = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException(A08(86, 41, 27));
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.A01 == null) {
            return false;
        }
        int width = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) width) * this.A02));
        }
        return i10 > 0 && scrollX < ((int) (((float) width) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof PA) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0j = true;
        if (!this.A0X.isFinished() && this.A0X.computeScrollOffset()) {
            int scrollX = getScrollX();
            int y10 = getScrollY();
            int x10 = this.A0X.getCurrX();
            int oldY = this.A0X.getCurrY();
            if (scrollX != x10 || y10 != oldY) {
                scrollTo(x10, oldY);
                if (!A0Z(x10)) {
                    this.A0X.abortAnimation();
                    scrollTo(0, oldY);
                }
            }
            P3.A07(this);
            return;
        }
        A0R(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0b(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            boolean zDispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            String[] strArr = A0t;
            if (strArr[1].charAt(20) != strArr[7].charAt(20)) {
                String[] strArr2 = A0t;
                strArr2[5] = "SnNuJhKin8DS21TzQefDZ7b1qeceX1Jv";
                strArr2[3] = "R0wvzxNXSAt5doStTJlFm1lxESFLXhHC";
                return zDispatchPopulateAccessibilityEvent;
            }
        } else {
            int childCount = getChildCount();
            if (A0t[0].length() == 15) {
                A0t[6] = "LA2rc0K0poOotSQUO6QKpLGNHvEBCZdG";
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    int childCount2 = childAt.getVisibility();
                    if (childCount2 == 0) {
                        P9 p9A07 = A07(childAt);
                        String[] strArr3 = A0t;
                        String str = strArr3[1];
                        String str2 = strArr3[7];
                        int i11 = str.charAt(20);
                        int childCount3 = str2.charAt(20);
                        if (i11 == childCount3) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0t;
                        strArr4[1] = "08daBwAiC3e1eMunN04MWwSicEkZtb5w";
                        strArr4[7] = "VX7AcKsgdRXMMXDzaUN7bbmrPcZJNGdB";
                        if (p9A07 != null) {
                            int i12 = p9A07.A02;
                            int childCount4 = this.A00;
                            if (i12 == childCount4 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return false;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z10 = false;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && this.A01 != null && this.A01.A01() > 1)) {
            EdgeEffect edgeEffect = this.A0V;
            int overScrollMode2 = A0t[0].length();
            if (overScrollMode2 != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[4] = "05N514BeFeDJgHlm81yP34LPQc7rkHPA";
            strArr[2] = "pzL9ltF7r1sXjfs3WepY84pTO2WENAbf";
            boolean needsInvalidate = edgeEffect.isFinished();
            if (!needsInvalidate) {
                int iSave = canvas.save();
                int width = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int height = getWidth();
                canvas.rotate(270.0f);
                int overScrollMode3 = -width;
                canvas.translate(overScrollMode3 + getPaddingTop(), this.A02 * height);
                this.A0V.setSize(width, height);
                boolean needsInvalidate2 = this.A0V.draw(canvas);
                z10 = false | needsInvalidate2;
                canvas.restoreToCount(iSave);
            }
            boolean needsInvalidate3 = this.A0W.isFinished();
            if (!needsInvalidate3) {
                int width2 = canvas.save();
                int width3 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.A07 + 1.0f)) * width3);
                this.A0W.setSize(height2, width3);
                boolean needsInvalidate4 = this.A0W.draw(canvas);
                z10 |= needsInvalidate4;
                canvas.restoreToCount(width2);
            }
        } else {
            this.A0V.finish();
            this.A0W.finish();
        }
        if (z10) {
            P3.A07(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new PA();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new PA(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC1480Oo getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        int result = this.A0F == 2 ? (i10 - 1) - i11 : i11;
        int index = ((PA) this.A0b.get(result).getLayoutParams()).A01;
        return index;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0q);
        if (this.A0X != null && !this.A0X.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.A0M > 0 && this.A0S != null && this.A0r.size() > 0 && this.A01 != null) {
            int scrollX = getScrollX();
            int pos = getWidth();
            float f11 = this.A0M / pos;
            int firstPos = 0;
            P9 p10 = this.A0r.get(0);
            float marginOffset = p10.A00;
            int itemCount = this.A0r.size();
            int i10 = this.A0r.get(itemCount - 1).A02;
            for (int i11 = p10.A02; i11 < i10; i11++) {
                while (i11 > p10.A02 && firstPos < itemCount) {
                    firstPos++;
                    p10 = this.A0r.get(firstPos);
                }
                if (i11 == p10.A02) {
                    f10 = (p10.A00 + p10.A01) * pos;
                    float marginOffset2 = p10.A00;
                    marginOffset = marginOffset2 + p10.A01 + f11;
                } else {
                    float fA00 = this.A01.A00(i11);
                    f10 = (marginOffset + fA00) * pos;
                    marginOffset += fA00 + f11;
                }
                if (this.A0M + f10 > scrollX) {
                    Drawable drawable = this.A0S;
                    int iRound = Math.round(f10);
                    int i12 = this.A0Q;
                    int width = Math.round(this.A0M + f10);
                    drawable.setBounds(iRound, i12, width, this.A09);
                    this.A0S.draw(canvas);
                }
                if (f10 > scrollX + pos) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[PHI: r1
  0x0073: PHI (r1v19 float) = (r1v12 float), (r1v20 float) binds: [B:35:0x00a0, B:27:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A0U();
            return false;
        }
        if (action != 0) {
            if (this.A0i) {
                return true;
            }
            if (this.A0k) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x10 = motionEvent.getX();
                this.A03 = x10;
                this.A05 = x10;
                float y10 = motionEvent.getY();
                this.A04 = y10;
                this.A06 = y10;
                this.A08 = motionEvent.getPointerId(0);
                this.A0k = false;
                this.A0j = true;
                this.A0X.computeScrollOffset();
                if (this.A0P != 2 || Math.abs(this.A0X.getFinalX() - this.A0X.getCurrX()) <= this.A0C) {
                    A0R(false);
                    this.A0i = false;
                } else {
                    this.A0X.abortAnimation();
                    this.A0m = false;
                    A0f();
                    this.A0i = true;
                    A0T(true);
                    setScrollState(1);
                }
                break;
            case 2:
                int i10 = this.A08;
                if (i10 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float f11 = x11 - this.A05;
                    float fAbs = Math.abs(f11);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float y12 = Math.abs(y11 - this.A04);
                    if (A0t[0].length() != 15) {
                        f10 = 0.0f;
                        if (f11 != 0.0f) {
                            if (!A0Y(this.A05, f11) && A0d(this, false, (int) f11, (int) x11, (int) y11)) {
                                this.A05 = x11;
                                this.A06 = y11;
                                this.A0k = true;
                                return false;
                            }
                        }
                    } else {
                        String[] strArr = A0t;
                        strArr[1] = "2mSFRFxNhkhE5V58FIjiOaI1HMcnWaQH";
                        strArr[7] = "DD1Vl4odvM0LFeMw4Y0kpPn9PiY9Pgji";
                        f10 = 0.0f;
                        if (f11 != 0.0f) {
                            if (!A0Y(this.A05, f11)) {
                                this.A05 = x11;
                                this.A06 = y11;
                                this.A0k = true;
                                return false;
                            }
                        }
                    }
                    if (fAbs > this.A0R && 0.5f * fAbs > y12) {
                        this.A0i = true;
                        A0T(true);
                        setScrollState(1);
                        this.A05 = f11 > f10 ? this.A03 + this.A0R : this.A03 - this.A0R;
                        this.A06 = y11;
                        setScrollingCacheEnabled(true);
                    } else if (y12 > this.A0R) {
                        this.A0k = true;
                    }
                    if (this.A0i && A0X(x11)) {
                        P3.A07(this);
                    }
                }
                break;
            case 6:
                A0P(motionEvent);
                break;
        }
        VelocityTracker velocityTracker = this.A0U;
        if (A0t[0].length() != 15) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0t;
        strArr2[5] = "Ahq8EZKp9TCcvWp5KGK4NZLMSiBqs7aW";
        strArr2[3] = "zhUlAvocS2Bx9TU9L2ybIINdNSgG3BiY";
        if (velocityTracker == null) {
            this.A0U = VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        return this.A0i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        P9 p9A07;
        int paddingRight;
        int count;
        int scrollX = getChildCount();
        int childTop = i12 - i10;
        int childWidth = i13 - i11;
        int vgrav = getPaddingLeft();
        int width = getPaddingTop();
        int childLeft = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int hgrav = getScrollX();
        int i14 = 0;
        int paddingTop = 0;
        while (true) {
            int count2 = 8;
            if (paddingTop < scrollX) {
                View childAt = getChildAt(paddingTop);
                if (childAt.getVisibility() != 8) {
                    PA pa2 = (PA) childAt.getLayoutParams();
                    if (pa2.A05) {
                        int count3 = pa2.A04 & 7;
                        int childTop2 = pa2.A04 & 112;
                        switch (count3) {
                            case 1:
                                paddingRight = Math.max((childTop - childAt.getMeasuredWidth()) / 2, vgrav);
                                break;
                            case 2:
                            case 4:
                            default:
                                paddingRight = vgrav;
                                break;
                            case 3:
                                paddingRight = vgrav;
                                int paddingBottom2 = childAt.getMeasuredWidth();
                                String[] strArr = A0t;
                                String str = strArr[1];
                                String str2 = strArr[7];
                                int count4 = str.charAt(20);
                                if (count4 == str2.charAt(20)) {
                                    throw new RuntimeException();
                                }
                                A0t[0] = "4DhY9NaEfbkSZ9C";
                                vgrav += paddingBottom2;
                                break;
                                break;
                            case 5:
                                int paddingRight2 = childTop - childLeft;
                                paddingRight = paddingRight2 - childAt.getMeasuredWidth();
                                childLeft += childAt.getMeasuredWidth();
                                break;
                        }
                        switch (childTop2) {
                            case 16:
                                count = Math.max((childWidth - childAt.getMeasuredHeight()) / 2, width);
                                break;
                            case 48:
                                count = width;
                                width += childAt.getMeasuredHeight();
                                break;
                            case 80:
                                int count5 = childWidth - paddingBottom;
                                count = count5 - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                                break;
                            default:
                                count = width;
                                break;
                        }
                        int paddingRight3 = paddingRight + hgrav;
                        childAt.layout(paddingRight3, count, paddingRight3 + childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + count);
                        i14++;
                    } else {
                        continue;
                    }
                }
                paddingTop++;
            } else {
                int childLeft2 = (childTop - vgrav) - childLeft;
                int paddingBottom3 = 0;
                while (paddingBottom3 < scrollX) {
                    View childAt2 = getChildAt(paddingBottom3);
                    if (childAt2.getVisibility() != count2) {
                        PA pa3 = (PA) childAt2.getLayoutParams();
                        if (!pa3.A05 && (p9A07 = A07(childAt2)) != null) {
                            int i15 = vgrav + ((int) (childLeft2 * p9A07.A00));
                            if (pa3.A03) {
                                pa3.A03 = false;
                                int widthSpec = View.MeasureSpec.makeMeasureSpec((int) (childLeft2 * pa3.A00), 1073741824);
                                childAt2.measure(widthSpec, View.MeasureSpec.makeMeasureSpec((childWidth - width) - paddingBottom, 1073741824));
                            }
                            int childTop3 = childAt2.getMeasuredWidth() + i15;
                            width = width;
                            int height = childAt2.getMeasuredHeight() + width;
                            String[] strArr2 = A0t;
                            String str3 = strArr2[1];
                            String str4 = strArr2[7];
                            int widthSpec2 = str3.charAt(20);
                            if (widthSpec2 != str4.charAt(20)) {
                                String[] strArr3 = A0t;
                                strArr3[1] = "z1EGVKAINgCK1pWg9AJjq4tA4jzMvRMS";
                                strArr3[7] = "NHHZP3L5Wb2TlMM1gmFw9TkZDHFcmZzw";
                                childAt2.layout(i15, width, childTop3, height);
                            } else {
                                childAt2.layout(i15, width, childTop3, height);
                            }
                        }
                    }
                    paddingBottom3++;
                    count2 = 8;
                }
                this.A0Q = width;
                this.A09 = childWidth - paddingBottom;
                this.A0D = i14;
                if (this.A0g) {
                    z11 = false;
                    A0M(this.A00, false, 0, false);
                } else {
                    z11 = false;
                }
                this.A0g = z11;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int end;
        P9 p9A07;
        int childCount = getChildCount();
        int count = i10 & 2;
        if (count != 0) {
            i11 = 0;
            end = 1;
        } else {
            i11 = childCount - 1;
            end = -1;
            childCount = -1;
        }
        while (i11 != childCount) {
            View childAt = getChildAt(i11);
            int count2 = childAt.getVisibility();
            if (count2 == 0 && (p9A07 = A07(childAt)) != null) {
                int index = p9A07.A02;
                int count3 = this.A00;
                if (index == count3 && childAt.requestFocus(i10, rect)) {
                    int index2 = A0t[6].charAt(18);
                    if (index2 == 53) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0t;
                    strArr[4] = "Znu0WDOQkx79zIIXKJQFb47iIrfdw3ED";
                    strArr[2] = "SboSqac50StP5vJHTPKGX42Xta1ZIbyJ";
                    return true;
                }
            }
            i11 += end;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = getContext().getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) state;
        super.onRestoreInstanceState(viewPager$SavedState.A02());
        if (this.A01 != null) {
            A0N(viewPager$SavedState.A00, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0a = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        ViewPager$SavedState ss = new ViewPager$SavedState(superState);
        ss.A00 = this.A00;
        if (this.A01 != null) {
            Parcelable superState2 = this.A01.A03();
            ss.A01 = superState2;
        }
        Parcelable superState3 = new WrappedParcelable(ss);
        return superState3;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            A0K(i10, i12, this.A0M, this.A0M);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0h) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC1480Oo abstractC1480Oo) {
        if (this.A01 != null) {
            this.A01.A06(null);
            for (int i10 = 0; i10 < i; i10++) {
                P9 p10 = this.A0r.get(i10);
                this.A01.A07(this, p10.A02, p10.A03);
            }
            ArrayList<P9> arrayList = this.A0r;
            String[] strArr = A0t;
            if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[5] = "5tjoWE4Q5tO0E95pkDqQ6gCRa23v2VF9";
            strArr2[3] = "zPJLPuVWeZXbdPcD4tg2pz6GDm3T23cV";
            arrayList.clear();
            A0A();
            this.A00 = 0;
            scrollTo(0, 0);
        }
        this.A01 = abstractC1480Oo;
        this.A0G = 0;
        AbstractC1480Oo oldAdapter = this.A01;
        if (oldAdapter != null) {
            if (this.A0Z == null) {
                this.A0Z = new PE(this);
            }
            this.A01.A06(this.A0Z);
            this.A0m = false;
            boolean z10 = this.A0g;
            this.A0g = true;
            AbstractC1480Oo oldAdapter2 = this.A01;
            this.A0G = oldAdapter2.A01();
            if (this.A0O >= 0) {
                A0N(this.A0O, false, true);
                this.A0O = -1;
                this.A0T = null;
                this.A0a = null;
            } else if (!z10) {
                A0f();
            } else {
                requestLayout();
            }
        }
        if (this.A0c != null && !this.A0c.isEmpty() && 0 < this.A0c.size()) {
            this.A0c.get(0);
            throw new NullPointerException(A08(381, 16, 99));
        }
    }

    public void setCurrentItem(int i10) {
        this.A0m = false;
        A0N(i10, !this.A0g, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w(A08(d.f44769a, 9, 73), A08(127, 31, 122) + i10 + A08(51, 26, 45) + 1);
            i10 = 1;
        }
        if (i10 != this.A0L) {
            this.A0L = i10;
            A0f();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(PC pc2) {
        this.A0Y = pc2;
    }

    public void setPageMargin(int i10) {
        int width = this.A0M;
        this.A0M = i10;
        int oldMargin = getWidth();
        A0K(oldMargin, oldMargin, i10, width);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(OK.A00(getContext(), i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.A0P == i10) {
            return;
        }
        this.A0P = i10;
        if (0 != 0) {
            A0S(i10 != 0);
        }
        A0F(i10);
        if (A0t[6].charAt(18) == '5') {
            throw new RuntimeException();
        }
        A0t[0] = "blMFZWDPlO2VlWf";
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.A0n != z10) {
            this.A0n = z10;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}
