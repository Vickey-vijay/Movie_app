package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class q12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f81677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q22 f81678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CheckBox f81679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f81680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f81681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f81682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f81683g = nj.s.k();

    public final Map a() {
        return this.f81681e;
    }

    public final List b() {
        return this.f81683g;
    }

    public final ImageView c() {
        return this.f81682f;
    }

    public final CheckBox d() {
        return this.f81679c;
    }

    public final View e() {
        return this.f81677a;
    }

    public final q22 f() {
        return this.f81678b;
    }

    public final ProgressBar g() {
        return this.f81680d;
    }

    public q12(View view, q22 q22Var, Map map) {
        this.f81677a = view;
        this.f81678b = q22Var;
        this.f81681e = kotlin.collections.a.B(map);
    }
}
