package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Extension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

    public enum ExtensionType {
        IMMUTABLE,
        MUTABLE,
        PROTO1
    }

    public enum MessageType {
        PROTO1,
        PROTO2
    }

    public abstract Object fromReflectionType(Object obj);

    public abstract Descriptors.FieldDescriptor getDescriptor();

    public abstract ExtensionType getExtensionType();

    @Override // com.explorestack.protobuf.ExtensionLite
    public abstract Message getMessageDefaultInstance();

    @Override // com.explorestack.protobuf.ExtensionLite
    public final boolean isLite() {
        return false;
    }

    public abstract Object singularFromReflectionType(Object obj);

    public abstract Object singularToReflectionType(Object obj);

    public abstract Object toReflectionType(Object obj);

    public MessageType getMessageType() {
        return MessageType.PROTO2;
    }
}
