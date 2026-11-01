package yads;

import androidx.recyclerview.widget.DiffUtil;

/* JADX INFO: loaded from: classes6.dex */
public final class vt0 extends DiffUtil.ItemCallback {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        return ck.p.e((ut0) obj, (ut0) obj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        ut0 ut0Var = (ut0) obj;
        ut0 ut0Var2 = (ut0) obj2;
        if ((ut0Var instanceof ns0) && (ut0Var2 instanceof ns0)) {
            return ck.p.e(((ns0) ut0Var).f80742b, ((ns0) ut0Var2).f80742b);
        }
        tt0 tt0Var = tt0.f83168a;
        return ck.p.e(ut0Var, tt0Var) && ck.p.e(ut0Var2, tt0Var);
    }
}
