package com.explorestack.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface EnumValueOrBuilder extends MessageOrBuilder {
    String getName();

    ByteString getNameBytes();

    int getNumber();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    OptionOrBuilder getOptionsOrBuilder(int i10);

    List<? extends OptionOrBuilder> getOptionsOrBuilderList();
}
