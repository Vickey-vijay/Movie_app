package com.mgs.carparking.ui.mine.share;

import android.os.Bundle;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityExtensionRecordBinding;
import com.mgs.carparking.model.EXTENSIONRECORDVIEWMODEL;
import em.n;
import i9.a;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionRecordActivity extends BaseActivity<ActivityExtensionRecordBinding, EXTENSIONRECORDVIEWMODEL> {
    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_extension_record;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public EXTENSIONRECORDVIEWMODEL initViewModel() {
        return new EXTENSIONRECORDVIEWMODEL(BaseApplication.getInstance(), a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        ((EXTENSIONRECORDVIEWMODEL) this.f39698d).q();
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
