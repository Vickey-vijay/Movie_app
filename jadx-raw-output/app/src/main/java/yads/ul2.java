package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* JADX INFO: loaded from: classes3.dex */
public final class ul2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f83533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vl2 f83534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gy1 f83535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bz1 f83536d;

    @Override // yads.zf0
    public final void c() {
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        String strValueOf;
        this.f83536d.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.rating_container);
        Float f10 = this.f83533a.f84776k;
        if (f10 == null) {
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                return;
            }
            return;
        }
        this.f83535c.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.rating_text);
        if (textView != null) {
            vl2 vl2Var = this.f83534b;
            float fFloatValue = f10.floatValue();
            vl2Var.getClass();
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(',');
                strValueOf = new DecimalFormat("0.0", decimalFormatSymbols).format(fFloatValue);
            } catch (RuntimeException unused) {
                strValueOf = String.valueOf(fFloatValue);
            }
            textView.setText(strValueOf);
        }
    }

    public ul2(y00 y00Var, vl2 vl2Var, gy1 gy1Var, bz1 bz1Var) {
        this.f83533a = y00Var;
        this.f83534b = vl2Var;
        this.f83535c = gy1Var;
        this.f83536d = bz1Var;
    }
}
