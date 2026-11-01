package yads;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes10.dex */
public final class ny {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f80858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gy1 f80860c;

    public final ImageView a(View view, my myVar, a10 a10Var) {
        my myVar2;
        ImageView imageView;
        y00 y00Var = this.f80858a;
        a10 a10Var2 = y00Var.f84768c;
        a10 a10Var3 = y00Var.f84767b;
        if (a10Var2 != null) {
            myVar2 = my.f80454c;
        } else {
            myVar2 = a10Var3 != null ? my.f80453b : my.f80455d;
        }
        if (a10Var == null || myVar2 != myVar) {
            return null;
        }
        int i10 = a10Var.f75360c;
        int i11 = a10Var.f75361d;
        int i12 = this.f80859b;
        if (i12 > i10 || i12 > i11) {
            this.f80860c.getClass();
            imageView = (ImageView) view.findViewById(R$id.icon_small);
        } else {
            this.f80860c.getClass();
            imageView = (ImageView) view.findViewById(R$id.icon_large);
        }
        return imageView;
    }

    public ny(y00 y00Var, int i10, gy1 gy1Var) {
        this.f80858a = y00Var;
        this.f80859b = i10;
        this.f80860c = gy1Var;
    }
}
