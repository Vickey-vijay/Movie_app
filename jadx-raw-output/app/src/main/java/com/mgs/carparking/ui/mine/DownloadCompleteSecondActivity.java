package com.mgs.carparking.ui.mine;

import android.os.Bundle;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityDownloadCompleteSecondBinding;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.model.DOWNLOADCOMPLETESECONDVIEWMODEL;
import em.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: loaded from: classes6.dex */
public class DownloadCompleteSecondActivity extends BaseActivity<ActivityDownloadCompleteSecondBinding, DOWNLOADCOMPLETESECONDVIEWMODEL> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<VideoDownloadEntity> f42035h = new ArrayList();

    public class a implements Comparator<VideoDownloadEntity> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(VideoDownloadEntity videoDownloadEntity, VideoDownloadEntity videoDownloadEntity2) {
            return videoDownloadEntity.getVideo_position() - videoDownloadEntity2.getVideo_position();
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_download_complete_second;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public DOWNLOADCOMPLETESECONDVIEWMODEL initViewModel() {
        return new DOWNLOADCOMPLETESECONDVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        List<VideoDownloadEntity> list = (List) getIntent().getSerializableExtra("entityList");
        this.f42035h = list;
        Collections.sort(list, new a());
        ((DOWNLOADCOMPLETESECONDVIEWMODEL) this.f39698d).q(this.f42035h);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
