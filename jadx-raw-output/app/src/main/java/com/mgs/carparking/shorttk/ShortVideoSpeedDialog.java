package com.mgs.carparking.shorttk;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.fvvcl.flickverse.R;
import sa.o0;

/* JADX INFO: loaded from: classes6.dex */
public class ShortVideoSpeedDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f41594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f41595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f41596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f41597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f41598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f41599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f41600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f41601i;

    public interface a {
        void a(float f10);
    }

    public void c(a aVar) {
        this.f41601i = aVar;
    }

    public ShortVideoSpeedDialog(Context context) {
        super(context, R.style.dialog_center);
        requestWindowFeature(1);
        this.f41600h = context;
    }

    public final void b(View view) {
        this.f41594b = (TextView) view.findViewById(R.id.tv_speed_3);
        this.f41595c = (TextView) view.findViewById(R.id.tv_speed_2);
        this.f41596d = (TextView) view.findViewById(R.id.tv_speed_1_5);
        this.f41597e = (TextView) view.findViewById(R.id.tv_speed_1_2_5);
        this.f41599g = (TextView) view.findViewById(R.id.tv_speed_1);
        this.f41598f = (TextView) view.findViewById(R.id.tv_speed_0_75);
        if (o0.I() == 3.0d) {
            this.f41594b.setTextColor(this.f41600h.getResources().getColor(R.color.color_42BD56));
        } else if (o0.I() == 2.0d) {
            this.f41595c.setTextColor(this.f41600h.getResources().getColor(R.color.color_42BD56));
        } else if (o0.I() == 1.5d) {
            this.f41596d.setTextColor(this.f41600h.getResources().getColor(R.color.color_42BD56));
        } else if (o0.I() == 1.25d) {
            this.f41597e.setTextColor(this.f41600h.getResources().getColor(R.color.color_42BD56));
        } else if (o0.I() == 1.0d) {
            this.f41599g.setTextColor(this.f41600h.getResources().getColor(R.color.color_42BD56));
        } else {
            this.f41598f.setTextColor(this.f41600h.getResources().getColor(R.color.color_42BD56));
        }
        this.f41594b.setOnClickListener(this);
        this.f41595c.setOnClickListener(this);
        this.f41596d.setOnClickListener(this);
        this.f41597e.setOnClickListener(this);
        this.f41599g.setOnClickListener(this);
        this.f41598f.setOnClickListener(this);
    }

    public final void d() {
        getWindow().setGravity(80);
        getWindow().getWindowManager();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_speed_0_75 /* 2131363734 */:
                this.f41601i.a(0.75f);
                break;
            case R.id.tv_speed_1 /* 2131363735 */:
                this.f41601i.a(1.0f);
                break;
            case R.id.tv_speed_1_2_5 /* 2131363736 */:
                this.f41601i.a(1.25f);
                break;
            case R.id.tv_speed_1_5 /* 2131363737 */:
                this.f41601i.a(1.5f);
                break;
            case R.id.tv_speed_2 /* 2131363738 */:
                this.f41601i.a(2.0f);
                break;
            case R.id.tv_speed_3 /* 2131363739 */:
                this.f41601i.a(3.0f);
                break;
        }
        dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f41600h, R.layout.dialog_short_speed, null);
        b(viewGroup);
        setContentView(viewGroup);
        d();
    }
}
