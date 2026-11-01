package org.fourthline.cling.support.model;

import java.util.ArrayList;
import mn.f;

/* JADX INFO: loaded from: classes10.dex */
public enum TransportAction {
    Play,
    Stop,
    Pause,
    Seek,
    Next,
    Previous,
    Record;

    public static TransportAction[] valueOfCommaSeparatedList(String str) {
        String[] strArrA = f.a(str);
        if (strArrA == null) {
            return new TransportAction[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrA) {
            for (TransportAction transportAction : values()) {
                if (transportAction.name().equals(str2)) {
                    arrayList.add(transportAction);
                }
            }
        }
        return (TransportAction[]) arrayList.toArray(new TransportAction[arrayList.size()]);
    }
}
