package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes6.dex */
@tj.d(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements bk.p<kk.k<? super View>, rj.c<? super mj.r>, Object> {
    public final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, rj.c<? super ViewKt$allViews$1> cVar) {
        super(2, cVar);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c<mj.r> create(Object obj, rj.c<?> cVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, cVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(kk.k<? super View> kVar, rj.c<? super mj.r> cVar) {
        return ((ViewKt$allViews$1) create(kVar, cVar)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        kk.k kVar;
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kVar = (kk.k) this.L$0;
                kotlin.c.b(obj);
            }
            return mj.r.f64562a;
        }
        kotlin.c.b(obj);
        kVar = (kk.k) this.L$0;
        View view = this.$this_allViews;
        this.L$0 = kVar;
        this.label = 1;
        if (kVar.a(view, this) == objF) {
            return objF;
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            kk.i<View> descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            if (kVar.e(descendants, this) == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
