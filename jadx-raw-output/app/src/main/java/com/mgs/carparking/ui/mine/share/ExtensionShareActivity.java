package com.mgs.carparking.ui.mine.share;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityExtensionShareBinding;
import com.mgs.carparking.model.EXTENSIONSHAREVIEWMODEL;
import com.mgs.carparking.netbean.ExtensionShareEntry;
import com.mgs.carparking.widgets.dialog.SimpleShareDialog;
import em.n;
import em.o;
import me.goldze.mvvmhabit.base.BaseApplication;
import sa.m0;
import ve.a;

/* JADX INFO: loaded from: classes5.dex */
public class ExtensionShareActivity extends BaseActivity<ActivityExtensionShareBinding, EXTENSIONSHAREVIEWMODEL> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SimpleShareDialog f42142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExtensionShareEntry f42143i;

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_extension_share;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Void r10) {
        if (this.f42143i != null) {
            if (this.f42142h == null) {
                this.f42142h = new SimpleShareDialog(this, this, this.f42143i);
            }
            this.f42142h.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(ExtensionShareEntry extensionShareEntry) {
        this.f42143i = extensionShareEntry;
        if (!o.b(extensionShareEntry.getWx_app_url())) {
            Bitmap bitmapA = a.a(extensionShareEntry.getWx_app_url(), m0.a(this, 180.0f), m0.a(this, 180.0f), BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
            ((ActivityExtensionShareBinding) this.f39697c).f39814d.setImageBitmap(bitmapA);
            ((ActivityExtensionShareBinding) this.f39697c).f39814d.setImageBitmap(bitmapA);
        }
        if (extensionShareEntry.getInvited_conf() == null || extensionShareEntry.getInvited_conf().size() <= 0) {
            return;
        }
        ((ActivityExtensionShareBinding) this.f39697c).f39815e.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        int i10 = R.layout.extension_share_tv;
        ViewGroup viewGroup = null;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.extension_share_tv, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_name)).setText(getResources().getString(R.string.str_share_intro1, (((int) extensionShareEntry.getInvited_reward()) / 86400) + ""));
        ((ActivityExtensionShareBinding) this.f39697c).f39815e.addView(viewInflate);
        int i11 = 0;
        while (i11 < extensionShareEntry.getInvited_conf().size()) {
            View viewInflate2 = LayoutInflater.from(this).inflate(i10, viewGroup);
            TextView textView = (TextView) viewInflate2.findViewById(R.id.tv_name);
            if (extensionShareEntry.getInvited_conf().get(i11).getInvited_reward_vip() == 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11 + 2);
                sb2.append(".");
                sb2.append(getResources().getString(R.string.str_share_intro2, extensionShareEntry.getInvited_conf().get(i11).getInvited_user() + ""));
                textView.setText(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i11 + 2);
                sb3.append(".");
                sb3.append(getResources().getString(R.string.str_share_intro3, extensionShareEntry.getInvited_conf().get(i11).getInvited_user() + "", (((int) extensionShareEntry.getInvited_conf().get(i11).getInvited_reward_vip()) / 86400) + ""));
                textView.setText(sb3.toString());
            }
            ((ActivityExtensionShareBinding) this.f39697c).f39815e.addView(viewInflate2);
            i11++;
            i10 = R.layout.extension_share_tv;
            viewGroup = null;
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public EXTENSIONSHAREVIEWMODEL initViewModel() {
        return new EXTENSIONSHAREVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        ((EXTENSIONSHAREVIEWMODEL) this.f39698d).p();
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((EXTENSIONSHAREVIEWMODEL) this.f39698d).f41174p.observe(this, new Observer() { // from class: oa.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f65155b.p((Void) obj);
            }
        });
        ((EXTENSIONSHAREVIEWMODEL) this.f39698d).f41173o.observe(this, new Observer() { // from class: oa.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f65156b.q((ExtensionShareEntry) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
