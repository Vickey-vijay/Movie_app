package com.mgs.carparking.db;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ironsource.Z7;
import java.lang.reflect.Field;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import zl.a;
import zl.b;
import zl.c;
import zl.d;
import zl.e;
import zl.f;
import zl.g;

/* JADX INFO: loaded from: classes7.dex */
public class TableHelper {
    private static final String TAG = "TableHelper";

    public static <T> void createTable(SQLiteDatabase sQLiteDatabase, Class<T> cls) {
        createTable(sQLiteDatabase, cls, cls.isAnnotationPresent(f.class) ? ((f) cls.getAnnotation(f.class)).name() : "");
    }

    public static <T> void createTablesByClasses(SQLiteDatabase sQLiteDatabase, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            createTable(sQLiteDatabase, cls);
        }
    }

    public static <T> void dropTablesByClasses(SQLiteDatabase sQLiteDatabase, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            dropTable(sQLiteDatabase, cls);
        }
    }

    public static List<Field> joinFieldsOnlyColumn(Field[] fieldArr, Field[] fieldArr2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Field field : fieldArr) {
            if (field.isAnnotationPresent(b.class)) {
                linkedHashMap.put(((b) field.getAnnotation(b.class)).name(), field);
            }
        }
        for (Field field2 : fieldArr2) {
            if (field2.isAnnotationPresent(b.class)) {
                b bVar = (b) field2.getAnnotation(b.class);
                if (!linkedHashMap.containsKey(bVar.name())) {
                    linkedHashMap.put(bVar.name(), field2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Field field3 = (Field) linkedHashMap.get((String) it.next());
            if (field3.isAnnotationPresent(c.class)) {
                arrayList.add(0, field3);
            } else {
                arrayList.add(field3);
            }
        }
        return arrayList;
    }

    public static <T> void addColumn(SQLiteDatabase sQLiteDatabase, Class<T> cls, String str) {
        sQLiteDatabase.execSQL("ALTER TABLE " + (cls.isAnnotationPresent(f.class) ? ((f) cls.getAnnotation(f.class)).name() : "") + " ADD " + str + " INTEGER DEFAULT 0");
    }

    public static <T> void addColumnInteger(SQLiteDatabase sQLiteDatabase, Class<T> cls, String str, int i10) {
        sQLiteDatabase.execSQL("ALTER TABLE " + (cls.isAnnotationPresent(f.class) ? ((f) cls.getAnnotation(f.class)).name() : "") + " ADD " + str + " INTEGER DEFAULT " + i10);
    }

    public static <T> void addColumnString(SQLiteDatabase sQLiteDatabase, Class<T> cls, String str) {
        sQLiteDatabase.execSQL("ALTER TABLE " + (cls.isAnnotationPresent(f.class) ? ((f) cls.getAnnotation(f.class)).name() : "") + " ADD " + str);
    }

    public static <T> void dropTable(SQLiteDatabase sQLiteDatabase, Class<T> cls) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS" + (cls.isAnnotationPresent(f.class) ? ((f) cls.getAnnotation(f.class)).name() : ""));
    }

    private static String getColumnType(Class<?> cls) {
        if (String.class == cls) {
            return "TEXT";
        }
        if (Integer.TYPE == cls || Integer.class == cls) {
            return "INTEGER";
        }
        if (Long.TYPE == cls || Long.class == cls) {
            return "BIGINT";
        }
        if (Float.TYPE == cls || Float.class == cls) {
            return "FLOAT";
        }
        if (Short.TYPE == cls || Short.class == cls) {
            return "INT";
        }
        if (Double.TYPE == cls || Double.class == cls) {
            return "DOUBLE";
        }
        return Blob.class == cls ? "BLOB" : "TEXT";
    }

    public static List<Field> joinFields(Field[] fieldArr, Field[] fieldArr2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Field field : fieldArr) {
            if (field.isAnnotationPresent(b.class)) {
                linkedHashMap.put(((b) field.getAnnotation(b.class)).name(), field);
            } else if (field.isAnnotationPresent(e.class)) {
                linkedHashMap.put(((e) field.getAnnotation(e.class)).name(), field);
            }
        }
        for (Field field2 : fieldArr2) {
            if (field2.isAnnotationPresent(b.class)) {
                b bVar = (b) field2.getAnnotation(b.class);
                if (!linkedHashMap.containsKey(bVar.name())) {
                    linkedHashMap.put(bVar.name(), field2);
                }
            } else if (field2.isAnnotationPresent(e.class)) {
                e eVar = (e) field2.getAnnotation(e.class);
                if (!linkedHashMap.containsKey(eVar.name())) {
                    linkedHashMap.put(eVar.name(), field2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Field field3 = (Field) linkedHashMap.get((String) it.next());
            if (field3.isAnnotationPresent(c.class)) {
                arrayList.add(0, field3);
            } else {
                arrayList.add(field3);
            }
        }
        return arrayList;
    }

    public static <T> void createTable(SQLiteDatabase sQLiteDatabase, Class<T> cls, String str) {
        String strType;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CREATE TABLE IF NOT EXISTS ");
        sb2.append(str);
        sb2.append(" (");
        for (Field field : joinFieldsOnlyColumn(cls)) {
            if (field.isAnnotationPresent(b.class)) {
                b bVar = (b) field.getAnnotation(b.class);
                if (bVar.type().equals("")) {
                    strType = getColumnType(field.getType());
                } else {
                    strType = bVar.type();
                }
                sb2.append(bVar.name() + Z7.f27998r + strType);
                if (bVar.length() != 0) {
                    sb2.append("(" + bVar.length() + ")");
                }
                if (field.isAnnotationPresent(c.class)) {
                    sb2.append(" primary key");
                    if (field.getType() == Integer.TYPE || field.getType() == Integer.class) {
                        sb2.append(" autoincrement");
                    }
                } else {
                    if (field.isAnnotationPresent(g.class)) {
                        sb2.append(" UNIQUE");
                    }
                    if (field.isAnnotationPresent(d.class)) {
                        sb2.append(" NOT NULL");
                    }
                    a aVar = (a) field.getAnnotation(a.class);
                    if (aVar != null && aVar.value() != null) {
                        sb2.append(" CHECK(");
                        sb2.append(aVar);
                        sb2.append(")");
                    }
                }
                sb2.append(", ");
            }
        }
        sb2.delete(sb2.length() - 2, sb2.length() - 1);
        sb2.append(")");
        String string = sb2.toString();
        t9.b.a("sql建表语句 >>>>>> " + string);
        sQLiteDatabase.execSQL(string);
    }

    public static List<Field> joinFieldsOnlyColumn(Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (cls == null || cls == Object.class) {
                break;
            }
            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(b.class)) {
                    String strName = ((b) field.getAnnotation(b.class)).name();
                    if (!linkedHashMap.containsKey(strName)) {
                        linkedHashMap.put(strName, field);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Field field2 = (Field) linkedHashMap.get((String) it.next());
            if (field2.isAnnotationPresent(c.class)) {
                arrayList.add(0, field2);
            } else {
                arrayList.add(field2);
            }
        }
        return arrayList;
    }
}
