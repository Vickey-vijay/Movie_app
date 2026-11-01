package com.mgs.carparking.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.fvvcl.flickverse.R;

/* JADX INFO: loaded from: classes5.dex */
public class ClearableEditText extends AppCompatEditText implements View.OnTouchListener, View.OnFocusChangeListener, TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f42294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnFocusChangeListener f42295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnTouchListener f42296d;

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        if (z10) {
            setClearIconVisible(getText().length() > 0);
        } else {
            setClearIconVisible(false);
        }
        View.OnFocusChangeListener onFocusChangeListener = this.f42295c;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z10);
        }
    }

    private void setClearIconVisible(boolean z10) {
        this.f42294b.setVisible(z10, false);
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], z10 ? this.f42294b : null, compoundDrawables[3]);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f42295c = onFocusChangeListener;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f42296d = onTouchListener;
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context);
    }

    public final void a(Context context) {
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.home_ico_close);
        DrawableCompat.wrap(drawable);
        this.f42294b = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicHeight(), this.f42294b.getIntrinsicHeight());
        setClearIconVisible(false);
        super.setOnTouchListener(this);
        super.setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        setSelection(editable.toString().length());
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z10;
        if (isFocused()) {
            if (charSequence.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            setClearIconVisible(z10);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        if (this.f42294b.isVisible() && x10 > (getWidth() - getPaddingRight()) - this.f42294b.getIntrinsicWidth()) {
            if (motionEvent.getAction() == 1) {
                setError(null);
                setText("");
            }
            return true;
        }
        View.OnTouchListener onTouchListener = this.f42296d;
        if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
            return true;
        }
        return false;
    }
}
