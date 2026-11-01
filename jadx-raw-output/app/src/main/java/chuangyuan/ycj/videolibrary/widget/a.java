package chuangyuan.ycj.videolibrary.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import chuangyuan.ycj.videolibrary.R$layout;

/* JADX INFO: compiled from: AdTopControlView.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f6018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseView f6019c;

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, @NonNull BaseView baseView) {
        super(context, attributeSet, i10);
        this.f6019c = baseView;
        View viewInflate = View.inflate(context, R$layout.simple_exo_play_ad_top, null);
        this.f6018b = viewInflate;
        viewInflate.setBackgroundColor(0);
        addView(this.f6018b, getChildCount());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
