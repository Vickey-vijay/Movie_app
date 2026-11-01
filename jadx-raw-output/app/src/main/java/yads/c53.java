package yads;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.yandex.mobile.ads.R$id;
import yads.c53;

/* JADX INFO: loaded from: classes9.dex */
public final class c53 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk.p f76175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Switch f76176b;

    @Override // yads.ea0
    public final void a(final aa0 aa0Var) {
        this.f76176b.setOnCheckedChangeListener(null);
        Switch r10 = this.f76176b;
        aa0Var.getClass();
        r10.setText("Debug Error Indicator");
        this.f76176b.setChecked(aa0Var.f75440a);
        this.f76176b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cp.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                c53.a(this.f51604a, aa0Var, compoundButton, z10);
            }
        });
    }

    public c53(View view, rk3 rk3Var) {
        super(view);
        this.f76175a = rk3Var;
        this.f76176b = (Switch) view.findViewById(R$id.item_switch);
    }

    public static final void a(c53 c53Var, aa0 aa0Var, CompoundButton compoundButton, boolean z10) {
        bk.p pVar = c53Var.f76175a;
        aa0Var.getClass();
        pVar.mo1invoke(z90.DEBUG_ERROR_INDICATOR, Boolean.valueOf(z10));
    }
}
