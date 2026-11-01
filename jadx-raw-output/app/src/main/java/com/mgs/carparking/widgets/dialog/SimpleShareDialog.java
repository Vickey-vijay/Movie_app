package com.mgs.carparking.widgets.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.internal.view.SupportMenu;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.ExtensionShareEntry;
import com.safedk.android.utils.Logger;
import sa.h0;
import sa.m0;
import sa.o;
import sa.o0;

/* JADX INFO: loaded from: classes7.dex */
public class SimpleShareDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f42467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f42468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f42469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExtensionShareEntry f42470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f42471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f42472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f42473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public gb.d f42478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Activity f42479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f42480o;

    public class a extends SimpleTarget<Bitmap> {
        public a() {
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) throws Throwable {
            SimpleShareDialog.this.f42471f = bitmap;
            SimpleShareDialog.this.f42473h = true;
            if (SimpleShareDialog.this.f42474i && SimpleShareDialog.this.f42478m != null && SimpleShareDialog.this.f42478m.isShowing()) {
                SimpleShareDialog.this.f42478m.f53324d.stop();
                SimpleShareDialog.this.f42478m.dismiss();
                if (SimpleShareDialog.this.f42475j) {
                    h0.d(SimpleShareDialog.this.f42480o, SimpleShareDialog.m(SimpleShareDialog.this.f42471f, SimpleShareDialog.this.f42472g), 2);
                } else if (SimpleShareDialog.this.f42476k) {
                    h0.d(SimpleShareDialog.this.f42480o, SimpleShareDialog.m(SimpleShareDialog.this.f42471f, SimpleShareDialog.this.f42472g), 1);
                } else if (SimpleShareDialog.this.f42477l) {
                    o.c(SimpleShareDialog.this.f42479n, SimpleShareDialog.m(SimpleShareDialog.this.f42471f, SimpleShareDialog.this.f42472g));
                }
            }
            Log.i("wangyi", "加载完成1");
        }
    }

    public static Bitmap m(Bitmap bitmap, Bitmap bitmap2) {
        String str;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        bitmap2.getWidth();
        bitmap2.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        if (em.o.b(o0.Z())) {
            str = "官网地址: http://dg10.tv";
        } else {
            str = "官网地址: " + o0.Z();
        }
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setTextSize(40.0f);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap2, 122.0f, 1478.0f, (Paint) null);
        canvas.drawText(str, 250.0f, 40.0f, paint);
        canvas.drawText(str, 420.0f, 1725.0f, paint);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public SimpleShareDialog(Activity activity, Context context, ExtensionShareEntry extensionShareEntry) {
        super(context, R.style.dialog_center);
        requestWindowFeature(1);
        this.f42479n = activity;
        this.f42480o = context;
        this.f42470e = extensionShareEntry;
    }

    public final void n(View view) {
        this.f42469d = (TextView) view.findViewById(R.id.tv_cancel);
        this.f42467b = (LinearLayout) view.findViewById(R.id.ll_copyUrl);
        this.f42468c = (LinearLayout) view.findViewById(R.id.ll_savePhoto);
        this.f42469d.setOnClickListener(this);
        this.f42467b.setOnClickListener(this);
        this.f42468c.setOnClickListener(this);
    }

    public final void o() {
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
        int id2 = view.getId();
        if (id2 != R.id.ll_copyUrl) {
            if (id2 != R.id.ll_savePhoto) {
                if (id2 == R.id.tv_cancel) {
                    dismiss();
                    return;
                }
                return;
            }
            this.f42475j = false;
            this.f42476k = false;
            this.f42477l = true;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SENDTO");
            intent.setData(Uri.parse("smsto:"));
            intent.putExtra("sms_body", this.f42470e.getApp_share_url() + "");
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533((Activity) this.f42480o, intent);
            dismiss();
            return;
        }
        if (this.f42470e != null) {
            sa.e.c(this.f42470e.getApp_share_url() + "");
            dismiss();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f42480o, R.layout.dialog_simple_share, null);
        n(viewGroup);
        setContentView(viewGroup);
        o();
        if (!em.o.b(this.f42470e.getWx_app_url())) {
            this.f42472g = ve.a.a(this.f42470e.getWx_app_url(), m0.a(this.f42480o, 80.0f), m0.a(this.f42480o, 80.0f), BitmapFactory.decodeResource(this.f42480o.getResources(), R.mipmap.ic_launcher));
            this.f42474i = true;
        }
        Glide.with(this.f42480o).asBitmap().load(this.f42470e.getShare_pic_url()).into(new a());
    }
}
