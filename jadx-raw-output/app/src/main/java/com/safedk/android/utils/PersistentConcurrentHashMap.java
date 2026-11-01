package com.safedk.android.utils;

import android.content.SharedPreferences;
import android.os.Build;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.RedirectData;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoAndCountPair;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class PersistentConcurrentHashMap<K, V> extends ConcurrentHashMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44888a = "SafeDKCache";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44889d = "PersistentConcurrentHashMap";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44890b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinkedHashSet<K> f44895h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f44892e = d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f44893f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44894g = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44891c = true;

    public void a(String str) {
        this.f44893f += ImpressionLog.Q + str;
        Logger.d(f44889d, "sdk_null_check added value " + str);
    }

    public String a() {
        return this.f44893f;
    }

    public PersistentConcurrentHashMap(String sharePrefsKey) {
        a(sharePrefsKey, -1);
    }

    public PersistentConcurrentHashMap(String sharePrefsKey, int capacityLimit) {
        a(sharePrefsKey, capacityLimit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r4.length() == 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void a(java.lang.String r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto Lb
            if (r4 == 0) goto L16
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L16
        Lb:
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "argument sharePrefsKey cannot be empty"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
            throw r0     // Catch: java.lang.Throwable -> L13
        L13:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L16:
            r3.f44890b = r4     // Catch: java.lang.Throwable -> L13
            r3.f44894g = r5     // Catch: java.lang.Throwable -> L13
            r0 = -1
            if (r5 <= r0) goto L4c
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L13
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L13
            r3.f44895h = r0     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "PersistentConcurrentHashMap"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "PersistentConcurrentHashMap filename = "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r3.f()     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = ", capacity limit = "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L13
            com.safedk.android.utils.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L13
        L4c:
            java.lang.String r0 = "PersistentConcurrentHashMap"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = "PersistentConcurrentHashMap instance created, filename = "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r3.f()     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L13
            com.safedk.android.utils.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L13
            r3.i()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.utils.PersistentConcurrentHashMap.a(java.lang.String, int):void");
    }

    public PersistentConcurrentHashMap() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    public synchronized K b() {
        K next;
        if (this.f44895h != null) {
            Iterator<K> it = this.f44895h.iterator();
            if (it.hasNext()) {
                next = it.next();
                Logger.d(f44889d, "instance created, filename = " + f() + "getFirst returned key " + next.toString());
            } else {
                next = null;
            }
        } else {
            next = null;
        }
        return next;
    }

    private PersistentConcurrentHashMap(int initialCapacity) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(Map m10) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(int initialCapacity, float loadFactor) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    private PersistentConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel) throws InvalidObjectException {
        throw new InvalidObjectException("This constructor is intentionally inaccessible");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized void putAll(Map map) {
        Logger.v(f44889d, "putAll started");
        for (K k10 : map.keySet()) {
            put(k10, map.get(k10));
            if (this.f44895h != null) {
                this.f44895h.add(k10);
            }
        }
        if (this.f44891c) {
            g();
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V put(K key, V value) {
        if (keySet().contains(key)) {
            super.remove(key);
            if (this.f44895h != null) {
                this.f44895h.remove(key);
            }
            Logger.d(f44889d, "put filename = " + f() + ", removed existing key " + key);
        }
        super.put(key, value);
        e();
        if (this.f44895h != null) {
            this.f44895h.add(key);
        }
        Logger.d(f44889d, "put filename = " + f() + ", added key " + key);
        if (this.f44891c) {
            g();
        }
        return value;
    }

    private synchronized void e() {
        if (this.f44894g > -1 && size() > this.f44894g) {
            K kB = b();
            if (kB != null) {
                remove(kB);
                Logger.d(f44889d, "removeOldestEntryIfNecessary filename = " + f() + ", removed key " + kB);
            } else {
                Logger.d(f44889d, "removeOldestEntryIfNecessary filename = " + f() + ", first item is null");
            }
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean remove(Object key, Object value) {
        V vRemove;
        vRemove = remove(key);
        if (this.f44895h != null) {
            this.f44895h.remove(key);
        }
        Logger.d(f44889d, "remove filename = " + f() + ", removed key " + vRemove);
        return vRemove != null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized V remove(Object obj) {
        V v10;
        try {
            if (obj == null) {
                Logger.d(f44889d, "remove filename = " + f() + ", key is null, skipping");
                v10 = null;
            } else {
                v10 = (V) super.remove(obj);
                if (this.f44895h != null) {
                    this.f44895h.remove(obj);
                }
                Logger.v(f44889d, "remove filename=" + f() + ", removed key " + obj);
                if (this.f44891c) {
                    g();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return v10;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized boolean replace(K key, V oldValue, V newValue) {
        boolean zReplace;
        zReplace = super.replace(key, oldValue, newValue);
        Logger.d(f44889d, "replace filename = " + f() + ", replace key " + key.toString());
        if (this.f44891c) {
            g();
        }
        return zReplace;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public synchronized V replace(K k10, V v10) {
        V v11;
        v11 = (V) super.replace(k10, v10);
        Logger.d(f44889d, "replace filename = " + f() + ", replace key " + k10.toString());
        if (this.f44891c) {
            g();
        }
        return v11;
    }

    private String f() {
        return "SafeDKCache_" + this.f44890b;
    }

    public boolean c() {
        return this.f44891c;
    }

    public void a(boolean z10) {
        this.f44891c = z10;
        if (this.f44891c) {
            g();
        }
    }

    private synchronized void g() {
        Logger.d(f44889d, "saveMap started, map key=" + f() + ", size before filtering=" + entrySet().size());
        try {
            SharedPreferences sharedPreferences = SafeDK.getInstance().l().getSharedPreferences(f(), 0);
            if (sharedPreferences != null) {
                String strA = h.a(h());
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (sharedPreferences.contains(this.f44890b)) {
                    editorEdit.remove(this.f44890b).apply();
                }
                editorEdit.putString(this.f44890b, strA);
                editorEdit.apply();
                Logger.v(f44889d, "Map saved, key=" + f() + ", content length=" + (strA != null ? Integer.valueOf(strA.length()) : "null"));
            } else {
                Logger.d(f44889d, "saveMap cannot get share prefs object");
            }
        } catch (Exception e10) {
            Logger.d(f44889d, "Exception while saving map data", e10);
        }
    }

    private ConcurrentHashMap<K, V> h() {
        Logger.d(f44889d, "filtering items for saving started, key=" + this.f44890b + ", max items=" + SafeDK.getInstance().R());
        ConcurrentHashMap<K, V> concurrentHashMap = new ConcurrentHashMap<>();
        synchronized (concurrentHashMap) {
            if (concurrentHashMap.size() <= SafeDK.getInstance().R()) {
                for (Map.Entry<K, V> entry : entrySet()) {
                    if (entry.getValue() instanceof CreativeInfo) {
                        if (a((CreativeInfo) entry.getValue())) {
                            concurrentHashMap.put(entry.getKey(), entry.getValue());
                        }
                    } else if (entry.getValue() instanceof CreativeInfoAndCountPair) {
                        CreativeInfoAndCountPair creativeInfoAndCountPair = (CreativeInfoAndCountPair) entry.getValue();
                        if (creativeInfoAndCountPair != null && a(creativeInfoAndCountPair.a())) {
                            concurrentHashMap.put(entry.getKey(), entry.getValue());
                        }
                    } else {
                        concurrentHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        Logger.d(f44889d, "filtering items for saving " + f() + " Filtered map contains " + concurrentHashMap.size());
        return concurrentHashMap;
    }

    private boolean a(CreativeInfo creativeInfo) {
        if (!SafeDK.getInstance().S().contains(creativeInfo.Q())) {
            return false;
        }
        if (creativeInfo.Y() != null && creativeInfo.Y().before(new Timestamp(System.currentTimeMillis()))) {
            return false;
        }
        return true;
    }

    private void i() {
        Logger.d(f44889d, "loadMap started, map key=" + f());
        try {
            try {
                try {
                    SharedPreferences sharedPreferences = SafeDK.getInstance().l().getSharedPreferences(f(), 0);
                    new ConcurrentHashMap();
                    if (sharedPreferences != null) {
                        String string = sharedPreferences.getString(this.f44890b, null);
                        if (string != null) {
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) h.a(string);
                            Logger.d(f44889d, "loadMap (" + f() + ") content length = " + string.length() + ", concurrentHashMap size = " + concurrentHashMap.size());
                            this.f44891c = false;
                            for (Map.Entry<K, V> entry : concurrentHashMap.entrySet()) {
                                if (entry.getValue() instanceof CreativeInfo) {
                                    CreativeInfo creativeInfo = (CreativeInfo) entry.getValue();
                                    if (creativeInfo != null) {
                                        Logger.d(f44889d, "loadMap including item " + creativeInfo.L() + " ,AdType is " + creativeInfo.K().name() + ", persistentContentSize(" + f() + "):" + string.length());
                                        creativeInfo.a(ImpressionLog.f43627c, new ImpressionLog.a[0]);
                                        creativeInfo.ac();
                                        put(entry.getKey(), entry.getValue());
                                        if (this.f44895h != null) {
                                            this.f44895h.add(entry.getKey());
                                        }
                                    }
                                } else if (entry.getValue() instanceof CreativeInfoAndCountPair) {
                                    CreativeInfoAndCountPair creativeInfoAndCountPair = (CreativeInfoAndCountPair) entry.getValue();
                                    if (creativeInfoAndCountPair != null && creativeInfoAndCountPair.a() != null) {
                                        CreativeInfo creativeInfoA = creativeInfoAndCountPair.a();
                                        Logger.d(f44889d, "loadMap including item " + creativeInfoA.L() + " ,AdType is " + creativeInfoA.K().name() + ", persistentContentSize(" + f() + "):" + string.length());
                                        creativeInfoA.a(ImpressionLog.f43627c, new ImpressionLog.a[0]);
                                        creativeInfoA.ac();
                                        put(entry.getKey(), entry.getValue());
                                        if (this.f44895h != null) {
                                            this.f44895h.add(entry.getKey());
                                        }
                                    }
                                } else if (entry.getValue() instanceof Boolean) {
                                    put(entry.getKey(), entry.getValue());
                                    if (this.f44895h != null) {
                                        this.f44895h.add(entry.getKey());
                                    }
                                } else if (entry.getValue() instanceof StatsEvent) {
                                    put(entry.getKey(), entry.getValue());
                                    if (this.f44895h != null) {
                                        this.f44895h.add(entry.getKey());
                                    }
                                } else if (entry.getValue() instanceof RedirectData) {
                                    Logger.d(f44889d, "loadMap item key: " + entry.getKey() + ", value: " + entry.getValue());
                                    put(entry.getKey(), entry.getValue());
                                    if (this.f44895h != null) {
                                        this.f44895h.add(entry.getKey());
                                    }
                                }
                            }
                        } else {
                            Logger.d(f44889d, "loadMap map is empty");
                        }
                        Logger.d(f44889d, "loadMap loaded map " + f() + " : " + size() + " items");
                    }
                    this.f44891c = true;
                } catch (Throwable th2) {
                    Logger.e(f44889d, "loadMap Error loading Map from file", th2);
                    g();
                    this.f44891c = true;
                }
            } catch (InvalidClassException e10) {
                Logger.d(f44889d, "loadMap Exception loading Map from file : " + e10.getMessage(), e10);
                g();
                this.f44891c = true;
            } catch (IllegalArgumentException e11) {
                Logger.d(f44889d, "loadMap Data mismatch exception loading Map from file : " + e11.getMessage(), e11);
                g();
                this.f44891c = true;
            }
        } catch (Throwable th3) {
            this.f44891c = true;
            throw th3;
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        super.clear();
        g();
    }

    public static String d() {
        try {
            String str = (String) Class.forName("android.app.ActivityThread").getDeclaredMethod(Build.VERSION.SDK_INT >= 18 ? "currentProcessName" : "currentPackageName", new Class[0]).invoke(null, new Object[0]);
            Logger.d(f44889d, "getProcessName : " + str);
            return str;
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }
}
