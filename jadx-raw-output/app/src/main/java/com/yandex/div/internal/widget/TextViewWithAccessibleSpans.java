package com.yandex.div.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import ck.p;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.spannable.ImageSpan;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import nj.b0;
import nj.s;
import nj.t;

/* JADX INFO: compiled from: TextViewWithAccessibleSpans.kt */
/* JADX INFO: loaded from: classes6.dex */
public class TextViewWithAccessibleSpans extends EllipsizedTextView {
    private String _contentDescription;
    private final List<ImageSpan> accessibleImageSpans;
    private final List<ImageSpan> imageSpans;
    private final SpanHelper spanHelper;

    /* JADX INFO: compiled from: TextViewWithAccessibleSpans.kt */
    public final class SpanHelper extends ExploreByTouchHelper {
        private final ImageSpan getSpanForId(int i10) {
            if (i10 != -1 && TextViewWithAccessibleSpans.this.accessibleImageSpans.size() != 0 && i10 < TextViewWithAccessibleSpans.this.accessibleImageSpans.size() && i10 >= 0) {
                return (ImageSpan) TextViewWithAccessibleSpans.this.accessibleImageSpans.get(i10);
            }
            return null;
        }

        public SpanHelper() {
            super(TextViewWithAccessibleSpans.this);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f10, float f11) {
            RectF rectF = new RectF();
            List list = TextViewWithAccessibleSpans.this.accessibleImageSpans;
            TextViewWithAccessibleSpans textViewWithAccessibleSpans = TextViewWithAccessibleSpans.this;
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    s.u();
                }
                ((ImageSpan) obj).getBoundsInText(rectF).offset(textViewWithAccessibleSpans.getPaddingLeft(), textViewWithAccessibleSpans.getPaddingTop());
                if (rectF.contains(f10, f11)) {
                    return i10;
                }
                i10 = i11;
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
            int i10 = 0;
            for (Object obj : TextViewWithAccessibleSpans.this.accessibleImageSpans) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    s.u();
                }
                list.add(Integer.valueOf(i10));
                i10 = i11;
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
            ImageSpan.Accessibility accessibility$div_release;
            ImageSpan.OnAccessibilityClickAction onClickAction;
            ImageSpan spanForId = getSpanForId(i10);
            if (spanForId == null || (accessibility$div_release = spanForId.getAccessibility$div_release()) == null || (onClickAction = accessibility$div_release.getOnClickAction()) == null || i11 != 16) {
                return false;
            }
            onClickAction.perform();
            return true;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i10, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String accessibilityType;
            String contentDescription;
            ImageSpan spanForId = getSpanForId(i10);
            if (spanForId == null) {
                return;
            }
            ImageSpan.Accessibility accessibility$div_release = spanForId.getAccessibility$div_release();
            if (accessibility$div_release == null || (accessibilityType = accessibility$div_release.getAccessibilityType()) == null) {
                accessibilityType = "";
            }
            accessibilityNodeInfoCompat.setClassName(accessibilityType);
            accessibilityNodeInfoCompat.setPackageName(TextViewWithAccessibleSpans.this.getContext().getPackageName());
            Rect boundsInText = spanForId.getBoundsInText(new Rect());
            TextViewWithAccessibleSpans textViewWithAccessibleSpans = TextViewWithAccessibleSpans.this;
            boundsInText.offset(textViewWithAccessibleSpans.getPaddingLeft(), textViewWithAccessibleSpans.getPaddingTop());
            ImageSpan.Accessibility accessibility$div_release2 = spanForId.getAccessibility$div_release();
            ImageSpan.OnAccessibilityClickAction onClickAction = null;
            if (accessibility$div_release2 != null) {
                contentDescription = accessibility$div_release2.getContentDescription();
            } else {
                contentDescription = null;
            }
            accessibilityNodeInfoCompat.setContentDescription(contentDescription);
            ImageSpan.Accessibility accessibility$div_release3 = spanForId.getAccessibility$div_release();
            if (accessibility$div_release3 != null) {
                onClickAction = accessibility$div_release3.getOnClickAction();
            }
            if (onClickAction == null) {
                accessibilityNodeInfoCompat.setClickable(false);
            } else {
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.addAction(16);
            }
            accessibilityNodeInfoCompat.setBoundsInParent(boundsInText);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void evaluateAndSetContentDescription() {
        if (!p.e(AccessibilityStateProvider.Companion.getTouchExplorationEnabled(), Boolean.TRUE)) {
            super.setContentDescription(this._contentDescription);
            return;
        }
        List<ImageSpan> list = this.imageSpans;
        String string = null;
        string = null;
        if (list == null || this._contentDescription != null) {
            string = this._contentDescription;
        } else if (list.size() != 0) {
            int i10 = 0;
            if ((getText().length() == 0) == false) {
                CharSequence text = getText();
                SpannableString spannableString = text instanceof SpannableString ? (SpannableString) text : null;
                if (spannableString != null) {
                    List<ImageSpan> list2 = this.imageSpans;
                    ArrayList arrayList = new ArrayList(t.v(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(spannableString.getSpanStart((ImageSpan) it.next())));
                    }
                    List listH0 = b0.H0(arrayList, new Comparator() { // from class: com.yandex.div.internal.widget.TextViewWithAccessibleSpans$evaluateAndSetContentDescription$lambda$3$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t10, T t11) {
                            return qj.b.d(Integer.valueOf(((Number) t11).intValue()), Integer.valueOf(((Number) t10).intValue()));
                        }
                    });
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it2 = listH0.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        sb2.append(getText().subSequence(i10, iIntValue));
                        i10 = iIntValue + 1;
                    }
                    sb2.append(getText().subSequence(i10, getText().length()));
                    string = sb2.toString();
                    if (string == null) {
                        string = getText().toString();
                    }
                } else {
                    string = getText().toString();
                }
            }
        }
        super.setContentDescription(string);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    public final void addImageSpan$div_release(ImageSpan imageSpan) {
        if (p.e(AccessibilityStateProvider.Companion.getTouchExplorationEnabled(), Boolean.TRUE)) {
            this.imageSpans.add(imageSpan);
            ImageSpan.Accessibility accessibility$div_release = imageSpan.getAccessibility$div_release();
            if ((accessibility$div_release != null ? accessibility$div_release.getContentDescription() : null) != null) {
                this.accessibleImageSpans.add(imageSpan);
            } else {
                ImageSpan.Accessibility accessibility$div_release2 = imageSpan.getAccessibility$div_release();
                if ((accessibility$div_release2 != null ? accessibility$div_release2.getOnClickAction() : null) != null) {
                    this.accessibleImageSpans.add(imageSpan);
                }
            }
            SpanHelper spanHelper = this.spanHelper;
            if (spanHelper != null) {
                spanHelper.invalidateVirtualView(this.accessibleImageSpans.size() - 1);
            }
        }
    }

    public final void clearImageSpans$div_release() {
        this.accessibleImageSpans.clear();
        this.imageSpans.clear();
        SpanHelper spanHelper = this.spanHelper;
        if (spanHelper != null) {
            spanHelper.invalidateRoot();
        }
        evaluateAndSetContentDescription();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        SpanHelper spanHelper = this.spanHelper;
        return (spanHelper != null && spanHelper.dispatchHoverEvent(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SpanHelper spanHelper = this.spanHelper;
        return (spanHelper != null && spanHelper.dispatchKeyEvent(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        this._contentDescription = charSequence != null ? charSequence.toString() : null;
        super.setContentDescription(charSequence);
    }

    public TextViewWithAccessibleSpans(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.accessibleImageSpans = new ArrayList();
        this.imageSpans = new ArrayList();
        AccessibilityStateProvider.Companion companion = AccessibilityStateProvider.Companion;
        companion.evaluateTouchModeEnabled(context);
        if (p.e(companion.getTouchExplorationEnabled(), Boolean.TRUE)) {
            SpanHelper spanHelper = new SpanHelper();
            this.spanHelper = spanHelper;
            ViewCompat.setAccessibilityDelegate(this, spanHelper);
            setAccessibilityLiveRegion(1);
            return;
        }
        this.spanHelper = null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = 0;
        for (Object obj : this.accessibleImageSpans) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            SpanHelper spanHelper = this.spanHelper;
            if (spanHelper != null) {
                spanHelper.invalidateVirtualView(i10);
            }
            i10 = i11;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        SpanHelper spanHelper = this.spanHelper;
        if (spanHelper != null) {
            spanHelper.onFocusChanged(z10, i10, rect);
        }
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        evaluateAndSetContentDescription();
    }
}
