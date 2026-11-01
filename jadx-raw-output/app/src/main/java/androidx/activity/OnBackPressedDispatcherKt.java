package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import mj.r;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class OnBackPressedDispatcherKt {
    public static final OnBackPressedCallback addCallback(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, final boolean z10, final bk.l<? super OnBackPressedCallback, r> lVar) {
        ck.p.j(onBackPressedDispatcher, "<this>");
        ck.p.j(lVar, "onBackPressed");
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(z10) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                lVar.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(lifecycleOwner, onBackPressedCallback);
        } else {
            onBackPressedDispatcher.addCallback(onBackPressedCallback);
        }
        return onBackPressedCallback;
    }

    public static /* synthetic */ OnBackPressedCallback addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z10, bk.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z10, lVar);
    }
}
