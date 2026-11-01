package org.eclipse.jetty.util;

import com.ironsource.C3426d4;
import com.ironsource.G5;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class StringMap extends AbstractMap implements Externalizable {
    public static final boolean CASE_INSENSTIVE = true;
    public static final int __HASH_WIDTH = 17;
    public HashSet _entrySet;
    public boolean _ignoreCase;
    public c _nullEntry;
    public Object _nullValue;
    public b _root;
    public Set _umEntrySet;
    public int _width;

    public static class b implements Map.Entry {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public char[] f65732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public char[] f65733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b f65734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b[] f65735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f65736f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f65737g;

        public b() {
        }

        public b a(StringMap stringMap, int i10) {
            b bVar = new b();
            char[] cArr = this.f65732b;
            int length = cArr.length - i10;
            this.f65732b = new char[i10];
            bVar.f65732b = new char[length];
            System.arraycopy(cArr, 0, this.f65732b, 0, i10);
            System.arraycopy(cArr, i10, bVar.f65732b, 0, length);
            char[] cArr2 = this.f65733c;
            if (cArr2 != null) {
                this.f65733c = new char[i10];
                bVar.f65733c = new char[length];
                System.arraycopy(cArr2, 0, this.f65733c, 0, i10);
                System.arraycopy(cArr2, i10, bVar.f65733c, 0, length);
            }
            bVar.f65736f = this.f65736f;
            bVar.f65737g = this.f65737g;
            this.f65736f = null;
            this.f65737g = null;
            if (stringMap._entrySet.remove(this)) {
                stringMap._entrySet.add(bVar);
            }
            bVar.f65735e = this.f65735e;
            int i11 = stringMap._width;
            b[] bVarArr = new b[i11];
            this.f65735e = bVarArr;
            bVarArr[bVar.f65732b[0] % i11] = bVar;
            char[] cArr3 = bVar.f65733c;
            if (cArr3 != null) {
                char c10 = cArr3[0];
                if (bVarArr[c10 % i11] != bVar) {
                    bVarArr[c10 % i11] = bVar;
                }
            }
            return bVar;
        }

        public final void b(StringBuilder sb2) {
            sb2.append("{[");
            if (this.f65732b != null) {
                int i10 = 0;
                while (true) {
                    char[] cArr = this.f65732b;
                    if (i10 >= cArr.length) {
                        break;
                    }
                    sb2.append(cArr[i10]);
                    i10++;
                }
            } else {
                sb2.append('-');
            }
            sb2.append(':');
            sb2.append(this.f65736f);
            sb2.append(G5.T);
            sb2.append(this.f65737g);
            sb2.append(']');
            if (this.f65735e != null) {
                for (int i11 = 0; i11 < this.f65735e.length; i11++) {
                    sb2.append('|');
                    b bVar = this.f65735e[i11];
                    if (bVar != null) {
                        bVar.b(sb2);
                    } else {
                        sb2.append("-");
                    }
                }
            }
            sb2.append('}');
            if (this.f65734d != null) {
                sb2.append(",\n");
                this.f65734d.b(sb2);
            }
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f65736f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f65737g;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f65737g;
            this.f65737g = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            b(sb2);
            return sb2.toString();
        }

        public b(boolean z10, String str, int i10) {
            int length = str.length() - i10;
            this.f65732b = new char[length];
            this.f65733c = new char[length];
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = str.charAt(i10 + i11);
                this.f65732b[i11] = cCharAt;
                if (z10) {
                    if (Character.isUpperCase(cCharAt)) {
                        cCharAt = Character.toLowerCase(cCharAt);
                    } else if (Character.isLowerCase(cCharAt)) {
                        cCharAt = Character.toUpperCase(cCharAt);
                    }
                    this.f65733c[i11] = cCharAt;
                }
            }
        }
    }

    public class c implements Map.Entry {
        public c() {
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return null;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return StringMap.this._nullValue;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            StringMap stringMap = StringMap.this;
            Object obj2 = stringMap._nullValue;
            stringMap._nullValue = obj;
            return obj2;
        }

        public String toString() {
            return "[:null=" + StringMap.this._nullValue + C3426d4.j.f28588e;
        }
    }

    public StringMap() {
        this._width = 17;
        this._root = new b();
        this._ignoreCase = false;
        this._nullEntry = null;
        this._nullValue = null;
        HashSet hashSet = new HashSet(3);
        this._entrySet = hashSet;
        this._umEntrySet = Collections.unmodifiableSet(hashSet);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return this._nullEntry != null;
        }
        return getEntry(obj.toString(), 0, obj.toString().length()) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        if (obj == null) {
            return this._nullValue;
        }
        return obj instanceof String ? get((String) obj) : get(obj.toString());
    }

    public Map.Entry getEntry(String str, int i10, int i11) {
        if (str == null) {
            return this._nullEntry;
        }
        b bVar = this._root;
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            char cCharAt = str.charAt(i10 + i13);
            if (i12 == -1) {
                b[] bVarArr = bVar.f65735e;
                bVar = bVarArr == null ? null : bVarArr[cCharAt % this._width];
                i12 = 0;
            }
            while (bVar != null) {
                char[] cArr = bVar.f65732b;
                if (cArr[i12] == cCharAt || (this._ignoreCase && bVar.f65733c[i12] == cCharAt)) {
                    i12++;
                    if (i12 == cArr.length) {
                        i12 = -1;
                    }
                } else {
                    if (i12 > 0) {
                        return null;
                    }
                    bVar = bVar.f65734d;
                }
            }
            return null;
        }
        if (i12 > 0) {
            return null;
        }
        if (bVar == null || bVar.f65736f != null) {
            return bVar;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return obj == null ? put((String) null, obj2) : put(obj.toString(), obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return obj == null ? remove((String) null) : remove(obj.toString());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this._root = new b();
        this._nullEntry = null;
        this._nullValue = null;
        this._entrySet.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return this._umEntrySet;
    }

    public Map.Entry getBestEntry(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return this._nullEntry;
        }
        b bVar = this._root;
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            char c10 = (char) bArr[i10 + i13];
            if (i12 == -1) {
                b[] bVarArr = bVar.f65735e;
                b bVar2 = bVarArr == null ? null : bVarArr[c10 % this._width];
                if (bVar2 == null && i13 > 0) {
                    return bVar;
                }
                bVar = bVar2;
                i12 = 0;
            }
            while (bVar != null) {
                char[] cArr = bVar.f65732b;
                if (cArr[i12] == c10 || (this._ignoreCase && bVar.f65733c[i12] == c10)) {
                    i12++;
                    if (i12 == cArr.length) {
                        i12 = -1;
                    }
                } else {
                    if (i12 > 0) {
                        return null;
                    }
                    bVar = bVar.f65734d;
                }
            }
            return null;
        }
        if (i12 > 0) {
            return null;
        }
        if (bVar == null || bVar.f65736f != null) {
            return bVar;
        }
        return null;
    }

    public int getWidth() {
        return this._width;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this._entrySet.isEmpty();
    }

    public boolean isIgnoreCase() {
        return this._ignoreCase;
    }

    public void setIgnoreCase(boolean z10) {
        if (this._root.f65735e != null) {
            throw new IllegalStateException("Must be set before first put");
        }
        this._ignoreCase = z10;
    }

    public void setWidth(int i10) {
        this._width = i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this._entrySet.size();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        HashMap map = new HashMap(this);
        objectOutput.writeBoolean(this._ignoreCase);
        objectOutput.writeObject(map);
    }

    public Object put(String str, Object obj) {
        if (str == null) {
            Object obj2 = this._nullValue;
            this._nullValue = obj;
            if (this._nullEntry == null) {
                c cVar = new c();
                this._nullEntry = cVar;
                this._entrySet.add(cVar);
            }
            return obj2;
        }
        b bVar = this._root;
        b bVar2 = null;
        b bVar3 = null;
        int i10 = 0;
        int i11 = -1;
        loop0: while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (i11 == -1) {
                b[] bVarArr = bVar.f65735e;
                bVar2 = null;
                bVar3 = bVar;
                bVar = bVarArr == null ? null : bVarArr[cCharAt % this._width];
                i11 = 0;
            }
            while (true) {
                if (bVar != null) {
                    char[] cArr = bVar.f65732b;
                    if (cArr[i11] == cCharAt || (this._ignoreCase && bVar.f65733c[i11] == cCharAt)) {
                        i11++;
                        if (i11 == cArr.length) {
                            bVar2 = null;
                        } else {
                            bVar2 = null;
                        }
                        i10++;
                    } else if (i11 == 0) {
                        bVar2 = bVar;
                        bVar = bVar.f65734d;
                    } else {
                        bVar.a(this, i11);
                        i10--;
                    }
                    i11 = -1;
                    i10++;
                } else {
                    bVar = new b(this._ignoreCase, str, i10);
                    if (bVar2 == null) {
                        if (bVar3 != null) {
                            if (bVar3.f65735e == null) {
                                bVar3.f65735e = new b[this._width];
                            }
                            b[] bVarArr2 = bVar3.f65735e;
                            int i12 = this._width;
                            bVarArr2[cCharAt % i12] = bVar;
                            char[] cArr2 = bVar.f65733c;
                            int i13 = cArr2[0] % i12;
                            if (cArr2 != null && bVar.f65732b[0] % i12 != i13) {
                                b bVar4 = bVarArr2[i13];
                                if (bVar4 == null) {
                                    bVarArr2[i13] = bVar;
                                    break loop0;
                                }
                                while (true) {
                                    b bVar5 = bVar4.f65734d;
                                    if (bVar5 == null) {
                                        break;
                                    }
                                    bVar4 = bVar5;
                                }
                                bVar4.f65734d = bVar;
                                break loop0;
                            }
                            break loop0;
                            break loop0;
                        }
                        this._root = bVar;
                        break loop0;
                    }
                    bVar2.f65734d = bVar;
                    break loop0;
                }
            }
        }
        if (bVar == null) {
            return null;
        }
        if (i11 > 0) {
            bVar.a(this, i11);
        }
        Object obj3 = bVar.f65737g;
        bVar.f65736f = str;
        bVar.f65737g = obj;
        this._entrySet.add(bVar);
        return obj3;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        boolean z10 = objectInput.readBoolean();
        HashMap map = (HashMap) objectInput.readObject();
        setIgnoreCase(z10);
        putAll(map);
    }

    public Object remove(String str) {
        if (str == null) {
            Object obj = this._nullValue;
            c cVar = this._nullEntry;
            if (cVar != null) {
                this._entrySet.remove(cVar);
                this._nullEntry = null;
                this._nullValue = null;
            }
            return obj;
        }
        b bVar = this._root;
        int i10 = -1;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (i10 == -1) {
                b[] bVarArr = bVar.f65735e;
                bVar = bVarArr == null ? null : bVarArr[cCharAt % this._width];
                i10 = 0;
            }
            while (bVar != null) {
                char[] cArr = bVar.f65732b;
                if (cArr[i10] != cCharAt && (!this._ignoreCase || bVar.f65733c[i10] != cCharAt)) {
                    if (i10 > 0) {
                        return null;
                    }
                    bVar = bVar.f65734d;
                } else {
                    i10++;
                    if (i10 == cArr.length) {
                        i10 = -1;
                    }
                }
            }
            return null;
        }
        if (i10 > 0) {
            return null;
        }
        if (bVar != null && bVar.f65736f == null) {
            return null;
        }
        Object obj2 = bVar.f65737g;
        this._entrySet.remove(bVar);
        bVar.f65737g = null;
        bVar.f65736f = null;
        return obj2;
    }

    public Object get(String str) {
        if (str == null) {
            return this._nullValue;
        }
        Map.Entry entry = getEntry(str, 0, str.length());
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public StringMap(boolean z10) {
        this();
        this._ignoreCase = z10;
    }

    public Map.Entry getEntry(char[] cArr, int i10, int i11) {
        if (cArr == null) {
            return this._nullEntry;
        }
        b bVar = this._root;
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            char c10 = cArr[i10 + i13];
            if (i12 == -1) {
                b[] bVarArr = bVar.f65735e;
                bVar = bVarArr == null ? null : bVarArr[c10 % this._width];
                i12 = 0;
            }
            while (bVar != null) {
                char[] cArr2 = bVar.f65732b;
                if (cArr2[i12] != c10 && (!this._ignoreCase || bVar.f65733c[i12] != c10)) {
                    if (i12 > 0) {
                        return null;
                    }
                    bVar = bVar.f65734d;
                } else {
                    i12++;
                    if (i12 == cArr2.length) {
                        i12 = -1;
                    }
                }
            }
            return null;
        }
        if (i12 > 0) {
            return null;
        }
        if (bVar == null || bVar.f65736f != null) {
            return bVar;
        }
        return null;
    }

    public StringMap(boolean z10, int i10) {
        this();
        this._ignoreCase = z10;
        this._width = i10;
    }
}
