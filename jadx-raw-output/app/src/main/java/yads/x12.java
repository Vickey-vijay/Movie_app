package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class x12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f84414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CheckBox f84415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressBar f84416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f84417d = nj.s.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f84418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f84419f;

    public final Map a() {
        return this.f84418e;
    }

    public final List b() {
        return this.f84417d;
    }

    public final ImageView c() {
        return this.f84419f;
    }

    public final CheckBox d() {
        return this.f84415b;
    }

    public final View e() {
        return this.f84414a;
    }

    public final ProgressBar f() {
        return this.f84416c;
    }

    public x12(View view, Map map) {
        this.f84414a = view;
        this.f84418e = kotlin.collections.a.B(map);
    }
}
