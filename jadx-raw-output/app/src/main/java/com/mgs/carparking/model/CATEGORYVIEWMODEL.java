package com.mgs.carparking.model;

import android.app.Application;
import androidx.annotation.NonNull;
import com.mgs.carparking.ui.homecontent.videosearch.SearchContentVideoActivity;
import me.goldze.mvvmhabit.base.BaseViewModel;
import ul.b;

/* JADX INFO: loaded from: classes11.dex */
public class CATEGORYVIEWMODEL extends BaseViewModel<n9.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f41072f;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        startActivity(SearchContentVideoActivity.class);
    }

    public CATEGORYVIEWMODEL(@NonNull Application application, n9.a aVar) {
        super(application, aVar);
        this.f41072f = new b(new ul.a() { // from class: w9.a
            @Override // ul.a
            public final void call() {
                this.f73551a.m();
            }
        });
    }
}
