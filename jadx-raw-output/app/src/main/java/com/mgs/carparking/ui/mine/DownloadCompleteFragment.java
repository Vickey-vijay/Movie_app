package com.mgs.carparking.ui.mine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.databinding.FragmentDownloadCompleteBinding;
import com.mgs.carparking.model.DOWNLOADCOMPLETEVIEWMODEL;
import i9.a;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import oi.g;
import x9.j;
import x9.x;

/* JADX INFO: loaded from: classes11.dex */
public class DownloadCompleteFragment extends BaseFragment<FragmentDownloadCompleteBinding, DOWNLOADCOMPLETEVIEWMODEL> {
    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_download_complete;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(j jVar) throws Exception {
        ((DOWNLOADCOMPLETEVIEWMODEL) this.viewModel).n(jVar.a());
    }

    public static DownloadCompleteFragment newInstance(int i10) {
        DownloadCompleteFragment downloadCompleteFragment = new DownloadCompleteFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceType", i10);
        downloadCompleteFragment.setArguments(bundle);
        return downloadCompleteFragment;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public DOWNLOADCOMPLETEVIEWMODEL initViewModel() {
        return new DOWNLOADCOMPLETEVIEWMODEL(BaseApplication.getInstance(), a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(x xVar) throws Exception {
        if (xVar.a() == 1) {
            ((DOWNLOADCOMPLETEVIEWMODEL) this.viewModel).f41107h.set(xVar.b().get());
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        addSubscribe(tl.a.a().d(j.class).subscribe(new g() { // from class: ka.c
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62669b.lambda$initViewObservable$0((x9.j) obj);
            }
        }));
        addSubscribe(tl.a.a().d(x.class).subscribe(new g() { // from class: ka.d
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62670b.lambda$initViewObservable$1((x9.x) obj);
            }
        }));
    }
}
