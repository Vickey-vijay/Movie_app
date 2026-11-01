package org.eclipse.jetty.util;

import com.ironsource.C3426d4;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public class LazyList implements Cloneable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f65731b = new String[0];

    public static Object add(Object obj, Object obj2) {
        if (obj == null) {
            if (!(obj2 instanceof List) && obj2 != null) {
                return obj2;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj2);
            return arrayList;
        }
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(obj);
        arrayList2.add(obj2);
        return arrayList2;
    }

    public static Object addArray(Object obj, Object[] objArr) {
        for (int i10 = 0; objArr != null && i10 < objArr.length; i10++) {
            obj = add(obj, objArr[i10]);
        }
        return obj;
    }

    public static <T> T[] addToArray(T[] tArr, T t10, Class<?> cls) {
        if (tArr != null) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), Array.getLength(tArr) + 1));
            System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
            tArr2[tArr.length] = t10;
            return tArr2;
        }
        if (cls == null && t10 != null) {
            cls = t10.getClass();
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(cls, 1));
        tArr3[0] = t10;
        return tArr3;
    }

    public static <E> List<E> getList(Object obj) {
        return getList(obj, false);
    }

    public static Object remove(Object obj, Object obj2) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            if (obj.equals(obj2)) {
                return null;
            }
            return obj;
        }
        List list = (List) obj;
        list.remove(obj2);
        if (list.size() == 0) {
            return null;
        }
        return obj;
    }

    public static Object toArray(Object obj, Class<?> cls) {
        if (obj == null) {
            return Array.newInstance(cls, 0);
        }
        if (!(obj instanceof List)) {
            Object objNewInstance = Array.newInstance(cls, 1);
            Array.set(objNewInstance, 0, obj);
            return objNewInstance;
        }
        List list = (List) obj;
        if (!cls.isPrimitive()) {
            return list.toArray((Object[]) Array.newInstance(cls, list.size()));
        }
        Object objNewInstance2 = Array.newInstance(cls, list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Array.set(objNewInstance2, i10, list.get(i10));
        }
        return objNewInstance2;
    }

    public static <E> List<E> array2List(E[] eArr) {
        return (eArr == null || eArr.length == 0) ? new ArrayList() : new ArrayList(Arrays.asList(eArr));
    }

    public static Object clone(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof List ? new ArrayList((List) obj) : obj;
    }

    public static boolean contains(Object obj, Object obj2) {
        if (obj == null) {
            return false;
        }
        return obj instanceof List ? ((List) obj).contains(obj2) : obj.equals(obj2);
    }

    public static Object ensureSize(Object obj, int i10) {
        if (obj == null) {
            return new ArrayList(i10);
        }
        if (!(obj instanceof ArrayList)) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.add(obj);
            return arrayList;
        }
        ArrayList arrayList2 = (ArrayList) obj;
        if (arrayList2.size() > i10) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(i10);
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> E get(Object obj, int i10) {
        if (obj == 0) {
            throw new IndexOutOfBoundsException();
        }
        if (obj instanceof List) {
            return (E) ((List) obj).get(i10);
        }
        if (i10 == 0) {
            return obj;
        }
        throw new IndexOutOfBoundsException();
    }

    public static <E> List<E> getList(Object obj, boolean z10) {
        if (obj != null) {
            return obj instanceof List ? (List) obj : Collections.singletonList(obj);
        }
        if (z10) {
            return null;
        }
        return Collections.emptyList();
    }

    public static <E> Iterator<E> iterator(Object obj) {
        if (obj == null) {
            return Collections.emptyList().iterator();
        }
        return obj instanceof List ? ((List) obj).iterator() : getList(obj).iterator();
    }

    public static <E> ListIterator<E> listIterator(Object obj) {
        if (obj == null) {
            return Collections.emptyList().listIterator();
        }
        return obj instanceof List ? ((List) obj).listIterator() : getList(obj).listIterator();
    }

    public static <T> T[] removeFromArray(T[] tArr, Object obj) {
        if (obj != null && tArr != null) {
            int length = tArr.length;
            while (true) {
                int i10 = length - 1;
                if (length <= 0) {
                    break;
                }
                if (obj.equals(tArr[i10])) {
                    T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), Array.getLength(tArr) - 1));
                    if (i10 > 0) {
                        System.arraycopy(tArr, 0, tArr2, 0, i10);
                    }
                    int i11 = i10 + 1;
                    if (i11 < tArr.length) {
                        System.arraycopy(tArr, i11, tArr2, i10, tArr.length - i11);
                    }
                    return tArr2;
                }
                length = i10;
            }
        }
        return tArr;
    }

    public static int size(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        return 1;
    }

    public static String toString(Object obj) {
        if (obj == null) {
            return "[]";
        }
        if (obj instanceof List) {
            return obj.toString();
        }
        return C3426d4.j.f28586d + obj + C3426d4.j.f28588e;
    }

    public static String[] toStringArray(Object obj) {
        if (obj == null) {
            return f65731b;
        }
        if (!(obj instanceof List)) {
            return new String[]{obj.toString()};
        }
        List list = (List) obj;
        String[] strArr = new String[list.size()];
        int size = list.size();
        while (true) {
            int i10 = size - 1;
            if (size <= 0) {
                return strArr;
            }
            Object obj2 = list.get(i10);
            if (obj2 != null) {
                strArr[i10] = obj2.toString();
            }
            size = i10;
        }
    }

    public static Object addCollection(Object obj, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            obj = add(obj, it.next());
        }
        return obj;
    }

    public static Object remove(Object obj, int i10) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            if (i10 == 0) {
                return null;
            }
            return obj;
        }
        List list = (List) obj;
        list.remove(i10);
        if (list.size() == 0) {
            return null;
        }
        return obj;
    }

    public static Object add(Object obj, int i10, Object obj2) {
        if (obj == null) {
            if (i10 <= 0 && !(obj2 instanceof List) && obj2 != null) {
                return obj2;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(i10, obj2);
            return arrayList;
        }
        if (obj instanceof List) {
            ((List) obj).add(i10, obj2);
            return obj;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(obj);
        arrayList2.add(i10, obj2);
        return arrayList2;
    }
}
