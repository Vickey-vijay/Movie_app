package com.explorestack.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface EnumOrBuilder extends MessageOrBuilder {
    EnumValue getEnumvalue(int i10);

    int getEnumvalueCount();

    List<EnumValue> getEnumvalueList();

    EnumValueOrBuilder getEnumvalueOrBuilder(int i10);

    List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    OptionOrBuilder getOptionsOrBuilder(int i10);

    List<? extends OptionOrBuilder> getOptionsOrBuilderList();

    SourceContext getSourceContext();

    SourceContextOrBuilder getSourceContextOrBuilder();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
