package com.mgs.carparking.widgets.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoShareDataEntry;
import com.safedk.android.utils.Logger;
import em.p;
import em.r;

/* JADX INFO: loaded from: classes2.dex */
public class ShareDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f42456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f42457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f42458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecommandVideosEntity f42459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VideoShareDataEntry f42460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public gb.d f42465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f42466l;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public ShareDialog(Context context, gb.d dVar, RecommandVideosEntity recommandVideosEntity, VideoShareDataEntry videoShareDataEntry, int i10, int i11) {
        super(context, R.style.dialog_center);
        requestWindowFeature(1);
        this.f42466l = context;
        this.f42465k = dVar;
        this.f42459e = recommandVideosEntity;
        this.f42460f = videoShareDataEntry;
        this.f42461g = i10;
        this.f42462h = i11;
    }

    public final void b(View view) {
        this.f42456b = (LinearLayout) view.findViewById(R.id.ll_wx);
        this.f42457c = (LinearLayout) view.findViewById(R.id.ll_pyq);
        this.f42458d = (TextView) view.findViewById(R.id.tv_cancel);
        this.f42456b.setOnClickListener(this);
        this.f42457c.setOnClickListener(this);
        this.f42458d.setOnClickListener(this);
    }

    public final void c() {
        getWindow().setGravity(80);
        getWindow().getWindowManager();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCancelable(true);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.ll_pyq) {
            if (id2 != R.id.ll_wx) {
                if (id2 == R.id.tv_cancel) {
                    dismiss();
                    return;
                }
                return;
            } else {
                if (!yl.b.a(this.f42466l)) {
                    p.b(r.a().getResources().getString(R.string.str_no_net));
                    return;
                }
                this.f42463i = true;
                this.f42464j = false;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SENDTO");
                intent.setData(Uri.parse("smsto:"));
                intent.putExtra("sms_body", this.f42460f.getApp_share_url());
                safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533((Activity) this.f42466l, intent);
                dismiss();
                return;
            }
        }
        if (!yl.b.a(this.f42466l)) {
            p.b(r.a().getResources().getString(R.string.str_no_net));
            return;
        }
        this.f42464j = true;
        this.f42463i = false;
        sa.e.c(this.f42460f.getApp_share_url());
        dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f42466l, R.layout.dialog_share, null);
        b(viewGroup);
        setContentView(viewGroup);
        c();
    }
}
