package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Serialization.java */
/* JADX INFO: loaded from: classes11.dex */
public final class j2 {

    /* JADX INFO: compiled from: Serialization.java */
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field f20619a;

        public b(Field field) {
            this.f20619a = field;
            field.setAccessible(true);
        }

        public void a(T t10, int i10) {
            try {
                this.f20619a.set(t10, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        public void b(T t10, Object obj) {
            try {
                this.f20619a.set(t10, obj);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void b(a2<K, V> a2Var, ObjectInputStream objectInputStream, int i10) throws IOException, ClassNotFoundException {
        for (int i11 = 0; i11 < i10; i11++) {
            Collection collection = a2Var.get(objectInputStream.readObject());
            int i12 = objectInputStream.readInt();
            for (int i13 = 0; i13 < i12; i13++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void c(b2<E> b2Var, ObjectInputStream objectInputStream, int i10) throws IOException, ClassNotFoundException {
        for (int i11 = 0; i11 < i10; i11++) {
            b2Var.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static <T> b<T> a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    public static int d(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    public static <K, V> void e(a2<K, V> a2Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(a2Var.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : a2Var.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static <E> void f(b2<E> b2Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(b2Var.entrySet().size());
        for (b2.a<E> aVar : b2Var.entrySet()) {
            objectOutputStream.writeObject(aVar.getElement());
            objectOutputStream.writeInt(aVar.getCount());
        }
    }
}
