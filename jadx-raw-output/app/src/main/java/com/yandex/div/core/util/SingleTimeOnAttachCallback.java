package com.yandex.div.core.util;

import android.view.View;
import bk.a;
import mj.r;

/* JADX INFO: compiled from: Views.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class SingleTimeOnAttachCallback {
    private a<r> onAttachAction;

    public final void cancel() {
        this.onAttachAction = null;
    }

    public final void onAttach() {
        a<r> aVar = this.onAttachAction;
        if (aVar != null) {
            aVar.invoke();
        }
        this.onAttachAction = null;
    }

    public SingleTimeOnAttachCallback(View view, a<r> aVar) {
        this.onAttachAction = aVar;
        if (view.isAttachedToWindow()) {
            onAttach();
        }
    }
}
