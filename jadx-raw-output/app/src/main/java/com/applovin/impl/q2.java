package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f8853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f8854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f8855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f8856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r2 f8857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8858f;

    public void a(int i10) {
        this.f8858f = i10;
    }

    public int a() {
        return this.f8858f;
    }

    public r2 b() {
        return this.f8857e;
    }

    public void a(r2 r2Var) {
        this.f8857e = r2Var;
        this.f8853a.setText(r2Var.k());
        this.f8853a.setTextColor(r2Var.l());
        if (this.f8854b != null) {
            if (!TextUtils.isEmpty(r2Var.f())) {
                this.f8854b.setTypeface(null, 0);
                this.f8854b.setVisibility(0);
                this.f8854b.setText(r2Var.f());
                this.f8854b.setTextColor(r2Var.g());
                if (r2Var.p()) {
                    this.f8854b.setTypeface(null, 1);
                }
            } else {
                this.f8854b.setVisibility(8);
            }
        }
        if (this.f8855c != null) {
            if (r2Var.h() > 0) {
                this.f8855c.setImageResource(r2Var.h());
                this.f8855c.setColorFilter(r2Var.i());
                this.f8855c.setVisibility(0);
            } else {
                this.f8855c.setVisibility(8);
            }
        }
        if (this.f8856d != null) {
            if (r2Var.d() > 0) {
                this.f8856d.setImageResource(r2Var.d());
                this.f8856d.setColorFilter(r2Var.e());
                this.f8856d.setVisibility(0);
                return;
            }
            this.f8856d.setVisibility(8);
        }
    }
}
