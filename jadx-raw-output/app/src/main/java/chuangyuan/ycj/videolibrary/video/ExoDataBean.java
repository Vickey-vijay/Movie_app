package chuangyuan.ycj.videolibrary.video;

import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class ExoDataBean extends View.BaseSavedState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<String> f5945e;

    public ArrayList<String> c() {
        return this.f5945e;
    }

    public int d() {
        return this.f5943c;
    }

    public int e() {
        return this.f5944d;
    }

    public boolean f() {
        return this.f5942b;
    }

    public void g(boolean z10) {
        this.f5942b = z10;
    }

    public void h(ArrayList<String> arrayList) {
        this.f5945e = arrayList;
    }

    public void i(int i10) {
        this.f5943c = i10;
    }

    public void j(int i10) {
        this.f5944d = i10;
    }

    public ExoDataBean(Parcelable parcelable) {
        super(parcelable);
    }
}
