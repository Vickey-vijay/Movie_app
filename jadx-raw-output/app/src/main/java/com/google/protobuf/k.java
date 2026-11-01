package com.google.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchemaLite.java */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends j<GeneratedMessageLite.b> {

    /* JADX INFO: compiled from: ExtensionSchemaLite.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.j
    public FieldSet<GeneratedMessageLite.b> getExtensions(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.j
    public FieldSet<GeneratedMessageLite.b> getMutableExtensions(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.google.protobuf.j
    public boolean hasExtensions(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.j
    public <UT, UB> UB parseExtension(Object obj, k0 k0Var, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet, UB ub2, q0<UT, UB> q0Var) throws IOException {
        Object field;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    k0Var.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    k0Var.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    k0Var.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    k0Var.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    k0Var.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    k0Var.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    k0Var.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    k0Var.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    k0Var.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    k0Var.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    k0Var.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    k0Var.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    k0Var.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    k0Var.readEnumList(arrayList);
                    ub2 = (UB) n0.filterUnknownEnumList(obj, number, arrayList, generatedExtension.descriptor.getEnumType(), ub2, q0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
            fieldSet.setField(generatedExtension.descriptor, arrayList);
        } else {
            Object objValueOf = null;
            if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
                switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(k0Var.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(k0Var.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(k0Var.readInt64());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(k0Var.readUInt64());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(k0Var.readInt32());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(k0Var.readFixed64());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(k0Var.readFixed32());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(k0Var.readBool());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(k0Var.readUInt32());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(k0Var.readSFixed32());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(k0Var.readSFixed64());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(k0Var.readSInt32());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(k0Var.readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = k0Var.readBytes();
                        break;
                    case 16:
                        objValueOf = k0Var.readString();
                        break;
                    case 17:
                        if (!generatedExtension.isRepeated()) {
                            Object field2 = fieldSet.getField(generatedExtension.descriptor);
                            if (field2 instanceof GeneratedMessageLite) {
                                l0 l0VarSchemaFor = h0.getInstance().schemaFor(field2);
                                if (!((GeneratedMessageLite) field2).isMutable()) {
                                    Object objNewInstance = l0VarSchemaFor.newInstance();
                                    l0VarSchemaFor.mergeFrom(objNewInstance, field2);
                                    fieldSet.setField(generatedExtension.descriptor, objNewInstance);
                                    field2 = objNewInstance;
                                }
                                k0Var.mergeGroupField(field2, l0VarSchemaFor, extensionRegistryLite);
                                return ub2;
                            }
                        }
                        objValueOf = k0Var.readGroup(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    case 18:
                        if (!generatedExtension.isRepeated()) {
                            Object field3 = fieldSet.getField(generatedExtension.descriptor);
                            if (field3 instanceof GeneratedMessageLite) {
                                l0 l0VarSchemaFor2 = h0.getInstance().schemaFor(field3);
                                if (!((GeneratedMessageLite) field3).isMutable()) {
                                    Object objNewInstance2 = l0VarSchemaFor2.newInstance();
                                    l0VarSchemaFor2.mergeFrom(objNewInstance2, field3);
                                    fieldSet.setField(generatedExtension.descriptor, objNewInstance2);
                                    field3 = objNewInstance2;
                                }
                                k0Var.mergeMessageField(field3, l0VarSchemaFor2, extensionRegistryLite);
                                return ub2;
                            }
                        }
                        objValueOf = k0Var.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                }
            } else {
                int int32 = k0Var.readInt32();
                if (generatedExtension.descriptor.getEnumType().findValueByNumber(int32) == null) {
                    return (UB) n0.storeUnknownEnum(obj, number, int32, ub2, q0Var);
                }
                objValueOf = Integer.valueOf(int32);
            }
            if (generatedExtension.isRepeated()) {
                fieldSet.addRepeatedField(generatedExtension.descriptor, objValueOf);
            } else {
                int i10 = a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()];
                if ((i10 == 17 || i10 == 18) && (field = fieldSet.getField(generatedExtension.descriptor)) != null) {
                    objValueOf = Internal.mergeMessage(field, objValueOf);
                }
                fieldSet.setField(generatedExtension.descriptor, objValueOf);
            }
        }
        return ub2;
    }

    @Override // com.google.protobuf.j
    public void parseLengthPrefixedMessageSetItem(k0 k0Var, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.setField(generatedExtension.descriptor, k0Var.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    @Override // com.google.protobuf.j
    public void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder builderNewBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        builderNewBuilderForType.mergeFrom(codedInputStreamNewCodedInput, extensionRegistryLite);
        fieldSet.setField(generatedExtension.descriptor, builderNewBuilderForType.buildPartial());
        codedInputStreamNewCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.j
    public void setExtensions(Object obj, FieldSet<GeneratedMessageLite.b> fieldSet) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions = fieldSet;
    }

    @Override // com.google.protobuf.j
    public int extensionNumber(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.b) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.j
    public Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i10) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i10);
    }

    @Override // com.google.protobuf.j
    public void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // com.google.protobuf.j
    public void serializeExtension(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.b bVar = (GeneratedMessageLite.b) entry.getKey();
        if (bVar.isRepeated()) {
            switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.getLiteType().ordinal()]) {
                case 1:
                    n0.writeDoubleList(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 2:
                    n0.writeFloatList(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 3:
                    n0.writeInt64List(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 4:
                    n0.writeUInt64List(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 5:
                    n0.writeInt32List(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 6:
                    n0.writeFixed64List(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 7:
                    n0.writeFixed32List(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 8:
                    n0.writeBoolList(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 9:
                    n0.writeUInt32List(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 10:
                    n0.writeSFixed32List(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 11:
                    n0.writeSFixed64List(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 12:
                    n0.writeSInt32List(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 13:
                    n0.writeSInt64List(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 14:
                    n0.writeInt32List(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                    break;
                case 15:
                    n0.writeBytesList(bVar.getNumber(), (List) entry.getValue(), writer);
                    break;
                case 16:
                    n0.writeStringList(bVar.getNumber(), (List) entry.getValue(), writer);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        n0.writeGroupList(bVar.getNumber(), (List) entry.getValue(), writer, h0.getInstance().schemaFor((Class) list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        n0.writeMessageList(bVar.getNumber(), (List) entry.getValue(), writer, h0.getInstance().schemaFor((Class) list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.getLiteType().ordinal()]) {
            case 1:
                writer.writeDouble(bVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                writer.writeFloat(bVar.getNumber(), ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                writer.writeInt64(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                writer.writeUInt64(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                writer.writeInt32(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                writer.writeFixed64(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                writer.writeFixed32(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                writer.writeBool(bVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                writer.writeUInt32(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                writer.writeSFixed32(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                writer.writeSFixed64(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                writer.writeSInt32(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                writer.writeSInt64(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                writer.writeInt32(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                writer.writeBytes(bVar.getNumber(), (ByteString) entry.getValue());
                break;
            case 16:
                writer.writeString(bVar.getNumber(), (String) entry.getValue());
                break;
            case 17:
                writer.writeGroup(bVar.getNumber(), entry.getValue(), h0.getInstance().schemaFor((Class) entry.getValue().getClass()));
                break;
            case 18:
                writer.writeMessage(bVar.getNumber(), entry.getValue(), h0.getInstance().schemaFor((Class) entry.getValue().getClass()));
                break;
        }
    }
}
