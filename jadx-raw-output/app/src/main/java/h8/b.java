package h8;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.thread.PictureThreadUtils;
import f8.s;
import f8.t;
import f8.u;
import f8.v;
import java.util.ArrayList;
import java.util.List;
import o8.j;
import o8.l;
import o8.o;

/* JADX INFO: compiled from: LocalMediaLoader.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends h8.a {

    /* JADX INFO: compiled from: LocalMediaLoader.java */
    public class a extends PictureThreadUtils.d<List<LocalMediaFolder>> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ t f53802i;

        public a(t tVar) {
            this.f53802i = tVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public List<LocalMediaFolder> g() {
            String string;
            Context context;
            int i10;
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = b.this.getContext().getContentResolver().query(h8.a.f53797d, h8.a.f53798e, b.this.k(), b.this.l(), b.this.q());
            try {
                if (cursorQuery != null) {
                    try {
                        LocalMediaFolder localMediaFolder = new LocalMediaFolder();
                        ArrayList<LocalMedia> arrayList2 = new ArrayList<>();
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.moveToFirst();
                            do {
                                LocalMedia localMediaR = b.this.r(cursorQuery, false);
                                if (localMediaR != null) {
                                    LocalMediaFolder localMediaFolderJ = b.this.j(localMediaR.w(), localMediaR.s(), localMediaR.v(), arrayList);
                                    localMediaFolderJ.l(localMediaR.g());
                                    localMediaFolderJ.e().add(localMediaR);
                                    localMediaFolderJ.r(localMediaFolderJ.i() + 1);
                                    localMediaFolderJ.l(localMediaR.g());
                                    arrayList2.add(localMediaR);
                                    localMediaFolder.r(localMediaFolder.i() + 1);
                                }
                            } while (cursorQuery.moveToNext());
                            LocalMediaFolder localMediaFolderB = e.b(b.this.getContext(), b.this.a().Z);
                            if (localMediaFolderB != null) {
                                arrayList.add(localMediaFolderB);
                                localMediaFolder.r(localMediaFolder.i() + localMediaFolderB.i());
                                localMediaFolder.n(localMediaFolderB.e());
                                arrayList2.addAll(0, localMediaFolderB.e());
                                if (60 > localMediaFolderB.i()) {
                                    if (arrayList2.size() > 60) {
                                        o.f(arrayList2.subList(0, 60));
                                    } else {
                                        o.f(arrayList2);
                                    }
                                }
                            }
                            if (arrayList2.size() > 0) {
                                o.e(arrayList);
                                arrayList.add(0, localMediaFolder);
                                localMediaFolder.o(arrayList2.get(0).w());
                                localMediaFolder.p(arrayList2.get(0).s());
                                if (TextUtils.isEmpty(b.this.a().f32205d0)) {
                                    if (b.this.a().f32200b == a8.e.b()) {
                                        context = b.this.getContext();
                                        i10 = R$string.ps_all_audio;
                                    } else {
                                        context = b.this.getContext();
                                        i10 = R$string.ps_camera_roll;
                                    }
                                    string = context.getString(i10);
                                } else {
                                    string = b.this.a().f32205d0;
                                }
                                localMediaFolder.q(string);
                                localMediaFolder.l(-1L);
                                localMediaFolder.n(arrayList2);
                            }
                        }
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        if (!cursorQuery.isClosed()) {
                        }
                        return arrayList;
                    }
                } else if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (Throwable th2) {
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                throw th2;
            }
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(List<LocalMediaFolder> list) {
            PictureThreadUtils.d(this);
            t tVar = this.f53802i;
            if (tVar != null) {
                tVar.a(list);
            }
        }
    }

    /* JADX INFO: renamed from: h8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LocalMediaLoader.java */
    public class C0480b extends PictureThreadUtils.d<LocalMediaFolder> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ s f53804i;

        public C0480b(s sVar) {
            this.f53804i = sVar;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public LocalMediaFolder g() {
            return e.b(b.this.getContext(), b.this.a().Z);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void m(LocalMediaFolder localMediaFolder) {
            PictureThreadUtils.d(this);
            s sVar = this.f53804i;
            if (sVar != null) {
                sVar.a(localMediaFolder);
            }
        }
    }

    @Override // h8.a
    public void h(long j10, int i10, int i11, u<LocalMedia> uVar) {
    }

    public static String m(String str, String str2, String str3) {
        return "(media_type=?" + str3 + " OR media_type=? AND " + str + ") AND " + str2;
    }

    public static String n(String str, String str2) {
        return "media_type=?" + str2 + " AND " + str;
    }

    public static String o(String str, String str2) {
        return "media_type=?" + str2 + " AND " + str;
    }

    public static String p(String str, String str2) {
        return "media_type=?" + str2 + " AND " + str;
    }

    @Override // h8.a
    public void f(t<LocalMediaFolder> tVar) {
        PictureThreadUtils.h(new a(tVar));
    }

    @Override // h8.a
    public void g(s<LocalMediaFolder> sVar) {
        PictureThreadUtils.h(new C0480b(sVar));
    }

    public LocalMedia r(Cursor cursor, boolean z10) {
        long j10;
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
        long j11 = cursor.getLong(columnIndexOrThrow);
        long j12 = cursor.getLong(columnIndexOrThrow11);
        String string = cursor.getString(columnIndexOrThrow3);
        String string2 = cursor.getString(columnIndexOrThrow2);
        String strK = l.e() ? j.k(j11, string) : string2;
        if (TextUtils.isEmpty(string)) {
            string = a8.d.r();
        }
        if (string.endsWith("image/*")) {
            string = j.i(string2);
            j10 = j12;
            if (!a().F && a8.d.f(string)) {
                return null;
            }
        } else {
            j10 = j12;
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
        int i10 = cursor.getInt(columnIndexOrThrow4);
        int i11 = cursor.getInt(columnIndexOrThrow5);
        int i12 = cursor.getInt(columnIndexOrThrow12);
        if (i12 == 90 || i12 == 270) {
            i10 = cursor.getInt(columnIndexOrThrow5);
            i11 = cursor.getInt(columnIndexOrThrow4);
        }
        long j13 = cursor.getLong(columnIndexOrThrow6);
        long j14 = cursor.getLong(columnIndexOrThrow7);
        String string3 = cursor.getString(columnIndexOrThrow8);
        String string4 = cursor.getString(columnIndexOrThrow9);
        int i13 = i10;
        long j15 = cursor.getLong(columnIndexOrThrow10);
        if (TextUtils.isEmpty(string4)) {
            string4 = a8.d.b(string2);
        }
        if (a().E0 && j14 > 0 && j14 < 1024) {
            return null;
        }
        if (a8.d.i(string) || a8.d.d(string)) {
            if (a().f32234s > 0 && j13 < a().f32234s) {
                return null;
            }
            if (a().f32232r > 0 && j13 > a().f32232r) {
                return null;
            }
            if (a().E0 && j13 <= 0) {
                return null;
            }
        } else {
            j14 = j14;
        }
        LocalMedia localMediaC = LocalMedia.c();
        localMediaC.i0(j11);
        localMediaC.P(j15);
        localMediaC.p0(strK);
        localMediaC.r0(string2);
        localMediaC.f0(string4);
        localMediaC.o0(string3);
        localMediaC.d0(j13);
        localMediaC.R(a().f32200b);
        localMediaC.k0(string);
        localMediaC.w0(i13);
        localMediaC.h0(i11);
        localMediaC.t0(j14);
        localMediaC.c0(j10);
        v vVar = PictureSelectionConfig.f32189h1;
        if (vVar == null || !vVar.a(localMediaC)) {
            return localMediaC;
        }
        return null;
    }

    public final LocalMediaFolder j(String str, String str2, String str3, List<LocalMediaFolder> list) {
        for (LocalMediaFolder localMediaFolder : list) {
            String strH = localMediaFolder.h();
            if (!TextUtils.isEmpty(strH) && TextUtils.equals(strH, str3)) {
                return localMediaFolder;
            }
        }
        LocalMediaFolder localMediaFolder2 = new LocalMediaFolder();
        localMediaFolder2.q(str3);
        localMediaFolder2.o(str);
        localMediaFolder2.p(str2);
        list.add(localMediaFolder2);
        return localMediaFolder2;
    }

    public String k() {
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
                    return n(strB, strD);
                }
                return p(strB, strD);
            }
            return o(strC, strD);
        }
        return m(strB, strC, strD);
    }

    public String[] l() {
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

    public String q() {
        if (TextUtils.isEmpty(a().f32203c0)) {
            return "date_modified DESC";
        }
        return a().f32203c0;
    }
}
