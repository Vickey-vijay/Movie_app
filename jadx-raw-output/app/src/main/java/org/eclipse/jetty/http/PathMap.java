package org.eclipse.jetty.http;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.StringMap;

/* JADX INFO: loaded from: classes11.dex */
public class PathMap extends HashMap implements Externalizable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f65536b = ":,";
    public a _default;
    public List _defaultSingletonList;
    public final Set _entrySet;
    public final StringMap _exactMap;
    public boolean _nodefault;
    public a _prefixDefault;
    public final StringMap _prefixMap;
    public final StringMap _suffixMap;

    public static class a implements Map.Entry {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f65537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f65538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f65539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public transient String f65540e;

        public String a() {
            return this.f65539d;
        }

        public void b(String str) {
            this.f65539d = str;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f65537b;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f65538c;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            if (this.f65540e == null) {
                this.f65540e = this.f65537b + "=" + this.f65538c;
            }
            return this.f65540e;
        }

        public a(Object obj, Object obj2) {
            this.f65537b = obj;
            this.f65538c = obj2;
        }
    }

    public PathMap() {
        super(11);
        this._prefixMap = new StringMap();
        this._suffixMap = new StringMap();
        this._exactMap = new StringMap();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        this._entrySet = entrySet();
    }

    public static String pathMatch(String str, String str2) {
        char cCharAt = str.charAt(0);
        if (cCharAt != '/') {
            if (cCharAt == '*' && str2.regionMatches(str2.length() - (str.length() - 1), str, 1, str.length() - 1)) {
                return str2;
            }
            return null;
        }
        if (str.length() == 1 || str.equals(str2)) {
            return str2;
        }
        if (a(str, str2)) {
            return str2.substring(0, str.length() - 2);
        }
        return null;
    }

    public Object getLazyMatches(String str) {
        if (str == null) {
            return LazyList.getList(null);
        }
        int length = str.length();
        int iIndexOf = 0;
        Map.Entry entry = this._exactMap.getEntry(str, 0, length);
        Object objAdd = entry != null ? LazyList.add(null, entry.getValue()) : null;
        int iLastIndexOf = length - 1;
        while (true) {
            iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
            if (iLastIndexOf < 0) {
                break;
            }
            Map.Entry entry2 = this._prefixMap.getEntry(str, 0, iLastIndexOf);
            if (entry2 != null) {
                objAdd = LazyList.add(objAdd, entry2.getValue());
            }
        }
        a aVar = this._prefixDefault;
        if (aVar != null) {
            objAdd = LazyList.add(objAdd, aVar);
        }
        while (true) {
            iIndexOf = str.indexOf(46, iIndexOf + 1);
            if (iIndexOf <= 0) {
                break;
            }
            Map.Entry entry3 = this._suffixMap.getEntry(str, iIndexOf + 1, (length - iIndexOf) - 1);
            if (entry3 != null) {
                objAdd = LazyList.add(objAdd, entry3.getValue());
            }
        }
        a aVar2 = this._default;
        if (aVar2 != null) {
            return objAdd == null ? this._defaultSingletonList : LazyList.add(objAdd, aVar2);
        }
        return objAdd;
    }

    public Object match(String str) {
        a match = getMatch(str);
        if (match != null) {
            return match.getValue();
        }
        return null;
    }

    public static String pathInfo(String str, String str2) {
        if ("".equals(str)) {
            return str2;
        }
        if (str.charAt(0) != '/' || str.length() == 1) {
            return null;
        }
        boolean zA = a(str, str2);
        if ((!str.equals(str2) || zA) && zA && str2.length() != str.length() - 2) {
            return str2.substring(str.length() - 2);
        }
        return null;
    }

    public static void setPathSpecSeparators(String str) {
        f65536b = str;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        this._exactMap.clear();
        this._prefixMap.clear();
        this._suffixMap.clear();
        this._default = null;
        this._defaultSingletonList = null;
        super.clear();
    }

    public a getMatch(String str) {
        Map.Entry entry;
        Map.Entry entry2;
        Map.Entry entry3;
        if (str == null) {
            return null;
        }
        int length = str.length();
        int iIndexOf = 0;
        if (length == 1 && str.charAt(0) == '/' && (entry3 = (Map.Entry) this._exactMap.get("")) != null) {
            return (a) entry3;
        }
        Map.Entry entry4 = this._exactMap.getEntry(str, 0, length);
        if (entry4 != null) {
            return (a) entry4.getValue();
        }
        int iLastIndexOf = length;
        do {
            iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
            if (iLastIndexOf < 0) {
                a aVar = this._prefixDefault;
                if (aVar != null) {
                    return aVar;
                }
                do {
                    iIndexOf = str.indexOf(46, iIndexOf + 1);
                    if (iIndexOf <= 0) {
                        return this._default;
                    }
                    entry = this._suffixMap.getEntry(str, iIndexOf + 1, (length - iIndexOf) - 1);
                } while (entry == null);
                return (a) entry.getValue();
            }
            entry2 = this._prefixMap.getEntry(str, 0, iLastIndexOf);
        } while (entry2 == null);
        return (a) entry2.getValue();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj != null) {
            String str = (String) obj;
            if (str.equals("/*")) {
                this._prefixDefault = null;
            } else if (str.endsWith("/*")) {
                this._prefixMap.remove(str.substring(0, str.length() - 2));
                this._exactMap.remove(str.substring(0, str.length() - 1));
                this._exactMap.remove(str.substring(0, str.length() - 2));
            } else if (str.startsWith("*.")) {
                this._suffixMap.remove(str.substring(2));
            } else if (str.equals("/")) {
                this._default = null;
                this._defaultSingletonList = null;
            } else {
                this._exactMap.remove(str);
            }
        }
        return super.remove(obj);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(new HashMap(this));
    }

    public static boolean a(String str, String str2) {
        int length = str.length() - 2;
        if (!str.endsWith("/*") || !str2.regionMatches(0, str, 0, length) || (str2.length() != length && '/' != str2.charAt(length))) {
            return false;
        }
        return true;
    }

    public static boolean match(String str, String str2) throws IllegalArgumentException {
        return match(str, str2, false);
    }

    public static String relativePath(String str, String str2, String str3) {
        String strPathInfo = pathInfo(str2, str3);
        if (strPathInfo != null) {
            str3 = strPathInfo;
        }
        if (str3.startsWith("./")) {
            str3 = str3.substring(2);
        }
        if (str.endsWith("/")) {
            if (str3.startsWith("/")) {
                return str + str3.substring(1);
            }
            return str + str3;
        }
        if (str3.startsWith("/")) {
            return str + str3;
        }
        return str + "/" + str3;
    }

    public boolean containsMatch(String str) {
        a match = getMatch(str);
        if (match != null && !match.equals(this._default)) {
            return true;
        }
        return false;
    }

    public List getMatches(String str) {
        return LazyList.getList(getLazyMatches(str));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        String string = obj.toString();
        if ("".equals(string.trim())) {
            a aVar = new a("", obj2);
            aVar.b("");
            this._exactMap.put("", (Object) aVar);
            return super.put("", obj2);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(string, f65536b);
        Object obj3 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!strNextToken.startsWith("/") && !strNextToken.startsWith("*.")) {
                throw new IllegalArgumentException("PathSpec " + strNextToken + ". must start with '/' or '*.'");
            }
            Object objPut = super.put(strNextToken, obj2);
            a aVar2 = new a(strNextToken, obj2);
            if (aVar2.getKey().equals(strNextToken)) {
                if (strNextToken.equals("/*")) {
                    this._prefixDefault = aVar2;
                } else if (strNextToken.endsWith("/*")) {
                    String strSubstring = strNextToken.substring(0, strNextToken.length() - 2);
                    aVar2.b(strSubstring);
                    this._prefixMap.put(strSubstring, (Object) aVar2);
                    this._exactMap.put(strSubstring, (Object) aVar2);
                    this._exactMap.put(strNextToken.substring(0, strNextToken.length() - 1), (Object) aVar2);
                } else if (strNextToken.startsWith("*.")) {
                    this._suffixMap.put(strNextToken.substring(2), (Object) aVar2);
                } else if (strNextToken.equals("/")) {
                    if (this._nodefault) {
                        this._exactMap.put(strNextToken, (Object) aVar2);
                    } else {
                        this._default = aVar2;
                        this._defaultSingletonList = Collections.singletonList(aVar2);
                    }
                } else {
                    aVar2.b(strNextToken);
                    this._exactMap.put(strNextToken, (Object) aVar2);
                }
            }
            obj3 = objPut;
        }
        return obj3;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        putAll((HashMap) objectInput.readObject());
    }

    public static boolean match(String str, String str2, boolean z10) throws IllegalArgumentException {
        if (str.length() == 0) {
            return "/".equals(str2);
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '/') {
            if ((!z10 && str.length() == 1) || str.equals(str2) || a(str, str2)) {
                return true;
            }
        } else if (cCharAt == '*') {
            return str2.regionMatches((str2.length() - str.length()) + 1, str, 1, str.length() - 1);
        }
        return false;
    }

    public PathMap(boolean z10) {
        super(11);
        this._prefixMap = new StringMap();
        this._suffixMap = new StringMap();
        this._exactMap = new StringMap();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        this._entrySet = entrySet();
        this._nodefault = z10;
    }

    public PathMap(int i10) {
        super(i10);
        this._prefixMap = new StringMap();
        this._suffixMap = new StringMap();
        this._exactMap = new StringMap();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        this._entrySet = entrySet();
    }

    public PathMap(Map map) {
        this._prefixMap = new StringMap();
        this._suffixMap = new StringMap();
        this._exactMap = new StringMap();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        putAll(map);
        this._entrySet = entrySet();
    }
}
