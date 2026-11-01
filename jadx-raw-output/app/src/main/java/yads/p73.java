package yads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class p73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f81278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f81279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f81280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f81281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f81283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f81284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p51 f81285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f81286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p51 f81287n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f81288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f81289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f81290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p51 f81291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p51 f81292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f81293t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f81294u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f81295v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f81296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f81297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashMap f81298y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet f81299z;

    public p73() {
        this.f81274a = Integer.MAX_VALUE;
        this.f81275b = Integer.MAX_VALUE;
        this.f81276c = Integer.MAX_VALUE;
        this.f81277d = Integer.MAX_VALUE;
        this.f81282i = Integer.MAX_VALUE;
        this.f81283j = Integer.MAX_VALUE;
        this.f81284k = true;
        this.f81285l = p51.g();
        this.f81286m = 0;
        this.f81287n = p51.g();
        this.f81288o = 0;
        this.f81289p = Integer.MAX_VALUE;
        this.f81290q = Integer.MAX_VALUE;
        this.f81291r = p51.g();
        this.f81292s = p51.g();
        this.f81293t = 0;
        this.f81294u = 0;
        this.f81295v = false;
        this.f81296w = false;
        this.f81297x = false;
        this.f81298y = new HashMap();
        this.f81299z = new HashSet();
    }

    public static sm2 a(String[] strArr) {
        m51 m51Var = p51.f81258c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int length = strArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            str.getClass();
            String strE = ib3.e(str);
            strE.getClass();
            int i12 = i11 + 1;
            if (objArrCopyOf.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i12));
            }
            objArrCopyOf[i11] = strE;
            i10++;
            i11 = i12;
        }
        return p51.b(i11, objArrCopyOf);
    }

    public void b(Context context) {
        Point pointC = ib3.c(context);
        a(pointC.x, pointC.y);
    }

    public p73 a(int i10, int i11) {
        this.f81282i = i10;
        this.f81283j = i11;
        this.f81284k = true;
        return this;
    }

    public void a(Context context) {
        CaptioningManager captioningManager;
        int i10 = ib3.f78556a;
        if (i10 >= 19) {
            if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f81293t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f81292s = p51.a(ib3.a(locale));
                }
            }
        }
    }

    public p73(Context context) {
        this();
        a(context);
        b(context);
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v91, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int[], java.io.Serializable] */
    public p73(Bundle bundle) {
        sm2 sm2VarA;
        String strA = q73.a(6);
        q73 q73Var = q73.B;
        this.f81274a = bundle.getInt(strA, q73Var.f81742b);
        this.f81275b = bundle.getInt(q73.a(7), q73Var.f81743c);
        this.f81276c = bundle.getInt(q73.a(8), q73Var.f81744d);
        this.f81277d = bundle.getInt(q73.a(9), q73Var.f81745e);
        this.f81278e = bundle.getInt(q73.a(10), q73Var.f81746f);
        this.f81279f = bundle.getInt(q73.a(11), q73Var.f81747g);
        this.f81280g = bundle.getInt(q73.a(12), q73Var.f81748h);
        this.f81281h = bundle.getInt(q73.a(13), q73Var.f81749i);
        this.f81282i = bundle.getInt(q73.a(14), q73Var.f81750j);
        this.f81283j = bundle.getInt(q73.a(15), q73Var.f81751k);
        this.f81284k = bundle.getBoolean(q73.a(16), q73Var.f81752l);
        this.f81285l = p51.b((String[]) dv1.a(bundle.getStringArray(q73.a(17)), new String[0]));
        this.f81286m = bundle.getInt(q73.a(25), q73Var.f81754n);
        this.f81287n = a((String[]) dv1.a(bundle.getStringArray(q73.a(1)), new String[0]));
        this.f81288o = bundle.getInt(q73.a(2), q73Var.f81756p);
        this.f81289p = bundle.getInt(q73.a(18), q73Var.f81757q);
        this.f81290q = bundle.getInt(q73.a(19), q73Var.f81758r);
        this.f81291r = p51.b((String[]) dv1.a(bundle.getStringArray(q73.a(20)), new String[0]));
        this.f81292s = a((String[]) dv1.a(bundle.getStringArray(q73.a(3)), new String[0]));
        this.f81293t = bundle.getInt(q73.a(4), q73Var.f81761u);
        this.f81294u = bundle.getInt(q73.a(26), q73Var.f81762v);
        this.f81295v = bundle.getBoolean(q73.a(5), q73Var.f81763w);
        this.f81296w = bundle.getBoolean(q73.a(21), q73Var.f81764x);
        this.f81297x = bundle.getBoolean(q73.a(22), q73Var.f81765y);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(q73.a(23));
        if (parcelableArrayList == null) {
            sm2VarA = p51.g();
        } else {
            sm2VarA = yq.a(o73.f80957d, parcelableArrayList);
        }
        this.f81298y = new HashMap();
        for (int i10 = 0; i10 < sm2VarA.size(); i10++) {
            o73 o73Var = (o73) sm2VarA.get(i10);
            this.f81298y.put(o73Var.f80958b, o73Var);
        }
        int[] iArr = (int[]) dv1.a(bundle.getIntArray(q73.a(24)), new int[0]);
        this.f81299z = new HashSet();
        for (int i11 : iArr) {
            this.f81299z.add(Integer.valueOf(i11));
        }
    }
}
