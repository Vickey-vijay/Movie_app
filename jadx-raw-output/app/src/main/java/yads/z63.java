package yads;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes2.dex */
public final class z63 extends CheckBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f85231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f85232b;

    public z63(Context context) {
        super(context);
    }

    public z63(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void setCheckedIcon(Drawable drawable) {
        this.f85231a = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f85231a);
        stateListDrawable.addState(new int[0], this.f85232b);
        setBackground(stateListDrawable);
    }

    public final void setUncheckedIcon(Drawable drawable) {
        this.f85232b = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f85231a);
        stateListDrawable.addState(new int[0], this.f85232b);
        setBackground(stateListDrawable);
    }

    public z63(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setButtonDrawable((Drawable) null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f85231a);
        stateListDrawable.addState(new int[0], this.f85232b);
        setBackground(stateListDrawable);
    }
}
