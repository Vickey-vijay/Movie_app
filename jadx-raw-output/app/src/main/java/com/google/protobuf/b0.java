package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: MessageSetSchema.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b0<T> implements l0<T> {
    private final MessageLite defaultInstance;
    private final j<?> extensionSchema;
    private final boolean hasExtensions;
    private final q0<?, ?> unknownFieldSchema;

    @Override // com.google.protobuf.l0
    public void mergeFrom(T t10, T t11) {
        n0.mergeUnknownFields(this.unknownFieldSchema, t10, t11);
        if (this.hasExtensions) {
            n0.mergeExtensions(this.extensionSchema, t10, t11);
        }
    }

    public static <T> b0<T> newSchema(q0<?, ?> q0Var, j<?> jVar, MessageLite messageLite) {
        return new b0<>(q0Var, jVar, messageLite);
    }

    @Override // com.google.protobuf.l0
    public boolean equals(T t10, T t11) {
        if (!this.unknownFieldSchema.getFromMessage(t10).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t10).equals(this.extensionSchema.getExtensions(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.l0
    public int getSerializedSize(T t10) {
        int unknownFieldsSerializedSize = getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10) + 0;
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t10).getMessageSetSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.l0
    public int hashCode(T t10) {
        int iHashCode = this.unknownFieldSchema.getFromMessage(t10).hashCode();
        return this.hasExtensions ? (iHashCode * 53) + this.extensionSchema.getExtensions(t10).hashCode() : iHashCode;
    }

    @Override // com.google.protobuf.l0
    public final boolean isInitialized(T t10) {
        return this.extensionSchema.getExtensions(t10).isInitialized();
    }

    @Override // com.google.protobuf.l0
    public void makeImmutable(T t10) {
        this.unknownFieldSchema.makeImmutable(t10);
        this.extensionSchema.makeImmutable(t10);
    }

    @Override // com.google.protobuf.l0
    public T newInstance() {
        MessageLite messageLite = this.defaultInstance;
        return messageLite instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) messageLite).newMutableInstance() : (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.l0
    public void writeTo(T t10, Writer writer) throws IOException {
        for (T t11 : this.extensionSchema.getExtensions(t10)) {
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) t11.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (t11 instanceof LazyField.b) {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), ((LazyField.b) t11).getField().toByteString());
            } else {
                writer.writeMessageSetItem(fieldDescriptorLite.getNumber(), t11.getValue());
            }
        }
        writeUnknownFieldsHelper(this.unknownFieldSchema, t10, writer);
    }

    private b0(q0<?, ?> q0Var, j<?> jVar, MessageLite messageLite) {
        this.unknownFieldSchema = q0Var;
        this.hasExtensions = jVar.hasExtensions(messageLite);
        this.extensionSchema = jVar;
        this.defaultInstance = messageLite;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(q0<UT, UB> q0Var, T t10) {
        return q0Var.getSerializedSizeAsMessageSet(q0Var.getFromMessage(t10));
    }

    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(q0<UT, UB> q0Var, j<ET> jVar, T t10, k0 k0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        UB builderFromMessage = q0Var.getBuilderFromMessage(t10);
        FieldSet<ET> mutableExtensions = jVar.getMutableExtensions(t10);
        while (k0Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                if (!parseMessageSetItemOrUnknownField(k0Var, extensionRegistryLite, jVar, mutableExtensions, q0Var, builderFromMessage)) {
                    return;
                }
            } finally {
                q0Var.setBuilderToMessage(t10, builderFromMessage);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(k0 k0Var, ExtensionRegistryLite extensionRegistryLite, j<ET> jVar, FieldSet<ET> fieldSet, q0<UT, UB> q0Var, UB ub2) throws IOException {
        int tag = k0Var.getTag();
        int uInt32 = 0;
        if (tag != WireFormat.MESSAGE_SET_ITEM_TAG) {
            if (WireFormat.getTagWireType(tag) == 2) {
                Object objFindExtensionByNumber = jVar.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, WireFormat.getTagFieldNumber(tag));
                if (objFindExtensionByNumber != null) {
                    jVar.parseLengthPrefixedMessageSetItem(k0Var, objFindExtensionByNumber, extensionRegistryLite, fieldSet);
                    return true;
                }
                return q0Var.mergeOneFieldFrom(ub2, k0Var, 0);
            }
            return k0Var.skipField();
        }
        Object objFindExtensionByNumber2 = null;
        ByteString bytes = null;
        while (k0Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = k0Var.getTag();
            if (tag2 == WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                uInt32 = k0Var.readUInt32();
                objFindExtensionByNumber2 = jVar.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, uInt32);
            } else if (tag2 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                if (objFindExtensionByNumber2 != null) {
                    jVar.parseLengthPrefixedMessageSetItem(k0Var, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
                } else {
                    bytes = k0Var.readBytes();
                }
            } else if (!k0Var.skipField()) {
                break;
            }
        }
        if (k0Var.getTag() == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
            if (bytes != null) {
                if (objFindExtensionByNumber2 != null) {
                    jVar.parseMessageSetItem(bytes, objFindExtensionByNumber2, extensionRegistryLite, fieldSet);
                } else {
                    q0Var.addLengthDelimited(ub2, uInt32, bytes);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    private <UT, UB> void writeUnknownFieldsHelper(q0<UT, UB> q0Var, T t10, Writer writer) throws IOException {
        q0Var.writeAsMessageSetTo(q0Var.getFromMessage(t10), writer);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[EDGE_INSN: B:58:0x00cb->B:34:0x00cb BREAK  A[LOOP:1: B:18:0x006d->B:61:0x006d], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.l0
    public void mergeFrom(T t10, byte[] bArr, int i10, int i11, c.b bVar) throws IOException {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = generatedMessageLite.unknownFields;
        if (unknownFieldSetLiteNewInstance == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
            generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        }
        FieldSet<GeneratedMessageLite.b> fieldSetEnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) t10).ensureExtensionsAreMutable();
        GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (i10 < i11) {
            int iDecodeVarint32 = c.decodeVarint32(bArr, i10, bVar);
            int i12 = bVar.int1;
            if (i12 == WireFormat.MESSAGE_SET_ITEM_TAG) {
                int i13 = 0;
                ByteString byteString = null;
                while (iDecodeVarint32 < i11) {
                    iDecodeVarint32 = c.decodeVarint32(bArr, iDecodeVarint32, bVar);
                    int i14 = bVar.int1;
                    int tagFieldNumber = WireFormat.getTagFieldNumber(i14);
                    int tagWireType = WireFormat.getTagWireType(i14);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension != null) {
                                iDecodeVarint32 = c.decodeMessageField(h0.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i11, bVar);
                                fieldSetEnsureExtensionsAreMutable.setField(generatedExtension.descriptor, bVar.object1);
                            } else if (tagWireType == 2) {
                                iDecodeVarint32 = c.decodeBytes(bArr, iDecodeVarint32, bVar);
                                byteString = (ByteString) bVar.object1;
                            }
                        }
                        if (i14 == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                        } else {
                            iDecodeVarint32 = c.skipField(i14, bArr, iDecodeVarint32, i11, bVar);
                        }
                    } else if (tagWireType == 0) {
                        iDecodeVarint32 = c.decodeVarint32(bArr, iDecodeVarint32, bVar);
                        i13 = bVar.int1;
                        generatedExtension = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(bVar.extensionRegistry, this.defaultInstance, i13);
                    } else {
                        if (i14 == WireFormat.MESSAGE_SET_ITEM_END_TAG) {
                            break;
                            break;
                        }
                        iDecodeVarint32 = c.skipField(i14, bArr, iDecodeVarint32, i11, bVar);
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLiteNewInstance.storeField(WireFormat.makeTag(i13, 2), byteString);
                }
                i10 = iDecodeVarint32;
            } else if (WireFormat.getTagWireType(i12) == 2) {
                GeneratedMessageLite.GeneratedExtension generatedExtension2 = (GeneratedMessageLite.GeneratedExtension) this.extensionSchema.findExtensionByNumber(bVar.extensionRegistry, this.defaultInstance, WireFormat.getTagFieldNumber(i12));
                if (generatedExtension2 != null) {
                    i10 = c.decodeMessageField(h0.getInstance().schemaFor((Class) generatedExtension2.getMessageDefaultInstance().getClass()), bArr, iDecodeVarint32, i11, bVar);
                    fieldSetEnsureExtensionsAreMutable.setField(generatedExtension2.descriptor, bVar.object1);
                } else {
                    i10 = c.decodeUnknownField(i12, bArr, iDecodeVarint32, i11, unknownFieldSetLiteNewInstance, bVar);
                }
                generatedExtension = generatedExtension2;
            } else {
                i10 = c.skipField(i12, bArr, iDecodeVarint32, i11, bVar);
            }
        }
        if (i10 != i11) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.l0
    public void mergeFrom(T t10, k0 k0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t10, k0Var, extensionRegistryLite);
    }
}
