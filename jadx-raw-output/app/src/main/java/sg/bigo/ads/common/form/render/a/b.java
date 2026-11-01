package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends a {
    public b(@NonNull e.c cVar, @Nullable Map<String, Object> map, Context context, a.InterfaceC0705a interfaceC0705a) {
        super(cVar, map, context, interfaceC0705a);
    }

    @Override // sg.bigo.ads.common.form.render.a.a
    public final View b() {
        View viewA = sg.bigo.ads.common.utils.a.a(this.f69571h, sg.bigo.ads.common.form.render.a.a(2), null, false);
        this.f69572i = viewA;
        if (viewA == null) {
            return null;
        }
        a.a((TextView) viewA.findViewById(R.id.inter_form_edit_title), this.f69567d);
        a(1);
        final EditText editText = (EditText) this.f69572i.findViewById(R.id.inter_form_edit_content);
        String strA = sg.bigo.ads.common.form.a.a(this.f69568e, this.f69565b);
        if (editText != null) {
            editText.setTextColor(sg.bigo.ads.common.form.render.a.b());
            editText.setHint(sg.bigo.ads.common.form.a.a(this.f69571h, R.string.bigo_ad_form_question_hint));
            if (!q.a((CharSequence) strA)) {
                a.InterfaceC0705a interfaceC0705a = this.f69573j;
                if (interfaceC0705a != null) {
                    interfaceC0705a.a(this.f69564a.f69317d, strA);
                }
                this.f69566c = strA;
                editText.setText(strA);
            }
            editText.addTextChangedListener(new TextWatcher() { // from class: sg.bigo.ads.common.form.render.a.b.1
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    b.this.f69566c = editText.getText().toString();
                    b bVar = b.this;
                    a.InterfaceC0705a interfaceC0705a2 = bVar.f69573j;
                    if (interfaceC0705a2 != null) {
                        interfaceC0705a2.a(bVar.f69564a.f69317d, bVar.f69566c);
                    }
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                }
            });
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sg.bigo.ads.common.form.render.a.b.2
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    b bVar = b.this;
                    if (z10) {
                        bVar.a(2);
                    } else {
                        bVar.a();
                    }
                }
            });
        }
        return this.f69572i;
    }
}
