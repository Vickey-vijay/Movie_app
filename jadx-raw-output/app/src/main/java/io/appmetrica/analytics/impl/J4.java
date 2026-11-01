package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* JADX INFO: loaded from: classes5.dex */
public final class J4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55390a = 2000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55391b = "number";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55392c = "global_number";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55393d = "number_of_type";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55394e = "name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f55395f = "value";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f55396g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f55397h = "time";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f55398i = "session_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f55399j = "error_environment";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f55400k = "session_type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f55401l = "app_environment";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f55402m = "app_environment_revision";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f55403n = "truncated";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f55404o = "custom_type";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f55405p = "encrypting_mode";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f55406q = "profile_id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f55407r = "first_occurrence_status";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f55408s = "source";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f55409t = "attribution_id_changed";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f55410u = "open_id";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f55411v = "extras";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f55412w = com.ironsource.Z7.f27982b;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C4211g7 f55413x = new C4211g7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C4185f7 c4185f7) {
        Long l10;
        EnumC4112cb enumC4112cb;
        Long l11;
        Long l12;
        Long l13;
        Integer num;
        Long l14 = c4185f7.f56715a;
        return (l14 == null || l14.longValue() < 10000000000L || c4185f7.f56716b == null || (l10 = c4185f7.f56717c) == null || l10.longValue() < 0 || (enumC4112cb = c4185f7.f56718d) == null || enumC4112cb == EnumC4112cb.EVENT_TYPE_UNDEFINED || (l11 = c4185f7.f56719e) == null || l11.longValue() < 0 || (l12 = c4185f7.f56720f) == null || l12.longValue() < 0 || ((l13 = c4185f7.f56721g.f56642d) != null && l13.longValue() < 0) || ((num = c4185f7.f56721g.f56647i) != null && num.intValue() < 0)) ? false : true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor = null;
        try {
            cursorQuery = sQLiteDatabase.query(this.f55412w, null, null, null, null, null, null, String.valueOf(this.f55390a));
            while (cursorQuery.moveToNext()) {
                try {
                    C4185f7 c4185f7A = a(cursorQuery);
                    if (c4185f7A != null && a(c4185f7A)) {
                        try {
                            sQLiteDatabase.insertOrThrow("events", null, this.f55413x.fromModel(c4185f7A));
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursorQuery = cursor;
                    }
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f55412w);
                }
            }
        } catch (Throwable unused3) {
        }
        cursorQuery.close();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f55412w);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0164 A[PHI: r3
  0x0164: PHI (r3v44 io.appmetrica.analytics.impl.n9) = (r3v43 io.appmetrica.analytics.impl.n9), (r3v45 io.appmetrica.analytics.impl.n9) binds: [B:56:0x0162, B:62:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a7 A[Catch: all -> 0x01bb, TryCatch #4 {all -> 0x01bb, blocks: (B:3:0x0004, B:9:0x002e, B:16:0x003b, B:22:0x00f6, B:28:0x0102, B:35:0x0112, B:71:0x0188, B:75:0x0198, B:79:0x01ad, B:78:0x01a7, B:65:0x0176, B:50:0x0147, B:31:0x0107, B:25:0x00fb, B:19:0x00ed, B:12:0x0033, B:6:0x0026, B:52:0x014b, B:58:0x0167, B:61:0x016c, B:55:0x015e, B:36:0x011c, B:42:0x0138, B:48:0x0144, B:45:0x013d, B:39:0x012f), top: B:92:0x0004, inners: #0, #3 }] */
    public final C4185f7 a(Cursor cursor) {
        Wk wk2;
        J8 j10;
        EnumC4162ea enumC4162ea;
        EnumC4162ea enumC4162ea2;
        EnumC4392n9 enumC4392n9;
        int i10;
        int columnIndex;
        byte[] blob;
        Integer numValueOf;
        EnumC4392n9 enumC4392n10;
        try {
            Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f55398i)));
            Integer numValueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f55400k)));
            Wk wk3 = Wk.FOREGROUND;
            if (numValueOf2 == null || numValueOf2.intValue() != 0) {
                wk3 = Wk.BACKGROUND;
                wk2 = (numValueOf2 != null && numValueOf2.intValue() == 1) ? wk3 : null;
            }
            Long lValueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f55391b)));
            EnumC4112cb enumC4112cbA = EnumC4112cb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f55396g)));
            Long lValueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f55392c)));
            Long lValueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f55397h)));
            Integer numValueOf3 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f55404o)));
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f55394e));
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f55395f));
            Long lValueOf5 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f55393d)));
            String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.f55399j));
            String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.f55401l));
            Long lValueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f55402m)));
            Integer numValueOf4 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f55403n)));
            Integer numValueOf5 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f55405p)));
            J8 j11 = J8.NONE;
            if (numValueOf5 != null && numValueOf5.intValue() == 0) {
                j10 = j11;
            } else {
                j11 = J8.AES_VALUE_ENCRYPTION;
                if (numValueOf5 != null && numValueOf5.intValue() == 2) {
                    j10 = j11;
                } else {
                    j10 = (numValueOf5 != null && numValueOf5.intValue() == 1) ? J8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER : null;
                }
            }
            String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.f55406q));
            try {
                try {
                    try {
                        try {
                            Integer numValueOf6 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f55407r)));
                            EnumC4162ea enumC4162ea3 = EnumC4162ea.FIRST_OCCURRENCE;
                            if (numValueOf6 == null || numValueOf6.intValue() != 1) {
                                enumC4162ea3 = EnumC4162ea.NON_FIRST_OCCURENCE;
                                if (numValueOf6 == null || numValueOf6.intValue() != 2) {
                                    enumC4162ea = EnumC4162ea.UNKNOWN;
                                    enumC4162ea2 = enumC4162ea;
                                    numValueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f55408s)));
                                    enumC4392n10 = EnumC4392n9.NATIVE;
                                    if (numValueOf != null && numValueOf.intValue() == 0) {
                                        enumC4392n9 = enumC4392n10;
                                    } else {
                                        enumC4392n10 = EnumC4392n9.JS;
                                        if (numValueOf != null && numValueOf.intValue() == 1) {
                                            enumC4392n9 = enumC4392n10;
                                        } else {
                                            enumC4392n9 = null;
                                        }
                                    }
                                    boolean z10 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f55409t)) == 1;
                                    Boolean boolValueOf = Boolean.valueOf(z10);
                                    i10 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f55410u));
                                    Integer numValueOf7 = Integer.valueOf(i10);
                                    columnIndex = cursor.getColumnIndex(this.f55411v);
                                    if (columnIndex < 0) {
                                        blob = null;
                                    } else {
                                        blob = cursor.getBlob(columnIndex);
                                    }
                                    return new C4185f7(lValueOf, wk2, lValueOf2, enumC4112cbA, lValueOf3, lValueOf4, new C4159e7(numValueOf3, string, string2, lValueOf5, null, string3, string4, lValueOf6, numValueOf4, null, null, j10, string5, enumC4162ea2, enumC4392n9, boolValueOf, numValueOf7, blob));
                                }
                                return null;
                            }
                            enumC4162ea2 = enumC4162ea3;
                        } catch (Throwable unused) {
                            enumC4162ea = EnumC4162ea.UNKNOWN;
                        }
                        if (numValueOf != null) {
                            enumC4392n9 = enumC4392n10;
                            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f55409t)) == 1) {
                            }
                            Boolean boolValueOf2 = Boolean.valueOf(z10);
                            i10 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f55410u));
                            Integer numValueOf8 = Integer.valueOf(i10);
                            columnIndex = cursor.getColumnIndex(this.f55411v);
                            if (columnIndex < 0) {
                                blob = null;
                            } else {
                                blob = cursor.getBlob(columnIndex);
                            }
                            return new C4185f7(lValueOf, wk2, lValueOf2, enumC4112cbA, lValueOf3, lValueOf4, new C4159e7(numValueOf3, string, string2, lValueOf5, null, string3, string4, lValueOf6, numValueOf4, null, null, j10, string5, enumC4162ea2, enumC4392n9, boolValueOf2, numValueOf8, blob));
                        }
                        if (numValueOf != null) {
                            enumC4392n9 = enumC4392n10;
                            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f55409t)) == 1) {
                            }
                            Boolean boolValueOf3 = Boolean.valueOf(z10);
                            i10 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f55410u));
                            Integer numValueOf9 = Integer.valueOf(i10);
                            columnIndex = cursor.getColumnIndex(this.f55411v);
                            if (columnIndex < 0) {
                                blob = null;
                            } else {
                                blob = cursor.getBlob(columnIndex);
                            }
                            return new C4185f7(lValueOf, wk2, lValueOf2, enumC4112cbA, lValueOf3, lValueOf4, new C4159e7(numValueOf3, string, string2, lValueOf5, null, string3, string4, lValueOf6, numValueOf4, null, null, j10, string5, enumC4162ea2, enumC4392n9, boolValueOf3, numValueOf9, blob));
                        }
                        if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f55409t)) == 1) {
                        }
                    } catch (Throwable unused2) {
                    }
                    i10 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f55410u));
                } catch (Throwable unused3) {
                    i10 = -1;
                }
                numValueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f55408s)));
                enumC4392n10 = EnumC4392n9.NATIVE;
                enumC4392n10 = EnumC4392n9.JS;
                enumC4392n9 = null;
            } catch (Throwable unused4) {
                enumC4392n9 = EnumC4392n9.NATIVE;
            }
            Boolean boolValueOf4 = Boolean.valueOf(z10);
            Integer numValueOf10 = Integer.valueOf(i10);
            columnIndex = cursor.getColumnIndex(this.f55411v);
            if (columnIndex < 0) {
                blob = null;
            } else {
                blob = cursor.getBlob(columnIndex);
            }
            return new C4185f7(lValueOf, wk2, lValueOf2, enumC4112cbA, lValueOf3, lValueOf4, new C4159e7(numValueOf3, string, string2, lValueOf5, null, string3, string4, lValueOf6, numValueOf4, null, null, j10, string5, enumC4162ea2, enumC4392n9, boolValueOf4, numValueOf10, blob));
        } catch (Throwable unused5) {
            return null;
        }
    }
}
