package vl;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.databinding.BindingAdapter;
import em.g;
import ul.b;

/* JADX INFO: compiled from: ViewAdapter.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: vl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewAdapter.java */
    public class C0768a implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f73192b;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public C0768a(b bVar) {
            this.f73192b = bVar;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            b bVar = this.f73192b;
            if (bVar != null) {
                bVar.c(charSequence.toString());
            }
        }
    }

    @BindingAdapter(requireAll = false, value = {"textChanged"})
    public static void a(EditText editText, b<String> bVar) {
        editText.addTextChangedListener(new C0768a(bVar));
        g.b("addTextChangedListener >>>>>> ");
    }

    @BindingAdapter(requireAll = false, value = {"requestFocus"})
    public static void b(EditText editText, Boolean bool) {
        if (bool.booleanValue()) {
            editText.setSelection(editText.getText().length());
            editText.requestFocus();
            ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
        }
        editText.setFocusableInTouchMode(bool.booleanValue());
    }
}
