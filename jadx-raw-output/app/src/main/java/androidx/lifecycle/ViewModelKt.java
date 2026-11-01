package androidx.lifecycle;

import ck.p;
import nk.j2;
import nk.l0;
import nk.w0;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewModelKt {
    private static final String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    public static final l0 getViewModelScope(ViewModel viewModel) {
        p.j(viewModel, "<this>");
        l0 l0Var = (l0) viewModel.getTag(JOB_KEY);
        if (l0Var != null) {
            return l0Var;
        }
        Object tagIfAbsent = viewModel.setTagIfAbsent(JOB_KEY, new CloseableCoroutineScope(j2.b(null, 1, null).plus(w0.c().n())));
        p.i(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (l0) tagIfAbsent;
    }
}
