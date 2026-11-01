package com.explorestack.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ListValueOrBuilder extends MessageOrBuilder {
    Value getValues(int i10);

    int getValuesCount();

    List<Value> getValuesList();

    ValueOrBuilder getValuesOrBuilder(int i10);

    List<? extends ValueOrBuilder> getValuesOrBuilderList();
}
