package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSchema.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q0<T, B> {
    public static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    public abstract void addFixed32(B b10, int i10, int i11);

    public abstract void addFixed64(B b10, int i10, long j10);

    public abstract void addGroup(B b10, int i10, T t10);

    public abstract void addLengthDelimited(B b10, int i10, ByteString byteString);

    public abstract void addVarint(B b10, int i10, long j10);

    public abstract B getBuilderFromMessage(Object obj);

    public abstract T getFromMessage(Object obj);

    public abstract int getSerializedSize(T t10);

    public abstract int getSerializedSizeAsMessageSet(T t10);

    public abstract void makeImmutable(Object obj);

    public abstract T merge(T t10, T t11);

    public abstract B newBuilder();

    public abstract void setBuilderToMessage(Object obj, B b10);

    public abstract void setToMessage(Object obj, T t10);

    public abstract boolean shouldDiscardUnknownFields(k0 k0Var);

    public abstract T toImmutable(B b10);

    public abstract void writeAsMessageSetTo(T t10, Writer writer) throws IOException;

    public abstract void writeTo(T t10, Writer writer) throws IOException;

    public void setRecursionLimit(int i10) {
        recursionLimit = i10;
    }

    private final void mergeFrom(B b10, k0 k0Var, int i10) throws IOException {
        while (k0Var.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b10, k0Var, i10)) {
        }
    }

    public final boolean mergeOneFieldFrom(B b10, k0 k0Var, int i10) throws IOException {
        int tag = k0Var.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                addFixed32(b10, tagFieldNumber, k0Var.readFixed32());
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    B bNewBuilder = newBuilder();
                    int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
                    int i11 = i10 + 1;
                    if (i11 < recursionLimit) {
                        mergeFrom(bNewBuilder, k0Var, i11);
                        if (iMakeTag == k0Var.getTag()) {
                            addGroup(b10, tagFieldNumber, toImmutable(bNewBuilder));
                            return true;
                        }
                        throw InvalidProtocolBufferException.invalidEndTag();
                    }
                    throw InvalidProtocolBufferException.recursionLimitExceeded();
                }
                addLengthDelimited(b10, tagFieldNumber, k0Var.readBytes());
                return true;
            }
            addFixed64(b10, tagFieldNumber, k0Var.readFixed64());
            return true;
        }
        addVarint(b10, tagFieldNumber, k0Var.readInt64());
        return true;
    }
}
