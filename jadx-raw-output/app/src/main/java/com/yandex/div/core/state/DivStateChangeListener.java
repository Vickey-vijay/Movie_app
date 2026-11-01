package com.yandex.div.core.state;

import com.yandex.div.core.view2.Div2View;

/* JADX INFO: compiled from: DivStateChangeListener.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface DivStateChangeListener {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final DivStateChangeListener STUB = new DivStateChangeListener() { // from class: com.yandex.div.core.state.DivStateChangeListener$Companion$STUB$1
        @Override // com.yandex.div.core.state.DivStateChangeListener
        public void onDivAnimatedStateChanged(Div2View div2View) {
        }
    };

    /* JADX INFO: compiled from: DivStateChangeListener.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void onDivAnimatedStateChanged(Div2View div2View);
}
