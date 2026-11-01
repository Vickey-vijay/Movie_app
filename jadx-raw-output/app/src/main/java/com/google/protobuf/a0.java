package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: MessageSchema.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a0<T> implements l0<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    public static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final j<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final r listFieldSchema;
    private final boolean lite;
    private final u mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final c0 newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final q0<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = s0.getUnsafe();

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i10, int i11, MapEntryLite.b<K, V> bVar, Map<K, V> map, c.b bVar2) throws IOException {
        int iDecodeVarint32;
        int iDecodeVarint33 = c.decodeVarint32(bArr, i10, bVar2);
        int i12 = bVar2.int1;
        if (i12 < 0 || i12 > i11 - iDecodeVarint33) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = iDecodeVarint33 + i12;
        Object obj = bVar.defaultKey;
        Object obj2 = bVar.defaultValue;
        while (iDecodeVarint33 < i13) {
            int i14 = iDecodeVarint33 + 1;
            int i15 = bArr[iDecodeVarint33];
            if (i15 < 0) {
                iDecodeVarint32 = c.decodeVarint32(i15, bArr, i14, bVar2);
                i15 = bVar2.int1;
            } else {
                iDecodeVarint32 = i14;
            }
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == bVar.valueType.getWireType()) {
                    iDecodeVarint33 = decodeMapEntryValue(bArr, iDecodeVarint32, i11, bVar.valueType, bVar.defaultValue.getClass(), bVar2);
                    obj2 = bVar2.object1;
                } else {
                    iDecodeVarint33 = c.skipField(i15, bArr, iDecodeVarint32, i11, bVar2);
                }
            } else if (i17 == bVar.keyType.getWireType()) {
                iDecodeVarint33 = decodeMapEntryValue(bArr, iDecodeVarint32, i11, bVar.keyType, null, bVar2);
                obj = bVar2.object1;
            } else {
                iDecodeVarint33 = c.skipField(i15, bArr, iDecodeVarint32, i11, bVar2);
            }
        }
        if (iDecodeVarint33 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i13;
    }

    private static boolean isEnforceUtf8(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean isFieldPresent(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return isFieldPresent(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    private static boolean isRequired(int i10) {
        return (i10 & 268435456) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0646 A[Catch: all -> 0x069e, TRY_LEAVE, TryCatch #12 {all -> 0x069e, blocks: (B:156:0x0617, B:167:0x0640, B:169:0x0646, B:179:0x066e, B:180:0x0673), top: B:212:0x0617 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0653 A[LOOP:2: B:172:0x064f->B:174:0x0653, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x0668  */
    /* JADX WARN: Code duplicated, block: B:178:0x066c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x066e A[Catch: all -> 0x069e, TRY_ENTER, TryCatch #12 {all -> 0x069e, blocks: (B:156:0x0617, B:167:0x0640, B:169:0x0646, B:179:0x066e, B:180:0x0673), top: B:212:0x0617 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0680 A[LOOP:3: B:183:0x067c->B:185:0x0680, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x0695  */
    /* JADX WARN: Code duplicated, block: B:201:0x06af A[LOOP:4: B:199:0x06ab->B:201:0x06af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:231:0x064c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0679 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(q0<UT, UB> q0Var, j<ET> jVar, T t10, k0 k0Var, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        T t11;
        q0 q0Var2;
        int i10;
        Object objFilterMapUnknownEnumValues;
        T t12;
        ExtensionRegistryLite extensionRegistryLite2;
        int i11;
        Object objFilterMapUnknownEnumValues2;
        int i12;
        Object objFilterMapUnknownEnumValues3;
        Object obj;
        q0 q0Var3 = q0Var;
        T t13 = t10;
        ExtensionRegistryLite extensionRegistryLite3 = extensionRegistryLite;
        Object builderFromMessage = null;
        Object obj2 = null;
        while (true) {
            try {
                int fieldNumber = k0Var.getFieldNumber();
                int iPositionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (iPositionForFieldNumber >= 0) {
                    t11 = t13;
                    try {
                        int iTypeAndOffsetAt = typeAndOffsetAt(iPositionForFieldNumber);
                        try {
                            switch (type(iTypeAndOffsetAt)) {
                                case 0:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putDouble(t11, offset(iTypeAndOffsetAt), k0Var.readDouble());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 1:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putFloat(t11, offset(iTypeAndOffsetAt), k0Var.readFloat());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 2:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putLong(t11, offset(iTypeAndOffsetAt), k0Var.readInt64());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 3:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putLong(t11, offset(iTypeAndOffsetAt), k0Var.readUInt64());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 4:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putInt(t11, offset(iTypeAndOffsetAt), k0Var.readInt32());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 5:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putLong(t11, offset(iTypeAndOffsetAt), k0Var.readFixed64());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 6:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putInt(t11, offset(iTypeAndOffsetAt), k0Var.readFixed32());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 7:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putBoolean(t11, offset(iTypeAndOffsetAt), k0Var.readBool());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 8:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    readString(t11, iTypeAndOffsetAt, k0Var);
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 9:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    MessageLite messageLite = (MessageLite) mutableMessageFieldForMerge(t11, iPositionForFieldNumber);
                                    k0Var.mergeMessageField(messageLite, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2);
                                    storeMessageField(t11, iPositionForFieldNumber, messageLite);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 10:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), k0Var.readBytes());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 11:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putInt(t11, offset(iTypeAndOffsetAt), k0Var.readUInt32());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 12:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    int i13 = k0Var.readEnum();
                                    Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(iPositionForFieldNumber);
                                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i13)) {
                                        s0.putInt(t11, offset(iTypeAndOffsetAt), i13);
                                        setFieldPresent(t11, iPositionForFieldNumber);
                                        builderFromMessage = obj;
                                    } else {
                                        builderFromMessage = n0.storeUnknownEnum(t11, fieldNumber, i13, obj, q0Var2);
                                    }
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 13:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putInt(t11, offset(iTypeAndOffsetAt), k0Var.readSFixed32());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 14:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putLong(t11, offset(iTypeAndOffsetAt), k0Var.readSFixed64());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 15:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putInt(t11, offset(iTypeAndOffsetAt), k0Var.readSInt32());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 16:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    s0.putLong(t11, offset(iTypeAndOffsetAt), k0Var.readSInt64());
                                    setFieldPresent(t11, iPositionForFieldNumber);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 17:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    MessageLite messageLite2 = (MessageLite) mutableMessageFieldForMerge(t11, iPositionForFieldNumber);
                                    k0Var.mergeGroupField(messageLite2, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite2);
                                    storeMessageField(t11, iPositionForFieldNumber, messageLite2);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 18:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readDoubleList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 19:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readFloatList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 20:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readInt64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 21:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readUInt64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 22:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readInt32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 23:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readFixed64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 24:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readFixed32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 25:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readBoolList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 26:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    readStringList(t11, iTypeAndOffsetAt, k0Var);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 27:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    readMessageList(t10, iTypeAndOffsetAt, k0Var, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 28:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readBytesList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 29:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readUInt32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 30:
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    List<Integer> listMutableListAt = this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt));
                                    k0Var.readEnumList(listMutableListAt);
                                    builderFromMessage = n0.filterUnknownEnumList(t10, fieldNumber, listMutableListAt, getEnumFieldVerifier(iPositionForFieldNumber), builderFromMessage, q0Var);
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 31:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readSFixed32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 32:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readSFixed64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 33:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readSInt32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 34:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readSInt64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 35:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readDoubleList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 36:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readFloatList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 37:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readInt64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 38:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readUInt64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 39:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readInt32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 40:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readFixed64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 41:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readFixed32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 42:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readBoolList(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 43:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readUInt32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 44:
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    List<Integer> listMutableListAt2 = this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt));
                                    k0Var.readEnumList(listMutableListAt2);
                                    builderFromMessage = n0.filterUnknownEnumList(t10, fieldNumber, listMutableListAt2, getEnumFieldVerifier(iPositionForFieldNumber), builderFromMessage, q0Var);
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 45:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readSFixed32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 46:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readSFixed64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 47:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readSInt32List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 48:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    k0Var.readSInt64List(this.listFieldSchema.mutableListAt(t11, offset(iTypeAndOffsetAt)));
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 49:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    readGroupList(t10, offset(iTypeAndOffsetAt), k0Var, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 50:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    try {
                                        mergeMap(t10, iPositionForFieldNumber, getMapFieldDefaultEntry(iPositionForFieldNumber), extensionRegistryLite, k0Var);
                                        q0Var2 = q0Var3;
                                        builderFromMessage = obj;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                        q0Var2 = q0Var3;
                                        builderFromMessage = obj;
                                        if (q0Var2.shouldDiscardUnknownFields(k0Var)) {
                                            if (builderFromMessage == null) {
                                                builderFromMessage = q0Var2.getBuilderFromMessage(t11);
                                            }
                                            if (!q0Var2.mergeOneFieldFrom(builderFromMessage, k0Var, 0)) {
                                                objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                for (i11 = this.checkInitializedCount; i11 < this.repeatedFieldOffsetStart; i11++) {
                                                    objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t10, this.intArray[i11], objFilterMapUnknownEnumValues2, q0Var, t10);
                                                }
                                                if (objFilterMapUnknownEnumValues2 != null) {
                                                    q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } else if (!k0Var.skipField()) {
                                            objFilterMapUnknownEnumValues3 = builderFromMessage;
                                            for (i12 = this.checkInitializedCount; i12 < this.repeatedFieldOffsetStart; i12++) {
                                                objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t10, this.intArray[i12], objFilterMapUnknownEnumValues3, q0Var, t10);
                                            }
                                            if (objFilterMapUnknownEnumValues3 != null) {
                                                q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues3);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        q0Var2 = q0Var3;
                                        builderFromMessage = obj;
                                        objFilterMapUnknownEnumValues = builderFromMessage;
                                        for (i10 = this.checkInitializedCount; i10 < this.repeatedFieldOffsetStart; i10++) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i10], objFilterMapUnknownEnumValues, q0Var, t10);
                                        }
                                        if (objFilterMapUnknownEnumValues != null) {
                                            q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues);
                                        }
                                        throw th;
                                    }
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 51:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Double.valueOf(k0Var.readDouble()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 52:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Float.valueOf(k0Var.readFloat()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 53:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Long.valueOf(k0Var.readInt64()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 54:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Long.valueOf(k0Var.readUInt64()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 55:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Integer.valueOf(k0Var.readInt32()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 56:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Long.valueOf(k0Var.readFixed64()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 57:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Integer.valueOf(k0Var.readFixed32()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 58:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Boolean.valueOf(k0Var.readBool()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 59:
                                    readString(t11, iTypeAndOffsetAt, k0Var);
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 60:
                                    MessageLite messageLite3 = (MessageLite) mutableOneofMessageFieldForMerge(t11, fieldNumber, iPositionForFieldNumber);
                                    k0Var.mergeMessageField(messageLite3, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite3);
                                    storeOneofMessageField(t11, fieldNumber, iPositionForFieldNumber, messageLite3);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 61:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), k0Var.readBytes());
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 62:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Integer.valueOf(k0Var.readUInt32()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 63:
                                    int i14 = k0Var.readEnum();
                                    Internal.EnumVerifier enumFieldVerifier2 = getEnumFieldVerifier(iPositionForFieldNumber);
                                    if (enumFieldVerifier2 == null || enumFieldVerifier2.isInRange(i14)) {
                                        s0.putObject(t11, offset(iTypeAndOffsetAt), Integer.valueOf(i14));
                                        setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                        obj = builderFromMessage;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        q0Var2 = q0Var3;
                                        builderFromMessage = obj;
                                    } else {
                                        builderFromMessage = n0.storeUnknownEnum(t11, fieldNumber, i14, builderFromMessage, q0Var3);
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        q0Var2 = q0Var3;
                                    }
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 64:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Integer.valueOf(k0Var.readSFixed32()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 65:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Long.valueOf(k0Var.readSFixed64()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 66:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Integer.valueOf(k0Var.readSInt32()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 67:
                                    s0.putObject(t11, offset(iTypeAndOffsetAt), Long.valueOf(k0Var.readSInt64()));
                                    setOneofPresent(t11, fieldNumber, iPositionForFieldNumber);
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    builderFromMessage = obj;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                case 68:
                                    try {
                                        MessageLite messageLite4 = (MessageLite) mutableOneofMessageFieldForMerge(t11, fieldNumber, iPositionForFieldNumber);
                                        k0Var.mergeGroupField(messageLite4, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite3);
                                        storeOneofMessageField(t11, fieldNumber, iPositionForFieldNumber, messageLite4);
                                        obj = builderFromMessage;
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        q0Var2 = q0Var3;
                                        builderFromMessage = obj;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        q0Var2 = q0Var3;
                                        if (q0Var2.shouldDiscardUnknownFields(k0Var)) {
                                            if (builderFromMessage == null) {
                                                builderFromMessage = q0Var2.getBuilderFromMessage(t11);
                                            }
                                            if (!q0Var2.mergeOneFieldFrom(builderFromMessage, k0Var, 0)) {
                                                objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                while (i11 < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t10, this.intArray[i11], objFilterMapUnknownEnumValues2, q0Var, t10);
                                                }
                                                if (objFilterMapUnknownEnumValues2 != null) {
                                                    q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } else if (!k0Var.skipField()) {
                                            objFilterMapUnknownEnumValues3 = builderFromMessage;
                                            while (i12 < this.repeatedFieldOffsetStart) {
                                                objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t10, this.intArray[i12], objFilterMapUnknownEnumValues3, q0Var, t10);
                                            }
                                            if (objFilterMapUnknownEnumValues3 != null) {
                                                q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues3);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        q0Var2 = q0Var3;
                                        objFilterMapUnknownEnumValues = builderFromMessage;
                                        while (i10 < this.repeatedFieldOffsetStart) {
                                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i10], objFilterMapUnknownEnumValues, q0Var, t10);
                                        }
                                        if (objFilterMapUnknownEnumValues != null) {
                                            q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues);
                                        }
                                        throw th;
                                    }
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    q0Var3 = q0Var2;
                                    t13 = t11;
                                    break;
                                default:
                                    obj = builderFromMessage;
                                    extensionRegistryLite2 = extensionRegistryLite3;
                                    q0Var2 = q0Var3;
                                    if (obj == null) {
                                        try {
                                            builderFromMessage = q0Var2.getBuilderFromMessage(t11);
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                            builderFromMessage = obj;
                                            if (q0Var2.shouldDiscardUnknownFields(k0Var)) {
                                                if (builderFromMessage == null) {
                                                    builderFromMessage = q0Var2.getBuilderFromMessage(t11);
                                                }
                                                if (!q0Var2.mergeOneFieldFrom(builderFromMessage, k0Var, 0)) {
                                                    objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                    while (i11 < this.repeatedFieldOffsetStart) {
                                                        objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t10, this.intArray[i11], objFilterMapUnknownEnumValues2, q0Var, t10);
                                                    }
                                                    if (objFilterMapUnknownEnumValues2 != null) {
                                                        q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!k0Var.skipField()) {
                                                objFilterMapUnknownEnumValues3 = builderFromMessage;
                                                while (i12 < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t10, this.intArray[i12], objFilterMapUnknownEnumValues3, q0Var, t10);
                                                }
                                                if (objFilterMapUnknownEnumValues3 != null) {
                                                    q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues3);
                                                    return;
                                                }
                                                return;
                                            }
                                            extensionRegistryLite3 = extensionRegistryLite2;
                                            q0Var3 = q0Var2;
                                            t13 = t11;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            builderFromMessage = obj;
                                        }
                                    } else {
                                        builderFromMessage = obj;
                                    }
                                    try {
                                        try {
                                            if (!q0Var2.mergeOneFieldFrom(builderFromMessage, k0Var, 0)) {
                                                Object objFilterMapUnknownEnumValues4 = builderFromMessage;
                                                for (int i15 = this.checkInitializedCount; i15 < this.repeatedFieldOffsetStart; i15++) {
                                                    objFilterMapUnknownEnumValues4 = filterMapUnknownEnumValues(t10, this.intArray[i15], objFilterMapUnknownEnumValues4, q0Var, t10);
                                                }
                                                if (objFilterMapUnknownEnumValues4 != null) {
                                                    q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues4);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            if (q0Var2.shouldDiscardUnknownFields(k0Var)) {
                                                if (builderFromMessage == null) {
                                                    builderFromMessage = q0Var2.getBuilderFromMessage(t11);
                                                }
                                                if (!q0Var2.mergeOneFieldFrom(builderFromMessage, k0Var, 0)) {
                                                    objFilterMapUnknownEnumValues2 = builderFromMessage;
                                                    while (i11 < this.repeatedFieldOffsetStart) {
                                                        objFilterMapUnknownEnumValues2 = filterMapUnknownEnumValues(t10, this.intArray[i11], objFilterMapUnknownEnumValues2, q0Var, t10);
                                                    }
                                                    if (objFilterMapUnknownEnumValues2 != null) {
                                                        q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } else if (!k0Var.skipField()) {
                                                objFilterMapUnknownEnumValues3 = builderFromMessage;
                                                while (i12 < this.repeatedFieldOffsetStart) {
                                                    objFilterMapUnknownEnumValues3 = filterMapUnknownEnumValues(t10, this.intArray[i12], objFilterMapUnknownEnumValues3, q0Var, t10);
                                                }
                                                if (objFilterMapUnknownEnumValues3 != null) {
                                                    q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        extensionRegistryLite3 = extensionRegistryLite2;
                                        q0Var3 = q0Var2;
                                        t13 = t11;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                    break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        Object objFilterMapUnknownEnumValues5 = builderFromMessage;
                        for (int i16 = this.checkInitializedCount; i16 < this.repeatedFieldOffsetStart; i16++) {
                            objFilterMapUnknownEnumValues5 = filterMapUnknownEnumValues(t10, this.intArray[i16], objFilterMapUnknownEnumValues5, q0Var, t10);
                        }
                        if (objFilterMapUnknownEnumValues5 != null) {
                            q0Var3.setBuilderToMessage(t13, objFilterMapUnknownEnumValues5);
                            return;
                        }
                        return;
                    }
                    try {
                        Object objFindExtensionByNumber = !this.hasExtensions ? null : jVar.findExtensionByNumber(extensionRegistryLite3, this.defaultInstance, fieldNumber);
                        if (objFindExtensionByNumber != null) {
                            Object mutableExtensions = obj2 == null ? jVar.getMutableExtensions(t10) : obj2;
                            t12 = t13;
                            try {
                                builderFromMessage = jVar.parseExtension(t10, k0Var, objFindExtensionByNumber, extensionRegistryLite, mutableExtensions, builderFromMessage, q0Var);
                                obj2 = mutableExtensions;
                            } catch (Throwable th7) {
                                th = th7;
                                t11 = t12;
                                q0Var2 = q0Var3;
                                objFilterMapUnknownEnumValues = builderFromMessage;
                                while (i10 < this.repeatedFieldOffsetStart) {
                                    objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i10], objFilterMapUnknownEnumValues, q0Var, t10);
                                }
                                if (objFilterMapUnknownEnumValues != null) {
                                    q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues);
                                }
                                throw th;
                            }
                        } else {
                            t12 = t13;
                            if (!q0Var3.shouldDiscardUnknownFields(k0Var)) {
                                if (builderFromMessage == null) {
                                    builderFromMessage = q0Var3.getBuilderFromMessage(t12);
                                }
                                if (!q0Var3.mergeOneFieldFrom(builderFromMessage, k0Var, 0)) {
                                }
                            } else if (!k0Var.skipField()) {
                            }
                        }
                        t13 = t12;
                    } catch (Throwable th8) {
                        th = th8;
                        t11 = t13;
                        q0Var2 = q0Var3;
                        objFilterMapUnknownEnumValues = builderFromMessage;
                        while (i10 < this.repeatedFieldOffsetStart) {
                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i10], objFilterMapUnknownEnumValues, q0Var, t10);
                        }
                        if (objFilterMapUnknownEnumValues != null) {
                            q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
            }
            objFilterMapUnknownEnumValues = builderFromMessage;
            while (i10 < this.repeatedFieldOffsetStart) {
                objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i10], objFilterMapUnknownEnumValues, q0Var, t10);
            }
            if (objFilterMapUnknownEnumValues != null) {
                q0Var2.setBuilderToMessage(t11, objFilterMapUnknownEnumValues);
            }
            throw th;
        }
        int i17 = this.checkInitializedCount;
        Object objFilterMapUnknownEnumValues6 = builderFromMessage;
        while (i17 < this.repeatedFieldOffsetStart) {
            objFilterMapUnknownEnumValues6 = filterMapUnknownEnumValues(t10, this.intArray[i17], objFilterMapUnknownEnumValues6, q0Var, t10);
            i17++;
            t12 = t12;
        }
        T t14 = t12;
        if (objFilterMapUnknownEnumValues6 != null) {
            q0Var3.setBuilderToMessage(t14, objFilterMapUnknownEnumValues6);
        }
    }

    private static long offset(int i10) {
        return i10 & 1048575;
    }

    private <K, V> int parseMapField(T t10, byte[] bArr, int i10, int i11, int i12, long j10, c.b bVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t10, j10, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i10, i11, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), bVar);
    }

    private int parseOneofField(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, c.b bVar) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j11 = this.buffer[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Double.valueOf(c.decodeDouble(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Float.valueOf(c.decodeFloat(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint64 = c.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(bVar.long1));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint32 = c.decodeVarint32(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(bVar.int1));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Long.valueOf(c.decodeFixed64(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(c.decodeFixed32(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint65 = c.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Boolean.valueOf(bVar.long1 != 0));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint65;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeVarint33 = c.decodeVarint32(bArr, i10, bVar);
                int i22 = bVar.int1;
                if (i22 == 0) {
                    unsafe.putObject(t10, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint33, iDecodeVarint33 + i22)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, iDecodeVarint33, i22, Internal.UTF_8));
                    iDecodeVarint33 += i22;
                }
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint33;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t10, i13, i17);
                int iMergeMessageField = c.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i17), bArr, i10, i11, bVar);
                storeOneofMessageField(t10, i13, i17, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeBytes = c.decodeBytes(bArr, i10, bVar);
                unsafe.putObject(t10, j10, bVar.object1);
                unsafe.putInt(t10, j11, i13);
                return iDecodeBytes;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint34 = c.decodeVarint32(bArr, i10, bVar);
                int i23 = bVar.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i17);
                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i23)) {
                    unsafe.putObject(t10, j10, Integer.valueOf(i23));
                    unsafe.putInt(t10, j11, i13);
                } else {
                    getMutableUnknownFields(t10).storeField(i12, Long.valueOf(i23));
                }
                return iDecodeVarint34;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint35 = c.decodeVarint32(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.int1)));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint35;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint66 = c.decodeVarint64(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(CodedInputStream.decodeZigZag64(bVar.long1)));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint66;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t10, i13, i17);
                int iMergeGroupField = c.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                storeOneofMessageField(t10, i13, i17, objMutableOneofMessageFieldForMerge2);
                return iMergeGroupField;
            default:
                return i10;
        }
    }

    private int parseRepeatedField(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, c.b bVar) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t10, j11);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, protobufListMutableCopyWithCapacity2);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return c.decodePackedDoubleList(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 1 ? c.decodeDoubleList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return c.decodePackedFloatList(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 5 ? c.decodeFloatList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return c.decodePackedVarint64List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? c.decodeVarint64List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return c.decodePackedVarint32List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? c.decodeVarint32List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return c.decodePackedFixed64List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 1 ? c.decodeFixed64List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return c.decodePackedFixed32List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 5 ? c.decodeFixed32List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return c.decodePackedBoolList(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? c.decodeBoolList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? c.decodeStringList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : c.decodeStringListRequireUtf8(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i10;
            case 27:
                return i14 == 2 ? c.decodeMessageList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 28:
                return i14 == 2 ? c.decodeBytesList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 30:
            case 44:
                if (i14 == 2) {
                    iDecodeVarint32List = c.decodePackedVarint32List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                } else {
                    if (i14 != 0) {
                        return i10;
                    }
                    iDecodeVarint32List = c.decodeVarint32List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar);
                }
                n0.filterUnknownEnumList((Object) t10, i13, (List<Integer>) protobufListMutableCopyWithCapacity2, getEnumFieldVerifier(i15), (Object) null, (q0<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i14 == 2) {
                    return c.decodePackedSInt32List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? c.decodeSInt32List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return c.decodePackedSInt64List(bArr, i10, protobufListMutableCopyWithCapacity2, bVar);
                }
                return i14 == 0 ? c.decodeSInt64List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            case 49:
                return i14 == 3 ? c.decodeGroupList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, bVar) : i10;
            default:
                return i10;
        }
    }

    private int positionForFieldNumber(int i10) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, 0);
    }

    private static int type(int i10) {
        return (i10 & FIELD_TYPE_MASK) >>> 20;
    }

    @Override // com.google.protobuf.l0
    public boolean equals(T t10, T t11) {
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!equals(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t10).equals(this.unknownFieldSchema.getFromMessage(t11))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t10).equals(this.extensionSchema.getExtensions(t11));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa A[SYNTHETIC] */
    @Override // com.google.protobuf.l0
    public final boolean isInitialized(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.checkInitializedCount) {
            int i15 = this.intArray[i14];
            int iNumberAt = numberAt(i15);
            int iTypeAndOffsetAt = typeAndOffsetAt(i15);
            int i16 = this.buffer[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = UNSAFE.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (isRequired(iTypeAndOffsetAt) && !isFieldPresent(t10, i15, i10, i11, i18)) {
                return false;
            }
            int iType = type(iTypeAndOffsetAt);
            if (iType == 9 || iType == 17) {
                if (isFieldPresent(t10, i15, i10, i11, i18) && !isInitialized(t10, iTypeAndOffsetAt, getMessageFieldSchema(i15))) {
                    return false;
                }
            } else if (iType == 27) {
                if (!isListInitialized(t10, iTypeAndOffsetAt, i15)) {
                    return false;
                }
            } else if (iType == 60 || iType == 68) {
                if (isOneofPresent(t10, iNumberAt, i15) && !isInitialized(t10, iTypeAndOffsetAt, getMessageFieldSchema(i15))) {
                    return false;
                }
            } else if (iType != 49) {
                if (iType == 50 && !isMapInitialized(t10, iTypeAndOffsetAt, i15)) {
                    return false;
                }
            } else if (!isListInitialized(t10, iTypeAndOffsetAt, i15)) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return !this.hasExtensions || this.extensionSchema.getExtensions(t10).isInitialized();
    }

    @Override // com.google.protobuf.l0
    public void mergeFrom(T t10, T t11) {
        checkMutable(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            mergeSingleField(t10, t11, i10);
        }
        n0.mergeUnknownFields(this.unknownFieldSchema, t10, t11);
        if (this.hasExtensions) {
            n0.mergeExtensions(this.extensionSchema, t10, t11);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0099. Please report as an issue. */
    public int parseMessage(T t10, byte[] bArr, int i10, int i11, int i12, c.b bVar) throws IOException {
        Unsafe unsafe;
        a0<T> a0Var;
        int i13;
        int i14;
        int i15;
        int i16;
        T t11;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        byte[] bArr2;
        int i24;
        int i25;
        byte b10;
        byte[] bArr3;
        int iDecodeVarint64;
        int i26;
        int i27;
        a0<T> a0Var2 = this;
        T t12 = t10;
        byte[] bArr4 = bArr;
        i11 = i11;
        i12 = i12;
        c.b bVar2 = bVar;
        checkMutable(t10);
        Unsafe unsafe2 = UNSAFE;
        int iDecodeUnknownField = i10;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = -1;
        int i32 = 1048575;
        while (true) {
            if (iDecodeUnknownField < i11) {
                int i33 = iDecodeUnknownField + 1;
                byte b11 = bArr4[iDecodeUnknownField];
                if (b11 < 0) {
                    int iDecodeVarint32 = c.decodeVarint32(b11, bArr4, i33, bVar2);
                    i17 = bVar2.int1;
                    i33 = iDecodeVarint32;
                } else {
                    i17 = b11;
                }
                int i34 = i17 >>> 3;
                int i35 = i17 & 7;
                int iPositionForFieldNumber = i34 > i31 ? a0Var2.positionForFieldNumber(i34, i28 / 3) : a0Var2.positionForFieldNumber(i34);
                if (iPositionForFieldNumber == -1) {
                    i18 = i34;
                    i19 = i33;
                    i14 = i17;
                    i20 = i30;
                    i21 = i32;
                    unsafe = unsafe2;
                    i12 = i12;
                    i22 = 0;
                } else {
                    int i36 = a0Var2.buffer[iPositionForFieldNumber + 1];
                    int iType = type(i36);
                    long jOffset = offset(i36);
                    int i37 = i17;
                    if (iType <= 17) {
                        int i38 = a0Var2.buffer[iPositionForFieldNumber + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = 1048575;
                        int i41 = i38 & 1048575;
                        if (i41 != i32) {
                            if (i32 != 1048575) {
                                unsafe2.putInt(t12, i32, i30);
                                i40 = 1048575;
                            }
                            i21 = i41;
                            i23 = i41 == i40 ? 0 : unsafe2.getInt(t12, i41);
                        } else {
                            i23 = i30;
                            i21 = i32;
                        }
                        switch (iType) {
                            case 0:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 1) {
                                    s0.putDouble(t12, jOffset, c.decodeDouble(bArr2, i33));
                                    iDecodeUnknownField = i33 + 8;
                                    i30 = i23 | i39;
                                    bArr4 = bArr2;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 1:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 5) {
                                    s0.putFloat(t12, jOffset, c.decodeFloat(bArr2, i33));
                                    iDecodeUnknownField = i33 + 4;
                                    i30 = i23 | i39;
                                    bArr4 = bArr2;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 0) {
                                    iDecodeVarint64 = c.decodeVarint64(bArr3, i33, bVar2);
                                    unsafe2.putLong(t10, jOffset, bVar2.long1);
                                    i30 = i23 | i39;
                                    bArr4 = bArr3;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 0) {
                                    iDecodeUnknownField = c.decodeVarint32(bArr2, i33, bVar2);
                                    unsafe2.putInt(t12, jOffset, bVar2.int1);
                                    i30 = i23 | i39;
                                    bArr4 = bArr2;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 1) {
                                    unsafe2.putLong(t10, jOffset, c.decodeFixed64(bArr2, i33));
                                    iDecodeUnknownField = i33 + 8;
                                    i30 = i23 | i39;
                                    bArr4 = bArr2;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 5) {
                                    unsafe2.putInt(t12, jOffset, c.decodeFixed32(bArr2, i33));
                                    iDecodeUnknownField = i33 + 4;
                                    i30 = i23 | i39;
                                    bArr4 = bArr2;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 7:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 0) {
                                    iDecodeUnknownField = c.decodeVarint64(bArr2, i33, bVar2);
                                    s0.putBoolean(t12, jOffset, bVar2.long1 != 0);
                                    i30 = i23 | i39;
                                    bArr4 = bArr2;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 8:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 2) {
                                    iDecodeUnknownField = isEnforceUtf8(i36) ? c.decodeStringRequireUtf8(bArr2, i33, bVar2) : c.decodeString(bArr2, i33, bVar2);
                                    unsafe2.putObject(t12, jOffset, bVar2.object1);
                                    i30 = i23 | i39;
                                    bArr4 = bArr2;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 2) {
                                    Object objMutableMessageFieldForMerge = a0Var2.mutableMessageFieldForMerge(t12, i24);
                                    iDecodeUnknownField = c.mergeMessageField(objMutableMessageFieldForMerge, a0Var2.getMessageFieldSchema(i24), bArr, i33, i11, bVar);
                                    a0Var2.storeMessageField(t12, i24, objMutableMessageFieldForMerge);
                                    i30 = i23 | i39;
                                    bArr4 = bArr2;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 10:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 2) {
                                    iDecodeUnknownField = c.decodeBytes(bArr2, i33, bVar2);
                                    unsafe2.putObject(t12, jOffset, bVar2.object1);
                                    i30 = i23 | i39;
                                    bArr4 = bArr2;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 12:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 0) {
                                    iDecodeUnknownField = c.decodeVarint32(bArr2, i33, bVar2);
                                    int i42 = bVar2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = a0Var2.getEnumFieldVerifier(i24);
                                    if (!isLegacyEnumIsClosed(i36) || enumFieldVerifier == null || enumFieldVerifier.isInRange(i42)) {
                                        unsafe2.putInt(t12, jOffset, i42);
                                        i30 = i23 | i39;
                                        bArr4 = bArr2;
                                        i28 = i24;
                                        i29 = i25;
                                        i32 = i21;
                                        i31 = i18;
                                    } else {
                                        getMutableUnknownFields(t10).storeField(i25, Long.valueOf(i42));
                                        i12 = i12;
                                        i28 = i24;
                                        i30 = i23;
                                        i29 = i25;
                                        i31 = i18;
                                        bArr4 = bArr2;
                                        i32 = i21;
                                    }
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                if (i35 == 0) {
                                    iDecodeUnknownField = c.decodeVarint32(bArr2, i33, bVar2);
                                    unsafe2.putInt(t12, jOffset, CodedInputStream.decodeZigZag32(bVar2.int1));
                                    i30 = i23 | i39;
                                    bArr4 = bArr2;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 16:
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                bArr3 = bArr;
                                if (i35 == 0) {
                                    iDecodeVarint64 = c.decodeVarint64(bArr3, i33, bVar2);
                                    unsafe2.putLong(t10, jOffset, CodedInputStream.decodeZigZag64(bVar2.long1));
                                    i30 = i23 | i39;
                                    bArr4 = bArr3;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            case 17:
                                if (i35 == 3) {
                                    Object objMutableMessageFieldForMerge2 = a0Var2.mutableMessageFieldForMerge(t12, iPositionForFieldNumber);
                                    i18 = i34;
                                    i24 = iPositionForFieldNumber;
                                    i25 = i37;
                                    iDecodeUnknownField = c.mergeGroupField(objMutableMessageFieldForMerge2, a0Var2.getMessageFieldSchema(iPositionForFieldNumber), bArr, i33, i11, (i34 << 3) | 4, bVar);
                                    a0Var2.storeMessageField(t12, i24, objMutableMessageFieldForMerge2);
                                    i30 = i23 | i39;
                                    bArr4 = bArr;
                                    i28 = i24;
                                    i29 = i25;
                                    i32 = i21;
                                    i31 = i18;
                                } else {
                                    i18 = i34;
                                    i24 = iPositionForFieldNumber;
                                    i25 = i37;
                                    b10 = -1;
                                    i19 = i33;
                                    i22 = i24;
                                    unsafe = unsafe2;
                                    i20 = i23;
                                    i14 = i25;
                                    i12 = i12;
                                }
                                break;
                            default:
                                i18 = i34;
                                i24 = iPositionForFieldNumber;
                                i25 = i37;
                                b10 = -1;
                                i19 = i33;
                                i22 = i24;
                                unsafe = unsafe2;
                                i20 = i23;
                                i14 = i25;
                                i12 = i12;
                                break;
                        }
                    } else {
                        i18 = i34;
                        int i43 = i32;
                        i20 = i30;
                        if (iType != 27) {
                            i21 = i43;
                            if (iType <= 49) {
                                int i44 = i33;
                                unsafe = unsafe2;
                                i22 = iPositionForFieldNumber;
                                i27 = i37;
                                iDecodeUnknownField = parseRepeatedField(t10, bArr, i33, i11, i37, i18, i35, iPositionForFieldNumber, i36, iType, jOffset, bVar);
                                if (iDecodeUnknownField != i44) {
                                    a0Var2 = this;
                                    t12 = t10;
                                    bArr4 = bArr;
                                    i12 = i12;
                                    bVar2 = bVar;
                                    i29 = i27;
                                    i30 = i20;
                                    i28 = i22;
                                    i32 = i21;
                                    i31 = i18;
                                    unsafe2 = unsafe;
                                } else {
                                    i19 = iDecodeUnknownField;
                                    i14 = i27;
                                }
                            } else {
                                i26 = i33;
                                unsafe = unsafe2;
                                i22 = iPositionForFieldNumber;
                                i27 = i37;
                                if (iType != 50) {
                                    iDecodeUnknownField = parseOneofField(t10, bArr, i26, i11, i27, i18, i35, i36, iType, jOffset, i22, bVar);
                                    if (iDecodeUnknownField != i26) {
                                        a0Var2 = this;
                                        t12 = t10;
                                        bArr4 = bArr;
                                        i12 = i12;
                                        bVar2 = bVar;
                                        i29 = i27;
                                        i30 = i20;
                                        i28 = i22;
                                        i32 = i21;
                                        i31 = i18;
                                        unsafe2 = unsafe;
                                    } else {
                                        i19 = iDecodeUnknownField;
                                        i14 = i27;
                                    }
                                } else if (i35 == 2) {
                                    iDecodeUnknownField = parseMapField(t10, bArr, i26, i11, i22, jOffset, bVar);
                                    if (iDecodeUnknownField != i26) {
                                        a0Var2 = this;
                                        t12 = t10;
                                        bArr4 = bArr;
                                        i12 = i12;
                                        bVar2 = bVar;
                                        i29 = i27;
                                        i30 = i20;
                                        i28 = i22;
                                        i32 = i21;
                                        i31 = i18;
                                        unsafe2 = unsafe;
                                    } else {
                                        i19 = iDecodeUnknownField;
                                        i14 = i27;
                                    }
                                }
                            }
                        } else if (i35 == 2) {
                            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject(t12, jOffset);
                            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                int size = protobufListMutableCopyWithCapacity2.size();
                                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t12, jOffset, protobufListMutableCopyWithCapacity2);
                            }
                            iDecodeUnknownField = c.decodeMessageList(a0Var2.getMessageFieldSchema(iPositionForFieldNumber), i37, bArr, i33, i11, protobufListMutableCopyWithCapacity2, bVar);
                            i12 = i12;
                            i28 = iPositionForFieldNumber;
                            i29 = i37;
                            i30 = i20;
                            i32 = i43;
                            i31 = i18;
                            bArr4 = bArr;
                        } else {
                            i21 = i43;
                            i26 = i33;
                            unsafe = unsafe2;
                            i22 = iPositionForFieldNumber;
                            i27 = i37;
                        }
                        i19 = i26;
                        i14 = i27;
                    }
                }
                if (i14 != i12 || i12 == 0) {
                    iDecodeUnknownField = (!this.hasExtensions || bVar.extensionRegistry == ExtensionRegistryLite.getEmptyRegistry()) ? c.decodeUnknownField(i14, bArr, i19, i11, getMutableUnknownFields(t10), bVar) : c.decodeExtensionOrUnknownField(i14, bArr, i19, i11, t10, this.defaultInstance, this.unknownFieldSchema, bVar);
                    t12 = t10;
                    bArr4 = bArr;
                    i29 = i14;
                    a0Var2 = this;
                    bVar2 = bVar;
                    i30 = i20;
                    i28 = i22;
                    i32 = i21;
                    i31 = i18;
                    unsafe2 = unsafe;
                    i12 = i12;
                } else {
                    i16 = 1048575;
                    a0Var = this;
                    i13 = i19;
                    i30 = i20;
                    i15 = i21;
                }
            } else {
                int i45 = i32;
                unsafe = unsafe2;
                i12 = i12;
                a0Var = a0Var2;
                i13 = iDecodeUnknownField;
                i14 = i29;
                i15 = i45;
                i16 = 1048575;
            }
        }
        if (i15 != i16) {
            t11 = t10;
            unsafe.putInt(t11, i15, i30);
        } else {
            t11 = t10;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i46 = a0Var.checkInitializedCount; i46 < a0Var.repeatedFieldOffsetStart; i46++) {
            unknownFieldSetLite = (UnknownFieldSetLite) filterMapUnknownEnumValues(t10, a0Var.intArray[i46], unknownFieldSetLite, a0Var.unknownFieldSchema, t10);
        }
        if (unknownFieldSetLite != null) {
            a0Var.unknownFieldSchema.setBuilderToMessage(t11, unknownFieldSetLite);
        }
        if (i12 == 0) {
            if (i13 != i11) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (i13 > i11 || i14 != i12) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i13;
    }

    /* JADX INFO: compiled from: MessageSchema.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private int decodeMapEntryValue(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class<?> cls, c.b bVar) throws IOException {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = c.decodeVarint64(bArr, i10, bVar);
                bVar.object1 = Boolean.valueOf(bVar.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return c.decodeBytes(bArr, i10, bVar);
            case 3:
                bVar.object1 = Double.valueOf(c.decodeDouble(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                bVar.object1 = Integer.valueOf(c.decodeFixed32(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                bVar.object1 = Long.valueOf(c.decodeFixed64(bArr, i10));
                return i10 + 8;
            case 8:
                bVar.object1 = Float.valueOf(c.decodeFloat(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = c.decodeVarint32(bArr, i10, bVar);
                bVar.object1 = Integer.valueOf(bVar.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = c.decodeVarint64(bArr, i10, bVar);
                bVar.object1 = Long.valueOf(bVar.long1);
                return iDecodeVarint65;
            case 14:
                return c.decodeMessageField(h0.getInstance().schemaFor((Class) cls), bArr, i10, i11, bVar);
            case 15:
                int iDecodeVarint33 = c.decodeVarint32(bArr, i10, bVar);
                bVar.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(bVar.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = c.decodeVarint64(bArr, i10, bVar);
                bVar.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(bVar.long1));
                return iDecodeVarint66;
            case 17:
                return c.decodeStringRequireUtf8(bArr, i10, bVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i10, int i11, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub2, q0<UT, UB> q0Var, Object obj) {
        MapEntryLite.b<?, ?> bVarForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = q0Var.getBuilderFromMessage(obj);
                }
                ByteString.f fVarNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(bVarForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(fVarNewCodedBuilder.getCodedOutput(), bVarForMapMetadata, next.getKey(), next.getValue());
                    q0Var.addLengthDelimited(ub2, i11, fVarNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i10) {
        return (Internal.EnumVerifier) this.objects[((i10 / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i10) {
        return this.objects[(i10 / 3) * 2];
    }

    private l0 getMessageFieldSchema(int i10) {
        int i11 = (i10 / 3) * 2;
        l0 l0Var = (l0) this.objects[i11];
        if (l0Var != null) {
            return l0Var;
        }
        l0<T> l0VarSchemaFor = h0.getInstance().schemaFor((Class) this.objects[i11 + 1]);
        this.objects[i11] = l0VarSchemaFor;
        return l0VarSchemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    private boolean isFieldPresent(T t10, int i10) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 != 1048575) {
            return (s0.getInt(t10, j10) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(s0.getDouble(t10, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(s0.getFloat(t10, jOffset)) != 0;
            case 2:
                return s0.getLong(t10, jOffset) != 0;
            case 3:
                return s0.getLong(t10, jOffset) != 0;
            case 4:
                return s0.getInt(t10, jOffset) != 0;
            case 5:
                return s0.getLong(t10, jOffset) != 0;
            case 6:
                return s0.getInt(t10, jOffset) != 0;
            case 7:
                return s0.getBoolean(t10, jOffset);
            case 8:
                Object object = s0.getObject(t10, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return s0.getObject(t10, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(s0.getObject(t10, jOffset));
            case 11:
                return s0.getInt(t10, jOffset) != 0;
            case 12:
                return s0.getInt(t10, jOffset) != 0;
            case 13:
                return s0.getInt(t10, jOffset) != 0;
            case 14:
                return s0.getLong(t10, jOffset) != 0;
            case 15:
                return s0.getInt(t10, jOffset) != 0;
            case 16:
                return s0.getLong(t10, jOffset) != 0;
            case 17:
                return s0.getObject(t10, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.l0] */
    private boolean isMapInitialized(T t10, int i10, int i11) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(s0.getObject(t10, offset(i10)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            if (SchemaFor == 0) {
                SchemaFor = SchemaFor;
                SchemaFor = h0.getInstance().schemaFor((Class) obj.getClass());
            }
            SchemaFor = SchemaFor;
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    public static <T> a0<T> newSchema(Class<T> cls, x xVar, c0 c0Var, r rVar, q0<?, ?> q0Var, j<?> jVar, u uVar) {
        return xVar instanceof j0 ? newSchemaForRawMessageInfo((j0) xVar, c0Var, rVar, q0Var, jVar, uVar) : newSchemaForMessageInfo((StructuralMessageInfo) xVar, c0Var, rVar, q0Var, jVar, uVar);
    }

    private int numberAt(int i10) {
        return this.buffer[i10];
    }

    private int presenceMaskAndOffsetAt(int i10) {
        return this.buffer[i10 + 2];
    }

    private <E> void readGroupList(Object obj, long j10, k0 k0Var, l0<E> l0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        k0Var.readGroupList(this.listFieldSchema.mutableListAt(obj, j10), l0Var, extensionRegistryLite);
    }

    private int slowPositionForFieldNumber(int i10, int i11) {
        int length = (this.buffer.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iNumberAt = numberAt(i13);
            if (i10 == iNumberAt) {
                return i13;
            }
            if (i10 < iNumberAt) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private void storeMessageField(T t10, int i10, Object obj) {
        UNSAFE.putObject(t10, offset(typeAndOffsetAt(i10)), obj);
        setFieldPresent(t10, i10);
    }

    private void storeOneofMessageField(T t10, int i10, int i11, Object obj) {
        UNSAFE.putObject(t10, offset(typeAndOffsetAt(i11)), obj);
        setOneofPresent(t10, i10, i11);
    }

    private int typeAndOffsetAt(int i10) {
        return this.buffer[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void writeFieldsInAscendingOrder(T t10, Writer writer) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator it;
        int i10;
        Map.Entry<?, ?> entry2;
        int i11;
        int i12;
        Map.Entry<?, ?> entry3;
        boolean z10;
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t10);
            if (extensions.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator it2 = extensions.iterator();
                entry = (Map.Entry) it2.next();
                it = it2;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = this.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i16 < length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i16);
            int iNumberAt = numberAt(i16);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i17 = this.buffer[i16 + 2];
                int i18 = i17 & i13;
                if (i18 != i14) {
                    i15 = i18 == i13 ? 0 : unsafe.getInt(t10, i18);
                    i14 = i18;
                } else {
                    entry = entry;
                }
                int i19 = 1 << (i17 >>> 20);
                i10 = i14;
                i11 = i19;
                entry2 = entry;
            } else {
                i10 = i14;
                entry2 = entry;
                i11 = 0;
            }
            int i20 = i15;
            while (entry2 != null && this.extensionSchema.extensionNumber(entry2) <= iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeDouble(iNumberAt, doubleAt(t10, jOffset));
                    }
                    break;
                case 1:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeFloat(iNumberAt, floatAt(t10, jOffset));
                    }
                    break;
                case 2:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(t10, jOffset));
                    }
                    break;
                case 3:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(t10, jOffset));
                    }
                    break;
                case 4:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(t10, jOffset));
                    }
                    break;
                case 5:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(t10, jOffset));
                    }
                    break;
                case 6:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(t10, jOffset));
                    }
                    break;
                case 7:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeBool(iNumberAt, booleanAt(t10, jOffset));
                    }
                    break;
                case 8:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writeString(iNumberAt, unsafe.getObject(t10, jOffset), writer);
                    }
                    break;
                case 9:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i16));
                    }
                    break;
                case 10:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t10, jOffset));
                    }
                    break;
                case 11:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(t10, jOffset));
                    }
                    break;
                case 12:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(t10, jOffset));
                    }
                    break;
                case 13:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(t10, jOffset));
                    }
                    break;
                case 14:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(t10, jOffset));
                    }
                    break;
                case 15:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(t10, jOffset));
                    }
                    break;
                case 16:
                    i12 = length;
                    entry3 = entry2;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(t10, jOffset));
                    }
                    break;
                case 17:
                    entry3 = entry2;
                    i12 = length;
                    if (isFieldPresent(t10, i16, i10, i20, i11)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i16));
                    }
                    break;
                case 18:
                    z10 = false;
                    n0.writeDoubleList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 19:
                    z10 = false;
                    n0.writeFloatList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 20:
                    z10 = false;
                    n0.writeInt64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 21:
                    z10 = false;
                    n0.writeUInt64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 22:
                    z10 = false;
                    n0.writeInt32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 23:
                    z10 = false;
                    n0.writeFixed64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 24:
                    z10 = false;
                    n0.writeFixed32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 25:
                    z10 = false;
                    n0.writeBoolList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 26:
                    n0.writeStringList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 27:
                    n0.writeMessageList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, getMessageFieldSchema(i16));
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 28:
                    n0.writeBytesList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 29:
                    z10 = false;
                    n0.writeUInt32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 30:
                    z10 = false;
                    n0.writeEnumList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 31:
                    z10 = false;
                    n0.writeSFixed32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 32:
                    z10 = false;
                    n0.writeSFixed64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 33:
                    z10 = false;
                    n0.writeSInt32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 34:
                    z10 = false;
                    n0.writeSInt64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, false);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 35:
                    n0.writeDoubleList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 36:
                    n0.writeFloatList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 37:
                    n0.writeInt64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 38:
                    n0.writeUInt64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 39:
                    n0.writeInt32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 40:
                    n0.writeFixed64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 41:
                    n0.writeFixed32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 42:
                    n0.writeBoolList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 43:
                    n0.writeUInt32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 44:
                    n0.writeEnumList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 45:
                    n0.writeSFixed32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 46:
                    n0.writeSFixed64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 47:
                    n0.writeSInt32List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 48:
                    n0.writeSInt64List(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, true);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 49:
                    n0.writeGroupList(numberAt(i16), (List) unsafe.getObject(t10, jOffset), writer, getMessageFieldSchema(i16));
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, unsafe.getObject(t10, jOffset), i16);
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writeString(iNumberAt, unsafe.getObject(t10, jOffset), writer);
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i16));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i16)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i16));
                    }
                    i12 = length;
                    entry3 = entry2;
                    break;
                default:
                    i12 = length;
                    entry3 = entry2;
                    break;
            }
            i16 += 3;
            i14 = i10;
            entry = entry3;
            i15 = i20;
            length = i12;
            i13 = 1048575;
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, t10, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInDescendingOrder(T t10, Writer writer) throws IOException {
        Iterator itDescendingIterator;
        Map.Entry<?, ?> entry;
        writeUnknownInMessageTo(this.unknownFieldSchema, t10, writer);
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t10);
            if (extensions.isEmpty()) {
                itDescendingIterator = null;
                entry = null;
            } else {
                itDescendingIterator = extensions.descendingIterator();
                entry = (Map.Entry) itDescendingIterator.next();
            }
        } else {
            itDescendingIterator = null;
            entry = null;
        }
        for (int length = this.buffer.length - 3; length >= 0; length -= 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(length);
            int iNumberAt = numberAt(length);
            while (entry != null && this.extensionSchema.extensionNumber(entry) > iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t10, length)) {
                        writer.writeDouble(iNumberAt, doubleAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t10, length)) {
                        writer.writeFloat(iNumberAt, floatAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t10, length)) {
                        writer.writeInt64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t10, length)) {
                        writer.writeUInt64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t10, length)) {
                        writer.writeInt32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t10, length)) {
                        writer.writeFixed64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t10, length)) {
                        writer.writeFixed32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t10, length)) {
                        writer.writeBool(iNumberAt, booleanAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t10, length)) {
                        writeString(iNumberAt, s0.getObject(t10, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t10, length)) {
                        writer.writeMessage(iNumberAt, s0.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t10, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) s0.getObject(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t10, length)) {
                        writer.writeUInt32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t10, length)) {
                        writer.writeEnum(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t10, length)) {
                        writer.writeSFixed32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t10, length)) {
                        writer.writeSFixed64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t10, length)) {
                        writer.writeSInt32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t10, length)) {
                        writer.writeSInt64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t10, length)) {
                        writer.writeGroup(iNumberAt, s0.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    n0.writeDoubleList(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    n0.writeFloatList(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    n0.writeInt64List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    n0.writeUInt64List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    n0.writeInt32List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    n0.writeFixed64List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    n0.writeFixed32List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    n0.writeBoolList(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    n0.writeStringList(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    n0.writeMessageList(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    n0.writeBytesList(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    n0.writeUInt32List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    n0.writeEnumList(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    n0.writeSFixed32List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    n0.writeSFixed64List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    n0.writeSInt32List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    n0.writeSInt64List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    n0.writeDoubleList(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    n0.writeFloatList(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    n0.writeInt64List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    n0.writeUInt64List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    n0.writeInt32List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    n0.writeFixed64List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    n0.writeFixed32List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    n0.writeBoolList(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    n0.writeUInt32List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    n0.writeEnumList(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    n0.writeSFixed32List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    n0.writeSFixed64List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    n0.writeSInt32List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    n0.writeSInt64List(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    n0.writeGroupList(numberAt(length), (List) s0.getObject(t10, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, s0.getObject(t10, offset(iTypeAndOffsetAt)), length);
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writeString(iNumberAt, s0.getObject(t10, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, s0.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) s0.getObject(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeGroup(iNumberAt, s0.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = itDescendingIterator.hasNext() ? (Map.Entry) itDescendingIterator.next() : null;
        }
    }

    private <K, V> void writeMapHelper(Writer writer, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            writer.writeMap(i10, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i11)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i10, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i10, (String) obj);
        } else {
            writer.writeBytes(i10, (ByteString) obj);
        }
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v215 */
    /* JADX WARN: Type inference failed for: r0v217 */
    /* JADX WARN: Type inference failed for: r0v219 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // com.google.protobuf.l0
    public int getSerializedSize(T t10) {
        int i10;
        ?? r16;
        ?? r17;
        ?? r10;
        ?? r15;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeSizeFixed64List;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        ?? r11;
        int i11;
        Unsafe unsafe = UNSAFE;
        int i12 = 1048575;
        ?? r12 = 0;
        int i13 = 1048575;
        ?? r13 = 0;
        int i14 = 0;
        int iComputeSFixed32Size = 0;
        while (i14 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i14);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i14);
            int i15 = this.buffer[i14 + 2];
            int i16 = i15 & i12;
            if (iType <= 17) {
                if (i16 != i13) {
                    r11 = i16 == i12 ? r12 : unsafe.getInt(t10, i16 == true ? 1L : 0L);
                    i11 = i16 == true ? 1 : 0;
                }
                i10 = i11;
                r16 = r11;
                r17 = 1 << (i15 >>> 20);
            } else {
                i11 = i13;
                r11 = r13;
                i10 = i13 == true ? 1 : 0;
                r16 = r13 == true ? 1 : 0;
                r17 = r12;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            if (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) {
                r10 = i16;
                r10 = r12;
            }
            r10 = i16;
            ?? r14 = r10;
            switch (iType) {
                case 0:
                    r15 = r12;
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        r15 = r15;
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    r15 = r12;
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        r15 = r15;
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    r15 = r12;
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        r15 = r15;
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    r15 = r12;
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        r15 = r15;
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    r15 = r12;
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        r15 = r15;
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    r15 = r12;
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        r15 = r15;
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (!isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        r15 = 0;
                    } else {
                        r15 = 0;
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        iComputeSFixed32Size += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 8:
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        Object object = unsafe.getObject(t10, jOffset);
                        iComputeBoolSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 9:
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = n0.computeSizeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i14));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 10:
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t10, jOffset));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 11:
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 12:
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 13:
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeSFixed32Size += CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                    }
                    r15 = 0;
                    break;
                case 14:
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 15:
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 16:
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 17:
                    if (isFieldPresent(t10, i14, i10 == true ? 1 : 0, r16 == true ? 1 : 0, r17 == true ? 1 : 0)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i14));
                        iComputeSFixed32Size += iComputeBoolSize;
                    }
                    r15 = 0;
                    break;
                case 18:
                    iComputeSizeFixed64List = n0.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 19:
                    iComputeSizeFixed64List = n0.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 20:
                    iComputeSizeFixed64List = n0.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 21:
                    iComputeSizeFixed64List = n0.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 22:
                    iComputeSizeFixed64List = n0.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 23:
                    iComputeSizeFixed64List = n0.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 24:
                    iComputeSizeFixed64List = n0.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 25:
                    iComputeSizeFixed64List = n0.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 26:
                    iComputeSizeFixed64List = n0.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t10, jOffset));
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 27:
                    iComputeSizeFixed64List = n0.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i14));
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 28:
                    iComputeSizeFixed64List = n0.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t10, jOffset));
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 29:
                    iComputeSizeFixed64List = n0.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 30:
                    iComputeSizeFixed64List = n0.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 31:
                    iComputeSizeFixed64List = n0.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 32:
                    iComputeSizeFixed64List = n0.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 33:
                    iComputeSizeFixed64List = n0.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 34:
                    iComputeSizeFixed64List = n0.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), r12);
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeUInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeBoolListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeUInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeEnumListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeSInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = n0.computeSizeSInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, r14 == true ? 1L : 0L, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSizeFixed64List = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 49:
                    iComputeSizeFixed64List = n0.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i14));
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 50:
                    iComputeSizeFixed64List = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t10, jOffset), getMapFieldDefaultEntry(i14));
                    iComputeSFixed32Size += iComputeSizeFixed64List;
                    r15 = r12;
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeFixed32Size(iNumberAt, r12);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        Object object2 = unsafe.getObject(t10, jOffset);
                        iComputeSizeFixed64List = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = n0.computeSizeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i14));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeSFixed32Size(iNumberAt, r12);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSizeFixed64List = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i14));
                        iComputeSFixed32Size += iComputeSizeFixed64List;
                    }
                    r15 = r12;
                    break;
                default:
                    r15 = r12;
                    break;
            }
            i14 += 3;
            i13 = i10;
            r12 = r15;
            r13 = r16;
            i12 = 1048575;
        }
        int unknownFieldsSerializedSize = iComputeSFixed32Size + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t10).getSerializedSize() : unknownFieldsSerializedSize;
    }

    @Override // com.google.protobuf.l0
    public int hashCode(T t10) {
        int i10;
        int iHashLong;
        int length = this.buffer.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i12);
            int iNumberAt = numberAt(i12);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(s0.getDouble(t10, jOffset)));
                    i11 = i10 + iHashLong;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iHashLong = Float.floatToIntBits(s0.getFloat(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(s0.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(s0.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iHashLong = s0.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(s0.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iHashLong = s0.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashBoolean(s0.getBoolean(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iHashLong = ((String) s0.getObject(t10, jOffset)).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 9:
                    Object object = s0.getObject(t10, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iHashLong = s0.getObject(t10, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iHashLong = s0.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iHashLong = s0.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iHashLong = s0.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(s0.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iHashLong = s0.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(s0.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 17:
                    Object object2 = s0.getObject(t10, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iHashLong = s0.getObject(t10, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iHashLong = s0.getObject(t10, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t10, jOffset)));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = ((String) s0.getObject(t10, jOffset)).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = s0.getObject(t10, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = s0.getObject(t10, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = oneofIntAt(t10, jOffset);
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t10, jOffset));
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = s0.getObject(t10, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.unknownFieldSchema.getFromMessage(t10).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t10).hashCode() : iHashCode2;
    }

    @Override // com.google.protobuf.l0
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    private a0(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z10, int[] iArr2, int i12, int i13, c0 c0Var, r rVar, q0<?, ?> q0Var, j<?> jVar, u uVar) {
        boolean z11;
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i10;
        this.maxFieldNumber = i11;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        if (jVar != null && jVar.hasExtensions(messageLite)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.hasExtensions = z11;
        this.useCachedSizeField = z10;
        this.intArray = iArr2;
        this.checkInitializedCount = i12;
        this.repeatedFieldOffsetStart = i13;
        this.newInstanceSchema = c0Var;
        this.listFieldSchema = rVar;
        this.unknownFieldSchema = q0Var;
        this.extensionSchema = jVar;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = uVar;
    }

    private boolean arePresentForEquals(T t10, T t11, int i10) {
        if (isFieldPresent(t10, i10) == isFieldPresent(t11, i10)) {
            return true;
        }
        return false;
    }

    private static <T> boolean booleanAt(T t10, long j10) {
        return s0.getBoolean(t10, j10);
    }

    private static void checkMutable(Object obj) {
        if (isMutable(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private static <T> double doubleAt(T t10, long j10) {
        return s0.getDouble(t10, j10);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i10, UB ub2, q0<UT, UB> q0Var, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i10);
        Object object = s0.getObject(obj, offset(typeAndOffsetAt(i10)));
        if (object == null || (enumFieldVerifier = getEnumFieldVerifier(i10)) == null) {
            return ub2;
        }
        return (UB) filterUnknownEnumMap(i10, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, q0Var, obj2);
    }

    private static <T> float floatAt(T t10, long j10) {
        return s0.getFloat(t10, j10);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(q0<UT, UB> q0Var, T t10) {
        return q0Var.getSerializedSize(q0Var.getFromMessage(t10));
    }

    private static <T> int intAt(T t10, long j10) {
        return s0.getInt(t10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i10, int i11) {
        List list = (List) s0.getObject(obj, offset(i10));
        if (list.isEmpty()) {
            return true;
        }
        l0 messageFieldSchema = getMessageFieldSchema(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!messageFieldSchema.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t10, T t11, int i10) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10) & 1048575;
        if (s0.getInt(t10, jPresenceMaskAndOffsetAt) == s0.getInt(t11, jPresenceMaskAndOffsetAt)) {
            return true;
        }
        return false;
    }

    private boolean isOneofPresent(T t10, int i10, int i11) {
        if (s0.getInt(t10, presenceMaskAndOffsetAt(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static <T> long longAt(T t10, long j10) {
        return s0.getLong(t10, j10);
    }

    private final <K, V> void mergeMap(Object obj, int i10, Object obj2, ExtensionRegistryLite extensionRegistryLite, k0 k0Var) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i10));
        Object object = s0.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            s0.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            s0.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        k0Var.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t10, T t11, int i10) {
        if (!isFieldPresent(t11, i10)) {
            return;
        }
        long jOffset = offset(typeAndOffsetAt(i10));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(t11, jOffset);
        if (object != null) {
            l0 messageFieldSchema = getMessageFieldSchema(i10);
            if (!isFieldPresent(t10, i10)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t10, jOffset, object);
                } else {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t10, jOffset, objNewInstance);
                }
                setFieldPresent(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t10, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t10, T t11, int i10) {
        int iNumberAt = numberAt(i10);
        if (!isOneofPresent(t11, iNumberAt, i10)) {
            return;
        }
        long jOffset = offset(typeAndOffsetAt(i10));
        Unsafe unsafe = UNSAFE;
        Object object = unsafe.getObject(t11, jOffset);
        if (object != null) {
            l0 messageFieldSchema = getMessageFieldSchema(i10);
            if (!isOneofPresent(t10, iNumberAt, i10)) {
                if (!isMutable(object)) {
                    unsafe.putObject(t10, jOffset, object);
                } else {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t10, jOffset, objNewInstance);
                }
                setOneofPresent(t10, iNumberAt, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t10, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + numberAt(i10) + " is present but null: " + t11);
    }

    private void mergeSingleField(T t10, T t11, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i10);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t11, i10)) {
                    s0.putDouble(t10, jOffset, s0.getDouble(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 1:
                if (isFieldPresent(t11, i10)) {
                    s0.putFloat(t10, jOffset, s0.getFloat(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 2:
                if (isFieldPresent(t11, i10)) {
                    s0.putLong(t10, jOffset, s0.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 3:
                if (isFieldPresent(t11, i10)) {
                    s0.putLong(t10, jOffset, s0.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 4:
                if (isFieldPresent(t11, i10)) {
                    s0.putInt(t10, jOffset, s0.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 5:
                if (isFieldPresent(t11, i10)) {
                    s0.putLong(t10, jOffset, s0.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 6:
                if (isFieldPresent(t11, i10)) {
                    s0.putInt(t10, jOffset, s0.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 7:
                if (isFieldPresent(t11, i10)) {
                    s0.putBoolean(t10, jOffset, s0.getBoolean(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 8:
                if (isFieldPresent(t11, i10)) {
                    s0.putObject(t10, jOffset, s0.getObject(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 9:
                mergeMessage(t10, t11, i10);
                break;
            case 10:
                if (isFieldPresent(t11, i10)) {
                    s0.putObject(t10, jOffset, s0.getObject(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 11:
                if (isFieldPresent(t11, i10)) {
                    s0.putInt(t10, jOffset, s0.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 12:
                if (isFieldPresent(t11, i10)) {
                    s0.putInt(t10, jOffset, s0.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 13:
                if (isFieldPresent(t11, i10)) {
                    s0.putInt(t10, jOffset, s0.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 14:
                if (isFieldPresent(t11, i10)) {
                    s0.putLong(t10, jOffset, s0.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 15:
                if (isFieldPresent(t11, i10)) {
                    s0.putInt(t10, jOffset, s0.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 16:
                if (isFieldPresent(t11, i10)) {
                    s0.putLong(t10, jOffset, s0.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 17:
                mergeMessage(t10, t11, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.listFieldSchema.mergeListsAt(t10, t11, jOffset);
                break;
            case 50:
                n0.mergeMap(this.mapFieldSchema, t10, t11, jOffset);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t11, iNumberAt, i10)) {
                    s0.putObject(t10, jOffset, s0.getObject(t11, jOffset));
                    setOneofPresent(t10, iNumberAt, i10);
                }
                break;
            case 60:
                mergeOneofMessage(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (isOneofPresent(t11, iNumberAt, i10)) {
                    s0.putObject(t10, jOffset, s0.getObject(t11, jOffset));
                    setOneofPresent(t10, iNumberAt, i10);
                }
                break;
            case 68:
                mergeOneofMessage(t10, t11, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t10, int i10) {
        l0 messageFieldSchema = getMessageFieldSchema(i10);
        long jOffset = offset(typeAndOffsetAt(i10));
        if (!isFieldPresent(t10, i10)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t10, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t10, int i10, int i11) {
        l0 messageFieldSchema = getMessageFieldSchema(i11);
        if (!isOneofPresent(t10, i10, i11)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t10, offset(typeAndOffsetAt(i11)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> a0<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, c0 c0Var, r rVar, q0<?, ?> q0Var, j<?> jVar, u uVar) {
        int fieldNumber;
        int fieldNumber2;
        int[] iArr;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr2 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i10 = 0;
        int i11 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i10++;
            } else if (fieldInfo.getType().id() >= 18 && fieldInfo.getType().id() <= 49) {
                i11++;
            }
        }
        int[] iArr3 = null;
        if (i10 > 0) {
            iArr = new int[i10];
        } else {
            iArr = null;
        }
        if (i11 > 0) {
            iArr3 = new int[i11];
        }
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i12 < fields.length) {
            FieldInfo fieldInfo2 = fields[i12];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr2, i13, objArr);
            if (i14 < checkInitialized.length && checkInitialized[i14] == fieldNumber3) {
                checkInitialized[i14] = i13;
                i14++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr[i15] = i13;
                i15++;
            } else {
                if (fieldInfo2.getType().id() >= 18 && fieldInfo2.getType().id() <= 49) {
                    iArr3[i16] = (int) s0.objectFieldOffset(fieldInfo2.getField());
                    i16++;
                }
                i12++;
                i13 += 3;
            }
            i12++;
            i13 += 3;
        }
        if (iArr == null) {
            iArr = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr, 0, iArr4, checkInitialized.length, iArr.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr.length, iArr3.length);
        return new a0<>(iArr2, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr.length, c0Var, rVar, q0Var, jVar, uVar);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0248  */
    /* JADX WARN: Code duplicated, block: B:122:0x024b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0262  */
    /* JADX WARN: Code duplicated, block: B:126:0x0265  */
    public static <T> a0<T> newSchemaForRawMessageInfo(j0 j0Var, c0 c0Var, r rVar, q0<?, ?> q0Var, j<?> jVar, u uVar) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        char cCharAt7;
        int i23;
        char cCharAt8;
        int i24;
        int i25;
        boolean z10;
        boolean z11;
        int iObjectFieldOffset;
        int i26;
        int i27;
        int iObjectFieldOffset2;
        java.lang.reflect.Field fieldReflectField;
        int i28;
        char cCharAt9;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        Object obj;
        java.lang.reflect.Field fieldReflectField2;
        int i35;
        Object obj2;
        java.lang.reflect.Field fieldReflectField3;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        String stringInfo = j0Var.getStringInfo();
        int length = stringInfo.length();
        char c10 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (stringInfo.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int iCharAt3 = stringInfo.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i42 = iCharAt3 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = stringInfo.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt3 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i14 = 0;
            i15 = 0;
            i11 = 0;
            i13 = 0;
            iArr = EMPTY_INT_ARRAY;
            i12 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt4 = stringInfo.charAt(i41);
            if (iCharAt4 >= 55296) {
                int i45 = iCharAt4 & 8191;
                int i46 = 13;
                while (true) {
                    i23 = i44 + 1;
                    cCharAt8 = stringInfo.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i23;
                }
                iCharAt4 = i45 | (cCharAt8 << i46);
                i44 = i23;
            }
            int i47 = i44 + 1;
            int iCharAt5 = stringInfo.charAt(i44);
            if (iCharAt5 >= 55296) {
                int i48 = iCharAt5 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    cCharAt7 = stringInfo.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                iCharAt5 = i48 | (cCharAt7 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int iCharAt6 = stringInfo.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    cCharAt6 = stringInfo.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                iCharAt6 = i51 | (cCharAt6 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            int iCharAt7 = stringInfo.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    cCharAt5 = stringInfo.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                iCharAt7 = i54 | (cCharAt5 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            iCharAt = stringInfo.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    cCharAt4 = stringInfo.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            iCharAt2 = stringInfo.charAt(i56);
            if (iCharAt2 >= 55296) {
                int i60 = iCharAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    cCharAt3 = stringInfo.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                iCharAt2 = i60 | (cCharAt3 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            int iCharAt8 = stringInfo.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    cCharAt2 = stringInfo.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                iCharAt8 = i63 | (cCharAt2 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int iCharAt9 = stringInfo.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i16 = i65 + 1;
                    cCharAt = stringInfo.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i16;
                }
                iCharAt9 = i66 | (cCharAt << i67);
                i65 = i16;
            }
            i11 = (iCharAt4 * 2) + iCharAt5;
            i12 = iCharAt4;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i13 = iCharAt9;
            i41 = i65;
            i14 = iCharAt6;
            i15 = iCharAt7;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = j0Var.getObjects();
        Class<?> cls = j0Var.getDefaultInstance().getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i68 = i13 + iCharAt2;
        int i69 = i13;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i41 < length) {
            int i73 = i41 + 1;
            int iCharAt10 = stringInfo.charAt(i41);
            if (iCharAt10 >= c10) {
                int i74 = iCharAt10 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i38 = i75 + 1;
                    cCharAt12 = stringInfo.charAt(i75);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i38;
                }
                iCharAt10 = i74 | (cCharAt12 << i76);
                i24 = i38;
            } else {
                i24 = i73;
            }
            int i77 = i24 + 1;
            int iCharAt11 = stringInfo.charAt(i24);
            if (iCharAt11 >= c10) {
                int i78 = iCharAt11 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i37 = i79 + 1;
                    cCharAt11 = stringInfo.charAt(i79);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i78 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i79 = i37;
                }
                iCharAt11 = i78 | (cCharAt11 << i80);
                i25 = i37;
            } else {
                i25 = i77;
            }
            int i81 = iCharAt11 & 255;
            int i82 = length;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int i83 = i71;
            if (i81 >= 51) {
                int i84 = i25 + 1;
                int iCharAt12 = stringInfo.charAt(i25);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = 13;
                    while (true) {
                        i36 = i84 + 1;
                        cCharAt10 = stringInfo.charAt(i84);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i86;
                        i86 += 13;
                        i84 = i36;
                        c11 = 55296;
                    }
                    iCharAt12 = i85 | (cCharAt10 << i86);
                    i84 = i36;
                }
                int i87 = i81 - 51;
                int i88 = i84;
                if (i87 != 9 && i87 != 17) {
                    if (i87 == 12 && (j0Var.getSyntax().equals(ProtoSyntax.PROTO2) || (iCharAt11 & 2048) != 0)) {
                        i33 = i11 + 1;
                        objArr[((i72 / 3) * 2) + 1] = objects[i11];
                    }
                    i34 = iCharAt12 * 2;
                    obj = objects[i34];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldReflectField2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldReflectField2 = reflectField(cls, (String) obj);
                        objects[i34] = fieldReflectField2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                    i35 = i34 + 1;
                    obj2 = objects[i35];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldReflectField3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldReflectField3 = reflectField(cls, (String) obj2);
                        objects[i35] = fieldReflectField3;
                    }
                    stringInfo = stringInfo;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField3);
                    i26 = i88;
                    i27 = 0;
                } else {
                    i33 = i11 + 1;
                    objArr[((i72 / 3) * 2) + 1] = objects[i11];
                }
                i11 = i33;
                i34 = iCharAt12 * 2;
                obj = objects[i34];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i34] = fieldReflectField2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                i35 = i34 + 1;
                obj2 = objects[i35];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i35] = fieldReflectField3;
                }
                stringInfo = stringInfo;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField3);
                i26 = i88;
                i27 = 0;
            } else {
                int i89 = i11 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i11]);
                if (i81 != 9 && i81 != 17) {
                    if (i81 != 27 && i81 != 49) {
                        if (i81 != 12 && i81 != 30 && i81 != 44) {
                            if (i81 == 50) {
                                int i90 = i69 + 1;
                                iArr[i69] = i72;
                                int i91 = (i72 / 3) * 2;
                                int i92 = i89 + 1;
                                objArr[i91] = objects[i89];
                                if ((iCharAt11 & 2048) != 0) {
                                    i89 = i92 + 1;
                                    objArr[i91 + 1] = objects[i92];
                                    i69 = i90;
                                } else {
                                    i69 = i90;
                                    i89 = i92;
                                }
                            }
                        } else if (j0Var.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & 2048) != 0) {
                            z10 = true;
                            i29 = i89 + 1;
                            objArr[((i72 / 3) * 2) + 1] = objects[i89];
                        }
                        z10 = true;
                    } else {
                        z10 = true;
                        i29 = i89 + 1;
                        objArr[((i72 / 3) * 2) + 1] = objects[i89];
                    }
                    i89 = i29;
                } else {
                    z10 = true;
                    objArr[((i72 / 3) * 2) + 1] = fieldReflectField4.getType();
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField4);
                if ((iCharAt11 & 4096) != 0) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                if (z11 && i81 <= 17) {
                    i26 = i25 + 1;
                    int iCharAt13 = stringInfo.charAt(i25);
                    if (iCharAt13 >= 55296) {
                        int i93 = iCharAt13 & 8191;
                        int i94 = 13;
                        while (true) {
                            i28 = i26 + 1;
                            cCharAt9 = stringInfo.charAt(i26);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i93 |= (cCharAt9 & 8191) << i94;
                            i94 += 13;
                            i26 = i28;
                        }
                        iCharAt13 = i93 | (cCharAt9 << i94);
                        i26 = i28;
                    }
                    int i95 = (i12 * 2) + (iCharAt13 / 32);
                    Object obj3 = objects[i95];
                    if (obj3 instanceof java.lang.reflect.Field) {
                        fieldReflectField = (java.lang.reflect.Field) obj3;
                    } else {
                        fieldReflectField = reflectField(cls, (String) obj3);
                        objects[i95] = fieldReflectField;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField);
                    i27 = iCharAt13 % 32;
                } else {
                    iObjectFieldOffset = 1048575;
                    i26 = i25;
                    i27 = 0;
                }
                if (i81 >= 18 && i81 <= 49) {
                    iArr[i70] = iObjectFieldOffset3;
                    i70++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset3;
                i11 = i89;
            }
            int i96 = i72 + 1;
            iArr2[i72] = iCharAt10;
            int i97 = i96 + 1;
            int i98 = i12;
            if ((iCharAt11 & 512) != 0) {
                i30 = 536870912;
            } else {
                i30 = 0;
            }
            Unsafe unsafe2 = unsafe;
            if ((iCharAt11 & 256) != 0) {
                i31 = 268435456;
            } else {
                i31 = 0;
            }
            int i99 = i30 | i31;
            if ((iCharAt11 & 2048) != 0) {
                i32 = Integer.MIN_VALUE;
            } else {
                i32 = 0;
            }
            iArr2[i96] = iObjectFieldOffset2 | (i81 << 20) | i99 | i32;
            int i100 = i97 + 1;
            iArr2[i97] = iObjectFieldOffset | (i27 << 20);
            i41 = i26;
            i12 = i98;
            unsafe = unsafe2;
            i71 = i83;
            stringInfo = stringInfo;
            i14 = i14;
            c10 = 55296;
            i72 = i100;
            length = i82;
        }
        return new a0<>(iArr2, objArr, i14, i15, j0Var.getDefaultInstance(), j0Var.getSyntax(), false, iArr, i13, i68, c0Var, rVar, q0Var, jVar, uVar);
    }

    private static <T> boolean oneofBooleanAt(T t10, long j10) {
        return ((Boolean) s0.getObject(t10, j10)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t10, long j10) {
        return ((Double) s0.getObject(t10, j10)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t10, long j10) {
        return ((Float) s0.getObject(t10, j10)).floatValue();
    }

    private static <T> int oneofIntAt(T t10, long j10) {
        return ((Integer) s0.getObject(t10, j10)).intValue();
    }

    private static <T> long oneofLongAt(T t10, long j10) {
        return ((Long) s0.getObject(t10, j10)).longValue();
    }

    private int positionForFieldNumber(int i10, int i11) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, i11);
    }

    private <E> void readMessageList(Object obj, int i10, k0 k0Var, l0<E> l0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        k0Var.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i10)), l0Var, extensionRegistryLite);
    }

    private void readString(Object obj, int i10, k0 k0Var) throws IOException {
        if (isEnforceUtf8(i10)) {
            s0.putObject(obj, offset(i10), k0Var.readStringRequireUtf8());
        } else if (this.lite) {
            s0.putObject(obj, offset(i10), k0Var.readString());
        } else {
            s0.putObject(obj, offset(i10), k0Var.readBytes());
        }
    }

    private void readStringList(Object obj, int i10, k0 k0Var) throws IOException {
        if (isEnforceUtf8(i10)) {
            k0Var.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        } else {
            k0Var.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void setFieldPresent(T t10, int i10) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 == 1048575) {
            return;
        }
        s0.putInt(t10, j10, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | s0.getInt(t10, j10));
    }

    private void setOneofPresent(T t10, int i10, int i11) {
        s0.putInt(t10, presenceMaskAndOffsetAt(i11) & 1048575, i10);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    private static void storeFieldData(FieldInfo fieldInfo, int[] iArr, int i10, Object[] objArr) {
        int iObjectFieldOffset;
        int iId;
        long jObjectFieldOffset;
        int iObjectFieldOffset2;
        int iNumberOfTrailingZeros;
        int i11;
        Class<?> messageFieldClass;
        int i12;
        f0 oneof = fieldInfo.getOneof();
        int i13 = 0;
        if (oneof != null) {
            iId = fieldInfo.getType().id() + 51;
            iObjectFieldOffset = (int) s0.objectFieldOffset(oneof.getValueField());
            jObjectFieldOffset = s0.objectFieldOffset(oneof.getCaseField());
        } else {
            FieldType type = fieldInfo.getType();
            iObjectFieldOffset = (int) s0.objectFieldOffset(fieldInfo.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                if (presenceField == null) {
                    iObjectFieldOffset2 = 1048575;
                } else {
                    iObjectFieldOffset2 = (int) s0.objectFieldOffset(presenceField);
                }
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = s0.objectFieldOffset(fieldInfo.getCachedSizeField());
            }
            iArr[i10] = fieldInfo.getFieldNumber();
            int i14 = i10 + 1;
            if (fieldInfo.isEnforceUtf8()) {
                i11 = 536870912;
            } else {
                i11 = 0;
            }
            if (fieldInfo.isRequired()) {
                i13 = 268435456;
            }
            iArr[i14] = i13 | i11 | (iId << 20) | iObjectFieldOffset;
            iArr[i10 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
            messageFieldClass = fieldInfo.getMessageFieldClass();
            if (fieldInfo.getMapDefaultEntry() != null) {
                i12 = (i10 / 3) * 2;
                objArr[i12] = fieldInfo.getMapDefaultEntry();
                if (messageFieldClass != null) {
                    objArr[i12 + 1] = messageFieldClass;
                    return;
                } else {
                    if (fieldInfo.getEnumVerifier() != null) {
                        objArr[i12 + 1] = fieldInfo.getEnumVerifier();
                        return;
                    }
                    return;
                }
            }
            if (messageFieldClass != null) {
                objArr[((i10 / 3) * 2) + 1] = messageFieldClass;
            } else if (fieldInfo.getEnumVerifier() != null) {
                objArr[((i10 / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
            }
        }
        iObjectFieldOffset2 = (int) jObjectFieldOffset;
        iNumberOfTrailingZeros = 0;
        iArr[i10] = fieldInfo.getFieldNumber();
        int i15 = i10 + 1;
        if (fieldInfo.isEnforceUtf8()) {
            i11 = 536870912;
        } else {
            i11 = 0;
        }
        if (fieldInfo.isRequired()) {
            i13 = 268435456;
        }
        iArr[i15] = i13 | i11 | (iId << 20) | iObjectFieldOffset;
        iArr[i10 + 2] = iObjectFieldOffset2 | (iNumberOfTrailingZeros << 20);
        messageFieldClass = fieldInfo.getMessageFieldClass();
        if (fieldInfo.getMapDefaultEntry() != null) {
            i12 = (i10 / 3) * 2;
            objArr[i12] = fieldInfo.getMapDefaultEntry();
            if (messageFieldClass != null) {
                objArr[i12 + 1] = messageFieldClass;
                return;
            } else {
                if (fieldInfo.getEnumVerifier() != null) {
                    objArr[i12 + 1] = fieldInfo.getEnumVerifier();
                    return;
                }
                return;
            }
        }
        if (messageFieldClass != null) {
            objArr[((i10 / 3) * 2) + 1] = messageFieldClass;
        } else if (fieldInfo.getEnumVerifier() != null) {
            objArr[((i10 / 3) * 2) + 1] = fieldInfo.getEnumVerifier();
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(q0<UT, UB> q0Var, T t10, Writer writer) throws IOException {
        q0Var.writeTo(q0Var.getFromMessage(t10), writer);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.l0
    public void makeImmutable(T t10) {
        if (!isMutable(t10)) {
            return;
        }
        if (t10 instanceof GeneratedMessageLite) {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
            generatedMessageLite.clearMemoizedSerializedSize();
            generatedMessageLite.clearMemoizedHashCode();
            generatedMessageLite.markImmutable();
        }
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i10);
            long jOffset = offset(iTypeAndOffsetAt);
            int iType = type(iTypeAndOffsetAt);
            if (iType != 9) {
                if (iType == 60 || iType == 68) {
                    if (isOneofPresent(t10, numberAt(i10), i10)) {
                        getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t10, jOffset));
                    }
                } else {
                    switch (iType) {
                        case 17:
                            if (isFieldPresent(t10, i10)) {
                                getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t10, jOffset));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.listFieldSchema.makeImmutableListAt(t10, jOffset);
                            break;
                        case 50:
                            Unsafe unsafe = UNSAFE;
                            Object object = unsafe.getObject(t10, jOffset);
                            if (object != null) {
                                unsafe.putObject(t10, jOffset, this.mapFieldSchema.toImmutable(object));
                            }
                            break;
                    }
                }
            } else if (isFieldPresent(t10, i10)) {
                getMessageFieldSchema(i10).makeImmutable(UNSAFE.getObject(t10, jOffset));
            }
        }
        this.unknownFieldSchema.makeImmutable(t10);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(t10);
        }
    }

    @Override // com.google.protobuf.l0
    public void writeTo(T t10, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t10, writer);
        } else {
            writeFieldsInAscendingOrder(t10, writer);
        }
    }

    @Override // com.google.protobuf.l0
    public void mergeFrom(T t10, k0 k0Var, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        checkMutable(t10);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t10, k0Var, extensionRegistryLite);
    }

    private boolean equals(T t10, T t11, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t10, t11, i10) && Double.doubleToLongBits(s0.getDouble(t10, jOffset)) == Double.doubleToLongBits(s0.getDouble(t11, jOffset));
            case 1:
                return arePresentForEquals(t10, t11, i10) && Float.floatToIntBits(s0.getFloat(t10, jOffset)) == Float.floatToIntBits(s0.getFloat(t11, jOffset));
            case 2:
                return arePresentForEquals(t10, t11, i10) && s0.getLong(t10, jOffset) == s0.getLong(t11, jOffset);
            case 3:
                return arePresentForEquals(t10, t11, i10) && s0.getLong(t10, jOffset) == s0.getLong(t11, jOffset);
            case 4:
                return arePresentForEquals(t10, t11, i10) && s0.getInt(t10, jOffset) == s0.getInt(t11, jOffset);
            case 5:
                return arePresentForEquals(t10, t11, i10) && s0.getLong(t10, jOffset) == s0.getLong(t11, jOffset);
            case 6:
                return arePresentForEquals(t10, t11, i10) && s0.getInt(t10, jOffset) == s0.getInt(t11, jOffset);
            case 7:
                return arePresentForEquals(t10, t11, i10) && s0.getBoolean(t10, jOffset) == s0.getBoolean(t11, jOffset);
            case 8:
                return arePresentForEquals(t10, t11, i10) && n0.safeEquals(s0.getObject(t10, jOffset), s0.getObject(t11, jOffset));
            case 9:
                return arePresentForEquals(t10, t11, i10) && n0.safeEquals(s0.getObject(t10, jOffset), s0.getObject(t11, jOffset));
            case 10:
                return arePresentForEquals(t10, t11, i10) && n0.safeEquals(s0.getObject(t10, jOffset), s0.getObject(t11, jOffset));
            case 11:
                return arePresentForEquals(t10, t11, i10) && s0.getInt(t10, jOffset) == s0.getInt(t11, jOffset);
            case 12:
                return arePresentForEquals(t10, t11, i10) && s0.getInt(t10, jOffset) == s0.getInt(t11, jOffset);
            case 13:
                return arePresentForEquals(t10, t11, i10) && s0.getInt(t10, jOffset) == s0.getInt(t11, jOffset);
            case 14:
                return arePresentForEquals(t10, t11, i10) && s0.getLong(t10, jOffset) == s0.getLong(t11, jOffset);
            case 15:
                return arePresentForEquals(t10, t11, i10) && s0.getInt(t10, jOffset) == s0.getInt(t11, jOffset);
            case 16:
                return arePresentForEquals(t10, t11, i10) && s0.getLong(t10, jOffset) == s0.getLong(t11, jOffset);
            case 17:
                return arePresentForEquals(t10, t11, i10) && n0.safeEquals(s0.getObject(t10, jOffset), s0.getObject(t11, jOffset));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return n0.safeEquals(s0.getObject(t10, jOffset), s0.getObject(t11, jOffset));
            case 50:
                return n0.safeEquals(s0.getObject(t10, jOffset), s0.getObject(t11, jOffset));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return isOneofCaseEqual(t10, t11, i10) && n0.safeEquals(s0.getObject(t10, jOffset), s0.getObject(t11, jOffset));
            default:
                return true;
        }
    }

    @Override // com.google.protobuf.l0
    public void mergeFrom(T t10, byte[] bArr, int i10, int i11, c.b bVar) throws IOException {
        parseMessage(t10, bArr, i10, i11, 0, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i10, l0 l0Var) {
        return l0Var.isInitialized(s0.getObject(obj, offset(i10)));
    }
}
