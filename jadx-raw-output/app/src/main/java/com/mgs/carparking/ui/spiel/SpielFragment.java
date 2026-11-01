package com.mgs.carparking.ui.spiel;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.databinding.FragmentSpielBinding;
import com.mgs.carparking.model.SPIELVIEWMODEL;
import em.n;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import sa.o0;

/* JADX INFO: loaded from: classes6.dex */
public class SpielFragment extends BaseFragment<FragmentSpielBinding, SPIELVIEWMODEL> implements jb.a {

    public class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                ((FragmentSpielBinding) SpielFragment.this.binding).f40295d.setVisibility(8);
            } else {
                ((FragmentSpielBinding) SpielFragment.this.binding).f40295d.setProgress(i10);
            }
            super.onProgressChanged(webView, i10);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (((FragmentSpielBinding) SpielFragment.this.binding).f40296e.canGoBack()) {
                ((FragmentSpielBinding) SpielFragment.this.binding).f40296e.goBack();
            }
        }
    }

    public class c {
        public c() {
        }

        @JavascriptInterface
        public void gotoBrowser(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    sa.a.a(SpielFragment.this.getContext(), str);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // jb.a
    public BaseFragment getFragment() {
        return this;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_spiel;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    public void onMenuItemClick() {
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public SPIELVIEWMODEL initViewModel() {
        return new SPIELVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    public void initWebView() {
        WebSettings settings = ((FragmentSpielBinding) this.binding).f40296e.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("GBK");
        ((FragmentSpielBinding) this.binding).f40296e.setVerticalScrollbarOverlay(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setCacheMode(-1);
        settings.setDisplayZoomControls(false);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setDomStorageEnabled(true);
        ((FragmentSpielBinding) this.binding).f40296e.addJavascriptInterface(new c(), "Netandroid");
        ((FragmentSpielBinding) this.binding).f40296e.setWebViewClient(new WebViewClient());
        settings.setMixedContentMode(0);
        t9.b.f("链接为：");
        ((FragmentSpielBinding) this.binding).f40296e.loadUrl(o0.P());
        ((FragmentSpielBinding) this.binding).f40296e.setWebChromeClient(new a());
        ((FragmentSpielBinding) this.binding).f40294c.setOnClickListener(new b());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        initWebView();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(getActivity());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        V v10 = this.binding;
        if (((FragmentSpielBinding) v10).f40296e != null) {
            ((FragmentSpielBinding) v10).f40296e.setWebChromeClient(null);
            ((FragmentSpielBinding) this.binding).f40296e.setWebViewClient(null);
            ((FragmentSpielBinding) this.binding).f40296e.getSettings().setJavaScriptEnabled(false);
            ((FragmentSpielBinding) this.binding).f40296e.clearCache(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        super.onHiddenChanged(z10);
        V v10 = this.binding;
        if (((FragmentSpielBinding) v10).f40296e != null) {
            if (z10) {
                ((FragmentSpielBinding) v10).f40296e.onPause();
            } else {
                ((FragmentSpielBinding) v10).f40296e.onResume();
            }
        }
    }
}
