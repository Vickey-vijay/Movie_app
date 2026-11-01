package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
abstract class ListFieldSchema {
    private static final ListFieldSchema FULL_INSTANCE;
    private static final ListFieldSchema LITE_INSTANCE;

    public static final class ListFieldSchemaFull extends ListFieldSchema {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private ListFieldSchemaFull() {
            super();
        }

        @Override // com.explorestack.protobuf.ListFieldSchema
        public <L> List<L> mutableListAt(Object obj, long j10) {
            return mutableListAt(obj, j10, 10);
        }

        private static <L> List<L> mutableListAt(Object obj, long j10, int i10) {
            Object obj2;
            List<L> listMutableCopyWithCapacity2;
            List<L> list = getList(obj, j10);
            if (list.isEmpty()) {
                if (list instanceof LazyStringList) {
                    listMutableCopyWithCapacity2 = new LazyStringArrayList(i10);
                } else {
                    listMutableCopyWithCapacity2 = ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i10) : new ArrayList<>(i10);
                }
                UnsafeUtil.putObject(obj, j10, listMutableCopyWithCapacity2);
                return listMutableCopyWithCapacity2;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i10);
                arrayList.addAll(list);
                UnsafeUtil.putObject(obj, j10, arrayList);
                obj2 = arrayList;
            } else {
                if (!(list instanceof UnmodifiableLazyStringList)) {
                    if (!(list instanceof PrimitiveNonBoxingCollection) || !(list instanceof Internal.ProtobufList)) {
                        return list;
                    }
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        return list;
                    }
                    Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i10);
                    UnsafeUtil.putObject(obj, j10, protobufListMutableCopyWithCapacity2);
                    return protobufListMutableCopyWithCapacity2;
                }
                LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + i10);
                lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
                UnsafeUtil.putObject(obj, j10, lazyStringArrayList);
                obj2 = lazyStringArrayList;
            }
            return (List<L>) obj2;
        }

        public static <E> List<E> getList(Object obj, long j10) {
            return (List) UnsafeUtil.getObject(obj, j10);
        }

        @Override // com.explorestack.protobuf.ListFieldSchema
        public void makeImmutableListAt(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) UnsafeUtil.getObject(obj, j10);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            UnsafeUtil.putObject(obj, j10, objUnmodifiableList);
        }

        @Override // com.explorestack.protobuf.ListFieldSchema
        public <E> void mergeListsAt(Object obj, Object obj2, long j10) {
            List list = getList(obj2, j10);
            List listMutableListAt = mutableListAt(obj, j10, list.size());
            int size = listMutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listMutableListAt.addAll(list);
            }
            if (size > 0) {
                list = listMutableListAt;
            }
            UnsafeUtil.putObject(obj, j10, list);
        }
    }

    private ListFieldSchema() {
    }

    public abstract void makeImmutableListAt(Object obj, long j10);

    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j10);

    public abstract <L> List<L> mutableListAt(Object obj, long j10);

    public static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
            super();
        }

        public static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j10) {
            return (Internal.ProtobufList) UnsafeUtil.getObject(obj, j10);
        }

        @Override // com.explorestack.protobuf.ListFieldSchema
        public void makeImmutableListAt(Object obj, long j10) {
            getProtobufList(obj, j10).makeImmutable();
        }

        @Override // com.explorestack.protobuf.ListFieldSchema
        public <E> void mergeListsAt(Object obj, Object obj2, long j10) {
            Internal.ProtobufList protobufList = getProtobufList(obj, j10);
            Internal.ProtobufList protobufList2 = getProtobufList(obj2, j10);
            int size = protobufList.size();
            int size2 = protobufList2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufList.isModifiable()) {
                    protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
                }
                protobufList.addAll(protobufList2);
            }
            if (size > 0) {
                protobufList2 = protobufList;
            }
            UnsafeUtil.putObject(obj, j10, protobufList2);
        }

        @Override // com.explorestack.protobuf.ListFieldSchema
        public <L> List<L> mutableListAt(Object obj, long j10) {
            int i10;
            Internal.ProtobufList protobufList = getProtobufList(obj, j10);
            if (!protobufList.isModifiable()) {
                int size = protobufList.size();
                if (size == 0) {
                    i10 = 10;
                } else {
                    i10 = size * 2;
                }
                Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(i10);
                UnsafeUtil.putObject(obj, j10, protobufListMutableCopyWithCapacity2);
                return protobufListMutableCopyWithCapacity2;
            }
            return protobufList;
        }
    }

    static {
        FULL_INSTANCE = new ListFieldSchemaFull();
        LITE_INSTANCE = new ListFieldSchemaLite();
    }

    public static ListFieldSchema full() {
        return FULL_INSTANCE;
    }

    public static ListFieldSchema lite() {
        return LITE_INSTANCE;
    }
}
