package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4577uk {
    public static Q5 a(ServiceModuleCounterReport serviceModuleCounterReport) {
        String value;
        Q5 q10 = new Q5("", "", 0);
        q10.f55776d = serviceModuleCounterReport.getType();
        String name = serviceModuleCounterReport.getName();
        if (name != null) {
            q10.f55773a = name;
        }
        if (serviceModuleCounterReport.getValueBytes() == null && (value = serviceModuleCounterReport.getValue()) != null) {
            q10.f55774b = value;
        }
        byte[] valueBytes = serviceModuleCounterReport.getValueBytes();
        if (valueBytes != null) {
            q10.setValueBytes(valueBytes);
        }
        return q10;
    }
}
