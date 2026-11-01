package com.yandex.div.core.view2.divs.widgets;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: LoadableImage.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface LoadableImage {
    void cleanLoadingTask();

    Future<?> getLoadingTask();

    void saveLoadingTask(Future<?> future);
}
