package com.yandex.div.core.view2.divs.widgets;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.R$attr;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.widget.SuperLineHeightEditText;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lk.a0;
import mj.r;

/* JADX INFO: compiled from: DivInputView.kt */
/* JADX INFO: loaded from: classes5.dex */
public class DivInputView extends SuperLineHeightEditText implements DivHolderView<Div.i> {
    private final /* synthetic */ DivHolderViewMixin<Div.i> $$delegate_0;
    private String _hint;
    private boolean accessibilityEnabled;
    private TextView.OnEditorActionListener editorActionListener;
    private boolean enabled;
    private InputFocusTracker focusTracker;
    private final Drawable nativeBackground;
    private final List<l<Editable, r>> onTextChangedActions;
    private TextWatcher textChangeWatcher;

    public DivInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DivInputView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R$attr.divInputStyle : i10);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public Div.i getDiv() {
        return (Div.i) this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i10, int i11) {
        this.$$delegate_0.onBoundsChanged(i10, i11);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(BindingContext bindingContext, DivBorder divBorder, View view) {
        this.$$delegate_0.setBorder(bindingContext, divBorder, view);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(Div.i iVar) {
        this.$$delegate_0.setDiv(iVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z10) {
        this.$$delegate_0.setNeedClipping(z10);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        this.$$delegate_0.transitionStarted(view);
    }

    @DrawableRes
    private int getNativeBackgroundResId() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.editTextBackground, typedValue, true);
        return typedValue.resourceId;
    }

    public void addAfterTextChangeAction(l<? super Editable, r> lVar) {
        if (this.textChangeWatcher == null) {
            TextWatcher textWatcher = new TextWatcher() { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView$addAfterTextChangeAction$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    Iterator it = this.this$0.onTextChangedActions.iterator();
                    while (it.hasNext()) {
                        ((l) it.next()).invoke(editable);
                    }
                }
            };
            addTextChangedListener(textWatcher);
            this.textChangeWatcher = textWatcher;
        }
        this.onTextChangedActions.add(lVar);
    }

    public boolean getAccessibilityEnabled$div_release() {
        return this.accessibilityEnabled;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public InputFocusTracker getFocusTracker$div_release() {
        return this.focusTracker;
    }

    public Drawable getNativeBackground$div_release() {
        return this.nativeBackground;
    }

    public void removeAfterTextChangeListener() {
        removeTextChangedListener(this.textChangeWatcher);
        this.onTextChangedActions.clear();
        this.textChangeWatcher = null;
    }

    public void setAccessibilityEnabled$div_release(boolean z10) {
        this.accessibilityEnabled = z10;
        setInputHint(this._hint);
    }

    public void setEnabled$div_release(boolean z10) {
        this.enabled = z10;
        setFocusable(z10);
        setFocusableInTouchMode(z10);
    }

    public void setFocusTracker$div_release(InputFocusTracker inputFocusTracker) {
        this.focusTracker = inputFocusTracker;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0039  */
    /* JADX WARN: Code duplicated, block: B:29:0x003c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0041  */
    /* JADX WARN: Code duplicated, block: B:36:0x0050  */
    /* JADX WARN: Code duplicated, block: B:39:0x0054  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x0054, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View, android.widget.TextView, com.yandex.div.core.view2.divs.widgets.DivInputView] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public void setInputHint(String str) {
        boolean z10;
        CharSequence contentDescription;
        boolean z11;
        this._hint = str;
        if (getAccessibilityEnabled$div_release()) {
            if (str == 0 || str.length() == 0) {
                CharSequence contentDescription2 = getContentDescription();
                if (contentDescription2 == null || contentDescription2.length() == 0) {
                    str = 0;
                } else {
                    if (str != 0) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        str = getContentDescription();
                    } else {
                        contentDescription = getContentDescription();
                        if (contentDescription != null) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (!z11) {
                            str = a0.n1(str, '.') + ". " + ((Object) getContentDescription());
                        }
                    }
                }
            } else {
                if (str != 0 || str.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    str = getContentDescription();
                } else {
                    contentDescription = getContentDescription();
                    if (contentDescription != null || contentDescription.length() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        str = a0.n1(str, '.') + ". " + ((Object) getContentDescription());
                    }
                }
            }
        }
        setHint(str);
    }

    public DivInputView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.nativeBackground = ContextCompat.getDrawable(context, getNativeBackgroundResId());
        this.onTextChangedActions = new ArrayList();
        this.enabled = true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        if (scrollX == 0 && scrollY == 0) {
            int iSave = canvas.save();
            try {
                divBorderDrawer.clipCorners(canvas);
                super.draw(canvas);
                divBorderDrawer.drawBorder(canvas);
                return;
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        float f10 = scrollX;
        float f11 = scrollY;
        int iSave2 = canvas.save();
        try {
            canvas.translate(f10, f11);
            divBorderDrawer.clipCorners(canvas);
            canvas.translate(-f10, -f11);
            super.draw(canvas);
            canvas.translate(f10, f11);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        if ((getInputType() & 131072) == 0) {
            return inputConnectionOnCreateInputConnection;
        }
        return new InputConnectionWrapper(inputConnectionOnCreateInputConnection) { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView.onCreateInputConnection.1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitText(CharSequence charSequence, int i10) {
                if (p.e(charSequence, "\n")) {
                    int imeOptions = this.getImeOptions() & 255;
                    TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, null);
                    }
                }
                return super.commitText(charSequence, i10);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean sendKeyEvent(KeyEvent keyEvent) {
                if ((keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) && keyEvent.getAction() == 0) {
                    int imeOptions = this.getImeOptions() & 255;
                    TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
                    if (onEditorActionListener != null) {
                        return onEditorActionListener.onEditorAction(this, imeOptions, keyEvent);
                    }
                }
                return super.sendKeyEvent(keyEvent);
            }
        };
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        InputFocusTracker focusTracker$div_release = getFocusTracker$div_release();
        if (focusTracker$div_release != null) {
            focusTracker$div_release.inputFocusChanged(getTag(), this, z10);
        }
        super.onFocusChanged(z10, i10, rect);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if ((getInputType() & 131072) != 0 && (i10 == 66 || i10 == 160)) {
            int imeOptions = getImeOptions() & 255;
            TextView.OnEditorActionListener onEditorActionListener = this.editorActionListener;
            if (onEditorActionListener != null) {
                return onEditorActionListener.onEditorAction(this, imeOptions, keyEvent);
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightEditText, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        onBoundsChanged(i10, i11);
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        setInputHint(this._hint);
    }

    @Override // android.widget.TextView
    public void setInputType(int i10) {
        if (getInputType() == i10) {
            return;
        }
        super.setInputType(i10);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        if (p.e(getKeyListener(), keyListener)) {
            return;
        }
        super.setKeyListener(keyListener);
    }

    @Override // android.widget.TextView
    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        super.setOnEditorActionListener(onEditorActionListener);
        this.editorActionListener = onEditorActionListener;
    }
}
