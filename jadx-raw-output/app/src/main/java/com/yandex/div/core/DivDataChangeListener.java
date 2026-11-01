package com.yandex.div.core;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivData;

/* JADX INFO: compiled from: DivDataChangeListener.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface DivDataChangeListener {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final DivDataChangeListener STUB = new DivDataChangeListener() { // from class: com.yandex.div.core.DivDataChangeListener$Companion$STUB$1
        @Override // com.yandex.div.core.DivDataChangeListener
        public void afterAnimatedDataChange(Div2View div2View, DivData divData) {
        }

        @Override // com.yandex.div.core.DivDataChangeListener
        public void beforeAnimatedDataChange(Div2View div2View, DivData divData) {
        }
    };

    /* JADX INFO: compiled from: DivDataChangeListener.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void afterAnimatedDataChange(Div2View div2View, DivData divData);

    void beforeAnimatedDataChange(Div2View div2View, DivData divData);
}
