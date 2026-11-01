package com.yandex.div.core.view2.logging.bind;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Log;
import com.yandex.div2.DivData;

/* JADX INFO: compiled from: BindingEventReporterProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class BindingEventReporterProvider {
    private final Div2View div2View;

    public BindingEventReporterProvider(Div2View div2View) {
        this.div2View = div2View;
    }

    public final BindingEventReporter get(DivData divData, DivData divData2) {
        if (Log.isEnabled()) {
            return new BindingEventReporterImpl(this.div2View, divData, divData2);
        }
        return BindingEventReporter.Companion.getSTUB();
    }
}
