package com.yandex.div.data;

/* JADX INFO: compiled from: Hashable.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface Hashable {
    int hash();

    default int propertiesHash() {
        return hash();
    }
}
