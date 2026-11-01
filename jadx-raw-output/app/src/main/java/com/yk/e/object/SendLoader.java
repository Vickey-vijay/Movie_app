package com.yk.e.object;

import android.view.View;
import com.yk.e.callBack.MainAdCallBack;
import com.yk.e.pl.OktVideoView;
import com.yk.e.util.AdPlayer;

/* JADX INFO: loaded from: classes10.dex */
public class SendLoader {
    public AdPlayer adPlayer;
    public String adPlcID;
    public MainAdCallBack mainAdCallBack;
    public MainParams mainParams;
    public OktVideoView oktVideoView;
    public int orientation;
    public View rootView;

    public SendLoader() {
    }

    public SendLoader(MainParams mainParams, String str) {
        this.mainParams = mainParams;
        this.adPlcID = str;
    }

    public MainAdCallBack getAdCallBack() {
        return this.mainAdCallBack;
    }

    public AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public String getAdPlcID() {
        return this.adPlcID;
    }

    public MainParams getMainParams() {
        return this.mainParams;
    }

    public OktVideoView getOktVideoView() {
        return this.oktVideoView;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public View getRootView() {
        return this.rootView;
    }

    public SendLoader setAdCallBack(MainAdCallBack mainAdCallBack) {
        this.mainAdCallBack = mainAdCallBack;
        return this;
    }

    public void setAdPlayer(AdPlayer adPlayer) {
        this.adPlayer = adPlayer;
    }

    public SendLoader setAdPlcID(String str) {
        this.adPlcID = str;
        return this;
    }

    public SendLoader setMainParams(MainParams mainParams) {
        this.mainParams = mainParams;
        return this;
    }

    public void setOktVideoView(OktVideoView oktVideoView) {
        this.oktVideoView = oktVideoView;
    }

    public SendLoader setOrientation(int i10) {
        this.orientation = i10;
        return this;
    }

    public void setRootView(View view) {
        this.rootView = view;
    }

    public SendLoader(MainParams mainParams, String str, int i10, MainAdCallBack mainAdCallBack) {
        this.mainParams = mainParams;
        this.adPlcID = str;
        this.orientation = i10;
        this.mainAdCallBack = mainAdCallBack;
    }
}
