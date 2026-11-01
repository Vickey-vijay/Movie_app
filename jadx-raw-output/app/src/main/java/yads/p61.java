package yads;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import yads.p61;

/* JADX INFO: loaded from: classes10.dex */
public final class p61 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final og0 f81260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final er f81261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f81262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View.OnClickListener f81263d;

    public static final void a(p61 p61Var, View view) {
        boolean z10 = !p61Var.f81261b.isSelected();
        p61Var.f81261b.setSelected(z10);
        p61Var.f81262c.setVisibility(z10 ? 0 : 8);
    }

    public final void setDescription(String str) {
        this.f81262c.setText(str);
    }

    public p61(Context context, og0 og0Var) {
        super(context);
        this.f81260a = og0Var;
        this.f81261b = new er(context, og0Var);
        this.f81262c = new TextView(context);
        this.f81263d = new View.OnClickListener() { // from class: cp.z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p61.a(this.f51737b, view);
            }
        };
        a(context);
    }

    public final void a(Context context) {
        setOrientation(0);
        this.f81260a.getClass();
        int iA = og0.a(context, 4.0f);
        setPadding(iA, iA, iA, iA);
        this.f81261b.setOnClickListener(this.f81263d);
        addView(this.f81261b);
        this.f81260a.getClass();
        int iC = ek.b.c(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f81262c.setPadding(iC, iC, iC, iC);
        this.f81260a.getClass();
        int iC2 = ek.b.c(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(iC2, SupportMenu.CATEGORY_MASK);
        this.f81262c.setBackgroundDrawable(gradientDrawable);
        addView(this.f81262c);
        this.f81260a.getClass();
        int iC3 = ek.b.c(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams = this.f81262c.getLayoutParams();
        ck.p.h(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(iC3, 0, iC3, iC3);
        this.f81262c.setLayoutParams(layoutParams2);
        this.f81262c.setVisibility(8);
    }
}
