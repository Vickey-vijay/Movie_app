package com.yandex.div.internal.widget;

import android.view.View;

/* JADX INFO: compiled from: TransientView.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface TransientView {
    boolean isTransient();

    void transitionFinished(View view);

    void transitionStarted(View view);
}
