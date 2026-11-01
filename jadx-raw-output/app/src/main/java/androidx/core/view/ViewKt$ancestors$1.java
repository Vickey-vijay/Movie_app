package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements bk.l<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // bk.l
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
