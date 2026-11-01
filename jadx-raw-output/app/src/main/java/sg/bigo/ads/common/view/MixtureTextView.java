package sg.bigo.ads.common.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes5.dex */
public class MixtureTextView extends RelativeLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int[] f70089s = {R.attr.textSize, R.attr.textColor, R.attr.text};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Layout f70090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f70091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f70093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f70094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextPaint f70095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<List<Rect>> f70096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<Integer> f70097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Layout> f70098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Integer> f70099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HashSet<Integer> f70100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f70101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f70102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f70103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f70104o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f70105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f70106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f70107r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map<Integer, Point> f70108t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f70109u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f70110v;

    public interface a {
        void a(UnderlineSpan underlineSpan);
    }

    public MixtureTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70090a = null;
        this.f70092c = -9601400;
        this.f70096g = new ArrayList();
        this.f70097h = null;
        this.f70098i = new ArrayList();
        this.f70099j = new ArrayList();
        this.f70100k = new HashSet<>();
        this.f70108t = new HashMap();
        this.f70110v = true;
        this.f70093d = e.b(getContext(), 14);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f70089s);
        this.f70093d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f70093d);
        this.f70092c = typedArrayObtainStyledAttributes.getColor(1, this.f70092c);
        this.f70094e = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f70095f = textPaint;
        textPaint.setDither(true);
        this.f70095f.setAntiAlias(true);
        this.f70095f.setColor(this.f70092c);
        if (TextUtils.isEmpty(this.f70094e)) {
            return;
        }
        this.f70106q = true;
    }

    private static CharSequence a(CharSequence charSequence, int i10, int i11) {
        if (q.a(charSequence)) {
            return null;
        }
        if (!(charSequence instanceof SpannableString)) {
            if (charSequence instanceof String) {
                return ((String) charSequence).substring(i10, i11);
            }
            return null;
        }
        SpannableString spannableString = (SpannableString) charSequence;
        SpannableString spannableString2 = new SpannableString(TextUtils.substring(spannableString, i10, i11));
        Object[] spans = spannableString.getSpans(i10, i11, Object.class);
        for (int length = spans.length - 1; length >= 0; length--) {
            Object obj = spans[length];
            int spanStart = spannableString.getSpanStart(obj) - i10;
            int spanEnd = spannableString.getSpanEnd(obj) - i10;
            try {
                int length2 = spannableString2.length();
                boolean z10 = false;
                if (spanEnd >= spanStart && spanStart <= length2 && spanEnd <= length2 && spanStart >= 0) {
                    z10 = true;
                }
                if (z10) {
                    spannableString2.setSpan(obj, spanStart, spanEnd, 33);
                }
            } catch (Exception unused) {
            }
        }
        return spannableString2;
    }

    private List<Rect> a(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            Point point = this.f70108t.get(Integer.valueOf(i12));
            int i13 = point.x;
            int i14 = point.y;
            if (i13 <= i10 && i14 >= i11) {
                arrayList.add(new Rect(childAt.getLeft(), i10, childAt.getRight(), i11));
            }
        }
        Collections.sort(arrayList, new Comparator<Rect>() { // from class: sg.bigo.ads.common.view.MixtureTextView.1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Rect rect, Rect rect2) {
                return rect.left > rect2.left ? 1 : -1;
            }
        });
        if (arrayList.size() < 2) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Rect rect = (Rect) arrayList.get(0);
        Rect rect2 = (Rect) arrayList.get(1);
        for (int i15 = 1; i15 < arrayList.size(); i15++) {
            if (!Rect.intersects(rect, rect2)) {
                if (arrayList2.size() - i15 < 2) {
                    break;
                }
                Rect rect3 = rect2;
                rect2 = (Rect) arrayList.get(i15 + 1);
                rect = rect3;
            } else {
                int iMin = Math.min(rect.left, rect2.left);
                int iMax = Math.max(rect.right, rect2.right);
                arrayList2.remove(rect);
                arrayList2.remove(rect2);
                arrayList2.add(new Rect(iMin, i10, iMax, i11));
                if (arrayList2.size() < 2) {
                    break;
                }
                rect = (Rect) arrayList.get(0);
                rect2 = (Rect) arrayList.get(1);
            }
        }
        return arrayList2;
    }

    private static void a(Rect rect, List<Rect> list, int i10, int i11, int i12) {
        if (rect.right < i12) {
            list.add(new Rect(rect.right, i10, i12, i11));
        }
    }

    private boolean a(Canvas canvas) {
        boolean z10 = canvas == null;
        int i10 = this.f70091b;
        List<List<Rect>> list = this.f70096g;
        CharSequence charSequence = this.f70094e;
        int length = charSequence != null ? charSequence.length() : 0;
        int lineEnd = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Rect rect = list.get(i12).get(0);
            int iWidth = rect.width();
            int iHeight = rect.height();
            CharSequence charSequenceA = a(this.f70094e, lineEnd, length);
            StaticLayout staticLayout = (q.a(charSequenceA) || this.f70095f == null) ? null : new StaticLayout(charSequenceA, this.f70095f, iWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f70090a = staticLayout;
            if (staticLayout != null) {
                int iMin = Math.min(staticLayout.getLineCount(), iHeight / i10);
                if (!z10) {
                    canvas.save();
                    canvas.translate(rect.left, rect.top);
                    canvas.clipRect(0, 0, rect.width(), this.f70090a.getLineBottom(iMin - 1) - this.f70090a.getLineTop(0));
                    this.f70090a.draw(canvas);
                    canvas.restore();
                }
                lineEnd += this.f70090a.getLineEnd(iMin - 1);
                if (canvas != null) {
                    this.f70098i.add(this.f70090a);
                    this.f70099j.add(Integer.valueOf(iMin));
                }
                i11 += iMin;
                if (lineEnd >= length) {
                    break;
                }
            }
        }
        if (z10) {
            int i13 = this.f70101l + (i11 * i10);
            this.f70101l = i13;
            if (i13 > this.f70107r) {
                int height = getHeight();
                int i14 = this.f70101l;
                if (height != i14 && this.f70103n != 1073741824) {
                    this.f70104o = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                    this.f70105p = true;
                    requestLayout();
                    return true;
                }
            }
        }
        return false;
    }

    private static void b(Rect rect, List<Rect> list, int i10, int i11, int i12) {
        if (rect.left > i12) {
            list.add(new Rect(i12, i10, rect.left, i11));
        }
    }

    private void getAllYCors() {
        int i10 = this.f70091b;
        HashSet<Integer> hashSet = this.f70100k;
        hashSet.clear();
        this.f70108t.clear();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                childAt.getTop();
                int top2 = (((childAt.getTop() - getPaddingTop()) / i10) * i10) + getPaddingTop();
                hashSet.add(Integer.valueOf(top2));
                int bottom = childAt.getBottom() - getPaddingTop();
                if (bottom % i10 != 0) {
                    bottom = ((bottom / i10) + 1) * i10;
                }
                int paddingTop = bottom + getPaddingTop();
                hashSet.add(Integer.valueOf(paddingTop));
                this.f70108t.put(Integer.valueOf(i11), new Point(top2, paddingTop));
            }
        }
        hashSet.add(Integer.valueOf(getPaddingTop()));
        hashSet.add(Integer.valueOf(this.f70103n == 1073741824 ? getHeight() : Integer.MAX_VALUE));
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f70097h = arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f70101l = getPaddingBottom() + getPaddingTop();
        int i10 = this.f70091b;
        List<List<Rect>> list = this.f70096g;
        List<Integer> list2 = this.f70097h;
        list.clear();
        if (list2 != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= list2.size() - 1) {
                    break;
                }
                int iIntValue = list2.get(i12).intValue();
                i12++;
                int iIntValue2 = list2.get(i12).intValue();
                ArrayList arrayList = new ArrayList();
                List<Rect> listA = a(iIntValue, iIntValue2);
                int size = listA.size();
                if (size == 0) {
                    arrayList.add(new Rect(paddingLeft, iIntValue, width, iIntValue2));
                } else if (size != 1) {
                    b(listA.get(i11), arrayList, iIntValue, iIntValue2, paddingLeft);
                    int i13 = i11;
                    for (int i14 = 1; i13 < listA.size() - i14; i14 = 1) {
                        Rect rect = listA.get(i13);
                        i13++;
                        Rect rect2 = listA.get(i13);
                        if (rect.right < rect2.left) {
                            arrayList.add(new Rect(rect.right, iIntValue, rect2.left, iIntValue2));
                        }
                    }
                    a(listA.get(listA.size() - 1), arrayList, iIntValue, iIntValue2, width);
                } else {
                    Rect rect3 = listA.get(i11);
                    b(rect3, arrayList, iIntValue, iIntValue2, paddingLeft);
                    a(rect3, arrayList, iIntValue, iIntValue2, width);
                }
                list.add(arrayList);
                i11 = 0;
            }
            ArrayList arrayList2 = new ArrayList(list);
            int size2 = list.size();
            int i15 = 0;
            int i16 = 0;
            while (i16 < size2) {
                List<Rect> list3 = list.get(i16);
                if (list3.size() > 1) {
                    int i17 = i15 + i16;
                    arrayList2.remove(list3);
                    i15--;
                    Rect rect4 = list3.get(0);
                    int iHeight = rect4.height() / i10;
                    this.f70101l -= ((list3.size() - 1) * iHeight) * i10;
                    int i18 = i17;
                    int i19 = 0;
                    while (i19 < iHeight) {
                        int i20 = i18;
                        int i21 = 0;
                        while (i21 < list3.size()) {
                            int i22 = i10 * i19;
                            arrayList2.add(i20, Arrays.asList(new Rect(list3.get(i21).left, rect4.top + i22, list3.get(i21).right, rect4.top + i22 + i10)));
                            i21++;
                            i20++;
                            size2 = size2;
                            list = list;
                            list3 = list3;
                            i15++;
                        }
                        i19++;
                        i18 = i20;
                        list = list;
                    }
                }
                i16++;
                size2 = size2;
                list = list;
            }
            this.f70096g = arrayList2;
        }
        if (a(null)) {
            return;
        }
        a(canvas);
        super.dispatchDraw(canvas);
    }

    public CharSequence getText() {
        return this.f70094e;
    }

    public int getTextColor() {
        return this.f70092c;
    }

    public int getTextSize() {
        return this.f70093d;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int offsetForHorizontal;
        a aVar;
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0 && q.b(this.f70094e)) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (this.f70098i.isEmpty() || this.f70099j.isEmpty()) {
                offsetForHorizontal = 0;
            } else {
                offsetForHorizontal = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < this.f70098i.size(); i11++) {
                    Layout layout = this.f70098i.get(i11);
                    int iIntValue = this.f70099j.get(i11).intValue();
                    if (layout != null) {
                        int lineForVertical = layout.getLineForVertical(y10) + 1;
                        if (lineForVertical <= iIntValue) {
                            offsetForHorizontal += layout.getOffsetForHorizontal(Math.min(lineForVertical - 1, layout.getLineCount() - 1), x10);
                            break;
                        }
                        i10 += iIntValue;
                        y10 -= this.f70091b * i10;
                        offsetForHorizontal += layout.getLineEnd(iIntValue - 1);
                    }
                }
            }
            if (offsetForHorizontal < this.f70094e.length()) {
                CharSequence charSequence = this.f70094e;
                if (charSequence instanceof SpannableString) {
                    UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) ((SpannableString) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, UnderlineSpan.class);
                    if (underlineSpanArr.length > 0 && (aVar = this.f70109u) != null) {
                        aVar.a(underlineSpanArr[0]);
                        return true;
                    }
                }
            }
        }
        return zOnInterceptTouchEvent;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f70110v) {
            this.f70103n = View.MeasureSpec.getMode(this.f70102m);
            this.f70110v = false;
            this.f70107r = getMeasuredHeight();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f70106q) {
            getAllYCors();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f70106q) {
            super.onMeasure(i10, i11);
            return;
        }
        this.f70102m = i11;
        this.f70095f.setTextSize(this.f70093d);
        StaticLayout staticLayout = new StaticLayout("测量行高", this.f70095f, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f70090a = staticLayout;
        this.f70091b = staticLayout.getLineBottom(0) - this.f70090a.getLineTop(0);
        if (this.f70105p) {
            super.onMeasure(i10, this.f70104o);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setClickListener(a aVar) {
        this.f70109u = aVar;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f70106q = false;
            requestLayout();
        } else {
            this.f70106q = true;
            this.f70094e = charSequence;
            requestLayout();
            invalidate();
        }
    }

    public void setTextColor(int i10) {
        this.f70095f.setColor(i10);
        this.f70092c = i10;
        invalidate();
    }

    public void setTextSize(int i10) {
        this.f70093d = i10;
        this.f70095f.setTextSize(i10);
        requestLayout();
        invalidate();
    }
}
