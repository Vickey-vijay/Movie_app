package yads;

import java.util.ArrayList;
import java.util.Comparator;
import yads.a13;
import yads.b13;

/* JADX INFO: loaded from: classes8.dex */
public final class b13 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator f75687h = new Comparator() { // from class: cp.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return b13.a((a13) obj, (a13) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator f75688i = new Comparator() { // from class: cp.h
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((a13) obj).f75368c, ((a13) obj2).f75368c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75689a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f75694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75695g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a13[] f75691c = new a13[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f75690b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75692d = -1;

    public static /* synthetic */ int a(a13 a13Var, a13 a13Var2) {
        return a13Var.f75366a - a13Var2.f75366a;
    }

    public b13(int i10) {
        this.f75689a = i10;
    }
}
