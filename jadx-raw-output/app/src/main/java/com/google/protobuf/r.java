package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: ListFieldSchema.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class r {
    private static final r FULL_INSTANCE;
    private static final r LITE_INSTANCE;

    /* JADX INFO: compiled from: ListFieldSchema.java */
    public static final class b extends r {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        @Override // com.google.protobuf.r
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
                    listMutableCopyWithCapacity2 = ((list instanceof g0) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i10) : new ArrayList<>(i10);
                }
                s0.putObject(obj, j10, listMutableCopyWithCapacity2);
                return listMutableCopyWithCapacity2;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i10);
                arrayList.addAll(list);
                s0.putObject(obj, j10, arrayList);
                obj2 = arrayList;
            } else {
                if (!(list instanceof UnmodifiableLazyStringList)) {
                    if (!(list instanceof g0) || !(list instanceof Internal.ProtobufList)) {
                        return list;
                    }
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        return list;
                    }
                    Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i10);
                    s0.putObject(obj, j10, protobufListMutableCopyWithCapacity2);
                    return protobufListMutableCopyWithCapacity2;
                }
                LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + i10);
                lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
                s0.putObject(obj, j10, lazyStringArrayList);
                obj2 = lazyStringArrayList;
            }
            return (List<L>) obj2;
        }

        public static <E> List<E> getList(Object obj, long j10) {
            return (List) s0.getObject(obj, j10);
        }

        @Override // com.google.protobuf.r
        public void makeImmutableListAt(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) s0.getObject(obj, j10);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof g0) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            s0.putObject(obj, j10, objUnmodifiableList);
        }

        @Override // com.google.protobuf.r
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
            s0.putObject(obj, j10, list);
        }
    }

    private r() {
    }

    public abstract void makeImmutableListAt(Object obj, long j10);

    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j10);

    public abstract <L> List<L> mutableListAt(Object obj, long j10);

    /* JADX INFO: compiled from: ListFieldSchema.java */
    public static final class c extends r {
        private c() {
            super();
        }

        public static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j10) {
            return (Internal.ProtobufList) s0.getObject(obj, j10);
        }

        @Override // com.google.protobuf.r
        public void makeImmutableListAt(Object obj, long j10) {
            getProtobufList(obj, j10).makeImmutable();
        }

        @Override // com.google.protobuf.r
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
            s0.putObject(obj, j10, protobufList2);
        }

        @Override // com.google.protobuf.r
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
                s0.putObject(obj, j10, protobufListMutableCopyWithCapacity2);
                return protobufListMutableCopyWithCapacity2;
            }
            return protobufList;
        }
    }

    static {
        FULL_INSTANCE = new b();
        LITE_INSTANCE = new c();
    }

    public static r full() {
        return FULL_INSTANCE;
    }

    public static r lite() {
        return LITE_INSTANCE;
    }
}
