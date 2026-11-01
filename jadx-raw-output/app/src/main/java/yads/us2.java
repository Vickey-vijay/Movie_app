package yads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class us2 extends n53 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f83591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f83592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f83593d;

    public final boolean a(long j10, jb2 jb2Var) {
        if (jb2Var.m() != 2 || !"onMetaData".equals(b(jb2Var)) || jb2Var.f78968c - jb2Var.f78967b == 0 || jb2Var.m() != 8) {
            return false;
        }
        HashMap mapA = a(jb2Var);
        Object obj = mapA.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f83591b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapA.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f83592c = new long[size];
                this.f83593d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f83592c = new long[0];
                        this.f83593d = new long[0];
                        break;
                    }
                    this.f83592c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f83593d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public us2() {
        super(new al0());
        this.f83591b = -9223372036854775807L;
        this.f83592c = new long[0];
        this.f83593d = new long[0];
    }

    public static String b(jb2 jb2Var) {
        int iR = jb2Var.r();
        int i10 = jb2Var.f78967b;
        jb2Var.e(i10 + iR);
        return new String(jb2Var.f78966a, i10, iR);
    }

    public static Serializable a(int i10, jb2 jb2Var) {
        if (i10 == 8) {
            return a(jb2Var);
        }
        if (i10 == 10) {
            int iP = jb2Var.p();
            ArrayList arrayList = new ArrayList(iP);
            for (int i11 = 0; i11 < iP; i11++) {
                Serializable serializableA = a(jb2Var.m(), jb2Var);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        if (i10 == 11) {
            Date date = new Date((long) Double.longBitsToDouble(jb2Var.i()));
            jb2Var.e(jb2Var.f78967b + 2);
            return date;
        }
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(jb2Var.i()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(jb2Var.m() == 1);
        }
        if (i10 == 2) {
            return b(jb2Var);
        }
        if (i10 != 3) {
            return null;
        }
        HashMap map = new HashMap();
        while (true) {
            String strB = b(jb2Var);
            int iM = jb2Var.m();
            if (iM == 9) {
                return map;
            }
            Serializable serializableA2 = a(iM, jb2Var);
            if (serializableA2 != null) {
                map.put(strB, serializableA2);
            }
        }
    }

    public static HashMap a(jb2 jb2Var) {
        int iP = jb2Var.p();
        HashMap map = new HashMap(iP);
        for (int i10 = 0; i10 < iP; i10++) {
            String strB = b(jb2Var);
            Serializable serializableA = a(jb2Var.m(), jb2Var);
            if (serializableA != null) {
                map.put(strB, serializableA);
            }
        }
        return map;
    }
}
