package com.yandex.div.core;

import com.yandex.div.core.DivRequestExecutor$Companion$STUB$1;
import com.yandex.div.core.images.LoadReference;

/* JADX INFO: compiled from: DivRequestExecutor.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivRequestExecutor$Companion$STUB$1 implements DivRequestExecutor {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0() {
    }

    @Override // com.yandex.div.core.DivRequestExecutor
    public LoadReference execute(DivRequestExecutor.Request request, DivRequestExecutor.Callback callback) {
        return new LoadReference() { // from class: od.g
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                DivRequestExecutor$Companion$STUB$1.execute$lambda$0();
            }
        };
    }
}
