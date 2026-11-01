package org.fourthline.cling.support.model;

import java.util.ArrayList;
import mn.f;

/* JADX INFO: loaded from: classes5.dex */
public enum RecordQualityMode {
    EP("0:EP"),
    LP("1:LP"),
    SP("2:SP"),
    BASIC("0:BASIC"),
    MEDIUM("1:MEDIUM"),
    HIGH("2:HIGH"),
    NOT_IMPLEMENTED("NOT_IMPLEMENTED");

    private String protocolString;

    @Override // java.lang.Enum
    public String toString() {
        return this.protocolString;
    }

    RecordQualityMode(String str) {
        this.protocolString = str;
    }

    public static RecordQualityMode[] valueOfCommaSeparatedList(String str) {
        String[] strArrA = f.a(str);
        if (strArrA == null) {
            return new RecordQualityMode[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrA) {
            for (RecordQualityMode recordQualityMode : values()) {
                if (recordQualityMode.protocolString.equals(str2)) {
                    arrayList.add(recordQualityMode);
                }
            }
        }
        return (RecordQualityMode[]) arrayList.toArray(new RecordQualityMode[arrayList.size()]);
    }

    public static RecordQualityMode valueOrExceptionOf(String str) throws IllegalArgumentException {
        for (RecordQualityMode recordQualityMode : values()) {
            if (recordQualityMode.protocolString.equals(str)) {
                return recordQualityMode;
            }
        }
        throw new IllegalArgumentException("Invalid record quality mode string: " + str);
    }
}
