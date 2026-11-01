package com.yandex.div.core.dagger;

import com.yandex.div.core.view2.state.DivJoinedStateSwitcher;
import com.yandex.div.core.view2.state.DivMultipleStateSwitcher;
import com.yandex.div.core.view2.state.DivStateSwitcher;

/* JADX INFO: compiled from: Div2ViewModule.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface Div2ViewModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Div2ViewModule.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final DivStateSwitcher provideStateSwitcher(boolean z10, jj.a<DivJoinedStateSwitcher> aVar, jj.a<DivMultipleStateSwitcher> aVar2) {
            return z10 ? aVar2.get() : aVar.get();
        }
    }

    static DivStateSwitcher provideStateSwitcher(boolean z10, jj.a<DivJoinedStateSwitcher> aVar, jj.a<DivMultipleStateSwitcher> aVar2) {
        return Companion.provideStateSwitcher(z10, aVar, aVar2);
    }
}
