package yads;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes8.dex */
public final class ke1 {
    public static void a(View view) {
        Object systemService = view.getContext().getSystemService("input_method");
        ck.p.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
