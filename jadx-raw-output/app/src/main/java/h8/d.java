package h8;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.thread.PictureThreadUtils;
import f8.s;
import f8.t;
import f8.u;
import f8.v;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import o8.j;
import o8.k;
import o8.l;
import o8.o;

/* JADX INFO: compiled from: LocalMediaPageLoader.java */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends h8.a {

    /* JADX INFO: compiled from: LocalMediaPageLoader.java */
    public class a extends PictureThreadUtils.d<d8.a> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f53806i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f53807j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f53808k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ u f53809l;

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public d8.a g() {
            String strG;
            ArrayList<LocalMedia> arrayListA;
            Cursor cursorQuery = null;
            try {
                try {
                    boolean z10 = true;
                    if (l.f()) {
                        String strT = d.this.t(this.f53806i);
                        String[] strArrU = d.this.u(this.f53806i);
                        int i10 = this.f53807j;
                        cursorQuery = d.this.getContext().getContentResolver().query(h8.a.f53797d, h8.a.f53798e, j.a(strT, strArrU, i10, (this.f53808k - 1) * i10, d.this.G()), null);
                    } else {
                        if (this.f53808k == -1) {
                            strG = d.this.G();
                        } else {
                            strG = d.this.G() + " limit " + this.f53807j + " offset " + ((this.f53808k - 1) * this.f53807j);
                        }
                        cursorQuery = d.this.getContext().getContentResolver().query(h8.a.f53797d, h8.a.f53798e, d.this.t(this.f53806i), d.this.u(this.f53806i), strG);
                    }
                    if (cursorQuery == null) {
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        return new d8.a();
                    }
                    ArrayList arrayList = new ArrayList();
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.moveToFirst();
                        do {
                            LocalMedia localMediaI = d.this.I(cursorQuery, false);
                            if (localMediaI != null) {
                                arrayList.add(localMediaI);
                            }
                        } while (cursorQuery.moveToNext());
                    }
                    if (this.f53806i == -1 && this.f53808k == 1 && (arrayListA = e.a(d.this.getContext(), d.this.a().Z)) != null) {
                        arrayList.addAll(arrayListA);
                        o.f(arrayList);
                    }
                    if (cursorQuery.getCount() <= 0) {
                        z10 = false;
                    }
                    d8.a aVar = new d8.a(z10, arrayList);
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    return aVar;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    Log.i(h8.a.f53796c, "loadMedia Page Data Error: " + e10.getMessage());
                    d8.a aVar2 = new d8.a();
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    return aVar2;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null && !cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                throw th2;
            }
        }

        public a(long j10, int i10, int i11, u uVar) {
            this.f53806i = j10;
            this.f53807j = i10;
            this.f53808k = i11;
            this.f53809l = uVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(d8.a aVar) {
            PictureThreadUtils.d(this);
            u uVar = this.f53809l;
            if (uVar != null) {
                ArrayList<LocalMedia> arrayList = aVar.f51899b;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                uVar.a(arrayList, aVar.f51898a);
            }
        }
    }

    /* JADX INFO: compiled from: LocalMediaPageLoader.java */
    public class b extends PictureThreadUtils.d<LocalMediaFolder> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ s f53811i;

        public b(s sVar) {
            this.f53811i = sVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public LocalMediaFolder g() {
            return e.b(d.this.getContext(), d.this.a().Z);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(LocalMediaFolder localMediaFolder) {
            PictureThreadUtils.d(this);
            s sVar = this.f53811i;
            if (sVar != null) {
                sVar.a(localMediaFolder);
            }
        }
    }

    /* JADX INFO: compiled from: LocalMediaPageLoader.java */
    public class c extends PictureThreadUtils.d<List<LocalMediaFolder>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t f53813i;

        public c(t tVar) {
            this.f53813i = tVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<LocalMediaFolder> g() {
            int i10;
            String string;
            Context context;
            int i11;
            Cursor cursorQuery = d.this.getContext().getContentResolver().query(h8.a.f53797d, d.this.H() ? h8.a.f53798e : h8.a.f53799f, d.this.z(), d.this.A(), d.this.G());
            if (cursorQuery != null) {
                try {
                    try {
                        int count = cursorQuery.getCount();
                        ArrayList<LocalMediaFolder> arrayList = new ArrayList();
                        if (count > 0) {
                            String str = "bucket_id";
                            String str2 = "mime_type";
                            if (d.this.H()) {
                                HashMap map = new HashMap();
                                HashSet hashSet = new HashSet();
                                while (cursorQuery.moveToNext()) {
                                    if (d.this.a().F0) {
                                        LocalMedia localMediaI = d.this.I(cursorQuery, true);
                                        if (localMediaI != null) {
                                            localMediaI.O();
                                        }
                                    }
                                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(str));
                                    Long l10 = (Long) map.get(Long.valueOf(j10));
                                    map.put(Long.valueOf(j10), l10 == null ? 1L : Long.valueOf(l10.longValue() + 1));
                                    if (!hashSet.contains(Long.valueOf(j10))) {
                                        LocalMediaFolder localMediaFolder = new LocalMediaFolder();
                                        localMediaFolder.l(j10);
                                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("bucket_display_name"));
                                        String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(str2));
                                        if (map.containsKey(Long.valueOf(j10))) {
                                            long jLongValue = ((Long) map.get(Long.valueOf(j10))).longValue();
                                            String str3 = str;
                                            long j11 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"));
                                            localMediaFolder.q(string2);
                                            localMediaFolder.r(o8.s.c(Long.valueOf(jLongValue)));
                                            localMediaFolder.o(j.k(j11, string3));
                                            localMediaFolder.p(string3);
                                            arrayList.add(localMediaFolder);
                                            hashSet.add(Long.valueOf(j10));
                                            str = str3;
                                            str2 = str2;
                                        }
                                    }
                                }
                                i10 = 0;
                                for (LocalMediaFolder localMediaFolder2 : arrayList) {
                                    int iC = o8.s.c(map.get(Long.valueOf(localMediaFolder2.c())));
                                    localMediaFolder2.r(iC);
                                    i10 += iC;
                                }
                            } else {
                                String str4 = "bucket_id";
                                String str5 = "mime_type";
                                cursorQuery.moveToFirst();
                                int i12 = 0;
                                while (true) {
                                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                    String string5 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("bucket_display_name"));
                                    String str6 = str5;
                                    String string6 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(str6));
                                    String str7 = str4;
                                    long j12 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow(str7));
                                    int i13 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("count"));
                                    LocalMediaFolder localMediaFolder3 = new LocalMediaFolder();
                                    localMediaFolder3.l(j12);
                                    localMediaFolder3.o(string4);
                                    localMediaFolder3.q(string5);
                                    localMediaFolder3.p(string6);
                                    localMediaFolder3.r(i13);
                                    arrayList.add(localMediaFolder3);
                                    i12 += i13;
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str5 = str6;
                                    str4 = str7;
                                }
                                i10 = i12;
                            }
                            LocalMediaFolder localMediaFolder4 = new LocalMediaFolder();
                            LocalMediaFolder localMediaFolderB = e.b(d.this.getContext(), d.this.a().Z);
                            if (localMediaFolderB != null) {
                                arrayList.add(localMediaFolderB);
                                long jLastModified = new File(localMediaFolderB.f()).lastModified();
                                i10 += localMediaFolderB.i();
                                localMediaFolder4.n(new ArrayList<>());
                                if (cursorQuery.moveToFirst()) {
                                    localMediaFolder4.o(l.e() ? d.r(cursorQuery) : d.s(cursorQuery));
                                    localMediaFolder4.p(d.q(cursorQuery));
                                    if (jLastModified > (a8.d.c(localMediaFolder4.f()) ? new File(k.h(d.this.getContext(), Uri.parse(localMediaFolder4.f()))).lastModified() : new File(localMediaFolder4.f()).lastModified())) {
                                        localMediaFolder4.o(localMediaFolderB.f());
                                        localMediaFolder4.p(localMediaFolderB.g());
                                    }
                                }
                            } else if (cursorQuery.moveToFirst()) {
                                localMediaFolder4.o(l.e() ? d.r(cursorQuery) : d.s(cursorQuery));
                                localMediaFolder4.p(d.q(cursorQuery));
                            }
                            if (i10 == 0) {
                                if (!cursorQuery.isClosed()) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                            o.e(arrayList);
                            localMediaFolder4.r(i10);
                            localMediaFolder4.l(-1L);
                            if (TextUtils.isEmpty(d.this.a().f32205d0)) {
                                if (d.this.a().f32200b == a8.e.b()) {
                                    context = d.this.getContext();
                                    i11 = R$string.ps_all_audio;
                                } else {
                                    context = d.this.getContext();
                                    i11 = R$string.ps_camera_roll;
                                }
                                string = context.getString(i11);
                            } else {
                                string = d.this.a().f32205d0;
                            }
                            localMediaFolder4.q(string);
                            arrayList.add(0, localMediaFolder4);
                            if (d.this.a().f32225n0 && d.this.a().f32200b == a8.e.a()) {
                                d.this.J(arrayList);
                            }
                            if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                            return arrayList;
                        }
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Log.i(h8.a.f53796c, "loadAllMedia Data Error: " + e10.getMessage());
                        if (!cursorQuery.isClosed()) {
                        }
                        return new ArrayList();
                    }
                } catch (Throwable th2) {
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            } else if (cursorQuery != null) {
                cursorQuery.close();
            }
            return new ArrayList();
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(List<LocalMediaFolder> list) {
            PictureThreadUtils.d(this);
            LocalMedia.d();
            t tVar = this.f53813i;
            if (tVar != null) {
                tVar.a(list);
            }
        }
    }

    public final void J(List<LocalMediaFolder> list) throws Throwable {
        for (int i10 = 0; i10 < list.size(); i10++) {
            LocalMediaFolder localMediaFolder = list.get(i10);
            if (localMediaFolder != null) {
                String strP = p(localMediaFolder.c());
                if (!TextUtils.isEmpty(strP)) {
                    localMediaFolder.o(strP);
                }
            }
        }
    }

    public String p(long j10) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursor2 = null;
        try {
            if (l.f()) {
                cursorQuery = getContext().getContentResolver().query(h8.a.f53797d, new String[]{"_id", "mime_type", "_data"}, j.a(t(j10), u(j10), 1, 0, G()), null);
            } else {
                cursorQuery = getContext().getContentResolver().query(h8.a.f53797d, new String[]{"_id", "mime_type", "_data"}, t(j10), u(j10), G() + " limit 1 offset 0");
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        if (!cursorQuery.moveToFirst()) {
                            if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                        String strK = l.e() ? j.k(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"))) : cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        if (!cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        return strK;
                    }
                } catch (Exception e10) {
                    cursor = cursorQuery;
                    e = e10;
                    try {
                        e.printStackTrace();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                        if (cursor2 != null && !cursor2.isClosed()) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    cursor2 = cursorQuery;
                    th = th3;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
        } catch (Exception e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
        return null;
    }

    public static String[] E(int i10, long j10) {
        return j10 == -1 ? new String[]{String.valueOf(i10)} : new String[]{String.valueOf(i10), o8.s.g(Long.valueOf(j10))};
    }

    public static String q(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
    }

    public static String r(Cursor cursor) {
        return j.k(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), cursor.getString(cursor.getColumnIndexOrThrow("mime_type")));
    }

    public static String s(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("_data"));
    }

    public static String v(long j10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(" OR ");
        sb2.append("media_type");
        sb2.append("=? AND ");
        sb2.append(str2);
        sb2.append(") AND ");
        if (j10 == -1) {
            sb2.append(str3);
            return sb2.toString();
        }
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str3);
        return sb2.toString();
    }

    public static String w(long j10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(" AND ");
        sb2.append(str2);
        sb2.append(") AND ");
        if (j10 == -1) {
            sb2.append(str3);
            return sb2.toString();
        }
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str3);
        return sb2.toString();
    }

    public static String x(long j10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        if (j10 == -1) {
            sb2.append(str);
            sb2.append(") AND ");
            sb2.append(str2);
            return sb2.toString();
        }
        sb2.append(str);
        sb2.append(") AND ");
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str2);
        return sb2.toString();
    }

    public static String y(long j10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(" AND ");
        sb2.append(str2);
        sb2.append(") AND ");
        if (j10 == -1) {
            sb2.append(str3);
            return sb2.toString();
        }
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str3);
        return sb2.toString();
    }

    public final String B(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str3);
        sb2.append(" OR ");
        sb2.append("media_type");
        sb2.append("=? AND ");
        sb2.append(str);
        sb2.append(") AND ");
        sb2.append(str2);
        if (H()) {
            return sb2.toString();
        }
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    public final String C(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (H()) {
            sb2.append("media_type");
            sb2.append("=?");
            sb2.append(str2);
            sb2.append(" AND ");
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str2);
        sb2.append(") AND ");
        sb2.append(str);
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    public final String D(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (H()) {
            sb2.append("media_type");
            sb2.append("=?");
            sb2.append(str2);
            sb2.append(" AND ");
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str2);
        sb2.append(") AND ");
        sb2.append(str);
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    public final String F(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (H()) {
            sb2.append("media_type");
            sb2.append("=?");
            sb2.append(str2);
            sb2.append(" AND ");
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str2);
        sb2.append(") AND ");
        sb2.append(str);
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    public LocalMedia I(Cursor cursor, boolean z10) {
        String str;
        int i10;
        String[] strArr = h8.a.f53798e;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(strArr[0]);
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(strArr[1]);
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(strArr[2]);
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow(strArr[3]);
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow(strArr[4]);
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow(strArr[5]);
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow(strArr[6]);
        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow(strArr[7]);
        int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow(strArr[8]);
        int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow(strArr[9]);
        int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow(strArr[10]);
        int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow(strArr[11]);
        long j10 = cursor.getLong(columnIndexOrThrow);
        String string = cursor.getString(columnIndexOrThrow3);
        String string2 = cursor.getString(columnIndexOrThrow2);
        String strK = l.e() ? j.k(j10, string) : string2;
        if (TextUtils.isEmpty(string)) {
            string = a8.d.r();
        }
        if (a().f32211g0) {
            if (a8.d.h(string)) {
                if (!TextUtils.isEmpty(string2) && !k.n(string2)) {
                    return null;
                }
            } else if (!k.l(string2)) {
                return null;
            }
        }
        if (string.endsWith("image/*")) {
            string = j.i(string2);
            str = strK;
            if (!a().F && a8.d.f(string)) {
                return null;
            }
        } else {
            str = strK;
        }
        if (string.endsWith("image/*")) {
            return null;
        }
        if (!a().G && string.startsWith(a8.d.s())) {
            return null;
        }
        if (!a().H && a8.d.e(string)) {
            return null;
        }
        int i11 = cursor.getInt(columnIndexOrThrow4);
        int i12 = cursor.getInt(columnIndexOrThrow5);
        int i13 = cursor.getInt(columnIndexOrThrow12);
        if (i13 == 90 || i13 == 270) {
            i10 = cursor.getInt(columnIndexOrThrow5);
            i12 = cursor.getInt(columnIndexOrThrow4);
        } else {
            i10 = i11;
        }
        long j11 = cursor.getLong(columnIndexOrThrow6);
        long j12 = cursor.getLong(columnIndexOrThrow7);
        String string3 = cursor.getString(columnIndexOrThrow8);
        String string4 = cursor.getString(columnIndexOrThrow9);
        long j13 = cursor.getLong(columnIndexOrThrow10);
        long j14 = cursor.getLong(columnIndexOrThrow11);
        if (TextUtils.isEmpty(string4)) {
            string4 = a8.d.b(string2);
        }
        if (a().E0 && j12 > 0 && j12 < 1024) {
            return null;
        }
        if (a8.d.i(string) || a8.d.d(string)) {
            if (a().f32234s > 0 && j11 < a().f32234s) {
                return null;
            }
            if (a().f32232r > 0 && j11 > a().f32232r) {
                return null;
            }
            if (a().E0 && j11 <= 0) {
                return null;
            }
        } else {
            j14 = j14;
        }
        LocalMedia localMediaN = z10 ? LocalMedia.N() : LocalMedia.c();
        localMediaN.i0(j10);
        localMediaN.P(j13);
        localMediaN.p0(str);
        localMediaN.r0(string2);
        localMediaN.f0(string4);
        localMediaN.o0(string3);
        localMediaN.d0(j11);
        localMediaN.R(a().f32200b);
        localMediaN.k0(string);
        localMediaN.w0(i10);
        localMediaN.h0(i12);
        localMediaN.t0(j12);
        localMediaN.c0(j14);
        v vVar = PictureSelectionConfig.f32189h1;
        if (vVar == null || !vVar.a(localMediaN)) {
            return localMediaN;
        }
        return null;
    }

    @Override // h8.a
    public void f(t<LocalMediaFolder> tVar) {
        PictureThreadUtils.h(new c(tVar));
    }

    @Override // h8.a
    public void g(s<LocalMediaFolder> sVar) {
        PictureThreadUtils.h(new b(sVar));
    }

    @Override // h8.a
    public void h(long j10, int i10, int i11, u<LocalMedia> uVar) {
        PictureThreadUtils.h(new a(j10, i11, i10, uVar));
    }

    public String[] A() {
        int i10 = a().f32200b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return new String[]{String.valueOf(2)};
                }
                return new String[]{String.valueOf(3)};
            }
            return new String[]{String.valueOf(1)};
        }
        return new String[]{String.valueOf(1), String.valueOf(3)};
    }

    public String G() {
        if (TextUtils.isEmpty(a().f32203c0)) {
            return "date_modified DESC";
        }
        return a().f32203c0;
    }

    public final boolean H() {
        if (l.e()) {
            return true;
        }
        return a().F0;
    }

    public final String t(long j10) {
        String strB = b();
        String strC = c();
        String strD = d();
        int i10 = a().f32200b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return w(j10, strD, strB, strC);
                }
                return y(j10, strD, strB, strC);
            }
            return x(j10, strD, strC);
        }
        return v(j10, strD, strB, strC);
    }

    public final String[] u(long j10) {
        int i10 = a().f32200b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return E(2, j10);
                }
                return E(3, j10);
            }
            return E(1, j10);
        }
        if (j10 == -1) {
            return new String[]{String.valueOf(1), String.valueOf(3)};
        }
        return new String[]{String.valueOf(1), String.valueOf(3), o8.s.g(Long.valueOf(j10))};
    }

    public String z() {
        String strB = b();
        String strC = c();
        String strD = d();
        int i10 = a().f32200b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return C(strB, strD);
                }
                return F(strB, strD);
            }
            return D(strC, strD);
        }
        return B(strB, strC, strD);
    }
}
