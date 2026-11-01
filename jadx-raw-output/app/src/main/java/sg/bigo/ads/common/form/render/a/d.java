package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends a {
    public d(e.c cVar, Map<String, Object> map, Context context, a.InterfaceC0705a interfaceC0705a) {
        super(cVar, map, context, interfaceC0705a);
    }

    @Override // sg.bigo.ads.common.form.render.a.a
    public final void a(int i10) {
        int iA = sg.bigo.ads.common.form.render.a.a();
        int iB = sg.bigo.ads.common.form.render.a.b();
        boolean z10 = false;
        if (i10 != 2 && i10 == 3) {
            z10 = true;
            iA = -45718;
            iB = -45718;
        }
        a(iA, iB, z10);
    }

    @Override // sg.bigo.ads.common.form.render.a.a
    public final View b() {
        View viewA = sg.bigo.ads.common.utils.a.a(this.f69571h, sg.bigo.ads.common.form.render.a.a(6), null, false);
        this.f69572i = viewA;
        if (viewA == null) {
            return null;
        }
        a.a((TextView) viewA.findViewById(R.id.inter_form_edit_title), this.f69567d);
        a(1);
        final RadioGroup radioGroup = (RadioGroup) this.f69572i.findViewById(R.id.inter_form_edit_content);
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: sg.bigo.ads.common.form.render.a.d.1
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup2, int i10) {
                    radioGroup.requestFocus();
                    RadioButton radioButton = (RadioButton) radioGroup2.findViewById(i10);
                    d.this.a(2);
                    if (radioButton != null) {
                        radioButton.setTextColor(-16736769);
                        d.this.f69566c = radioButton.getText().toString();
                        d dVar = d.this;
                        a.InterfaceC0705a interfaceC0705a = dVar.f69573j;
                        if (interfaceC0705a != null) {
                            interfaceC0705a.a(dVar.f69568e, dVar.f69566c);
                        }
                    }
                }
            });
            if (this.f69570g.length != 0) {
                String strA = sg.bigo.ads.common.form.a.a(this.f69568e, this.f69565b);
                CompoundButton compoundButton = null;
                int i10 = 0;
                while (true) {
                    String[] strArr = this.f69570g;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    String str = strArr[i10];
                    boolean z10 = i10 == 0;
                    CompoundButton bVar = new sg.bigo.ads.common.view.b(this.f69571h);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    if (!z10) {
                        marginLayoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f69571h, 8);
                    }
                    bVar.setLayoutParams(marginLayoutParams);
                    bVar.setPadding(sg.bigo.ads.common.utils.e.a(this.f69571h, 12), sg.bigo.ads.common.utils.e.a(this.f69571h, 10), sg.bigo.ads.common.utils.e.a(this.f69571h, 12), sg.bigo.ads.common.utils.e.a(this.f69571h, 11));
                    bVar.setTextSize(13.0f);
                    a.a(bVar, str);
                    bVar.setButtonDrawable((Drawable) null);
                    Context context = this.f69571h;
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    int i11 = sg.bigo.ads.common.form.render.a.f69563a ? -15524570 : -657158;
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(i11);
                    gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 4));
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setColor(i11);
                    gradientDrawable2.setCornerRadius(sg.bigo.ads.common.utils.e.a(context, 4));
                    gradientDrawable2.setStroke(1, -16736769);
                    stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
                    stateListDrawable.addState(new int[]{android.R.attr.state_checked}, gradientDrawable2);
                    bVar.setBackground(stateListDrawable);
                    bVar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sg.bigo.ads.common.form.render.a.d.2
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton2, boolean z11) {
                            compoundButton2.setTextColor(z11 ? -16736769 : sg.bigo.ads.common.form.render.a.b());
                        }
                    });
                    bVar.setTextColor(sg.bigo.ads.common.form.render.a.b());
                    if (!q.a((CharSequence) strA) && strA.equalsIgnoreCase(this.f69570g[i10])) {
                        a.InterfaceC0705a interfaceC0705a = this.f69573j;
                        if (interfaceC0705a != null) {
                            interfaceC0705a.a(this.f69564a.f69317d, strA);
                        }
                        this.f69566c = strA;
                        compoundButton = bVar;
                    }
                    u.a(bVar, radioGroup, null, -1);
                    i10++;
                }
                if (compoundButton != null) {
                    compoundButton.setChecked(true);
                }
            }
        }
        return this.f69572i;
    }
}
