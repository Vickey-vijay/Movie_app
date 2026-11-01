package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f15912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f15913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f15915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15918g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.vast.b f15920i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f15919h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f15921j = new ArrayList();

    public final boolean a() {
        return (TextUtils.isEmpty(this.f15917f) && TextUtils.isEmpty(this.f15916e) && this.f15915d == null) ? false : true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Companion:  w:");
        sb2.append(this.f15912a);
        sb2.append(" h:");
        sb2.append(this.f15913b);
        sb2.append(" ctr:");
        sb2.append(this.f15918g);
        sb2.append(" clt:");
        sb2.append(this.f15919h);
        if (!TextUtils.isEmpty(this.f15917f)) {
            sb2.append(" html:");
            sb2.append(this.f15917f);
        }
        if (this.f15915d != null) {
            sb2.append(" static:");
            sb2.append(this.f15915d.f15924b);
            sb2.append("creative:");
            sb2.append(this.f15915d.f15923a);
        }
        if (!TextUtils.isEmpty(this.f15916e)) {
            sb2.append(" iframe:");
            sb2.append(this.f15916e);
        }
        sb2.append(" events:");
        sb2.append(this.f15921j);
        if (this.f15920i != null) {
            sb2.append(" reason:");
            sb2.append(this.f15920i.f15707a);
            sb2.append(" exception:");
            sb2.append(this.f15920i.getMessage());
        }
        return sb2.toString();
    }
}
