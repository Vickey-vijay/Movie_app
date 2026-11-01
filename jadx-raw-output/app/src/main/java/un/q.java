package un;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: UDAVersion.java */
/* JADX INFO: loaded from: classes11.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72991b;

    public q() {
        this.f72990a = 1;
        this.f72991b = 0;
    }

    public int a() {
        return this.f72990a;
    }

    public int b() {
        return this.f72991b;
    }

    public List<mn.k> c() {
        ArrayList arrayList = new ArrayList();
        if (a() != 1) {
            arrayList.add(new mn.k(getClass(), "major", "UDA major spec version must be 1"));
        }
        if (a() < 0) {
            arrayList.add(new mn.k(getClass(), "minor", "UDA minor spec version must be equal or greater 0"));
        }
        return arrayList;
    }

    public q(int i10, int i11) {
        this.f72990a = i10;
        this.f72991b = i11;
    }
}
