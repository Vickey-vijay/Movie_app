package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.histogram.HistogramRecordConfiguration;

/* JADX INFO: compiled from: DivKitComponent.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface DivKitComponent {

    /* JADX INFO: compiled from: DivKitComponent.kt */
    public interface Builder {
        Builder applicationContext(Context context);

        DivKitComponent build();

        Builder configuration(DivKitConfiguration divKitConfiguration);
    }

    Div2Component.Builder div2Component();

    HistogramRecordConfiguration getHistogramRecordConfiguration();
}
