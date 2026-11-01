package com.yandex.div.core.view2.errors;

import com.yandex.div.DivDataTag;
import com.yandex.div2.DivData;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: ErrorCollectors.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ErrorCollectors {
    private final Map<String, ErrorCollector> collectors = new LinkedHashMap();

    public ErrorCollector getOrCreate(DivDataTag divDataTag, DivData divData) {
        ErrorCollector errorCollector;
        synchronized (this.collectors) {
            Map<String, ErrorCollector> map = this.collectors;
            String id2 = divDataTag.getId();
            ErrorCollector errorCollector2 = map.get(id2);
            if (errorCollector2 == null) {
                errorCollector2 = new ErrorCollector();
                map.put(id2, errorCollector2);
            }
            errorCollector2.attachParsingErrors(divData);
            errorCollector = errorCollector2;
        }
        return errorCollector;
    }

    public ErrorCollector getOrNull(DivDataTag divDataTag, DivData divData) {
        ErrorCollector errorCollector;
        synchronized (this.collectors) {
            errorCollector = this.collectors.get(divDataTag.getId());
            if (errorCollector != null) {
                errorCollector.attachParsingErrors(divData);
            } else {
                errorCollector = null;
            }
        }
        return errorCollector;
    }
}
