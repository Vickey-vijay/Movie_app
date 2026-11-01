package com.ironsource.adqualitysdk.sdk.i;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class hq {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private a f2379;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<Field> f2380;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ho f2381;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Field m2298(Class cls, final String str) {
        a aVar = new a(this) { // from class: com.ironsource.adqualitysdk.sdk.i.hq.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.hq.a
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final boolean mo2302(Field field) {
                return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
            }
        };
        synchronized (hq.class) {
            if (this.f2380 == null) {
                this.f2380 = new ArrayList();
            }
            this.f2380.clear();
            m2297(cls, aVar, this.f2380);
            if (this.f2380.isEmpty()) {
                return null;
            }
            return this.f2380.get(0);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Field m2299(Class cls, ho hoVar) {
        synchronized (jx.class) {
            if (this.f2380 == null) {
                this.f2380 = new ArrayList();
            }
            this.f2380.clear();
            m2294(cls, hoVar, this.f2380);
            if (this.f2380.isEmpty()) {
                return null;
            }
            return this.f2380.get(0);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final <T> Field m2300(Class cls, Class<T> cls2) {
        Field fieldM2299;
        synchronized (jx.class) {
            if (this.f2381 == null) {
                this.f2381 = new ho();
            }
            this.f2381.m2277(cls2);
            fieldM2299 = m2299(cls, this.f2381);
        }
        return fieldM2299;
    }

    public class a {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f2383;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ho f2384;

        private a() {
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final void m2304(ho hoVar) {
            this.f2384 = hoVar;
            this.f2383 = hoVar.m2274();
        }

        public /* synthetic */ a(hq hqVar) {
            this();
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final ho m2303() {
            return this.f2384;
        }

        /* JADX INFO: renamed from: ｋ */
        public boolean mo2302(Field field) {
            boolean zIsAssignableFrom;
            if (this.f2384 == null || (field.getModifiers() & this.f2384.m2290()) != this.f2384.m2290() || (field.getModifiers() & this.f2384.m2291()) != 0 || this.f2384.m2276().contains(field.getType())) {
                return false;
            }
            if (this.f2384.m2273()) {
                zIsAssignableFrom = field.getType().equals(this.f2384.m2275());
            } else {
                zIsAssignableFrom = this.f2384.m2275().isAssignableFrom(field.getType());
            }
            if (zIsAssignableFrom) {
                int i10 = this.f2383;
                if (i10 == 0) {
                    return true;
                }
                this.f2383 = i10 - 1;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m2293(Class cls, ho hoVar) {
        if (hoVar != null && hoVar.m2289()) {
            return m2295(cls, hoVar.m2289(), hoVar.m2292(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (Error unused) {
            return cls.getFields();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final List<Field> m2301(Class cls, ho hoVar) {
        ArrayList arrayList = new ArrayList();
        m2294(cls, hoVar, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static ho.a m2296() {
        return new ho.a();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2297(Class cls, a aVar, List<Field> list) {
        for (Field field : m2293(cls, aVar.m2303())) {
            if (aVar.mo2302(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Field[] m2295(Class cls, boolean z10, int i10, List<String> list) {
        while (cls != null && !kb.m2845(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArrM2847 = new Field[0];
        if (cls != null) {
            Field[] declaredFields = new Field[0];
            Field[] fields = new Field[0];
            try {
                declaredFields = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fields = cls.getFields();
            } catch (Error unused2) {
            }
            fieldArrM2847 = kb.m2847(declaredFields, fields);
            if (!z10) {
                return fieldArrM2847;
            }
            Class superclass = cls.getSuperclass();
            for (int i11 = 0; superclass != null && i11 != i10; i11++) {
                try {
                    fieldArrM2847 = kb.m2847(fieldArrM2847, superclass.getDeclaredFields());
                } catch (Error unused3) {
                }
                try {
                    fieldArrM2847 = kb.m2847(fieldArrM2847, superclass.getFields());
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArrM2847;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2294(Class cls, ho hoVar, List<Field> list) {
        synchronized (hq.class) {
            if (this.f2379 == null) {
                this.f2379 = new a(this);
            }
            this.f2379.m2304(hoVar);
            m2297(cls, this.f2379, list);
        }
    }
}
