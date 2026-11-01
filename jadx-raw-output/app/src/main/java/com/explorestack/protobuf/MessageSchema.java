package com.explorestack.protobuf;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
final class MessageSchema<T> implements Schema<T> {
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int INTS_PER_FIELD = 3;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    public static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_MASK = 268435456;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i10, int i11, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32;
        int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
        int i12 = registers.int1;
        if (i12 < 0 || i12 > i11 - iDecodeVarint33) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i13 = iDecodeVarint33 + i12;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint33 < i13) {
            int i14 = iDecodeVarint33 + 1;
            int i15 = bArr[iDecodeVarint33];
            if (i15 < 0) {
                iDecodeVarint32 = ArrayDecoders.decodeVarint32(i15, bArr, i14, registers);
                i15 = registers.int1;
            } else {
                iDecodeVarint32 = i14;
            }
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == metadata.valueType.getWireType()) {
                    iDecodeVarint33 = decodeMapEntryValue(bArr, iDecodeVarint32, i11, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint33 = ArrayDecoders.skipField(i15, bArr, iDecodeVarint32, i11, registers);
                }
            } else if (i17 == metadata.keyType.getWireType()) {
                iDecodeVarint33 = decodeMapEntryValue(bArr, iDecodeVarint32, i11, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint33 = ArrayDecoders.skipField(i15, bArr, iDecodeVarint32, i11, registers);
            }
        }
        if (iDecodeVarint33 != i13) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i13;
    }

    private int getSerializedSizeProto3(T t10) {
        int iComputeDoubleSize;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i10 = 0;
        for (int i11 = 0; i11 < this.buffer.length; i11 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i11);
            int iType = type(iTypeAndOffsetAt);
            int iNumberAt = numberAt(i11);
            long jOffset = offset(iTypeAndOffsetAt);
            int i12 = (iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i11 + 2] & 1048575;
            switch (iType) {
                case 0:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, UnsafeUtil.getLong(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, UnsafeUtil.getLong(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, UnsafeUtil.getInt(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 8:
                    if (isFieldPresent(t10, i11)) {
                        Object object = UnsafeUtil.getObject(t10, jOffset);
                        iComputeDoubleSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 9:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = SchemaUtil.computeSizeMessage(iNumberAt, UnsafeUtil.getObject(t10, jOffset), getMessageFieldSchema(i11));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 10:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) UnsafeUtil.getObject(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 11:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, UnsafeUtil.getInt(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 12:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, UnsafeUtil.getInt(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 13:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 14:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 15:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, UnsafeUtil.getInt(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 16:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, UnsafeUtil.getLong(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 17:
                    if (isFieldPresent(t10, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) UnsafeUtil.getObject(t10, jOffset), getMessageFieldSchema(i11));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 18:
                    iComputeDoubleSize = SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 19:
                    iComputeDoubleSize = SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 20:
                    iComputeDoubleSize = SchemaUtil.computeSizeInt64List(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 21:
                    iComputeDoubleSize = SchemaUtil.computeSizeUInt64List(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 22:
                    iComputeDoubleSize = SchemaUtil.computeSizeInt32List(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 23:
                    iComputeDoubleSize = SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 24:
                    iComputeDoubleSize = SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 25:
                    iComputeDoubleSize = SchemaUtil.computeSizeBoolList(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 26:
                    iComputeDoubleSize = SchemaUtil.computeSizeStringList(iNumberAt, listAt(t10, jOffset));
                    i10 += iComputeDoubleSize;
                    break;
                case 27:
                    iComputeDoubleSize = SchemaUtil.computeSizeMessageList(iNumberAt, listAt(t10, jOffset), getMessageFieldSchema(i11));
                    i10 += iComputeDoubleSize;
                    break;
                case 28:
                    iComputeDoubleSize = SchemaUtil.computeSizeByteStringList(iNumberAt, listAt(t10, jOffset));
                    i10 += iComputeDoubleSize;
                    break;
                case 29:
                    iComputeDoubleSize = SchemaUtil.computeSizeUInt32List(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 30:
                    iComputeDoubleSize = SchemaUtil.computeSizeEnumList(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 31:
                    iComputeDoubleSize = SchemaUtil.computeSizeFixed32List(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 32:
                    iComputeDoubleSize = SchemaUtil.computeSizeFixed64List(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 33:
                    iComputeDoubleSize = SchemaUtil.computeSizeSInt32List(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 34:
                    iComputeDoubleSize = SchemaUtil.computeSizeSInt64List(iNumberAt, listAt(t10, jOffset), false);
                    i10 += iComputeDoubleSize;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i12, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeDoubleSize = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 49:
                    iComputeDoubleSize = SchemaUtil.computeSizeGroupList(iNumberAt, listAt(t10, jOffset), getMessageFieldSchema(i11));
                    i10 += iComputeDoubleSize;
                    break;
                case 50:
                    iComputeDoubleSize = this.mapFieldSchema.getSerializedSize(iNumberAt, UnsafeUtil.getObject(t10, jOffset), getMapFieldDefaultEntry(i11));
                    i10 += iComputeDoubleSize;
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        Object object2 = UnsafeUtil.getObject(t10, jOffset);
                        iComputeDoubleSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = SchemaUtil.computeSizeMessage(iNumberAt, UnsafeUtil.getObject(t10, jOffset), getMessageFieldSchema(i11));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) UnsafeUtil.getObject(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        i10 += iComputeDoubleSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i11)) {
                        iComputeDoubleSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) UnsafeUtil.getObject(t10, jOffset), getMessageFieldSchema(i11));
                        i10 += iComputeDoubleSize;
                    }
                    break;
            }
        }
        return i10 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10);
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

    private static boolean isRequired(int i10) {
        return (i10 & 268435456) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(UnknownFieldSchema<UT, UB> unknownFieldSchema, ExtensionSchema<ET> extensionSchema, T t10, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Object objFilterMapUnknownEnumValues = null;
        Object mutableExtensions = null;
        while (true) {
            try {
                int fieldNumber = reader.getFieldNumber();
                int iPositionForFieldNumber = positionForFieldNumber(fieldNumber);
                if (iPositionForFieldNumber >= 0) {
                    int iTypeAndOffsetAt = typeAndOffsetAt(iPositionForFieldNumber);
                    try {
                        switch (type(iTypeAndOffsetAt)) {
                            case 0:
                                UnsafeUtil.putDouble(t10, offset(iTypeAndOffsetAt), reader.readDouble());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 1:
                                UnsafeUtil.putFloat(t10, offset(iTypeAndOffsetAt), reader.readFloat());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 2:
                                UnsafeUtil.putLong(t10, offset(iTypeAndOffsetAt), reader.readInt64());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 3:
                                UnsafeUtil.putLong(t10, offset(iTypeAndOffsetAt), reader.readUInt64());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 4:
                                UnsafeUtil.putInt(t10, offset(iTypeAndOffsetAt), reader.readInt32());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 5:
                                UnsafeUtil.putLong(t10, offset(iTypeAndOffsetAt), reader.readFixed64());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 6:
                                UnsafeUtil.putInt(t10, offset(iTypeAndOffsetAt), reader.readFixed32());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 7:
                                UnsafeUtil.putBoolean(t10, offset(iTypeAndOffsetAt), reader.readBool());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 8:
                                readString(t10, iTypeAndOffsetAt, reader);
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 9:
                                if (isFieldPresent(t10, iPositionForFieldNumber)) {
                                    UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Internal.mergeMessage(UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), reader.readMessageBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite)));
                                } else {
                                    UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), reader.readMessageBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite));
                                    setFieldPresent(t10, iPositionForFieldNumber);
                                }
                                break;
                            case 10:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), reader.readBytes());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 11:
                                UnsafeUtil.putInt(t10, offset(iTypeAndOffsetAt), reader.readUInt32());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 12:
                                int i10 = reader.readEnum();
                                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(iPositionForFieldNumber);
                                if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i10)) {
                                    UnsafeUtil.putInt(t10, offset(iTypeAndOffsetAt), i10);
                                    setFieldPresent(t10, iPositionForFieldNumber);
                                } else {
                                    objFilterMapUnknownEnumValues = SchemaUtil.storeUnknownEnum(fieldNumber, i10, objFilterMapUnknownEnumValues, unknownFieldSchema);
                                }
                                break;
                            case 13:
                                UnsafeUtil.putInt(t10, offset(iTypeAndOffsetAt), reader.readSFixed32());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 14:
                                UnsafeUtil.putLong(t10, offset(iTypeAndOffsetAt), reader.readSFixed64());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 15:
                                UnsafeUtil.putInt(t10, offset(iTypeAndOffsetAt), reader.readSInt32());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 16:
                                UnsafeUtil.putLong(t10, offset(iTypeAndOffsetAt), reader.readSInt64());
                                setFieldPresent(t10, iPositionForFieldNumber);
                                break;
                            case 17:
                                if (isFieldPresent(t10, iPositionForFieldNumber)) {
                                    UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Internal.mergeMessage(UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), reader.readGroupBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite)));
                                } else {
                                    UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), reader.readGroupBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite));
                                    setFieldPresent(t10, iPositionForFieldNumber);
                                }
                                break;
                            case 18:
                                reader.readDoubleList(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 19:
                                reader.readFloatList(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 20:
                                reader.readInt64List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 21:
                                reader.readUInt64List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 22:
                                reader.readInt32List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 23:
                                reader.readFixed64List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 24:
                                reader.readFixed32List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 25:
                                reader.readBoolList(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 26:
                                readStringList(t10, iTypeAndOffsetAt, reader);
                                break;
                            case 27:
                                readMessageList(t10, iTypeAndOffsetAt, reader, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                break;
                            case 28:
                                reader.readBytesList(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 29:
                                reader.readUInt32List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 30:
                                List<Integer> listMutableListAt = this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt));
                                reader.readEnumList(listMutableListAt);
                                objFilterMapUnknownEnumValues = SchemaUtil.filterUnknownEnumList(fieldNumber, listMutableListAt, getEnumFieldVerifier(iPositionForFieldNumber), objFilterMapUnknownEnumValues, unknownFieldSchema);
                                break;
                            case 31:
                                reader.readSFixed32List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 32:
                                reader.readSFixed64List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 33:
                                reader.readSInt32List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 34:
                                reader.readSInt64List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 35:
                                reader.readDoubleList(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 36:
                                reader.readFloatList(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 37:
                                reader.readInt64List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 38:
                                reader.readUInt64List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 39:
                                reader.readInt32List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 40:
                                reader.readFixed64List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 41:
                                reader.readFixed32List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 42:
                                reader.readBoolList(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 43:
                                reader.readUInt32List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 44:
                                List<Integer> listMutableListAt2 = this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt));
                                reader.readEnumList(listMutableListAt2);
                                objFilterMapUnknownEnumValues = SchemaUtil.filterUnknownEnumList(fieldNumber, listMutableListAt2, getEnumFieldVerifier(iPositionForFieldNumber), objFilterMapUnknownEnumValues, unknownFieldSchema);
                                break;
                            case 45:
                                reader.readSFixed32List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 46:
                                reader.readSFixed64List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 47:
                                reader.readSInt32List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 48:
                                reader.readSInt64List(this.listFieldSchema.mutableListAt(t10, offset(iTypeAndOffsetAt)));
                                break;
                            case 49:
                                readGroupList(t10, offset(iTypeAndOffsetAt), reader, getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite);
                                break;
                            case 50:
                                mergeMap(t10, iPositionForFieldNumber, getMapFieldDefaultEntry(iPositionForFieldNumber), extensionRegistryLite, reader);
                                break;
                            case 51:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Double.valueOf(reader.readDouble()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 52:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Float.valueOf(reader.readFloat()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 53:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Long.valueOf(reader.readInt64()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 54:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Long.valueOf(reader.readUInt64()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 55:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readInt32()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 56:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Long.valueOf(reader.readFixed64()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 57:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readFixed32()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 58:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Boolean.valueOf(reader.readBool()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 59:
                                readString(t10, iTypeAndOffsetAt, reader);
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 60:
                                if (isOneofPresent(t10, fieldNumber, iPositionForFieldNumber)) {
                                    UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Internal.mergeMessage(UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), reader.readMessageBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite)));
                                } else {
                                    UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), reader.readMessageBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite));
                                    setFieldPresent(t10, iPositionForFieldNumber);
                                }
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 61:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), reader.readBytes());
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 62:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readUInt32()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 63:
                                int i11 = reader.readEnum();
                                Internal.EnumVerifier enumFieldVerifier2 = getEnumFieldVerifier(iPositionForFieldNumber);
                                if (enumFieldVerifier2 == null || enumFieldVerifier2.isInRange(i11)) {
                                    UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Integer.valueOf(i11));
                                    setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                } else {
                                    objFilterMapUnknownEnumValues = SchemaUtil.storeUnknownEnum(fieldNumber, i11, objFilterMapUnknownEnumValues, unknownFieldSchema);
                                }
                                break;
                            case 64:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readSFixed32()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 65:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Long.valueOf(reader.readSFixed64()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 66:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Integer.valueOf(reader.readSInt32()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 67:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), Long.valueOf(reader.readSInt64()));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            case 68:
                                UnsafeUtil.putObject(t10, offset(iTypeAndOffsetAt), reader.readGroupBySchemaWithCheck(getMessageFieldSchema(iPositionForFieldNumber), extensionRegistryLite));
                                setOneofPresent(t10, fieldNumber, iPositionForFieldNumber);
                                break;
                            default:
                                if (objFilterMapUnknownEnumValues == null) {
                                    objFilterMapUnknownEnumValues = unknownFieldSchema.newBuilder();
                                }
                                if (!unknownFieldSchema.mergeOneFieldFrom(objFilterMapUnknownEnumValues, reader)) {
                                    for (int i12 = this.checkInitializedCount; i12 < this.repeatedFieldOffsetStart; i12++) {
                                        objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i12], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                    }
                                    if (objFilterMapUnknownEnumValues != null) {
                                        unknownFieldSchema.setBuilderToMessage(t10, objFilterMapUnknownEnumValues);
                                        return;
                                    }
                                    return;
                                }
                                break;
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!unknownFieldSchema.shouldDiscardUnknownFields(reader)) {
                            if (objFilterMapUnknownEnumValues == null) {
                                objFilterMapUnknownEnumValues = unknownFieldSchema.getBuilderFromMessage(t10);
                            }
                            if (!unknownFieldSchema.mergeOneFieldFrom(objFilterMapUnknownEnumValues, reader)) {
                                for (int i13 = this.checkInitializedCount; i13 < this.repeatedFieldOffsetStart; i13++) {
                                    objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i13], objFilterMapUnknownEnumValues, unknownFieldSchema);
                                }
                                if (objFilterMapUnknownEnumValues != null) {
                                    unknownFieldSchema.setBuilderToMessage(t10, objFilterMapUnknownEnumValues);
                                    return;
                                }
                                return;
                            }
                        } else if (!reader.skipField()) {
                            for (int i14 = this.checkInitializedCount; i14 < this.repeatedFieldOffsetStart; i14++) {
                                objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i14], objFilterMapUnknownEnumValues, unknownFieldSchema);
                            }
                            if (objFilterMapUnknownEnumValues != null) {
                                unknownFieldSchema.setBuilderToMessage(t10, objFilterMapUnknownEnumValues);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (fieldNumber == Integer.MAX_VALUE) {
                        for (int i15 = this.checkInitializedCount; i15 < this.repeatedFieldOffsetStart; i15++) {
                            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i15], objFilterMapUnknownEnumValues, unknownFieldSchema);
                        }
                        if (objFilterMapUnknownEnumValues != null) {
                            unknownFieldSchema.setBuilderToMessage(t10, objFilterMapUnknownEnumValues);
                            return;
                        }
                        return;
                    }
                    Object objFindExtensionByNumber = !this.hasExtensions ? null : extensionSchema.findExtensionByNumber(extensionRegistryLite, this.defaultInstance, fieldNumber);
                    if (objFindExtensionByNumber != null) {
                        if (mutableExtensions == null) {
                            mutableExtensions = extensionSchema.getMutableExtensions(t10);
                        }
                        objFilterMapUnknownEnumValues = extensionSchema.parseExtension(reader, objFindExtensionByNumber, extensionRegistryLite, mutableExtensions, objFilterMapUnknownEnumValues, unknownFieldSchema);
                    } else if (!unknownFieldSchema.shouldDiscardUnknownFields(reader)) {
                        if (objFilterMapUnknownEnumValues == null) {
                            objFilterMapUnknownEnumValues = unknownFieldSchema.getBuilderFromMessage(t10);
                        }
                        if (unknownFieldSchema.mergeOneFieldFrom(objFilterMapUnknownEnumValues, reader)) {
                        }
                    } else if (reader.skipField()) {
                    }
                }
            } catch (Throwable th2) {
                for (int i16 = this.checkInitializedCount; i16 < this.repeatedFieldOffsetStart; i16++) {
                    objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i16], objFilterMapUnknownEnumValues, unknownFieldSchema);
                }
                if (objFilterMapUnknownEnumValues != null) {
                    unknownFieldSchema.setBuilderToMessage(t10, objFilterMapUnknownEnumValues);
                }
                throw th2;
            }
        }
        for (int i17 = this.checkInitializedCount; i17 < this.repeatedFieldOffsetStart; i17++) {
            objFilterMapUnknownEnumValues = filterMapUnknownEnumValues(t10, this.intArray[i17], objFilterMapUnknownEnumValues, unknownFieldSchema);
        }
        if (objFilterMapUnknownEnumValues != null) {
            unknownFieldSchema.setBuilderToMessage(t10, objFilterMapUnknownEnumValues);
        }
    }

    private static long offset(int i10) {
        return i10 & 1048575;
    }

    private <K, V> int parseMapField(T t10, byte[] bArr, int i10, int i11, int i12, long j10, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t10, j10, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i10, i11, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j11 = this.buffer[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                unsafe.putObject(t10, j10, Long.valueOf(registers.long1));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint64;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                unsafe.putObject(t10, j10, Integer.valueOf(registers.int1));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint32;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                unsafe.putObject(t10, j10, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint65;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                int i22 = registers.int1;
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
                int iDecodeMessageField = ArrayDecoders.decodeMessageField(getMessageFieldSchema(i17), bArr, i10, i11, registers);
                Object object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                if (object == null) {
                    unsafe.putObject(t10, j10, registers.object1);
                } else {
                    unsafe.putObject(t10, j10, Internal.mergeMessage(object, registers.object1));
                }
                unsafe.putInt(t10, j11, i13);
                return iDecodeMessageField;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(bArr, i10, registers);
                unsafe.putObject(t10, j10, registers.object1);
                unsafe.putInt(t10, j11, i13);
                return iDecodeBytes;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint34 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                int i23 = registers.int1;
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
                int iDecodeVarint35 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                unsafe.putObject(t10, j10, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint35;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                unsafe.putObject(t10, j10, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t10, j11, i13);
                return iDecodeVarint66;
            case 68:
                if (i14 != 3) {
                    return i10;
                }
                int iDecodeGroupField = ArrayDecoders.decodeGroupField(getMessageFieldSchema(i17), bArr, i10, i11, (i12 & (-8)) | 4, registers);
                Object object2 = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                if (object2 == null) {
                    unsafe.putObject(t10, j10, registers.object1);
                } else {
                    unsafe.putObject(t10, j10, Internal.mergeMessage(object2, registers.object1));
                }
                unsafe.putInt(t10, j11, i13);
                return iDecodeGroupField;
            default:
                return i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0290 A[PHI: r0 r18 r20 r24 r25 r28
  0x0290: PHI (r0v19 int) = (r0v14 int), (r0v17 int), (r0v21 int) binds: [B:115:0x02fa, B:110:0x02d7, B:103:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x0290: PHI (r18v6 int) = (r18v4 int), (r18v4 int), (r18v7 int) binds: [B:115:0x02fa, B:110:0x02d7, B:103:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x0290: PHI (r20v4 int) = (r20v2 int), (r20v2 int), (r20v5 int) binds: [B:115:0x02fa, B:110:0x02d7, B:103:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x0290: PHI (r24v3 int) = (r24v1 int), (r24v1 int), (r24v4 int) binds: [B:115:0x02fa, B:110:0x02d7, B:103:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x0290: PHI (r25v2 int) = (r25v0 int), (r25v0 int), (r25v3 int) binds: [B:115:0x02fa, B:110:0x02d7, B:103:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x0290: PHI (r28v6 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:115:0x02fa, B:110:0x02d7, B:103:0x028e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x02fd A[PHI: r0 r18 r20 r24 r25 r28
  0x02fd: PHI (r0v18 int) = (r0v14 int), (r0v17 int), (r0v21 int) binds: [B:115:0x02fa, B:110:0x02d7, B:103:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x02fd: PHI (r18v5 int) = (r18v4 int), (r18v4 int), (r18v7 int) binds: [B:115:0x02fa, B:110:0x02d7, B:103:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x02fd: PHI (r20v3 int) = (r20v2 int), (r20v2 int), (r20v5 int) binds: [B:115:0x02fa, B:110:0x02d7, B:103:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x02fd: PHI (r24v2 int) = (r24v1 int), (r24v1 int), (r24v4 int) binds: [B:115:0x02fa, B:110:0x02d7, B:103:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x02fd: PHI (r25v1 int) = (r25v0 int), (r25v0 int), (r25v3 int) binds: [B:115:0x02fa, B:110:0x02d7, B:103:0x028e] A[DONT_GENERATE, DONT_INLINE]
  0x02fd: PHI (r28v5 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:115:0x02fa, B:110:0x02d7, B:103:0x028e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0093. Please report as an issue. */
    private int parseProto3Message(T t10, byte[] bArr, int i10, int i11, ArrayDecoders.Registers registers) throws IOException {
        int i12;
        int iDecodeVarint32;
        int i13;
        int i14;
        Unsafe unsafe;
        int i15;
        int i16;
        int i17;
        Unsafe unsafe2;
        int i18;
        int i19;
        int i20;
        int iDecodeVarint64;
        int i21;
        Unsafe unsafe3;
        this = this;
        t10 = t10;
        bArr = bArr;
        i11 = i11;
        registers = registers;
        Unsafe unsafe4 = UNSAFE;
        int i22 = -1;
        int iDecodeUnknownField = i10;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1048575;
        while (iDecodeUnknownField < i11) {
            int i27 = iDecodeUnknownField + 1;
            byte b10 = bArr[iDecodeUnknownField];
            if (b10 < 0) {
                iDecodeVarint32 = ArrayDecoders.decodeVarint32(b10, bArr, i27, registers);
                i12 = registers.int1;
            } else {
                i12 = b10;
                iDecodeVarint32 = i27;
            }
            int i28 = i12 >>> 3;
            int i29 = i12 & 7;
            int iPositionForFieldNumber = i28 > i23 ? this.positionForFieldNumber(i28, i24 / 3) : this.positionForFieldNumber(i28);
            if (iPositionForFieldNumber == i22) {
                i13 = iDecodeVarint32;
                i14 = i28;
                unsafe = unsafe4;
                i15 = i22;
                i16 = 0;
            } else {
                int i30 = this.buffer[iPositionForFieldNumber + 1];
                int iType = type(i30);
                Unsafe unsafe5 = unsafe4;
                long jOffset = offset(i30);
                if (iType <= 17) {
                    int i31 = this.buffer[iPositionForFieldNumber + 2];
                    int i32 = 1 << (i31 >>> 20);
                    int i33 = i31 & 1048575;
                    if (i33 != i26) {
                        if (i26 != 1048575) {
                            long j10 = i26;
                            unsafe3 = unsafe5;
                            unsafe3.putInt(t10, j10, i25);
                        } else {
                            unsafe3 = unsafe5;
                        }
                        if (i33 != 1048575) {
                            i25 = unsafe3.getInt(t10, i33);
                        }
                        unsafe2 = unsafe3;
                        i26 = i33;
                    } else {
                        unsafe2 = unsafe5;
                    }
                    switch (iType) {
                        case 0:
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            if (i29 != 1) {
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                UnsafeUtil.putDouble(t10, jOffset, ArrayDecoders.decodeDouble(bArr, iDecodeVarint32));
                                iDecodeUnknownField = iDecodeVarint32 + 8;
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 1:
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            if (i29 != 5) {
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                UnsafeUtil.putFloat(t10, jOffset, ArrayDecoders.decodeFloat(bArr, iDecodeVarint32));
                                iDecodeUnknownField = iDecodeVarint32 + 4;
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 2:
                        case 3:
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            if (i29 != 0) {
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, iDecodeVarint32, registers);
                                unsafe2.putLong(t10, jOffset, registers.long1);
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i24 = i17;
                                iDecodeUnknownField = iDecodeVarint64;
                                i23 = i14;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 4:
                        case 11:
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            if (i29 != 0) {
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr, iDecodeVarint32, registers);
                                unsafe2.putInt(t10, jOffset, registers.int1);
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 5:
                        case 14:
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            if (i29 != 1) {
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                unsafe2.putLong(t10, jOffset, ArrayDecoders.decodeFixed64(bArr, iDecodeVarint32));
                                iDecodeUnknownField = iDecodeVarint32 + 8;
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 6:
                        case 13:
                            i21 = i11;
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            if (i29 != 5) {
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                unsafe2.putInt(t10, jOffset, ArrayDecoders.decodeFixed32(bArr, iDecodeVarint32));
                                iDecodeUnknownField = iDecodeVarint32 + 4;
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i23 = i14;
                                i22 = -1;
                                int i34 = i17;
                                i11 = i21;
                                i24 = i34;
                            }
                            break;
                        case 7:
                            i21 = i11;
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            if (i29 != 0) {
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iDecodeUnknownField = ArrayDecoders.decodeVarint64(bArr, iDecodeVarint32, registers);
                                UnsafeUtil.putBoolean(t10, jOffset, registers.long1 != 0);
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i23 = i14;
                                i22 = -1;
                                int i35 = i17;
                                i11 = i21;
                                i24 = i35;
                            }
                            break;
                        case 8:
                            i21 = i11;
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            if (i29 != 2) {
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iDecodeUnknownField = (i30 & 536870912) == 0 ? ArrayDecoders.decodeString(bArr, iDecodeVarint32, registers) : ArrayDecoders.decodeStringRequireUtf8(bArr, iDecodeVarint32, registers);
                                unsafe2.putObject(t10, jOffset, registers.object1);
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i23 = i14;
                                i22 = -1;
                                int i36 = i17;
                                i11 = i21;
                                i24 = i36;
                            }
                            break;
                        case 9:
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            if (i29 != 2) {
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                i21 = i11;
                                iDecodeUnknownField = ArrayDecoders.decodeMessageField(this.getMessageFieldSchema(i17), bArr, iDecodeVarint32, i21, registers);
                                Object object = unsafe2.getObject(t10, jOffset);
                                if (object == null) {
                                    unsafe2.putObject(t10, jOffset, registers.object1);
                                } else {
                                    unsafe2.putObject(t10, jOffset, Internal.mergeMessage(object, registers.object1));
                                }
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i23 = i14;
                                i22 = -1;
                                int i37 = i17;
                                i11 = i21;
                                i24 = i37;
                            }
                            break;
                        case 10:
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            if (i29 != 2) {
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iDecodeUnknownField = ArrayDecoders.decodeBytes(bArr, iDecodeVarint32, registers);
                                unsafe2.putObject(t10, jOffset, registers.object1);
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 12:
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            if (i29 != 0) {
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr, iDecodeVarint32, registers);
                                unsafe2.putInt(t10, jOffset, registers.int1);
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 15:
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            if (i29 != 0) {
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr, iDecodeVarint32, registers);
                                unsafe2.putInt(t10, jOffset, CodedInputStream.decodeZigZag32(registers.int1));
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i24 = i17;
                                i23 = i14;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        case 16:
                            if (i29 != 0) {
                                i17 = iPositionForFieldNumber;
                                i14 = i28;
                                i13 = iDecodeVarint32;
                                unsafe = unsafe2;
                                i16 = i17;
                                i15 = -1;
                            } else {
                                iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, iDecodeVarint32, registers);
                                i17 = iPositionForFieldNumber;
                                i14 = i28;
                                unsafe2.putLong(t10, jOffset, CodedInputStream.decodeZigZag64(registers.long1));
                                i25 |= i32;
                                unsafe4 = unsafe2;
                                i24 = i17;
                                iDecodeUnknownField = iDecodeVarint64;
                                i23 = i14;
                                i22 = -1;
                                i11 = i11;
                            }
                            break;
                        default:
                            i17 = iPositionForFieldNumber;
                            i14 = i28;
                            i13 = iDecodeVarint32;
                            unsafe = unsafe2;
                            i16 = i17;
                            i15 = -1;
                            break;
                    }
                } else {
                    i14 = i28;
                    i17 = iPositionForFieldNumber;
                    unsafe2 = unsafe5;
                    if (iType != 27) {
                        if (iType <= 49) {
                            int i38 = iDecodeVarint32;
                            i19 = i25;
                            i20 = i26;
                            unsafe = unsafe2;
                            i15 = -1;
                            i16 = i17;
                            iDecodeUnknownField = parseRepeatedField(t10, bArr, iDecodeVarint32, i11, i12, i14, i29, i17, i30, iType, jOffset, registers);
                            if (iDecodeUnknownField != i38) {
                                i22 = i15;
                                i23 = i14;
                                i24 = i16;
                                i25 = i19;
                                i26 = i20;
                            } else {
                                i13 = iDecodeUnknownField;
                                i25 = i19;
                                i26 = i20;
                            }
                        } else {
                            i18 = iDecodeVarint32;
                            i19 = i25;
                            i20 = i26;
                            unsafe = unsafe2;
                            i16 = i17;
                            i15 = -1;
                            if (iType == 50) {
                                if (i29 == 2) {
                                    iDecodeUnknownField = parseMapField(t10, bArr, i18, i11, i16, jOffset, registers);
                                    if (iDecodeUnknownField != i18) {
                                        i22 = i15;
                                        i23 = i14;
                                        i24 = i16;
                                        i25 = i19;
                                        i26 = i20;
                                    } else {
                                        i13 = iDecodeUnknownField;
                                    }
                                }
                                i25 = i19;
                                i26 = i20;
                            } else {
                                iDecodeUnknownField = parseOneofField(t10, bArr, i18, i11, i12, i14, i29, i30, iType, jOffset, i16, registers);
                                if (iDecodeUnknownField != i18) {
                                    i22 = i15;
                                    i23 = i14;
                                    i24 = i16;
                                    i25 = i19;
                                    i26 = i20;
                                } else {
                                    i13 = iDecodeUnknownField;
                                    i25 = i19;
                                    i26 = i20;
                                }
                            }
                        }
                        unsafe4 = unsafe;
                    } else if (i29 == 2) {
                        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject(t10, jOffset);
                        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                            int size = protobufListMutableCopyWithCapacity2.size();
                            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                            unsafe2.putObject(t10, jOffset, protobufListMutableCopyWithCapacity2);
                        }
                        iDecodeUnknownField = ArrayDecoders.decodeMessageList(this.getMessageFieldSchema(i17), i12, bArr, iDecodeVarint32, i11, protobufListMutableCopyWithCapacity2, registers);
                        i25 = i25;
                        unsafe4 = unsafe2;
                        i24 = i17;
                        i23 = i14;
                        i22 = -1;
                        i11 = i11;
                    } else {
                        i18 = iDecodeVarint32;
                        i19 = i25;
                        i20 = i26;
                        unsafe = unsafe2;
                        i16 = i17;
                        i15 = -1;
                    }
                    i13 = i18;
                    i25 = i19;
                    i26 = i20;
                }
            }
            iDecodeUnknownField = ArrayDecoders.decodeUnknownField(i12, bArr, i13, i11, getMutableUnknownFields(t10), registers);
            i22 = i15;
            i23 = i14;
            i24 = i16;
            unsafe4 = unsafe;
        }
        int i39 = i25;
        Unsafe unsafe6 = unsafe4;
        if (i26 != 1048575) {
            unsafe6.putInt(t10, i26, i39);
        }
        if (iDecodeUnknownField == i11) {
            return iDecodeUnknownField;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int parseRepeatedField(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, ArrayDecoders.Registers registers) throws IOException {
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
                    return ArrayDecoders.decodePackedDoubleList(bArr, i10, protobufListMutableCopyWithCapacity2, registers);
                }
                return i14 == 1 ? ArrayDecoders.decodeDoubleList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i10, protobufListMutableCopyWithCapacity2, registers);
                }
                return i14 == 5 ? ArrayDecoders.decodeFloatList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i10, protobufListMutableCopyWithCapacity2, registers);
                }
                return i14 == 0 ? ArrayDecoders.decodeVarint64List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i10, protobufListMutableCopyWithCapacity2, registers);
                }
                return i14 == 0 ? ArrayDecoders.decodeVarint32List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i10, protobufListMutableCopyWithCapacity2, registers);
                }
                return i14 == 1 ? ArrayDecoders.decodeFixed64List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i10, protobufListMutableCopyWithCapacity2, registers);
                }
                return i14 == 5 ? ArrayDecoders.decodeFixed32List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i10, protobufListMutableCopyWithCapacity2, registers);
                }
                return i14 == 0 ? ArrayDecoders.decodeBoolList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? ArrayDecoders.decodeStringList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : ArrayDecoders.decodeStringListRequireUtf8(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers);
                }
                return i10;
            case 27:
                return i14 == 2 ? ArrayDecoders.decodeMessageList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : i10;
            case 28:
                return i14 == 2 ? ArrayDecoders.decodeBytesList(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : i10;
            case 30:
            case 44:
                if (i14 == 2) {
                    iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i10, protobufListMutableCopyWithCapacity2, registers);
                } else {
                    if (i14 != 0) {
                        return i10;
                    }
                    iDecodeVarint32List = ArrayDecoders.decodeVarint32List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
                    unknownFieldSetLite = null;
                }
                UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) SchemaUtil.filterUnknownEnumList(i13, (List<Integer>) protobufListMutableCopyWithCapacity2, getEnumFieldVerifier(i15), unknownFieldSetLite, (UnknownFieldSchema<UT, UnknownFieldSetLite>) this.unknownFieldSchema);
                if (unknownFieldSetLite2 != null) {
                    generatedMessageLite.unknownFields = unknownFieldSetLite2;
                }
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i10, protobufListMutableCopyWithCapacity2, registers);
                }
                return i14 == 0 ? ArrayDecoders.decodeSInt32List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i10, protobufListMutableCopyWithCapacity2, registers);
                }
                return i14 == 0 ? ArrayDecoders.decodeSInt64List(i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : i10;
            case 49:
                return i14 == 3 ? ArrayDecoders.decodeGroupList(getMessageFieldSchema(i15), i12, bArr, i10, i11, protobufListMutableCopyWithCapacity2, registers) : i10;
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

    @Override // com.explorestack.protobuf.Schema
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
    @Override // com.explorestack.protobuf.Schema
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

    @Override // com.explorestack.protobuf.Schema
    public void mergeFrom(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.buffer.length; i10 += 3) {
            mergeSingleField(t10, t11, i10);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t10, t11);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t10, t11);
        }
    }

    /* JADX INFO: renamed from: com.explorestack.protobuf.MessageSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
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

    private int decodeMapEntryValue(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i10, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i10));
                return i10 + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint65;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i10, i11, registers);
            case 15:
                int iDecodeVarint33 = ArrayDecoders.decodeVarint32(bArr, i10, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint33;
            case 16:
                int iDecodeVarint66 = ArrayDecoders.decodeVarint64(bArr, i10, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint66;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i10, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final <K, V, UT, UB> UB filterUnknownEnumMap(int i10, int i11, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = unknownFieldSchema.newBuilder();
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub2, i11, codedBuilderNewCodedBuilder.build());
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

    private Schema getMessageFieldSchema(int i10) {
        int i11 = (i10 / 3) * 2;
        Schema schema = (Schema) this.objects[i11];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i11 + 1]);
        this.objects[i11] = schemaSchemaFor;
        return schemaSchemaFor;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:185:0x0420 A[PHI: r6
  0x0420: PHI (r6v4 int) = 
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v8 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v1 int)
  (r6v9 int)
  (r6v1 int)
 binds: [B:20:0x005d, B:224:0x04c7, B:221:0x04bc, B:215:0x04a0, B:212:0x048f, B:209:0x0480, B:206:0x0473, B:203:0x0466, B:199:0x045b, B:196:0x0452, B:193:0x0445, B:190:0x0438, B:187:0x0425, B:160:0x0332, B:154:0x0315, B:148:0x02f8, B:142:0x02db, B:136:0x02bd, B:130:0x029f, B:124:0x0281, B:118:0x0263, B:112:0x0245, B:106:0x0227, B:100:0x0209, B:94:0x01eb, B:88:0x01cd, B:82:0x01af, B:77:0x017b, B:74:0x016f, B:71:0x015f, B:68:0x014f, B:65:0x013f, B:62:0x0133, B:59:0x0126, B:56:0x0119, B:50:0x00fb, B:47:0x00e7, B:44:0x00d5, B:41:0x00c5, B:38:0x00b5, B:201:0x0462, B:35:0x00a8, B:32:0x009c, B:29:0x008c, B:26:0x007c, B:184:0x041f, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    private int getSerializedSizeProto2(T t10) {
        int i10;
        int i11;
        int iComputeDoubleSize;
        int iComputeBoolSize;
        int iComputeSFixed32Size;
        boolean z10;
        int iComputeSizeFixed32List;
        int iComputeSizeFixed64ListNoTag;
        int iComputeTagSize;
        int iComputeUInt32SizeNoTag;
        Unsafe unsafe = UNSAFE;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < this.buffer.length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i14);
            int iNumberAt = numberAt(i14);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                i10 = this.buffer[i14 + 2];
                int i17 = i10 & i12;
                i11 = 1 << (i10 >>> 20);
                if (i17 != i13) {
                    i16 = unsafe.getInt(t10, i17);
                    i13 = i17;
                }
            } else {
                i10 = (!this.useCachedSizeField || iType < FieldType.DOUBLE_LIST_PACKED.id() || iType > FieldType.SINT64_LIST_PACKED.id()) ? 0 : this.buffer[i14 + 2] & i12;
                i11 = 0;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if ((i16 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i15 += iComputeDoubleSize;
                    }
                    break;
                case 1:
                    if ((i16 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i15 += iComputeDoubleSize;
                    }
                    break;
                case 2:
                    if ((i16 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        i15 += iComputeDoubleSize;
                    }
                    break;
                case 3:
                    if ((i16 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeUInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        i15 += iComputeDoubleSize;
                    }
                    break;
                case 4:
                    if ((i16 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        i15 += iComputeDoubleSize;
                    }
                    break;
                case 5:
                    if ((i16 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i15 += iComputeDoubleSize;
                    }
                    break;
                case 6:
                    if ((i16 & i11) != 0) {
                        iComputeDoubleSize = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i15 += iComputeDoubleSize;
                    }
                    break;
                case 7:
                    if ((i16 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 8:
                    if ((i16 & i11) != 0) {
                        Object object = unsafe.getObject(t10, jOffset);
                        iComputeBoolSize = object instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object) : CodedOutputStream.computeStringSize(iNumberAt, (String) object);
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 9:
                    if ((i16 & i11) != 0) {
                        iComputeBoolSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i14));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 10:
                    if ((i16 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 11:
                    if ((i16 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 12:
                    if ((i16 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, unsafe.getInt(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 13:
                    if ((i16 & i11) != 0) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 14:
                    if ((i16 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 15:
                    if ((i16 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, unsafe.getInt(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 16:
                    if ((i16 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, unsafe.getLong(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 17:
                    if ((i16 & i11) != 0) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i14));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 18:
                    iComputeBoolSize = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeBoolSize;
                    break;
                case 19:
                    z10 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeSizeFixed32List;
                    break;
                case 20:
                    z10 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeSizeFixed32List;
                    break;
                case 21:
                    z10 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeUInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeSizeFixed32List;
                    break;
                case 22:
                    z10 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeSizeFixed32List;
                    break;
                case 23:
                    z10 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeSizeFixed32List;
                    break;
                case 24:
                    z10 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeSizeFixed32List;
                    break;
                case 25:
                    z10 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeBoolList(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeSizeFixed32List;
                    break;
                case 26:
                    iComputeBoolSize = SchemaUtil.computeSizeStringList(iNumberAt, (List) unsafe.getObject(t10, jOffset));
                    i15 += iComputeBoolSize;
                    break;
                case 27:
                    iComputeBoolSize = SchemaUtil.computeSizeMessageList(iNumberAt, (List) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i14));
                    i15 += iComputeBoolSize;
                    break;
                case 28:
                    iComputeBoolSize = SchemaUtil.computeSizeByteStringList(iNumberAt, (List) unsafe.getObject(t10, jOffset));
                    i15 += iComputeBoolSize;
                    break;
                case 29:
                    iComputeBoolSize = SchemaUtil.computeSizeUInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeBoolSize;
                    break;
                case 30:
                    z10 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeEnumList(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeSizeFixed32List;
                    break;
                case 31:
                    z10 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeSizeFixed32List;
                    break;
                case 32:
                    z10 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeFixed64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeSizeFixed32List;
                    break;
                case 33:
                    z10 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeSInt32List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeSizeFixed32List;
                    break;
                case 34:
                    z10 = false;
                    iComputeSizeFixed32List = SchemaUtil.computeSizeSInt64List(iNumberAt, (List) unsafe.getObject(t10, jOffset), false);
                    i15 += iComputeSizeFixed32List;
                    break;
                case 35:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 36:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 37:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 38:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 39:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 40:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 41:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 42:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeBoolListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 43:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeUInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 44:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeEnumListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 45:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 46:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeFixed64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 47:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt32ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 48:
                    iComputeSizeFixed64ListNoTag = SchemaUtil.computeSizeSInt64ListNoTag((List) unsafe.getObject(t10, jOffset));
                    if (iComputeSizeFixed64ListNoTag > 0) {
                        if (this.useCachedSizeField) {
                            unsafe.putInt(t10, i10, iComputeSizeFixed64ListNoTag);
                        }
                        iComputeTagSize = CodedOutputStream.computeTagSize(iNumberAt);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(iComputeSizeFixed64ListNoTag);
                        iComputeSFixed32Size = iComputeTagSize + iComputeUInt32SizeNoTag + iComputeSizeFixed64ListNoTag;
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 49:
                    iComputeBoolSize = SchemaUtil.computeSizeGroupList(iNumberAt, (List) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i14));
                    i15 += iComputeBoolSize;
                    break;
                case 50:
                    iComputeBoolSize = this.mapFieldSchema.getSerializedSize(iNumberAt, unsafe.getObject(t10, jOffset), getMapFieldDefaultEntry(i14));
                    i15 += iComputeBoolSize;
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeDoubleSize(iNumberAt, 0.0d);
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeFloatSize(iNumberAt, 0.0f);
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeFixed64Size(iNumberAt, 0L);
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSFixed32Size = CodedOutputStream.computeFixed32Size(iNumberAt, 0);
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeBoolSize(iNumberAt, true);
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        Object object2 = unsafe.getObject(t10, jOffset);
                        iComputeBoolSize = object2 instanceof ByteString ? CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) object2) : CodedOutputStream.computeStringSize(iNumberAt, (String) object2);
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = SchemaUtil.computeSizeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i14));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeBytesSize(iNumberAt, (ByteString) unsafe.getObject(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeUInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeEnumSize(iNumberAt, oneofIntAt(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeSFixed32Size = CodedOutputStream.computeSFixed32Size(iNumberAt, 0);
                        i15 += iComputeSFixed32Size;
                    }
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeSFixed64Size(iNumberAt, 0L);
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt32Size(iNumberAt, oneofIntAt(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeSInt64Size(iNumberAt, oneofLongAt(t10, jOffset));
                        i15 += iComputeBoolSize;
                    }
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i14)) {
                        iComputeBoolSize = CodedOutputStream.computeGroupSize(iNumberAt, (MessageLite) unsafe.getObject(t10, jOffset), getMessageFieldSchema(i14));
                        i15 += iComputeBoolSize;
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
        int unknownFieldsSerializedSize = i15 + getUnknownFieldsSerializedSize(this.unknownFieldSchema, t10);
        return this.hasExtensions ? unknownFieldsSerializedSize + this.extensionSchema.getExtensions(t10).getSerializedSize() : unknownFieldsSerializedSize;
    }

    private boolean isFieldPresent(T t10, int i10) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10);
        long j10 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j10 != 1048575) {
            return (UnsafeUtil.getInt(t10, j10) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return UnsafeUtil.getDouble(t10, jOffset) != 0.0d;
            case 1:
                return UnsafeUtil.getFloat(t10, jOffset) != 0.0f;
            case 2:
                return UnsafeUtil.getLong(t10, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(t10, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(t10, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(t10, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(t10, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t10, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(t10, jOffset);
                if (object instanceof String) {
                    return !((String) object).isEmpty();
                }
                if (object instanceof ByteString) {
                    return !ByteString.EMPTY.equals(object);
                }
                throw new IllegalArgumentException();
            case 9:
                return UnsafeUtil.getObject(t10, jOffset) != null;
            case 10:
                return !ByteString.EMPTY.equals(UnsafeUtil.getObject(t10, jOffset));
            case 11:
                return UnsafeUtil.getInt(t10, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(t10, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(t10, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(t10, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(t10, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(t10, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(t10, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.explorestack.protobuf.Schema] */
    private boolean isMapInitialized(T t10, int i10, int i11) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t10, offset(i10)));
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
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            SchemaFor = SchemaFor;
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private int numberAt(int i10) {
        return this.buffer[i10];
    }

    private int presenceMaskAndOffsetAt(int i10) {
        return this.buffer[i10 + 2];
    }

    private <E> void readGroupList(Object obj, long j10, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j10), schema, extensionRegistryLite);
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

    private int typeAndOffsetAt(int i10) {
        return this.buffer[i10 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void writeFieldsInAscendingOrderProto2(T t10, Writer writer) throws IOException {
        Iterator it;
        Map.Entry<?, ?> entry;
        int i10;
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t10);
            if (extensions.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = extensions.iterator();
                entry = (Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int length = this.buffer.length;
        Unsafe unsafe = UNSAFE;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i13);
            int iNumberAt = numberAt(i13);
            int iType = type(iTypeAndOffsetAt);
            if (iType <= 17) {
                int i15 = this.buffer[i13 + 2];
                int i16 = i15 & i11;
                if (i16 != i12) {
                    i14 = unsafe.getInt(t10, i16);
                    i12 = i16;
                }
                i10 = 1 << (i15 >>> 20);
            } else {
                i10 = 0;
            }
            while (entry != null && this.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jOffset = offset(iTypeAndOffsetAt);
            switch (iType) {
                case 0:
                    if ((i10 & i14) != 0) {
                        writer.writeDouble(iNumberAt, doubleAt(t10, jOffset));
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 1:
                    if ((i10 & i14) != 0) {
                        writer.writeFloat(iNumberAt, floatAt(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 2:
                    if ((i10 & i14) != 0) {
                        writer.writeInt64(iNumberAt, unsafe.getLong(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 3:
                    if ((i10 & i14) != 0) {
                        writer.writeUInt64(iNumberAt, unsafe.getLong(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 4:
                    if ((i10 & i14) != 0) {
                        writer.writeInt32(iNumberAt, unsafe.getInt(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 5:
                    if ((i10 & i14) != 0) {
                        writer.writeFixed64(iNumberAt, unsafe.getLong(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 6:
                    if ((i10 & i14) != 0) {
                        writer.writeFixed32(iNumberAt, unsafe.getInt(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 7:
                    if ((i10 & i14) != 0) {
                        writer.writeBool(iNumberAt, booleanAt(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 8:
                    if ((i10 & i14) != 0) {
                        writeString(iNumberAt, unsafe.getObject(t10, jOffset), writer);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 9:
                    if ((i10 & i14) != 0) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 10:
                    if ((i10 & i14) != 0) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 11:
                    if ((i10 & i14) != 0) {
                        writer.writeUInt32(iNumberAt, unsafe.getInt(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 12:
                    if ((i10 & i14) != 0) {
                        writer.writeEnum(iNumberAt, unsafe.getInt(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 13:
                    if ((i10 & i14) != 0) {
                        writer.writeSFixed32(iNumberAt, unsafe.getInt(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 14:
                    if ((i10 & i14) != 0) {
                        writer.writeSFixed64(iNumberAt, unsafe.getLong(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 15:
                    if ((i10 & i14) != 0) {
                        writer.writeSInt32(iNumberAt, unsafe.getInt(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 16:
                    if ((i10 & i14) != 0) {
                        writer.writeSInt64(iNumberAt, unsafe.getLong(t10, jOffset));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 17:
                    if ((i10 & i14) != 0) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 19:
                    SchemaUtil.writeFloatList(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 22:
                    SchemaUtil.writeInt32List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 25:
                    SchemaUtil.writeBoolList(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 26:
                    SchemaUtil.writeStringList(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, getMessageFieldSchema(i13));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer);
                    break;
                case 29:
                    SchemaUtil.writeUInt32List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 30:
                    SchemaUtil.writeEnumList(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 31:
                    SchemaUtil.writeSFixed32List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 32:
                    SchemaUtil.writeSFixed64List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 33:
                    SchemaUtil.writeSInt32List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 34:
                    SchemaUtil.writeSInt64List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, true);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(i13), (List) unsafe.getObject(t10, jOffset), writer, getMessageFieldSchema(i13));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, unsafe.getObject(t10, jOffset), i13);
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t10, jOffset));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t10, jOffset));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t10, jOffset));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writeString(iNumberAt, unsafe.getObject(t10, jOffset), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeMessage(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeBytes(iNumberAt, (ByteString) unsafe.getObject(t10, jOffset));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t10, jOffset));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t10, jOffset));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i13)) {
                        writer.writeGroup(iNumberAt, unsafe.getObject(t10, jOffset), getMessageFieldSchema(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        while (entry != null) {
            this.extensionSchema.serializeExtension(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        writeUnknownInMessageTo(this.unknownFieldSchema, t10, writer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private void writeFieldsInAscendingOrderProto3(T t10, Writer writer) throws IOException {
        Iterator it;
        Map.Entry<?, ?> entry;
        if (this.hasExtensions) {
            FieldSet<T> extensions = this.extensionSchema.getExtensions(t10);
            if (extensions.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = extensions.iterator();
                entry = (Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i10);
            int iNumberAt = numberAt(i10);
            while (entry != null && this.extensionSchema.extensionNumber(entry) <= iNumberAt) {
                this.extensionSchema.serializeExtension(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeDouble(iNumberAt, doubleAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 1:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeFloat(iNumberAt, floatAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 2:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeInt64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 3:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeUInt64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 4:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeInt32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 5:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeFixed64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 6:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeFixed32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 7:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeBool(iNumberAt, booleanAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 8:
                    if (isFieldPresent(t10, i10)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i10));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 11:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeUInt32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 12:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeEnum(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 13:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeSFixed32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 14:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeSFixed64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 15:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeSInt32(iNumberAt, intAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 16:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeSInt64(iNumberAt, longAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 17:
                    if (isFieldPresent(t10, i10)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i10));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(i10));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    SchemaUtil.writeUInt32List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    SchemaUtil.writeEnumList(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    SchemaUtil.writeSFixed32List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    SchemaUtil.writeSFixed64List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    SchemaUtil.writeSInt32List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    SchemaUtil.writeSInt64List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(i10), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(i10));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), i10);
                    break;
                case 51:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeDouble(iNumberAt, oneofDoubleAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 52:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeFloat(iNumberAt, oneofFloatAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 53:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeInt64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 54:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeUInt64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 55:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeInt32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 56:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeFixed64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 57:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeFixed32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 58:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeBool(iNumberAt, oneofBooleanAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 59:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writeString(iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i10));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 62:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeUInt32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 63:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeEnum(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 64:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeSFixed32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 65:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeSFixed64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 66:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeSInt32(iNumberAt, oneofIntAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 67:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeSInt64(iNumberAt, oneofLongAt(t10, offset(iTypeAndOffsetAt)));
                    }
                    break;
                case 68:
                    if (isOneofPresent(t10, iNumberAt, i10)) {
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(i10));
                    }
                    break;
            }
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
                        writeString(iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 9:
                    if (isFieldPresent(t10, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 10:
                    if (isFieldPresent(t10, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)));
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
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 18:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 19:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 20:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 21:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 22:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 23:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 24:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 25:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 26:
                    SchemaUtil.writeStringList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 27:
                    SchemaUtil.writeMessageList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 28:
                    SchemaUtil.writeBytesList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer);
                    break;
                case 29:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 30:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 31:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 32:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 33:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 34:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, false);
                    break;
                case 35:
                    SchemaUtil.writeDoubleList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 36:
                    SchemaUtil.writeFloatList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 37:
                    SchemaUtil.writeInt64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 38:
                    SchemaUtil.writeUInt64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 39:
                    SchemaUtil.writeInt32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 40:
                    SchemaUtil.writeFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 41:
                    SchemaUtil.writeFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 42:
                    SchemaUtil.writeBoolList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 43:
                    SchemaUtil.writeUInt32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 44:
                    SchemaUtil.writeEnumList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 45:
                    SchemaUtil.writeSFixed32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 46:
                    SchemaUtil.writeSFixed64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 47:
                    SchemaUtil.writeSInt32List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 48:
                    SchemaUtil.writeSInt64List(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, true);
                    break;
                case 49:
                    SchemaUtil.writeGroupList(numberAt(length), (List) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer, getMessageFieldSchema(length));
                    break;
                case 50:
                    writeMapHelper(writer, iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), length);
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
                        writeString(iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), writer);
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeMessage(iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, length)) {
                        writer.writeBytes(iNumberAt, (ByteString) UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)));
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
                        writer.writeGroup(iNumberAt, UnsafeUtil.getObject(t10, offset(iTypeAndOffsetAt)), getMessageFieldSchema(length));
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

    @Override // com.explorestack.protobuf.Schema
    public int getSerializedSize(T t10) {
        return this.proto3 ? getSerializedSizeProto3(t10) : getSerializedSizeProto2(t10);
    }

    @Override // com.explorestack.protobuf.Schema
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
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t10, jOffset)));
                    i11 = i10 + iHashLong;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iHashLong = UnsafeUtil.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iHashLong = UnsafeUtil.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(t10, jOffset)).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t10, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iHashLong = UnsafeUtil.getObject(t10, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iHashLong = UnsafeUtil.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iHashLong = UnsafeUtil.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iHashLong = UnsafeUtil.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iHashLong = UnsafeUtil.getInt(t10, jOffset);
                    i11 = i10 + iHashLong;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t10, jOffset));
                    i11 = i10 + iHashLong;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t10, jOffset);
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
                    iHashLong = UnsafeUtil.getObject(t10, jOffset).hashCode();
                    i11 = i10 + iHashLong;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iHashLong = UnsafeUtil.getObject(t10, jOffset).hashCode();
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
                        iHashLong = ((String) UnsafeUtil.getObject(t10, jOffset)).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 60:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = UnsafeUtil.getObject(t10, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
                case 61:
                    if (isOneofPresent(t10, iNumberAt, i12)) {
                        i10 = i11 * 53;
                        iHashLong = UnsafeUtil.getObject(t10, jOffset).hashCode();
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
                        iHashLong = UnsafeUtil.getObject(t10, jOffset).hashCode();
                        i11 = i10 + iHashLong;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.unknownFieldSchema.getFromMessage(t10).hashCode();
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t10).hashCode() : iHashCode2;
    }

    @Override // com.explorestack.protobuf.Schema
    public void makeImmutable(T t10) {
        int i10;
        int i11 = this.checkInitializedCount;
        while (true) {
            i10 = this.repeatedFieldOffsetStart;
            if (i11 >= i10) {
                break;
            }
            long jOffset = offset(typeAndOffsetAt(this.intArray[i11]));
            Object object = UnsafeUtil.getObject(t10, jOffset);
            if (object != null) {
                UnsafeUtil.putObject(t10, jOffset, this.mapFieldSchema.toImmutable(object));
            }
            i11++;
        }
        int length = this.intArray.length;
        while (i10 < length) {
            this.listFieldSchema.makeImmutableListAt(t10, this.intArray[i10]);
            i10++;
        }
        this.unknownFieldSchema.makeImmutable(t10);
        if (this.hasExtensions) {
            this.extensionSchema.makeImmutable(t10);
        }
    }

    @Override // com.explorestack.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x008d. Please report as an issue. */
    public int parseProto2Message(T t10, byte[] bArr, int i10, int i11, int i12, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe;
        MessageSchema<T> messageSchema;
        int i13;
        T t11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        T t12;
        T t13;
        int i23;
        T t14;
        int i24;
        int i25;
        MessageSchema<T> messageSchema2 = this;
        T t15 = t10;
        byte[] bArr2 = bArr;
        i11 = i11;
        int i26 = i12;
        ArrayDecoders.Registers registers2 = registers;
        Unsafe unsafe2 = UNSAFE;
        int iDecodeUnknownField = i10;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        int i31 = 1048575;
        while (true) {
            if (iDecodeUnknownField < i11) {
                int i32 = iDecodeUnknownField + 1;
                byte b10 = bArr2[iDecodeUnknownField];
                if (b10 < 0) {
                    int iDecodeVarint32 = ArrayDecoders.decodeVarint32(b10, bArr2, i32, registers2);
                    i14 = registers2.int1;
                    i32 = iDecodeVarint32;
                } else {
                    i14 = b10;
                }
                int i33 = i14 >>> 3;
                int i34 = i14 & 7;
                int iPositionForFieldNumber = i33 > i30 ? messageSchema2.positionForFieldNumber(i33, i27 / 3) : messageSchema2.positionForFieldNumber(i33);
                if (iPositionForFieldNumber == -1) {
                    i15 = i33;
                    i16 = i32;
                    i17 = i14;
                    i18 = i29;
                    i19 = i31;
                    unsafe = unsafe2;
                    i12 = i26;
                    i20 = 0;
                } else {
                    int i35 = messageSchema2.buffer[iPositionForFieldNumber + 1];
                    int iType = type(i35);
                    long jOffset = offset(i35);
                    int i36 = i14;
                    if (iType <= 17) {
                        int i37 = messageSchema2.buffer[iPositionForFieldNumber + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        if (i39 != i31) {
                            if (i31 != 1048575) {
                                unsafe2.putInt(t15, i31, i29);
                            }
                            i29 = unsafe2.getInt(t15, i39);
                            i19 = i39;
                        } else {
                            i19 = i31;
                        }
                        int i40 = i29;
                        switch (iType) {
                            case 0:
                                t12 = t15;
                                i21 = iPositionForFieldNumber;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 1) {
                                    UnsafeUtil.putDouble(t12, jOffset, ArrayDecoders.decodeDouble(bArr2, i32));
                                    iDecodeUnknownField = i32 + 8;
                                    i29 = i40 | i38;
                                    t15 = t12;
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 1:
                                t12 = t15;
                                i21 = iPositionForFieldNumber;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 5) {
                                    UnsafeUtil.putFloat(t12, jOffset, ArrayDecoders.decodeFloat(bArr2, i32));
                                    iDecodeUnknownField = i32 + 4;
                                    i29 = i40 | i38;
                                    t15 = t12;
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 2:
                            case 3:
                                T t16 = t15;
                                i21 = iPositionForFieldNumber;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 0) {
                                    int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr2, i32, registers2);
                                    t13 = t16;
                                    unsafe2.putLong(t10, jOffset, registers2.long1);
                                    i29 = i40 | i38;
                                    iDecodeUnknownField = iDecodeVarint64;
                                    i27 = i21;
                                    i28 = i22;
                                    t15 = t13;
                                    i30 = i15;
                                    i31 = i19;
                                    i11 = i11;
                                    i26 = i12;
                                } else {
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 4:
                            case 11:
                                t12 = t15;
                                i21 = iPositionForFieldNumber;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr2, i32, registers2);
                                    unsafe2.putInt(t12, jOffset, registers2.int1);
                                    i29 = i40 | i38;
                                    t15 = t12;
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 5:
                            case 14:
                                T t17 = t15;
                                i21 = iPositionForFieldNumber;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 1) {
                                    t13 = t17;
                                    unsafe2.putLong(t10, jOffset, ArrayDecoders.decodeFixed64(bArr2, i32));
                                    iDecodeUnknownField = i32 + 8;
                                    i29 = i40 | i38;
                                    i27 = i21;
                                    i28 = i22;
                                    t15 = t13;
                                    i30 = i15;
                                    i31 = i19;
                                    i11 = i11;
                                    i26 = i12;
                                } else {
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 6:
                            case 13:
                                i23 = i11;
                                t14 = t15;
                                i21 = iPositionForFieldNumber;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 5) {
                                    unsafe2.putInt(t14, jOffset, ArrayDecoders.decodeFixed32(bArr2, i32));
                                    iDecodeUnknownField = i32 + 4;
                                    int i41 = i40 | i38;
                                    t15 = t14;
                                    i11 = i23;
                                    i27 = i21;
                                    i28 = i22;
                                    i31 = i19;
                                    i26 = i12;
                                    i29 = i41;
                                    i30 = i15;
                                } else {
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 7:
                                i23 = i11;
                                t14 = t15;
                                i21 = iPositionForFieldNumber;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint64(bArr2, i32, registers2);
                                    UnsafeUtil.putBoolean(t14, jOffset, registers2.long1 != 0);
                                    int i42 = i40 | i38;
                                    t15 = t14;
                                    i11 = i23;
                                    i27 = i21;
                                    i28 = i22;
                                    i31 = i19;
                                    i26 = i12;
                                    i29 = i42;
                                    i30 = i15;
                                } else {
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 8:
                                i23 = i11;
                                t14 = t15;
                                i21 = iPositionForFieldNumber;
                                i15 = i33;
                                bArr2 = bArr;
                                i22 = i36;
                                if (i34 == 2) {
                                    iDecodeUnknownField = (i35 & 536870912) == 0 ? ArrayDecoders.decodeString(bArr2, i32, registers2) : ArrayDecoders.decodeStringRequireUtf8(bArr2, i32, registers2);
                                    unsafe2.putObject(t14, jOffset, registers2.object1);
                                    int i43 = i40 | i38;
                                    t15 = t14;
                                    i11 = i23;
                                    i27 = i21;
                                    i28 = i22;
                                    i31 = i19;
                                    i26 = i12;
                                    i29 = i43;
                                    i30 = i15;
                                } else {
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 9:
                                t14 = t15;
                                i21 = iPositionForFieldNumber;
                                i15 = i33;
                                i22 = i36;
                                bArr2 = bArr;
                                if (i34 == 2) {
                                    i23 = i11;
                                    iDecodeUnknownField = ArrayDecoders.decodeMessageField(messageSchema2.getMessageFieldSchema(i21), bArr2, i32, i23, registers2);
                                    if ((i40 & i38) == 0) {
                                        unsafe2.putObject(t14, jOffset, registers2.object1);
                                    } else {
                                        unsafe2.putObject(t14, jOffset, Internal.mergeMessage(unsafe2.getObject(t14, jOffset), registers2.object1));
                                    }
                                    int i44 = i40 | i38;
                                    t15 = t14;
                                    i11 = i23;
                                    i27 = i21;
                                    i28 = i22;
                                    i31 = i19;
                                    i26 = i12;
                                    i29 = i44;
                                    i30 = i15;
                                } else {
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 10:
                                t12 = t15;
                                i21 = iPositionForFieldNumber;
                                i15 = i33;
                                i22 = i36;
                                bArr2 = bArr;
                                if (i34 == 2) {
                                    iDecodeUnknownField = ArrayDecoders.decodeBytes(bArr2, i32, registers2);
                                    unsafe2.putObject(t12, jOffset, registers2.object1);
                                    i29 = i40 | i38;
                                    t15 = t12;
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 12:
                                t12 = t15;
                                i21 = iPositionForFieldNumber;
                                i15 = i33;
                                i22 = i36;
                                bArr2 = bArr;
                                if (i34 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr2, i32, registers2);
                                    int i45 = registers2.int1;
                                    Internal.EnumVerifier enumFieldVerifier = messageSchema2.getEnumFieldVerifier(i21);
                                    if (enumFieldVerifier == null || enumFieldVerifier.isInRange(i45)) {
                                        unsafe2.putInt(t12, jOffset, i45);
                                        i29 = i40 | i38;
                                        t15 = t12;
                                    } else {
                                        getMutableUnknownFields(t10).storeField(i22, Long.valueOf(i45));
                                        t15 = t12;
                                        i29 = i40;
                                    }
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 15:
                                i21 = iPositionForFieldNumber;
                                i22 = i36;
                                bArr2 = bArr;
                                i15 = i33;
                                if (i34 == 0) {
                                    iDecodeUnknownField = ArrayDecoders.decodeVarint32(bArr2, i32, registers2);
                                    t12 = t10;
                                    unsafe2.putInt(t12, jOffset, CodedInputStream.decodeZigZag32(registers2.int1));
                                    i29 = i40 | i38;
                                    t15 = t12;
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 16:
                                i21 = iPositionForFieldNumber;
                                i15 = i33;
                                if (i34 == 0) {
                                    bArr2 = bArr;
                                    int iDecodeVarint65 = ArrayDecoders.decodeVarint64(bArr2, i32, registers2);
                                    i22 = i36;
                                    unsafe2.putLong(t10, jOffset, CodedInputStream.decodeZigZag64(registers2.long1));
                                    i29 = i40 | i38;
                                    t15 = t10;
                                    iDecodeUnknownField = iDecodeVarint65;
                                    i27 = i21;
                                    i28 = i22;
                                    i30 = i15;
                                    i31 = i19;
                                    i26 = i12;
                                } else {
                                    i22 = i36;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            case 17:
                                if (i34 == 3) {
                                    iDecodeUnknownField = ArrayDecoders.decodeGroupField(messageSchema2.getMessageFieldSchema(iPositionForFieldNumber), bArr, i32, i11, (i33 << 3) | 4, registers);
                                    if ((i40 & i38) == 0) {
                                        unsafe2.putObject(t15, jOffset, registers2.object1);
                                    } else {
                                        unsafe2.putObject(t15, jOffset, Internal.mergeMessage(unsafe2.getObject(t15, jOffset), registers2.object1));
                                    }
                                    i29 = i40 | i38;
                                    bArr2 = bArr;
                                    i11 = i11;
                                    i26 = i12;
                                    i28 = i36;
                                    i27 = iPositionForFieldNumber;
                                    i30 = i33;
                                    i31 = i19;
                                } else {
                                    i21 = iPositionForFieldNumber;
                                    i15 = i33;
                                    i22 = i36;
                                    i16 = i32;
                                    i18 = i40;
                                    i20 = i21;
                                    unsafe = unsafe2;
                                    i17 = i22;
                                    i12 = i12;
                                }
                                break;
                            default:
                                i21 = iPositionForFieldNumber;
                                i22 = i36;
                                i15 = i33;
                                i16 = i32;
                                i18 = i40;
                                i20 = i21;
                                unsafe = unsafe2;
                                i17 = i22;
                                i12 = i12;
                                break;
                        }
                    } else {
                        i15 = i33;
                        T t18 = t15;
                        bArr2 = bArr;
                        if (iType != 27) {
                            i20 = iPositionForFieldNumber;
                            i18 = i29;
                            i19 = i31;
                            if (iType <= 49) {
                                int i46 = i32;
                                unsafe = unsafe2;
                                iDecodeUnknownField = parseRepeatedField(t10, bArr, i32, i11, i36, i15, i34, i20, i35, iType, jOffset, registers);
                                if (iDecodeUnknownField != i46) {
                                    i25 = i36;
                                    messageSchema2 = this;
                                    t15 = t10;
                                    bArr2 = bArr;
                                    i11 = i11;
                                    i26 = i12;
                                    registers2 = registers;
                                    i30 = i15;
                                    i28 = i25;
                                    i27 = i20;
                                    i29 = i18;
                                    i31 = i19;
                                    unsafe2 = unsafe;
                                } else {
                                    i25 = i36;
                                    i16 = iDecodeUnknownField;
                                    i17 = i25;
                                }
                            } else {
                                i24 = i32;
                                unsafe = unsafe2;
                                if (iType != 50) {
                                    iDecodeUnknownField = parseOneofField(t10, bArr, i24, i11, i25, i15, i34, i35, iType, jOffset, i20, registers);
                                    if (iDecodeUnknownField != i24) {
                                        i25 = i36;
                                        messageSchema2 = this;
                                        t15 = t10;
                                        bArr2 = bArr;
                                        i11 = i11;
                                        i26 = i12;
                                        registers2 = registers;
                                        i30 = i15;
                                        i28 = i25;
                                        i27 = i20;
                                        i29 = i18;
                                        i31 = i19;
                                        unsafe2 = unsafe;
                                    } else {
                                        i25 = i36;
                                        i16 = iDecodeUnknownField;
                                        i17 = i25;
                                    }
                                } else if (i34 == 2) {
                                    iDecodeUnknownField = parseMapField(t10, bArr, i24, i11, i20, jOffset, registers);
                                    if (iDecodeUnknownField != i24) {
                                        i25 = i36;
                                        messageSchema2 = this;
                                        t15 = t10;
                                        bArr2 = bArr;
                                        i11 = i11;
                                        i26 = i12;
                                        registers2 = registers;
                                        i30 = i15;
                                        i28 = i25;
                                        i27 = i20;
                                        i29 = i18;
                                        i31 = i19;
                                        unsafe2 = unsafe;
                                    } else {
                                        i25 = i36;
                                        i16 = iDecodeUnknownField;
                                        i17 = i25;
                                    }
                                } else {
                                    i25 = i36;
                                }
                            }
                        } else if (i34 == 2) {
                            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe2.getObject(t18, jOffset);
                            if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
                                int size = protobufListMutableCopyWithCapacity2.size();
                                protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t18, jOffset, protobufListMutableCopyWithCapacity2);
                            }
                            i19 = i31;
                            iDecodeUnknownField = ArrayDecoders.decodeMessageList(messageSchema2.getMessageFieldSchema(iPositionForFieldNumber), i36, bArr, i32, i11, protobufListMutableCopyWithCapacity2, registers);
                            t15 = t10;
                            i11 = i11;
                            i28 = i36;
                            i30 = i15;
                            i27 = iPositionForFieldNumber;
                            i29 = i29;
                            i31 = i19;
                            i26 = i12;
                        } else {
                            i20 = iPositionForFieldNumber;
                            i18 = i29;
                            i19 = i31;
                            i24 = i32;
                            unsafe = unsafe2;
                            i25 = i36;
                        }
                        i16 = i24;
                        i17 = i25;
                    }
                }
                if (i17 != i12 || i12 == 0) {
                    iDecodeUnknownField = (!this.hasExtensions || registers.extensionRegistry == ExtensionRegistryLite.getEmptyRegistry()) ? ArrayDecoders.decodeUnknownField(i17, bArr, i16, i11, getMutableUnknownFields(t10), registers) : ArrayDecoders.decodeExtensionOrUnknownField(i17, bArr, i16, i11, t10, this.defaultInstance, this.unknownFieldSchema, registers);
                    t15 = t10;
                    bArr2 = bArr;
                    i11 = i11;
                    i28 = i17;
                    messageSchema2 = this;
                    registers2 = registers;
                    i30 = i15;
                    i27 = i20;
                    i29 = i18;
                    i31 = i19;
                    unsafe2 = unsafe;
                    i26 = i12;
                } else {
                    i13 = 1048575;
                    messageSchema = this;
                    iDecodeUnknownField = i16;
                    i28 = i17;
                    i29 = i18;
                    i31 = i19;
                }
            } else {
                unsafe = unsafe2;
                i12 = i26;
                messageSchema = messageSchema2;
                i13 = 1048575;
            }
        }
        if (i31 != i13) {
            t11 = t10;
            unsafe.putInt(t11, i31, i29);
        } else {
            t11 = t10;
        }
        UnknownFieldSetLite unknownFieldSetLite = null;
        for (int i47 = messageSchema.checkInitializedCount; i47 < messageSchema.repeatedFieldOffsetStart; i47++) {
            unknownFieldSetLite = (UnknownFieldSetLite) messageSchema.filterMapUnknownEnumValues(t11, messageSchema.intArray[i47], unknownFieldSetLite, messageSchema.unknownFieldSchema);
        }
        if (unknownFieldSetLite != null) {
            messageSchema.unknownFieldSchema.setBuilderToMessage(t11, unknownFieldSetLite);
        }
        if (i12 == 0) {
            if (iDecodeUnknownField != i11) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } else if (iDecodeUnknownField > i11 || i28 != i12) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return iDecodeUnknownField;
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, boolean z10, boolean z11, int[] iArr2, int i12, int i13, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean z12;
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i10;
        this.maxFieldNumber = i11;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.proto3 = z10;
        if (extensionSchema != null && extensionSchema.hasExtensions(messageLite)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.hasExtensions = z12;
        this.useCachedSizeField = z11;
        this.intArray = iArr2;
        this.checkInitializedCount = i12;
        this.repeatedFieldOffsetStart = i13;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t10, T t11, int i10) {
        if (isFieldPresent(t10, i10) == isFieldPresent(t11, i10)) {
            return true;
        }
        return false;
    }

    private static <T> boolean booleanAt(T t10, long j10) {
        return UnsafeUtil.getBoolean(t10, j10);
    }

    private static <T> double doubleAt(T t10, long j10) {
        return UnsafeUtil.getDouble(t10, j10);
    }

    private final <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i10, UB ub2, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i10);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i10)));
        if (object == null || (enumFieldVerifier = getEnumFieldVerifier(i10)) == null) {
            return ub2;
        }
        return (UB) filterUnknownEnumMap(i10, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub2, unknownFieldSchema);
    }

    private static <T> float floatAt(T t10, long j10) {
        return UnsafeUtil.getFloat(t10, j10);
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t10) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t10));
    }

    private static <T> int intAt(T t10, long j10) {
        return UnsafeUtil.getInt(t10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i10, int i11) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i10));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!messageFieldSchema.isInitialized(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t10, T t11, int i10) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i10) & 1048575;
        if (UnsafeUtil.getInt(t10, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t11, jPresenceMaskAndOffsetAt)) {
            return true;
        }
        return false;
    }

    private boolean isOneofPresent(T t10, int i10, int i11) {
        if (UnsafeUtil.getInt(t10, presenceMaskAndOffsetAt(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static List<?> listAt(Object obj, long j10) {
        return (List) UnsafeUtil.getObject(obj, j10);
    }

    private static <T> long longAt(T t10, long j10) {
        return UnsafeUtil.getLong(t10, j10);
    }

    private final <K, V> void mergeMap(Object obj, int i10, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i10));
        Object object = UnsafeUtil.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    private void mergeMessage(T t10, T t11, int i10) {
        long jOffset = offset(typeAndOffsetAt(i10));
        if (!isFieldPresent(t11, i10)) {
            return;
        }
        Object object = UnsafeUtil.getObject(t10, jOffset);
        Object object2 = UnsafeUtil.getObject(t11, jOffset);
        if (object != null && object2 != null) {
            UnsafeUtil.putObject(t10, jOffset, Internal.mergeMessage(object, object2));
            setFieldPresent(t10, i10);
        } else if (object2 != null) {
            UnsafeUtil.putObject(t10, jOffset, object2);
            setFieldPresent(t10, i10);
        }
    }

    private void mergeOneofMessage(T t10, T t11, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        int iNumberAt = numberAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        if (!isOneofPresent(t11, iNumberAt, i10)) {
            return;
        }
        Object object = null;
        if (isOneofPresent(t10, iNumberAt, i10)) {
            object = UnsafeUtil.getObject(t10, jOffset);
        }
        Object object2 = UnsafeUtil.getObject(t11, jOffset);
        if (object != null && object2 != null) {
            UnsafeUtil.putObject(t10, jOffset, Internal.mergeMessage(object, object2));
            setOneofPresent(t10, iNumberAt, i10);
        } else if (object2 != null) {
            UnsafeUtil.putObject(t10, jOffset, object2);
            setOneofPresent(t10, iNumberAt, i10);
        }
    }

    private void mergeSingleField(T t10, T t11, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i10);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putDouble(t10, jOffset, UnsafeUtil.getDouble(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 1:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putFloat(t10, jOffset, UnsafeUtil.getFloat(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 2:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, jOffset, UnsafeUtil.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 3:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, jOffset, UnsafeUtil.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 4:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, jOffset, UnsafeUtil.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 5:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, jOffset, UnsafeUtil.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 6:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, jOffset, UnsafeUtil.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 7:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putBoolean(t10, jOffset, UnsafeUtil.getBoolean(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 8:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putObject(t10, jOffset, UnsafeUtil.getObject(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 9:
                mergeMessage(t10, t11, i10);
                break;
            case 10:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putObject(t10, jOffset, UnsafeUtil.getObject(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 11:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, jOffset, UnsafeUtil.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 12:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, jOffset, UnsafeUtil.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 13:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, jOffset, UnsafeUtil.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 14:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, jOffset, UnsafeUtil.getLong(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 15:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putInt(t10, jOffset, UnsafeUtil.getInt(t11, jOffset));
                    setFieldPresent(t10, i10);
                }
                break;
            case 16:
                if (isFieldPresent(t11, i10)) {
                    UnsafeUtil.putLong(t10, jOffset, UnsafeUtil.getLong(t11, jOffset));
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
                SchemaUtil.mergeMap(this.mapFieldSchema, t10, t11, jOffset);
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
                    UnsafeUtil.putObject(t10, jOffset, UnsafeUtil.getObject(t11, jOffset));
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
                    UnsafeUtil.putObject(t10, jOffset, UnsafeUtil.getObject(t11, jOffset));
                    setOneofPresent(t10, iNumberAt, i10);
                }
                break;
            case 68:
                mergeOneofMessage(t10, t11, i10);
                break;
        }
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean z10;
        int fieldNumber;
        int fieldNumber2;
        int[] iArr;
        if (structuralMessageInfo.getSyntax() == ProtoSyntax.PROTO3) {
            z10 = true;
        } else {
            z10 = false;
        }
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
                    iArr3[i16] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
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
        return new MessageSchema<>(iArr2, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), z10, true, iArr4, checkInitialized.length, checkInitialized.length + iArr.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x024e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0251  */
    /* JADX WARN: Code duplicated, block: B:126:0x0269  */
    /* JADX WARN: Code duplicated, block: B:127:0x026c  */
    /* JADX WARN: Code duplicated, block: B:161:0x031a  */
    /* JADX WARN: Code duplicated, block: B:162:0x031d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0320  */
    /* JADX WARN: Code duplicated, block: B:179:0x036d  */
    /* JADX WARN: Code duplicated, block: B:182:0x037a  */
    public static <T> MessageSchema<T> newSchemaForRawMessageInfo(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        boolean z10;
        int i10;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int iCharAt5;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        int i14;
        char cCharAt2;
        int i15;
        char cCharAt3;
        int i16;
        char cCharAt4;
        int i17;
        char cCharAt5;
        int i18;
        char cCharAt6;
        int i19;
        char cCharAt7;
        int i20;
        char cCharAt8;
        int i21;
        int i22;
        int i23;
        boolean z11;
        int i24;
        int iObjectFieldOffset;
        boolean z12;
        int iObjectFieldOffset2;
        int i25;
        int i26;
        java.lang.reflect.Field fieldReflectField;
        char cCharAt9;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Object obj;
        java.lang.reflect.Field fieldReflectField2;
        int i32;
        Object obj2;
        java.lang.reflect.Field fieldReflectField3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        if (rawMessageInfo.getSyntax() == ProtoSyntax.PROTO3) {
            z10 = true;
        } else {
            z10 = false;
        }
        String stringInfo = rawMessageInfo.getStringInfo();
        int length = stringInfo.length();
        char c10 = 55296;
        if (stringInfo.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i10 = i37 + 1;
                if (stringInfo.charAt(i37) < 55296) {
                    break;
                }
                i37 = i10;
            }
        } else {
            i10 = 1;
        }
        int i38 = i10 + 1;
        int iCharAt6 = stringInfo.charAt(i10);
        if (iCharAt6 >= 55296) {
            int i39 = iCharAt6 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                cCharAt13 = stringInfo.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            iCharAt6 = i39 | (cCharAt13 << i40);
            i38 = i36;
        }
        if (iCharAt6 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            iCharAt4 = 0;
            iCharAt5 = 0;
            i11 = 0;
            iArr = EMPTY_INT_ARRAY;
            i12 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt7 = stringInfo.charAt(i38);
            if (iCharAt7 >= 55296) {
                int i42 = iCharAt7 & 8191;
                int i43 = 13;
                while (true) {
                    i20 = i41 + 1;
                    cCharAt8 = stringInfo.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i20;
                }
                iCharAt7 = i42 | (cCharAt8 << i43);
                i41 = i20;
            }
            int i44 = i41 + 1;
            int iCharAt8 = stringInfo.charAt(i41);
            if (iCharAt8 >= 55296) {
                int i45 = iCharAt8 & 8191;
                int i46 = 13;
                while (true) {
                    i19 = i44 + 1;
                    cCharAt7 = stringInfo.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i19;
                }
                iCharAt8 = i45 | (cCharAt7 << i46);
                i44 = i19;
            }
            int i47 = i44 + 1;
            iCharAt = stringInfo.charAt(i44);
            if (iCharAt >= 55296) {
                int i48 = iCharAt & 8191;
                int i49 = 13;
                while (true) {
                    i18 = i47 + 1;
                    cCharAt6 = stringInfo.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i18;
                }
                iCharAt = i48 | (cCharAt6 << i49);
                i47 = i18;
            }
            int i50 = i47 + 1;
            iCharAt2 = stringInfo.charAt(i47);
            if (iCharAt2 >= 55296) {
                int i51 = iCharAt2 & 8191;
                int i52 = 13;
                while (true) {
                    i17 = i50 + 1;
                    cCharAt5 = stringInfo.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i17;
                }
                iCharAt2 = i51 | (cCharAt5 << i52);
                i50 = i17;
            }
            int i53 = i50 + 1;
            iCharAt3 = stringInfo.charAt(i50);
            if (iCharAt3 >= 55296) {
                int i54 = iCharAt3 & 8191;
                int i55 = 13;
                while (true) {
                    i16 = i53 + 1;
                    cCharAt4 = stringInfo.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i16;
                }
                iCharAt3 = i54 | (cCharAt4 << i55);
                i53 = i16;
            }
            int i56 = i53 + 1;
            iCharAt4 = stringInfo.charAt(i53);
            if (iCharAt4 >= 55296) {
                int i57 = iCharAt4 & 8191;
                int i58 = 13;
                while (true) {
                    i15 = i56 + 1;
                    cCharAt3 = stringInfo.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i15;
                }
                iCharAt4 = i57 | (cCharAt3 << i58);
                i56 = i15;
            }
            int i59 = i56 + 1;
            int iCharAt9 = stringInfo.charAt(i56);
            if (iCharAt9 >= 55296) {
                int i60 = iCharAt9 & 8191;
                int i61 = 13;
                while (true) {
                    i14 = i59 + 1;
                    cCharAt2 = stringInfo.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i14;
                }
                iCharAt9 = i60 | (cCharAt2 << i61);
                i59 = i14;
            }
            int i62 = i59 + 1;
            iCharAt5 = stringInfo.charAt(i59);
            if (iCharAt5 >= 55296) {
                int i63 = iCharAt5 & 8191;
                int i64 = 13;
                while (true) {
                    i13 = i62 + 1;
                    cCharAt = stringInfo.charAt(i62);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i62 = i13;
                }
                iCharAt5 = i63 | (cCharAt << i64);
                i62 = i13;
            }
            iArr = new int[iCharAt5 + iCharAt4 + iCharAt9];
            i11 = (iCharAt7 * 2) + iCharAt8;
            i12 = iCharAt7;
            i38 = i62;
        }
        Unsafe unsafe = UNSAFE;
        Object[] objects = rawMessageInfo.getObjects();
        Class<?> cls = rawMessageInfo.getDefaultInstance().getClass();
        int[] iArr2 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 * 2];
        int i65 = iCharAt5 + iCharAt4;
        int i66 = iCharAt5;
        int i67 = i65;
        int i68 = 0;
        int i69 = 0;
        while (i38 < length) {
            int i70 = i38 + 1;
            int iCharAt10 = stringInfo.charAt(i38);
            if (iCharAt10 >= c10) {
                int i71 = iCharAt10 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i35 = i72 + 1;
                    cCharAt12 = stringInfo.charAt(i72);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i71 |= (cCharAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i35;
                }
                iCharAt10 = i71 | (cCharAt12 << i73);
                i21 = i35;
            } else {
                i21 = i70;
            }
            int i74 = i21 + 1;
            int iCharAt11 = stringInfo.charAt(i21);
            if (iCharAt11 >= c10) {
                int i75 = iCharAt11 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i34 = i76 + 1;
                    cCharAt11 = stringInfo.charAt(i76);
                    i22 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i77;
                    i77 += 13;
                    i76 = i34;
                    length = i22;
                }
                iCharAt11 = i75 | (cCharAt11 << i77);
                i23 = i34;
            } else {
                i22 = length;
                i23 = i74;
            }
            int i78 = iCharAt11 & 255;
            int i79 = iCharAt5;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i80 = i68;
            if (i78 >= 51) {
                int i81 = i23 + 1;
                int iCharAt12 = stringInfo.charAt(i23);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = 13;
                    while (true) {
                        i33 = i81 + 1;
                        cCharAt10 = stringInfo.charAt(i81);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i82 |= (cCharAt10 & 8191) << i83;
                        i83 += 13;
                        i81 = i33;
                        c11 = 55296;
                    }
                    iCharAt12 = i82 | (cCharAt10 << i83);
                    i81 = i33;
                }
                int i84 = i78 - 51;
                int i85 = i81;
                if (i84 != 9 && i84 != 17) {
                    if (i84 == 12 && !z10) {
                        i30 = i11 + 1;
                        objArr[((i69 / 3) * 2) + 1] = objects[i11];
                    }
                    i31 = iCharAt12 * 2;
                    obj = objects[i31];
                    if (obj instanceof java.lang.reflect.Field) {
                        fieldReflectField2 = (java.lang.reflect.Field) obj;
                    } else {
                        fieldReflectField2 = reflectField(cls, (String) obj);
                        objects[i31] = fieldReflectField2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                    i32 = i31 + 1;
                    obj2 = objects[i32];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        fieldReflectField3 = (java.lang.reflect.Field) obj2;
                    } else {
                        fieldReflectField3 = reflectField(cls, (String) obj2);
                        objects[i32] = fieldReflectField3;
                    }
                    stringInfo = stringInfo;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                    z10 = z10;
                    i25 = i85;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i26 = 0;
                } else {
                    i30 = i11 + 1;
                    objArr[((i69 / 3) * 2) + 1] = objects[i11];
                }
                i11 = i30;
                i31 = iCharAt12 * 2;
                obj = objects[i31];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldReflectField2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldReflectField2 = reflectField(cls, (String) obj);
                    objects[i31] = fieldReflectField2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldReflectField2);
                i32 = i31 + 1;
                obj2 = objects[i32];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldReflectField3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldReflectField3 = reflectField(cls, (String) obj2);
                    objects[i32] = fieldReflectField3;
                }
                stringInfo = stringInfo;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField3);
                z10 = z10;
                i25 = i85;
                iObjectFieldOffset = iObjectFieldOffset4;
                i26 = 0;
            } else {
                int i86 = i11 + 1;
                java.lang.reflect.Field fieldReflectField4 = reflectField(cls, (String) objects[i11]);
                if (i78 != 9 && i78 != 17) {
                    if (i78 != 27 && i78 != 49) {
                        if (i78 != 12 && i78 != 30 && i78 != 44) {
                            if (i78 == 50) {
                                int i87 = i66 + 1;
                                iArr[i66] = i69;
                                int i88 = (i69 / 3) * 2;
                                int i89 = i86 + 1;
                                objArr[i88] = objects[i86];
                                if ((iCharAt11 & 2048) != 0) {
                                    i86 = i89 + 1;
                                    objArr[i88 + 1] = objects[i89];
                                    i66 = i87;
                                } else {
                                    i66 = i87;
                                    i24 = i89;
                                    z11 = true;
                                }
                                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                                int i90 = i24;
                                if ((iCharAt11 & 4096) == 4096) {
                                    z12 = z11;
                                } else {
                                    z12 = false;
                                }
                                if (!z12 && i78 <= 17) {
                                    int i91 = i23 + 1;
                                    int iCharAt13 = stringInfo.charAt(i23);
                                    if (iCharAt13 >= 55296) {
                                        int i92 = iCharAt13 & 8191;
                                        int i93 = 13;
                                        while (true) {
                                            i25 = i91 + 1;
                                            cCharAt9 = stringInfo.charAt(i91);
                                            if (cCharAt9 < 55296) {
                                                break;
                                            }
                                            i92 |= (cCharAt9 & 8191) << i93;
                                            i93 += 13;
                                            i91 = i25;
                                        }
                                        iCharAt13 = i92 | (cCharAt9 << i93);
                                    } else {
                                        i25 = i91;
                                    }
                                    int i94 = (i12 * 2) + (iCharAt13 / 32);
                                    Object obj3 = objects[i94];
                                    if (obj3 instanceof java.lang.reflect.Field) {
                                        fieldReflectField = (java.lang.reflect.Field) obj3;
                                    } else {
                                        fieldReflectField = reflectField(cls, (String) obj3);
                                        objects[i94] = fieldReflectField;
                                    }
                                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldReflectField);
                                    i26 = iCharAt13 % 32;
                                } else {
                                    iObjectFieldOffset2 = 1048575;
                                    i25 = i23;
                                    i26 = 0;
                                }
                                if (i78 >= 18 && i78 <= 49) {
                                    iArr[i67] = iObjectFieldOffset;
                                    i67++;
                                }
                                i11 = i90;
                            }
                        } else if (!z10) {
                            z11 = true;
                            i27 = i86 + 1;
                            objArr[((i69 / 3) * 2) + 1] = objects[i86];
                        }
                        z11 = true;
                    } else {
                        z11 = true;
                        i27 = i86 + 1;
                        objArr[((i69 / 3) * 2) + 1] = objects[i86];
                    }
                    i24 = i27;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                    int i95 = i24;
                    if ((iCharAt11 & 4096) == 4096) {
                        z12 = z11;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        iObjectFieldOffset2 = 1048575;
                        i25 = i23;
                        i26 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i25 = i23;
                        i26 = 0;
                    }
                    if (i78 >= 18) {
                        iArr[i67] = iObjectFieldOffset;
                        i67++;
                    }
                    i11 = i95;
                } else {
                    z11 = true;
                    objArr[((i69 / 3) * 2) + 1] = fieldReflectField4.getType();
                }
                i24 = i86;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldReflectField4);
                int i96 = i24;
                if ((iCharAt11 & 4096) == 4096) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    iObjectFieldOffset2 = 1048575;
                    i25 = i23;
                    i26 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i25 = i23;
                    i26 = 0;
                }
                if (i78 >= 18) {
                    iArr[i67] = iObjectFieldOffset;
                    i67++;
                }
                i11 = i96;
            }
            int i97 = i69 + 1;
            iArr2[i69] = iCharAt10;
            int i98 = i97 + 1;
            if ((iCharAt11 & 512) != 0) {
                i28 = 536870912;
            } else {
                i28 = 0;
            }
            if ((iCharAt11 & 256) != 0) {
                i29 = 268435456;
            } else {
                i29 = 0;
            }
            iArr2[i97] = i29 | i28 | (i78 << 20) | iObjectFieldOffset;
            i69 = i98 + 1;
            iArr2[i98] = (i26 << 20) | iObjectFieldOffset2;
            z10 = z10;
            iCharAt = iCharAt;
            iCharAt5 = i79;
            length = i22;
            i38 = i25;
            i68 = i80;
            stringInfo = stringInfo;
            iCharAt2 = iCharAt2;
            c10 = 55296;
        }
        return new MessageSchema<>(iArr2, objArr, iCharAt, iCharAt2, rawMessageInfo.getDefaultInstance(), z10, false, iArr, iCharAt5, i65, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private static <T> boolean oneofBooleanAt(T t10, long j10) {
        return ((Boolean) UnsafeUtil.getObject(t10, j10)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t10, long j10) {
        return ((Double) UnsafeUtil.getObject(t10, j10)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t10, long j10) {
        return ((Float) UnsafeUtil.getObject(t10, j10)).floatValue();
    }

    private static <T> int oneofIntAt(T t10, long j10) {
        return ((Integer) UnsafeUtil.getObject(t10, j10)).intValue();
    }

    private static <T> long oneofLongAt(T t10, long j10) {
        return ((Long) UnsafeUtil.getObject(t10, j10)).longValue();
    }

    private int positionForFieldNumber(int i10, int i11) {
        if (i10 < this.minFieldNumber || i10 > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i10, i11);
    }

    private <E> void readMessageList(Object obj, int i10, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i10)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i10, Reader reader) throws IOException {
        if (isEnforceUtf8(i10)) {
            UnsafeUtil.putObject(obj, offset(i10), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i10), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i10), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i10, Reader reader) throws IOException {
        if (isEnforceUtf8(i10)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i10)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i10)));
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
        UnsafeUtil.putInt(t10, j10, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t10, j10));
    }

    private void setOneofPresent(T t10, int i10, int i11) {
        UnsafeUtil.putInt(t10, presenceMaskAndOffsetAt(i11) & 1048575, i10);
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
        OneofInfo oneof = fieldInfo.getOneof();
        int i13 = 0;
        if (oneof != null) {
            iId = fieldInfo.getType().id() + 51;
            iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(oneof.getValueField());
            jObjectFieldOffset = UnsafeUtil.objectFieldOffset(oneof.getCaseField());
        } else {
            FieldType type = fieldInfo.getType();
            iObjectFieldOffset = (int) UnsafeUtil.objectFieldOffset(fieldInfo.getField());
            iId = type.id();
            if (!type.isList() && !type.isMap()) {
                java.lang.reflect.Field presenceField = fieldInfo.getPresenceField();
                if (presenceField == null) {
                    iObjectFieldOffset2 = 1048575;
                } else {
                    iObjectFieldOffset2 = (int) UnsafeUtil.objectFieldOffset(presenceField);
                }
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(fieldInfo.getPresenceMask());
            } else if (fieldInfo.getCachedSizeField() == null) {
                iObjectFieldOffset2 = 0;
                iNumberOfTrailingZeros = 0;
            } else {
                jObjectFieldOffset = UnsafeUtil.objectFieldOffset(fieldInfo.getCachedSizeField());
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

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t10, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t10), writer);
    }

    @Override // com.explorestack.protobuf.Schema
    public void writeTo(T t10, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t10, writer);
        } else if (this.proto3) {
            writeFieldsInAscendingOrderProto3(t10, writer);
        } else {
            writeFieldsInAscendingOrderProto2(t10, writer);
        }
    }

    @Override // com.explorestack.protobuf.Schema
    public void mergeFrom(T t10, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t10, reader, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.Schema
    public void mergeFrom(T t10, byte[] bArr, int i10, int i11, ArrayDecoders.Registers registers) throws IOException {
        if (this.proto3) {
            parseProto3Message(t10, bArr, i10, i11, registers);
        } else {
            parseProto2Message(t10, bArr, i10, i11, 0, registers);
        }
    }

    private boolean equals(T t10, T t11, int i10) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i10);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return arePresentForEquals(t10, t11, i10) && Double.doubleToLongBits(UnsafeUtil.getDouble(t10, jOffset)) == Double.doubleToLongBits(UnsafeUtil.getDouble(t11, jOffset));
            case 1:
                return arePresentForEquals(t10, t11, i10) && Float.floatToIntBits(UnsafeUtil.getFloat(t10, jOffset)) == Float.floatToIntBits(UnsafeUtil.getFloat(t11, jOffset));
            case 2:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getLong(t10, jOffset) == UnsafeUtil.getLong(t11, jOffset);
            case 3:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getLong(t10, jOffset) == UnsafeUtil.getLong(t11, jOffset);
            case 4:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getInt(t10, jOffset) == UnsafeUtil.getInt(t11, jOffset);
            case 5:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getLong(t10, jOffset) == UnsafeUtil.getLong(t11, jOffset);
            case 6:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getInt(t10, jOffset) == UnsafeUtil.getInt(t11, jOffset);
            case 7:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getBoolean(t10, jOffset) == UnsafeUtil.getBoolean(t11, jOffset);
            case 8:
                return arePresentForEquals(t10, t11, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, jOffset), UnsafeUtil.getObject(t11, jOffset));
            case 9:
                return arePresentForEquals(t10, t11, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, jOffset), UnsafeUtil.getObject(t11, jOffset));
            case 10:
                return arePresentForEquals(t10, t11, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, jOffset), UnsafeUtil.getObject(t11, jOffset));
            case 11:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getInt(t10, jOffset) == UnsafeUtil.getInt(t11, jOffset);
            case 12:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getInt(t10, jOffset) == UnsafeUtil.getInt(t11, jOffset);
            case 13:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getInt(t10, jOffset) == UnsafeUtil.getInt(t11, jOffset);
            case 14:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getLong(t10, jOffset) == UnsafeUtil.getLong(t11, jOffset);
            case 15:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getInt(t10, jOffset) == UnsafeUtil.getInt(t11, jOffset);
            case 16:
                return arePresentForEquals(t10, t11, i10) && UnsafeUtil.getLong(t10, jOffset) == UnsafeUtil.getLong(t11, jOffset);
            case 17:
                return arePresentForEquals(t10, t11, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, jOffset), UnsafeUtil.getObject(t11, jOffset));
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
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, jOffset), UnsafeUtil.getObject(t11, jOffset));
            case 50:
                return SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, jOffset), UnsafeUtil.getObject(t11, jOffset));
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
                return isOneofCaseEqual(t10, t11, i10) && SchemaUtil.safeEquals(UnsafeUtil.getObject(t10, jOffset), UnsafeUtil.getObject(t11, jOffset));
            default:
                return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i10, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i10)));
    }
}
