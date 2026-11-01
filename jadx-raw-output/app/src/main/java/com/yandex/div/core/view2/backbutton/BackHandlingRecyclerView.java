package com.yandex.div.core.view2.backbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: BackHandlingRecyclerView.kt */
/* JADX INFO: loaded from: classes3.dex */
public class BackHandlingRecyclerView extends RecyclerView {
    private final BackKeyPressedHelper backKeyPressedHelper;

    @Override // android.view.View
    @CallSuper
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        return this.backKeyPressedHelper.onKeyAction(i10, keyEvent) || super.onKeyPreIme(i10, keyEvent);
    }

    @Override // android.view.View
    @CallSuper
    public void onVisibilityChanged(View view, int i10) {
        this.backKeyPressedHelper.onVisibilityChanged();
    }

    public void setOnBackClickListener(BackKeyPressedHelper.OnBackClickListener onBackClickListener) {
        setDescendantFocusability(onBackClickListener != null ? 131072 : 262144);
        this.backKeyPressedHelper.setOnBackClickListener(onBackClickListener);
    }

    public BackHandlingRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.backKeyPressedHelper = new BackKeyPressedHelper(this);
    }

    @Override // android.view.View
    @CallSuper
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.backKeyPressedHelper.onWindowFocusChanged(z10);
    }
}
